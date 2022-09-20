// Lab03vst.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.


public class Lab03vst
{
	public static void main(String[] args)
	{
      System.out.println("Lab03, 80 Point Version\n");
	  int ms = 10000123;
		System.out.println("starting Milliseconds:			"+ ms);

		int h = ms / 3600000;
		System.out.println("Hours:							" + h);

		int hr=ms % 3600000;
		int m = hr / 60000;
		System.out.println("Minutes:						" + m);

		int min = hr % 60000;
		int s = min / 1000;
		System.out.println("Seconds:						" + s);

		int sr = min % 1000;
		System.out.println("Milliseconds:					" + sr);

	}
}

