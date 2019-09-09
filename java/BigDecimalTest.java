import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BigDecimalTest {


  public static void main(String[] args) {
    BigDecimal x = new BigDecimal("1.0");
    BigDecimal y = new BigDecimal("1.00");
    System.out.println(y.equals(x) + "" + x.compareTo(y));

    Set<BigDecimal> bigDecimalSet = new TreeSet<>();
    bigDecimalSet.add(x);
    bigDecimalSet.add(y);
    System.out.println(bigDecimalSet.size() + " " + bigDecimalSet);
    Set<BigDecimal> bigDecimalSet1 = new HashSet<>();
    bigDecimalSet1.add(x);
    bigDecimalSet1.add(y);
    System.out.println(bigDecimalSet1.size() + " " + bigDecimalSet1);
  }
}
