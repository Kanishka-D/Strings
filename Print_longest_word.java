import java.lang.*;
import java.util.*;

public class YourClassNameHere {
    public static void main(String[] args) {
       String s="Anna is goog girlsssss and beauty";
      s+=" ";
       int n=s.length();
       int max=0;
       String ans="";
       String w="";
       for(int i=0;i<n;i++){
         char ch=s.charAt(i);
         if(ch!=' '){
           w+=ch;
         }
          else{
            
              if(w.length()>max)
              {
                max=w.length();
                ans=w;
                w="";
              }
          }
         }
         System.out.println(ans);
       }
       
       
    }

OUTPUT:
girlsssss
