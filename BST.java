import java.util.*;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);

        } else {
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;

    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node delete(Node root, int val) {
        if (root.data < val) {// ---->steps for finding the delete nodes
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // case1 ->no child
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case3---->both children
            Node IS = findInroderSuccesor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;

    }

    public static Node findInroderSuccesor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }

        else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    public static void root2leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printpath(path);
        }
        root2leaf(root.left, path);
        root2leaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void printpath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    public static boolean isValid(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min!= null && root.data <= min.data) {
            return false;
        } else if (max!= null && root.data >= max.data) {
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right, root, max);
        

    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 1 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        // if(search(root,19)){
        // System.out.println("found");
        // }else{
        // System.out.println("not found");
        // }

        // root=delete(root,5);
        // System.out.println();
        // inorder(root);

        // printInRange(root, 5, 12);

        // root2leaf(root, new ArrayList<>());

        if(isValid(root,null, null)){
            System.out.println("valid");
        }else{
            System.out.println("Not valid");
        }

    }
}
