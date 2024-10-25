/**
 * Write a description of class Smartphone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Smartphone
{
    // instance variables - replace the example below with your own
    private String color;
    private String brand;
    private String model;

    /**
     * Constructor for objects of class Smartphone
     */
    public Smartphone(String color, String brand, String model)
    {
        // initialise instance variables
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void charging()
    {
        // put your code here
        System.out.println("Charging " + model);
    }
}

class Android extends Smartphone{
    
    public Android(String color, String brand, String model)
    {
        super(color, brand, model);   
    }
    
    public void splitScreen ()
    {
        System.out.println("Android have a Split Screen");
    }
    
    @Override public void charging()
    {
        super.charging();
    }
}

class Ios extends Smartphone{
    
    public Ios(String color, String brand, String model)
    {
        super(color, brand, model);   
    }
    
    public void airDrop()
    {
        System.out.println("iOS have a behavior AirDrop");
    }
    
    @Override public void charging()
    {
        super.charging();
    }
}

public class Test {
    public static void main(String args[])
    {

        Android android = new Android("Black", "A", "Galaxy S21");
        Ios ios = new Ios("Purple", "B", "12 Pro Max");
        
        android.charging();
        android.splitScreen();
        
        System.out.println();
        
        ios.charging();
        ios.airDrop();
    }
}
