package wrapper;
public class IntegrDriver {
    public static void main(String[] args){
    Integr i1=new Integr(40);
    Integr i2=new Integr(20);
    i1.hashcode();
    i2.hashcode();
    try{
    i1.compare(i2);
    }
    catch(Exception e){
    System.out.println(e);
    }
    finally{
    System.out.println("Fished_problem_3");
    }
    }
}
