public class Main
{
  
 public static void main(String args[])
 {
   List newList = new List();
   newList.addNode("Frank");
   newList.addNode("Max");
   newList.addNode("Eli");
   newList.findNode("Frank");
   newList.iterateForward();
   newList.deleteNode("Max");
   newList.iterateBackward();
   newList.deleteList();
   newList.iterateForward();
   
   
   
   
 }
}