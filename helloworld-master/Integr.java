package wrapper;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import java.time.Local;
public class Integr implements Compare{
    private int in_wrap;
    public Integr(int in_wrap ){
        this.in_wrap=in_wrap;
    }

    public int getIn_wrap() {
        return in_wrap;
    }

    public void setIn_wrap(int in_wrap) {
        this.in_wrap = in_wrap;
    }
    
    public void compare(Integr in_wrap1)throws Greater_Excep, Lesser_excep{
        if(in_wrap1.getIn_wrap()>in_wrap){
            throw new Greater_Excep("Greater than exception");
           }
        else{
             throw new Lesser_excep("Lesser than exception");
       
    }
   }
    public void hashcode(){
         String className=this.getClass().getSimpleName();
         int value=in_wrap;
         String time_stamp=new SimpleDateFormat("yy/MM/dd_HH:mm:ss").format(Calendar.getInstance().getTime());
         System.out.println("<"+className+"> : <"+value+"> : <"+time_stamp+">");
    }
}
