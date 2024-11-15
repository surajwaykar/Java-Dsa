package Linklist;

import java.util.Scanner;
  
 class SinglyLinklist{
    static class Node {
         private int data;
         private Node next;

         public Node (){
            data=0;
            next =null;
         }
         public Node (int val){
            data =val;
            next =null;

         }

    }

    private Node head;
    public SinglyLinklist(){
        head =null;
    }
 }

public class SinglyLinklistMain{

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println(
                "\n0. Exit\n1. Display\n2. Add First\n3. Add Last\n4. Add At Pos\n5. Del First\n6. Del Last \n7. Det At Pos \n8. Del All\n Enter the Choice");
             choice = sc.nextInt();
             switch (choice) {
                case 1:
                    
                    break;

                  case 2:
                    
                    break;
                    case 3:
                    
                    break;
                    case 4:
                    
                    break;
                    case 5:
                    
                    break;
                    case 6:
                    
                    break;
                    case 7:
                    
                    break;
                    case 8:
                    
                    break;
             
                
             }

        }
        while(choice != 0);
        
    }
    
}
