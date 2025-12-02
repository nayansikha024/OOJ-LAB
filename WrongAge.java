   import java.util.*;
   class WrongAgeExe extends Exception
   {
    WrongAgeExe(String msg)
    {
        super(msg);
    }
   }
    class Father
    {
        int fage;
        Father(int age) throws  WrongAgeExe
        {
            if(age<0)
            {
                throw new WrongAgeExe("Age cannot be negative\n");
            }
            fage=age;
        }
    }
   class Son extends Father
{
    int sage;
    Son(int fage,int sage) throws WrongAgeExe
    {
        super(fage);
        if(fage < sage)
        {
            throw new WrongAgeExe("Father's age cant be less than son's age");
        }
        if(sage < 0)
        {
            throw new WrongAgeExe("Age cant be negative");
        }
        this.sage=sage;
    }
   void display()
   {
    System.out.println("father's age: "+fage);
    System.out.println("son's age: "+sage);
   }
}
class WrongAge {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        try {  
            System.out.print("Enter father's age: ");  
            int fage = sc.nextInt();  
            System.out.print("Enter son's age: ");  
            int sage = sc.nextInt();  
            Son obj = new Son(fage, sage);  
            obj.display();  
        } 
        catch (Exception e) {  
            System.out.println("Exception Caught: " + e.getMessage());  
        } 
        finally {  
            sc.close();  
        }  
    }  
}  
