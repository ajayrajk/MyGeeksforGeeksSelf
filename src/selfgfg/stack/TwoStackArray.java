package selfgfg.stack;

public class TwoStackArray {

    int cap;
     int top1;
    int top2;
    int arr[];

    TwoStackArray(int n)
    {
        arr = new int[n];
        cap = n;
        top1 = -1;
        top2 = cap;
    }
    //Function to push an integer into the stack1.
         void push1(int x)
        {
           if (top1<top2-1){
               top1++;
               arr[top1]=x;
           }else{
               System.out.println("Stack Over Flow");
               System.exit(1);
           }
        }

        //Function to push an integer into the stack2.
        void push2(int x)
        {
            if (top1< top2-1){
                top2--;
                arr[top2]=x;
            }else{
                System.out.println("Stack Over Flow");
                System.exit(1);
            }
        }

        //Function to remove an element from top of the stack1.
        int pop1()
        {
             if (top1>=0)
             {
                 int x=arr[top1];
                  top1--;
                 return x;
             }else{
                 System.out.println("Stack Under Flow");
                 System.exit(1);
             }
             return -1;
        }

        //Function to remove an element from top of the stack2.
        int pop2()
        {
            if (top2< cap)
            {
                int x=arr[top2];
                top2++;
                return x;
            }else{
                System.out.println("Stack Under Flow");
                System.exit(1);
            }
            return -1;
        }

    public static void main(String[] args) {
        TwoStackArray ts=new TwoStackArray(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from stack1 is: " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack2 is: " + ts.pop2());

    }

}

