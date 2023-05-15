public class Main{
    public static void main(String[] args){
        Triangle triangle=new Triangle(5,4,3,"blue",true);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.toString());
    }
}