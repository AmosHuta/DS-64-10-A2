

package e1;


public final class Member {
  private String firstName;
  private String lastName;
  private int age;
  private int reward;
  private int salary;
  private String Subject;
  private String house;
  private int horcrux;
  private String title;
  
  public Member (String name, String Lname, int age, String house, String title){//constructor for resident members
      
      this.firstName = name;
      this.lastName = Lname;
      this.age = age;
      this.house = house;
      this.title = title;
      
  }
  
    public Member (String name, String Lname, int age, String title){//constructor for staff members caretaker + gamekeeper
      
      this.firstName = name;
      this.lastName = Lname;
      this.age = age;
      this.title = title;
      
  }
  
    public Member (String name, String Lname, String title,int age, String subject){ //constructor for staff members
      
      this.firstName = name;
      this.lastName = Lname;
      this.age = age;
      this.Subject = subject;
      
      
      this.title = title;
      if(!"".equals(subject) && "Teacher".equals(title)) {
          if(null != subject) switch (subject) {
              case "Defence":
                  this.salary = 500;
                  break;
              case "Transfiguration":
                  this.salary = 400;
                  break;
              case "Potions":
                  this.salary = 350;
                  break;
              case "Herbology":
                  this.salary = 250;
                  break;
              case "History":
                  this.salary = 200;
                  break;
              default:
                  break;
          }
      }
      
              
      if(!"".equals(title)) {
          if("Teacher".equals(title) && "Defence".equals(subject)) this.reward = (int) ((50*this.horcrux)*0.25);
          else if("Caretaker".equals(title)) {this.reward = (65*this.horcrux);
          this.salary = 150 + 10;}
                    else if("Gamekeeper".equals(title)) {this.reward = (75*this.horcrux); this.salary= 170 +10;}

          
      }
      
  }
    
    public void addHorcrux(int val){
       this.horcrux = this.horcrux + val;
    }
    
    public int getSalary(){
        //System.out.println(this.salary);
        return this.salary;
    }
    
        public int getReward(){
        //System.out.println(this.reward);
        return this.reward;
    }
        
        
        
         public int setReward(int value, int hxNr){
        return this.reward = value * hxNr;
    }
        
        public int getHorcrux(){
            //System.out.println(this.horcrux);
            return this.horcrux;
        }
    
        public int getHoruxperTitle(String title){
            if(!"".equals(title)) {
          if("Student".equals(title) && "Slytherin".equals(house)) return 2*90;
          else if("Student".equals(title)) return 90;

          else if("Ghost".equals(title)) return 80;
          else if("Teacher".equals(title) && "Defence".equals(this.Subject))  return  (int)(50*0.25);
          else if("Caretaker".equals(title)) return 65;
          
                    else return 75;
          
      }
            return 0;
        }
        
        public void printinfo(){ 
            if(!"".equals(this.title))
            {
                
            if (null != this.title) switch (this.title) {
                    case "Student":
                    case "Ghost":
                        System.out.println(
                                this.firstName + " " + this.lastName + "(" + this.title + " of " + this.house + ", " + this.horcrux + " horuxes) : "  + this.reward + " galleons");
                        break;
                    case "Teacher":
                        System.out.println(
                                this.firstName + " " + this.lastName + "(" + this.title + " of " + this.Subject + ", " + this.horcrux + " horuxes) : "  + this.reward + " galleons");
                        break;
                    case "Gamekeeper":
                        System.out.println(
                                this.firstName + " " + this.lastName + "(" + this.title + ", " + this.horcrux + " horuxes) : "  + this.reward + " galleons");
                        break;
                    case "Caretaker":
                        System.out.println(
                                this.firstName + " " + this.lastName + "(" + this.title + ", " + this.horcrux + " horuxes) : "  + this.reward + " galleons");
                        break;
                    default:
                        break;
                }
            }
        }
        
        
         public void printSalaryinfo(){ 
            if(!"".equals(this.title))
            {
                
            if (null != this.title) switch (this.title) {
                    case "Teacher":
                        System.out.println(
                                this.firstName + " " + this.lastName + "(" + this.title + " of " + this.Subject + ") : "  + this.salary + " galleons");
                        break;
                    case "Gamekeeper":
                        System.out.println(
                                this.firstName + " " + this.lastName + "(" + this.title  + ") : "  + this.salary + " galleons");
                        break;
                    case "Caretaker":
                        System.out.println(
                                this.firstName + " " + this.lastName + "(" + this.title  + ") : "  + this.salary + " galleons");
                        break;
                    default:
                        break;
                }
            }
        }
}
