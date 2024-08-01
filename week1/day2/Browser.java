package week1.day2;

public class Browser {
	
	public String launchbrowser(String browserName) {
		System.out.println("BROWSER LAUNCHED SUCCESSFULLY");
		return browserName;
	}
		public void loadUrl() {
			System.out.println("APPLICATION URL LOADED SUCCESSFULLY");
		}
			
		public static void main (String[] args) {
			Browser B = new Browser();
			 System.out.println(B.launchbrowser("VINEETH"));
			System.out.println(B.launchbrowser("ANBU"));
			 B.loadUrl();
		}
}
