package selfgfg.tree;

public class PrePostInOrderTraversal {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);

        System.out.println("\n Post Order");

        postOrder(root);
        System.out.println("In Order");

        inorder(root);

        System.out.println("\n Pre Order");

        preOrder(root);

    }
    public static void inorder(Node root){
        if (root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }

    public static void preOrder(Node root){
        if (root!=null){
            System.out.print(root.key+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void postOrder(Node root){
        if (root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key+" ");
        }
    }
}
