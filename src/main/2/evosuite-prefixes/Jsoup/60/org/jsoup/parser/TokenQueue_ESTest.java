/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 06:17:20 GMT 2024
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.TokenQueue;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TokenQueue_ESTest extends TokenQueue_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("s7,]zDXFG>2m^qc'&5");
        tokenQueue0.chompTo("s7,]zDXFG>2m^qc'&5");
        tokenQueue0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("s{#*:,Z:]9ZM");
        boolean boolean0 = tokenQueue0.matchesCS("s{#*:,Z:]9ZM");
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("uShym");
        String string0 = tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("'");
        tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("'");
        tokenQueue0.chompBalanced('\'', '\'');
        tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("s7,]zDXFG>2m^qc'&5");
        tokenQueue0.consumeTagName();
        tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("s7,]zDXFG>2m^qc'&5");
        tokenQueue0.consumeTagName();
        String string0 = tokenQueue0.chompTo("s7,]zDXFG>2m^qc'&5");
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("-");
        char char0 = tokenQueue0.peek();
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("*UAcd7t{f`~HSIl");
        tokenQueue0.chompToIgnoreCase("*UAcd7t{f`~HSIl");
        char char0 = tokenQueue0.peek();
        tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("*UAcd7t{f`~HSIl");
        tokenQueue0.chompToIgnoreCase("*UAcd7t{f`~HSIl");
        char char0 = tokenQueue0.peek();
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("ppuhwm-|=");
        tokenQueue0.consumeElementSelector();
        tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test0811() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("");
        tokenQueue0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test0812() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("");
        char[] charArray0 = new char[8];
        boolean boolean0 = tokenQueue0.matchesAny(charArray0);
    }

    @Test(timeout = 4000)
    public void test0913() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("89_L2");
        tokenQueue0.consumeTagName();
        tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test1014() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("s{*:,Z:]9ZM");
        tokenQueue0.consume("s{*:,Z:]9ZM");
        boolean boolean0 = tokenQueue0.matchesStartTag();
        tokenQueue0.matchesWord();
    }

    @Test(timeout = 4000)
    public void test1015() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("s{*:,Z:]9ZM");
        tokenQueue0.consume("s{*:,Z:]9ZM");
        boolean boolean0 = tokenQueue0.matchesStartTag();
    }

    @Test(timeout = 4000)
    public void test1116() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("=l\"mZJ!");
        boolean boolean0 = tokenQueue0.matchesStartTag();
    }

    @Test(timeout = 4000)
    public void test1217() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("=l\"mZJ!");
        Character character0 = Character.valueOf('<');
        tokenQueue0.addFirst(character0);
        boolean boolean0 = tokenQueue0.matchesStartTag();
        tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test1218() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("=l\"mZJ!");
        Character character0 = Character.valueOf('<');
        tokenQueue0.addFirst(character0);
        boolean boolean0 = tokenQueue0.matchesStartTag();
    }

    @Test(timeout = 4000)
    public void test1319() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("=l\"mZJ!");
        tokenQueue0.consume();
        Character character0 = Character.valueOf('<');
        tokenQueue0.addFirst(character0);
        boolean boolean0 = tokenQueue0.matchesStartTag();
        tokenQueue0.peek();
    }

    @Test(timeout = 4000)
    public void test1320() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("=l\"mZJ!");
        tokenQueue0.consume();
        Character character0 = Character.valueOf('<');
        tokenQueue0.addFirst(character0);
        boolean boolean0 = tokenQueue0.matchesStartTag();
    }

    @Test(timeout = 4000)
    public void test1421() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("        ");
        boolean boolean0 = tokenQueue0.consumeWhitespace();
        tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test1422() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("        ");
        boolean boolean0 = tokenQueue0.consumeWhitespace();
    }

    @Test(timeout = 4000)
    public void test1523() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("s{*:,Z:]9ZM");
        boolean boolean0 = tokenQueue0.consumeWhitespace();
    }

    @Test(timeout = 4000)
    public void test1524() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("s{*:,Z:]9ZM");
        boolean boolean0 = tokenQueue0.consumeWhitespace();
        tokenQueue0.peek();
    }

    @Test(timeout = 4000)
    public void test1625() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("q3J");
        tokenQueue0.consumeWord();
        tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test1726() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("");
        tokenQueue0.advance();
        tokenQueue0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test1827() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("-");
        tokenQueue0.advance();
        tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test1928() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("i)%i(o_.#R~/vV14");
        tokenQueue0.consume("3XNo'");
    }

    @Test(timeout = 4000)
    public void test2029() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("[!FL: uwK}Z\"&(T:");
        tokenQueue0.consumeToIgnoreCase("(/s_?sw;tsS");
        tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test2130() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("s7,]zDXFG>2mpqc'&5");
        tokenQueue0.consumeAttributeKey();
        tokenQueue0.chompToIgnoreCase("s7,]zDXFG>2mpqc'&5");
        tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test2231() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("width must be > 0");
        String[] stringArray0 = new String[0];
        tokenQueue0.consumeToAny(stringArray0);
        tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test2332() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue(" :");
        String[] stringArray0 = new String[1];
        stringArray0[0] = " :";
        tokenQueue0.consumeToAny(stringArray0);
        tokenQueue0.peek();
    }

    @Test(timeout = 4000)
    public void test2433() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("c(>}.+(s'\"");
        tokenQueue0.chompBalanced('S', '(');
        tokenQueue0.chompBalanced('(', 'S');
        tokenQueue0.matchesWord();
    }

    @Test(timeout = 4000)
    public void test2534() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("s_:,z-:]bz");
        tokenQueue0.chompBalanced('e', 's');
        tokenQueue0.peek();
    }

    @Test(timeout = 4000)
    public void test2635() throws Throwable {
        String string0 = TokenQueue.unescape("\\d6h`Nk^Z/Gzq(");
    }

    @Test(timeout = 4000)
    public void test2736() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("onK");
        tokenQueue0.consumeElementSelector();
        tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test2837() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("i");
        tokenQueue0.consumeCssIdentifier();
        tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test2938() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("ppuhwm-|=");
        tokenQueue0.consumeCssIdentifier();
        tokenQueue0.toString();
    }

    @Test(timeout = 4000)
    public void test3039() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("");
        String string0 = tokenQueue0.consumeAttributeKey();
    }

    @Test(timeout = 4000)
    public void test3140() throws Throwable {
        TokenQueue tokenQueue0 = new TokenQueue("s_:,z-:]bz");
        tokenQueue0.consumeAttributeKey();
        tokenQueue0.peek();
    }
}
