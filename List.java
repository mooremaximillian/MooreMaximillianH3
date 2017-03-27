/**
 * List Class to make methods to operate on the doubly linked list
 **/ 
public class List
{
  // intializes the Node head
   private Node head;
 // initalizes the Node tail
 private Node tail;
 
 
 public List()
   
 {
   head = null;
   tail = null;
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
 
 
 public void addAlphabetical(String n)
 {
   Node newNode = new Node(n);
   
   Node current = head;
   Node previous = null;
   
   while(current != null && n.compareTo(current.getName()) >= 0){
        previous = current;
        current = current.next;
    }

    if(previous == null){
        head = newNode;
    }else{
        previous.next = newNode;
       
    }
     newNode.next = current;
  /** if(isEmpty())
   {
     tail = new Node(n);
     head = tail;
   }
   else
   {
     while(n.compareTo(currentNode.getName()) >= 0)
       currentNode = currentNode.getNext();
   }
   currentNode.next = new Node(n);
     currentNode.next.next.prev = new Node(n);
    // tail.next = new Node(n, null, tail);
     // tail = tail.next;
   
   **/
 }
 
 
 // Issue with a node that could not be found
    public void findNode(String name){
        Node currentNode = head;
        while(currentNode.getName()!= name)
        {
            currentNode = currentNode.getNext();
            if(currentNode == null)
                System.out.println("Node not Found");
        }
        System.out.println("Node has been found!");
    }

   
   
 
 
 public boolean deleteNode(String element)
 {
   if(isEmpty())
     return false;
   
   Node target = head;
   while(target != null && !element.equals(target.name))
     target = target.next;
   
   if(target == null)
     return false;
   
   Node pred = target.prev;
   Node succ = target.next;
   
   if(pred == null)
     head = succ;
   else
     pred.next = succ;
   if(succ == null)
     tail = pred;
   else
     succ.prev = pred;
   return true;
 }
 
  public  void iterateForward(){
      
     if (this.isEmpty()) {
      System.out.println("List is empty.");
    }
    else {
      Node tmp = this.head;
      while (tmp != null) {
        System.out.println(tmp);
        tmp = tmp.getNext();
      }
      System.out.println("");
    }
  }
    
   public void iterateBackward()
   {
     if(this.isEmpty())
     {
       System.out.println("list is empty.");
     }
     else
     {
       Node tmp = this.tail;
       while(tmp!= null)
       {
         System.out.print(tmp);
         tmp = tmp.getPrev();
         System.out.println("");
       }
       System.out.println("");
     }
   }
  
        
    
   
 
   
 
 
 public void deleteList()
 {
   head = null;
   
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