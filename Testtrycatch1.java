// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

class Testtrycatch1 {
   Testtrycatch1() {
   }

   public static void main(String[] var0) {
      System.out.println("Dev Jayswal \n 0901AM221031");
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the number");
      int var2 = var1.nextInt();

      try {
         int var3 = var2 / 0;
      } catch (ArithmeticException var4) {
         System.out.println(var4);
      }

      System.out.println("Exception  handled Sucessfully");
   }
}
