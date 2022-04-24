public class Date {

  public static void main(String[] args) {
   String day = "Sunday";
    String date = "26";
    String month = "February";
    String year = "2022";
    String space = " ";
    String fullDateAmerican = day + space + month + space + date + space + year;
    String fullDateEuropean = day + space + date + space + month + space + year;
    System.out.println(fullDateEuropean);
    
    }
}