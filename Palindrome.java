import java.util.Scanner;
public class Palindrome 
  
{
    public static void main (String[] args) 
      {
   
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
	for (int i = 0; i < s.length(); i++) 
        
	{ 
	 if(s.charAt(i) == ' ') 
	{
                System.out.println(i);
            }
	}
	}
}