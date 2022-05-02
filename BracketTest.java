package com.gl.javafds.gradedlab3.Brackets;

public class BracketTest {
	public static void main(String[] args) {
		
		test("[[{}]]");
		test("{[()]}");
		test("[[{}]])");
		test("{}");	
		test("{[(])}>");
			}
	
	private static void test(String brackets) {
			
		BalancedBrackets checker 
			= new BalancedBrackets(brackets);
		boolean result = checker.check();
		
		if (result) {
			System.out.println("Bracket expression '" + brackets + "' is balanced");			
		}
		else
		{
			System.out.println("Bracket expression '" + brackets + "' is NOT balanced");
		}		
	}

}
