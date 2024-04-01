/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 02:35:25 GMT 2023
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
        textBuffer0.getCurrentSegment();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.toString();
        char[] charArray0 = textBuffer0.contentsAsArray();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.contentsAsDouble();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        int int0 = textBuffer0.getCurrentSegmentSize();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.releaseBuffers();
        textBuffer0.getCurrentSegmentSize();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.releaseBuffers();
        textBuffer0.size();
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.releaseBuffers();
        textBuffer0.getTextOffset();
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.finishCurrentSegment();
        textBuffer0.size();
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.finishCurrentSegment();
        textBuffer0.releaseBuffers();
        textBuffer0.size();
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = new char[0];
        textBuffer0.resetWithCopy(charArray0, 2000, 2000);
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.getCurrentSegment();
        char[] charArray0 = textBuffer0.finishCurrentSegment();
        textBuffer0.resetWithCopy(charArray0, 2000, 2000);
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.resetWithCopy(charArray0, 2000, 2000);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.resetWithString("com.fasterxml.jackson.core.util.TextBuffer");
        int int0 = textBuffer0.size();
        textBuffer0.hasTextAsCharacters();
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.resetWithString("com.fasterxml.jackson.core.util.TextBuffer");
        int int0 = textBuffer0.size();
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.finishCurrentSegment();
        textBuffer0.resetWithString("&!Y!pm'&<N9(:mip4");
        textBuffer0.hasTextAsCharacters();
    }

    @Test(timeout = 4000)
    public void test1215() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.getCurrentSegment();
        textBuffer0.finishCurrentSegment();
        textBuffer0.getTextBuffer();
        textBuffer0.toString();
        textBuffer0.size();
    }

    @Test(timeout = 4000)
    public void test1316() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        int int0 = textBuffer0.size();
    }

    @Test(timeout = 4000)
    public void test1417() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
    }

    @Test(timeout = 4000)
    public void test1418() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.contentsAsArray();
    }

    @Test(timeout = 4000)
    public void test1419() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.contentsAsArray();
        int int0 = textBuffer0.size();
        textBuffer0.getTextOffset();
    }

    @Test(timeout = 4000)
    public void test1420() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.contentsAsArray();
        int int0 = textBuffer0.size();
    }

    @Test(timeout = 4000)
    public void test1521() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.ensureNotShared();
        int int0 = textBuffer0.getTextOffset();
    }

    @Test(timeout = 4000)
    public void test1522() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.ensureNotShared();
        int int0 = textBuffer0.getTextOffset();
        textBuffer0.size();
    }

    @Test(timeout = 4000)
    public void test1623() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        int int0 = textBuffer0.getTextOffset();
    }

    @Test(timeout = 4000)
    public void test1724() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        boolean boolean0 = textBuffer0.hasTextAsCharacters();
    }

    @Test(timeout = 4000)
    public void test1826() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        boolean boolean0 = textBuffer0.hasTextAsCharacters();
        textBuffer0.getTextOffset();
    }

    @Test(timeout = 4000)
    public void test1827() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        boolean boolean0 = textBuffer0.hasTextAsCharacters();
    }

    @Test(timeout = 4000)
    public void test1828() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        boolean boolean0 = textBuffer0.hasTextAsCharacters();
        textBuffer0.size();
    }

    @Test(timeout = 4000)
    public void test1931() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.contentsAsArray();
        boolean boolean0 = textBuffer0.hasTextAsCharacters();
        textBuffer0.size();
    }

    @Test(timeout = 4000)
    public void test1932() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.contentsAsArray();
        boolean boolean0 = textBuffer0.hasTextAsCharacters();
        textBuffer0.getTextOffset();
    }

    @Test(timeout = 4000)
    public void test1933() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.contentsAsArray();
        boolean boolean0 = textBuffer0.hasTextAsCharacters();
    }

    @Test(timeout = 4000)
    public void test2034() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.resetWithEmpty();
        textBuffer0.contentsAsString();
        boolean boolean0 = textBuffer0.hasTextAsCharacters();
    }

    @Test(timeout = 4000)
    public void test2135() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.getTextBuffer();
    }

    @Test(timeout = 4000)
    public void test2237() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.contentsAsArray();
        char[] charArray1 = textBuffer0.getTextBuffer();
    }

    @Test(timeout = 4000)
    public void test2239() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.contentsAsArray();
        char[] charArray1 = textBuffer0.getTextBuffer();
        textBuffer0.size();
    }

    @Test(timeout = 4000)
    public void test2340() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.resetWithString("nL");
        textBuffer0.getTextBuffer();
        textBuffer0.size();
    }

    @Test(timeout = 4000)
    public void test2441() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.getTextBuffer();
    }

    @Test(timeout = 4000)
    public void test2442() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.getTextBuffer();
        textBuffer0.getCurrentSegmentSize();
    }

    @Test(timeout = 4000)
    public void test2545() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.contentsAsString();
        String string0 = textBuffer0.contentsAsString();
    }

    @Test(timeout = 4000)
    public void test2646() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.getCurrentSegment();
        textBuffer0.resetWithShared(charArray0, 2000, 2000);
        textBuffer0.contentsAsString();
    }

    @Test(timeout = 4000)
    public void test2747() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.finishCurrentSegment();
        textBuffer0.contentsAsString();
        textBuffer0.hasTextAsCharacters();
    }

    @Test(timeout = 4000)
    public void test2848() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        BufferRecycler.CharBufferType bufferRecycler_CharBufferType0 = BufferRecycler.CharBufferType.NAME_COPY_BUFFER;
        char[] charArray0 = bufferRecycler0.allocCharBuffer(bufferRecycler_CharBufferType0, 2000);
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.append(charArray0, 0, 2000);
        String string0 = textBuffer0.toString();
        textBuffer0.append(string0, 0, 2000);
        textBuffer0.size();
    }

    @Test(timeout = 4000)
    public void test2949() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.contentsAsArray();
        char[] charArray0 = textBuffer0.contentsAsArray();
    }

    @Test(timeout = 4000)
    public void test3050() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.contentsAsDecimal();
    }

    @Test(timeout = 4000)
    public void test3151() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.contentsAsArray();
        textBuffer0.contentsAsDecimal();
    }

    @Test(timeout = 4000)
    public void test3252() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.append('[');
        textBuffer0.contentsAsDecimal();
    }

    @Test(timeout = 4000)
    public void test3353() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.append('[');
        textBuffer0.finishCurrentSegment();
        textBuffer0.contentsAsDecimal();
    }

    @Test(timeout = 4000)
    public void test3454() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.resetWithEmpty();
        textBuffer0.ensureNotShared();
        textBuffer0.hasTextAsCharacters();
    }

    @Test(timeout = 4000)
    public void test3555() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.setCurrentLength(262144);
        char[] charArray0 = textBuffer0.expandCurrentSegment();
        textBuffer0.append(charArray0, 1500, 1500);
    }

    @Test(timeout = 4000)
    public void test3656() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.emptyAndGetCurrentSegment();
        String string0 = textBuffer0.contentsAsString();
        textBuffer0.append(string0, 262144, 262144);
    }

    @Test(timeout = 4000)
    public void test3757() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.append("", 2000, (-4210));
    }

    @Test(timeout = 4000)
    public void test3858() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.getTextOffset();
    }

    @Test(timeout = 4000)
    public void test3859() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.getCurrentSegment();
    }

    @Test(timeout = 4000)
    public void test3861() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray1 = textBuffer0.getCurrentSegment();
        textBuffer0.getCurrentSegmentSize();
    }

    @Test(timeout = 4000)
    public void test3962() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.resetWithEmpty();
        textBuffer0.getTextOffset();
    }

    @Test(timeout = 4000)
    public void test3963() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.resetWithEmpty();
        char[] charArray0 = textBuffer0.getCurrentSegment();
    }

    @Test(timeout = 4000)
    public void test4064() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        BufferRecycler.CharBufferType bufferRecycler_CharBufferType0 = BufferRecycler.CharBufferType.TOKEN_BUFFER;
        char[] charArray0 = bufferRecycler0.allocCharBuffer(bufferRecycler_CharBufferType0, 2000);
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.append(charArray0, (int) '(', 1768);
        textBuffer0.getCurrentSegment();
        textBuffer0.size();
    }

    @Test(timeout = 4000)
    public void test4165() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.getCurrentSegment();
        textBuffer0.finishCurrentSegment();
        textBuffer0.size();
    }

    @Test(timeout = 4000)
    public void test4166() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.getCurrentSegment();
        textBuffer0.finishCurrentSegment();
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
    }

    @Test(timeout = 4000)
    public void test4267() throws Throwable {
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
        textBuffer0.getCurrentSegmentSize();
    }

    @Test(timeout = 4000)
    public void test4368() throws Throwable {
        TextBuffer textBuffer0 = new TextBuffer((BufferRecycler) null);
        textBuffer0.emptyAndGetCurrentSegment();
        char[] charArray0 = textBuffer0.expandCurrentSegment();
        textBuffer0.resetWithShared(charArray0, 1500, 1500);
        textBuffer0.getCurrentSegment();
    }

    @Test(timeout = 4000)
    public void test4469() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = new char[4];
        textBuffer0.resetWithShared(charArray0, 0, 45);
        textBuffer0.contentsAsArray();
        textBuffer0.size();
    }

    @Test(timeout = 4000)
    public void test4570() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        char[] charArray0 = textBuffer0.emptyAndGetCurrentSegment();
        textBuffer0.resetWithShared(charArray0, 2000, 2000);
        textBuffer0.contentsAsArray();
    }

    @Test(timeout = 4000)
    public void test4671() throws Throwable {
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        TextBuffer textBuffer0 = new TextBuffer(bufferRecycler0);
        textBuffer0.append('r');
        textBuffer0.contentsAsArray();
        textBuffer0.getCurrentSegmentSize();
    }
}
