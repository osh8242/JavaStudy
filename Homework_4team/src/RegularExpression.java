import java.util.regex.Pattern;

public class RegularExpression {

   public static void main(String[] args) {
      String patternPhone = "(^01([0-9]))([.-]?)(\\d{3}|\\d{4})([.-]?)(\\d{4})"; // 휴대폰 번호
      String phoneNumber = "012-1123-0000"; 

      boolean result1 = Pattern.matches(patternPhone, phoneNumber);
      System.out.println(result1); 

      
      String PatternJumin = "^[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|[3][01])[-][1-4]\\d{6}"; // 주민번호([0-1])
      String Jumin = "960230-1199999";

      boolean result2 = Pattern.matches(PatternJumin, Jumin);
      System.out.println(result2); 
      
      String PatternEmail = "^[a-z0-9]+[@][a-zA-Z0-9.-]+$"; // 
      String email = "tjrwls3394@daum.co.kr";

      boolean result3 = Pattern.matches(PatternEmail, email);
      System.out.println(result3);
      
      String PatternAddressNum = "^[0-9]{3}[-][0-9]{3}|[0-9]{5}"; // 
      String addressNum = "020-437";

      boolean result4 = Pattern.matches(PatternAddressNum, addressNum);
      System.out.println(result4);
   }

}