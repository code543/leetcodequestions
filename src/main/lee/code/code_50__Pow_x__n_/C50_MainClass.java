package lee.code.code_50__Pow_x__n_;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C50_MainClass {
public static String testCase = "2.00000\n10";
/*
    public static String Utils.doubleToString(double input) {
        return new DecimalFormat("0.00000").format(input);
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            double x = Double.parseDouble(line);
            line = in.readLine();
            int n = Integer.parseInt(line);
            
            double ret = new Solution().myPow(x, n);
            
            String out = Utils.doubleToString(ret);
            
            System.out.print(out);
        }
    }
}
