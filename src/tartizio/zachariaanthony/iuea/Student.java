package tartizio.zachariaanthony.iuea;

import java.util.Scanner;

public class Student {
	private String RegNO;
	private String Name;
	private int YOB;
    
	int sum;
	private String []courses;
	public Student(String RegNO,String Name, int YOB) {
		// TODO Auto-generated constructor stub
		this.RegNO = RegNO;
		this.Name = Name;
		this.YOB = YOB;
	
	}
	
	public String getRegNO() {
		return RegNO;
	}
	public void setRegNO(int regNO) {
		RegNO = RegNO;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getYOB() {
		return YOB;
	}
	public void setYOB(int yOB) {
		YOB = yOB;
	}
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	Scanner scan = new Scanner(System.in);
	private void courseWork() {
		return;
	}
	public void getCourseWork() {	

		System.out.println("\n         STUDENT'S COURSE UNITS: ");		
		 int n=7;
		  String courses[] = {"Research Methods", "Networking" ,"OOP II","Calculus","OperatingSystems","Systems Analysis And Design","Web Design II"};
		  int []p = new int[n];	
		int sum = 0;
		 int Avg = 0;
		
		for(int i = 0; i< n; i++) {
			System.out.println(courses[i]);	
			int scan = new Scanner(System.in).nextInt();
				if( scan<=100) {
					System.out.println(" ");
				}
				else {
					System.out.println("Enter correct marks");
				}
					
					
				}
		 for(int j = 0; j< n; j++) {
			Scanner q  = scan; 
			p[j] = j;	
		   }						
		
		for( int k : p) {
			sum = sum +k;
		   
			int y = 7;
			Avg = sum/y;
		}	
		
			System.out.println("TOTAL: "+sum);
			System.out.println("AVERAGE: "+Avg);
		
	}
		
	public void setRegNO(String regNO) {
		RegNO = regNO;
		
	}
	public int getSum() {
		return sum;
		
	}
	public void setSum(int sum) {
		this.sum = sum;
		
	}
	public String[] getunits() {
		return courses;
		
	}
	public void setC(String[] c) {
		this.courses = c;
	}
	

}
