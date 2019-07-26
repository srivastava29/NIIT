
package geometricalobjects;
public class GeometryDriver {
    public static void main(String [] args){
    Geometry2 geo2=new Geometry2(10,20);
    Geometry3 geo3=new Geometry3(10,20,30);
    int area_square=geo2.area_square(geo2.getLength());
    int area_rect=geo2.area_rect(geo2.getLength(),geo2.getBreadth());
    int area_cuboid=geo3.area_cuboid(geo3.getLength(), geo3.getBreadth(), geo3.getHeight());
    int area_cube=geo3.area_cube(geo3.getLength());
    int volume_cuboid=geo3.volume_cuboid(geo3.getLength(), geo3.getBreadth(), geo3.getHeight());
    int volume_cube=geo3.volume_cube(geo3.getLength());
    System.out.println("area of rectangle and squre is :"+area_rect+" "+area_square);
    System.out.println("area of cuboid and cube is :"+area_cuboid+" "+area_cube);
    System.out.println("volume of cuboid and cube is :"+volume_cuboid+" "+volume_cube);
    }
    
}
