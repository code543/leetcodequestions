package lee.code.code_223__Rectangle_Area;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C223_MainClass {
public static String testCase = "-3\n0\n3\n4\n0\n-1\n9\n2";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int A = Integer.parseInt(line);
            line = in.readLine();
            int B = Integer.parseInt(line);
            line = in.readLine();
            int C = Integer.parseInt(line);
            line = in.readLine();
            int D = Integer.parseInt(line);
            line = in.readLine();
            int E = Integer.parseInt(line);
            line = in.readLine();
            int F = Integer.parseInt(line);
            line = in.readLine();
            int G = Integer.parseInt(line);
            line = in.readLine();
            int H = Integer.parseInt(line);
            
            int ret = new Solution().computeArea(A, B, C, D, E, F, G, H);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
