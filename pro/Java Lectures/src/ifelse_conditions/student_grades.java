package ifelse_conditions;

import java.util.Scanner;

public class student_grades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("enter the name : ");
		String name = sc.next();
		 System.out.println("enter your role number");
		int rollno = sc.nextInt();
		 System.out.println("markes in maths:");
		 int math = sc.nextInt();
		 System.out.println("markes in physics:");
		 int physics = sc.nextInt();
		 System.out.println("markes in chemistry:");
		 int chemistry = sc.nextInt();
		 System.out.println("markes in CS:");
		 int cs = sc.nextInt();
		 System.out.println("markes in english:");
		 int english = sc.nextInt();
		 
		 int percentage = (chemistry+physics+math+cs+english)/5;
		 System.out.println("Percentage Obtained : " +percentage);
		 String grade = percentage>80 ? "A" : (percentage>60? "B" : (percentage>40? "c":(percentage>30)? "D":"fail")); 
				 
				 
		System.out.println("grade obtainde : " +grade);
		//System.out.println(rollno);
	}
}
