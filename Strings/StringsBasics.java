package Strings;
import java.util.*;
public class StringsBasics {
    public static void main(String[] args) {
       String str = "raza";
       for (int i = 0; i <= 3; i++){
           for (int j = i + 1; j <= 4; j++){
               System.out.println(str.substring(i,j));
           }
       }
    }
}