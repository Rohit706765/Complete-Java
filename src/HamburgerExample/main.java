package HamburgerExample;

import java.util.ArrayList;

class main
{
    public static void main(String[] args) {
        humburger humburger=new humburger("basic","white","sansug",150);
        humburger.AddExtraItem("tomato",12);
        humburger.AddExtraItem("chili",20);
        System.out.println("Total value is "+humburger.ListOfItem());
    }
}
class humburger
{
    private String name;
    private String meat;
    private String rolltype;
    private double price;
    private ArrayList<ExtraAddition> Additem =new ArrayList<>();
    public humburger(String name, String meat, String rolltype, double price) {
        this.name = name;
        this.meat = meat;
        this.rolltype = rolltype;
        this.price = price;
    }
    public void AddExtraItem(String name,double price)
    {
         ExtraAddition extraAdditon=new ExtraAddition(name,price);
        Additem.add(extraAdditon);
    }
    public double ListOfItem()
    {
        double TotalPrice;
        System.out.println(this.name+" burger "+ "on price "+this.price+" with "+this.rolltype+" Roll"
                +"and also "+this.meat+ " meat ");
        for (int i=0;i<Additem.size();i++)
        {
            System.out.println((i+1)+". Name --->"+Additem.get(i).getName()+" Price---> "+Additem.get(i).getPrice());
            price+=Additem.get(i).getPrice();
        }
        return price;
    }
}
class ExtraAddition
{
    private String name;
    private double price;

    public ExtraAddition(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}































/*
*   this class contain code of humburger class
* */
/*
public class main
{
    public static void main(String[] args) {
        Hamburger hamburger=new Hamburger("Basic","Sansug",5,"white");
        hamburger.AddAddition1("tomato",0.23);
        hamburger.AddAddition2("carrot",0.56);
        hamburger.AddAddition3("Red chili",1);
        hamburger.AddAddition4("white saup",2.3);
        double price=hamburger.ItemOfHumburger();
        System.out.println("Final price is "+price);

        Healthy_Burger healthy_burger=new Healthy_Burger(5,"white");
        healthy_burger.AddHealthAddition1("egg",8.56);
        healthy_burger.AddHealthAddition2("Chicken",10.98);
        System.out.println("Final price is "+healthy_burger.ItemOfHumburger());

        Deluxe_Burger db=new Deluxe_Burger(5.6,"white");
        db.ItemOfHumburger();
        db.AddAddition1("chicken",150);
    }
}
*/
/*
*       this is code of Hamburger order application
*       in which you can simply order a burger and add extra item........
*
*       we can do more time this challenge with arraylist and linkedlist
* *//*

class Hamburger {
    private String name;
    private String RollType;
    private double price;
    private String meat;

    private String Addition1Name;
    private double Additon1Price;

    private String Addition2Name;
    private double Additon2Price;

    private String Addition3Name;
    private double Additon3Price;

    private String Addition4Name;
    private double Additon4Price;

    public Hamburger(String name, String rollType, double price, String meat) {
        this.name = name;
        RollType = rollType;
        this.price = price;
        this.meat = meat;
    }

    public void AddAddition1(String name, double price) {
        this.Addition1Name = name;
        this.Additon1Price = price;
    }

    public void AddAddition2(String name, double price) {
        this.Addition2Name = name;
        this.Additon2Price = price;
    }

    public void AddAddition3(String name, double price) {
        this.Addition3Name = name;
        this.Additon3Price = price;
    }

    public void AddAddition4(String name, double price) {
        this.Addition4Name = name;
        this.Additon4Price = price;
    }

    public double ItemOfHumburger() {
        System.out.println(this.name + " Hamburger " + "on a " + this.RollType + " Roll " + "And Price is " + this.price + " With "
                + this.meat + " meat ");
        double HamburgerPrice = this.price;
        if (Addition1Name != null) {
            HamburgerPrice += this.Additon1Price;
            System.out.println("Added " + this.Addition1Name + " For an Extra " + this.Additon1Price);
        }
        if (Addition2Name != null) {
            HamburgerPrice += this.Additon2Price;
            System.out.println("Added " + this.Addition2Name + " For an Extra " + this.Additon2Price);
        }
        if (Addition3Name != null) {
            HamburgerPrice += this.Additon3Price;
            System.out.println("Added " + this.Addition3Name + " For an Extra " + this.Additon3Price);
        }
        if (Addition4Name != null) {
            HamburgerPrice += this.Additon4Price;
            System.out.println("Added " + this.Addition4Name + " For an Extra " + this.Additon4Price);
        }
        return HamburgerPrice;
    }
}
class Healthy_Burger extends Hamburger
{
    private String HealthyAddition1Name;
    private double HealthyAddition1Price;

    private String HealthyAddition2Name;
    private double HealthyAddition2Price;

    public Healthy_Burger(double price, String meat) {
        super("Healthy", "brown", price, meat);
    }
    public void AddHealthAddition1(String name,double price)
    {
        this.HealthyAddition1Name=name;
        this.HealthyAddition1Price=price;
    }
    public void AddHealthAddition2(String name,double price)
    {
        this.HealthyAddition2Name=name;
        this.HealthyAddition2Price=price;
    }

    @Override
    public double ItemOfHumburger() {
        double price=super.ItemOfHumburger();
        if(HealthyAddition1Name!=null)
        {
            price+=this.HealthyAddition1Price;
            System.out.println("Added "+this.HealthyAddition1Name+" For an Extra "+this.HealthyAddition1Price);
        }
        if(HealthyAddition2Name!=null)
        {
            price+=this.HealthyAddition2Price;
            System.out.println("Added "+this.HealthyAddition2Name+" For an Extra "+this.HealthyAddition2Price);
        }
        return price;
    }
}
class Deluxe_Burger extends Hamburger
{
    public Deluxe_Burger(double price, String meat) {
        super("Deluxe_Burger", "Mixed", price, meat);
        super.AddAddition1("Drink",2.5);
        super.AddAddition2("Chips",1.5);
    }

    @Override
    public void AddAddition1(String name, double price) {
        System.out.println("Dont Add more Item ");
    }

    @Override
    public void AddAddition2(String name, double price) {
        System.out.println("Dont Add more Item ");
    }

    @Override
    public void AddAddition3(String name, double price) {
        System.out.println("Dont Add more Item ");
    }

    @Override
    public void AddAddition4(String name, double price) {
        System.out.println("Dont Add more Item ");
    }
}

*/
















/*
public class main {
    public static void main(String[] args) {
        Hamburgers hamburgers=new Hamburgers("mix","burger",true,156.7);
        Healthy_Burger healthy_burger=new Healthy_Burger(true,true);
        healthy_burger.AddItem("healthy_burger",150);

        System.out.println("Final Price is "+ healthy_burger.getPrice());
    }
}
*/

/*
*       here is Hamburger code
*       we are using polymophism concept
* */
/*
class Hamburgers
{
    Scanner s=new Scanner(System.in);
    //roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
    private String roll_type;
    private boolean AddMeat;
    private boolean Addlettuce;
    private boolean Addtomato;
    private boolean AddCarrot;
    private String Name;
    private double price;
    public Hamburgers(String roll_type,String name,boolean AddMeat,double price)
    {
        this.roll_type=roll_type;
        this.Name=name;
        this.AddMeat=AddMeat;
        this.price=price;
        this.AddCarrot=false;
        this.Addlettuce=false;
        this.Addtomato=false;
    }
    public double AddItem(String name,double price )
    {
        this.price=price;
        if(name.equals("Healthy_Burger") || name.equals("healthy_burger"))
        {
            System.out.println("Healthy Burger Is Added "+"Price-->" +price+"$/-"
                    + "\n"
                    +"Are you Want to Add more item ??? "
                    +"\n"+"yes/no ");
            String choice=s.next();
           String NumberOfItemAdded=AddExtraItem(name,choice,price);

            System.out.println(NumberOfItemAdded);

        }
        else if(name.equals("Deluxe_Hamburger") || name.equals("deluxe_hamburger"))
        {
            System.out.println("Deluxe_Hamburger  Is Added "+"Price-->" +price+"$/-"
                    + "\n"
                    +"Are you Want to Add more item ??? "
                    +"\n"+" Yes/No ");
            String choice=s.next();
            String NumberOfItemAdded=AddExtraItem(name,choice,price);

            System.out.println(NumberOfItemAdded);

        }
        else
        {
            System.out.println("You Made Wrong choice ");
        }
        return price;
    }
    public String AddExtraItem(String name,String choice,double price)
    {
        this.price=price;
        int cnt=0;
        int Selecton;
        if(choice.equals("yes")||choice.equals("y"))
        {
            System.out.println("Menu list is here ");
            System.out.println("Warning :******* Please Not Added This Follow Item In Deluxe hamburger");
            System.out.println("1. Tomato   8$/- ");
            System.out.println("2. Meat 35$/- ");
            System.out.println("3. Carrot 20$/- ");
            System.out.println("4. Lettuce 10$/- ");
            System.out.println("5. I'Am Full Now ");
           boolean quit=false;
            while(!quit)
            {
                System.out.println("");
                System.out.println("Enter Your Choice ");
                 Selecton=s.nextInt();
                switch (Selecton)
                {
                    case 1:
                        System.out.println("Tomato is Added ");
                        price+=8;
                        ++cnt;
                        System.out.println("Final Price is "+price+"$/-");
                        break;

                    case 2:
                        System.out.println("Meat is Added ");
                        price+=35;
                        ++cnt;
                        System.out.println("Final Price is "+price+"$/-");
                        break;

                    case 3:
                        System.out.println("Carrot is Added ");
                        price+=20;
                        ++cnt;
                        System.out.println("Final Price is "+price+"$/-");
                        break;

                    case 4:
                        System.out.println("Lettuce is Added ");
                        price+=10;
                        ++cnt;
                        System.out.println("Final Price is "+price+"$/-");
                        break;
                    case 5:
                      quit=true;
                        break;
                    default:
                        System.out.println("Mismatch ");
                        break;
                }
            }

            this.price=price;
            if(name.equals("Healthy_Burger")||name.equals("healthy_burger"))
            {
                System.out.println("Two Special Item For Healthy_Burger  ");
                System.out.println("1.Brown Rye $10/-");
                System.out.println("2.Bread Roll $20/-");
                System.out.println("3. I'Am Full Now ");
                quit=false;
                while(!quit)
                {
                    System.out.println("");
                    System.out.println("Enter Your Choice ");
                    Selecton=s.nextInt();
                    switch (Selecton)
                    {
                        case 1:
                            ++cnt;
                            price+=10;
                            System.out.println("Brown Rye is Added  Price---->"+price+"$/-");
                            break;
                        case 2:
                            ++cnt;
                            price+=20;
                            System.out.println("Bread Roll is Added Price----->"+price+"$/-");
                            break;
                        case 3:
                            quit=true;
                            break;
                    }
                }

                this.price=price;
            }
            else if(name.equals("Deluxe_Hamburger") || name.equals("deluxe_hamburger"))
            {
                System.out.println("Two Special Item For Healthy_Burger  ");
                System.out.println("1.Drink  $10/-");
                System.out.println("2.Chips  $20/-");
                System.out.println("3. I'Am Full Now ");
                quit=false;
                while(!quit)
                {
                    System.out.println("");
                    System.out.println("Enter Your Choice ");
                    Selecton=s.nextInt();
                    switch (Selecton)
                    {
                        case 1:
                            ++cnt;
                            price+=10;
                            System.out.println("Drink is Added  Price---->"+price+"$/-");
                            break;
                        case 2:
                            ++cnt;
                            price+=20;
                            System.out.println("Chips is Added Price----->"+price+"$/-");
                            break;
                        case 3:
                           quit=true;
                            break;
                    }
                }
            }
            this.price=price;
        }
        return "Total Added Item IS "+cnt+" And Final Price "+price+"$/-";
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return this.price;
    }
}
class Healthy_Burger extends Hamburgers
{
    private boolean AddBrownRye;
    private boolean AddBreadRoll;

    public Healthy_Burger(boolean addBrownRye, boolean addBreadRoll) {
        super("round", "Healthy_Burger", true, 150);
        AddBrownRye = addBrownRye;
        AddBreadRoll = addBreadRoll;
    }
}
class Deluxe_hamburger extends Hamburgers
{
    private boolean AddDrink;
    private boolean AddChips;

    public Deluxe_hamburger(String roll_type, String name, boolean AddMeat, double price, boolean addDrink, boolean addChips) {
        super("round", "Deluxe hamburger", true, 350);
        AddDrink = addDrink;
        AddChips = addChips;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}*/
