import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciHeapTest {

    FibonacciHeap<Double> fHeap;

    @Before
    public void setUp() throws Exception {
        fHeap = new FibonacciHeap<Double>();
    }

    @Test
    public void testFibonacci1() throws Exception {
        fHeap.enqueue(new Double(10.0), 1);
        fHeap.enqueue(new Double(14.0), 1);
        fHeap.enqueue(new Double(8.0),1);
        fHeap.enqueue(new Double(5.0),1);
        fHeap.dequeueMin();
        fHeap.dequeueMin();

        assertEquals("EnqMergeEnqMergeEnqMergeEnqMergeDeqMergeMergeDeqMerge", fHeap.testString);

        fHeap.dequeueMin();
        fHeap.dequeueMin();

        fHeap.testString = "";
    }

    @Test
    public void testFibonacci2() throws Exception {
        fHeap.enqueue(new Double(5.0), 1);
        fHeap.enqueue(new Double(7.0), 1);
        fHeap.enqueue(new Double(25.0), 1);
        fHeap.enqueue(new Double(39.0), 1);
        fHeap.enqueue(new Double(42.0), 1);
        fHeap.enqueue(new Double(11.0), 1);
        fHeap.enqueue(new Double(3.0), 1);
        fHeap.enqueue(new Double(7.0), 1);
        fHeap.dequeueMin();
        fHeap.dequeueMin();
        fHeap.dequeueMin();

        assertEquals("EnqMergeEnqMergeEnqMergeEnqMergeEnqMergeEnqMergeEnqMergeEnqMergeDeqMergeMergeMergeMergeMergeDeqMergeDeqMerge", fHeap.testString);
    }
}