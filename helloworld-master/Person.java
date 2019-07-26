package Second;
public class Person {
        private String fname,lname,address;
        private String iris,gender;
        private Person father;
        private Person mother;
        
       
        public Person(String fname,String lname,String  iris,String gender, String address,Person father,Person mother){
        this.fname=fname;
        this.lname=lname;
        this.iris=iris;
        this.address=address;
        this.gender=gender;
        this.father=father;
        this.mother=mother;
        }
        public void setlast_name(String lname){
        this.lname=father.getlast_name();
        }
       
        public void setgender(String gender){
        this.gender=gender;
        }
        public void setaddress(String address){
        this.address=father.getAddress();
        }

    public String getAddress() {
        return address;
    }
    public void setmother(Person mother)
        {
        this.mother=mother;
        }
        public void setfather(Person father)
        {
        this.father=father;
        }
        public String getaddress(){
        return address;
        }
        public String getfirst_name(){
        return fname;
        }
        public String getlast_name(){
        return lname;
        }
        public String getgender(){
        return gender;
        }
        public Person getmother()
        {
        return mother;
        }
        public Person getfather()
        {
        return father;
        }
     public void chld_logic(){
	      address=father.getAddress();
               fname=fname+" "+father.lname;
               System.out.println("Name is  :   "+fname);
               System.out.println("Address is   :   "+address);
                if((father.iris.equals(mother.iris)) && (gender=="male")){
                  String ciris="blue";
                   System.out.println("The color of iris is:"+ciris);
                }
                else{
                 if(gender=="male"){
               String ciris=mother.iris;
               System.out.println("The color of iris is:"+ciris);
                 }
                 else{
                String ciris=father.iris;
                System.out.println("The color of iris is:"+ciris);
                 }
                }
}
 
    }

   /*void setiris(String father_iris) {
        this.father_iris=father_iris; //To change body of generated methods, choose Tools | Templates.
    }

   void setaddress(String address) {
        this.address=address; //To change body of generated methods, choose Tools | Templates.
    }

   void setc_gender(char child_gender) {
       this.child_gender=child_gender; //To change body of generated methods, choose Tools | Templates.
    }

    void setchild_first_name(String cfirst_name) {
        this.cfirst_name=cfirst_name; //To change body of generated methods, choose Tools | Templates.
    }*/

 
          


   
  
                
       
	


    

