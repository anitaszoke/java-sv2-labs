package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class ExamRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exam exam = new Exam();

        System.out.println("Kérem adja meg a nevét!");
        String nameS = scanner.nextLine();

        System.out.println("Kérem adj a meg a születési idejét!");

        System.out.println("Év:");
        String yearS = scanner.nextLine();
        int year = Integer.valueOf(yearS);

        System.out.println("Hónap:");
        String monthS = scanner.nextLine();
        int month = Integer.valueOf(monthS);

        System.out.println("Nap:");
        String dayS = scanner.next();
        int day = Integer.valueOf(dayS);

        System.out.println("Kérem adja meg az irányítószámát!");
        String zipcodeS = scanner.next();
        Integer zipCode = Integer.valueOf(zipcodeS);


        System.out.println("Kérem adja meg az osztályzatai átlagát!");
        String ratingAverageS = scanner.next();
        double average = Double.parseDouble(ratingAverageS);

        LocalDate dateOfBirth = LocalDate.of(year,month,day);

        Person person = new Person(nameS,dateOfBirth,zipCode,average);
        exam.addPerson(person);

        System.out.println(exam.getPersonAdded());

    }
}
