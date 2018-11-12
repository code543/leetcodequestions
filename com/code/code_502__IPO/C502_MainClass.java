package lee.code.code_502__IPO;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C502_MainClass {
public static String testCase = "2\n0\n[1,2,3]\n[0,1,1]";
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
            int k = Integer.parseInt(line);
            line = in.readLine();
            int W = Integer.parseInt(line);
            line = in.readLine();
            int[] Profits = Utils.stringToIntegerArray(line);
            line = in.readLine();
            int[] Capital = Utils.stringToIntegerArray(line);
            
            int ret = new Solution().findMaximizedCapital(k, W, Profits, Capital);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
