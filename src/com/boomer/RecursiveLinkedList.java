package com.boomer;

/**
 * Created by Omer on 3/30/2016.
 */


/*
  Find the question at: https: www.glassdoor.com/Interview/Given-a-linked-list-where-each-node-s-value-can-itself-be-a-linked-list-a-recursive-linked-list-write-a-function-that-f-QTN_1369969.htm
 */

public class RecursiveLinkedList {

    public Node head;
    public Node cur;

    public void add(int val){
        if(head==null){head = new Node(val); cur = head; return;}
        cur.next = new Node(val);
        cur = cur.next;
    }

    public void branch(RecursiveLinkedList list){
        cur.branch = list.head;
    }

    public void linearize(){
            linearizeNodes(head);
    }

    private void linearizeNodes(Node node){
        Node itr = node;
        while(true){
            System.out.print(itr.val);
            if(itr.branch!=null){linearizeNodes(itr.branch);}
            if(itr.next==null){
                itr.next = node.next;
                node.next = node.branch;
                break;
            }else {
                itr = itr.next;
            }
        }

    }


    public class Node{
        int val;
        Node next;
        Node branch;
        Node(int val){
            this.val = val;
        }
    }
}
