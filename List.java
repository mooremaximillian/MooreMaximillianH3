/**
 * List Class to make methods to operate on the doubly linked list
 **/ 
public class List
{
  // intializes the Node head
  Node head;
 // initalizes the Node tail
  Node tail;
 
 
 public List()
   
 {
   
 }
 
 public List(Node head, Node tail)
 {
   
 }
 /**
  * Adds a new node to the head of the list
  * @param the new String that is a assigned to the node
  * @return void
  */ 
 public void addNode(String n)
 {
   if(isEmpty())
   {
     tail = new Node(n);
     head = tail;
   }
   else
   {
     tail.next = new Node(n, null, tail);
     tail = tail.next;
   }
   
 }
 
 public void alphabeticalOrder(String name)
 {
   
   
 }
 
 public void findNode(String name)
 {
   
 }
 
 public void deleteNode(String name)
 {
   
 }
 
 public void deleteList(Node node)
 {
   
 }
 /**
  * Uses while loop to go through list and count the size
  * @return the number of nodes in the list
 public int size()
 {
   int count = 0;
   Node n = head;
   while(n != null)
   {
     count ++;
     n = n.next;
   }
   return count;
 }
 /**
  * Checks if the lis is empty
  * @return false is not empty true if it is
  */ 
 public boolean isEmpty()
 {
   return head == null;
 }
  
}