package controlselection.month;


public class DayInMonth {
    public int year;
    public String month;

     public int days(int year,String month) {
        month = month.toLowerCase();
        int monthDay;
        switch (month) {
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                monthDay = 31;
                break;
            case "április":
            case "június":
            case "szeptember":
            case "november":
                monthDay = 30;
                break;
            case "február":
                if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
                    monthDay = 29;
                    break;
                } else {
                    monthDay = 28;
                    break;
                }
            default:
                return monthDay = 0;
        }
        return monthDay;
    }

    public static void main(String[] args) {
        DayInMonth dayInMonth = new DayInMonth();
        System.out.println(dayInMonth.days(2020,"Február"));
    }







}
