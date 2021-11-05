package controlselection.greetings;

public class Greetings {

    public String greetings(int hours, int mins) {
        int hour = 60;
        if (hours >= 5 && hours < 9) {
            return "Jó reggelt";
        } else if (hours >= 9 && hours < 18) {
            return "Jó napot";
        } else if (hours == 18 && mins < 30) {
            return "Jó napot";
        } else if (hours == 18 && mins >= 30) {
            return "Jó estét";
        } else if (hours < 20 && hours > 18) {
            return "Jó estét";
        } else {
            return "Jó éjszakát";
        }
    }

    public static void main(String[] args) {
        Greetings greetings = new Greetings();

        System.out.println(greetings.greetings(5, 00));

    }
}
