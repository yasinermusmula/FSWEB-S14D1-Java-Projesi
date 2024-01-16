package Developer_company;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("Junior Developer starts to working");
        setSalary(20000);
    }


}
