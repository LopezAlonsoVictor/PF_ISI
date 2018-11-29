import static org.junit.Assert.*;
import org.junit.*;

public class MiBisiestoTest
{

    private bisiesto anyo;

    @Before      // Set up - Called before every test method.
    public void setUp()
    {
       anyo = new bisiesto();
    }

	@Test public void testAnyoCero()
	{
		assertTrue("Es bisiesto cero", true == anyo.esBisiesto(0));
	}

	@Test public void testAnyoPositivo()
	{
		assertTrue("Es bisiesto 1", false == anyo.esBisiesto(1));
	}

	@Test public void testAnyoNegativo()
	{
		assertTrue("Es bisiesto -1", false == anyo.esBisiesto(-1));
	}

	@Test public void testAnyoCien()
	{
		assertTrue("Es bisiesto 100", false == anyo.esBisiesto(100));
	}

	@Test public void testAnyoCuatro()
	{
		assertTrue("Es bisiesto 4", true == anyo.esBisiesto(4));
	}

	@Test public void testAnyoCuatrocientos()
	{
		assertTrue("Es bisiesto 400", true == anyo.esBisiesto(400));
	}
}
