package e3;

import java.util.List;

public class NetworkManagerMatrix<E> implements NetworkManager<E>{
    int CAPACITY = 100;
    E userMatrix[][] = (E[][])new Object[CAPACITY][CAPACITY];
    @Override
    public void addUser(String user, List<TopicOfInterest> topicOfInterest) {
      //puut code here

    }

    @Override
    public void removeUser(String user) {

    }

    @Override
    public List<String> getUsers() {
        return null;
    }

    @Override
    public List<network.TopicOfInterest> getInterests() {
        return null;
    }

    @Override
    public List<network.TopicOfInterest> getInterestsUser(String user) {
        return null;
    }

    @Override
    public void removeInterest(String user, network.TopicOfInterest topicOfInterest) {

    }

    @Override
    public void addInterest(String user, network.TopicOfInterest topicOfInterest) {

    }
}
