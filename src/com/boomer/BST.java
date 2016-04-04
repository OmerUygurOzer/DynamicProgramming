package com.boomer;

import java.util.*;

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


    /*
    Find the question at: https://www.glassdoor.com/Interview/Algorithm-question-was-how-to-find-the-lowest-common-ancestor-for-a-binary-tree-Then-find-a-solution-that-is-linear-for-s-QTN_570882.htm
     */
    public int LCA(int v1,int v2){
        int lca = root.val;
        Node cur = root;
        while(true){
            if(v1>cur.val && v2>cur.val){
                if(cur.right==null){

                    break;
                }else{
                    cur = cur.right;
                }
            }else if(v1<cur.val && v2<cur.val){
                if(cur.left==null){

                    break;
                }else{
                    cur = cur.left;
                }
            }else if ((v1<cur.val && v2>cur.val)||(v2<cur.val && v1>cur.val)||(v1==cur.val)||(v2==cur.val)){
                return cur.val;
            }

        }
        return lca;
    }


    /*
    Find the question at : https://www.glassdoor.com/Interview/Facebook-Software-Engineer-Interview-Questions-EI_IE40772.0,8_KO9,26_IP2.htm
     */

    /*
    Refer to BST - B on the notes
     */
    public static boolean doesHaveSame(BST bst1,BST bst2){




        return false;
    }

    /*
      Find the question at : https://www.glassdoor.com/Interview/Behavior-past-project-and-what-s-the-funest-thing-in-it-1-Erase-duplicate-in-an-unsorted-array-2-Average-value-by-lev-QTN_1409825.htm
     */
    public void verticalOrderSum(){
        HashMap<Integer,Integer> vSum = new HashMap<>();
        processNodeVOS(root,vSum,0);
        System.out.println(vSum);
    }

    //Complimentary to above question/method
    private void processNodeVOS(Node n, HashMap<Integer,Integer> vSum,int distance){
        if(vSum.get(distance)==null){vSum.put(distance,0);}
        vSum.put(distance,vSum.get(distance)+n.val);
        if(n.left!=null){processNodeVOS(n.left,vSum,distance-1);}
        if(n.right!=null){processNodeVOS(n.right,vSum,distance+1);}
    }

    /*
      Find the question at : https://www.glassdoor.com/Interview/Behavior-past-project-and-what-s-the-funest-thing-in-it-1-Erase-duplicate-in-an-unsorted-array-2-Average-value-by-lev-QTN_1409825.htm
     */

    public void printAverageValueByLevel(){
        HashMap<Integer,int[]> levelDeets = new HashMap<>();
        processNodeAvg(root,levelDeets,0);
        int[] d;
        for(Integer key: levelDeets.keySet()){
            d = levelDeets.get(key);
            int lvl = key+1;
            System.out.print("Level:"+lvl + "   Avg:"+d[1]/d[0]);
            System.out.println();
        }

    }

    //Complimentary to above question/method
    private void processNodeAvg(Node n,HashMap<Integer,int[]> lDeets,int level){
        if(lDeets.get(level)==null){
            int[] d = new int[2];
            d[0]=0;
            d[1]=0;
            lDeets.put(level,d);
        }

        lDeets.get(level)[0]++;
        lDeets.get(level)[1]+=n.val;
        if(n.left !=null)processNodeAvg(n.left,lDeets,level+1);
        if(n.right!=null)processNodeAvg(n.right,lDeets,level+1);
    }

    //Level Order, BFS
    public void levelOrderTraversal(){
        Queue queue = new LinkedList<>();
        queue.add(root);

        Node cur;

        while(!queue.isEmpty()){
             cur = (Node) queue.remove();
             System.out.println(cur.val);
             if(cur.left!=null){queue.add(cur.left);}
             if(cur.right!=null){queue.add(cur.right);}
        }

    }

    //Non recursive DFS,In Order
    public void inOrderTraverse(){
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<Node>();
        Node node = root;


        while (node != null) {
            stack.push(node);
            node = node.left;
        }

        while (stack.size() > 0) {

            node = stack.pop();
            System.out.print(node.val + " ");
            if (node.right != null) {
                node = node.right;


                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
    }


    /*
    Find the question at : https://www.glassdoor.com/Interview/Verify-a-binary-search-tree-QTN_1369405.htm
     */
    public boolean isBST(){
        return bstChecker(Integer.MIN_VALUE,Integer.MAX_VALUE,root);
    }

    //Complimentary to the above question/method
    private boolean bstChecker(int min,int max,Node node){
        if(node == null){
            return true;
        }

        if(node.val < min || node.val > max){
            return false;
        }

        return bstChecker(min,node.val-1,node.left)&&bstChecker(node.val+1,max,node.right);
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
