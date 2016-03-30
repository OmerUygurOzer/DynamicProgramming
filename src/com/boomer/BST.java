package com.boomer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Omer on 3/30/2016.
 */





public class BST {

    private Node root;


    public void add(int val){
        if(root ==null){root = new Node(val);return;}
        Node cur = root;
        while(true){
            if(val>cur.val){
                if(cur.right==null){
                  cur.right = new Node(val);
                  break;
                }else{
                    cur = cur.right;
                }
            }else if(val<cur.val){
                if(cur.left==null){
                    cur.left = new Node(val);
                    break;
                }else{
                    cur = cur.left;
                }
            }else{
                return;
            }

        }
    }


    /*
    Find the question at: https: https://www.glassdoor.com/Interview/Given-a-binary-tree-write-a-function-that-prints-all-of-the-paths-from-the-root-node-to-the-leaf-nodes-What-is-the-functi-QTN_1369968.htm
    */

    public void printPaths(){
       recursivePathPrinter(root,new ArrayList<>());
    }

    private void recursivePathPrinter(Node node,List<Integer> vals){
        System.out.println(vals+" --> "+node.val);
        List<Integer> vR = new ArrayList<>(); vR.addAll(vals); vR.add(node.val);
        List<Integer> vL = new ArrayList<>(); vL.addAll(vals); vL.add(node.val);
        if(node.left!=null)recursivePathPrinter(node.left,vL);
        if(node.right!=null)recursivePathPrinter(node.right,vR);
    }








    public class Node{
        int val;
        Node right;
        Node left;
        Node(int val){
            this.val = val;
        }
    }
}
