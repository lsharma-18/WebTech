package Assignment4;

import java.util.*;

class Number{
	private	double num;

	void setNum(double num){
        this.num = num;
    }

	boolean isZero(){
	    return num == 0;
	}

	boolean isPositive(){
	    return num > 0;
	}

	boolean isNegative(){
	    return num < 0;
	}

	boolean isOdd(){
	    return num %2 !=0;
	}

	boolean isEven(){
	    return num % 2 == 0;
	}
	    
	boolean isPrime(){
	    if (num <= 1) {
	        return false;
	    }

	    for (int i = 2; i <= Math.sqrt(num); ++i) {
	        if (num % i == 0) {
	            return false;
	            }
	        }

	        return true;
	}

	boolean isArmstrong(){
	    int initialNumber, remainder, answer = 0;

	    initialNumber = (int)num;

	    while (initialNumber != 0)
	    {
	        remainder = initialNumber % 10;
	        answer += Math.pow(remainder, 3);
	        initialNumber /= 10;
	    }

	        return answer==num;
	}

	double getFactorial(){

	    double answer = 1;

	    for(int i = 1; i<=num; ++i)
	        answer *= i;

	    return answer;

	}

	double getSqrt(){

	    return Math.sqrt(num);
	}

	double getSqr(){
	    return num*num;
	}

	double sumDigits(){

	    int ans = 0, number = (int) num;

	    while(number > 0){
	        int temp = number % 10;
	        ans += temp;
	        number = number / 10;
	    }
	        return ans;
	}

	double getReverse(){

	    int number = (int)num, reverseNum = 0;

	    for( ;number != 0; number=number/10)
	    {
	        int remainder = number % 10;
	        reverseNum = reverseNum * 10 + remainder;
	    }

	        return reverseNum;
	}

	void listFactor(){

	    System.out.print("listFactor: ");

	    for (int i = 1; i <= num; ++i) {

	        // i is a factor if number is divisible by i
	        if (num % i == 0) {
	             System.out.print(i + " ");
	        }
	    }
	       
			System.out.println();
	}

	void dispBinary(){

	    Stack<Integer> st = new Stack<>();

	    int number = (int) num;

	    // Number should be positive
	    while (number > 0) {
	        // Pushing numbers inside stack that
	        // are divisible by 2
	        st.push(number % 2);
			number = number / 2;
	    }

	    System.out.print("dispBinary: ");

	    // Check if stack is empty
	        while (!(st.isEmpty())) {
	            System.out.print(st.pop());
	        }
	    }
}

public class Question3 {

    public static void main(String[] args) {
        Number num = new Number();
        num.setNum(49d);
        System.out.println("isZero: " + num.isZero());
        System.out.println("isPositive: " + num.isPositive());
        System.out.println("isNegative: " + num.isNegative());
        System.out.println("isOdd: " + num.isOdd());
        System.out.println("isEven: " + num.isEven());
        System.out.println("isPrime: " + num.isPrime());
        System.out.println("isArmstrong: " + num.isArmstrong());
        System.out.println("getFactorial: " + num.getFactorial());
        System.out.println("getSqrt: " + num.getSqrt());
        System.out.println("getSqr: " + num.getSqr());
        System.out.println("sumDigits: " + num.sumDigits());
        System.out.println("getReverse: " + num.getReverse());
        num.listFactor();
        num.dispBinary();
  }
    
}
