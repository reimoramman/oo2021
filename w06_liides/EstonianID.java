import java.time.Year;

public class EstonianID implements PersonalCodeBehavior {
    private String code;
  
    public EstonianID(String code){
      this.code = code;
    }
  
    @Override
    public String getGender() {
      int gender = Integer.parseInt(code.substring(0, 1));
  
      if (gender % 2 == 0){
        return "Female";
      } else {
        return "Male";
      }
    }
  
    @Override
    public int getFullYear() {
        int FullYear = 1700 + Math.round((Integer.parseInt(code.substring(0,1))+1)/2)*100 + Integer.parseInt(code.substring(1,3));
      return FullYear;
    }
  
    @Override
    public String getDOB() {
      String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
              "October", "November", "December" };
      int month = Integer.parseInt(code.substring(3, 5));
      int day = Integer.parseInt(code.substring(5, 7));
      return day + ". " + months[month - 1] + ", " + getFullYear();
  }

    public int[] getDate() {
      int day = Integer.parseInt(code.substring(5, 7));
      int month = Integer.parseInt(code.substring(3, 5));
      int[] data = {month, day };
      return data;
  }

    @Override
    public Integer getAge() {
      Integer age = Year.now().getValue() - getFullYear();
      return age;
    }
    
  }