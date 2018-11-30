import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MiRomanNumeralTest
{
	private String word;   // Test fixture
	private RomanNumeral number;

   @Before      // Set up - Called before every test method.
   public void setUp()
   {
	  number = new RomanNumeral();
      word = new String();

   }

   @After      // Tear down - Called after every test method.
   public void tearDown()
   {
	  number = null;
      word = null;  // redundant in this example!
   }

	@Test
   public void testForNull()
   {
      word = null;

			String result = number.convierte (word);
			assertEquals("Error, el numero introducido es invalido", result);

   }

  /* @Test (expected = IllegalArgumentException.class)
   public void testEmptyList()
   {
      RomanNumeral.convierte(word);
   }*/

   @Test 
   @SuppressWarnings ("unchecked")
   public void testMutuallyIncomparable()
   {
	   	word = "II1";
	    String result = number.convierte (word);
			assertEquals("Error, el numero introducido es invalido", result);
   }

   @Test
   @SuppressWarnings ("unchecked")
   public void testcuatroI()
   {
	   	word = "IIII";
	    String result = number.convierte (word);
			assertEquals("Error, el numero introducido es invalido", result);
   }

   @Test
   @SuppressWarnings ("unchecked")
   public void testcuatroC()
   {
	   	word = "CCCC";
	    String result = number.convierte (word);
			assertEquals("Error, el numero introducido es invalido", result);
   }

   @Test
   @SuppressWarnings ("unchecked")
   public void testcuatroX()
   {
	   	word = "XXXX";
	    String result = number.convierte (word);
			assertEquals("Error, el numero introducido es invalido", result);
   }

   @Test
   @SuppressWarnings ("unchecked")
   public void testdosL()
   {
	   	word = "LL";
	    String result = number.convierte (word);
			assertEquals("Error, el numero introducido es invalido", result);
   }

   @Test
   @SuppressWarnings ("unchecked")
   public void testdosV()
   {
	   	word = "VV";
	    String result = number.convierte (word);
			assertEquals("Error, el numero introducido es invalido", result);
   }

   @Test
   @SuppressWarnings ("unchecked")
   public void testdosD()
   {
   	word = "DD";
    String result = number.convierte (word);
		assertEquals("Error, el numero introducido es invalido", result);
   }

}
