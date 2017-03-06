/**
 * This Class defines the info in each Node as well as the operations to the list and Node
 **/

public class Node
{
  // initializes the names that will be included in lists
 private String name;
 // intializes the next node
 private Node next;
 //initializes the prev node
 private Node prev;
 
 
 //Consturctor to input a new name 
 public Node(String name)
 {
   this.name = name;
 }
 
 public Node getNext()
 {
   return next;
 }
 
 public void setNext(Node node)
 {
   this.next = node;
 }
 
 public void setPrev(Node node)
 {
   this.prev = node;
 }
 
 public void setName(String name)
 {
   this.name = name;
   
 }
 
 public String toString() {
  return " Name : "+this.name;
 }
  
                       
}