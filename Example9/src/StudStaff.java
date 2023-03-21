public class StudStaff extends Human implements IStaff, IStudent{
    private int salary;
    private int payment;

    public StudStaff(int tSalary, int tPayment, String tSurname) {
        salary = tSalary;
        payment = tPayment;
        setSurname(tSurname);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int tSalary) {
        salary = tSalary;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int tPayment) {
        payment = tPayment;
    }

    @Override
    public void setFam(String tFam) {
        setSurname(tFam);
    }

    @Override
    public String getFam() {
        return getSurname();
    }
}
