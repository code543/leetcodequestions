package lee.code.code_576__Out_of_Boundary_Paths;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C576_MainClass {
public static String testCase = "2\n2\n2\n0\n0";
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
            int N = Integer.parseInt(line);
            line = in.readLine();
            int i = Integer.parseInt(line);
            line = in.readLine();
            int j = Integer.parseInt(line);
            
            int ret = new Solution().findPaths(m, n, N, i, j);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
