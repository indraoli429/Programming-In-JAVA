/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractAndInterface;

/**
 *
 * @author indra
 */
public class CarToBuy extends Car
{
   public int price;
   public String registeredYear;
   public CarToBuy(String name,String description, int price, String registeredYear){
        super.name = name;
        super.description = description;
        this.price = price;
        this.registeredYear = registeredYear;
    }
    
    public void display(){
        System.out.println("Name of Car: " + super.name);
        System.out.println("Description of Car: " + super.description);
        System.out.println("Price of Car: "+ this.price);
        System.out.println("Year of Car Registered: "+ this.registeredYear);
    }
}
