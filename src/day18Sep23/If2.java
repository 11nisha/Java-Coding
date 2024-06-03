package day18Sep23;

public class If2 {
	/*
	forever if false: 
		----------------
		This condition will always be evaluated as false so it will be executed ELSE part. 
		If part will never be executed. So if part is called as a dead code or unreachable code. 
*/
		
		 public static void main(String[] args)
		 { 
		    boolean result = false;   // true or false
		    if (result)     // forever false condition 
		       System.out.println("inside if part");  // unreachable code or dead code 
		    else      
		       System.out.println("inside else part");
		 }
		}

