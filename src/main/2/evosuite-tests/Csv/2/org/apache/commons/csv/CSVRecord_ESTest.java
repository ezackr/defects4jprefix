/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 14:46:44 GMT 2024
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.apache.commons.csv.CSVRecord;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CSVRecord_ESTest extends CSVRecord_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "z@9R#W8%Q&dA}l\"", 0L);
      Consumer<String> consumer0 = (Consumer<String>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cSVRecord0.forEach(consumer0);
      assertEquals(0L, cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[3];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1L);
      cSVRecord0.getComment();
      assertEquals(1L, cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "z@9R#W8%Q&dA}l\"", 0L);
      String string0 = cSVRecord0.toString();
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "z@9R#W8%Q&dA}l\"", 0L);
      String[] stringArray0 = cSVRecord0.values();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "z@9R#W8%Q&dA}l\"", 0L);
      // Undeclared exception!
      try { 
        cSVRecord0.get((-2004318069));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2004318069
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "z@9R#W8%Q&dA}l\"", 0L);
      long long0 = cSVRecord0.getRecordNumber();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[7];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "Ki)Ihl4ZgxHg=S@D", (-2825L));
      cSVRecord0.size();
      assertEquals((-2825L), cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "z@9R#W8%Q&dA}l\"", 0L);
      String string0 = cSVRecord0.get((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "", (-1L));
      // Undeclared exception!
      try { 
        cSVRecord0.get("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No header mapping was specified, the record values can't be accessed by name
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[3];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 1L);
      Integer integer0 = Integer.getInteger("", 0);
      BiFunction<Integer, Object, Integer> biFunction0 = (BiFunction<Integer, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge((String) null, integer0, biFunction0);
      cSVRecord0.get((String) null);
      assertEquals(1L, cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "z@9R#W8%Q&dA}l\"", 0L);
      boolean boolean0 = cSVRecord0.isConsistent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[5];
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "OtzJG*ZRtmsq", 1486L);
      boolean boolean0 = cSVRecord0.isConsistent();
      assertTrue(boolean0);
      assertEquals(1486L, cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[7];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-1789569705));
      boolean boolean0 = cSVRecord0.isConsistent();
      assertFalse(boolean0);
      assertEquals((-1789569705L), cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[5];
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "OtzJG*ZRtmsq", 1486L);
      boolean boolean0 = cSVRecord0.isMapped("");
      assertEquals(1486L, cSVRecord0.getRecordNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "z@9R#W8%Q&dA}l\"", 0L);
      boolean boolean0 = cSVRecord0.isSet("z@9R#W8%Q&dA}l\"");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[7];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Integer integer0 = new Integer((-1789569705));
      hashMap0.put("", integer0);
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", (-1789569705));
      boolean boolean0 = cSVRecord0.isSet("");
      assertTrue(boolean0);
      assertEquals((-1789569705L), cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "z@9R#W8%Q&dA}l\"", 0L);
      Integer integer0 = new Integer(0);
      hashMap0.put("z@9R#W8%Q&dA}l\"", integer0);
      boolean boolean0 = cSVRecord0.isSet("z@9R#W8%Q&dA}l\"");
      assertFalse(boolean0);
  }
}
