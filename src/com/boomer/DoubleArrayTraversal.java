package com.boomer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;


/**
 * Created by Omer on 4/1/2016.
 */

/*
  Find the question at: https://www.glassdoor.com/Interview/1-Asked-me-how-to-reverse-a-Linked-List-Recursive-Solution-Non-Recursive-Solution-edge-cases-2-Given-a-matrix-of-1s-QTN_1420448.htm
 */

public class DoubleArrayTraversal {
    /*
        A*(A star) Algorithm
     */
    public static ArrayList<Node> getShortestPath(int[][] map, int x1, int y1, int x2, int y2){

        int limX = map.length-1;
        int limY = map[0].length-1;
        PriorityQueue<Node> pather = new PriorityQueue<Node>(20,new NodeComparator());
        Node start = new Node(x1,y1,Float.MAX_VALUE);
        pather.add(start);
        Node end = null;

        Node cur;

        for(int i = 0;i<=limX ; i++){
            for (int j =0;j<=limY;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }


        while(pather.size()>0){
                cur = pather.remove();
                System.out.println(cur.h);
                System.out.println(cur.x  + "  " + cur.y);
                map[cur.x][cur.y] = -1;
                if(cur.x == x2 && cur.y== y2){
                    System.out.println("REACHED");
                    end = cur;
                    break;}
                if(cur.x>0){//left
                    if(map[cur.x-1][cur.y]!=1&&map[cur.x-1][cur.y]!=-1) {
                        float h = getDist(cur.x - 1, cur.y, x2, y2);
                        Node newN = new Node(cur.x - 1, cur.y, h);
                        newN.from = cur;
                        pather.add(newN);
                    }
                }
                if(cur.y>0){//top
                    if(map[cur.x][cur.y-1]!=1&&map[cur.x][cur.y-1]!=-1) {
                        float h = getDist(cur.x, cur.y - 1, x2, y2);
                        Node newN = new Node(cur.x, cur.y - 1, h);
                        newN.from = cur;
                        pather.add(newN);
                    }
                }
                if(cur.x<limX){//right
                    if(map[cur.x+1][cur.y]!=1&&map[cur.x+1][cur.y]!=-1) {
                        float h = getDist(cur.x + 1, cur.y, x2, y2);
                        Node newN = new Node(cur.x + 1, cur.y, h);
                        newN.from = cur;
                        pather.add(newN);
                    }
                }
                if(cur.y<limY){//bot
                    if(map[cur.x][cur.y+1]!=1&&map[cur.x][cur.y+1]!=-1) {
                        float h = getDist(cur.x, cur.y + 1, x2, y2);
                        Node newN = new Node(cur.x, cur.y + 1, h);
                        newN.from = cur;
                        pather.add(newN);
                    }
                }
                if(cur.x>0&&cur.y>0){//top-left
                    if(map[cur.x-1][cur.y-1]!=1&&map[cur.x-1][cur.y]!=-1) {
                        float h = getDist(cur.x - 1, cur.y - 1, x2, y2);
                        Node newN = new Node(cur.x - 1, cur.y - 1, h);
                        newN.from = cur;
                        pather.add(newN);
                    }
                }
                if(cur.x<limX&&cur.y>0){//top-right
                    if(map[cur.x+1][cur.y-1]!=1&&map[cur.x+1][cur.y-1]!=-1) {
                        float h = getDist(cur.x + 1, cur.y - 1, x2, y2);
                        Node newN = new Node(cur.x + 1, cur.y - 1, h);
                        newN.from = cur;
                        pather.add(newN);
                    }
                }
                if(cur.x>0&&cur.y<limY){//bot-left
                    if(map[cur.x-1][cur.y+1]!=1&&map[cur.x-1][cur.y+1]!=-1) {
                        float h = getDist(cur.x - 1, cur.y + 1, x2, y2);
                        Node newN = new Node(cur.x - 1, cur.y + 1, h);
                        newN.from = cur;
                        pather.add(newN);
                    }
                }
                if(cur.x<limX&&cur.y<limY){//bot-right
                    if(map[cur.x+1][cur.y+1]!=1&&map[cur.x+1][cur.y+1]!=-1) {
                        float h = getDist(cur.x + 1, cur.y + 1, x2, y2);
                        Node newN = new Node(cur.x + 1, cur.y + 1, h);
                        newN.from = cur;
                        pather.add(newN);
                    }
                }




        }

        ArrayList<Node> path = new ArrayList<>();
        Node itr = end;
        while (itr!=null){
            path.add(itr);
            itr=itr.from;
        }

        System.out.println(path);




        return null;
    }

    public static float getDist(int x1,int y1,int x2,int y2){
        return (float) Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
    }

    public static class NodeComparator implements Comparator<Node>{

        @Override
        public int compare(Node o1, Node o2) {
            if (o1.h < o2.h)
            {
                return -1;
            }
            if (o1.h > o2.h)
            {
                return 1;
            }
            return 0;
        }


    }

    public static class Node{
        Node from;
        float h; //heuristic
        int x;
        int y;
        Node(int x,int y,float h){
            this.x = x;
            this.y = y;
            this.h = h;
        }

        @Override
        public String toString() {
            return "["+x+","+y+"]";
        }
    }
}
