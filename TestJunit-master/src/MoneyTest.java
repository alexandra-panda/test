

import junit.framework.TestCase;

public class MoneyTest extends TestCase {

    public MoneyTest(String name) {
        super(name);
    }

    public void testSimpleAdd() {
        Money m12CHF = new Money(12, "CHF");
        Money m14CHF = new Money(14, "CHF");

        Money expected = new Money(26, "CHF");
        Money result = m12CHF.add(m14CHF);

        assertTrue(expected.equals(result));
    }

    public void testEquals() {
        Money m12CHF = new Money(12, "CHF");
        Money m14CHF = new Money(14, "CHF");

        Boolean expectedResult = false;
        Boolean result = m12CHF.equals(m14CHF);
        assertTrue(expectedResult.equals(result));
    }
}
