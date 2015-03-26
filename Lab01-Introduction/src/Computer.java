/**
 *  The computer class models a basic computer including the type of
 *  processor, speed, and number of cores.
 *  The class contains get methods to retrieve the values of the class and set
 *  methods to change these values. It also contains a method to calculate the
 *  power of the computer.
 *
 *  @author justinh7
 *  @version 2015.01.27
 */
public class Computer
{
    private String processor;
    private int numCores;
    private double processorSpeed;
    /**
     * Creates a new computer object given a processor, number of cores, and
     * processor speed.
     *
     * @param newProcessor Create the computer with this processor.
     * @param newNumCores Create the computer with this number of cores.
     * @param newProcessorSpeed Create the computer with this processor speed.
     */
    public Computer(String newProcessor,
                    int newNumCores,
                    double newProcessorSpeed )
    {
        processor = newProcessor;
        numCores = newNumCores;
        processorSpeed = newProcessorSpeed;

    }

    /**
     * Returns the computer's processor.
     *
     * @return The computer's processor as a String.
     */
    public String getProcessor()
    {
        return processor;
    }

    /**
     * Returns the number of cores in the computer.
     *
     * @return The computer's number of cores as an integer.
     */
    public int getNumCores()
    {
        return numCores;
    }

    /**
     * Returns the processor speed in the computer.
     *
     * @return The computer's processor speed as a double.
     */
    public double getProcessorSpeed()
    {
        return processorSpeed;
    }

    /**
     * Sets the processor to a new value.
     *
     * @param newProcessor the new processor value.
     */
    public void setProcessor(String newProcessor)
    {
        processor = newProcessor;
    }

    /**
     * Sets the number of processor cores to a new value.
     *
     * @param newNumCores the new number of cores.
     */
    public void setNumCores(int newNumCores)
    {
        numCores = newNumCores;
    }

    /**
     * Sets the processor speed to a new value.
     *
     * @param newProcessorSpeed the new processor speed.
     */
    public void setProcessorSpeed(double newProcessorSpeed)
    {
        processorSpeed = newProcessorSpeed;
    }

    /**
     * Computes an estimate of the power of the computer by multiplying
     * the number of cores by the processor speed.
     *
     * @return The computer's power as a double.
     */
    public double computePower()
    {
        return numCores * processorSpeed;
    }

    /**
     * Returns a representation of the computer object as a string.
     *
     * @return A summary of the computer as a string.
     */
    public String toString()
    {
        return processor + ", " +
               numCores + " cores at " +
               processorSpeed + "GHz";
    }
}
