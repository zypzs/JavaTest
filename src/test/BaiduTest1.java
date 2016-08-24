package test;

import java.util.Scanner;

public class BaiduTest1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
            char []start = new char[n];
            char []end = new char[n];
			for(int i=0;i<n;i++){
				String s = input.next();
				start[i] = s.charAt(0);
				end[i] = s.charAt(s.length()-1);
			}
			int num = 0;
			String res = "Yes";
			int j;
			for(int i =0;i<n;i++){
				 j = 0;
				while(j < n){
					if(i != j){
						if(start[i] == end[j]){
							end[j] = ' ';
							break;
						}
					}
					j++;
				}
				if(j == n)
				num ++;
				if(num == 2){
					res = "No";
					break;
				}
			}
			System.out.println(res);
		}
	}
}
