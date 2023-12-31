/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 17 02:02:01 GMT 2023
 */
package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.field.FieldUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        int int0 = FieldUtils.getWrappedValue((-2206), (-1), 1);
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        int int0 = FieldUtils.getWrappedValue(0, 0, Integer.MIN_VALUE, 0);
        assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.getWrappedValue(3912, 3349, 3912, 3349);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // MIN > MAX
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.verifyValueBounds("*<", 3566, (-495), (-495));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value 3566 for *< must be in the range [-495,-495]
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
        FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 0, 2022);
        assertEquals("hourOfHalfday", dateTimeFieldType0.toString());
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeMultiply(1605L, 10000000000000000L);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Multiplication overflows a long: 1605 * 10000000000000000
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeMultiply((-9223372036854775808L), (-851));
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Multiplication overflows a long: -9223372036854775808 * -851
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        int int0 = FieldUtils.safeMultiply((-1), (-2147483647));
        assertEquals(Integer.MAX_VALUE, int0);
    }

    @Test(timeout = 4000)
    public void test108() throws Throwable {
        int int0 = FieldUtils.safeMultiply(1, Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, int0);
    }

    @Test(timeout = 4000)
    public void test119() throws Throwable {
        long long0 = FieldUtils.safeSubtract((-861L), (-861L));
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test1210() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeAdd((-9223372036854775808L), (-9223372036854775808L));
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // The calculation caused an overflow: -9223372036854775808 + -9223372036854775808
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1311() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeAdd((-200), Integer.MIN_VALUE);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // The calculation caused an overflow: -200 + -2147483648
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1412() throws Throwable {
        int int0 = FieldUtils.safeToInt(0L);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1513() throws Throwable {
        int int0 = FieldUtils.safeToInt((-2147483648L));
        assertEquals(Integer.MIN_VALUE, int0);
    }

    @Test(timeout = 4000)
    public void test1614() throws Throwable {
        long long0 = FieldUtils.safeSubtract(0L, 0L);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test1715() throws Throwable {
        int int0 = FieldUtils.safeNegate((-1126));
        assertEquals(1126, int0);
    }

    @Test(timeout = 4000)
    public void test1816() throws Throwable {
        int int0 = FieldUtils.safeNegate(231);
        assertEquals((-231), int0);
    }

    @Test(timeout = 4000)
    public void test1917() throws Throwable {
        int int0 = FieldUtils.safeMultiplyToInt(0L, 0L);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test2018() throws Throwable {
        int int0 = FieldUtils.safeMultiplyToInt((-1440L), 2856L);
        assertEquals((-4112640), int0);
    }

    @Test(timeout = 4000)
    public void test2119() throws Throwable {
        long long0 = FieldUtils.safeMultiply(63L, (long) (-2206));
        assertEquals((-138978L), long0);
    }

    @Test(timeout = 4000)
    public void test2220() throws Throwable {
        long long0 = FieldUtils.safeMultiply((-1L), 2031);
        assertEquals((-2031L), long0);
    }

    @Test(timeout = 4000)
    public void test2321() throws Throwable {
        int int0 = FieldUtils.safeMultiply(0, 0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test2422() throws Throwable {
        long long0 = FieldUtils.safeAdd(0L, 0L);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test2523() throws Throwable {
        int int0 = FieldUtils.safeAdd(365, 365);
        assertEquals(730, int0);
    }

    @Test(timeout = 4000)
    public void test2624() throws Throwable {
        int int0 = FieldUtils.getWrappedValue(0, 0, 0, 412);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test2725() throws Throwable {
        int int0 = FieldUtils.getWrappedValue((-2283), Integer.MIN_VALUE, Integer.MIN_VALUE, 2);
        assertEquals((-2280), int0);
    }

    @Test(timeout = 4000)
    public void test2826() throws Throwable {
        int int0 = FieldUtils.getWrappedValue(Integer.MIN_VALUE, Integer.MIN_VALUE, (-1));
        assertEquals(Integer.MIN_VALUE, int0);
    }

    @Test(timeout = 4000)
    public void test2927() throws Throwable {
        int int0 = FieldUtils.getWrappedValue((-417), 231, 898);
        assertEquals(251, int0);
    }

    @Test(timeout = 4000)
    public void test3028() throws Throwable {
        int int0 = FieldUtils.getWrappedValue(1430, (-1), 17971875);
        assertEquals(1430, int0);
    }

    @Test(timeout = 4000)
    public void test3129() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.getWrappedValue(16, 16, 16);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // MIN > MAX
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test3230() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeToInt(9223372036854775807L);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Value cannot fit in an int: 9223372036854775807
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test3331() throws Throwable {
        int int0 = FieldUtils.safeToInt(2147483647L);
        assertEquals(Integer.MAX_VALUE, int0);
    }

    @Test(timeout = 4000)
    public void test3432() throws Throwable {
        long long0 = FieldUtils.safeMultiply(2147483647L, (long) 3224);
        assertEquals(6923487277928L, long0);
    }

    @Test(timeout = 4000)
    public void test3533() throws Throwable {
        long long0 = FieldUtils.safeMultiply(1L, 1L);
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test3634() throws Throwable {
        long long0 = FieldUtils.safeMultiply((-2359L), (-1));
        assertEquals(2359L, long0);
    }

    @Test(timeout = 4000)
    public void test3735() throws Throwable {
        Integer integer0 = new Integer(271);
        boolean boolean0 = FieldUtils.equals((Object) integer0, (Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3836() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
        DateTimeField dateTimeField0 = dateTimeFieldType0.getField((Chronology) null);
        Object object0 = new Object();
        boolean boolean0 = FieldUtils.equals((Object) dateTimeField0, object0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3937() throws Throwable {
        Object object0 = new Object();
        boolean boolean0 = FieldUtils.equals(object0, object0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test4038() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
        boolean boolean0 = FieldUtils.equals((Object) null, (Object) durationFieldType0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4139() throws Throwable {
        int int0 = FieldUtils.getWrappedValue((-2146907296), 0, 31);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test4240() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.verifyValueBounds("U:b", 0, 0, (-97));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value 0 for U:b must be in the range [0,-97]
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test4441() throws Throwable {
        Integer integer0 = new Integer(0);
        // Undeclared exception!
        try {
            FieldUtils.verifyValueBounds(" * ", (int) integer0, 3654, 0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value 0 for  *  must be in the range [3654,0]
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test4542() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
        // Undeclared exception!
        try {
            FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1), (-1570), (-1570));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value -1 for dayOfMonth must be in the range [-1570,-1570]
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test4643() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
        FieldUtils.verifyValueBounds(dateTimeFieldType0, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        assertEquals("secondOfMinute", dateTimeFieldType0.getName());
    }

    @Test(timeout = 4000)
    public void test4744() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.verifyValueBounds((DateTimeFieldType) null, (-1958), 100, (-1958));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.joda.time.IllegalFieldValueException", e);
        }
    }

    @Test(timeout = 4000)
    public void test4845() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.verifyValueBounds((DateTimeField) null, 841, (-251526), (-3169));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test5046() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
        DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
        // Undeclared exception!
        try {
            FieldUtils.verifyValueBounds(dateTimeField0, 1, 1776, (-1207));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Value 1 for millisOfSecond must be in the range [1776,-1207]
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test5147() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeMultiplyToInt((-761L), (-2147483648L));
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Value cannot fit in an int: 1634235056128
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test5248() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeToInt((-9223372036854775808L));
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Value cannot fit in an int: -9223372036854775808
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test5349() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeMultiply((-1L), (-9223372036854775800L));
            //  fail("Expecting exception: ArithmeticException");
            // Unstable assertion
        } catch (ArithmeticException e) {
            //
            // Multiplication overflows a long: -1 * -9223372036854775800
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test5450() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeMultiply((-9223372036854775808L), (-1L));
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Multiplication overflows a long: -9223372036854775808 * -1
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test5551() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeMultiply((-3520L), 1000000000000000000L);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Multiplication overflows a long: -3520 * 1000000000000000000
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test5652() throws Throwable {
        long long0 = FieldUtils.safeMultiply((-801L), 0L);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test5753() throws Throwable {
        long long0 = FieldUtils.safeMultiply((long) 0, (long) 0);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test5854() throws Throwable {
        int int0 = FieldUtils.safeMultiplyToInt(10L, 10L);
        assertEquals(100, int0);
    }

    @Test(timeout = 4000)
    public void test5955() throws Throwable {
        long long0 = FieldUtils.safeMultiply(1L, 170L);
        assertEquals(170L, long0);
    }

    @Test(timeout = 4000)
    public void test6056() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeMultiply(9223372036854775805L, 1017);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Multiplication overflows a long: 9223372036854775805 * 1017
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test6157() throws Throwable {
        Integer integer0 = new Integer(25);
        long long0 = FieldUtils.safeMultiply((long) integer0, 1);
        assertEquals(25L, long0);
    }

    @Test(timeout = 4000)
    public void test6258() throws Throwable {
        long long0 = FieldUtils.safeMultiply((long) 0, 0);
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test6359() throws Throwable {
        EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) null);
        long long0 = ethiopicChronology0.add((-313L), (-1556L), (-1));
        assertEquals(1243L, long0);
    }

    @Test(timeout = 4000)
    public void test6460() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeMultiply(Integer.MIN_VALUE, Integer.MIN_VALUE);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Multiplication overflows an int: -2147483648 * -2147483648
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test6561() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeMultiply(25, (-2145181949));
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Multiplication overflows an int: 25 * -2145181949
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test6662() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeSubtract((-9223372036854775776L), 21600000L);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // The calculation caused an overflow: -9223372036854775776 - 21600000
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test6763() throws Throwable {
        long long0 = FieldUtils.safeSubtract(0L, 10L);
        assertEquals((-10L), long0);
    }

    @Test(timeout = 4000)
    public void test6864() throws Throwable {
        long long0 = FieldUtils.safeSubtract(1907, (-1267));
        assertEquals(3174L, long0);
    }

    @Test(timeout = 4000)
    public void test6965() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeAdd((-1504L), (-9223372036854775808L));
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // The calculation caused an overflow: -1504 + -9223372036854775808
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test7066() throws Throwable {
        long long0 = FieldUtils.safeAdd(10L, (-1958L));
        assertEquals((-1948L), long0);
    }

    @Test(timeout = 4000)
    public void test7167() throws Throwable {
        long long0 = FieldUtils.safeAdd((long) 170, 1L);
        assertEquals(171L, long0);
    }

    @Test(timeout = 4000)
    public void test7268() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeAdd(2147483639, 2147483639);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // The calculation caused an overflow: 2147483639 + 2147483639
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test7369() throws Throwable {
        int int0 = FieldUtils.safeAdd(0, (-2456));
        assertEquals((-2456), int0);
    }

    @Test(timeout = 4000)
    public void test7470() throws Throwable {
        int int0 = FieldUtils.safeAdd(0, 0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test7571() throws Throwable {
        // Undeclared exception!
        try {
            FieldUtils.safeNegate(Integer.MIN_VALUE);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // Integer.MIN_VALUE cannot be negated
            //
            verifyException("org.joda.time.field.FieldUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test7672() throws Throwable {
        int int0 = FieldUtils.safeNegate(0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test7773() throws Throwable {
        int int0 = FieldUtils.safeMultiplyToInt(170L, 1L);
        assertEquals(170, int0);
    }
}
