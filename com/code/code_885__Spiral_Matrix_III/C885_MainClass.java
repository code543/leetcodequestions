package lee.code.code_885__Spiral_Matrix_III;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C885_MainClass {
public static String testCase = "1\n4\n0\n0";
/*
    public static String Utils.int2dArrayToString(int[][] array) {
        if (array == null) {
            return "null";
        }
        if (array.length == 0) {
            return "[]";
        }
    
        StringBuilder sb = new StringBuilder("[");
        for (int[] item : array) {
            sb.append(Integer.toString(item));
            sb.append(",");
        }
    
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int R = Integer.parseInt(line);
            line = in.readLine();
            int C = Integer.parseInt(line);
            line = in.readLine();
            int r0 = Integer.parseInt(line);
            line = in.readLine();
            int c0 = Integer.parseInt(line);
            
            int[][] ret = new Solution().spiralMatrixIII(R, C, r0, c0);
            
            String out = Utils.int2dArrayToString(ret);
            
            System.out.print(out);
        }
    }
}
