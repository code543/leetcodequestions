package lee.code.code_762__Prime_Number_of_Set_Bits_in_Binary_Representation;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C762_MainClass {
public static String testCase = "842\n888";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int L = Integer.parseInt(line);
            line = in.readLine();
            int R = Integer.parseInt(line);
            
            int ret = new Solution().countPrimeSetBits(L, R);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
