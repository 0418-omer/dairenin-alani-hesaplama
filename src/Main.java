import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double r , alan , aci ;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.println("daireinin yari capini giriniz ");
        r = inp.nextDouble();

        System.out.println("daireinin merkez acisini giriniz ");
        aci = inp.nextDouble();

        alan = (pi*(r*r)*aci) /360;
        System.out.println("dairenin alani :" +alan);


    }
}
