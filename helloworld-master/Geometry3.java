package geometricalobjects;
public class Geometry3 {
    private int length,breadth,height;
      public Geometry3(int length, int breadth, int height) {
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
      
public int area_cuboid(int length,int breadth,int height){
    return(2*((length*breadth)+(breadth*height)+(height*length)));
    }
public int volume_cuboid(int length,int breadth,int height){
       return(length*breadth*height);
 }
public int area_cube(int length){
    return(6*(length*length));
}
public int volume_cube(int length){
  return(length*length*length);
}
}
