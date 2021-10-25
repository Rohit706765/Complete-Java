package Inheritence;

import Inheritence.AnimalExa.Animal;
import Inheritence.AnimalExa.dog;

import javax.print.attribute.standard.PrinterName;

public class main_class {
    public static void main(String args[]) {
//        StaticVar__InstanceVar a=new StaticVar__InstanceVar("Raj");
//        StaticVar__InstanceVar b=new StaticVar__InstanceVar("Rohit");
//        a.PrintName();
//        b.PrintName();


        /**
         *      Animal class object created here *********************
         * */
        Animal dog = new Animal("tommy", 1, 1, 5, 8);
        //dog.eat();
        Inheritence.AnimalExa.dog tommy = new dog("tommy0", 1, 1, 6, 9);
        tommy.move();
        System.out.println(tommy.getName());
        tommy.eat();
        /**
         *    Human class object created here**************************************
         * */
 /*       human mom=new human("kaj",45,"Graduate");
        System.out.println(mom.getName());
        Man papa=new Man("Satyender singh",49,"Married","ITI","Idk","5",4,22000,"Excellent");
        System.out.println( papa.getBehaviour());
        System.out.println( papa.getName());
        System.out.println( papa.getChild());
        System.out.println( papa.getSaving());
       papa.biscep();
 */
        /**
         *  ThisVsSub class object created here  *******************
         * */
        /* ThisVsSub a=new ThisVsSub(10,20,30,40);

        System.out.println(a.WidthCalculator());
   */
    }

    /**
     *       Details about main() is below *****************************
     * */
    // public means we can access anywhere
    //static means no need to create obj of this class if you want to access a fun
    //void means return nothing
    //main is fun() name
    // String is datatype and args[] is an array
}
