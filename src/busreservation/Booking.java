package busreservation;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String passengerName;
    int busNo;
    Date date;
    String DateInput;


    Booking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name of passenger");
        passengerName = scanner.next();
        System.out.println("enter busNo");
        busNo = scanner.nextInt();
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyy");


        try {

            date = DateFormat.parse(DateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);


            }

        }
    }



