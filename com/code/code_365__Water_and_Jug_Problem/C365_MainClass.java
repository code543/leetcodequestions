package lee.code.code_365__Water_and_Jug_Problem;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C365_MainClass {
public static String testCase = "3\n5\n4";
/*
    public static String Utils.booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            line = in.readLine();
            int y = Integer.parseInt(line);
            line = in.readLine();
            int z = Integer.parseInt(line);
            
            boolean ret = new Solution().canMeasureWater(x, y, z);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
