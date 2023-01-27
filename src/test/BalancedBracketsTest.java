package test;

import org.junit.Test;
import main.BalancedBrackets;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void reversedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void canContainNonBracketCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abcd]"));
    }
    @Test
    public void unclosedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void closedBracketWithoutOpenReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }
    @Test
    public void alternatingBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }
    @Test
    public void manyOpenBracketsOneClosedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[abcd]"));
    }
    @Test
    public void manyClosedBracketsOneOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[abcd]]]"));
    }
    @Test
    public void noBracketsAtAllReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("abcd"));
    }
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }


}
