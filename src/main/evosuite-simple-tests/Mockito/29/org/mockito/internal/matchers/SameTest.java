/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 05:16:03 GMT 2023
 */
package org.mockito.internal.matchers;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.RoundingMode;
import org.hamcrest.Description;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Same;

public class SameTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Character character0 = Character.valueOf('+');
        Same same0 = new Same(character0);
        Description.NullDescription description_NullDescription0 = new Description.NullDescription();
        same0.describeTo(description_NullDescription0);
        assertEquals("", description_NullDescription0.toString());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Same same0 = new Same((Object) null);
        RoundingMode roundingMode0 = RoundingMode.FLOOR;
        boolean boolean0 = same0.matches(roundingMode0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Character character0 = Character.valueOf('+');
        Same same0 = new Same(character0);
        boolean boolean0 = same0.matches(character0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        Same same0 = new Same("Jx|R!R5YnYXU%cz3uk ");
        Description.NullDescription description_NullDescription0 = new Description.NullDescription();
        same0.describeTo(description_NullDescription0);
        assertEquals("", description_NullDescription0.toString());
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        Same same0 = new Same((Object) null);
        // Undeclared exception!
        try {
            same0.toString();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }
}
