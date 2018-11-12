package lee.code.code_672__Bulb_Switcher_II;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C672_MainClass {
public static String testCase = "1\n1";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            line = in.readLine();
            int m = Integer.parseInt(line);
            
            int ret = new Solution().flipLights(n, m);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
