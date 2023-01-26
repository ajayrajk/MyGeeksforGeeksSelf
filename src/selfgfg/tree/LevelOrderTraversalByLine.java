package selfgfg.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalByLine {


    static ArrayList<ArrayList<Integer>> levelOrder(Node node)
    {
        // Your code here
        ArrayList<Integer> arrayList=new ArrayList<>();

        Queue<Node> q=new LinkedList<>();
        q.add(node);
        while (q.size()>0){
            Node curr=q.poll();
            if (curr==null){
              System.out.println("  ");
              continue;
            }
            arrayList.add(curr.key);
            if (curr.left!=null)
                q.add(curr.left);
            if (curr.right!=null)
                q.add(curr.right);
        }
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();
        result.add(arrayList);

       return result;
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
