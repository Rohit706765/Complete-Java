package Interface.Excesize;

import java.util.ArrayList;
import java.util.List;

public class Main {

   static List<String> data = new ArrayList<>();
    public static void main(String[] args) {
	// write your code here
        Saveble sonal = new AadharCard(25,"sonal singh","222 rameshwar nagar ,bamroli road ","7043809556");
        saveObj(sonal);
        loadObj(sonal);
    }
    public static void saveObj(Saveble saveble)
    {
        for (int i = 0 ;i <saveble.saveData().size();i++)
        {
            System.out.println("Saving "+saveble.saveData().get(i)+" in your stroage medium ");
        }
        data = saveble.saveData();
    }
    public static void loadObj(Saveble saveble)
    {
        saveble.readValues(data);
    }
}
