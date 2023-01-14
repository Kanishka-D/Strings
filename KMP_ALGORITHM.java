import java.util.*;
import java.lang.*;

public class YourClassNameHere {
  
   public static void computelps(String pat,int[] lps){
        int len=0;
        int i=1;
        lps[0]=0;
        int l=pat.length();
        
        while(i<l){
            if(pat.charAt(len)==pat.charAt(i)){
                lps[i]=len+1;
                len++;
                i++;
            }
            else{
                if(len==0){
                  lps[i]=0;
                  i++;
                }
                else
                  len=lps[len-1];
                 
            }
            
        }
    }
  static int strstr(String pat, String txt)
    {
        // your code here
        int ans=-1;
        
        int m=pat.length();
        int n=txt.length();
        
        int[] lps=new int[m];
        
       
        int i=0;
        int j=0;
        
        computelps(pat,lps);
        while(i<n){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j==0)
                i++;
                else
                  j=lps[j-1];
            }
            
            if(j==m){
                ans=i-j;
               j=lps[j-1];
              
            }
        }
       return ans; 
   
}
    public static void main(String[] args) {
    String s="ffbefbdbacbccecaceddcbcaeaebfedfcfdbeecffdbbf";
    String s2="cb";
    System.out.println(strstr(s2,s));
    }
}
