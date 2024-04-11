// Source code is decompiled from a .class file using FernFlower decompiler.
class Calculator {
    private double num1;
    private double num2;
 
    public Calculator(double var1, double var3) {
       this.num1 = var1;
       this.num2 = var3;
    }
 
    public double add() {
       return this.num1 + this.num2;
    }
 
    public double subtract() {
       return this.num1 - this.num2;
    }
 
    public double multiply() {
       return this.num1 * this.num2;
    }
 
    public double divide() {
       if (this.num2 != 0.0) {
          return this.num1 / this.num2;
       } else {
          System.out.println("Error: Cannot divide by zero.");
          return Double.NaN;
       }
    }
 }
 