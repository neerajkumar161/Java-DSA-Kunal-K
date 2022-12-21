// import java.util.Scanner;

public class Inputs {
  public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
    // Scanner input2 = new Scanner(System.in);
    // Scanner input3 = new Scanner(System.in);

    // System.out.println("Enter You Age");

    // int age = input.nextInt();
    // input.close();

    // System.out.println("Your Age is " + age);

    // int value = 234_000_000; // _ will act as none
    // System.out.println(value); // 234000000

    // String firstName = input.next(); // will grab first word only, Neeraj Kumar
    // System.out.println(firstName); // Neeraj
    // // For complete sentence
    // String completeName = input2.nextLine();
    // System.out.println(completeName);

    // int v = input3.nextInt();
    // System.out.println(v);
    // input.close();
    // input2.close();
    // input3.close();

    // TypeCasting
    // float num = (int)(13.48f); // 13

    // Automatic Type Promotion in expressions
    // https://youtu.be/TAtrPoaJ7gc?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=4603
    int a = 257;
    byte b = (byte) (a); // 1 ---> 1 Byte = 256, hence value is Greater then, value will be -> 257 % 256
                         // = 1 (Modulas Value)

    System.out.println(b);

    byte bt1 = 50;
    byte bt2 = 40;
    int expr = bt1 * bt2 / 100; // will results 20 (cast byte to integer when performing mathematical
                                // expression)

    System.out.println(expr); // 20
  }
}
