/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 05:40:58 GMT 2023
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;
import org.junit.runner.RunWith;

public class TokeniserTest {

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("#63322");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        // Undeclared exception!
        try {
            tokeniser0.appropriateEndTagName();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
        // Undeclared exception!
        try {
            tokeniser0.emitDoctypePending();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("/n;u*Y\"5l:Esx&lH*X");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        assertEquals("/n;u*Y\"5l:Esx&lH*X", token0.toString());
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("/n;u*Y\"5l:Esx&lH*X");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        assertNotNull(token0);
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
        // Undeclared exception!
        try {
            tokeniser0.emitTagPending();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
        // Undeclared exception!
        try {
            tokeniser0.emitCommentPending();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("o");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        boolean boolean0 = tokeniser0.currentNodeInHtmlNS();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test117() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
        Token.StartTag token_StartTag0 = new Token.StartTag();
        token_StartTag0.selfClosing = true;
        tokeniser0.emit(token_StartTag0);
        Token token0 = tokeniser0.read();
        assertSame(token0, token_StartTag0);
    }

    @Test(timeout = 4000)
    public void test138() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(56);
        Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
        Token.EndTag token_EndTag0 = new Token.EndTag("_#:Z3n,Y");
        token_EndTag0.newAttribute();
        // Undeclared exception!
        try {
            tokeniser0.emit(token_EndTag0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test149() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("&");
        ParseErrorList parseErrorList0 = new ParseErrorList(2, 2);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        assertEquals("&", token0.toString());
    }

    @Test(timeout = 4000)
    public void test1410() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("&");
        ParseErrorList parseErrorList0 = new ParseErrorList(2, 2);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        assertTrue(parseErrorList0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test1511() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("mp;)*|");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Character character0 = new Character('2');
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character1 = tokeniser0.consumeCharacterReference(character0, false);
        assertEquals('\u2213', (char) character1);
    }

    @Test(timeout = 4000)
    public void test1612() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("quot");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = new Character('q');
        Character character1 = tokeniser0.consumeCharacterReference(character0, true);
        assertNull(character1);
    }

    @Test(timeout = 4000)
    public void test1713() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader(" H");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
        assertNull(character0);
    }

    @Test(timeout = 4000)
    public void test1814() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("#X63322");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
        assertEquals('\u3322', (char) character0);
    }

    @Test(timeout = 4000)
    public void test1815() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("#X63322");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
        assertNotNull(character0);
    }

    @Test(timeout = 4000)
    public void test1816() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("#X63322");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
        assertEquals(0, parseErrorList0.size());
    }

    @Test(timeout = 4000)
    public void test1917() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("#6699750");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = new Character('{');
        Character character1 = tokeniser0.consumeCharacterReference(character0, false);
        assertEquals(0, parseErrorList0.size());
    }

    @Test(timeout = 4000)
    public void test1918() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("#6699750");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = new Character('{');
        Character character1 = tokeniser0.consumeCharacterReference(character0, false);
        assertNotNull(character1);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("#6699750");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = new Character('{');
        Character character1 = tokeniser0.consumeCharacterReference(character0, false);
        assertTrue(parseErrorList0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("#xy422");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
        assertNull(character0);
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("#xy422");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
        assertTrue(parseErrorList0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("#xy422");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
        assertEquals(0, parseErrorList0.size());
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("#2;dD1U^-");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, false);
        assertEquals('\u0002', (char) character0);
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader(";XTQI?k");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.consumeCharacterReference((Character) null, true);
        assertTrue(parseErrorList0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader(";XTQI?k");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.consumeCharacterReference((Character) null, true);
        assertEquals(0, parseErrorList0.size());
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("Mu=IuX,3}eJfcF+B!");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking((-1778));
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = Character.valueOf('X');
        Character character1 = tokeniser0.consumeCharacterReference(character0, true);
        assertNull(character1);
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("invalid n med\"referenece '%s'");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
        assertNull(character0);
    }

    @Test(timeout = 4000)
    public void test2528() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("ang7-=@=z}ww=1t");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
        assertNull(character0);
    }

    @Test(timeout = 4000)
    public void test2629() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("in|v8Y}xF@");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
        assertNotNull(character0);
    }

    @Test(timeout = 4000)
    public void test2630() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("in|v8Y}xF@");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
        assertEquals(0, parseErrorList0.size());
    }

    @Test(timeout = 4000)
    public void test2631() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("in|v8Y}xF@");
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Character character0 = tokeniser0.consumeCharacterReference((Character) null, true);
        assertTrue(parseErrorList0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test2732() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        Tokeniser tokeniser0 = new Tokeniser((CharacterReader) null, parseErrorList0);
        Token.Tag token_Tag0 = tokeniser0.createTagPending(false);
        assertNotNull(token_Tag0);
    }

    @Test(timeout = 4000)
    public void test2833() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("e%p@XtA`N856w{D<X");
        ParseErrorList parseErrorList0 = new ParseErrorList(2, 2);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.read();
        assertEquals(1, parseErrorList0.size());
    }

    @Test(timeout = 4000)
    public void test2834() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("e%p@XtA`N856w{D<X");
        ParseErrorList parseErrorList0 = new ParseErrorList(2, 2);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.read();
        assertFalse(parseErrorList0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test2935() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("e%p@XtA`N856w{D<X");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(36);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token.StartTag token_StartTag0 = new Token.StartTag();
        tokeniser0.emit(token_StartTag0);
        // Undeclared exception!
        try {
            tokeniser0.isAppropriateEndTagToken();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test3036() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader(";");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        boolean boolean0 = tokeniser0.isAppropriateEndTagToken();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3137() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("TBaOPs<9m?");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        assertEquals("TBaOPs<9m?", token0.toString());
    }

    @Test(timeout = 4000)
    public void test3138() throws Throwable {
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        CharacterReader characterReader0 = new CharacterReader("TBaOPs<9m?");
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        Token token0 = tokeniser0.read();
        assertEquals(0, parseErrorList0.size());
    }

    @Test(timeout = 4000)
    public void test3239() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("0Zg6o");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(1342);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        TokeniserState tokeniserState0 = TokeniserState.BeforeDoctypeName;
        tokeniser0.error(tokeniserState0);
        assertFalse(parseErrorList0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test3240() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("0Zg6o");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(1342);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        TokeniserState tokeniserState0 = TokeniserState.BeforeDoctypeName;
        tokeniser0.error(tokeniserState0);
        assertEquals(1, parseErrorList0.size());
    }

    @Test(timeout = 4000)
    public void test3441() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("#9rElC.:K");
        ParseErrorList parseErrorList0 = new ParseErrorList(82, 82);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.consumeCharacterReference((Character) null, false);
        assertFalse(parseErrorList0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test3442() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("#9rElC.:K");
        ParseErrorList parseErrorList0 = new ParseErrorList(82, 82);
        Tokeniser tokeniser0 = new Tokeniser(characterReader0, parseErrorList0);
        tokeniser0.consumeCharacterReference((Character) null, false);
        assertEquals(1, parseErrorList0.size());
    }
}
