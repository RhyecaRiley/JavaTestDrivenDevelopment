package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import stack.StackImplementation;

class StackTests {
	private StackImplementation<String> stackImplementation = new StackImplementation<String>();
	
	@Test
	void stackShouldPushOneValue() {
		stackImplementation.push("ThisisaTest");
		assertEquals(stackImplementation.length(), 1);
	}
	
	@Test
	void stackShouldPushTwoValues() {
		stackImplementation.push("ThisisaTest");
		stackImplementation.push("This is a Test");
		assertEquals(stackImplementation.length(), 2);
	}
	
	@Test
	void stackShouldPushThreeValues() {
		stackImplementation.push("ThisisaTest");
		stackImplementation.push("This is a Test");
		stackImplementation.push("ThisisaTest");
		assertEquals(stackImplementation.length(), 3);
	}

	@Test
	void stackShouldPopValue() {
		stackImplementation.push("One");
		stackImplementation.pop();
		assertEquals(stackImplementation.length(), 0);
	}
	
	@Test
	void stackShouldPopTwoValues() {
		stackImplementation.push("One");
		stackImplementation.push("Two");
		stackImplementation.push("Three");
		stackImplementation.pop();
		stackImplementation.pop();
		assertEquals(stackImplementation.length(), 1);
	}
	
	@Test
	void stackShouldDisplayAStringForPopingOnEmptyStack() {
		stackImplementation.pop();
		equals("Stack is empty");
	}
	
	@Test
	void stackShouldDisplayTopValue() {
		String x = "Displayed Value";
		stackImplementation.push(x);
		assertEquals(stackImplementation.peek(), "Displayed Value");
	}
	
	@Test
	void stackShouldDisplayAStringIfPeekIsEmpty() {
		stackImplementation.peek();
		equals("Stack is empty");
	}
	
	@Test
	void stackShouldReturnZeroLengthIfEmpty() {
		assertEquals(stackImplementation.length(), 0);
	}
	
	//Repetitive
	@Test
	void stackShouldReturnLengthOfTwo() {
		stackImplementation.push("ThisisaTest");
		stackImplementation.push("This is a Test");
		assertEquals(stackImplementation.length(), 2);
	}
	
	@Test
	void stackShouldDisplayBooleanTrueIfEmpty() {
		assertEquals(stackImplementation.isEmpty(), true);
	}
	
	@Test
	void stackShouldDisplayOneIfSearchIsLookingForTopNode() {
		stackImplementation.push("One");
		stackImplementation.push("Two");
		stackImplementation.push("Three");
		assertEquals(stackImplementation.search("Three"), 1);
	}
	
	@Test
	void stackShouldDisplayTwoIfSearchIsLookingForSecondNode() {
		stackImplementation.push("One");
		stackImplementation.push("Two");
		stackImplementation.push("Three");
		assertEquals(stackImplementation.search("Two"), 2);
	}
	
	@Test
	void stackShouldDisplayZeroIfSearchIsLookingForUnknownNode() {
		stackImplementation.push("One");
		stackImplementation.push("Two");
		stackImplementation.push("Three");
		assertEquals(stackImplementation.search("Four"), 0);
	}
	
	@Test
	void stackShouldSwitchFromStringToInt() {
		StackImplementation<Integer> stackImplementation = new StackImplementation<Integer>();
		stackImplementation.push(1);
		stackImplementation.push(2);
		stackImplementation.push(3);
		assertEquals(stackImplementation.peek(), 3);
	}
}
