public class Student extends Human implements IStudent {
    private int payment;

    public Student(int tPayment, String tSurname) {
        payment = tPayment;
        setSurname(tSurname);
    }

    @Override
    public int getPayment() {
        return payment;
    }

    @Override
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
