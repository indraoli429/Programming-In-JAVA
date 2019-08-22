
/**
 * In this IfElseIfExample class I used the nested If condition. 
 * Nested If condition means if-else statement with another 
 * if-else statement as insiide the if body or inside the else body.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IfElseExample //class
{
   public static void main(String[]args)//main method
   {
    int marks=25;//local variable
    if(marks<=0||marks>100)//if statement
    {
    System.out.println("Invalid Information!");
    }
    else//else statement
    {///nested if statement starts
    if (marks<50)
    {
    System.out.println("Fail");
    }
    else if(marks>=50&&marks<60)
    {
    System.out.println("D grade");
    }
    else if(marks>=60&&marks<70)
    {
    System.out.println("C grade");
    }
    else if(marks>=70&&marks<80)
    {
    System.out.println("B grade");
    }
    else if(marks>=80&&marks<90)
    {
    System.out.println("A grade");
    }
    else
    {
    System.out.println("A+ grade");
   }
}//nested if statement closed
}//main method closed
}//class closed
