package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
    private List<Double> runningKm = new ArrayList<>();
    private String name;

    public Run(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Double> getRunningKm() {
        return runningKm;
    }

    public void addRun(double km) {
        runningKm.add(km);
    }

    public String printFormattedRunText() {
        LocalDate localDate = LocalDate.now();
        int runCount = runningKm.size();
        String dailytext = String.format("Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d futásod.", getName(),localDate.toString(),runCount);
        double km = runningKm.get(runningKm.size()-1);
        String dailytext2 = String.format ("Most %f km-t futottál. Csak így tovább!",km);
        return dailytext +" "+ dailytext2;
    }

    public static void main(String[] args) {
        Run run = new Run("Aladár");
        run.addRun(12.5);
        run.addRun(5.5);
        System.out.println(run.printFormattedRunText());
    }
}
