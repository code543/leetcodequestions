package lee.code.code_638__Shopping_Offers;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C638_MainClass {
public static String testCase = "[2,5]\n[[3,0,5],[1,2,10]]\n[3,2]";
/*
    public static ArrayList<Integer> Utils.stringToIntegerArrayList(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        String[] parts = input.split(",");
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            al.add(Integer.parseInt(part));
        }
        return output;
    }
    
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
            List<Integer> price = Utils.stringToIntegerArrayList(line);
            line = in.readLine();
            List<List<Integer>> special = Utils.stringToInt2dArrayList(line);
            line = in.readLine();
            List<Integer> needs = Utils.stringToIntegerArrayList(line);
            
            int ret = new Solution().shoppingOffers(price, special, needs);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
