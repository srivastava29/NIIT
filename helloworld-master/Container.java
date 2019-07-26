package container;
public class Container {
    private int length,breadth,height;
    public Container(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }
    
public void setHeight(int height) {
        this.height = height;
    }
public int volume(int length,int breadth,int height){
    
    return length*breadth*height;
}
    public int compare(Container contain3){
       int volume1=volume(length,breadth,height);
       int volume2=volume(contain3.getLength(),contain3.getBreadth(),contain3.getHeight());
       if(volume1>=volume2){
            return volume1-volume2;
       }
         return 0;
    } 

     }

