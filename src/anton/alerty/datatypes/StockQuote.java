package anton.alerty.datatypes;

public class StockQuote {
	public static double price(String symbol) {
		In page = new In("http://finance.yahoo.com/q?s=" +symbol);
		String s = page.readAll();
		int find = s.indexOf("time_rtq_ticker", 0);
		int left = s.indexOf("span id=\"yfs_l84_goog\">", find);
		int right = s.indexOf("</span></span>", left);
		String quote = s.substring(left+"span id=\"yfs_l84_goog\">".length(), right);
		return Double.parseDouble(quote);
	}

	public static void main(String[] args) {
		System.out.println("Stock quote for " + args[0].toUpperCase() + " is " + price(args[0]));
	}

}
