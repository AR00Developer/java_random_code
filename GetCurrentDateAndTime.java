import java.util.*; 

class GetCurrentDateAndTime
{
	public static void main(String args[])
	{
		int day, month, year; 
		int second, minute, hour; 
		GregorianCalendar date = new GregorianCalendar(); 

		day = date.get(Calendar.DAY_OF_MONTH);
		day = date.get(Calendar.MONTH);
		day = date.get(Calendar.YEAR);


		day = date.get(Calendar.SECOND);
		day = date.get(Calendar.MINUTE);
		day = date.get(Calendar.HOUR);

		System.out.println("current date is " + day "/" + (month+1) + "/" + year);
		System.out.println("current date is " + hour " : " + minute + " : " + second);
	}
	
}