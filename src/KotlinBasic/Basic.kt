package KotlinBasic



class Basic {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            println("Kotlin main is running here!")

            // TODO how to declare variable
            var number : Int = 10;
            var  name:  String = "rajan";
            var isMAle :Boolean = true;

            // TODO String manipulation

            println("$number && $name && $isMAle")

            // TODO create function with return type

            fun sum(a:Int,b:Int):Int
            {
                var c = a+b;
                return c;
            }
            println(sum(10,20))

            // TODO Array , Arraylist ,list;

            var myArray = arrayOf(10,20,30,40)

            var arrayList = mutableListOf(10,20,30,40)
            arrayList.add(50)
            println("my arraylist is $arrayList")

            var movie:List<String> = mutableListOf<String>("sex","one more time ","ho jane do");
            println("movie is $movie")

            // TODO For loop

            for (i in 1..10)
            {
                println(i);
            }
            var friends = listOf<String>("rohit","sonal","kajal");
            for (i:String in friends)
            {
                println("Friends $i")
            }

            // TODO map

            var relation = mapOf("rohit" to 1,"sonal" to 2,"kajal" to 3) // not grow
            // println(relation)

            println(relation["rohit"])

            var new_rel = mutableListOf(1 to "rohit", 2 to "sonal" , 3 to "kajal ")
            println(new_rel)

            //TODO class

            class car
            {
                var wheel = 4;
                var door =4;
                var engine:String = "tesla";
                var model = "new"

                constructor(wheel:Int , door:Int , engine:String)
                {
                    this.wheel = wheel
                    this.door = door
                    this.engine = engine
                }
                fun details():String
                {
                    return "wheel is $wheel door is $door and engine is $engine"
                }
            }
            //TODO creating object is here

            var amw = car(4,4,"tesla");
            println(amw.details())

            //TODO  creating null
            var surName:String ? = "rohit"
            if (surName!=null)
            {
                println(surName)
            }
        }

    }


}
