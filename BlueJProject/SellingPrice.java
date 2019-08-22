
/**
 * Description of class SellingPrice:
 * display the selling price of the item according to 
 * the given discount percent which is based on the different 
 * categories. Using if-elseif statement
 * Variables: Float variable and Character variable.
.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SellingPrice//class
{
    public static void main(String[]args)//main method
    {
        float markedPrice=3450f;//local float variable
        char catagories='C';//local character variable
        float sellingPrice=0.0f;//local float variable
        {
        System.out.println("Marked Price = "+markedPrice);
        }
        if(catagories=='A')//if statement
        {
            sellingPrice=markedPrice-(markedPrice*60/100);
            System.out.println("Discount = 60%");
        }
        else if(catagories=='B')
       {
            sellingPrice=markedPrice-(markedPrice*40/100);
            System.out.println("Discount = 40%");
        }
        else if(catagories=='C')
        {
            sellingPrice=markedPrice-(markedPrice*20/100);
            System.out.println("Discount = 20%");
        }
        else if (catagories=='D')
        {
            sellingPrice=markedPrice-(markedPrice*10/100);
            System.out.println("Discount = 10%");
        }
        else
        {
            sellingPrice=markedPrice;
            System.out.println("No Discount");
        }
        System.out.println("Selling Price = "+sellingPrice);
    }//main method closed
}
