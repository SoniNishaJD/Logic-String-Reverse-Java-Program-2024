import java.util.Scanner;

public class ReverseString {
	 public static void performReverse(String str){    
	
	 StringBuilder sb = new StringBuilder(str);     
     sb.reverse();  
     System.out.println("Reverse string using StringBuilder: "+sb.toString());      
       
     char ch[] = str.toCharArray();    
     String reverseString="";    
     for(int i = ch.length-1; i >= 0 ; i--){    
         reverseString+=ch[i];    
     }  
     System.out.println("Reverse string using string iteration: "+reverseString);   
 }  
  public static void main(String[] args) {   
       
     Scanner sc = new Scanner(System.in);   
     String name = sc.nextLine();  
       
      performReverse(name);  
 }  

}
