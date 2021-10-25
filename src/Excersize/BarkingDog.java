package Excersize;

public class BarkingDog
{
 public static void main(String ar[])
 {
     String CatName;
     Float Temperature;
     boolean Isbrak=false;

     Isbrak=IsBrak("Rocky",25,false);
     System.out.println("Your Dog/cat is Brak "+Isbrak);
     IsBrak("tommy",45,true);
 }
 public static boolean IsBrak(String CatName,int temp,boolean AlreadyBark)
 {
     System.out.println("Checking Temperature..... Wait for now !!!!!!");
     System.out.println("YourDog is always Bark "+AlreadyBark);
     if(temp>=45)
     {
         return true;
     }
     else if(temp>=35)
     {
         return true;
     }
     else if(temp>=25)
     {
         return false;
     }
     else
     {
         return false;
     }

 }
}
