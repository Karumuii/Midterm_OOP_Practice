package FirstPack;

public class Student {
   private String stud_name;
   private int stud_id;
   private int grade;
   
   
   public Student(String stud_name, int stud_id, int grade){
     setName(stud_name);
     setID(stud_id);
     setGrade(grade);
   }
   
   // Getter:
   
   public String getName(){
       return stud_name;
   }
   
   public int getID(){
       return stud_id;
   }
   
   public int getGrade(){
       return grade;
   }
   
   
   // Setter
   
   void setName (String stud_name){
       this.stud_name = stud_name;
   }
   
    void setID (int stud_id){
       this.stud_id = stud_id;
   }
    
    void setGrade (int grade){
       this.grade = grade;
   }
  
    void display(){
        System.out.println("=========== Results ==============");
        System.out.println("Name: " + stud_name);
        System.out.println("ID: " + stud_id);
        System.out.println("Grade: " + grade);
    }
    
}




