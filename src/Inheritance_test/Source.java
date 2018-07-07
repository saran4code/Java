/*Inheritance
Description
You are given 3 lines of input. In the first two lines you have to scan space separated details of the first and the second person respectively in the order: name, admission number, class, percentage, pass result, route number and blood group. Now you will be given an admission number, and you have to return the name, percentage and route of that person in a single line (space-separated). If the admission number is not present, return the error message 'No entry found'. Note that you have to make three classes, a student class(containing name, admission number, and class) and a report class that inherits the student class (and has the percentage and pass result) and a bus class that inherits the student class (and has the route number and blood group). Make appropriate methods where needed and in the driver class, make appropriate calls to these methods for the required output.

Sample test case:
Input:

A 1 9 99 yes 27 B+
B 2 10 88 no 28 A+
2

Output:

B 88 28 

Explanation: The person whose admission number is 2 has the name B, percentage 88 and route number 28.
Execution time limit */




package Inheritance_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Student{
	
	//Store name, ANo, STD
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	int Ano;
	
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		Ano = ano;
	}
	
	int STD;
	public int getSTD() {
		return STD;
	}
	public void setSTD(int sTD) {
		STD = sTD;
	}
	
}

class Report extends Student{
	//Store ptage and pass and also the attributes of student class(super keyword)
	
	
}

class Bus extends Student {
	//Store route and BG and also the attributes of student class(super keyword)
}

public class Source {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] strNums1, strNums2;
    	strNums1 = br.readLine().split("\\s");
    	strNums2 = br.readLine().split("\\s");
    	/*Store these details by making objects of both classes and then with the help of if-else, return the correct output.*/
    }
}