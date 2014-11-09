package anton.alerty.arraysandloops;

public class MonthCalendar {

	static int FirstDayOfMonth(int m, int y) {
		int d = 1;
		int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;
        return d0;
	}
	
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		//boolean isLeapYear;
		boolean isLeapYear = (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0));
		int firstDay = FirstDayOfMonth(m, y);
		int dayInMonth = 0;
		switch (m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: dayInMonth = 31; break;
			case 4:
			case 6:
			case 9:
			case 11: dayInMonth = 30; break;
			case 2: if (isLeapYear) dayInMonth = 29; else dayInMonth = 28; break;
		}
		
		System.out.println("S  M  T  W  T  F  Sut");
		int x = 1;
		while (x < dayInMonth){
			for (int i = 0; i < 7; i++) {
				if (i == (x + firstDay - 1) % 7) {
					if (x > 9) {
						System.out.print(x + " ");
					} else {
						System.out.print(" " + x + " ");
					}
					x++;
					if (x > dayInMonth) break;
				} else {
					System.out.print("   ");
				}
				
			}
			System.out.println();
		}
		
		
		
		//System.out.println("\n" + isLeapYear + "  " + firstDay + "    " + dayInMonth);
		
	}

}
