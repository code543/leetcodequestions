package lee.code.code_84__Largest_Rectangle_in_Histogram;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C84_MainClass {
public static String testCase = "[2,1,5,6,2,3]";
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
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int[] heights = Utils.stringToIntegerArray(line);
            
            int ret = new Solution().largestRectangleArea(heights);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
