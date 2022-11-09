package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left= new TreeNode(2);
        node.left.left=new TreeNode(4);
        node.right=new TreeNode(3);
        preOrder(node);
        System.out.println();
        InOrder(node);
        System.out.println();
        postOrder(node);

        TreeNode root = createTree();
        postOrder(root);
    }

    public static TreeNode createTree(){
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;
        int data = sc.nextInt();
        if(data==-1){
            return null;
        }
        root= new TreeNode(data);
        root.left = createTree();
        root.right=createTree();
        return root;
    }

    public static void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void InOrder(TreeNode root){
        if(root==null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }
    public static void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}