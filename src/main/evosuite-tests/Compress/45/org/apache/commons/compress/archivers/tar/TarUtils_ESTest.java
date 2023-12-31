/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 16:06:45 GMT 2023
 */

package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.tar.TarUtils;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TarUtils_ESTest extends TarUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)2;
      byteArray0[0] = (byte)2;
      byte byte1 = (byte)0;
      byteArray0[1] = (byte)0;
      byte byte2 = (byte)0;
      byteArray0[2] = (byte)0;
      byte byte3 = (byte)93;
      byteArray0[3] = (byte)93;
      byteArray0[4] = (byte)32;
      TarUtils.computeCheckSum(byteArray0);
      ZipEncoding zipEncoding0 = TarUtils.DEFAULT_ENCODING;
      TarUtils.formatNameBytes("UTF-8", byteArray0, 0, (int) (byte)0, zipEncoding0);
      TarUtils.formatUnsignedOctalString(0L, byteArray0, (byte)0, (byte)32);
      int int0 = 1310;
      TarUtils.parseOctalOrBinary(byteArray0, int0, byteArray0[0]);
      TarUtils.computeCheckSum(byteArray0);
      byte[] byteArray1 = new byte[6];
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = (-63);
      TarUtils.formatLongOctalBytes((-48L), byteArray0, (-63), 2993);
      int int1 = 0;
      // Undeclared exception!
      try { 
        TarUtils.parseOctal(byteArray0, int0, int1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2928
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)81;
      byteArray0[1] = (byte)0;
      byte byte0 = (byte)22;
      byteArray0[2] = (byte)22;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)122;
      TarUtils.parseOctalOrBinary(byteArray0, (byte)0, 0);
      String string0 = "{r)JRBORn+{Y3J";
      ZipEncoding zipEncoding0 = TarUtils.DEFAULT_ENCODING;
      TarUtils.formatNameBytes(string0, byteArray0, (int) byteArray0[1], (int) byte0, zipEncoding0);
      long long0 = 388L;
      // Undeclared exception!
      try { 
        TarUtils.formatLongOctalOrBinaryBytes(long0, byteArray0, byteArray0[0], byteArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Length 0 must be at least 2
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte) (-39);
      byteArray0[0] = (byte) (-39);
      byte byte1 = (byte) (-125);
      byteArray0[1] = (byte) (-125);
      byte byte2 = (byte)49;
      byteArray0[2] = (byte)49;
      byte byte3 = (byte) (-93);
      byteArray0[3] = (byte) (-93);
      int int0 = 8730;
      // Undeclared exception!
      try { 
        TarUtils.parseName(byteArray0, 8730, (int) (byte)49);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8778
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)38;
      byteArray0[1] = (byte)125;
      TarUtils.parseName(byteArray0, 0, (-1468));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)33;
      byte byte0 = (byte)127;
      byteArray0[1] = (byte)127;
      byte byte1 = (byte)8;
      byteArray0[2] = (byte)8;
      byte byte2 = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      TarUtils.computeCheckSum(byteArray0);
      TarUtils.parseOctalOrBinary(byteArray0, (byte)8, (byte)0);
      int int0 = 0;
      // Undeclared exception!
      try { 
        TarUtils.parseBoolean(byteArray0, int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)87;
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)87;
      byteArray0[3] = (byte)0;
      TarUtils.parseBoolean(byteArray0, 329);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipEncoding zipEncoding0 = TarUtils.DEFAULT_ENCODING;
      ZipEncoding zipEncoding1 = TarUtils.DEFAULT_ENCODING;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)90;
      byteArray0[2] = (byte) (-52);
      byteArray0[3] = (byte)127;
      byteArray0[4] = (byte) (-61);
      TarUtils.parseName(byteArray0, (int) (byte) (-61), (int) (byte) (-61));
      TarUtils.computeCheckSum(byteArray0);
      TarUtils.formatLongOctalOrBinaryBytes((byte) (-106), byteArray0, 9561, (-2143722729));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)62;
      byteArray0[1] = (byte)9;
      byteArray0[2] = (byte)6;
      byteArray0[3] = (byte) (-74);
      TarUtils.formatCheckSumOctalBytes(1L, byteArray0, (-1453), (-373));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      ZipEncoding zipEncoding0 = TarUtils.DEFAULT_ENCODING;
      TarUtils.formatNameBytes("AEp]<", byteArray0, (int) (byte)0, (int) (byte)0, zipEncoding0);
      TarUtils.parseBoolean(byteArray0, (byte)0);
      TarUtils.computeCheckSum(byteArray0);
      TarUtils.formatCheckSumOctalBytes((-5965L), byteArray0, (byte)0, 787);
      String string0 = "At offset ";
      int int0 = 1927;
      int int1 = 0;
      // Undeclared exception!
      try { 
        TarUtils.formatNameBytes(string0, byteArray0, int0, int1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 784
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      TarUtils.formatOctalBytes(0L, byteArray0, (byte)0, 616);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
      TarUtils.parseName(byteArray0, (-1173), (-1173), zipEncoding0);
      TarUtils.parseName(byteArray0, 0, (-1173));
      TarUtils.formatNameBytes("|`*VMYXw:9", byteArray0, (-1173), 0);
      TarUtils.verifyCheckSum(byteArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)49;
      ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
      TarUtils.formatNameBytes("dv@VnX%", byteArray0, 0, (-668), zipEncoding0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = null;
      int int0 = 2028;
      // Undeclared exception!
      try { 
        TarUtils.parseBoolean((byte[]) null, 2028);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte)59;
      byteArray0[0] = (byte)59;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)111;
      byteArray0[3] = (byte)50;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      TarUtils.formatLongOctalBytes(1055L, byteArray0, (byte)59, 63);
      String string0 = null;
      int int0 = 1294;
      ZipEncoding zipEncoding0 = TarUtils.DEFAULT_ENCODING;
      TarUtils.formatNameBytes(string0, byteArray0, int0, (int) byte0, zipEncoding0);
      int int1 = 498;
      int int2 = 124;
      // Undeclared exception!
      try { 
        TarUtils.parseName(byteArray0, int1, int2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 120
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)96;
      byte byte0 = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byte byte1 = (byte)92;
      byteArray0[3] = (byte)92;
      byte byte2 = (byte)0;
      byteArray0[4] = (byte)0;
      byte byte3 = (byte)119;
      byteArray0[5] = (byte)119;
      byte byte4 = (byte)6;
      byteArray0[6] = (byte)6;
      byte byte5 = (byte) (-24);
      byteArray0[7] = (byte) (-24);
      byte byte6 = (byte)28;
      byteArray0[8] = (byte)28;
      TarUtils.parseName(byteArray0, (int) (byte)6, (int) (byte)28);
      int int0 = (-1645);
      // Undeclared exception!
      try { 
        TarUtils.formatCheckSumOctalBytes(byte0, byteArray0, int0, byteArray0[6]);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 33
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-61);
      byte byte0 = (byte)111;
      byteArray0[2] = (byte)111;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-41);
      byteArray0[5] = (byte)51;
      byteArray0[6] = (byte) (-12);
      TarUtils.formatOctalBytes(929L, byteArray0, 225, (-3730));
      int int0 = (-392);
      TarUtils.formatLongOctalOrBinaryBytes(byteArray0[1], byteArray0, int0, byteArray0[1]);
      TarUtils.computeCheckSum(byteArray0);
      ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
      TarUtils.parseName(byteArray0, (int) byte0, (int) byteArray0[0], zipEncoding0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-97);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)14;
      byteArray0[3] = (byte)63;
      TarUtils.parseOctalOrBinary(byteArray0, (byte)63, 1123);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-86);
      byteArray0[1] = (byte)78;
      byteArray0[2] = (byte)101;
      byteArray0[3] = (byte)0;
      byte byte0 = (byte)0;
      byteArray0[4] = (byte)0;
      byte byte1 = (byte)34;
      byteArray0[5] = (byte)34;
      byteArray0[6] = (byte) (-28);
      byte byte2 = (byte) (-128);
      byteArray0[7] = (byte) (-128);
      TarUtils.parseBoolean(byteArray0, 2);
      TarUtils.formatLongOctalBytes((byte) (-28), byteArray0, (byte)34, 0);
      long long0 = 830L;
      TarUtils.formatLongOctalBytes(long0, byteArray0, byte0, byteArray0[6]);
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = byte1;
      int int0 = 255;
      TarUtils.parseOctalOrBinary(byteArray1, int0, byte2);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-66);
      byteArray0[2] = (byte) (-7);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-2);
      byteArray0[5] = (byte)16;
      byteArray0[6] = (byte)116;
      TarUtils.formatNameBytes("Jx0DNRLj<alwcB8)!l", byteArray0, 0, (int) (byte) (-7));
      TarUtils.parseName(byteArray0, (-3843), 1663);
      long long0 = 2807L;
      byte[] byteArray1 = new byte[1];
      byte byte0 = (byte)0;
      byteArray1[0] = byte0;
      TarUtils.formatCheckSumOctalBytes(long0, byteArray1, byteArray0[4], byteArray0[1]);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-15);
      TarUtils.verifyCheckSum(byteArray0);
      long long0 = (-1259L);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        TarUtils.verifyCheckSum(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 148
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = null;
      int int0 = 128;
      int int1 = 32;
      TarUtils.formatLongOctalBytes(0L, (byte[]) null, 128, 32);
      long long0 = 0L;
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = 4572;
      TarUtils.formatUnsignedOctalString(0L, byteArray0, 4572, 913);
      TarUtils.parseBoolean(byteArray0, int0);
      String string0 = "|Tk";
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = 2;
      TarUtils.formatCheckSumOctalBytes((-1260L), byteArray0, 2, (-3132));
      String string0 = "(u,+Kse";
      int int1 = 0;
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = null;
      // Undeclared exception!
      try { 
        TarUtils.verifyCheckSum((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)106;
      byte byte0 = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-128);
      ZipEncoding zipEncoding0 = null;
      TarUtils.formatNameBytes("\"jpGIED/po-SHzQnU", byteArray0, 0, (int) (byte)106, (ZipEncoding) null);
      int int0 = 0;
      TarUtils.parseName(byteArray0, (int) byte0, int0);
      long long0 = 77L;
      // Undeclared exception!
      try { 
        TarUtils.formatLongOctalOrBinaryBytes(long0, byteArray0, byte0, byteArray0[0]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte) (-81);
      byteArray0[0] = (byte) (-81);
      byteArray0[1] = (byte)39;
      byte byte1 = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-21);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)123;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)32;
      byteArray0[8] = (byte)0;
      ZipEncoding zipEncoding0 = TarUtils.DEFAULT_ENCODING;
      TarUtils.formatNameBytes("L=uZ", byteArray0, 684, 0, zipEncoding0);
      int int0 = 0;
      TarUtils.parseName(byteArray0, (int) byteArray0[6], int0, zipEncoding0);
      int int1 = 995;
      TarUtils.parseOctal(byteArray0, int1, byte0);
      String string0 = "";
      int int2 = 0;
      TarUtils.formatNameBytes(string0, byteArray0, int2, (int) byte1);
      TarUtils.verifyCheckSum(byteArray0);
      int int3 = 32;
      int int4 = (-1462);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byte byte0 = (byte)93;
      byteArray0[1] = (byte)93;
      byteArray0[2] = (byte)64;
      byte byte1 = (byte) (-100);
      byteArray0[3] = (byte) (-100);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)36;
      int int0 = 55;
      TarUtils.formatCheckSumOctalBytes(0L, byteArray0, 233, 55);
      long long0 = (-1954L);
      int int1 = (-12);
      TarUtils.formatCheckSumOctalBytes(long0, byteArray0, byteArray0[1], int1);
      int int2 = TarUtils.formatCheckSumOctalBytes(int1, byteArray0, byteArray0[5], byte0);
      long long1 = 2835L;
      // Undeclared exception!
      try { 
        TarUtils.formatCheckSumOctalBytes(long1, byteArray0, byteArray0[0], int2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 285
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)3;
      byteArray0[1] = (byte)4;
      TarUtils.formatNameBytes("KsY!8?_uN:{94>fy", byteArray0, (-2324), (int) (byte)4);
      long long0 = 0L;
      int int0 = (-853);
      TarUtils.formatOctalBytes(long0, byteArray0, int0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byte byte0 = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)87;
      byteArray0[3] = (byte)20;
      ZipEncoding zipEncoding0 = TarUtils.DEFAULT_ENCODING;
      TarUtils.parseName(byteArray0, (int) (byte)0, 7, zipEncoding0);
      String string0 = "XOJ]3={V7T5@(Wa/";
      TarUtils.formatNameBytes(string0, byteArray0, (int) byte0, (int) byteArray0[2], zipEncoding0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte)74;
      byteArray0[0] = (byte)74;
      int int0 = 128;
      TarUtils.formatOctalBytes(0L, byteArray0, (byte)74, 128);
      long long0 = 154L;
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)12;
      byteArray0[2] = (byte) (-67);
      int int0 = 0;
      TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray0, 1407, 0);
      int int1 = 26;
      int int2 = 0;
      TarUtils.formatCheckSumOctalBytes(int0, byteArray0, int1, int2);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)28;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-92);
      ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
      TarUtils.parseName(byteArray0, (-3556), (int) (byte)0, zipEncoding0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-72);
      byteArray0[1] = (byte) (-87);
      TarUtils.formatUnsignedOctalString(200L, byteArray0, 2498, (byte) (-87));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)22;
      TarUtils.formatUnsignedOctalString((-2336L), byteArray0, (-2647), (byte)1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = 9516;
      TarUtils.parseOctal(byteArray0, 2, 9516);
      // Undeclared exception!
      try { 
        TarUtils.verifyCheckSum(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      long long0 = 0L;
      byte[] byteArray0 = null;
      int int0 = 0;
      // Undeclared exception!
      try { 
        TarUtils.formatLongOctalOrBinaryBytes(0L, (byte[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-70);
      byteArray0[1] = (byte)44;
      byteArray0[2] = (byte) (-62);
      byteArray0[3] = (byte) (-60);
      TarUtils.formatNameBytes("", byteArray0, (int) (byte) (-70), 16);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte) (-77);
      byteArray0[0] = (byte) (-77);
      int int0 = 255;
      TarUtils.formatLongOctalOrBinaryBytes(1L, byteArray0, (byte) (-77), 255);
      int int1 = 77;
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-53);
      byteArray0[1] = (byte)29;
      byteArray0[2] = (byte) (-79);
      byteArray0[3] = (byte)88;
      TarUtils.parseOctal(byteArray0, (-1358), (byte) (-79));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)81;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)22;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)122;
      TarUtils.parseOctalOrBinary(byteArray0, (byte)0, 0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte)48;
      byteArray0[0] = (byte)48;
      int int0 = 0;
      // Undeclared exception!
      try { 
        TarUtils.parseOctalOrBinary(byteArray0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Length 0 must be at least 2
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)32;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      TarUtils.parseOctal(byteArray0, (byte)0, 0);
      byte[] byteArray1 = new byte[0];
      int int0 = 9572;
      ZipEncoding zipEncoding0 = TarUtils.DEFAULT_ENCODING;
      // Undeclared exception!
      try { 
        TarUtils.parseName(byteArray1, int0, (int) byteArray0[0], zipEncoding0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Length 0 must be at least 2
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)67;
      byte byte0 = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)47;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byte byte1 = (byte) (-101);
      byteArray0[5] = (byte) (-101);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-96);
      int int0 = 573;
      TarUtils.parseBoolean(byteArray0, 573);
      int int1 = 0;
      TarUtils.parseOctal(byteArray0, int1, int0);
      TarUtils.verifyCheckSum(byteArray0);
      TarUtils.parseOctalOrBinary(byteArray0, byte1, byteArray0[6]);
      TarUtils.parseBoolean(byteArray0, byteArray0[1]);
      // Undeclared exception!
      try { 
        TarUtils.parseBoolean(byteArray0, int1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 573
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = null;
      int int0 = 3293;
      int int1 = TarUtils.formatOctalBytes(0L, (byte[]) null, 3293, 3293);
      // Undeclared exception!
      try { 
        TarUtils.formatUnsignedOctalString(int1, byteArray0, int0, int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = null;
      int int0 = 2270;
      TarUtils.parseOctalOrBinary((byte[]) null, (-1010), 2270);
      int int1 = 128;
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      long long0 = 0L;
      byte[] byteArray0 = null;
      int int0 = 789;
      // Undeclared exception!
      try { 
        TarUtils.formatCheckSumOctalBytes(0L, (byte[]) null, 789, 789);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)27;
      byteArray0[0] = (byte)27;
      byteArray0[1] = (byte)107;
      byteArray0[2] = (byte)51;
      byteArray0[3] = (byte) (-46);
      byteArray0[4] = (byte) (-115);
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte)34;
      int int0 = (-288);
      TarUtils.formatLongOctalOrBinaryBytes((-1L), byteArray0, (-288), (byte)107);
      int int1 = (-1984);
      TarUtils.formatLongOctalOrBinaryBytes(byteArray0[1], byteArray0, byte0, int1);
      String string0 = "ISO-8859-1";
      TarUtils.formatNameBytes(string0, byteArray0, (int) byteArray0[4], int0);
      long long0 = 2097151L;
      int int2 = (-502);
      // Undeclared exception!
      try { 
        TarUtils.formatCheckSumOctalBytes(long0, byteArray0, byteArray0[4], int2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte)1;
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-63);
      byte byte1 = (byte)8;
      byteArray0[2] = (byte)8;
      TarUtils.formatLongOctalOrBinaryBytes((-4136L), byteArray0, 0, (byte) (-63));
      TarUtils.computeCheckSum(byteArray0);
      long long0 = 0L;
      int int0 = (-2583);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte) (-5);
      byteArray0[0] = (byte) (-5);
      int int0 = 0;
      TarUtils.parseOctalOrBinary(byteArray0, 0, (byte) (-5));
      int int1 = 0;
      // Undeclared exception!
      try { 
        TarUtils.parseOctalOrBinary(byteArray0, (byte) (-5), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-63);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)8;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)54;
      TarUtils.formatUnsignedOctalString((-570L), byteArray0, (byte) (-63), (byte)0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      long long0 = (-1510L);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)2;
      byte byte0 = (byte)125;
      byteArray0[2] = (byte)125;
      byte byte1 = (byte) (-128);
      byteArray0[3] = (byte) (-128);
      byteArray0[4] = (byte)57;
      byteArray0[5] = (byte) (-47);
      byte byte2 = (byte)0;
      byteArray0[6] = (byte)0;
      TarUtils.formatLongOctalOrBinaryBytes((-1510L), byteArray0, (byte)125, 1);
      String string0 = null;
      int int0 = 287;
      TarUtils.formatNameBytes(string0, byteArray0, (int) byteArray0[5], int0);
      int int1 = (-3388);
      // Undeclared exception!
      try { 
        TarUtils.formatLongOctalBytes(byteArray0[3], byteArray0, byte0, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1510 is too large for 1 byte field.
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = null;
      // Undeclared exception!
      try { 
        TarUtils.computeCheckSum((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-128);
      byteArray0[2] = (byte)0;
      TarUtils.formatNameBytes("ibm437", byteArray0, (int) (byte)0, 0);
      int int0 = 1434;
      int int1 = TarUtils.formatCheckSumOctalBytes((byte)0, byteArray0, 1434, (byte)0);
      int int2 = 201;
      int int3 = 0;
      TarUtils.formatUnsignedOctalString(int1, byteArray0, int2, int3);
      int int4 = 0;
      // Undeclared exception!
      try { 
        TarUtils.formatOctalBytes(int2, byteArray0, int0, int4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1431
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      ZipEncoding zipEncoding0 = TarUtils.DEFAULT_ENCODING;
      TarUtils.formatNameBytes("AEp]<", byteArray0, (int) (byte)0, (int) (byte)0, zipEncoding0);
      TarUtils.parseBoolean(byteArray0, (byte)0);
      TarUtils.computeCheckSum(byteArray0);
      TarUtils.formatCheckSumOctalBytes((-5965L), byteArray0, (byte)0, 787);
      String string0 = "At offset ";
      int int0 = 1927;
      int int1 = 0;
      // Undeclared exception!
      try { 
        TarUtils.formatNameBytes(string0, byteArray0, int0, int1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 784
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = null;
      int int0 = (-4302);
      ZipEncoding zipEncoding0 = TarUtils.DEFAULT_ENCODING;
      TarUtils.parseName((byte[]) null, (-4302), 253, zipEncoding0);
      int int1 = 0;
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)116;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)24;
      byteArray0[3] = (byte)126;
      byteArray0[4] = (byte)99;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byte byte0 = (byte)2;
      byteArray0[7] = (byte)2;
      byteArray0[8] = (byte)8;
      int int0 = 2;
      TarUtils.formatUnsignedOctalString(540L, byteArray0, 0, 2);
      int int1 = 0;
      TarUtils.parseOctal(byteArray0, int1, byte0);
      long long0 = 1176L;
      int int2 = 658;
      int int3 = 167;
      TarUtils.formatOctalBytes(long0, byteArray0, int2, int3);
      int int4 = 8745;
      int int5 = 0;
      TarUtils.formatLongOctalOrBinaryBytes(int0, byteArray0, int4, int5);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)32;
      byteArray0[1] = (byte) (-60);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)101;
      byteArray0[4] = (byte)5;
      byte byte0 = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)55;
      byte byte1 = (byte)108;
      byteArray0[7] = (byte)108;
      TarUtils.parseOctalOrBinary(byteArray0, (byte)0, (byte)108);
      int int0 = (-128);
      TarUtils.parseName(byteArray0, (int) byte1, int0);
      TarUtils.computeCheckSum(byteArray0);
      TarUtils.computeCheckSum(byteArray0);
      int int1 = 4;
      ZipEncoding zipEncoding0 = null;
      try {  
      zipEncoding0 = TarUtils.DEFAULT_ENCODING;
      } catch(ArrayIndexOutOfBoundsException e) {}
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = null;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)124;
      byteArray0[1] = (byte)48;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-128);
      byteArray0[4] = (byte)75;
      byteArray0[5] = (byte) (-24);
      byte byte0 = (byte)0;
      byteArray0[6] = (byte)0;
      TarUtils.formatNameBytes((String) null, byteArray0, (int) (byte)0, (int) (byte) (-128));
      int int0 = (-957);
      TarUtils.formatNameBytes(string0, byteArray0, (int) byteArray0[6], int0);
      String string1 = null;
      int int1 = 3358;
      int int2 = 0;
      // Undeclared exception!
      try { 
        TarUtils.formatNameBytes(string1, byteArray0, int1, int2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-18);
      byteArray0[0] = (byte) (-18);
      byte byte1 = (byte)0;
      byteArray0[1] = (byte)0;
      int int0 = 2;
      // Undeclared exception!
      try { 
        TarUtils.parseOctal(byteArray0, (byte) (-18), 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -18
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)43;
      byteArray0[0] = (byte)43;
      byte byte1 = (byte)1;
      byteArray0[1] = (byte)1;
      byte byte2 = (byte) (-60);
      byteArray0[2] = (byte) (-60);
      byte byte3 = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)27;
      byteArray0[5] = (byte) (-90);
      byte byte4 = (byte)66;
      byteArray0[6] = (byte)66;
      byteArray0[7] = (byte) (-11);
      TarUtils.parseBoolean(byteArray0, (byte)1);
      TarUtils.computeCheckSum(byteArray0);
      TarUtils.parseOctalOrBinary(byteArray0, (byte) (-11), (byte)66);
      TarUtils.computeCheckSum(byteArray0);
      String string0 = "{NUL}";
      byte[] byteArray1 = new byte[1];
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)67;
      byteArray0[2] = (byte)112;
      byteArray0[3] = (byte) (-40);
      TarUtils.parseOctal(byteArray0, (byte)0, (byte)67);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = 1682;
      int int1 = 9;
      TarUtils.formatLongOctalOrBinaryBytes((-556L), byteArray0, 1682, 9);
      int int2 = 3;
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-97);
      byteArray0[1] = (byte) (-97);
      byteArray0[2] = (byte)14;
      TarUtils.parseOctalOrBinary(byteArray0, (byte)0, 1123);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      byteArray0[0] = (byte)2;
      TarUtils.parseName(byteArray0, (int) (byte)2, (int) (byte)2);
      int int0 = 1999;
      TarUtils.formatLongOctalOrBinaryBytes((byte)2, byteArray0, 1999, 12);
      long long0 = 0L;
      int int1 = (-1225);
  }
}
