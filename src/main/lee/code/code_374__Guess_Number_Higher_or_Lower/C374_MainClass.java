package lee.code.code_374__Guess_Number_Higher_or_Lower;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C374_MainClass {
public static String testCase = "10\n6";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            line = in.readLine();
            int pick = Integer.parseInt(line);
            
            int ret = new Solution().guessNumber(n, pick);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
