public class Test {
    public static void main(String[] args) {
        IHuman[] array = new IHuman[3];

        array[0] = new Staff(50000, "Кондратьев");
        array[1] = new Student(4600, "Конюхов");
        array[2] = new StudStaff(30000, 5000, "Двойников");

        //вывод информации
        for (IHuman hum : array) {
            if (hum instanceof Staff) {
                System.out.println("Работник " + ((Staff) hum).getSurname() +
                        " с зарплатой: " + ((Staff) hum).getSalary());
            } else if (hum instanceof Student) {
                System.out.println("Студент " + ((Student) hum).getSurname() +
                        " со стипенидей: " + ((Student) hum).getPayment());
            } else {
                System.out.println("Студент и работник " + ((StudStaff)hum).getSurname() +
                        " с зарплатой " + ((StudStaff) hum).getSalary() +
                        " и со стипендией " + ((StudStaff) hum).getPayment());
            }
        }

        //изменение данных
        for (IHuman hum : array) {
            if (hum instanceof Staff) {
                ((Staff) hum).setSurname("Симонов");
                ((Staff) hum).setSalary(55000);
            } else if (hum instanceof Student) {
                ((Student) hum).setSurname("Сучев");
                ((Student) hum).setPayment(10000);
            } else {
                ((StudStaff)hum).setSurname("Тройнов");
                ((StudStaff) hum).setPayment(6000);
                ((StudStaff) hum).setSalary(25000);
            }
        }

        System.out.println();
        //вывод информации
        for (IHuman hum : array) {
            if (hum instanceof Staff) {
                System.out.println("Работник " + ((Staff) hum).getSurname() +
                        " с зарплатой: " + ((Staff) hum).getSalary());
            } else if (hum instanceof Student) {
                System.out.println("Студент " + ((Student) hum).getSurname() +
                        " со стипенидей: " + ((Student) hum).getPayment());
            } else {
                System.out.println("Студент и работник " + ((StudStaff)hum).getSurname() +
                        " с зарплатой " + ((StudStaff) hum).getSalary() +
                        " и со стипендией " + ((StudStaff) hum).getPayment());
            }
        }

    }
}
