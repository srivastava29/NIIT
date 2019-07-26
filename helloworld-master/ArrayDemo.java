package array;
import java.util.*;
import java.lang.Math.*;
public class ArrayDemo {
    public static void main(String[]args){
     List<Integer> array = new ArrayList<Integer>();
      List<Integer> array1 = new ArrayList<Integer>();
      array.add(10);
      array.add(12);
      array.add(-400);
      array.add(-500);
      array.add(300);
     for(int i=0;i<4;i++){
      if(array.get(i)<0){
     int b= -(Math.abs((array.get(i)-array.get(i+1))));
     array1.add(b);   
      }
     else{
      int b=Math.abs((array.get(i)-array.get(i+1)));   
      array1.add(b);   
      }
     
     }
        System.out.println(array1);
    }
    
}
