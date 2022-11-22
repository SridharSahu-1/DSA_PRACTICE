package Practice;

public class binaryTree {
    static int idx = -1;
    public TreeNode createTree(int[] arr){
        idx++;
        if(arr[idx]==-1) return null;
        TreeNode newNode= new TreeNode(arr[idx]);
        newNode.left=createTree(arr);
        newNode.right=createTree(arr);
        return newNode;
    }

}
