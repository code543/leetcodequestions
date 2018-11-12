package lee.code.code_780__Reaching_Points;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C780_MainClass {
public static String testCase = "9\n5\n12\n8";
/*
    public static String Utils.booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int sx = Integer.parseInt(line);
            line = in.readLine();
            int sy = Integer.parseInt(line);
            line = in.readLine();
            int tx = Integer.parseInt(line);
            line = in.readLine();
            int ty = Integer.parseInt(line);
            
            boolean ret = new Solution().reachingPoints(sx, sy, tx, ty);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
