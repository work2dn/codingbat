package com.lambda_or_functional_1_and_2;

/**
 * source: https://www.udemy.com/course/java-tutorial/learn/lecture/1467284#overview
 */

 /**
  * Java Functional API

list.replaceAll(lambda) -- calls the lambda once for each item in the list, storing the result back into the list (or other type of collection). 
e.g. nums.replaceAll(n -> n * 2);

list.removeIf(lambda) -- calls the lambda once for each item in the collection, removing each item where the lambda returns true. 
e.g. nums.removeIf(n -> n < 0);

Simple Lambda Examples -- the data types are inferred from the context and from the type of the expression following the "->": 
n -> n * 2 -- takes Integer, returns Integer 
n -> n < 0 && n >= -10 -- takes Integer, returns boolean 
s -> s.length()  -- takes String, returns Integer 
s -> s.startsWith("hi") -- takes String, returns boolean

The Java stream system provides more complicated lambda features. The stream calls do not modify the original list, returning a new data structure of the results. Note that the boolean logic of filter() is the opposite of removeIf().

  List<Integer> nums = -something-;
  nums = nums.stream()
    .map(n -> n * 2)
    .filter(n -> n >= 0)
    .collect(Collectors.toList());

  */
interface Executable {
	int execute(int a, int b);
}

interface StringExecutable {
	int execute(String a);
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block ...");
		int value = e.execute(12, 13);
		System.out.println("Return value is: " + value);
	}
	
	public void run(StringExecutable e) {
		System.out.println("Executing code block ...");
		int value = e.execute("Hello");
		System.out.println("Return value is: " + value);
	}
}

// () -> System.out.println("Hello there.")

/*
 * () -> { System.out.println("This is code passed in a lambda expression.");
 * System.out.println("Hello there.");
 * 
 * }
 */

/*
 * () -> { System.out.println("This is code passed in a lambda expression.");
 * System.out.println("Hello there."); return 8; }
 */

/*
 * () -> { return 8; }
 */

// () -> 8

// (int a) -> 8

/*
 (int a) -> {
			System.out.println("Hello there.");
			return 7 + a;
		}
 */

/*
 (a) -> {
			System.out.println("Hello there.");
			return 7 + a;
		}
 */

/*
 *  a -> {
			System.out.println("Hello there.");
			return 7 + a;
		}
 */

/*
 (a,b) -> {
			System.out.println("Hello there.");
			return 7 + a;
		}
 */

public class App {

	public static void main(String[] args) {
		
		int c = 100;
		// Mustn't do this: c = 8;
		
		int d = 77;

		Runner runner = new Runner();
		runner.run(new Executable() {
			public int execute(int a, int b) {
				System.out.println("Hello there.");
				// Can do this in methods of anonymous classes int d = 8;
				return a + b + c;
			}
		});

		System.out.println("======================");

		runner.run( (a,b) -> {
			System.out.println("Hello there.");
			// Can't do this; no new scope. int d = 99;
			return a + b + c;
		});
		
		System.out.println("======================");
		
		Executable ex = (a,b) -> {
			System.out.println("Hello there.");
			// Can't do this; no new scope. int d = 99;
			return a + b + c;
		};
		
		runner.run(ex);
		
		Object codeblock = (Executable)(a,b) -> {
			System.out.println("Hello there.");
			// Can't do this; no new scope. int d = 99;
			return a + b + c;
		};
		
		

	}
}
