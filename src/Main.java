import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a,b,c ;

        Scanner inp = new Scanner(System.in);

        System.out.println("1.kenar uzunluğunu giriniz");
        a= inp.nextInt();

        System.out.println("2.kenar uzunluğunu giriniz");
        b= inp.nextInt();

        c = Math.sqrt(a*a + b*b);

        System.out.println("hipotenüs uzunluğu :  "+c);



    }
}