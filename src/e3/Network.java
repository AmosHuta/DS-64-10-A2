package e3;
import java.util.*;


public class Network{
    String user;
    String topicOfInterest;
    NetworkManager nm;
    List a;
    public Network(NetworkManager nm) {
        this.nm = nm;
        
    }

//    private Network() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public NetworkManager getNm() {
        return nm;
    }

    public void setNm(NetworkManager nm) {
        this.nm = nm;
    }
    public void addUser(String nameuser){
        //put method
        
        nm.addUser(nameuser,a);
    }

    public static void main(String[] args) {
        
//        Network n = new Network();
//        n.setNm(new NetworkManagerMatrix());
//
//        n.setNm(new NetworkManagerNode());
          NetworkManagerNode n = new NetworkManagerNode();
          TopicOfInterest a = new TopicOfInterest();
          a.topic = "Politic";
          a.key = "user1";
          
          

    }
}
