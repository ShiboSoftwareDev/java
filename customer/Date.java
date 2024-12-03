import java.util.*;

public class Date 
{
   int day;
   String month;
   int year;

    public Date(int day, String month, int year)
        {
            this.day = day;
            this.month = month;
            this.year = year;
        }

    public int getDay()
    {
        return day;
    }
    public void setDay(int day)
    {
        this.day = day;
    }

    public String getMonth()
    {
        return month;
    }
    public void setMonth(String month)
    {
        this.month = month;
    }

    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }

    public String toString()
    {
        return Integer.toString(day) + '/' + month + '/' + Integer.toString(year);
    }
    public boolean equals(Date date)
    {
        return this.toString().equals(date.toString());
    }
}

