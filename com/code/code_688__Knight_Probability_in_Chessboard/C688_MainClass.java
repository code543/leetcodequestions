package lee.code.code_688__Knight_Probability_in_Chessboard;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C688_MainClass {
public static String testCase = "3\n2\n0\n0";
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
            int r = Integer.parseInt(line);
            line = in.readLine();
            int c = Integer.parseInt(line);
            
            double ret = new Solution().knightProbability(N, K, r, c);
            
            String out = Utils.doubleToString(ret);
            
            System.out.print(out);
        }
    }
}
