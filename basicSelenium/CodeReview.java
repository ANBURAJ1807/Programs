package basicSelenium;

import java.util.Arrays;
import java.util.Scanner;

public class CodeReview {
	/*
	 * public static void main(String[] args) { Scanner scanner = new
	 * Scanner(System.in); System.out.print("Enter the number of terms: "); int
	 * terms = scanner.nextInt(); scanner.close();
	 * 
	 * int first = 0, second = 1; System.out.print("Fibonacci Series: "); for (int i
	 * = 0; i < terms; i++) { System.out.print(first + " "); int next = first +
	 * second; first = second; second = next; } }
	 */
	/*
	 * public static void main(String[] args) { for(int i=0;i<10;i++) { if(i%2!=0) {
	 * System.out.println("Odd Numbers are"+i); }
	 * 
	 * }
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { Scanner scanner = new
	 * Scanner(System.in); System.out.print("Please enter a number: "); int number =
	 * scanner.nextInt(); scanner.close();
	 * 
	 * boolean isPrime = true; if (number <= 1) { isPrime = false; } else { for (int
	 * i = 2; i <= Math.sqrt(number); i++) { if (number % i == 0) { isPrime = false;
	 * break; } } }
	 * 
	 * if (isPrime) { System.out.println(number + " is a prime number."); } else {
	 * System.out.println(number + " is not a prime number."); } }
	 */

	/*
	 * public static void main(String[] args) { Scanner scanner = new
	 * Scanner(System.in); System.out.print("Please enter a number: "); int number =
	 * scanner.nextInt(); scanner.close();
	 * 
	 * boolean isPrime = true; if (number <= 1) { isPrime = false; } else { for (int
	 * i = 2; i <= Math.sqrt(number); i++) { if (number % i == 0) { isPrime = false;
	 * break; } } }
	 * 
	 * if (isPrime) { System.out.println(number + " is a prime number."); } else {
	 * System.out.println(number + " is not a prime number."); } }
	 */

	/*
	 * public static void main(String[] args) { int array[]= {1,4,3,2,8,6,7};
	 * Arrays.sort(array); for(int i=1;i<array.length;i++) {
	 * 
	 * if(array[i]+1!= array[i+1]) {
	 * 
	 * System.out.println("Missing Number is "+ (array[i]+1)); break; }
	 * 
	 * 
	 * } }
	 */

	/*
	 * public String addBook(String bookTitle ) {
	 * System.out.println("Book added successfully"); return bookTitle;
	 * 
	 * 
	 * 
	 * } public void issueBook() { System.out.println("Book issued Successfully");
	 * 
	 * 
	 * } public static void main(String args[]) { CodeReview l=new CodeReview();
	 * String obj=l.addBook("Twinkle"); System.out.println("Book Name"+obj);
	 * l.issueBook(); }
	 */

	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * ChromeDriver driver = new ChromeDriver();
	 * driver.navigate().to("http://leaftaps.com/opentaps");
	 * driver.manage().window().maximize();
	 * driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	 * driver.findElement(By.id("password")).sendKeys("crmsfa");
	 * driver.findElement(By.className("decorativeSubmit")).click();
	 * driver.findElement(By.linkText("CRM/SFA")).click();
	 * driver.findElement(By.linkText("Accounts")).click();
	 * driver.findElement(By.linkText("Create Account")).click();
	 * driver.findElement(By.id("accountName")).sendKeys("Varsh");
	 * driver.findElement(By.name("description")).
	 * sendKeys("Selenium Automation Tester"); WebElement industry =
	 * driver.findElement(By.xpath("//select[@name='industryEnumId']")); Select
	 * options = new Select(industry);
	 * options.selectByVisibleText("Computer Software"); WebElement Ownership =
	 * driver.findElement(By.xpath("//select[@name='ownershipEnumId']")); Select
	 * option = new Select(Ownership); option.selectByVisibleText("S-Corporation");
	 * WebElement Source =
	 * driver.findElement(By.xpath("//select[@name='dataSourceId']")); Select
	 * options2 = new Select(Source); options2.selectByValue("LEAD_EMPLOYEE");
	 * WebElement Campaign =
	 * driver.findElement(By.xpath("//select[@name='marketingCampaignId']")); Select
	 * options3 = new Select(Campaign); options3.selectByIndex(5); WebElement State
	 * = driver.findElement(By.xpath("//select[@name='generalCountryGeoId']"));
	 * Select options4 = new Select(State); options4.selectByValue("ATA");
	 * driver.findElement(By.linkText("Create Account")).click();
	 * Thread.sleep(2000); driver.close();
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { int maxRange = 10; for (int i = 1; i
	 * <= maxRange; i++) { if (i % 2 != 0) { System.out.print(i + " "); } }
	 */

	/*
	 * public static void main(String[] args) { int num=6; boolean isPrime=true;
	 * for(int i=2;i<=num/2;) { if(num%i==0) isPrime=false; break; }
	 * if(isPrime==true) { System.out.println("prime num"); } else {
	 * System.out.println("non prime");
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { int range = 8; int n1 = 0, n2 = 1,
	 * n3; System.out.print(n1 + " " + n2); for (int i = 2; i < range; i++) { n3 =
	 * n1 + n2; System.out.print(" " + n3); n1 = n2; n2 = n3;
	 * 
	 * }
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { int array1[] = {3, 2, 11, 4, 6, 7};
	 * int array2[] = {1, 2, 8, 4, 9, 7}; for(int i=0; i < array1.length; i++) {
	 * for(int j=0; j < array2.length ;j++) { if(array1[i]==array2[j]) {
	 * System.out.print(" "+array1[i]); } } }
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { int[] arr = {1, 4, 3, 2, 8, 6, 7};
	 * System.out.println("Missing Number: " + findMissingElement(arr)); }
	 * 
	 * public static int findMissingElement(int[] arr) { Arrays.sort(arr); for (int
	 * i = 0; i < arr.length - 1; i++) { if (arr[i] + 1 != arr[i + 1]) { return
	 * arr[i] + 1; } } return arr[arr.length - 1] + 1; }
	 */
	/*
	 * public String addBook(String bookTitle){ String s1=bookTitle; return s1;
	 * 
	 * } public void issueBook() { System.out.println("Book issued successfully");
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { CodeReview lb = new CodeReview();
	 * String bookDetails="Hitler"; String result=lb.addBook("Hitler");
	 * System.out.println(result+" book added successfully"); lb.issueBook(); }
	 */

	/*
	 * public static void main(String[] args) { int range=10; for (int i = 0; i <
	 * 10; i++) { if(i%2==0) { System.out.println("The prime nos are "+i); }
	 * 
	 * 
	 * } }
	 */

	/*
	 * public static void main(String[] args) { int range=20; int i=0,j=1,k;
	 * System.out.println(i); System.out.println(j); for (k=2; k<=range;k++) {
	 * k=i+j; System.out.println(k);
	 * 
	 * i=j; j=k;
	 * 
	 * 
	 * }
	 * 
	 * }
	 */

	/*
	 * public String addbook(String bookname) {
	 * System.out.println(bookname+" book added successfully"); return bookname;
	 * 
	 * } public void issueBook() { System.out.println("book issued successfully"); }
	 * 
	 * public static void main(String[] args) { CodeReview lbk = new CodeReview();
	 * lbk.addbook("automation testing"); lbk.issueBook(); }
	 */

	/*
	 * public static void main(String[] args) { int ele[]= {1,4,3,2,8,6,7};
	 * Arrays.sort(ele); int leg=ele.length;
	 * System.out.println("Array legnth is "+leg); int i; int max=ele[leg-1];
	 * System.out.println("largest no in array is " +max); for (i=0;i<leg;i++) {
	 * if(ele[i]+1!=ele[i+1]) { System.out.println("missing no is "+(ele[i]+1));
	 * break; } } }
	 */

	/*
	 * public static void main(String[] args) { int count=0,m=12; int i,j=m/2;
	 * 
	 * if(m==0||m==1) { System.out.println(m+"is not a prime no" );
	 * 
	 * } else { for(i=2;i<=j;i++) { if(m%i==0) {
	 * System.out.println(m+" is not prime number"); count=1; break;
	 * 
	 * } } if(count==0) { System.out.println(m+" is prime number"); }
	 * 
	 * } }
	 */

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * Scanner fib= new Scanner(System.in); System.out.println("Enter the input:");
	 * int num =fib.nextInt();
	 * 
	 * fib.close();
	 * 
	 * int out=0; int out1=1;
	 * 
	 * int out2=0; System.out.println("Fibonacci Series:"+ out+ "\n"+
	 * "Fibonacci Series:"+ out1); for(int i=1;out<num;i++) { out2= out+out1 ;//0 1
	 * 1 2 3 5 8 out = out1; out1= out2;
	 * 
	 * System.out.println("Fibonacci Series:"+out2); }
	 */

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * int array1[]= {3,2,11,4,6,7}; int array2[]= {1,2,8,4,9,7}; for(int
	 * i=0;i<array1.length;i++) { if(array1[i]==array2[i])
	 * System.out.println("The matched numbers are:"+array1[i] );
	 * 
	 * } }
	 */
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * int array[]= {1,4,3,2,8,6,7}; Arrays.sort(array); for(int
	 * i=1;i<array.length;i++) {
	 * 
	 * if(array[i]+1!= array[i+1]) {
	 * 
	 * System.out.println("Missing Number is "+ (array[i]+1)); break; }
	 * 
	 * } }
	 */

	/*
	 * public static void main (String[] args) { Scanner scanner = new
	 * Scanner(System.in); int num =0; //Empty String String primeNumbers = "";
	 * System.out.println("Enter the value of n:"); int n = scanner.nextInt();
	 * scanner.close();
	 * 
	 * for (int i = 2; i <= n; i++) { int counter=0; for(num =i; num>=1; num--) {
	 * if(i%num==0) { counter = counter + 1; } } if (counter ==2) { //Appended the
	 * Prime number to the String primeNumbers = primeNumbers + i + " "; } }
	 * System.out.println("Prime numbers from 1 to n are :");
	 * System.out.println(primeNumbers); }
	 */

	/*
	 * public String addBook (String bookTitle){
	 * 
	 * System.out.println("Book added successfully"); return bookTitle;
	 * 
	 * }
	 * 
	 * public void issueBook() { System.out.println("Book issued successfully"); }
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * CodeReview Lib= new CodeReview(); Lib.addBook("Maths"); Lib.issueBook(); }
	 */

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * CodeReview Lib= new CodeReview(); Lib.addBook("Maths"); Lib.issueBook(); }
	 * 
	 * private void issueBook() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * private void addBook(String string) { // TODO Auto-generated method stub
	 */

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * Scanner fib= new Scanner(System.in); System.out.println("Enter the input:");
	 * int num =fib.nextInt();
	 * 
	 * fib.close();
	 * 
	 * int out=0; int out1=1;
	 * 
	 * int out2=0; System.out.println("Fibonacci Series:"+ out+ "\n"+
	 * "Fibonacci Series:"+ out1); for(int i=1;out<num;i++) { out2= out+out1 ;//0 1
	 * 1 2 3 5 8 out = out1; out1= out2;
	 * 
	 * System.out.println("Fibonacci Series:"+out2); } }
	 */

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * int array1[]= {3,2,11,4,6,7}; int array2[]= {1,2,8,4,9,7}; for(int
	 * i=0;i<array1.length;i++) { if(array1[i]==array2[i])
	 * System.out.println("The matched numbers are:"+array1[i] );
	 * 
	 * } }
	 */

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * int array[]= {1,4,3,2,8,6,7}; Arrays.sort(array); for(int
	 * i=1;i<array.length;i++) {
	 * 
	 * if(array[i]+1!= array[i+1]) {
	 * 
	 * System.out.println("Missing Number is "+ (array[i]+1)); break; }
	 * 
	 * } }
	 */

	/*
	 * public static void main (String[] args) { Scanner scanner = new
	 * Scanner(System.in); int num =0; //Empty String String primeNumbers = "";
	 * System.out.println("Enter the value of n:"); int n = scanner.nextInt();
	 * scanner.close();
	 * 
	 * for (int i = 2; i <= n; i++) { int counter=0; for(num =i; num>=1; num--) {
	 * if(i%num==0) { counter = counter + 1; } } if (counter ==2) { //Appended the
	 * Prime number to the String primeNumbers = primeNumbers + i + " "; } }
	 * System.out.println("Prime numbers from 1 to n are :");
	 * System.out.println(primeNumbers); }
	 */

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * int num = 10; for (int i = 1; i <= num; i++) { if (i % 2 == 1) {
	 * System.out.println("Odd numbers = " + i); } }
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * int s1 = 0, s2 = 1, i, count = 8; System.out.println(s1);
	 * System.out.println(s2); for (i = 2; i < count; i++) { int c = s1 + s2;
	 * System.out.println(c); s1 = s2; s2 = c;
	 * 
	 * }
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * float browserversion = 100.2f; String browserName = "firefox"; boolean
	 * isVisible = true; int releaseYear = 1998; char browserLogo = 'f';
	 * System.out.println("Browser Version="+browserversion);
	 * System.out.println("Browser Name="+browserName);
	 * System.out.println("is Visible="+isVisible);
	 * System.out.println("Release Year="+releaseYear);
	 * System.out.println("Browser Logo="+browserLogo); }
	 */

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * System.out.println("Welcome to TeastLeaf");
	 * 
	 * }
	 */
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * for (int i = 2; i <= 10; i += 2) { if (i % 2 == 0) {
	 * System.out.println("The Even Numbers are:" + i); }
	 * 
	 * } }
	 */

	/*
	 * public String launchBrowser(String browserName) { return browserName; }
	 * public void loadurl() {
	 * System.out.println("Application url load successfully"); } public static void
	 * main (String[] args) { CodeReview b = new CodeReview(); b.loadurl(); String
	 * browserName = b.launchBrowser("Chrome");
	 * System.out.println("browser launched successfully:" +browserName); }
	 */

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * int [] arr= {1,4,3,2,8,6,7}; int n =arr.length+1; int sum = (n*(n+1))/2; for
	 * (int i=0;i<arr.length;i++) { sum = sum -arr[i]; }
	 * System.out.println("Missing number is "+sum ); }
	 */

	/*
	 * public static void main(String[] args) { int num=10; for (int i=0; i <=num;
	 * i++) { if (i%2!=0) { System.out.println("The Odd Numbers are:"+i);
	 * 
	 * } } }
	 */

	/*
	 * public String addBook(String bookTitle) {
	 * 
	 * System.out.println("Book added successfully"); return bookTitle;
	 * 
	 * 
	 * }
	 * 
	 * public void issueBook() {
	 * 
	 * System.out.println("Book issued successfully");
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * CodeReview obj= new CodeReview(); String bookName = obj.addBook("The Monk");
	 * System.out.println(bookName); obj.issueBook();
	 * 
	 * }
	 */

	/*
	 * public String addBook(String bookTitle) {
	 * 
	 * System.out.println("Book added successfully"); return bookTitle;
	 * 
	 * 
	 * }
	 * 
	 * public void issueBook() {
	 * 
	 * System.out.println("Book issued successfully");
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * CodeReview obj= new CodeReview(); String bookName = obj.addBook("The Monk");
	 * System.out.println(bookName); obj.issueBook();
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * int n = 8, firstTerm = 0, secondTerm = 1;
	 * 
	 * System.out.println("Fibonacci Series of " + n + " Numbers:");
	 * 
	 * for (int i = 1; i <= n; ++i) {
	 * 
	 * System.out.print(firstTerm +" "+'\n');
	 * 
	 * int nextTerm = firstTerm + secondTerm; firstTerm = secondTerm; secondTerm =
	 * nextTerm; } }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out.println("The Odd Numbers from 1 to 10 :"); for (int i = 1; i <=
	 * 10; i++) {
	 * 
	 * if (i % 2 != 0) {
	 * 
	 * System.out.println(i); } } }
	 */

	/*
	 * public static void main(String[] args) { int n=5;
	 * System.out.println("The Given Number is:"+n); int c=0;
	 * 
	 * for (int i = 1; i <= n; i++) { if (n%i == 0) { c++; } }
	 * 
	 * if (c==2) {
	 * 
	 * System.out.println("Number " +n+ " is a Prime Number"); } else {
	 * 
	 * System.out.println("Number " +n+ " is Not a Prime Number"); } }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * int[] a = { 3, 2, 11, 4, 6, 7 }; int[] b = { 1, 2, 8, 4, 9, 7 };
	 * 
	 * System.out.println("Input A = {3, 2, 11, 4, 6, 7}" + '\n' +
	 * "Input B = {1, 2, 8, 4, 9, 7}"); for (int i = 0; i < a.length; i++) {
	 * 
	 * for (int j = 0; j < b.length; j++) {
	 * 
	 * if (a[i] == b[j]) {
	 * 
	 * System.out.println("Matching Element : " + a[i]); } } } }
	 */
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * int a[] = {1, 4, 3, 2, 8, 6, 7}; int n=a.length; int sum1=0,sum2=0;
	 * System.out.println("Input of the Array - {1, 4, 3, 2, 8, 6, 7}"); for (int i
	 * = 1; i <=8; i++) { sum1=sum1+i; }
	 * 
	 * for (int i = 0; i < n; i++) { sum2=sum2+a[i]; }
	 * 
	 * int m=sum1-sum2; System.out.println("The Missing Element is: "+m);
	 * 
	 * }
	 */
	
	/*
	 * public static void main(String[] args) { int a = 0; int b = 1;
	 * System.out.println(a + "\n" + b); for (int i = 3; i <= 8; i++) { int c = a +
	 * b; a = b; b = c; System.out.println(c); } }
	 */
	
	/*
	 * public static void main(String[] args) { int a[]={3,2,11,4,6,7}; int
	 * b[]={1,2,8,4,9,7}; int c=-1; for(int i=0; i<a.length; i++) { for(int j=0;
	 * j<b.length; j++){ if(a[i]==b[j]) { c=a[i]; System.out.println(c); } } } }
	 */
	
	/*
	 * // public static void main(String[] args) { // int a[] = {1,4,3,2,8, 6, 7};
	 * // int b=-1; // Arrays.sort(a); // for (int i = 0; i < 7; i++) { //
	 * if(a[i]!=(i+1)) { // b=i+1; // System.out.println(b); // break; // } // } //
	 * // // }
	 */	
	
	/*
	 * public static void main(String[] args) { int a[]={3,2,11,4,6,7}; int
	 * b[]={1,2,8,4,9,7}; int c=-1; for(int i=0; i<a.length; i++) { for(int j=0;
	 * j<b.length; j++){ if(a[i]==b[j]) { c=a[i]; System.out.println(c); } } } }
	 */
	
	/*
	 * public static void main(String[] args) { int n = 4; boolean isPrime = true;
	 * 
	 * for (int i = 2; i < n; i++) { if (n % i == 0) { isPrime = false; break; } }
	 * 
	 * if(isPrime) { System.out.println(n + " is Prime"); } else {
	 * System.out.println(n + " is not Prime"); } }
	 */
	
	/*
	 * public static void main(String[] args) { int a=0,b=1,i,count=8;
	 * System.out.println(a); System.out.println(b); for(i=2;i<count;++i) { int
	 * c=a+b; System.out.println(c); a=b; b=c; }
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		for(int i=2;i<=10;i+=2)
		{
			if(i%2==0)
			{
				System.out.println("The even numbers are:"+i);
			}

		}


	}


}
