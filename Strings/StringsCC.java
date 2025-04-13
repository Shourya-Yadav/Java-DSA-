package Strings;

// import java.util.Scanner;

public class StringsCC {
    public static void printLetters(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        //Strings are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        //sc.next()->sirf word leta hai or sc.nextLine()-> puri line
        // System.out.println(name);
        // sc.close();
        // String fullName = "Tony Stark";
        //space bhi count hoga
        // System.out.println(fullName.length());

        // concatenation
        String firstName = "Shourya";
        String lastName = "Yadav";
        String fullName = firstName + " "+ lastName;
        System.out.println(fullName.charAt(1));

        printLetters(fullName);

    }
}
