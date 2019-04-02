package mb.test;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class TestLocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date = "20190101";
		
		try {
			LocalDate localdate = LocalDate.parse(date);
			System.out.println(localdate);
			
		}catch(DateTimeParseException ex) {
			System.out.println(ex.toString());
		}

	}

}
