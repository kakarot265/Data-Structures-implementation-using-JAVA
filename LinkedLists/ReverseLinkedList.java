/*-- Reversing a LinkedList using Stack --*/

import java.util.*;

public class ReverseLinkedList {

    static Node reverseLinkedList(Node head) {

        Stack<Integer> stack = new Stack<>();

        Node n = head; 

        while(n!=null){
            stack.push(n.data);
            n = n.next; 
        }

        Node newList = new Node(stack.pop());
        Node nodesNewList = newList;  

        while(!stack.isEmpty()){
            nodesNewList.next = new Node(stack.pop()); 
            nodesNewList = nodesNewList.next; 
        }

        return newList;  

    }
     
    /*-- Inputs from the main method --*/
    
    public static void main(String[] args){
        
        Node A = new Node(5);
        A.addNodeToTail(10);
        A.addNodeToTail(20);
        A.addNodeToTail(30);
        A.addNodeToTail(35);
        A.addNodeToTail(40);
        A.addNodeToTail(50);
        
        Node C = reverseLinkedList(A);
        
        while(C!=null){
            System.out.println(C.data);
            C = C.next; 
        }
    
    }
    
}

/*-- Node class Implementation --*/

class Node{
    
    int data;
    Node next; 
    
    public Node(int data){
    this.data = data;
    }
    
    public void addNodeToTail(int addData){

        Node current = this;

        while(current!=null){

            if(current.next==null){
                current.next = new Node(addData);
                break;
            }

            current = current.next;
        }

    }
    
}
