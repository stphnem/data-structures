import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class MyStackTest {

    private MyStack<Integer> stack;

    @Before
    public void setup() {
        this.stack = new MyStack();
    }

    @Test
    public void createStack() {
        assertNotNull(stack);
    }

    @Test(expected = EmptyStackException.class)
    public void topThrowsExceptionWhenEmpty() throws Exception {
        stack.peek();
    }

    @Test
    public void addItemToStack() {
        assertEquals(new Integer(1), stack.push(1));
    }

    @Test
    public void popFromStackWhenNotEmpty() {
        stack.push(1);
        assertEquals(new Integer(1), stack.pop());
    }

    @Test
    public void popFromStackWhenEmpty() {
        
    }
}