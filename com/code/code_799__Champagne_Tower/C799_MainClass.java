package lee.code.code_799__Champagne_Tower;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C799_MainClass {
public static String testCase = "1\n1\n1";
/*
    public static String Utils.doubleToString(double input) {
        return new DecimalFormat("0.00000").format(input);
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int poured = Integer.parseInt(line);
            line = in.readLine();
            int query_row = Integer.parseInt(line);
            line = in.readLine();
            int query_glass = Integer.parseInt(line);
            
            double ret = new Solution().champagneTower(poured, query_row, query_glass);
            
            String out = Utils.doubleToString(ret);
            
            System.out.print(out);
        }
    }
}
