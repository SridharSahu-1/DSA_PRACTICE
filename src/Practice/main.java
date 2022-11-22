package Practice;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        binaryTree tree = new binaryTree();
        TreeNode root = tree.createTree(arr);
        System.out.println(root.val);
    }

}
