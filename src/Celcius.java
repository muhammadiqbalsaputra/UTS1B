import java.util.Scanner;
public class Celcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celc, fahr, ream;
        System.out.println("Input Suhu  = ");
        celc = input.nextDouble();
        fahr = (9.0/5.0 * celc) + 32;
        ream = celc * (4.0/5.0) ;

        System.out.println(celc +" Derajat Celcius = "+fahr+" Derajat Farenheit ");
        if (fahr % 2==0 && fahr %5 == 0){
            System.out.println( "Hasil Dari Fahrenheit Merupakan Kelipatan  2 dan 5");
        }else{
            System.out.println( "Hasil Dari Fahrenheit Bukan Merupakan Kelipatan  2 dan 5");
        }

        System.out.println("------------------------------------------");

        System.out.println(celc +" Derajat Celcius = "+ream+" Derajat Reamur ");
        if (ream % 2==0 && ream %5 == 0){
            System.out.println( "Hasil Dari Reamur Merupakan Kelipatan  2 dan 5");
        }else{
            System.out.println( "Hasil Dari Reamur Bukan Merupakan Kelipatan  2 dan 5");
        }
    }
}
