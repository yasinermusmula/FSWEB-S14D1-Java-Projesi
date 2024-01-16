package Developer_company;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("Mid Developer starts to working");
        setSalary(50000);
    }
}
