
/**
 * Description of class SellingPriceSwitch:
 * display the selling price of the item according to 
 * the given discount percent which is based on the different 
 * categories. using Switch Statement.
 * Variable: Float variable and Character variable.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SellingPriceSwitch//class
{
   public static void main(String[]args)//main method
   {
    float mp=7800f;//local float variable (Marked Price)
    char cat='D';//local character variable (catagories)
    float sp=0.0f;//local float variable (Selling Price)
    {
    System.out.println("Marked Price= "+mp);
    }
    switch(cat)
    {//Start switch statement
    case'A':System.out.println("Discount catagories= "+cat+" (60%)");
    sp=mp-(mp*60/100);break;
    case'B':System.out.println("Discount catagories= "+cat+" (40%)");
    sp=mp-(mp*40/100);break;
    case'C':System.out.println("Discount catagories= "+cat+" (20%)");
    sp=mp-(mp*20/100);break;
    case'D':System.out.println("Discount catagories= "+cat+" (10%)");
    sp=mp-(mp*10/100);break;
    default:sp=mp;
    System.out.println("NO Discount");
    }//End Switch statement
    System.out.println("Selling Price= "+sp);
    }//closed main method
}
