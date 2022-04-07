import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class DateConversionService {
    public static List<String> convertToDay(String dates){
        List<String> days= new ArrayList<>();
        Arrays.asList(dates.split(",")).forEach(date-> {
            try {
                days.add(convert(date));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return days;
    }
    public static String convert(String date)throws Exception {
        SimpleDateFormat formatter= new SimpleDateFormat("ddMMMyyyy"); 
        Date fdate=formatter.parse(date);
        SimpleDateFormat f = new SimpleDateFormat("EEEE");
        String str = f.format(fdate);
        if(str.equals("Sunday") || str.equals("Saturday"))
            return Utils.WEEKEND;
        else
            return Utils.WEEKDAY;
    }
    
}
