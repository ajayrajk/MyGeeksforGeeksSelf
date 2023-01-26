package selfgfg.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    static ArrayList <Integer> levelOrder(Node node)
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        Queue<Node> q=new LinkedList<Node>();
        q.add(node);
        // Your code here
        while(!q.isEmpty()){
            Node curr=q.poll();
            arr.add(curr.key);
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
        return arr;
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);

      System.out.println(levelOrder(root));
    }

}
