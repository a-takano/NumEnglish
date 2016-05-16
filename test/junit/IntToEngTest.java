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
    	//String s = String.valueOf(n);//数値→文字列
    	//System.out.println(s);
    	String[] s = {
    			"",
    			"one",
    			"two",
    			"three",
    			"four",
    			"five",
    			"six",
    			"seven",
    			"eight",
    			"nine",
    			"ten",
    			"eleven",
    			"twelve",
    			"thirteen",
    			"fourteen",
    			"fifteen",
    			"sixteen",
    			"seventeen",
    			"eighteen",
    			"nineteen",
    			"twenty",
    			"twenty-one",
    			"twenty-two",
    			"twenty-three",
    			"twenty-four",
    			"twenty-five",
    			"twenty-six",
    			"twenty-seven",
    			"twenty-eight",
    			"twenty-nine",
    			"thirty",
    			"thirty-one",
    			"thirty-two",
    			"thirty-three",
    			"thirty-four",
    			"thirty-five",
    			"thirty-six",
    			"thirty-seven",
    			"thirty-eight",
    			"thirty-nine",
    			"fourty",
    			"fourty-one",
    			"fourty-two",
    			"fourty-three",
    			"fourty-four",
    			"fourty-five",
    			"fourty-six",
    			"fourty-seven",
    			"fourty-eight",
    			"fourty-nine",
    			"fifty",
    			"fifty-one",
    			"fifty-two",
    			"fifty-three",
    			"fifty-four",
    			"fifty-five",
    			"fifty-six",
    			"fifty-seven",
    			"fifty-eight",
    			"fifty-nine",
    			"sixty",
    			"sixty-one",
    			"sixty-two",
    			"sixty-three",
    			"sixty-four",
    			"sixty-five",
    			"sixty-six",
    			"sixty-seven",
    			"sixty-eight",
    			"sixty-nine",
    			"seventy",
    			"seventy-one",
    			"seventy-two",
    			"seventy-three",
    			"seventy-four",
    			"seventy-five",
    			"seventy-six",
    			"seventy-seven",
    			"seventy-eight",
    			"seventy-nine",
    			"eighty",
    			"eighty-one",
    			"eighty-two",
    			"eighty-three",
    			"eighty-four",
    			"eighty-five",
    			"eighty-six",
    			"eighty-seven",
    			"eighty-eight",
    			"eighty-nine",
    			"ninety",
    			"ninety-one",
    			"ninety-two",
    			"ninety-three",
    			"ninety-four",
    			"ninety-five",
    			"ninety-six",
    			"ninety-seven",
    			"ninety-eight",
    			"ninety-nine",
    			"hundred",
    			};
    	for(int i = 0; i <= 100; i++){
    	    if(n == i){
    		return s[i];
    	    }
    	}
        return ""+s;
    }
}
