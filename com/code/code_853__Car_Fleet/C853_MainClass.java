package lee.code.code_853__Car_Fleet;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C853_MainClass {
public static String testCase = "12\n[10,8,0,5,3]\n[2,4,1,1,3]";
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
            int target = Integer.parseInt(line);
            line = in.readLine();
            int[] position = Utils.stringToIntegerArray(line);
            line = in.readLine();
            int[] speed = Utils.stringToIntegerArray(line);
            
            int ret = new Solution().carFleet(target, position, speed);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
