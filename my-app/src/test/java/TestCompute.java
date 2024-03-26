import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }

  @Test
  public void sizeTest() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(0);
    c = new Compute(mq);
    int a=c.countNumberOfOccurrences(null);
    assertEquals(a, -1);
  }

  @Test
  public void stringDoesNotContainTest() {
    MessageQueue mq = mock(MessageQueue.class);
    String s="aaa";
    when(mq.contains(s)).thenReturn(false);
    when(mq.size()).thenReturn(1);
    c = new Compute(mq);
    int a=c.countNumberOfOccurrences(s);
    assertEquals(a, 0);
  }

  @Test
  public void valueTest() {
    MessageQueue mq = mock(MessageQueue.class);
    String s="aaa";
    when(mq.contains(s)).thenReturn(true);
    when(mq.size()).thenReturn(1);
    when(mq.getAt(0)).thenReturn(s);
    c = new Compute(mq);
    int a=c.countNumberOfOccurrences(s);
    assertEquals(a, 1);
  }
  @Test
  public void valueTest2() {
    MessageQueue mq = mock(MessageQueue.class);
    String s="aaa";
    when(mq.contains(s)).thenReturn(true);
    when(mq.size()).thenReturn(1);
    when(mq.getAt(0)).thenReturn("s");
    c = new Compute(mq);
    int a=c.countNumberOfOccurrences(s);
    assertEquals(a, 0);
  }
}