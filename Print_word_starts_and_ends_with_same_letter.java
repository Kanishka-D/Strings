import java.lang.*;
import java.util.*;

public class YourClassNameHere {
    public static void main(String[] args) {
       String s="Anna is goog girl";
      s+=" ";
       int n=s.length();
       String w="";
       for(int i=0;i<n;i++){
         char ch=s.charAt(i);
         if(ch!=' '){
           w+=ch;
         }
          else{
            
              char f=w.charAt(0);
              char l=w.charAt(w.length()-1);
              if(Character.toUpperCase(f)==Character.toUpperCase(l))
               System.out.println(w);
            w="";
          }
         }
       }
       
      
      
      OUTPUT:
      Anna
      goog
