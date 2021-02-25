package Bank.demoMavenEclipseProject;

	import static org.junit.Assert.assertEquals;
	import Bank.demoMavenEclipseProject.Calculator;
	import org.junit.Test;
	public class unitTesting {

		@Test
		public void test() {
			
			
			int resultSum = Calculator.sum(2,3);
			assertEquals(5, resultSum);
			
		/*	int resultMinus=test.sub(22, 15);
			assertEquals(7, resultMinus);
			
			int resultMultiply=test.testMultiply(6,7); 
				assertEquals(42, resultMultiply);
			
			int resultDivision=test.testDivision(12, 4);
				assertEquals(3, resultDivision); */
			
		}
		
		
		
		
		
	}

