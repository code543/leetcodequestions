package lee.code.code_914__X_of_a_Kind_in_a_Deck_of_Cards;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C914_MainClass {
public static String testCase = "[1,2,3,4,4,3,2,1]";
/*
    public static int[] Utils.stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static String Utils.booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int[] deck = Utils.stringToIntegerArray(line);
            
            boolean ret = new Solution().hasGroupsSizeX(deck);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
