package lee.code.code_440__K_th_Smallest_in_Lexicographical_Order;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C440_MainClass {
public static String testCase = "13\n2";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            int ret = new Solution().findKthNumber(n, k);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
