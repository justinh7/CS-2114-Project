import student.*;

//-------------------------------------------------------------------------
/**
*  Unit tests for the {@link Computer} class.
*
*  @author  justinh7
*  @version 2015.01.27
*/
public class ComputerTest
    extends student.TestCase
{
 //~ Instance/static fields ...............................................
    private Computer computer;


 //~ Constructor ..........................................................

 // ----------------------------------------------------------
    /**
    * Creates a new ComputerTest object.
    */
    public ComputerTest()
    {
     // The constructor is usually empty in unit tests, since it runs
     // once for the whole class, not once for each test method.
     // Per-test initialization should be placed in setUp() instead.
    }


 //~ Methods ...............................................................

 // ----------------------------------------------------------
    /**
    * Sets up the test fixture.
    * Called before every test case method.
    */
    public void setUp()
    {
        computer = new Computer("Intel Core i7", 4, 2.4);
    }


 // ----------------------------------------------------------
 /* Insert your own test methods here */

    /**
     * Tests the getProcessor method of the {@link Computer} class.
     *
     */
    public void testGetProcessor()
    {
        assertEquals("Intel Core i7", computer.getProcessor());
    }

    /**
     * Tests the getNumCores method of the {@link Computer} class.
     *
     */
    public void testGetNumCores()
    {
        assertEquals(4, computer.getNumCores());
    }

    /**
     * Tests the getProcessorSpeed method of the {@link Computer} class.
     *
     */
    public void testGetProcessorSpeed()
    {
        assertEquals(2.4, computer.getProcessorSpeed(), 0.01);
    }

    /**
     * Tests the setProcessor of the {@link Computer} class.
     */
    public void testSetProcessor()
    {
        computer.setProcessor("Intel Core Duo");
        assertEquals("Intel Core Duo", computer.getProcessor());
    }

    /**
     * Tests the setNumCores method of the {@link Computer} class.
     *
     */
    public void testSetNumCores()
    {
        computer.setNumCores(2);
        assertEquals(2, computer.getNumCores());
    }

    /**
     * Tests the setProcessorSpeed method of the {@link Computer} class.
     *
     */
    public void testSetProcessorSpeed()
    {
        computer.setProcessorSpeed(2.0);
        assertEquals(2.0, computer.getProcessorSpeed(), 0.01);
    }

    /**
     * Tests the computePower method of the {@link Computer} class.
     */
    public void testComputePower()
    {
        double power = computer.computePower();
        assertEquals(9.6, power, 0.01);
    }

    /**
     * Tests the toString method of the {@link Computer} class.
     */
    public void testToString()
    {
        assertEquals("Intel Core i7, 4 cores at 2.4GHz", computer.toString());
    }
}