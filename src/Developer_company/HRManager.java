package Developer_company;

import java.util.Arrays;

public class HRManager extends Employee{

    private JuniorDeveloper[] junior;
    private MidDeveloper[] mid;
    private SeniorDeveloper[] senior;
    public HRManager(int id, String name, JuniorDeveloper[] junior, MidDeveloper[] mid, SeniorDeveloper[] senior) {
        super(id, name);
        this.junior = junior;
        this.mid=mid;
        this.senior=senior;
    }


    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
        setSalary(50000);
    }

    public void addEmployee(int index, JuniorDeveloper jr){
        if (index < 0 ){
            System.out.println("Index can't be smaller than zero");
        }
        try {
            if (junior[index] == null){
            junior[index] = jr;
             }
            if (junior[index] != null){
                System.out.println("That index  : " + index);
             }
            else {
                System.out.println("Ilgili ındex doludur");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Invalid index : " + index);
        } catch (Exception exception){
            System.out.println("Error occured: " + exception.getMessage());
        }
    }


    public void addEmployee(int index, MidDeveloper md){
        if (index < 0 ){
            System.out.println("Index can't be smaller than zero");
        }
        try {
            if (mid[index] != null){
                System.out.println("That index  : " + index);
            }
            if (mid[index] == null){
                mid[index] = md;
            }
            else {
                System.out.println("Ilgili ındex doludur");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Invalid index : " + index);
        } catch (Exception exception){
            System.out.println("Error occured: " + exception.getMessage());
        }
    }

    public void addEmployee(int index, SeniorDeveloper sr){
        if (index < 0 ){
            System.out.println("Index can't be smaller than zero");
        }
        try {
            if (senior[index] != null){
                System.out.println("That index  : " + index);
            }
            if (senior[index] == null){
                senior[index] = sr;
            }
            else {
                System.out.println("Ilgili ındex doludur");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Invalid index : " + index);
        } catch (Exception exception){
            System.out.println("Error occured: " + exception.getMessage());
        }
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "Name= " + getName() + " "+
                "Salary= " + getSalary()+" "+
                "junior=" + Arrays.toString(junior) +" "+
                ", mid=" + Arrays.toString(mid) +" "+
                ", senior=" + Arrays.toString(senior) +" "+
                '}';
    }
}
