// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

class cal {
   cal() {
   }

   public static void main(String[] var0) {
      System.out.println("Dev Jayswal \n0901AM221031");
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      double var2 = var1.nextDouble();
      System.out.print("Enter the second number: ");
      double var4 = var1.nextDouble();
      Calculator var6 = new Calculator(var2, var4);
      System.out.println("Addition result: " + var6.add());
      System.out.println("Subtraction result: " + var6.subtract());
      System.out.println("Multiplication result: " + var6.multiply());
      System.out.println("Division result: " + var6.divide());
      var1.close();
   }
}
