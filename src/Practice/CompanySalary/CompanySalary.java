package Practice.CompanySalary;

abstract class Employee {
    public abstract double earnings();
}
class YearWorker extends Employee {
    @Override
    public double earnings() {
        return 12000;
    }
}
class MonthWorker extends Employee {
    @Override
    public double earnings() {
        return 12*2300;
    }
}
class WeekWorker extends  Employee {
    @Override
    public double earnings() {
        return 52*780;
    }
}
class DayWorker extends Employee{
    @Override
    public double earnings() {
        return 365*100;
    }
}
class Company {
    Employee[] employee;
    double salaries=0;
    Company(Employee[] employee) {
        this.employee=employee;
    }
    public double salariesPay() {
        salaries = 0;
        for (int i = 0; i < employee.length; i++) {
            salaries = salaries + employee[i].earnings();
        }
        return salaries;
    }
}
public class CompanySalary {
    public static void main(String args[]) {
        Employee [] employee=new Employee[29];
        for (int i=0;i<employee.length;i++) {
            if (i%4==0) employee[i]=new WeekWorker();
            else if (i%4==1) employee[i]=new MonthWorker();
            else if (i%4==2) employee[i]=new YearWorker();
            else if (i%4==3) employee[i]=new DayWorker();
        }
        Company company=new Company(employee);
        System.out.println("公司薪水总额"+company.salariesPay()+" 元");
    }
}
