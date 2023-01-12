public class YourClassNameHere {
    public static void main(String[] args) {
   String name = "abcd";
    int len = name.length();
    //char[] c = name.toCharArray();
    String rev="";
    for(int i=len-1;i>=0;i--)
      // rev+=c[i];
      rev+=name.charAt(i);


    System.out.println("Swapping string is: ");
    System.out.println(rev);

  }
}

OUTPUT:
dcba
