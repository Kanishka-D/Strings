import java.lang.*;
import java.util.*;

public class YourClassNameHere {
    public static void main(String[] args) {
       String s="Hello World";
      s+=" ";
      String rev="";
       int n=s.length();
 
    
       String w="";
       for(int i=0;i<n;i++){
         char ch=s.charAt(i);
         if(ch!=' '){
           w+=ch;
         }
          else{
            
               for(int j=w.length()-1;j>=0;j--)
                  rev+=w.charAt(j);
                System.out.println(rev);
                rev="";
                w="";
              
          }
         }
         
       }
       
       
    }

OUTPUT:
olleH
dlroW
