
package e1;


import e1.Member;

public class School {
    
    Member[] m;
    int maxSize;
    int nrElements;
    
    public School(int lng){
        maxSize = lng;
        m = new Member[maxSize];
        nrElements = 0;
    }

    public void add(Member a){
        if(nrElements<=maxSize){
            m[nrElements] = a;
            nrElements++;
            
        }
        
    }
    
    public String printRewards(){
        int total = 0;
        for(int i=0; i < nrElements; i++){
            m[i].printinfo();
            total += m[i].getReward();
        }
        return "The total reward for Hogwarts School is " + total + " galleons";
    }
    
        public String printSalaries(){
        int total = 0;
        for(int i=0; i < nrElements; i++){
            m[i].printSalaryinfo();
            total += m[i].getSalary();
        }
        return "The total payroll for Hogwarts School is " + total + " galleons";
    }
}
