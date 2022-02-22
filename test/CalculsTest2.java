import static org.junit.jupiter.api.Assertions.*;


import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author Yo
 *
 */
@RunWith(Parameterized.class)
class CalculsTest2 {

	@Test
	void test() 
	{
		//fail("Not yet implemented");
	}
	
	static Stream<Arguments> chargerJeuDeTest2() throws Throwable 
	{
        return  Stream.of(
            Arguments.of(4,2,2), // appellera : testDiviser(4,2,2)
            Arguments.of(6,6,1),
            Arguments.of(8,2,4)
        );
    }
	@ParameterizedTest
	@MethodSource("chargerJeuDeTest2")
	void testDiviser1(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.diviser(), "test en échec pour " + firstNumber + " / " + secondNumber + " != " + expectedResult); 

	   
	}
	
	static Stream<Arguments> chargerJeuDeTest3() throws Throwable 
	{
        return  Stream.of(
            Arguments.of(4,2,6), // appellera : testAdditionner(4,2,6)
            Arguments.of(63,7,70),
            Arguments.of(88,20,108)
        );
    }
	@ParameterizedTest
	@MethodSource("chargerJeuDeTest3")
	void testAdditionner(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.additionner(), "test en échec pour " + firstNumber + " + " + secondNumber + " != " + expectedResult); 

	    
	}
	static Stream<Arguments> chargerJeuDeTest4() throws Throwable 
	{
        return  Stream.of(
            Arguments.of(4,2,2), // appellera : testsoustraire(4,2,2)
            Arguments.of(6,6,0),
            Arguments.of(8,0,8)
        );
    }
	@ParameterizedTest
	@MethodSource("chargerJeuDeTest4")
	void testSoustraire(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.soustraire(), "test en échec pour " + firstNumber + " - " + secondNumber + " != " + expectedResult); 

	   
	}
	
	
	
    static Stream<Arguments> chargerJeuDeTest() throws Throwable 
    {
        return Stream.of(
            Arguments.of(2,2,4), // appellera : testMultiplier(2,2,4)
            Arguments.of(6,6,36),
            Arguments.of(3,2,6)
        );
    }

	@ParameterizedTest(name="Multiplication numéro {index}: nombre1={0}, nombre2={1}, résultat attendu = {2}")
	@MethodSource("chargerJeuDeTest")
	void testMultiplier(int firstNumber, int secondNumber, int expectedResult) 
	{
		// Partie paramétrée
	        Calculs monCal = new Calculs(firstNumber, secondNumber);
	        assertEquals(expectedResult, monCal.multiplier(), "test en échec pour " + firstNumber + " * " + secondNumber + " != " + expectedResult); 

	    // Partie indépendante (les paramètres peuvent ne servir qu'à une sous partie des tests)
	        String n = null;
	        assertNull(n);
	}

}
