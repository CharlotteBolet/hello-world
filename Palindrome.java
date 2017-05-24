public class Palindrome {

    public static void main(String[] args) { 
        boolean check;
        String input = "", output = "", f_output = "", l_output = "";
        for (int count = 0; count < args.length; count++) 
            input = args[count];
        System.out.println("Input string: " + input);	
        f_output = filterPunctuation(input);
        System.out.println("Input string without punctuation and whitespaces: " + f_output);
        l_output = lowCase(f_output);
        System.out.println("Input string in a lower case: " + l_output);
        check = isPalindrome(l_output);
        System.out.println("Is input string a palindrome? " + check);
    }


    //* записывает введенную строку в обратном направлении *//
    public static String reverseString(String input) {
        String output = "";		
        for (int count = input.length() - 1; count >= 0; count--)
            output += input.charAt(count);
        return output;		
    }


    //* провер€ет, €вл€етс€ ли введенна€ строка палиндромом *//
    public static boolean isPalindrome(String input) {
        String output = ""; boolean check;		
        for (int count = input.length() - 1; count >= 0; count--)
            output += input.charAt(count);
        check = input.equals(output);
        return check;
    }


    //* удал€ет из введенной строки все символы, которые не €вл€ютс€ буквами или цифрами *//
    public static String filterPunctuation(String input) {
        String output = "";
        for (int count = 0; count < input.length(); count++) {
            char cur = input.charAt(count);
            if (Character.isAlphabetic(cur) || Character.isDigit(cur))
                output += cur;
        }
        return output;
    }


    //* переводит все символы введенной строки в нижний регистр *//
    public static String lowCase(String input) {
        String output = "";		
        for (int count = 0; count < input.length(); count++)
            output += Character.toLowerCase(input.charAt(count));
        return output;		
    }
}