package P4;
import static P1.P2.B.staticVariable;
import P1.A;
import P1.P2.P3.C;
import P4.P5.E;

public class D {
    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        E e = new E();

        c.Question("Павел");
        a.Question2();
        System.out.println(staticVariable);
        System.out.println("Какой у тебя баланс на карте?");
        System.out.println(e.balance);


    }
}