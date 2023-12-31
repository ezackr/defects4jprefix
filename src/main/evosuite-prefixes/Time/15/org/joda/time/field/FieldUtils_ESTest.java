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
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        int int0 = FieldUtils.getWrappedValue(0, 0, Integer.MIN_VALUE, 0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        FieldUtils.getWrappedValue(3912, 3349, 3912, 3349);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        FieldUtils.verifyValueBounds("*<", 3566, (-495), (-495));
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
        FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 0, 2022);
        dateTimeFieldType0.toString();
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        FieldUtils.safeMultiply(1605L, 10000000000000000L);
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        FieldUtils.safeMultiply((-9223372036854775808L), (-851));
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        int int0 = FieldUtils.safeMultiply((-1), (-2147483647));
    }

    @Test(timeout = 4000)
    public void test108() throws Throwable {
        int int0 = FieldUtils.safeMultiply(1, Integer.MIN_VALUE);
    }

    @Test(timeout = 4000)
    public void test119() throws Throwable {
        long long0 = FieldUtils.safeSubtract((-861L), (-861L));
    }

    @Test(timeout = 4000)
    public void test1210() throws Throwable {
        FieldUtils.safeAdd((-9223372036854775808L), (-9223372036854775808L));
    }

    @Test(timeout = 4000)
    public void test1311() throws Throwable {
        FieldUtils.safeAdd((-200), Integer.MIN_VALUE);
    }

    @Test(timeout = 4000)
    public void test1412() throws Throwable {
        int int0 = FieldUtils.safeToInt(0L);
    }

    @Test(timeout = 4000)
    public void test1513() throws Throwable {
        int int0 = FieldUtils.safeToInt((-2147483648L));
    }

    @Test(timeout = 4000)
    public void test1614() throws Throwable {
        long long0 = FieldUtils.safeSubtract(0L, 0L);
    }

    @Test(timeout = 4000)
    public void test1715() throws Throwable {
        int int0 = FieldUtils.safeNegate((-1126));
    }

    @Test(timeout = 4000)
    public void test1816() throws Throwable {
        int int0 = FieldUtils.safeNegate(231);
    }

    @Test(timeout = 4000)
    public void test1917() throws Throwable {
        int int0 = FieldUtils.safeMultiplyToInt(0L, 0L);
    }

    @Test(timeout = 4000)
    public void test2018() throws Throwable {
        int int0 = FieldUtils.safeMultiplyToInt((-1440L), 2856L);
    }

    @Test(timeout = 4000)
    public void test2119() throws Throwable {
        long long0 = FieldUtils.safeMultiply(63L, (long) (-2206));
    }

    @Test(timeout = 4000)
    public void test2220() throws Throwable {
        long long0 = FieldUtils.safeMultiply((-1L), 2031);
    }

    @Test(timeout = 4000)
    public void test2321() throws Throwable {
        int int0 = FieldUtils.safeMultiply(0, 0);
    }

    @Test(timeout = 4000)
    public void test2422() throws Throwable {
        long long0 = FieldUtils.safeAdd(0L, 0L);
    }

    @Test(timeout = 4000)
    public void test2523() throws Throwable {
        int int0 = FieldUtils.safeAdd(365, 365);
    }

    @Test(timeout = 4000)
    public void test2624() throws Throwable {
        int int0 = FieldUtils.getWrappedValue(0, 0, 0, 412);
    }

    @Test(timeout = 4000)
    public void test2725() throws Throwable {
        int int0 = FieldUtils.getWrappedValue((-2283), Integer.MIN_VALUE, Integer.MIN_VALUE, 2);
    }

    @Test(timeout = 4000)
    public void test2826() throws Throwable {
        int int0 = FieldUtils.getWrappedValue(Integer.MIN_VALUE, Integer.MIN_VALUE, (-1));
    }

    @Test(timeout = 4000)
    public void test2927() throws Throwable {
        int int0 = FieldUtils.getWrappedValue((-417), 231, 898);
    }

    @Test(timeout = 4000)
    public void test3028() throws Throwable {
        int int0 = FieldUtils.getWrappedValue(1430, (-1), 17971875);
    }

    @Test(timeout = 4000)
    public void test3129() throws Throwable {
        FieldUtils.getWrappedValue(16, 16, 16);
    }

    @Test(timeout = 4000)
    public void test3230() throws Throwable {
        FieldUtils.safeToInt(9223372036854775807L);
    }

    @Test(timeout = 4000)
    public void test3331() throws Throwable {
        int int0 = FieldUtils.safeToInt(2147483647L);
    }

    @Test(timeout = 4000)
    public void test3432() throws Throwable {
        long long0 = FieldUtils.safeMultiply(2147483647L, (long) 3224);
    }

    @Test(timeout = 4000)
    public void test3533() throws Throwable {
        long long0 = FieldUtils.safeMultiply(1L, 1L);
    }

    @Test(timeout = 4000)
    public void test3634() throws Throwable {
        long long0 = FieldUtils.safeMultiply((-2359L), (-1));
    }

    @Test(timeout = 4000)
    public void test3735() throws Throwable {
        Integer integer0 = new Integer(271);
        boolean boolean0 = FieldUtils.equals((Object) integer0, (Object) null);
    }

    @Test(timeout = 4000)
    public void test3836() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
        DateTimeField dateTimeField0 = dateTimeFieldType0.getField((Chronology) null);
        Object object0 = new Object();
        boolean boolean0 = FieldUtils.equals((Object) dateTimeField0, object0);
    }

    @Test(timeout = 4000)
    public void test3937() throws Throwable {
        Object object0 = new Object();
        boolean boolean0 = FieldUtils.equals(object0, object0);
    }

    @Test(timeout = 4000)
    public void test4038() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
        DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
        boolean boolean0 = FieldUtils.equals((Object) null, (Object) durationFieldType0);
    }

    @Test(timeout = 4000)
    public void test4139() throws Throwable {
        int int0 = FieldUtils.getWrappedValue((-2146907296), 0, 31);
    }

    @Test(timeout = 4000)
    public void test4240() throws Throwable {
        FieldUtils.verifyValueBounds("U:b", 0, 0, (-97));
    }

    @Test(timeout = 4000)
    public void test4441() throws Throwable {
        Integer integer0 = new Integer(0);
        FieldUtils.verifyValueBounds(" * ", (int) integer0, 3654, 0);
    }

    @Test(timeout = 4000)
    public void test4542() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
        FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1), (-1570), (-1570));
    }

    @Test(timeout = 4000)
    public void test4643() throws Throwable {
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
        FieldUtils.verifyValueBounds(dateTimeFieldType0, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        dateTimeFieldType0.getName();
    }

    @Test(timeout = 4000)
    public void test4744() throws Throwable {
        FieldUtils.verifyValueBounds((DateTimeFieldType) null, (-1958), 100, (-1958));
    }

    @Test(timeout = 4000)
    public void test4845() throws Throwable {
        FieldUtils.verifyValueBounds((DateTimeField) null, 841, (-251526), (-3169));
    }

    @Test(timeout = 4000)
    public void test5046() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
        DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
        FieldUtils.verifyValueBounds(dateTimeField0, 1, 1776, (-1207));
    }

    @Test(timeout = 4000)
    public void test5147() throws Throwable {
        FieldUtils.safeMultiplyToInt((-761L), (-2147483648L));
    }

    @Test(timeout = 4000)
    public void test5248() throws Throwable {
        FieldUtils.safeToInt((-9223372036854775808L));
    }

    @Test(timeout = 4000)
    public void test5349() throws Throwable {
        FieldUtils.safeMultiply((-1L), (-9223372036854775800L));
    }

    @Test(timeout = 4000)
    public void test5450() throws Throwable {
        FieldUtils.safeMultiply((-9223372036854775808L), (-1L));
    }

    @Test(timeout = 4000)
    public void test5551() throws Throwable {
        FieldUtils.safeMultiply((-3520L), 1000000000000000000L);
    }

    @Test(timeout = 4000)
    public void test5652() throws Throwable {
        long long0 = FieldUtils.safeMultiply((-801L), 0L);
    }

    @Test(timeout = 4000)
    public void test5753() throws Throwable {
        long long0 = FieldUtils.safeMultiply((long) 0, (long) 0);
    }

    @Test(timeout = 4000)
    public void test5854() throws Throwable {
        int int0 = FieldUtils.safeMultiplyToInt(10L, 10L);
    }

    @Test(timeout = 4000)
    public void test5955() throws Throwable {
        long long0 = FieldUtils.safeMultiply(1L, 170L);
    }

    @Test(timeout = 4000)
    public void test6056() throws Throwable {
        FieldUtils.safeMultiply(9223372036854775805L, 1017);
    }

    @Test(timeout = 4000)
    public void test6157() throws Throwable {
        Integer integer0 = new Integer(25);
        long long0 = FieldUtils.safeMultiply((long) integer0, 1);
    }

    @Test(timeout = 4000)
    public void test6258() throws Throwable {
        long long0 = FieldUtils.safeMultiply((long) 0, 0);
    }

    @Test(timeout = 4000)
    public void test6359() throws Throwable {
        EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) null);
        long long0 = ethiopicChronology0.add((-313L), (-1556L), (-1));
    }

    @Test(timeout = 4000)
    public void test6460() throws Throwable {
        FieldUtils.safeMultiply(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Test(timeout = 4000)
    public void test6561() throws Throwable {
        FieldUtils.safeMultiply(25, (-2145181949));
    }

    @Test(timeout = 4000)
    public void test6662() throws Throwable {
        FieldUtils.safeSubtract((-9223372036854775776L), 21600000L);
    }

    @Test(timeout = 4000)
    public void test6763() throws Throwable {
        long long0 = FieldUtils.safeSubtract(0L, 10L);
    }

    @Test(timeout = 4000)
    public void test6864() throws Throwable {
        long long0 = FieldUtils.safeSubtract(1907, (-1267));
    }

    @Test(timeout = 4000)
    public void test6965() throws Throwable {
        FieldUtils.safeAdd((-1504L), (-9223372036854775808L));
    }

    @Test(timeout = 4000)
    public void test7066() throws Throwable {
        long long0 = FieldUtils.safeAdd(10L, (-1958L));
    }

    @Test(timeout = 4000)
    public void test7167() throws Throwable {
        long long0 = FieldUtils.safeAdd((long) 170, 1L);
    }

    @Test(timeout = 4000)
    public void test7268() throws Throwable {
        FieldUtils.safeAdd(2147483639, 2147483639);
    }

    @Test(timeout = 4000)
    public void test7369() throws Throwable {
        int int0 = FieldUtils.safeAdd(0, (-2456));
    }

    @Test(timeout = 4000)
    public void test7470() throws Throwable {
        int int0 = FieldUtils.safeAdd(0, 0);
    }

    @Test(timeout = 4000)
    public void test7571() throws Throwable {
        FieldUtils.safeNegate(Integer.MIN_VALUE);
    }

    @Test(timeout = 4000)
    public void test7672() throws Throwable {
        int int0 = FieldUtils.safeNegate(0);
    }

    @Test(timeout = 4000)
    public void test7773() throws Throwable {
        int int0 = FieldUtils.safeMultiplyToInt(170L, 1L);
    }
}
