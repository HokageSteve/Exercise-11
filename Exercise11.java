import java.util.Scanner;

/*
*Steven Allen
*ITSE-1302
*3/9/2017
*Exercise 11
*Code creates personal profile.
*/

public class Person {
    private String strFirstName = "";
    private String strLastName = "";
    private String strGender = "";
    private char chrGender = ' ';
    private int intBirthDay = 4;
    private int intBirthMonth = 6;
    private int intBirthYear = 1991;

    Scanner objInput = new Scanner(System.in);

    public void setFirstName(String pstrFirstName) {
        strFirstName = pstrFirstName;
    }
    public String getFirstName() {
        System.out.println("Enter first name: ");
        strFirstName = objInput.next().toUpperCase();
        return strFirstName;
    }
    public void setLastName(String pstrLastName) {
        strLastName = pstrLastName;
    }
    public String getLastName() {
        System.out.println("Enter last name: ");
        strLastName = objInput.next().toUpperCase();
        return strLastName;
    }
    public void setBirthDay(int pintBirthDay){
        intBirthDay = pintBirthDay;
    }

    public int getBirthDay(){
        System.out.println("Enter birthday: ");
        intBirthDay = objInput.nextInt();
        return intBirthDay;
    }

    public void setBirthMonth(int pintBirthMonth){
            intBirthMonth = pintBirthMonth;
    }

    public int getBirthMonth() {
            System.out.println("Enter birth month: ");
            intBirthMonth = objInput.nextInt();
      return intBirthMonth;
    }

    public void setBirthYear(int pintBirthYear) {
        intBirthYear = pintBirthYear;
    }

    public int getBirthYear(){
        System.out.println("Enter birth year: ");
        intBirthYear = objInput.nextInt();
        return intBirthYear;
    }n
    public void setBirthTotal(int pintBirthDay, int pintBirthMonth, int pintBirthYear){
        this.setBirthDay(pintBirthDay);
        this.setBirthMonth(pintBirthMonth);
        this.setBirthYear(pintBirthYear);
    }

    public String getBirthTotal(){
        return this.getBirthMonth() + "/" + getBirthDay() + "/" + getBirthYear();
    }
    public void setGender(String pstrGender){
        strGender = pstrGender;
    }

    public String getGender(){
        System.out.println("Type \"M\" for male, \"F\" for female, or \"N\" for neutral: ");
        strGender = objInput.next().toUpperCase();
        chrGender = strGender.charAt(0);
        if(chrGender == 'M'){
            return "Male";
        } else if (chrGender == 'F'){
            return "Female";
        } else
            return "Neutral";
    }
    public String getStats() {
        return "\n" +
                "Your name: " + this.getFirstName() + this.getLastName() + "\n" +
                "Your birthday: " + this.getBirthTotal() + "\n" +
                "Your gender: " + this.getGender();
    }

    public void setStats(String pstrFirstName,
                         String pstrLastName) {
        this.setFirstName(pstrFirstName);
        this.setLastName(pstrLastName);
        this.setBirthTotal(intBirthDay, intBirthMonth, intBirthYear);
        this.setGender(strGender);
    }


}