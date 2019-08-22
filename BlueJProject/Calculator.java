public class Calculator 
{ 
    /** 
       * Defining attributes of private type 
         */ 
    private int num1; 
    private int num2; 
    private int result; 

    /** 
       * Constructor of the class. 
         */ 
public Calculator(int num1, int num2) 
{ 
    /** 
       * this keyword is used in order to make difference between 
       * parameter value of constructor and attributes. 
         */ 
        this.num1 = num1; 
        this.num2 = num2; 
} 

    /** 
       * returns value num1 
         */ 
public int getNum1() 
{ 
return num1; 
} 

       /** 
          * returns value num2 
            */ 
public int getNum2() 
{ 
return num2; 
} 

    /** 
       * Develop method called add which takes two parameter as int 
       * newNum1, int newNum2. 
       * Page 2 of 3
       * Create a variable called result and return the addition of the 
       * numbers in result. 
         */ 
public int add(int newNum1, int newNum2) 
{ 
    result = newNum1 + newNum2; 
    return result; 
} 

    /** 
       * Develop method called subtract which takes two parameter as int 
       * newNum1, int newNum2. 
         * Create a variable called result and return the subtraction of the 
         * numbers in result. 
           */ 
public int subtract(int newNum1, int newNum2) 
{ 
    result = newNum1 - newNum2; 
    return result; 
} 

       /** 
          * Develop method called quotientDivision which takes two parameter 
          as int newNum1, int newNum2. 
            * Create a variable called result and return the division of the 
            numbers in result. 
              */ 
public int quotientDivision(int newNum1, int newNum2) 
{ 
    result = newNum1 / newNum2; 
    return result; 
} 

    /** 
       * Develop method called remainderDivision which takes two parameter 
       as int newNum1, int newNum2. 
       * Create a variable called result and return the division of the 
       numbers in result. 
       */ 
public int remainderDivision(int newNum1, int newNum2) 
{ 
    result = newNum1 % newNum2; 
    return result; 
} 

    /** 
       * Develop method called multiply which takes two parameter as int 
       newNum1, int newNum2. 
       * Create a variable called result and return the multiplication of 
       the numbers in result. 
       */ 
public int multiply(int newNum1, int newNum2) 
{ 
    result = newNum1 * newNum2; 
    return result; 
} 

    /** 
       * Develop method called print in order to print the result. 
       * Page 3 of 3
         */ 
public void printResult() 
{ 
    System.out.println("\n" + "Result:" + result + "."); 
} 
} 