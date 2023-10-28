/**
 * THE PROBLEM: Write a program in JAVA to find the difference between two dates in days.
 Eg: First Date --> 24 / 03 / 2003
     Second Date --> 26 / 10 / 2023
     The difference between two dates --> 7521 days
 */


import java.util.*;
class DatesDiff
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first date1");
        String date1= sc.next();
        int sum =0;
        int day1= Integer.parseInt(date1.substring(0,date1.indexOf('/')));
        int month1= Integer.parseInt(date1.substring(date1.indexOf('/')+1,date1.lastIndexOf('/')));
        int year1= Integer.parseInt(date1.substring(date1.lastIndexOf('/')+1));
        int a1[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int a2[]={31,29,31,30,31,30,31,31,30,31,30,31};
        if(year1%4==0){
            for(int i=0;i<(month1-1);i++)
            {
                sum=sum+a2[i];
            }
            sum=366-sum-day1;
        }
        else{
            for( int i=0;i<(month1-1);i++){
                sum=sum+a1[i];
            }
            sum=365-sum-day1;
        }
        System.out.println(sum);
        System.out.println("Enter the second date");
        String date2= sc.next();
        int sum2 =0;
        int day2= Integer.parseInt(date2.substring(0,date2.indexOf('/')));
        int month2= Integer.parseInt(date2.substring(date2.indexOf('/')+1,date2.lastIndexOf('/')));
        int year2= Integer.parseInt(date2.substring(date2.lastIndexOf('/')+1));
        if(year2%4==0){
            for(int i=0;i<(month2-1);i++)
            {
                sum2=sum2+a2[i];
            }
        }
        else{
            for( int i=0;i<(month2-1);i++){
                sum2=sum2+a1[i];
            }
        }
        sum2=sum2+day2;
        System.out.println(sum2);    
        int j=0,sum3=0;
        for(int i=year1;i<year2;i++)
        {
            if(i%4==0)
                j++;
        }
        sum3=sum+sum2 + ((year2-year1-j-1)*365)+(j*366);
        System.out.println("The difference is "+sum3+" days");
    }
}