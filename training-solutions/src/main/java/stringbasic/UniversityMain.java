package stringbasic;

public class UniversityMain {
    public static void main(String[] args) {
        University university = new University();
        Person person = new Person("Örs","ors@gmail.com","92546789","17758975-12345678","+36998767895");
        Person person2 = new Person("Kata","kata@gmail.com","85214536","12345678-87654321","+36992587413");
        Person person3 = new Person("Kata","kata@gmail.com","85214536","12345678-87654321","+36992587413");
        Student student = new Student(person,"QW23RT","123456");
        Student student2 = new Student(person2,"HG26SC","654321");
        Student student3 = new Student(person3,"HG26SC","654321");
        university.addStudent(student);
        university.addStudent(student2);
        university.addStudent(student3);

        System.out.println(university.areEquel(student,student2));

        System.out.println(university.areEquel(student2,student3));


    }
}
