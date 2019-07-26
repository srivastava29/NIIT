
package container;
public class ContainerDriver {
    public static void main(String[] args){
     Container contain =new Container(30,20,10);
     Container contain1 =new Container(20,20,20);
     int result=contain.compare(contain1);
    System.out.println(result);
    }
    
}
