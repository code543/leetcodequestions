package lee.code.code_743__Network_Delay_Time;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C743_MainClass {
public static String testCase = "[[2,1,1],[2,3,1],[3,4,1]]\n4\n2";
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
    
    public static int[][] Utils.stringToInt2dArray(String input) {
        JsonArray jsonArray = JsonArray.readFrom(input);
        if (jsonArray.size() == 0) {
          return new int[0][0];
        }
    
        int[][] arr = new int[jsonArray.size()][];
        for (int i = 0; i < arr.length; i++) {
          JsonArray cols = jsonArray.get(i).asArray();
          arr[i] = Utils.stringToIntegerArray(cols.toString());
        }
        return arr;
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int[][] times = Utils.stringToInt2dArray(line);
            line = in.readLine();
            int N = Integer.parseInt(line);
            line = in.readLine();
            int K = Integer.parseInt(line);
            
            int ret = new Solution().networkDelayTime(times, N, K);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
