/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 12:32:29 GMT 2023
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.field.StrictDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LenientDateTimeField_ESTest extends LenientDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.era();
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dateTimeField0, buddhistChronology0);
      // Undeclared exception!
      try { 
        dateTimeField1.set((long) 1, 1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeField dateTimeField0 = LenientDateTimeField.getInstance((DateTimeField) null, (Chronology) null);
      assertNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.halfdayOfDay();
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(dateTimeField0, buddhistChronology0);
      StrictDateTimeField strictDateTimeField0 = new StrictDateTimeField(lenientDateTimeField0);
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(strictDateTimeField0, buddhistChronology0);
      assertSame(dateTimeField1, lenientDateTimeField0);
  }
}
