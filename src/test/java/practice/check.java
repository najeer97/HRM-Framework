package practice;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class check {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		
		
		Calendar caldr = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("MMMM-yyyy");
		String monthYear = sd.format(caldr.getTime());
		SimpleDateFormat sd1 = new SimpleDateFormat("dd");
//		String date = sd1.format(caldr.getTime());
//		System.out.println(monthYear+date);
		
//		Sheet sh=null;
//		HashMap<String,String> map = new HashMap<String,String>();
//		for(int i=0; i<sh.getLastRowNum();i++) {
//			String key = sh.getRow(i).getCell(0).getStringCellValue();
//			String value = sh.getRow(i).getCell(1).getStringCellValue();
//			map.put(key, value);
//		}
//		for(Entry<String, String> set:map.entrySet()) {
//			//xpath or locator
//		}
		
		SimpleDateFormat sd2 = new SimpleDateFormat("dd-MM-yyyy hh-mm-ss");
		Date dt = new Date();
		String xv = sd2.format(dt);
		System.out.println(xv);
		
		LocalDateTime.now().toString().replace(':', '-');
		
		

	}
}
