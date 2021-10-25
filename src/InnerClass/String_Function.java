package InnerClass;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_Function {

    public static void main(String[] args) {

        String MyString="Rohit is Kajcl is Sonal ";

       /* String[] SplitValue=MyString.split(" is ");*/

       /* String SubStringValue=MyString.substring(2,9);*/

        String html="https://archive.org/details/udemy-course-downloader-the-complete-android-amp-java-developer-course-build-21-app/42+Old-Connecting+to+the+World+-+Connecting+to+the+Internet/388+OLD+-+Weather+App++-+Final+Product.mp4";

        String example = "rohit is here because of you ";

        String portionString = example.substring(2,19);

        System.out.println(portionString);

        String[] myValue = example.split("is");

        System.out.println(Arrays.toString(myValue));


        /*
        Pattern p=Pattern.compile("details/(.*?).mp4");

        Matcher m = p.matcher(html);

        while (m.find())
        {
            System.out.println(m.group(1));
        }*/


    }

}
