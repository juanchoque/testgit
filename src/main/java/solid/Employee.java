package solid;

public class Employee extends Person {
    private String ci;

    public Employee(Integer id, String name, String lastname, String ci) {
        super(id, name, lastname);
        this.ci = ci;
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    public void specialPrint() {
        System.out.println("Esta es un pruebita");
    }
}
