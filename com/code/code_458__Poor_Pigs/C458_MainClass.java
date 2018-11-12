package lee.code.code_458__Poor_Pigs;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C458_MainClass {
public static String testCase = "1000\n15\n60";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int buckets = Integer.parseInt(line);
            line = in.readLine();
            int minutesToDie = Integer.parseInt(line);
            line = in.readLine();
            int minutesToTest = Integer.parseInt(line);
            
            int ret = new Solution().poorPigs(buckets, minutesToDie, minutesToTest);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
