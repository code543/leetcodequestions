package lee.code.code_105__Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C105_MainClass {
public static String testCase = "[3,9,20,15,7]\n[9,3,15,20,7]";
/*
    public static int[] Utils.stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static String Utils.treeNodeToString(TreeNode root) {
        if (root == null) {
            return "[]";
        }
    
        String output = "";
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();
    
            if (node == null) {
              output += "null, ";
              continue;
            }
    
            output += String.valueOf(node.val) + ", ";
            nodeQueue.add(node.left);
            nodeQueue.add(node.right);
        }
        return "[" + output.substring(0, output.length() - 2) + "]";
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int[] preorder = Utils.stringToIntegerArray(line);
            line = in.readLine();
            int[] inorder = Utils.stringToIntegerArray(line);
            
            TreeNode ret = new Solution().buildTree(preorder, inorder);
            
            String out = Utils.treeNodeToString(ret);
            
            System.out.print(out);
        }
    }
}
