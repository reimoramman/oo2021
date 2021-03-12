
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
        String dob = Integer.parseInt(code.substring(5,7)) + "." + Integer.parseInt(code.substring(3,5)) + "." + getFullYear();
      return dob;
    }

    @Override
    public String getAge() {
      return null;
    }
    
  }