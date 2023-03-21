public class Staff extends Human implements IStaff {
    private int salary;

    public Staff(int tSalary, String tSurname) {
        salary = tSalary;
        setSurname(tSurname);
    }

    @Override
    public void setFam(String tFam) {
        setSurname(tFam);
    }

    @Override
    public String getFam() {
        return getSurname();
    }

    @Override
    public void setSalary(int tSalary) {
        salary = tSalary;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
