public class Main {
    public static void main(String[] args) {
    Student[] students = new Student[4];
    Student student1 = new Student("Lev","Yashin","Java",5.0);
    Student student2 = new Student("Aleksandr","Mostovoi","Java", 4.2);
    Aspirant aspirant1 = new Aspirant("Andrey","Arshavin", "Java",  5.0,true);
    Aspirant aspirant2 = new Aspirant("Igor","Zabalotnyi","Java", 4.0,false);

    students[0] = student1;
    students[1] = student2;
    students[2] = aspirant1;
    students[3] = aspirant2;


        System.out.println("Студент: " + student1.getFirstName() +  " " + student1.getLastName());
    student1.getScholarship();
        System.out.println("Студент: " + student2.getFirstName() + " " +  student2.getLastName());
    student2.getScholarship();
        System.out.println("Аспирант: " + aspirant1.getFirstName() + " " + aspirant1.getLastName());
    aspirant1.getScholarship();
        System.out.println("Аспирант: " + aspirant2.getFirstName() + " " +  aspirant2.getLastName());
    aspirant2.getScholarship();

        System.out.println();
    Student.searchByStudentName(students, "Lev");

        System.out.println();
    Student.newElder(students, "Lev");
    }
}
