package Developer_company;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("Sebior Developer starts to working");
        setSalary(90000);
    }


}
