public class YourClassNameHere {
    public static void main(String[] args) {
       String s="In the box";
      s+=" ";
       int n=s.length();
       String w="";
       for(int i=0;i<n;i++){
         char ch=s.charAt(i);
         if(ch!=' '){
           w+=ch;
         }
          else{
            //if(w.charAt(0)=='b') or
              if(w.startsWith("b"))
               System.out.println(w);
            w="";
          }
         }
       }
       
       
    }

OUTPUT:
box
