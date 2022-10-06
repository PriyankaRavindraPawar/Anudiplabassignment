package fibonecci;

import java.util.Scanner;

public class fibonecci 
{
	    public static void main(String[] args) 
	    {
	        int rem,rev=0,temp;
	       Scanner sc=new Scanner(System.in);
	       
	       System.out.print("Enter value = ");
	       int n=sc.nextInt();
	        
	       temp=n;
	    
	       System.out.print("\nReverse no : ");
	        while(n>0)
	        {
	            rem=n%10;
	            rev=rev*10+rem;
	            n=n/10;
	        }
	        System.out.println(rev+"\n");
	         if(temp==rev)
	         {
	            System.out.print(rev+" It is a pallindrom number ");
	         }
	         else
	         {
	            System.out.print(rev+" It is not a pallindrom number ");
	         }
	    }
	}