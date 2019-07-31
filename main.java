import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main{
    public static void main(String[] args) throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);

        String input = reader.readLine();

        System.out.println(camelCase(input));
        //In "word1,word2" format
        String inputTwo = reader.readLine();

        System.out.println(commonSuffix(inputTwo));
        //Input "5;01230" "7;0432415" format. where the range for the data preceding ";" is  (0, first number -2)
        String inputThree = reader.readLine();

        System.out.println(duplicates(inputThree));

    }

    public static String camelCase(String input){
        String newStr = "";
        String[] stringArray = input.split(" ");

        for (int i = 0; i < stringArray.length; i++){
            newStr += capitalizeWord(stringArray[i]);
            if (i != stringArray.length-1){
                newStr += " ";
            }
        }
        return newStr;
    }

    public static String capitalizeWord(String input){
        String firstLetter = input.substring(0,1).toUpperCase();
        String upperCaseStr = firstLetter + input.substring(1);
        return upperCaseStr;
    }

    public static String commonSuffix(String input){
        String commonSuffix = "";

        //Reversing Input
        String [] strArray = input.split(",");

        for (int i = 0; i <= strArray.length-1;i++){
            strArray[i] = reverse(strArray[i]);
        }

        String firstStr = strArray[0];
        String secondStr = strArray[1];
        int y = 0;

        //Determining terminal condition for comparison loop
        if (firstStr.length() > secondStr.length()){
            y = firstStr.length();
        }else{
            y = firstStr.length();
        }
        //As long as the character matches, append character to commonSuffix.
        for(int x = 0; x <= y; x++){
            if (firstStr.charAt(x) != secondStr.charAt(x)){
                break;
            }else{
                commonSuffix += firstStr.charAt(x);
            }
        }

        //Outputing suffix back to the correct order
        return reverse(commonSuffix);
    }

    public static String reverse(String input){
        String reverse = "";
        for (int i = input.length()-1; i >= 0; i--){
            reverse += input.charAt(i);
        }
        return reverse;
    }

    public static Integer duplicates(String input){
        return null;
    }
}
