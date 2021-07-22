package sg.edu.rp.c346.id20032316.demotodolist;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ToDoItem {

    private String title;
    private Calendar data;

    public ToDoItem(String title, Calendar data) {
        this.title = title;
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    @Override
    public String toString() {
        Date date = this.data.getTime();

        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        String date1 = dateformat.format(date);

        SimpleDateFormat format2 = new SimpleDateFormat("EEEE");
        String day = format2.format(date);

        String str = date1 + " ("  + day + ") ";

        return str;
    }

    private String getDay(int day) {
        switch (day) {
            case 1:
                return "Monday";

            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";

            case 4:
                return "Thursday";

            case 5:
                return "Friday";

            case 6:
                return "Saturday";

            case 7:
                return "Sunday";

            default:
                return "";
        }
    }
}