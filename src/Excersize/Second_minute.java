package Excersize;

public class Second_minute {
    private static final String Invalid_vale_message="Invalid Value Enter ";
    public static void main(String ar[])
        {

            String getSecondvalue;
            String time= GetDurationString(63,10);
            time= GetDurationString(3600,50);
            getSecondvalue=GetDurationString(3601);
            System.out.println("total second was "+getSecondvalue);
            System.out.println(time);
        }
    static String GetDurationString(int minute,int second)
    {
        int Minute,hour;
        String hourString="",SecondString="",MinuteString="";

        int RemainMinute=0;
        if(minute<0 || ((second<0) || (second>59)))
        {
           return Invalid_vale_message;
        }
        else
        {

            if(minute>=60)
            {
                RemainMinute=minute%60;
            }
            else
            {
                RemainMinute=minute;
            }
            if (RemainMinute<10)
            {
                MinuteString="0"+RemainMinute+"m";
            }
            else
            {
                MinuteString=+RemainMinute+"m";
            }
            hour=minute/60;

            if(hour<10)
            {
                hourString="0"+hour+"h";
            }
            else
            {
                hourString=hour+"h";
            }
            if (second<10)
            {
                SecondString=second+"s";
            }
            else
            {
                SecondString=second+"s";
            }
            return hourString+"  "+MinuteString+"  "+SecondString+" ";
        }
    }
    static String GetDurationString(int second) {
        int minute=0;
        int remainingSecond=0;

            minute=second/60;
            remainingSecond=second%60;
            return GetDurationString(minute,remainingSecond);


}

    }

