import java.util.*;

class java_practice {
    static void problem (String a, int idx, int n ){
        if (idx+1 == a.length()) {
            System.out.println(n);;
        }
        char c_ch = a.charAt(idx);
        if('a' == c_ch || 'e' == c_ch || 'i' == c_ch || 'o' == c_ch || 'u'== c_ch || 'A' == c_ch || 'E' == c_ch || 'I' == c_ch || 'O'== c_ch || 'U' == c_ch ){
            problem(a, idx+1, n+1);
        }else{
            problem(a, idx+1, n);
        }
        
    }
    public static void main(String[] arg) {
        Scanner scr = new Scanner(System.in);
        String a = scr.next();
        problem(a, 0, 0);
    }
}