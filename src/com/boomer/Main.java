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

            //bst.printPaths();

            System.out.println(bst.LCA(16,32));
            */

            /*
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

            //recursiveLinkedListD.linearize();
            recursiveLinkedListD.print();

            System.out.println("");
            recursiveLinkedListD.linearize();

            recursiveLinkedListD.print();
            */

            /*
            AnagramFinder anagramFinder = new AnagramFinder();

            anagramFinder.add("star");
            anagramFinder.add("dog");
            anagramFinder.add("car");
            anagramFinder.add("rats");
            anagramFinder.add("arc");

            System.out.println(anagramFinder.findAnagrams());
            */
            /*
            int[] vals = new int[]{0,4,5,3,1,0,7,5,1,0,9,0,1,3,0,7};
            MoveZeros.process(vals);
            */


           int[] ar1 = new int[]{0,2,4,6,8,10};
           int[] ar2 = new int[]{1,3,5,7,9,11};

            ArrayMerger.mergeTwoArrays(ar1,ar2);


    }
}
