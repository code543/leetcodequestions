package lee.code.code_134__Gas_Station;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C134_MainClass {
public static String testCase = "[1,2,3,4,5]\n[3,4,5,1,2]";
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
            int[] gas = Utils.stringToIntegerArray(line);
            line = in.readLine();
            int[] cost = Utils.stringToIntegerArray(line);
            
            int ret = new Solution().canCompleteCircuit(gas, cost);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
