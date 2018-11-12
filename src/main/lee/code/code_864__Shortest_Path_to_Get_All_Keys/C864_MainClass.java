package lee.code.code_864__Shortest_Path_to_Get_All_Keys;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C864_MainClass {
public static String testCase = "[\"@.a.#\",\"###.#\",\"b.A.B\"]";
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
            String[] grid = Utils.stringToStringArray(line);
            
            int ret = new Solution().shortestPathAllKeys(grid);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
