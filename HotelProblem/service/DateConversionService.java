package service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Calendar;
import java.util.GregorianCalendar;

import utils.Utils;

import java.text.SimpleDateFormat;  
import java.util.Date;  
public class DateConversionService {
   
    public static List<String> findAlldatesBetween(String dateRange){
        String startString= dateRange.split(",")[0];
        String endString= dateRange.split(",")[1];
        List<String> dates = new ArrayList<>();
        try {
            SimpleDateFormat formatter= new SimpleDateFormat("ddMMMyyyy"); 
            Date startdate=formatter.parse(startString);
            SimpleDateFormat formatter1= new SimpleDateFormat("ddMMMyyyy"); 
            Date enddate=formatter1.parse(endString);
            getDaysBetweenDates(startdate, enddate).forEach(date->{
                dates.add(convert(date));
            });
            System.out.println(Arrays.toString(dates.toArray()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dates;
  
    }
    public static List<Date> getDaysBetweenDates(Date startdate, Date enddate)
    {
        List<Date> dates = new ArrayList<Date>();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(startdate);
        while (calendar.getTime().before(enddate))
        {
            Date result = calendar.getTime();
            dates.add(result);
            calendar.add(Calendar.DATE, 1);
        }
        return dates;
    }
    
    public static String convert(Date date){
        SimpleDateFormat f = new SimpleDateFormat("EEEE");
        String str = f.format(date);
        if(str.equals("Sunday") || str.equals("Saturday"))
            return Utils.WEEKEND;
        else
            return Utils.WEEKDAY;
    }
    
}
