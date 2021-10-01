import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public Queue q = new Queue();
    public void enQueue(int data){
        Node temp = new Node(data);
        if(q.front==null&&q.rear==null){
            q.front=q.rear=temp;
        }
        else {
            temp.link=q.front;
            q.rear.link=temp;
            q.rear=temp;

        }
    }

    public  Node deQueue(){
        if(q.front==null){
            return null;
        }
        else {
            Node temp = q.front;
            q.front=q.front.link;
            q.rear.link=q.front;
            return temp;
        }
    }
    public void displayQueue(){
       Node temp = this.q.front;
       do{
           System.out.println(temp.data);
           temp=temp.link;
       }while(temp!=this.q.front);
    }

//    public void sortArray(){
//        Comparator<Node> que = new Comparator<Node>() {
//            @Override
//            public int compare(Node o1, Node o2) {
//                return o1.data> o2.data?1:-1;
//            }
//        }
//        Collections.sort(q, (Node o1, Node o2)=>{return o1.data>o2.data?1:-1});
//        Comparable
//    }
}
