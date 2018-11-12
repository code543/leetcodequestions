package lee.code.code_837__New_21_Game;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C837_MainClass {
public static String testCase = "10\n1\n10";
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
            line = in.readLine();
            int K = Integer.parseInt(line);
            line = in.readLine();
            int W = Integer.parseInt(line);
            
            double ret = new Solution().new21Game(N, K, W);
            
            String out = Utils.doubleToString(ret);
            
            System.out.print(out);
        }
    }
}
