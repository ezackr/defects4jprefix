/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 13:26:46 GMT 2024
 */
package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class NumericEntityUnescaper_ESTest extends NumericEntityUnescaper_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
        char[] charArray0 = new char[2];
        charArray0[0] = '&';
        CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
        String string0 = numericEntityUnescaper0.translate((CharSequence) charBuffer0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
        char[] charArray0 = new char[7];
        charArray0[1] = '&';
        charArray0[2] = '#';
        CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
        numericEntityUnescaper0.translate((CharSequence) charBuffer0);
    }
}
