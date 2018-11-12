package lee.code.code_887__Super_Egg_Drop;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C887_MainClass {
public static String testCase = "1\n2";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int K = Integer.parseInt(line);
            line = in.readLine();
            int N = Integer.parseInt(line);
            
            int ret = new Solution().superEggDrop(K, N);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
