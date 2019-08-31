package assignment01;

public class SimpleDate{
  private int year;
  private int month;
  private int day;

  public int getYear(){
    return year;
  }

  public int getMonths(){
    return month;
  }

  public int getDay(){
    return day;
  }
  public static SimpleDate of(int yr, int m, int d){
    var returnValue = new SimpleDate();
    returnValue.year = yr;
    returnValue.month = m;
    returnValue.day = d;
    return returnValue;

  }
  public boolean before(SimpleDate other){
    if(this.year < other.getYear()){
      return true;
    }
    else if(this.year == other.getYear() && this.month < other.getMonths()){
      return true;
    }
    else if(this.year == other.getYear() && this.month == other.getMonths() && this.day < other.getDay()){
      return true;
    }
    else{
      return false;
    }
  }

}
