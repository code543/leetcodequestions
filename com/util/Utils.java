package lee.util;

import com.eclipsesource.json.JsonArray;

import java.text.DecimalFormat;
import java.util.*;

public class Utils {
    public static String stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }


    public static String[] stringToStringArray(String input) {

        if(input == null || input.length() == 0)
            return new String[0];

        return input.split(",");

/*
        JsonArray jsonArray = JsonArray.readFrom(input);
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = jsonArray.get(i).asString();
        }
        return arr;
*/
    }

    public static List<String> stringToStringList(String line) {
        JsonArray jsonArray = JsonArray.readFrom(line);
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            arr.add(jsonArray.get(i).asString());
        }
        return arr;
    }

    public static int[] stringToIntegerArray(String input) {
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

    public static int[][] stringToInt2dArray(String input) {
        JsonArray jsonArray = JsonArray.readFrom(input);
        if (jsonArray.size() == 0) {
            return new int[0][0];
        }

        int[][] arr = new int[jsonArray.size()][];
        for (int i = 0; i < arr.length; i++) {
            JsonArray cols = jsonArray.get(i).asArray();
            arr[i] = stringToIntegerArray(cols.toString());
        }
        return arr;
    }

    public static String int2dArrayToString(int[][] array) {
        if (array == null) {
            return "null";
        }
        if (array.length == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for (int[] item : array) {
            sb.append(Arrays.toString(item));
            sb.append(",");
        }

        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static ArrayList<Integer> stringToIntegerArrayList(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        String[] parts = input.split(",");
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            try {
                output.add(Integer.parseInt(part));
            }
            catch (NumberFormatException e){}
        }
        return output;
    }

    public static List<List<Integer>> stringToInt2dArrayList(String input) {
        JsonArray jsonArray = JsonArray.readFrom(input);
        if (jsonArray.size() == 0) {
            ArrayList<List<Integer>> a = new ArrayList();

            return a;
        }

        ArrayList<List<Integer>> arr = new ArrayList();
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonArray cols = jsonArray.get(i).asArray();
            arr.add(Utils.stringToIntegerArrayList(cols.toString()));
        }
        return arr;
    }

    public static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }

        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int index = 1;
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }

            if (index == parts.length) {
                break;
            }

            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }

    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayListToString(List<Integer> nums) {
        if(nums == null) return "[]";
        return integerArrayListToString(nums, nums.size());
    }


    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        if(nums == null) return "[]";
        return integerArrayToString(nums, nums.length);
    }

    public static String stringListToString(List<String> stringList) {
        if(stringList == null || stringList.size() == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (String item : stringList) {
            sb.append(item);
            sb.append(",");
        }

        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }


    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = Utils.stringToIntegerArray(input);

        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static String treeNodeToString(TreeNode root) {
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

    public static String doubleToString(double input) {
        return new DecimalFormat("0.00000").format(input);
    }


    //[1.0,-1.0,-1.0,3.0,5.0,6.0]
    public static String doubleArrayToString(double[] input) {
        if(input == null || input.length == 0)
            return "[]";

        String result = "[";
        for (int i = 0; i < input.length; i++) {
            String t = doubleToString(input[i]);
            if(i == 0)
                result += t;
            else
                result += "," + t;
        }
        result += "]";
        return result;
    }

    public static String int2dListToString(List<List<Integer>> nums) {

        if(nums == null) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (List<Integer> list: nums) {
            sb.append(integerArrayListToString(list));
            sb.append(",");
        }

        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static String charToString(char c) {
        return String.valueOf(c);
    }
}
