public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private static String isElder;
    private double averageMark;

    public Student(String firstName, String lastName,
                   String group,
                   double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getIsElder() {
        return isElder;
    }

    public void setIsElder(String isElder) {
        this.isElder = isElder;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public void getScholarship() {
        if (getAverageMark() == 5) {
            System.out.println("Сумма стипендии 1000 сом");
        } else {
            System.out.println("Сумма стипендии 800 сом");
        }
    }

    public static void searchByStudentName(Student[] students, String firstName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName)) {
                System.out.println("Студент с именем " + firstName + " найден");
            }
            return;
        }
    }

    public static boolean newElder(Student[] students, String nameStudent){
        for (Student student : students) {
            if (student.getFirstName().equals(nameStudent)) {
                System.out.println("Новый староста: ");
                isElder = student.getFirstName();
                return true;
            }
        }
        return false;
    }
}

