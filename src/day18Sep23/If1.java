package day18Sep23;

/*
forever if true: 
----------------
This condition will always be evaluated as true so it will execute only "if part".
Else part will never be executed. So else part is called as a dead code or unreachable code. 
It is not good to have dead code or unreachable code in a software, this decreases the code coverage. 
*/
class If1
{
 public static void main(String[] args)
 {
    boolean result = true ;
    if (result)  // result == true forever true
       System.out.println("inside if part");
    else      // unreachable code or dead code 
       System.out.println("inside else part");
 }
}