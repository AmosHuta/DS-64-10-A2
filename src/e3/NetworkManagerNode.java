package e3;

import java.util.*;

public class NetworkManagerNode<E> implements NetworkManager<E>{


    Node start;
    Node end;
    @Override
    public void addUser(String user, List<TopicOfInterest> topicOfInterest) {
        
      start = new Node<>();
      end = new Node<>();
      start.setNext(end);
      start.setElement(user, topicOfInterest);
       
        
    }

    @Override
    public void removeUser(String user) {

    }

    @Override
    public List<String> getUsers() {
        
        Node<TopicOfInterest> newest = start;
       while(newest != null) {
       System.out.println(newest.getElement().key);
       newest = newest.getNext();
       }
       
        return null;
    }

    @Override
    public List<network.TopicOfInterest> getInterests() {
        
        Node<TopicOfInterest> newest = start;
       while(newest != null) {
       System.out.println(newest.getElement().topic);
       newest = newest.getNext();
       }
        return null;
    }

    @Override
    public List<network.TopicOfInterest> getInterestsUser(String user) {
        
        Node<TopicOfInterest> newest = start;
       while(newest != null) {
           if(newest.getElement().key == user) {
       System.out.println(newest.getElement().topic);
              newest = newest.getNext();

           }
       newest = newest.getNext();
       }
        return null;
    }

    @Override
    public void removeInterest(String user, network.TopicOfInterest topicOfInterest) {
        Node<TopicOfInterest> newest = start;
       while(newest != null) {
           if(newest.getElement().key == user) {
               newest.getElement().topic = null;
              newest = newest.getNext();

           }
       newest = newest.getNext();
       }
    }

    @Override
    public void addInterest(String user, TopicOfInterest topicOfInterest) {
                Node<TopicOfInterest> newest = start;
       while(newest != null) {
           if(newest.getElement().key == user) {
               newest.getElement().topic = topicOfInterest;
              newest = newest.getNext();

           }
           
           else if(newest.getElement().key == null){
               newest.getElement().key = user;
               newest.getElement().topic = topicOfInterest;

           }
       newest = newest.getNext();
       }
    }
}
