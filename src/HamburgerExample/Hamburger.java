package HamburgerExample;

public class Hamburger {
    private String BreadRolType;
    private boolean IsAddMeat=false;
    private boolean IsAddCarrot=false;
    private boolean IsAddTomato=false;
    private boolean IsAddLettuce=false;

    public Hamburger(String breadRolType, boolean isAddMeat, boolean isAddCarrot, boolean isAddTomato, boolean isAddLettuce) {
        this.BreadRolType = breadRolType;
        this.IsAddMeat = isAddMeat;
        this.IsAddCarrot = isAddCarrot;
        this.IsAddTomato = isAddTomato;
        this.IsAddLettuce = isAddLettuce;
    }
}
class DulexBurger extends  Hamburger{
    private int BasePrice=50;
    private char RupeesSymbol='₨';
    private int OriginalValue=BasePrice;
    private int TotalAddedItem=0;
    private boolean IsAddChip=true;
    private boolean IsAddDrink=false;

    public DulexBurger(String breadRolType, boolean isAddMeat, boolean isAddCarrot, boolean isAddTomato, boolean isAddLettuce,boolean IsAddDrink,boolean IsAddchip) {
        super(breadRolType, isAddMeat, isAddCarrot, isAddTomato, isAddLettuce);
        this.IsAddDrink=IsAddDrink;
        this.IsAddChip=IsAddchip;

        if(IsAddDrink)
        {
            TotalAddedItem+=1;
            BasePrice+=50;
            System.out.println("Drink is Added "+"Now Final price is "+BasePrice+ RupeesSymbol);
        }
        if(IsAddChip)
        {
            TotalAddedItem+=1;
            BasePrice+=60;
            System.out.println("Chip is Added "+"Now Final price is "+BasePrice+ RupeesSymbol);
        }
        if(isAddCarrot)
        {

            TotalAddedItem+=1;
            BasePrice+=8;
            System.out.println("Carrot is Added "+"Now Final price is "+BasePrice+ RupeesSymbol);
        }
        if(isAddLettuce)
        {

            TotalAddedItem+=1;
            BasePrice+=10;
            System.out.println("Lettuce is Added "+"Now Final price is "+BasePrice+ RupeesSymbol);
        }
        if(isAddMeat)
        {

            TotalAddedItem+=1;
            BasePrice+=20;
            System.out.println("Meat is Added "+"Now Final price is "+BasePrice+ RupeesSymbol);
        }
        if(isAddTomato)
        {

            TotalAddedItem+=1;
            BasePrice+=25;
            System.out.println("Tomato is Added "+"Now Final price is "+BasePrice+ RupeesSymbol);
        }
    }
    public int TotalAddedItemList()
    {
        if(TotalAddedItem<0)
        {
            System.out.println("Server Down ");
        }
        return TotalAddedItem;
    }
    public String TotalValueIs()
    {
        return "Base Price is "+OriginalValue+ RupeesSymbol+" And Extra Added  Item is "+TotalAddedItem+" Final Price is "+BasePrice+ RupeesSymbol;
    }
}
class HealthyBurger extends  Hamburger{
    private int BasePrice=50;
    private int OriginalValue=BasePrice;
    private int TotalAddedItem=0;
    public HealthyBurger(String breadRolType, boolean isAddMeat, boolean isAddCarrot, boolean isAddTomato, boolean isAddLettuce) {
        super(breadRolType, isAddMeat, isAddCarrot, isAddTomato, isAddLettuce);

        if(isAddCarrot)
        {

            TotalAddedItem+=1;
            BasePrice+=8;
            System.out.println("Carrot is Added "+"Now Final price is "+BasePrice);
        }
         if(isAddLettuce)
        {

            TotalAddedItem+=1;
            BasePrice+=10;
            System.out.println("Lettuce is Added "+"Now Final price is "+BasePrice);
        }
         if(isAddMeat)
        {

            TotalAddedItem+=1;
            BasePrice+=20;
            System.out.println("Meat is Added "+"Now Final price is "+BasePrice);
        }
         if(isAddTomato)
        {

            TotalAddedItem+=1;
            BasePrice+=25;
            System.out.println("Tomato is Added "+"Now Final price is "+BasePrice);
        }
    }
    public int TotalAddedItemList()
    {
        if(TotalAddedItem<0)
        {
            System.out.println("Server Down ");
        }
        return TotalAddedItem;
    }
    public String TotalValueIs()
    {
        return "Base Price is "+OriginalValue+" And Extra Added  Item is "+TotalAddedItem+" Final Price is "+BasePrice;
    }
}
