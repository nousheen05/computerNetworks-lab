//stuffing of bits at sender side

import java.util.*;
public class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        String sender = "";
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='1')
            {
                sender = sender + arr[i];
                count++;
                if(count>=5)
                {
                    sender = sender + '0';
                    count=0;
                }
            }
            else 
            {
                sender = sender + arr[i];
            }
            
        }
        System.out.println("sender's string after stuffing: " + "01111110" + sender+ "01111110");
        System.out.println("sent for destuffing...");
    }
}