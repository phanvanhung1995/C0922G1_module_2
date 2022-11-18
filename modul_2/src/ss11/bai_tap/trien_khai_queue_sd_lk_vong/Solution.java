package ss11.bai_tap.trien_khai_queue_sd_lk_vong;

import java.util.*;

public class Solution {

    static   void enQueue(Queue q, int value) {
        Node temp = new Node() ;
        temp.data =value ;
        if (q.front == null) {
            q.front = temp ;
        } else {
            q.rear.link = temp ;
        }
        q.rear = temp ;
        q.rear.link = q.front ;
    }

    static int deQueue(Queue q) {
        if (q.front== null) {
            System.out.println("null");
        }

        int value ;
        if (q.front == q.rear) {
            value = q.front.data ;
            q.front = null ;
            q.rear = null ;
        } else {
            Node teamp = q.front ;
            value = teamp.data ;
            q.front = q.front.link ;
            q.rear.link = q.front ;
        }
        return value ;
    }

    static void displayQueue(Queue q) {
        Node  temp = q .front;
        System.out.printf(" các phần tử trong Queue là : ");
        while (temp .link != q .front) {
            System.out.printf("%d ", temp .data);
            temp = temp .link;
        }
        System.out.printf("%d", temp .data);
    }

    public static void main(String[] args) {
        Queue q = new Queue() ;

       enQueue(q, 12);
        enQueue(q, 5);
        enQueue(q, 29);

        displayQueue(q);
        System.out.println();

       deQueue(q) ;
        System.out.print ("sau khi xóa" );
        displayQueue(q);
        System.out.println();
        enQueue(q, 9);
        enQueue(q, 20);
        System.out.print("sau khi thêm");
        displayQueue(q);
    }
}
