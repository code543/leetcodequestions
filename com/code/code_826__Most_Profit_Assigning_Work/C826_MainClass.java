package lee.code.code_826__Most_Profit_Assigning_Work;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C826_MainClass {
public static String testCase = "[2,4,6,8,10]\n[10,20,30,40,50]\n[4,5,6,7]";
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
            int[] difficulty = Utils.stringToIntegerArray(line);
            line = in.readLine();
            int[] profit = Utils.stringToIntegerArray(line);
            line = in.readLine();
            int[] worker = Utils.stringToIntegerArray(line);
            
            int ret = new Solution().maxProfitAssignment(difficulty, profit, worker);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
