package lee.code.code_763__Partition_Labels;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C763_MainClass {
public static String testCase = "\"ababcbacadefegdehijhklij\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static String Utils.integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String Utils.integerArrayListToString(List<Integer> nums) {
        return Utils.integerArrayListToString(nums, nums.size());
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String S = Utils.stringToString(line);
            
            List<Integer> ret = new Solution().partitionLabels(S);
            
            String out = Utils.integerArrayListToString(ret);
            
            System.out.print(out);
        }
    }
}
