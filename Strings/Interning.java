package Strings;

public class Interning {
    public static void main(String[] args) {
     String str = "";
     for (int i = 0; i <= 10; i++){
     str += i;
     System.out.println(str);
}

        String s = "hello";
        String x = "hello";
        x = "mellow"+(10+90);
        System.out.println(x);
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);

    }
}