package week8wk;


/**
 * Write a description of class shoppingCart1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class shoppingCart1
{
    private String itemname;
    private int itemprice;
    private int quantity;
    private double discountPrice;
    private int total;
    public shoppingCart1(String itemname, int itemprice, int quantity){
        this.itemname = itemname;
        this.itemprice = itemprice;
        this.quantity = quantity;
    }
    
     public void setitemname(String itemname)
    {
        this.itemname = itemname;
    }
    
    public String getitemname(){
        return this.itemname;
    }
    
    public void setitemprice(int itemprice){
    
        this.itemprice = itemprice;
    }
    
    public int getitemprice()
    {
    
        return this.itemprice;
    }
    public void setquantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    public int getquantity(){
        return this.quantity;
    }
    
    public double calculatetotal(){
        total=quantity * itemprice;
        return total;
    }
    public double calculateDiscountedTotal(double discountPercent){
        discountPrice = total - ((total) * (discountPercent/100));
        return discountPrice;
    }
    public void displaycart(){
    
        System.out.println("Item Name: "+this.itemname);
        System.out.println("Item Price: "+this.itemprice);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("Total: "+calculatetotal());
        
    }
    }
