public class YourClassNameHere {
    public static void main(String[] args) {
       String s="Ine the box";
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
              if(w.contains("e"))
               System.out.println(w);
            w="";
          }
         }
       }
       
       
    }

OUTPUT:
Ine
the
