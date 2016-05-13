package junit;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();//input=数値
        translateEng(input);//数値をtranslateEngに渡す
        System.out.println(translateEng(input));
    }

    // 数値nを英訳する変換するメソッド
    static String translateEng(int n) {
    	String s = String.valueOf(n);//数値→文字列
    	//System.out.println(s);
        return ""+s;
    }
}
