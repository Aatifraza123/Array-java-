package Strings;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Paratha");
//        str.reverse();
        str.delete(0,3);
        System.out.println(str);
    }
}
