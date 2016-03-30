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

    private Node linearizeNodes(Node node){
        Node itr = node;
        while(true){
            if(itr.branch!=null){
                linearizeNodes(itr.branch).next = itr.next;
                itr.next = itr.branch;
                itr.branch = null;
            }
            if(itr.next==null){
                return itr;
            }else {
                itr = itr.next;
            }
        }

    }

    public void print(){
        Node itr = head;
        while(true){
            if(itr!=null){
                System.out.print("|:"+itr.val);
                if(itr.next!=null){
                    itr = itr.next;
                }else{
                    break;
                }
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
