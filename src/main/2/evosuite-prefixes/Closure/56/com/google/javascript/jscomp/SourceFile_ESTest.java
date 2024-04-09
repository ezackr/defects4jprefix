/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 02:46:30 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.SourceFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class SourceFile_ESTest extends SourceFile_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        SourceFile sourceFile0 = SourceFile.fromGenerator("\n", (SourceFile.Generator) null);
        sourceFile0.isExtern();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        SourceFile.Generated sourceFile_Generated0 = new SourceFile.Generated("|w7_ Y! ", (SourceFile.Generator) null);
        sourceFile_Generated0.clearCachedSource();
        sourceFile_Generated0.isExtern();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        File file0 = MockFile.createTempFile("M2W&9n", "IOException thrown while closing Closeable.");
        Charset charset0 = Charset.defaultCharset();
        SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(file0, charset0);
        Region region0 = sourceFile_OnDisk0.getRegion(1118);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        File file0 = MockFile.createTempFile("M2W&9n", "IOException thrown while closing Closeable.");
        Charset charset0 = Charset.defaultCharset();
        SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(file0, charset0);
        Region region0 = sourceFile_OnDisk0.getRegion(1118);
        sourceFile_OnDisk0.getCodeReader();
        sourceFile_OnDisk0.isExtern();
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        MockFile mockFile0 = new MockFile("", "");
        SourceFile.OnDisk sourceFile_OnDisk0 = new SourceFile.OnDisk(mockFile0);
        sourceFile_OnDisk0.clearCachedSource();
        sourceFile_OnDisk0.isExtern();
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        Charset charset0 = Charset.defaultCharset();
        SourceFile sourceFile0 = SourceFile.fromFile("rw", charset0);
        sourceFile0.isExtern();
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        SourceFile.fromCode("", "", "");
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("F\n", "F\n");
        sourceFile_Preloaded0.clearCachedSource();
        sourceFile_Preloaded0.isExtern();
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("Yq", "Yq", "Yq");
        sourceFile_Preloaded0.getCodeNoCache();
        sourceFile_Preloaded0.isExtern();
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        StringReader stringReader0 = new StringReader("F?Y9)jj5&$|$SewjSdp");
        SourceFile sourceFile0 = SourceFile.fromReader("UTF-16LE", stringReader0);
        sourceFile0.getName();
        sourceFile0.isExtern();
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        StringReader stringReader0 = new StringReader("F?Y9)jj5&$|$SewjSdp");
        SourceFile sourceFile0 = SourceFile.fromReader("UTF-16LE", stringReader0);
        sourceFile0.getName();
        sourceFile0.getOriginalPath();
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("|;l", "|;l");
        sourceFile_Preloaded0.setIsExtern(false);
        sourceFile_Preloaded0.isExtern();
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        SourceFile.Generator sourceFile_Generator0 = mock(SourceFile.Generator.class, new ViolatedAssumptionAnswer());
        SourceFile.Generated sourceFile_Generated0 = new SourceFile.Generated("UTF-16LE", sourceFile_Generator0);
        sourceFile_Generated0.toString();
        sourceFile_Generated0.isExtern();
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        SourceFile.fromInputStream("\"y]pGYO./6j", "\"y]pGYO./6j", (InputStream) pipedInputStream0);
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        SourceFile.fromInputStream("\n", (InputStream) pipedInputStream0);
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        StringReader stringReader0 = new StringReader("UTF-16LE");
        SourceFile sourceFile0 = SourceFile.fromReader("UTF-16LE", stringReader0);
        boolean boolean0 = sourceFile0.isExtern();
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = null;
        sourceFile_Preloaded0 = new SourceFile.Preloaded((String) null, (String) null);
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("F\n", "F\n");
        int int0 = sourceFile_Preloaded0.getNumLines();
    }

    @Test(timeout = 4000)
    public void test1518() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("F\n", "F\n");
        int int0 = sourceFile_Preloaded0.getNumLines();
        sourceFile_Preloaded0.getLineOffset(1);
        sourceFile_Preloaded0.isExtern();
    }

    @Test(timeout = 4000)
    public void test1619() throws Throwable {
        SourceFile sourceFile0 = SourceFile.fromFile("\n");
        sourceFile0.getLineOffset((-6));
    }

    @Test(timeout = 4000)
    public void test1720() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("_", "_");
        sourceFile_Preloaded0.getLineOffset(1558);
    }

    @Test(timeout = 4000)
    public void test1821() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("_", "_");
        sourceFile_Preloaded0.getNumLines();
        sourceFile_Preloaded0.getNumLines();
        sourceFile_Preloaded0.isExtern();
    }

    @Test(timeout = 4000)
    public void test1922() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("com.google.javascript.jscomp.SourceFile$OnDisk", "", "\nrctuml:p");
        int int0 = sourceFile_Preloaded0.getNumLines();
    }

    @Test(timeout = 4000)
    public void test1923() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("com.google.javascript.jscomp.SourceFile$OnDisk", "", "\nrctuml:p");
        int int0 = sourceFile_Preloaded0.getNumLines();
        sourceFile_Preloaded0.isExtern();
    }

    @Test(timeout = 4000)
    public void test1924() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("com.google.javascript.jscomp.SourceFile$OnDisk", "", "\nrctuml:p");
        int int0 = sourceFile_Preloaded0.getNumLines();
        sourceFile_Preloaded0.getOriginalPath();
    }

    @Test(timeout = 4000)
    public void test2025() throws Throwable {
        SourceFile.Generated sourceFile_Generated0 = new SourceFile.Generated("|w7_ Y! ", (SourceFile.Generator) null);
        String string0 = sourceFile_Generated0.getOriginalPath();
    }

    @Test(timeout = 4000)
    public void test2026() throws Throwable {
        SourceFile.Generated sourceFile_Generated0 = new SourceFile.Generated("|w7_ Y! ", (SourceFile.Generator) null);
        String string0 = sourceFile_Generated0.getOriginalPath();
        sourceFile_Generated0.isExtern();
    }

    @Test(timeout = 4000)
    public void test2127() throws Throwable {
        SourceFile sourceFile0 = SourceFile.fromCode("KDf<fn1Z[L54", "", "KDf<fn1Z[L54");
        String string0 = sourceFile0.getOriginalPath();
        sourceFile0.isExtern();
    }

    @Test(timeout = 4000)
    public void test2128() throws Throwable {
        SourceFile sourceFile0 = SourceFile.fromCode("KDf<fn1Z[L54", "", "KDf<fn1Z[L54");
        String string0 = sourceFile0.getOriginalPath();
    }

    @Test(timeout = 4000)
    public void test2229() throws Throwable {
        SourceFile sourceFile0 = SourceFile.fromFile("#%!s$QR99U;$L%sG");
        sourceFile0.getCodeReader();
    }

    @Test(timeout = 4000)
    public void test2330() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("com.google.javascript.jscomp.SourceFile$OnDisk", "", "\nrctuml:p");
        String string0 = sourceFile_Preloaded0.getLine(0);
    }

    @Test(timeout = 4000)
    public void test2331() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("com.google.javascript.jscomp.SourceFile$OnDisk", "", "\nrctuml:p");
        String string0 = sourceFile_Preloaded0.getLine(0);
        sourceFile_Preloaded0.getOriginalPath();
    }

    @Test(timeout = 4000)
    public void test2332() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("com.google.javascript.jscomp.SourceFile$OnDisk", "", "\nrctuml:p");
        String string0 = sourceFile_Preloaded0.getLine(0);
        sourceFile_Preloaded0.isExtern();
    }

    @Test(timeout = 4000)
    public void test2433() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("\n", "\n");
        String string0 = sourceFile_Preloaded0.getLine(5);
        sourceFile_Preloaded0.isExtern();
    }

    @Test(timeout = 4000)
    public void test2434() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("\n", "\n");
        String string0 = sourceFile_Preloaded0.getLine(5);
    }

    @Test(timeout = 4000)
    public void test2535() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("\n", "\n");
        sourceFile_Preloaded0.getRegion(31);
        sourceFile_Preloaded0.isExtern();
    }

    @Test(timeout = 4000)
    public void test2636() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("F\n", "F\n");
        Region region0 = sourceFile_Preloaded0.getRegion((-3));
        region0.getSourceExcerpt();
    }

    @Test(timeout = 4000)
    public void test2637() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("F\n", "F\n");
        Region region0 = sourceFile_Preloaded0.getRegion((-3));
    }

    @Test(timeout = 4000)
    public void test2638() throws Throwable {
        SourceFile.Preloaded sourceFile_Preloaded0 = new SourceFile.Preloaded("F\n", "F\n");
        Region region0 = sourceFile_Preloaded0.getRegion((-3));
        region0.getEndingLineNumber();
    }

    @Test(timeout = 4000)
    public void test2739() throws Throwable {
        SourceFile.Generator sourceFile_Generator0 = mock(SourceFile.Generator.class, new ViolatedAssumptionAnswer());
        doReturn("com.goo~le.javascript.jscom\".SourceFile$OnDisk").when(sourceFile_Generator0).getCode();
        SourceFile.Generated sourceFile_Generated0 = new SourceFile.Generated("com.goo~le.javascript.jscom\".SourceFile$OnDisk", sourceFile_Generator0);
        sourceFile_Generated0.getRegion((-3356));
        String string0 = sourceFile_Generated0.getLine((-3356));
    }

    @Test(timeout = 4000)
    public void test2840() throws Throwable {
        SourceFile sourceFile0 = SourceFile.fromFile("\n", (Charset) null);
        sourceFile0.isExtern();
    }
}
