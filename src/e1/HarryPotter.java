

package e1;



public class HarryPotter {


    
    public static void main(String[] args) {
        
        Member m1 = new Member("Hermione", "Granger", 18, "Gryffindor", "Student");
        Member m2 = new Member("Severus", "Snape", "Teacher", 48, "Potions");
        Member m3 = new Member("Argus", "Filch", 20 ,"Caretaker");

        //m2.getSalary();

        m1.addHorcrux(2);
                m2.addHorcrux(2);

        m1.getHorcrux();
        
        m1.setReward(m1.getHoruxperTitle("Student"), m1.getHorcrux());
        m2.setReward(m1.getHoruxperTitle("Teacher"), m2.getHorcrux());

        m1.getReward();
       
      // m1.printinfo();
       
       School s = new School (3);
       s.add(m1);
       s.add(m2); 
       s.add(m3);

       
       System.out.println(s.printRewards());
       System.out.println();
       
       System.out.println(s.printSalaries());

    }
}
