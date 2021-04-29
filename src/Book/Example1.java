package Book;

abstract class Cycle {
    public abstract void ride();
}

class Unicycle extends Cycle{
    @Override
    public void ride() {
        Cycle cycle;
        cycle = new Unicycle();
    }
}

class Bycycle extends Cycle{
    @Override
    public void ride() {
        Cycle cycle;
        cycle = new Bycycle();
    }
}

class Trycycle extends Cycle{
    @Override
    public void ride() {
        Cycle cycle;
        cycle = new Trycycle();
    }
}

public class Example1{
    public static void main(String args[]){
        Cycle cycle;
        Unicycle a = new Unicycle();
        Bycycle b = new Bycycle();
        Trycycle c = new Trycycle();
        a.ride();
        b.ride();
        c.ride();
        if(a instanceof Cycle) {
            System.out.println("a是Unicycle类的对象");
        }
        else {
            System.out.println("a不是Unicycle类的对象");
        }
        if(b instanceof Cycle) {
            System.out.println("b是Bycycle类的对象");
        }
        else {
            System.out.println("b不是Bycycle类的对象");
        }
        if(c instanceof Cycle) {
            System.out.println("c是Trycycle类的对象");
        }
        else {
            System.out.println("c不是Trycycle类1的对象");
        }
    }
}