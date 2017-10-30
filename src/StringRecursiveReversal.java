

public class StringRecursiveReversal {
 
    String reverse = "";
     
    public String reverseString(String str){
         
        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)//takes the first char
                    +reverseString(str.substring(0,str.length()-1)); // sends substring without last char as endstring is exclusive in substring
            return reverse;
        }
    }
     
    public static void main(String a[]){
        StringRecursiveReversal srr = new StringRecursiveReversal();
        System.out.println("Result: "+srr.reverseString("helloWorld"));
    }
}
