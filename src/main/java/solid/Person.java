package solid;

public abstract class Person {
    private Integer id;
    private String name;
    private String lastname;

    public Person(Integer id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public void print(){
        System.out.println("ID:" + this.id + " NAME:" + this.name + " LAST NAME:" + this.lastname);
    }

    public abstract void specialPrint();
}
