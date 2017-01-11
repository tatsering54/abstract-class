abstract class calcArea {
    abstract void findTriangle(double b, double h);
    abstract void findRectangle(double l, double b);
    abstract void findSquare(double s);
    abstract void findCircle(double r);
}
 
class findArea extends calcArea {
 
    void findTriangle(double b, double h)
    {
        double area = (b*h)/2;
        System.out.println("Area of Triangle: "+area);
    }
 
    void findRectangle(double l, double b)
    {
        double area = l*b;
        System.out.println("Area of Rectangle: "+area);
    }
     
    
     
    void findCircle(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of Circle: "+area);
    }
}
         
class areafd {
    public static void main(String args[])
    {
        double l, b, h, r, s;
        findArea area = new findArea();
        
 
        System.out.print("\nEnter Base & Vertical Height of Triangle: ");
        b = Double.parseDouble(System.console().readLine());
        h = Double.parseDouble(System.console().readLine());
        area.findTriangle(b, h);
 
        System.out.print("\nEnter Length & Breadth of Rectangle: ");
        l = Double.parseDouble(System.console().readLine());
        b = Double.parseDouble(System.console().readLine());
        area.findRectangle(l, b);
 
       
        System.out.print("\nEnter Radius of Circle: ");
        r = Double.parseDouble(System.console().readLine());
        area.findCircle(r);
    }
}   