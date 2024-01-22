package com.java_programming.problem_solving;

import com.java_programming.problem_solving.Searching.BinarySearch;
import com.java_programming.problem_solving.SimpleProgramming.ArmstrongNumber;
import com.java_programming.problem_solving.SimpleProgramming.Factorial;
import com.java_programming.problem_solving.SimpleProgramming.Fibonacci;
import com.java_programming.problem_solving.SimpleProgramming.IsPrimeNumber;
import com.java_programming.problem_solving.Sorting.BubbleSort;
import com.java_programming.problem_solving.basic.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProblemSolvingApplication {

	private static RemoveArrayListDuplicate removeArrayListDuplicate;
	private static CountString countString;
	private static ReverseString reverseString;
	private static FasterListClass fasterListClass;
	private static IsPrimeNumber isPrimeNumber;
	private static Factorial factorial;
	private static Fibonacci fibonacci;
	private static ArmstrongNumber armstrongNumber;
	private static BubbleSort bubbleSort;
	private static BinarySearch binarySearch;
	private static SortString sortString;
	public ProblemSolvingApplication(
			RemoveArrayListDuplicate removeArrayListDuplicate,
			CountString countString,
			ReverseString reverseString,
			FasterListClass fasterListClass,
			IsPrimeNumber isPrimeNumber,
			Factorial factorial,
			Fibonacci fibonacci,
			ArmstrongNumber armstrongNumber,
			BubbleSort bubbleSort,
			BinarySearch binarySearch,
			SortString sortString
	) {
		this.removeArrayListDuplicate = removeArrayListDuplicate;
		this.countString = countString;
		this.reverseString = reverseString;
		this.fasterListClass = fasterListClass;
		this.isPrimeNumber = isPrimeNumber;
		this.factorial = factorial;
		this.fibonacci = fibonacci;
		this.armstrongNumber = armstrongNumber;
		this.bubbleSort = bubbleSort;
		this.binarySearch = binarySearch;
		this.sortString = sortString;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProblemSolvingApplication.class, args);

//		removeArrayListDuplicate.removeDuplicateInteger();
//		countString.countWords();
//		countString.countCharacters();
//		reverseString.byUsingStringBufferAndStringBuilder();
//		fasterListClass.searchOption();
//		isPrimeNumber.isPrime();
//		factorial.factValue();
//		fibonacci.getFibonacciWithRecursion();
//		fibonacci.fibonacciWithoutRecursion();
//		armstrongNumber.isArmstrong();
//		bubbleSort.sort();
//		binarySearch.getValue();
		sortString.getSort();
	}

}
