package DSA;

public class SingleLinkedListP1 extends Node{
    public static void main(String[] args) {
             SingleLinkedListP1 s2 = new SingleLinkedListP1();
             s2.addFirst("First");
             s2.addLast("This");
             s2.addLast("is");
             s2.addLast("a");
             s2.printList();
             System.out.println();
             System.out.println(" Size is="+s2.getSize());
             System.out.println();
             s2.addLast("list");
             s2.addLast("End");
             s2.printList();
             System.out.println();
             System.out.println(s2.getSize());
             s2.delFirst();
             s2.printList();
             System.out.println();
             s2.delLast();
             s2.printList();
             System.out.println();
             s2.reverseLL();
             s2.printList();
    }


}
