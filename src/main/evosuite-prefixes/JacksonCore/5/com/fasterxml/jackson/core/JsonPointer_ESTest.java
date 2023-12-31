/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 18:32:25 GMT 2023
 */
package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class JsonPointer_ESTest extends JsonPointer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("UxRS~L`&zjDqX/", 0);
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("UxRS~L`&zjDqX/", 0);
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("UxRS~L`&zjDqX/", 0);
        jsonPointer0.mayMatchElement();
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("UxRS~L`&zjDqX/", 0);
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        JsonPointer._parseQuotedTail("", 2);
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("\"9 *EsdbB", 8);
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test026() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("\"9 *EsdbB", 8);
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test027() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("\"9 *EsdbB", 8);
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("2wKWi", 0);
        jsonPointer0.hashCode();
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("2wKWi", 0);
        jsonPointer0.hashCode();
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test0410() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("\"");
        jsonPointer0.matchElement((-1006));
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test0411() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("\"");
        jsonPointer0.matchElement((-1006));
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test0412() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("\"");
        jsonPointer0.matchElement((-1006));
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test0413() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("\"");
        jsonPointer0.matchElement((-1006));
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test0514() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("com.fasterxml.jackson.core.JsonPointer");
        boolean boolean0 = jsonPointer0.mayMatchProperty();
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test0515() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("com.fasterxml.jackson.core.JsonPointer");
        boolean boolean0 = jsonPointer0.mayMatchProperty();
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test0516() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("com.fasterxml.jackson.core.JsonPointer");
        boolean boolean0 = jsonPointer0.mayMatchProperty();
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test0517() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("com.fasterxml.jackson.core.JsonPointer");
        boolean boolean0 = jsonPointer0.mayMatchProperty();
    }

    @Test(timeout = 4000)
    public void test0518() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("com.fasterxml.jackson.core.JsonPointer");
        boolean boolean0 = jsonPointer0.mayMatchProperty();
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test0619() throws Throwable {
        JsonPointer.compile("\" can not be represented as BigDecimal");
    }

    @Test(timeout = 4000)
    public void test0720() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.EMPTY;
        String string0 = jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test0821() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("'", 0);
        JsonPointer jsonPointer1 = new JsonPointer("'", "'", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.tail();
        jsonPointer2.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test0822() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("'", 0);
        JsonPointer jsonPointer1 = new JsonPointer("'", "'", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.tail();
        jsonPointer2.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test0823() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("'", 0);
        JsonPointer jsonPointer1 = new JsonPointer("'", "'", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.tail();
        jsonPointer2.toString();
    }

    @Test(timeout = 4000)
    public void test0824() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("'", 0);
        JsonPointer jsonPointer1 = new JsonPointer("'", "'", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.tail();
    }

    @Test(timeout = 4000)
    public void test0925() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("#)FP\"Z");
        JsonPointer jsonPointer1 = new JsonPointer("|)z_l/&t?Lhvg~9=PF", "Re<Syn?x~0Gpvyl", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.matchProperty("Re<Syn?x~0Gpvyl");
        jsonPointer2.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test0926() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("#)FP\"Z");
        JsonPointer jsonPointer1 = new JsonPointer("|)z_l/&t?Lhvg~9=PF", "Re<Syn?x~0Gpvyl", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.matchProperty("Re<Syn?x~0Gpvyl");
        jsonPointer1.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test0927() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("#)FP\"Z");
        JsonPointer jsonPointer1 = new JsonPointer("|)z_l/&t?Lhvg~9=PF", "Re<Syn?x~0Gpvyl", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.matchProperty("Re<Syn?x~0Gpvyl");
    }

    @Test(timeout = 4000)
    public void test0928() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("#)FP\"Z");
        JsonPointer jsonPointer1 = new JsonPointer("|)z_l/&t?Lhvg~9=PF", "Re<Syn?x~0Gpvyl", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.matchProperty("Re<Syn?x~0Gpvyl");
        jsonPointer2.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test1029() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        String string0 = jsonPointer0.getMatchingProperty();
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test1030() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        String string0 = jsonPointer0.getMatchingProperty();
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test1031() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        String string0 = jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test1032() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        String string0 = jsonPointer0.getMatchingProperty();
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test1133() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("H", "0", jsonPointer0);
        int int0 = jsonPointer1.getMatchingIndex();
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test1134() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("H", "0", jsonPointer0);
        int int0 = jsonPointer1.getMatchingIndex();
        jsonPointer1.toString();
    }

    @Test(timeout = 4000)
    public void test1135() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("H", "0", jsonPointer0);
        int int0 = jsonPointer1.getMatchingIndex();
        jsonPointer1.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test1136() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("H", "0", jsonPointer0);
        int int0 = jsonPointer1.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test1137() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("H", "0", jsonPointer0);
        int int0 = jsonPointer1.getMatchingIndex();
        jsonPointer1.matches();
    }

    @Test(timeout = 4000)
    public void test1238() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        int int0 = jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test1239() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        int int0 = jsonPointer0.getMatchingIndex();
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test1240() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        int int0 = jsonPointer0.getMatchingIndex();
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test1241() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        int int0 = jsonPointer0.getMatchingIndex();
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test1342() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G0");
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test1343() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G0");
        jsonPointer0.mayMatchElement();
    }

    @Test(timeout = 4000)
    public void test1344() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G0");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test1345() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G0");
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test1446() throws Throwable {
        JsonPointer.valueOf("Invalid input: JSON Pointer expression must start with '/': \"");
    }

    @Test(timeout = 4000)
    public void test1547() throws Throwable {
        JsonPointer._parseTail("");
    }

    @Test(timeout = 4000)
    public void test1648() throws Throwable {
        JsonPointer._parseTail("p7[506");
    }

    @Test(timeout = 4000)
    public void test1749() throws Throwable {
        JsonPointer._parseTail((String) null);
    }

    @Test(timeout = 4000)
    public void test1850() throws Throwable {
        JsonPointer._parseQuotedTail((String) null, 646);
    }

    @Test(timeout = 4000)
    public void test1951() throws Throwable {
        JsonPointer._parseQuotedTail("UxRS~L`&zjDqX/", 1143);
    }

    @Test(timeout = 4000)
    public void test2052() throws Throwable {
        JsonPointer jsonPointer0 = null;
        jsonPointer0 = new JsonPointer("3!7E", "3!7E", (JsonPointer) null);
    }

    @Test(timeout = 4000)
    public void test2153() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.EMPTY;
        JsonPointer jsonPointer1 = null;
        jsonPointer1 = new JsonPointer((String) null, (String) null, jsonPointer0);
    }

    @Test(timeout = 4000)
    public void test2254() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile("/PV8}XI{l'YJO9E($");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test2255() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile("/PV8}XI{l'YJO9E($");
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test2256() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile("/PV8}XI{l'YJO9E($");
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test2257() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile("/PV8}XI{l'YJO9E($");
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test2358() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile("");
        JsonPointer jsonPointer1 = jsonPointer0.tail();
    }

    @Test(timeout = 4000)
    public void test2459() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("2.2250738585072012e-308", 16);
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test2460() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("2.2250738585072012e-308", 16);
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test2461() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("2.2250738585072012e-308", 16);
        jsonPointer0.mayMatchElement();
    }

    @Test(timeout = 4000)
    public void test2462() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("2.2250738585072012e-308", 16);
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test2563() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("Re<Syn?x~0Gpvyl", 0);
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test2564() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("Re<Syn?x~0Gpvyl", 0);
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test2565() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("Re<Syn?x~0Gpvyl", 0);
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test2566() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("Re<Syn?x~0Gpvyl", 0);
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test2667() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("$ZxSb~");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test2668() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("$ZxSb~");
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test2669() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("$ZxSb~");
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test2670() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("$ZxSb~");
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test2771() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("|)z_l/&t?Lhvg~9=PF");
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test2772() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("|)z_l/&t?Lhvg~9=PF");
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test2773() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("|)z_l/&t?Lhvg~9=PF");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test2774() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("|)z_l/&t?Lhvg~9=PF");
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test2875() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("3F*^fz99E<t;!CB;/");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test2876() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("3F*^fz99E<t;!CB;/");
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test2877() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("3F*^fz99E<t;!CB;/");
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test2878() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("3F*^fz99E<t;!CB;/");
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test2979() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("~)kx^$<MFG");
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test2980() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("~)kx^$<MFG");
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test2981() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("~)kx^$<MFG");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test2982() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("~)kx^$<MFG");
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test3083() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.EMPTY;
        Object object0 = new Object();
        boolean boolean0 = jsonPointer0.equals(object0);
    }

    @Test(timeout = 4000)
    public void test3184() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.EMPTY;
        JsonPointer jsonPointer1 = new JsonPointer((String) null, "3F*^fz99E<t;!CB;/", (JsonPointer) null);
        jsonPointer1.equals(jsonPointer0);
    }

    @Test(timeout = 4000)
    public void test3285() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        boolean boolean0 = jsonPointer0.equals(jsonPointer0);
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test3286() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        boolean boolean0 = jsonPointer0.equals(jsonPointer0);
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test3287() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        boolean boolean0 = jsonPointer0.equals(jsonPointer0);
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test3288() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        boolean boolean0 = jsonPointer0.equals(jsonPointer0);
    }

    @Test(timeout = 4000)
    public void test3289() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("3F*^fz99E<t;!CB;/", 0);
        boolean boolean0 = jsonPointer0.equals(jsonPointer0);
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test3390() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile((String) null);
        boolean boolean0 = jsonPointer0.equals((Object) null);
    }

    @Test(timeout = 4000)
    public void test3491() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        jsonPointer0.matchElement((-1));
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test3592() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        jsonPointer0.matchElement(0);
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test3693() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("pcB%", 1);
        JsonPointer jsonPointer1 = jsonPointer0.matchProperty("pcB%");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test3694() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("pcB%", 1);
        JsonPointer jsonPointer1 = jsonPointer0.matchProperty("pcB%");
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test3695() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("pcB%", 1);
        JsonPointer jsonPointer1 = jsonPointer0.matchProperty("pcB%");
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test3696() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("pcB%", 1);
        JsonPointer jsonPointer1 = jsonPointer0.matchProperty("pcB%");
    }

    @Test(timeout = 4000)
    public void test3797() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("T", "T", jsonPointer0);
        jsonPointer1.mayMatchProperty();
    }

    @Test(timeout = 4000)
    public void test3798() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("T", "T", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.matchProperty("T");
        jsonPointer2.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test3799() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("T", "T", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.matchProperty("T");
    }

    @Test(timeout = 4000)
    public void test37100() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("T", "T", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.matchProperty("T");
        jsonPointer1.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test37101() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = new JsonPointer("T", "T", jsonPointer0);
        JsonPointer jsonPointer2 = jsonPointer1.matchProperty("T");
    }

    @Test(timeout = 4000)
    public void test38102() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        jsonPointer0.matchProperty("");
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test39103() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.mayMatchElement();
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test39104() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.mayMatchElement();
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test39105() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.mayMatchElement();
        jsonPointer0.mayMatchProperty();
    }

    @Test(timeout = 4000)
    public void test39106() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.mayMatchElement();
    }

    @Test(timeout = 4000)
    public void test39107() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.mayMatchElement();
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test40108() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.EMPTY;
        boolean boolean0 = jsonPointer0.mayMatchElement();
    }

    @Test(timeout = 4000)
    public void test41109() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile((String) null);
        boolean boolean0 = jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test42110() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test42111() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.matches();
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test42112() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.matches();
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test42113() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.matches();
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test42114() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        boolean boolean0 = jsonPointer0.matches();
        jsonPointer0.mayMatchProperty();
    }

    @Test(timeout = 4000)
    public void test43115() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.valueOf("/");
        jsonPointer0.mayMatchProperty();
    }

    @Test(timeout = 4000)
    public void test43116() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.valueOf("/");
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test43117() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.valueOf("/");
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test43118() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.valueOf("/");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test43119() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.valueOf("/");
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test44120() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.valueOf("");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test45121() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        int int0 = jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test46122() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        String string0 = jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test46123() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        String string0 = jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test46124() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        String string0 = jsonPointer0.toString();
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test46125() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        String string0 = jsonPointer0.toString();
        jsonPointer0.mayMatchElement();
    }

    @Test(timeout = 4000)
    public void test46126() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        String string0 = jsonPointer0.toString();
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test46127() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("G04");
        String string0 = jsonPointer0.toString();
        jsonPointer0.mayMatchProperty();
    }

    @Test(timeout = 4000)
    public void test47128() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("$ZxSb~", 0);
        JsonPointer jsonPointer1 = jsonPointer0.tail();
    }

    @Test(timeout = 4000)
    public void test47129() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("$ZxSb~", 0);
        JsonPointer jsonPointer1 = jsonPointer0.tail();
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test47130() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("$ZxSb~", 0);
        JsonPointer jsonPointer1 = jsonPointer0.tail();
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test47131() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("$ZxSb~", 0);
        JsonPointer jsonPointer1 = jsonPointer0.tail();
        jsonPointer0.mayMatchProperty();
    }

    @Test(timeout = 4000)
    public void test47132() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseQuotedTail("$ZxSb~", 0);
        JsonPointer jsonPointer1 = jsonPointer0.tail();
        jsonPointer1.toString();
    }

    @Test(timeout = 4000)
    public void test48133() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        jsonPointer0.getMatchingProperty();
        jsonPointer0.getMatchingIndex();
    }
}
