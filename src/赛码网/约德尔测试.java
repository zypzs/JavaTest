package ÈüÂëÍø;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ô¼µÂ¶û²âÊÔ {

	private static String getRes(char []s1,char[]s2){
		int num = 0;
		for(int i=0;i<s1.length;i++){
			if(s1[i] == s2[i]){
				num++;
			}
		}
	  DecimalFormat format = new DecimalFormat(".00%");
	  return format.format((double)num/s1.length);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			char []str1 = scan.nextLine().toCharArray();
			char []str2 = scan.nextLine().toCharArray();
			char []temp = new char[str1.length];
			int j = 0;
			for(char c : str1){
				if((c >= 'a' && c <= 'z') ||
				   (c >= 'A' && c <= 'Z') ||
				   (c >= '0' && c <='9')){
					temp[j++] = '1';
				}else{
					temp[j++] = '0';
				}
			}
			System.out.println(getRes(temp,str2));
		}
	}
}
