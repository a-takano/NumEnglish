package junit;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class IntToEngTest {

	//@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1から100までの数字を入力してください。");
        int input = sc.nextInt();//input=数値
        //translateEng(input);//数値をtranslateEngに渡す
        System.out.println(translateEng(input));
    }

    // 数値nを英訳する変換するメソッド
	static String translateEng(int n) {
		String[] a = {
				"zero",//a[0]
				"one",//a[1]
				"two",//a[2]
				"three",//a[3]
				"four",//a[4]
				"five",//a[5]
				"six",//a[6]
				"seven",//a[7]
				"eight",//a[8]
				"nine",//a[9]
				"ten",//a[10]
				"eleven",//a[11]
				"twelve",//a[12]
				"thrteen",//a[13]
				"fourteen",//a[14]
				"fifteen",//a[15]
				"sixteen",//a[16]
				"seventeen",//a[17]
				"eighteen",//a[18]
				"nineteen"};//a[19]
		String[] b = {
				"",//b[0]
				"twenty-",//b[1]
				"thierty-",//b[2]
				"fourty-",//b[3]
				"fifty-",//b[4]
				"sixty-",//b[5]
				"seventy-",//b[6]
				"eighty-",//b[7]
				"ninety-"};//b[8]
		String n2 = null;
			if(n < 0 || n > 100){
				return "0から99までの数字を入力してください。";
			}else if(n == 100){
				return "hundred";
			}else if(90 <= n && n <= 99){
				return n2 = b[8] + a[n%90];
			}else if(80 <= n && n < 90){
				return n2 = b[7] + a[n%80];
			}else if(70 <= n && n < 80){
				return n2 = b[6] + a[n%70];
			}else if(60 <= n && n < 70){
				return n2 = b[5] + a[n%60];
			}else if(50 <= n && n < 60){
				return n2 = b[4] + a[n&50];
			}else if(40 <= n && n < 50){
				return n2 = b[3] + a[n%40];
			}else if(30 <= n && n < 40){
				return n2 = b[2] + a[n%30];
			}else if(20 <= n && n < 30){
				return n2 = b[1] + a[n%20];
			}else if(n < 20){
				return n2 = a[n];
			}
			return "" + n2;
		}
}
