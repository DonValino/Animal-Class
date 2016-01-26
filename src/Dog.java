/**
 * Created by JakeValino on 26/01/16.
 */
public class Dog extends Animal {

    //Instance Variables
    private double height;
    private double weight;
    private boolean seated;

    //Constructor
    public Dog(int id,String name,String type,double heighIn,double weightIn,boolean seatedIn)
    {
        super(id,name,type);
        height = heighIn;
        weight = weightIn;
        seated = seatedIn;
    }

    //Speak Method for the Dog Class
    public void speak()
    {
        System.out.println("RawR");
    }

    //Seat Method
    public boolean seat(boolean seatedIn)
    {
        seated = seatedIn;
        return seated;
    }

    public static void main(String[] args) {
        Animal a = new Dog(1,"Sandy","German Shepherd",10,10,false);
        a.speak();
        if (a instanceof Dog)
        {
            Dog g = (Dog) a;
            if(g.seat(true))
            {
                System.out.println("The dog is seated");
            }

        }
    }

}
