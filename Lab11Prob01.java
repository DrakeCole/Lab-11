/**
 * File: Lab11Prob01.java
 * Class: CSCI 1302
 * Created by: Drake Cole and Jay Garrity
 * Created on: Dec 1, 2023
 * Description:
 */
public class Lab11Prob01 {
	public static void main(String[] args) {
		System.out.println(recursiveAbstract(4));
	}
	
	public static int recursiveAbstract(int num) {
		if(num == 0) {
			return 1;
		}else if(num == 1) {
			return 3;
		}else if(num == 2) {
			return 4;
		}else {
			return recursiveAbstract(num - 3) * (recursiveAbstract(num - 2) - recursiveAbstract(num - 1));
		}
	}
	
	

}
