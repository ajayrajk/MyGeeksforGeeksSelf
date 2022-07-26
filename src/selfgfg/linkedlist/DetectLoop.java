package selfgfg.linkedlist;

public class DetectLoop {
    public static boolean detectLoop(Node head){
        // Add code here
        Node walker=head;
        Node runner=head;
        while(runner.next!=null && runner.next.next!=null){
            walker=walker.next;
            runner=runner.next.next;
            if(walker==runner)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
      int  value[] = {1,8,3,4};
      System.out.println();
    }

}
