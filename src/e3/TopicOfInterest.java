
package e3;
import java.util.*;


 class Node<E> {

   private E element;
      private E value;

   private Node<E> next;

   public Node() {
   }

   public Node(E element) {
      this.element = element;
   }

   public E getElement() {
      return element;
   }
   


   public void setElement(E element, E value) {
      this.element = element;
      this.value = value;
   }
   
      public void setElement(E element) {
      this.element = element;
      
   }

   public Node<E> getNext() {
      return next;
   }

   public void setNext(Node<E> next) {
      this.next = next;
   }
}

public class TopicOfInterest<E> {
    E topic;
    E key;
    E value;
    Node start;
    Node end;
    
    private int size;

    public TopicOfInterest(){
      HashMap<E, E> map = new HashMap<>();
      map.put(this.key = key, this.value = topic);
      
      start = new Node<>();
      end = new Node<>();
      start.setNext(end);
      start.setElement(map);
    }
    
   public boolean isEmpty() {
      return this.size == 0;
   }

    
    public void addFirst(E user, E topic) {
      Node newest = new Node();
      newest.setElement(user, topic);
      newest.setNext(start);
      start = newest;
      
      if (this.isEmpty()) {
         end = start;
      }
      
      size++;
        
    }
    
    
    public void getTopicOfInterest(){
       
        Node newest = start;
       while(newest != null) {
       System.out.println(newest.getElement());
       newest = newest.getNext();
        
       }
    }
        
    
    
}
