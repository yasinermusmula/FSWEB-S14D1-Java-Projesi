import Developer_company.*;

public class Main {
    public static void main(String[] args) {
       Cylinder();
       Rectangle();
       Employee();
    }

    public static void Cylinder(){
        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55,7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("**************************");

    }

    public static void Rectangle(){

        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("*****************************");
    }

    public static void  Employee(){
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(1,"Yasin");
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(2,"Ahmet");
        juniorDeveloper.work();
        juniorDeveloper2.work();
        System.out.println(juniorDeveloper);
        System.out.println(juniorDeveloper2);

        MidDeveloper midDeveloper = new MidDeveloper(1,"Hande");
        MidDeveloper midDeveloper2 = new MidDeveloper(2,"Mehmet");
        System.out.println(midDeveloper);
        System.out.println(midDeveloper2);


        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(1,"Mehmet");
        seniorDeveloper.work();
        System.out.println(seniorDeveloper);

        System.out.println("**************************");

        HRManager hrManager = new HRManager(1,"Kerem",new JuniorDeveloper[5],new MidDeveloper[2],new SeniorDeveloper[1]);
        hrManager.work();
        System.out.println(hrManager);
        hrManager.addEmployee(0,juniorDeveloper);
        hrManager.addEmployee(1,juniorDeveloper2);
        hrManager.addEmployee(0,midDeveloper);
        hrManager.addEmployee(1,midDeveloper);
        hrManager.addEmployee(0,seniorDeveloper);
        System.out.println(hrManager);
    }
}