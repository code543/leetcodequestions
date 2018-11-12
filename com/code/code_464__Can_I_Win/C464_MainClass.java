package lee.code.code_464__Can_I_Win;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C464_MainClass {
public static String testCase = "10\n11";
/*
    public static String Utils.booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int maxChoosableInteger = Integer.parseInt(line);
            line = in.readLine();
            int desiredTotal = Integer.parseInt(line);
            
            boolean ret = new Solution().canIWin(maxChoosableInteger, desiredTotal);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
