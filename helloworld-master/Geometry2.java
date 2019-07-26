package geometricalobjects;
 class Geometry2 {
    private int length,breadth;
public Geometry2(int length,int breadth){
  this.length=length;
  this.breadth=breadth;
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
public int area_rect(int length,int breadth){
  
    return(length*breadth);
  }   
     public int area_square(int length){
         return(length*length);
     }
}
