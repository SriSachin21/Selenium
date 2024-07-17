package Week1.day3;

public class Browser {
	public String launchBrowser(String Bname) {
		// TODO Auto-generated method stub
		System.out.println("Browser Lanunched Successfully");
		return Bname;

	}
	public void loadUrl() {
		// TODO Auto-generated method stub
		System.out.println("Application url loaded successfully");

	}

	public static void main(String[] args) {
		Browser obj=new Browser();
		System.out.println(obj.launchBrowser("Brave"));
		obj.loadUrl();
	}

}
