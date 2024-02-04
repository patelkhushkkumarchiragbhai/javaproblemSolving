import java.util.*;

class java_practice {
    public static void main(String[] arg) {
        Scanner scr = new Scanner(System.in);

        String str1 = scr.next();
        String str2 = scr.next();
        String str3 = "";

        if(str1.length() > str2.length())
            str3 = str2+str1+str2;
        else
            str3 = str1+str2+str1;

        System.out.println(str3);
        
    }
}