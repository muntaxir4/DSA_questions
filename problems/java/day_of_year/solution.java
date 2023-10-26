import java.util.*;
class DayOfYear
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the date");
        String date= sc.next();
        int sum =0;
        int day= Integer.parseInt(date.substring(0,date.indexOf('/')));
        int month= Integer.parseInt(date.substring(date.indexOf('/')+1,date.lastIndexOf('/')));
        int year= Integer.parseInt(date.substring(date.lastIndexOf('/')+1));
        int a1[]={31,28,31,30,31,30,31,31,30,31,30,31}; // no of days in eachmonth in a non-leap year
        int a2[]={31,29,31,30,31,30,31,31,30,31,30,31}; // no of days in eachmonth in a leap year
        if(year%4==0){
            for(int i=0;i<(month-1);i++)
            {
                sum=sum+a2[i];
            }}
            else{
            for( int i=0;i<(month-1);i++)
            sum=sum+a1[i];
        }
            sum=sum+day;
            System.out.println("It is the "+sum+"th day of the year");
        }
    }