/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 01:47:26 GMT 2023
 */
package org.apache.commons.compress.archivers.dump;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.archivers.dump.DumpArchiveInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class DumpArchiveInputStream_ESTest extends DumpArchiveInputStream_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        DumpArchiveInputStream dumpArchiveInputStream0 = null;
        try {
            dumpArchiveInputStream0 = new DumpArchiveInputStream(sequenceInputStream0);
            fail("Expecting exception: Exception");
        } catch (Throwable e) {
            //
            // unexpected EOF
            //
            verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        byte[] byteArray0 = new byte[9];
        // Undeclared exception!
        try {
            DumpArchiveInputStream.matches(byteArray0, 41);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 27
            //
            verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveUtil", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        byte[] byteArray0 = new byte[6];
        boolean boolean0 = DumpArchiveInputStream.matches(byteArray0, (-242));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        // Undeclared exception!
        try {
            DumpArchiveInputStream.matches((byte[]) null, 9576);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveUtil", e);
        }
    }
}
