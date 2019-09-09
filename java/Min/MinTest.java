import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MinTest {
  private List<String> list;

  @Before
  public void setUp() throws Exception {
    list = new ArrayList<>();
  }

  @After
  public void tearDown() throws Exception {
    list = null;
  }

  @Test(expected = NullPointerException.class)
  public void testForNullList() {
    list = null;
    Min.min(list);
  }

  @Test(expected = NullPointerException.class)
  public void testForNullElement() {
    list.add(null);
    list.add("cat");
    Min.min(list);
  }

  @Test(expected = NullPointerException.class)
  public void testForSoloNullElement() {
    list.add(null);
    Min.min(list);
  }

  @Test(expected = ClassCastException.class)
  @SuppressWarnings("unchecked")
  public void testMutuallyIncomparable() {
    List list = new ArrayList();
    list.add("cat");
    list.add("dog");
    list.add(1);
    Min.min(list);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testEmptyList() {
    Min.min(list);
  }

  @Test
  public void testSingleElement(){
    list.add("cat");
    Object object = Min.min(list);
    assertEquals("Single element list", "cat", object);
  }

  @Test
  public void testDoubleElements(){
    list.add("dog");
    list.add("cat");
    Object object = Min.min(list);
    assertEquals("Double element list", "cat", object);
  }
}
