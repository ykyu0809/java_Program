package Book.JFrame;

public class MyFrame {
    public static void main(String args[]){
        ShowTime windows1;
        windows1 = new ShowTime("显示时间");
        RandomSelection windows2;
        windows2 = new RandomSelection("随机选人");
        Square windows3;
        windows3 = new Square("算术开根");
        windows1.setBounds(580,280,400,100);
        windows1.setVisible(true);
        windows2.setBounds(600,300,400,100);
        windows2.setVisible(true);
        windows3.setBounds(620,320,400,100);
        windows3.setVisible(true);
    }
}
