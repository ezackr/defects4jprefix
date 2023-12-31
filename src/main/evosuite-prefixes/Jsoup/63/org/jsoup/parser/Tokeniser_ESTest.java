/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 06:07:46 GMT 2023
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Tokeniser_ESTest extends Tokeniser_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test040() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("W<PM!,iwmAb;P>/2${[");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        characterReader0.pos();
    }

    @Test(timeout = 4000)
    public void test041() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("W<PM!,iwmAb;P>/2${[");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        token0.toString();
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
        boolean boolean0 = tokeniser0.currentNodeInHtmlNS();
    }

    @Test(timeout = 4000)
    public void test103() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("KD`%\"&#579gRO");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        char[] charArray0 = new char[0];
        tokeniser0.emit(charArray0);
    }

    @Test(timeout = 4000)
    public void test114() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("kVab&Ox");
        Token.StartTag token_StartTag0 = new Token.StartTag();
        token_StartTag0.selfClosing = true;
        ParseErrorList parseErrorList0 = new ParseErrorList(381, 381);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.emit(token_StartTag0);
        tokeniser0.read();
        parseErrorList0.size();
    }

    @Test(timeout = 4000)
    public void test115() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("kVab&Ox");
        Token.StartTag token_StartTag0 = new Token.StartTag();
        token_StartTag0.selfClosing = true;
        ParseErrorList parseErrorList0 = new ParseErrorList(381, 381);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.emit(token_StartTag0);
        tokeniser0.read();
        parseErrorList0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test126() throws Throwable {
        StringReader stringReader0 = new StringReader("kVab&Ox");
        CharacterReader characterReader0 = new CharacterReader(stringReader0, 1750);
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(1750);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token.EndTag token_EndTag0 = tokeniser0.endPending;
        tokeniser0.emit(token_EndTag0);
        parseErrorList0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test127() throws Throwable {
        StringReader stringReader0 = new StringReader("kVab&Ox");
        CharacterReader characterReader0 = new CharacterReader(stringReader0, 1750);
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(1750);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token.EndTag token_EndTag0 = tokeniser0.endPending;
        tokeniser0.emit(token_EndTag0);
        parseErrorList0.size();
    }

    @Test(timeout = 4000)
    public void test138() throws Throwable {
        StringReader stringReader0 = new StringReader("kVab&Ox");
        CharacterReader characterReader0 = new CharacterReader(stringReader0, 1750);
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(1750);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token.EndTag token_EndTag0 = tokeniser0.endPending;
        token_EndTag0.newAttribute();
        tokeniser0.emit(token_EndTag0);
        parseErrorList0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test139() throws Throwable {
        StringReader stringReader0 = new StringReader("kVab&Ox");
        CharacterReader characterReader0 = new CharacterReader(stringReader0, 1750);
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(1750);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token.EndTag token_EndTag0 = tokeniser0.endPending;
        token_EndTag0.newAttribute();
        tokeniser0.emit(token_EndTag0);
        parseErrorList0.size();
    }

    @Test(timeout = 4000)
    public void test1410() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("}K^Fa(r;p<(&");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        token0.toString();
    }

    @Test(timeout = 4000)
    public void test1411() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("}K^Fa(r;p<(&");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        parseErrorList0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test1512() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("[&gg;");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        TokeniserState tokeniserState0 = TokeniserState.AttributeValue_unquoted;
        tokeniser0.advanceTransition(tokeniserState0);
        tokeniser0.read();
    }

    @Test(timeout = 4000)
    public void test1613() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("K\"&#3MgPFO");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = new Character('K');
        int[] intArray0 = tokeniser0.consumeCharacterReference(character0, false);
    }

    @Test(timeout = 4000)
    public void test1714() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("\"&&#3MgPFO");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        parseErrorList0.size();
    }

    @Test(timeout = 4000)
    public void test1715() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("\"&&#3MgPFO");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        token0.toString();
    }

    @Test(timeout = 4000)
    public void test1816() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("&#xa0;");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        token0.toString();
    }

    @Test(timeout = 4000)
    public void test1917() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("K\"&#g3MgPFO");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        token0.toString();
    }

    @Test(timeout = 4000)
    public void test1918() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("K\"&#g3MgPFO");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        parseErrorList0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test2019() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("zF$xm_5&#8957792");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        parseErrorList0.size();
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("zF$xm_5&#8957792");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        token0.toString();
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("Ny,&gt-");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        String string0 = tokeniser0.unescapeEntities(true);
        characterReader0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("Ny,&gt-");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        String string0 = tokeniser0.unescapeEntities(true);
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("&gg@;");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        token0.toString();
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("&gg;");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        token0.toString();
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("&gt");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        token0.toString();
    }

    @Test(timeout = 4000)
    public void test2426() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("&gt");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        parseErrorList0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test2527() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
        Token.Tag token_Tag0 = tokeniser0.createTagPending(false);
    }

    @Test(timeout = 4000)
    public void test2628() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
        boolean boolean0 = tokeniser0.isAppropriateEndTagToken();
    }

    @Test(timeout = 4000)
    public void test2729() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("kVab&Ox");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token.StartTag token_StartTag0 = tokeniser0.startPending;
        Attributes attributes0 = new Attributes();
        tokeniser0.tagPending = (Token.Tag) token_StartTag0;
        token_StartTag0.nameAttr("kVab&Ox", attributes0);
        tokeniser0.emit(token_StartTag0);
        token_StartTag0.appendTagName("kVab&Ox");
        boolean boolean0 = tokeniser0.isAppropriateEndTagToken();
    }

    @Test(timeout = 4000)
    public void test2830() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("kVab&Ox");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token.StartTag token_StartTag0 = tokeniser0.startPending;
        Attributes attributes0 = new Attributes();
        tokeniser0.tagPending = (Token.Tag) token_StartTag0;
        token_StartTag0.nameAttr("kVab&Ox", attributes0);
        tokeniser0.emit(token_StartTag0);
        boolean boolean0 = tokeniser0.isAppropriateEndTagToken();
    }

    @Test(timeout = 4000)
    public void test2931() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("kVab&Ox");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token.StartTag token_StartTag0 = tokeniser0.startPending;
        Attributes attributes0 = new Attributes();
        token_StartTag0.nameAttr("kVab&Ox", attributes0);
        tokeniser0.emit(token_StartTag0);
        String string0 = tokeniser0.appropriateEndTagName();
    }

    @Test(timeout = 4000)
    public void test3032() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(5);
        Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
        String string0 = tokeniser0.appropriateEndTagName();
    }

    @Test(timeout = 4000)
    public void test3133() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("yB|< u.s-");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(3843);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        parseErrorList0.size();
    }

    @Test(timeout = 4000)
    public void test3134() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("yB|< u.s-");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(3843);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        token0.toString();
    }

    @Test(timeout = 4000)
    public void test3235() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("W<Meu/@yX\"c%/Gjqxu");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        parseErrorList0.size();
    }

    @Test(timeout = 4000)
    public void test3236() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("W<Meu/@yX\"c%/Gjqxu");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        token0.toString();
    }

    @Test(timeout = 4000)
    public void test3337() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("<U@A");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(71);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.read();
        parseErrorList0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test3338() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("<U@A");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(71);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.read();
        parseErrorList0.size();
    }

    @Test(timeout = 4000)
    public void test3439() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("K\"&#532MgO");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(1583);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.read();
        parseErrorList0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test3440() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("K\"&#532MgO");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(1583);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.read();
        parseErrorList0.size();
    }

    @Test(timeout = 4000)
    public void test3541() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("*EK1_?");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.error("*EK1_?");
        parseErrorList0.size();
    }

    @Test(timeout = 4000)
    public void test3542() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("*EK1_?");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.error("*EK1_?");
        parseErrorList0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test3643() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("&gt;");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        String string0 = tokeniser0.unescapeEntities(true);
        characterReader0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test3644() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("&gt;");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        String string0 = tokeniser0.unescapeEntities(true);
    }
}
