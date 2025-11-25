// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.PrintStream;

class Account {
   String name;
   int accNo;
   String accType;
   double balance;

   Account() {
   }

   void createAccount(String var1, int var2, String var3, double var4) {
      this.name = var1;
      this.accNo = var2;
      this.accType = var3;
      this.balance = var4;
   }

   void deposit(double var1) {
      this.balance += var1;
      System.out.println("Deposited: ₹" + var1);
   }

   void display() {
      System.out.println("\n--- Account Details ---");
      System.out.println("Name: " + this.name);
      System.out.println("Account No: " + this.accNo);
      System.out.println("Type: " + this.accType);
      PrintStream var10000 = System.out;
      Object[] var10002 = new Object[]{this.balance};
      var10000.println("Balance: ₹" + String.format("%.2f", var10002));
   }
}
