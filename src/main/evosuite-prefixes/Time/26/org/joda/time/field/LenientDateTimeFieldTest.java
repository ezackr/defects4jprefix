/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 12:32:29 GMT 2023
 */
package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.field.StrictDateTimeField;
import org.junit.runner.RunWith;

public class LenientDateTimeFieldTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
        DateTimeField dateTimeField0 = buddhistChronology0.era();
        DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dateTimeField0, buddhistChronology0);
        dateTimeField1.set((long) 1, 1);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        DateTimeField dateTimeField0 = LenientDateTimeField.getInstance((DateTimeField) null, (Chronology) null);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
        DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
        LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(dateTimeField0, buddhistChronology0);
        StrictDateTimeField strictDateTimeField0 = new StrictDateTimeField(lenientDateTimeField0);
        DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(strictDateTimeField0, buddhistChronology0);
    }
}
