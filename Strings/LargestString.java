package Strings;
/*
  Q->For a given set of strings,print the largest string
  "apple","mango","banana"
  Lexicographic
  str1.compareTo(str2)

  0:equal
  <0:-ve str1 < str2
  >0:+ve str1 > str2

  compareToIgnoreCase
 */
public class LargestString {
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"};
        String largest = fruits[0];
        for(int i = 1;i < fruits.length;i++){
            if(largest.compareTo(fruits[i])< 0){
                largest = fruits[i];
            };
        }
        System.out.println(largest);
    }
}
