package lee.code.code_668__Kth_Smallest_Number_in_Multiplication_Table;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C668_MainClass {
public static String testCase = "3\n3\n5";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int m = Integer.parseInt(line);
            line = in.readLine();
            int n = Integer.parseInt(line);
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            int ret = new Solution().findKthNumber(m, n, k);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
