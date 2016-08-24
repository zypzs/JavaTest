package wangyi;

import java.util.Scanner;

public class ChengJiSort {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	while (input.hasNext()) {
		int n=Integer.parseInt(input.nextLine());
		//System.out.println(n);
		int asc=Integer.parseInt(input.nextLine());
		//System.out.println(asc);
		String[] str1=new String[n];
		chengji[] c=new chengji[n];
		for (int i = 0; i < 3; i++) {
//			str1[i]=input.nextLine();
//			System.out.println(str1[i]);
		    //System.out.println(str1[i].split(" ")[1]);
			//c[i].nameString=str1[i].split("\\s")[0];
			//c[i].grade=Integer.parseInt(str1[i].split(" ")[1]);
			c[i] = new chengji();
			c[i].nameString=input.next();
			c[i].grade=input.nextInt();
//			c[i] = new chengji(input.next(),input.nextInt());
		}
		if (asc==0) {
			downSort(c);
		}else
			upSort(c);
	}
}
public static void downSort(chengji[] c){
	for (int i = 0; i < c.length; i++) {
		for (int j = c.length-1; j >i; j--) {
			if (c[j].grade>c[j-1].grade) {
				chengji a=c[j];
				c[j]=c[j-1];
				c[j-1]=a;
			}
		}
	}
	for (int i = 0; i < c.length; i++) {
		System.out.println(c[i].nameString+" "+c[i].grade);
	}
	
}
public static void upSort(chengji[] c){
	for (int i = 0; i < c.length; i++) {
		for (int j = c.length-1; j >i; j--) {
			if (c[j].grade<c[j-1].grade) {
				chengji a=c[j];
				c[j]=c[j-1];
				c[j-1]=a;
			}
		}
	}
	for (int i = 0; i < c.length; i++) {
		System.out.println(c[i].nameString+" "+c[i].grade);
	}
	
}
}
class chengji{
	public String nameString;
	public int grade;
}
