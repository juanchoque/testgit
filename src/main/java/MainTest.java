import solid.Employee;
import solid.Person;

public class MainTest {
    public static void main(String... args){
        System.out.println("this a test");

        Person employee = new Employee(1, "juan", "datos", "1111111");

        employee.print();
        employee.specialPrint();

        //this kis may first change
        //new line

        /*Mobility mobility = new Mobility();
        mobility.setId(1);
        mobility.setColor("red");

        Car car = new Car();
        car.setId(2);
        car.setWheel(4);
        car.setColor("blue");

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setId(3);
        motorcycle.setWheel(2);
        motorcycle.setColor("orange");

        Mobility mobility1 = new Car();
        mobility1.setId(2);
        mobility1.setColor("other color");
        ((Car) mobility1).setWheel(4);

        Mobility mobility2 = new Motorcycle();

        System.out.println(">>" + car.getId());
        System.out.println(">>" + car.getWheel());

        System.out.println(">ID>" + mobility.getId());
        System.out.println(">COLOR>" + mobility.getColor());*/

    }
}
