package Practice;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Treenode {
    int data;
    Treenode left;
    Treenode right;

    Treenode(int data) {
        this.data = data;
    }
}

// 5 3 6 2 4 null 7

/**
 *       5
 *      / \
 *     3   6
 *    / \   \
 *   2  4    7
 *
 *
 *   queue: [2, 4, 7]
 *
 *          5
 *         / \
 *        3   6
 *       / \   \
 *      2  4    7
 */
public class Trees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] inputArray = input.split(" "); // ["5", "3", "6", "2", "4", "null", "7"]

        Queue<Treenode> queue = new LinkedList<>();
        Treenode root = null;
        if (inputArray.length > 0 && !inputArray[0].equals("null")) {
            int data = Integer.parseInt(inputArray[0]);
            root = new Treenode(data);
        } // root is created

        queue.add(root);

        // i = 7
        for (int i = 1; i < inputArray.length; i+=2) {
            Treenode currentTreenode = queue.remove(); // 6

            // left child: 2
            if (!inputArray[i].equals("null")) {
                Treenode leftTreenode = new Treenode(Integer.parseInt(inputArray[i]));
                currentTreenode.left = leftTreenode;
                queue.add(leftTreenode);
            } else {
                currentTreenode.left = null;
            }

            // right child: 5
            if (!inputArray[i+1].equals("null")) {
                Treenode rightTreenode = new Treenode(Integer.parseInt(inputArray[i+1]));
                currentTreenode.right = rightTreenode;
                queue.add(rightTreenode);
            } else {
                currentTreenode.right = null;
            }
        }
    }
}