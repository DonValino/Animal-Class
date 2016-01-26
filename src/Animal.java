/**
 * Created by JakeValino on 26/01/16.
 */
public abstract class Animal {
    //Instance Variables
    private int id;
    private String name;
    private String type;

    //Constructor
    public Animal(int idIn,String nameIn,String typeIn)
    {
        id = idIn;
        name = nameIn;
        type = typeIn;
    }

    //Abstract Method speak()
    public abstract void speak();

    //Getter for id Variable
    public int getId()
    {
        return id;
    }

    //Getter for name Variable
    public String getName()
    {
        return name;
    }

    //Getter for type Variable
    public String getType()
    {
        return type;
    }
}
