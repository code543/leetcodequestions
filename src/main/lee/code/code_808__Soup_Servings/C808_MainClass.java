package lee.code.code_808__Soup_Servings;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C808_MainClass {
public static String testCase = "50";
/*
    public static String Utils.doubleToString(double input) {
        return new DecimalFormat("0.00000").format(input);
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int N = Integer.parseInt(line);
            
            double ret = new Solution().soupServings(N);
            
            String out = Utils.doubleToString(ret);
            
            System.out.print(out);
        }
    }
}
