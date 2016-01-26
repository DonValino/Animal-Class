/**
 * Created by JakeValino on 26/01/16.
 */
public class Cat extends Animal {

    //Instance Variables
    private double height;
    private double weight;
    private boolean seated;

    //Constructor
    public Cat(int id,String name,String type,double heighIn,double weightIn,boolean seatedIn)
    {
        super(id,name,type);
        height = heighIn;
        weight = weightIn;
        seated = seatedIn;
    }

    //Speak Method for the Dog Class
    public void speak()
    {
        System.out.println("Meow");
    }

    //Seat Method
    public boolean seat(boolean seatedIn)
    {
        seated = seatedIn;
        return seated;
    }

    public static void main(String[] args) {
        Animal a = new Cat(1,"Kitty","Lazy Car",5,5,false);
        a.speak();
        if (a instanceof Dog)
        {
            Dog g = (Dog) a;
            if(g.seat(true))
            {
                System.out.println("The dog is seated");
            }

        }else {
            Cat c = (Cat) a;
            if (c.seat(true))
            {
                System.out.println("The cat is seated");
            }
        }
    }
}
