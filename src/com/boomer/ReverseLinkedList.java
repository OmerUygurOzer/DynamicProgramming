package com.boomer;

import java.util.Stack;

/**
 * Created by Omer on 3/30/2016.
 */
public class ReverseLinkedList {

    Node head;
    Node cur;

    public void add(int val){
        if(head==null){
            head = new Node(val);
            cur = head;
            return;
        }

        cur.next = new Node(val);
        cur = cur.next;
    }

    public void reverseList(){
        Node itr = head;
        Node ptr = head.next;
        head.next = null;
        Node temp;
        while(true){
            if(ptr.next==null){
                head=ptr;
                head.next=itr;
                break;
            }
            temp = ptr.next;
            ptr.next = itr;
            itr=ptr;
            ptr=temp;

        }
    }

    /*
    Find the question at: https://www.glassdoor.com/Interview/Create-a-linked-list-with-3-char-A-B-C-in-it-and-print-the-list-in-reverse-QTN_1329919.htm
     */
    public void printInReverse(){
        Stack<Node> nodes = new Stack<>();
        Node itr = head;
        while(true){
            nodes.push(itr);
            itr = itr.next;
            if(itr==null){break;}
        }

        while(!nodes.isEmpty()){
            System.out.print(nodes.pop().val+"-");
        }

    }

    public void print(){
        Node itr = head;
        while(true){
            System.out.println(itr.val);
            itr = itr.next;
            if(itr==null){break;}

        }
    }



    public class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
}
