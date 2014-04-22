package craft;


import java.util.Scanner;
import java.util.ArrayList;



public class PrimeFactor {
	
	//declaration of variables
	static ArrayList <Integer> primeFactorList;
	static boolean flag=false;

	// generate(), receives input and returns the ArrayList of prime factors
	public static ArrayList <Integer> generate(int input){	
	
		int current_count=2;	
	
	primeFactorList = new ArrayList<Integer>();
	if(input<0){
	
		primeFactorList.add(-1);
		input=input*-1;
	}
	
	while(current_count<=input){
		
		if(input%current_count==0){	
		
			if(isprime(current_count)){
					primeFactorList.add(current_count); 
			
			}		
			
		}
		
		current_count++;
		
	}
	
	return primeFactorList;
	
	}
	
	// isprime() checks, if factor is prime or not
	
	public static boolean isprime(int checkprime){
		int i=2;
		
		if(checkprime==2){	
			return true;
		}
		
		while(i<checkprime){
		
			if(checkprime%i!=0){
			
				flag=true;
				i++;
			
			}else{
				
				flag=false;
				break;
			}
		}
		
		return flag;
	}
	
	// main(), asks for the input from user
	public static void main(String []args){
		
		int inputNumber;
		ArrayList <Integer>number= new ArrayList<Integer>();
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
		inputNumber = in.nextInt();
		in.close(); //closes the Scanner reference
		number=generate(inputNumber);
		System.out.println(number);
		
	}

}
