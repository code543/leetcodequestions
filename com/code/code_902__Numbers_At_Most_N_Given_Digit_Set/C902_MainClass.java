package lee.code.code_902__Numbers_At_Most_N_Given_Digit_Set;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C902_MainClass {
public static String testCase = "[\"1\",\"3\",\"5\",\"7\"]\n100";
/*
    public static String[] Utils.stringToStringArray(String line) {
        JsonArray jsonArray = JsonArray.readFrom(line);
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = jsonArray.get(i).asString();
        }
        return arr;
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String[] D = Utils.stringToStringArray(line);
            line = in.readLine();
            int N = Integer.parseInt(line);
            
            int ret = new Solution().atMostNGivenDigitSet(D, N);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
