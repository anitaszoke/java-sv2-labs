package controlselection.week;

public class DayOfWeeks {
    public String day;

    public String typeDay(String day) {
        day = day.toLowerCase();
        String dayType;
        switch (day) {
            case "hétfő":
                dayType = "hét eleje";
                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                dayType = "hét közepe";
                break;
            case "péntek":
                dayType = "majdnem hétvége";
                break;
            case "szombat":
            case "vasárnap":
                dayType = "hét vége";
                break;
            default:
                dayType = "ismeretlen nap";
        }
        return dayType;
    }

    public static void main(String[] args) {
        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        System.out.println(dayOfWeeks.typeDay("Zombat"));
    }
}
