package dao;

public class Clavier implements IUSB{
    @Override
    public int read() {
        System.out.println("je suis un clavier");
        return (int) (Math.random()*100);
    }
}
