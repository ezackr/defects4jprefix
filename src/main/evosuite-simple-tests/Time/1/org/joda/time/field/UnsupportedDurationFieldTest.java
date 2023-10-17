/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 17 00:28:47 GMT 2023
 */
package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.Months;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.UnsupportedDurationField;
import org.junit.runner.RunWith;

public class UnsupportedDurationFieldTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        DurationFieldType durationFieldType1 = unsupportedDurationField0.getType();
        assertEquals("weekyears", durationFieldType1.toString());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
        // Undeclared exception!
        try {
            unsupportedDurationField0.toString();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
        // Undeclared exception!
        try {
            unsupportedDurationField0.hashCode();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
        // Undeclared exception!
        try {
            unsupportedDurationField0.getName();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Months months0 = Months.THREE;
        DurationFieldType durationFieldType0 = months0.getFieldType();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        // Undeclared exception!
        try {
            unsupportedDurationField0.compareTo((DurationField) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.months();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        UnsupportedDurationField unsupportedDurationField1 = UnsupportedDurationField.getInstance(durationFieldType0);
        assertSame(unsupportedDurationField1, unsupportedDurationField0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.millis();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean0 = unsupportedDurationField0.isSupported();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        long long0 = unsupportedDurationField0.getUnitMillis();
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.eras();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        String string0 = unsupportedDurationField0.getName();
        assertEquals("eras", string0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.eras();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
        UnsupportedDurationField unsupportedDurationField1 = UnsupportedDurationField.getInstance(durationFieldType0);
        // Undeclared exception!
        try {
            unsupportedDurationField0.equals(unsupportedDurationField1);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean0 = unsupportedDurationField0.equals(unsupportedDurationField0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.months();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean0 = unsupportedDurationField0.equals(durationFieldType0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
        DurationField durationField0 = buddhistChronology0.weekyears();
        int int0 = unsupportedDurationField0.compareTo(durationField0);
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
        DurationField durationField0 = buddhistChronology0.weekyears();
        int int0 = unsupportedDurationField0.compareTo(durationField0);
        assertFalse(unsupportedDurationField0.isSupported());
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.eras();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        int int0 = unsupportedDurationField0.compareTo((DurationField) unsupportedDurationField0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.centuries();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        String string0 = unsupportedDurationField0.toString();
        assertEquals("UnsupportedDurationField[centuries]", string0);
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        // Undeclared exception!
        try {
            unsupportedDurationField0.getValueAsLong(232L, 232L);
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // halfdays field is unsupported
        }
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.months();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        // Undeclared exception!
        try {
            unsupportedDurationField0.getMillis(165);
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // months field is unsupported
        }
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
        // Undeclared exception!
        try {
            unsupportedDurationField0.getMillis((-26L));
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // null field is unsupported
        }
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.hours();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean0 = unsupportedDurationField0.isPrecise();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        // Undeclared exception!
        try {
            unsupportedDurationField0.getValue((long) (-850), (long) (-850));
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // halfdays field is unsupported
        }
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
        DurationFieldType durationFieldType0 = unsupportedDurationField0.getType();
        assertNull(durationFieldType0);
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.eras();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        // Undeclared exception!
        try {
            unsupportedDurationField0.getDifference(1, 1);
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // eras field is unsupported
        }
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.eras();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        // Undeclared exception!
        try {
            unsupportedDurationField0.getMillis(0L, (-763L));
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // eras field is unsupported
        }
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance((DurationFieldType) null);
        // Undeclared exception!
        try {
            unsupportedDurationField0.getValueAsLong(1L);
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // null field is unsupported
        }
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        // Undeclared exception!
        try {
            unsupportedDurationField0.getValue((long) (-2371));
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // halfdays field is unsupported
        }
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        // Undeclared exception!
        try {
            unsupportedDurationField0.getDifferenceAsLong(1, 1);
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // weekyears field is unsupported
        }
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.eras();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        // Undeclared exception!
        try {
            unsupportedDurationField0.add(0L, (-980));
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // eras field is unsupported
        }
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.hours();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        // Undeclared exception!
        try {
            unsupportedDurationField0.add(0L, 0L);
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // hours field is unsupported
        }
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        DurationFieldType durationFieldType0 = DurationFieldType.centuries();
        UnsupportedDurationField unsupportedDurationField0 = UnsupportedDurationField.getInstance(durationFieldType0);
        // Undeclared exception!
        try {
            unsupportedDurationField0.getMillis(2408, (long) 2408);
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // centuries field is unsupported
        }
    }
}
