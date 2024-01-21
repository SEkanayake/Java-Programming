package com.java_programming.problem_solving;

import com.java_programming.problem_solving.basic.CountString;
import com.java_programming.problem_solving.basic.RemoveArrayListDuplicate;
import com.java_programming.problem_solving.basic.ReverseString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProblemSolvingApplication {

	private static RemoveArrayListDuplicate removeArrayListDuplicate;
	private static CountString countString;
	private static ReverseString reverseString;

	public ProblemSolvingApplication(
			RemoveArrayListDuplicate removeArrayListDuplicate,
			CountString countString,
			ReverseString reverseString
	) {
		this.removeArrayListDuplicate = removeArrayListDuplicate;
		this.countString = countString;
		this.reverseString = reverseString;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProblemSolvingApplication.class, args);

		removeArrayListDuplicate.removeDuplicateInteger();
		countString.countWords();
		countString.countCharacters();
		reverseString.byUsingStringBufferAndStringBuilder();
	}

}
