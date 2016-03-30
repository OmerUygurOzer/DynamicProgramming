package com.boomer;

public class Main {

    public static void main(String[] args) {
           // KnapsackProblemSolver.solve(20,5);
           //System.out.println(IsPalindrome.check("ASDSA"));
           //System.out.println(IsPalindrome.check("asdasdsadsad"));

            /*
            BST bst = new BST(); //BST A from the Diagram posted
            bst.add(20);
            bst.add(16);
            bst.add(26);
            bst.add(18);
            bst.add(12);
            bst.add(22);
            bst.add(28);
            bst.add(13);
            bst.add(9);
            bst.add(24);
            bst.add(21);
            bst.add(27);
            bst.add(32);

            bst.printPaths();
            */

            RecursiveLinkedList recursiveLinkedListA = new RecursiveLinkedList(); //On the diagram
            recursiveLinkedListA.add(1);
            recursiveLinkedListA.add(2);

            RecursiveLinkedList recursiveLinkedListB = new RecursiveLinkedList(); //On the diagram
            recursiveLinkedListB.add(5);
            recursiveLinkedListB.add(28);
            recursiveLinkedListB.add(36);
            recursiveLinkedListB.branch(recursiveLinkedListA);
            recursiveLinkedListB.add(2);

            RecursiveLinkedList recursiveLinkedListC = new RecursiveLinkedList(); //On the diagram
            recursiveLinkedListC.add(8);
            recursiveLinkedListC.add(9);
            recursiveLinkedListC.add(17);
            recursiveLinkedListC.branch(recursiveLinkedListB);
            recursiveLinkedListC.add(16);

            RecursiveLinkedList recursiveLinkedListD = new RecursiveLinkedList(); //On the diagram
            recursiveLinkedListD.add(3);
            recursiveLinkedListD.add(5);
            recursiveLinkedListD.add(6);
            recursiveLinkedListD.add(7);
            recursiveLinkedListD.branch(recursiveLinkedListC);
            recursiveLinkedListD.add(8);
            recursiveLinkedListD.add(23);
            recursiveLinkedListD.add(6);

            recursiveLinkedListD.linearize();


    }
}
