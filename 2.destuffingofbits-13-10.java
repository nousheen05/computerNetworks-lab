//destuffing the bits at receivers end
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char[] arr= s1.toCharArray();
		String receiver ="";
		int count =0;
        for(int i=8;i<arr.length-8;i++)
        {
            if(arr[i]=='1')
            {
                receiver = receiver + arr[i];
                count++;
                if(count>=5)
                {
                    
                    count=0;
                    i++;
                }
            }
            else 
            {
                receiver = receiver + arr[i];
            }
            
        }
        System.out.println("Destuffed String: "+ "01111110"+receiver+"01111110");
	}
}
