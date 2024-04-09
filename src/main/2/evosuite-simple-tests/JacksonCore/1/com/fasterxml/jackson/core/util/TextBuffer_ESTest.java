/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 16:20:38 GMT 2024
 */
package com.fasterxml.jackson.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.TextBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TextBuffer_ESTest extends TextBuffer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.finishCurrentSegment();
        char[] charArray0 = textBuffer0.expandCurrentSegment();
        textBuffer0.resetWithShared(charArray0, 1500, 1500);
        // Undeclared exception!
        try {
            textBuffer0.getCurrentSegment();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.toString();
        textBuffer0.getCurrentSegment();
        textBuffer0.size();
        assertFalse(textBuffer0.hasTextAsCharacters());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        try {
            textBuffer0.contentsAsDouble();
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        int int0 = textBuffer0.getCurrentSegmentSize();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.releaseBuffers();
        assertEquals(0, textBuffer0.size());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.releaseBuffers();
        assertEquals(0, textBuffer0.size());
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.releaseBuffers();
        assertEquals(0, textBuffer0.getTextOffset());
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.finishCurrentSegment();
        assertEquals(200, textBuffer0.size());
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.finishCurrentSegment();
        textBuffer0.releaseBuffers();
        assertEquals(0, textBuffer0.size());
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        // Undeclared exception!
        try {
            textBuffer0.resetWithCopy(charArray0, 2000, 2000);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.getCurrentSegment();
        char[] charArray0 = textBuffer0.finishCurrentSegment();
        // Undeclared exception!
        try {
            textBuffer0.resetWithCopy(charArray0, 2000, 2000);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = new char[0];
        // Undeclared exception!
        try {
            textBuffer0.resetWithCopy(charArray0, 262145, 262145);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.resetWithString("nL");
        textBuffer0.getTextBuffer();
        assertEquals(2, textBuffer0.size());
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.finishCurrentSegment();
        textBuffer0.resetWithString("TOKEN_BUFFER");
        assertFalse(textBuffer0.hasTextAsCharacters());
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.finishCurrentSegment();
        textBuffer0.getTextBuffer();
        textBuffer0.contentsAsString();
        assertEquals(1000, textBuffer0.size());
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        int int0 = textBuffer0.size();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        assertEquals(200, charArray0.length);
    }

    @Test(timeout = 4000)
    public void test1417() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.contentsAsArray();
        assertNotNull(charArray1);
    }

    @Test(timeout = 4000)
    public void test1418() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.contentsAsArray();
        int int0 = textBuffer0.size();
        assertEquals(0, textBuffer0.getTextOffset());
    }

    @Test(timeout = 4000)
    public void test1419() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.contentsAsArray();
        int int0 = textBuffer0.size();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1520() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.ensureNotShared();
        int int0 = textBuffer0.getTextOffset();
        assertEquals(0, textBuffer0.size());
    }

    @Test(timeout = 4000)
    public void test1521() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.ensureNotShared();
        int int0 = textBuffer0.getTextOffset();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1622() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        int int0 = textBuffer0.getTextOffset();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1723() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        boolean boolean0 = textBuffer0.hasTextAsCharacters();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1824() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        assertEquals(200, charArray0.length);
    }

    @Test(timeout = 4000)
    public void test1825() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        boolean boolean0 = textBuffer0.hasTextAsCharacters();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1826() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        boolean boolean0 = textBuffer0.hasTextAsCharacters();
        assertEquals(0, textBuffer0.size());
    }

    @Test(timeout = 4000)
    public void test1827() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        boolean boolean0 = textBuffer0.hasTextAsCharacters();
        assertEquals(0, textBuffer0.getTextOffset());
    }

    @Test(timeout = 4000)
    public void test1928() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        assertEquals(200, charArray0.length);
    }

    @Test(timeout = 4000)
    public void test1929() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.contentsAsArray();
        assertNotNull(charArray1);
    }

    @Test(timeout = 4000)
    public void test1930() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.contentsAsArray();
        boolean boolean0 = textBuffer0.hasTextAsCharacters();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1931() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.contentsAsArray();
        boolean boolean0 = textBuffer0.hasTextAsCharacters();
        assertEquals(0, textBuffer0.getTextOffset());
    }

    @Test(timeout = 4000)
    public void test1932() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.contentsAsArray();
        boolean boolean0 = textBuffer0.hasTextAsCharacters();
        assertEquals(0, textBuffer0.size());
    }

    @Test(timeout = 4000)
    public void test2033() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.resetWithEmpty();
        textBuffer0.contentsAsString();
        boolean boolean0 = textBuffer0.hasTextAsCharacters();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2134() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.getTextBuffer();
        assertNull(charArray0);
    }

    @Test(timeout = 4000)
    public void test2235() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        assertEquals(200, charArray0.length);
    }

    @Test(timeout = 4000)
    public void test2236() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.contentsAsArray();
        char[] charArray1 = textBuffer0.getTextBuffer();
        assertNotNull(charArray1);
    }

    @Test(timeout = 4000)
    public void test2237() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.contentsAsArray();
        char[] charArray1 = textBuffer0.getTextBuffer();
        assertEquals(0, charArray1.length);
    }

    @Test(timeout = 4000)
    public void test2338() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.getTextBuffer();
        assertSame(charArray1, charArray0);
    }

    @Test(timeout = 4000)
    public void test2339() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.getTextBuffer();
        assertEquals(200, charArray1.length);
    }

    @Test(timeout = 4000)
    public void test2340() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.getTextBuffer();
        assertEquals(0, textBuffer0.size());
    }

    @Test(timeout = 4000)
    public void test2341() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.getTextBuffer();
        assertNotNull(charArray1);
    }

    @Test(timeout = 4000)
    public void test2442() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.contentsAsString();
        String string0 = textBuffer0.contentsAsString();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test2543() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.getCurrentSegment();
        textBuffer0.resetWithShared(charArray0, 2000, 2000);
        // Undeclared exception!
        try {
            textBuffer0.contentsAsString();
            fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2644() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.finishCurrentSegment();
        textBuffer0.contentsAsString();
        assertFalse(textBuffer0.hasTextAsCharacters());
    }

    @Test(timeout = 4000)
    public void test2745() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        BufferRecycler.CharBufferType bufferRecycler_CharBufferType0 = BufferRecycler.CharBufferType.TOKEN_BUFFER;
        char[] charArray0 = bufferRecycler0.allocCharBuffer(bufferRecycler_CharBufferType0, 2000);
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.append(charArray0, (int) '(', 1768);
        String string0 = textBuffer0.toString();
        textBuffer0.append(string0, (int) '(', (int) '(');
        assertEquals(40, textBuffer0.getCurrentSegmentSize());
    }

    @Test(timeout = 4000)
    public void test2846() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.contentsAsArray();
        char[] charArray0 = textBuffer0.contentsAsArray();
        assertEquals(0, charArray0.length);
    }

    @Test(timeout = 4000)
    public void test2947() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        // Undeclared exception!
        try {
            textBuffer0.contentsAsDecimal();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.math.BigDecimal", e);
        }
    }

    @Test(timeout = 4000)
    public void test3048() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.contentsAsArray();
        try {
            textBuffer0.contentsAsDecimal();
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.math.BigDecimal", e);
        }
    }

    @Test(timeout = 4000)
    public void test3149() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.append('[');
        try {
            textBuffer0.contentsAsDecimal();
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.math.BigDecimal", e);
        }
    }

    @Test(timeout = 4000)
    public void test3250() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.append('[');
        textBuffer0.finishCurrentSegment();
        try {
            textBuffer0.contentsAsDecimal();
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.math.BigDecimal", e);
        }
    }

    @Test(timeout = 4000)
    public void test3351() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.resetWithEmpty();
        textBuffer0.ensureNotShared();
        assertEquals(0, textBuffer0.getCurrentSegmentSize());
    }

    @Test(timeout = 4000)
    public void test3452() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.setCurrentLength(262144);
        char[] charArray0 = textBuffer0.expandCurrentSegment();
        // Undeclared exception!
        try {
            textBuffer0.append(charArray0, 1500, 1500);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test3553() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.emptyAndGetCurrentSegment();
        String string0 = textBuffer0.contentsAsString();
        // Undeclared exception!
        try {
            textBuffer0.append(string0, 262144, 262144);
            fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test3654() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        // Undeclared exception!
        try {
            textBuffer0.append("", 2000, (-4210));
            fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test3755() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        assertEquals(0, textBuffer0.getTextOffset());
    }

    @Test(timeout = 4000)
    public void test3756() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.getCurrentSegment();
        assertSame(charArray1, charArray0);
    }

    @Test(timeout = 4000)
    public void test3757() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.getCurrentSegment();
        assertEquals(1000, charArray1.length);
    }

    @Test(timeout = 4000)
    public void test3758() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.getCurrentSegment();
        assertEquals(0, textBuffer0.getCurrentSegmentSize());
    }

    @Test(timeout = 4000)
    public void test3859() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.resetWithEmpty();
        assertEquals(0, textBuffer0.getTextOffset());
    }

    @Test(timeout = 4000)
    public void test3860() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.resetWithEmpty();
        char[] charArray0 = textBuffer0.getCurrentSegment();
        assertEquals(200, charArray0.length);
    }

    @Test(timeout = 4000)
    public void test3961() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        BufferRecycler.CharBufferType bufferRecycler_CharBufferType0 = BufferRecycler.CharBufferType.TOKEN_BUFFER;
        char[] charArray0 = bufferRecycler0.allocCharBuffer(bufferRecycler_CharBufferType0, 2000);
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.append(charArray0, (int) '(', 1768);
        textBuffer0.getCurrentSegment();
        assertEquals(1768, textBuffer0.size());
    }

    @Test(timeout = 4000)
    public void test4062() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.getCurrentSegment();
        textBuffer0.finishCurrentSegment();
        assertEquals(200, textBuffer0.size());
    }

    @Test(timeout = 4000)
    public void test4063() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.getCurrentSegment();
        textBuffer0.finishCurrentSegment();
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        assertEquals(300, charArray0.length);
    }

    @Test(timeout = 4000)
    public void test4164() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.finishCurrentSegment();
        textBuffer0.expandCurrentSegment();
        textBuffer0.expandCurrentSegment();
        textBuffer0.finishCurrentSegment();
        textBuffer0.finishCurrentSegment();
        textBuffer0.setCurrentLength(262144);
        textBuffer0.expandCurrentSegment();
        textBuffer0.append('h');
        textBuffer0.expandCurrentSegment();
        char[] charArray0 = textBuffer0.expandCurrentSegment();
        textBuffer0.expandCurrentSegment();
        textBuffer0.setCurrentLength(262144);
        textBuffer0.expandCurrentSegment();
        textBuffer0.append(charArray0, 1500, 1500);
        textBuffer0.expandCurrentSegment();
        textBuffer0.expandCurrentSegment();
        textBuffer0.expandCurrentSegment();
        assertEquals(108807, textBuffer0.size());
    }

    @Test(timeout = 4000)
    public void test4265() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray0 = textBuffer0.expandCurrentSegment();
        textBuffer0.resetWithShared(charArray0, 1500, 1500);
        // Undeclared exception!
        try {
            textBuffer0.getCurrentSegment();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test4366() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.toString();
        char[] charArray0 = textBuffer0.contentsAsArray();
        assertEquals(0, charArray0.length);
    }

    @Test(timeout = 4000)
    public void test4467() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = new char[4];
        textBuffer0.resetWithShared(charArray0, 0, 45);
        textBuffer0.contentsAsArray();
        assertEquals(45, textBuffer0.size());
    }

    @Test(timeout = 4000)
    public void test4568() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        BufferRecycler.CharBufferType bufferRecycler_CharBufferType0 = BufferRecycler.CharBufferType.CONCAT_BUFFER;
        char[] charArray0 = bufferRecycler0.allocCharBuffer(bufferRecycler_CharBufferType0, 2000);
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.resetWithShared(charArray0, 2000, 2000);
        textBuffer0.contentsAsArray();
        assertEquals(2000, textBuffer0.getTextOffset());
    }

    @Test(timeout = 4000)
    public void test4669() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.append('R');
        textBuffer0.contentsAsArray();
        assertEquals(1, textBuffer0.getCurrentSegmentSize());
    }
}
