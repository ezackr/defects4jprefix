/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 05:37:34 GMT 2023
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Tokeniser_ESTest extends Tokeniser_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("P#fU2u2;RkV/OVC_N}{");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.appropriateEndTagName();
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("NotLessTilde");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.emitDoctypePending();
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("varphi");
        ParseErrorList parseErrorList0 = new ParseErrorList(10765, 10765);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.isAppropriateEndTagToken();
    }

    @Test(timeout = 4000)
    public void test063() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("oO#k]W=uBw6Dy=~&");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("oO#k]W=uBw6Dy=~&");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        token0.toString();
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, (ParseErrorList) null);
        tokeniser0.emitTagPending();
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, (ParseErrorList) null);
        tokeniser0.emitCommentPending();
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("varphi");
        ParseErrorList parseErrorList0 = new ParseErrorList(10765, 10765);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        boolean boolean0 = tokeniser0.currentNodeInHtmlNS();
    }

    @Test(timeout = 4000)
    public void test128() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(881);
        Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
        Token.Tag token_Tag0 = tokeniser0.createTagPending(true);
        token_Tag0.selfClosing = true;
        tokeniser0.emit(token_Tag0);
        tokeniser0.read();
    }

    @Test(timeout = 4000)
    public void test139() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, (ParseErrorList) null);
        Token token0 = tokeniser0.read();
    }

    @Test(timeout = 4000)
    public void test1710() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("Xb>/:&CH'<B^oZI|y{");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
    }

    @Test(timeout = 4000)
    public void test1711() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("Xb>/:&CH'<B^oZI|y{");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        parseErrorList0.size();
    }

    @Test(timeout = 4000)
    public void test1712() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("Xb>/:&CH'<B^oZI|y{");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        token0.toString();
    }

    @Test(timeout = 4000)
    public void test1813() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("ii;>,Xd1)2,tCu~");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = Character.valueOf('7');
        tokeniser0.consumeCharacterReference(character0, true);
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test1914() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("There is an unread token pending!");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, (ParseErrorList) null);
        Character character0 = Character.valueOf('T');
        Character character1 = tokeniser0.consumeCharacterReference(character0, false);
    }

    @Test(timeout = 4000)
    public void test2015() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("&]5_I/<z9qJ");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
    }

    @Test(timeout = 4000)
    public void test2116() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("#X3");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.consumeCharacterReference((Character) null, true);
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test2217() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("#1");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.consumeCharacterReference((Character) null, false);
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test2318() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("#");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
    }

    @Test(timeout = 4000)
    public void test2319() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("#");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
        parseErrorList0.size();
    }

    @Test(timeout = 4000)
    public void test2320() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("#");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test2421() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("E=F&;bMGiwQG^+>F");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(3301);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.read();
        parseErrorList0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test2422() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("E=F&;bMGiwQG^+>F");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(3301);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.read();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test2523() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("planck");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.consumeCharacterReference((Character) null, false);
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test2524() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("planck");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.consumeCharacterReference((Character) null, false);
        parseErrorList0.size();
    }

    @Test(timeout = 4000)
    public void test2625() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("numeric reference with no numerals");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
    }

    @Test(timeout = 4000)
    public void test2726() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("sc8=V-Tt}!y:9");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(9);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = Character.valueOf('');
        tokeniser0.consumeCharacterReference(character0, true);
        parseErrorList0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("sc8=V-Tt}!y:9");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(9);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = Character.valueOf('');
        tokeniser0.consumeCharacterReference(character0, true);
        parseErrorList0.size();
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
        Token.Tag token_Tag0 = tokeniser0.createTagPending(false);
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("BW{A@<");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.read();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("BW{A@<");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.read();
        parseErrorList0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader(" X<");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(88);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test3032() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader(" X<");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(88);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        token0.toString();
    }

    @Test(timeout = 4000)
    public void test3133() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("Xb>/:&CH'<B^oZI|y{");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(10981);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        parseErrorList0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test3134() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("Xb>/:&CH'<B^oZI|y{");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(10981);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        token0.toString();
    }
}
