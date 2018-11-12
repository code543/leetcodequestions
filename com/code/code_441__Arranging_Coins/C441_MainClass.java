package lee.code.code_441__Arranging_Coins;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C441_MainClass {
public static String testCase = "5";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution().arrangeCoins(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
