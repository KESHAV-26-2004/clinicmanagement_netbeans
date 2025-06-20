/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author LENOVO
 */
public class tocheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("hello");
        String ans = tocheckdays("13-04-2024");
        System.out.println(ans);
    }
    public static String tocheckdays(String dates){
        String inputDate = dates; // Input date in the format "dd-MM-yyyy"

        // Parse the input date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Get the day of the week
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // Print the result
        System.out.println("The day of the week for " + inputDate + " is " + dayOfWeek);
        String ans = String.valueOf(dayOfWeek);
        return ans;
    }
}
