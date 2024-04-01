/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:19:23 GMT 2023
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Token;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Token_ESTest extends Token_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Attributes attributes0 = new Attributes();
        Token.StartTag token_StartTag0 = new Token.StartTag(" />", attributes0);
        String string0 = token_StartTag0.name();
        assertEquals(" />", string0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag("org.j^oup.parser.Token$TokenT]pe");
        token_StartTag0.appendTagName("<org.j^oup.parser.Token$TokenT]pe>");
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        token_EndTag0.appendAttributeValue("7Wr2X");
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Token.Comment token_Comment0 = new Token.Comment();
        String string0 = token_Comment0.getData();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Token.Character token_Character0 = new Token.Character("|#8%_F&&?:?[Cv).[{");
        String string0 = token_Character0.getData();
        assertEquals("|#8%_F&&?:?[Cv).[{", string0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Attributes attributes0 = new Attributes();
        Token.StartTag token_StartTag0 = new Token.StartTag("", attributes0);
        Token.StartTag token_StartTag1 = token_StartTag0.asStartTag();
        assertSame(token_StartTag0, token_StartTag1);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        token_Doctype0.forceQuirks = true;
        Token.Doctype token_Doctype1 = token_Doctype0.asDoctype();
        assertTrue(token_Doctype1.isForceQuirks());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Token.Comment token_Comment0 = new Token.Comment();
        Token.Comment token_Comment1 = token_Comment0.asComment();
        assertSame(token_Comment1, token_Comment0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Token.Character token_Character0 = new Token.Character((String) null);
        Token.Character token_Character1 = token_Character0.asCharacter();
        assertSame(token_Character0, token_Character1);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag("");
        // Undeclared exception!
        try {
            token_EndTag0.asDoctype();
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // org.jsoup.parser.Token$EndTag cannot be cast to org.jsoup.parser.Token$Doctype
            //
            verifyException("org.jsoup.parser.Token", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        boolean boolean0 = token_EndTag0.isEOF();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Token.Character token_Character0 = new Token.Character("c@te");
        boolean boolean0 = token_Character0.isCharacter();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        boolean boolean0 = token_Doctype0.isCharacter();
        assertFalse(token_Doctype0.isForceQuirks());
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        boolean boolean0 = token_Doctype0.isCharacter();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        Token.Comment token_Comment0 = new Token.Comment();
        boolean boolean0 = token_Comment0.isComment();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        boolean boolean0 = token_EndTag0.isComment();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        boolean boolean0 = token_EndTag0.isEndTag();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        boolean boolean0 = token_Doctype0.isEndTag();
        assertFalse(token_Doctype0.isForceQuirks());
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        boolean boolean0 = token_Doctype0.isEndTag();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        Token.EndTag token_EndTag1 = token_EndTag0.asEndTag();
        Token.TokenType token_TokenType0 = Token.TokenType.StartTag;
        token_EndTag1.type = token_TokenType0;
        boolean boolean0 = token_EndTag1.isStartTag();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        boolean boolean0 = token_EndTag0.isStartTag();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        Token.TokenType token_TokenType0 = Token.TokenType.Doctype;
        token_EndTag0.type = token_TokenType0;
        boolean boolean0 = token_EndTag0.isDoctype();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        boolean boolean0 = token_EndTag0.isDoctype();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag("org.j^oup.parser.Token$TokenT]pe");
        String string0 = token_StartTag0.toString();
        assertEquals("<org.j^oup.parser.Token$TokenT]pe>", string0);
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag("[b@%{]A> KC0:D2)5");
        token_EndTag0.appendAttributeValue('!');
        token_EndTag0.appendAttributeValue('!');
    }

    @Test(timeout = 4000)
    public void test2426() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        token_EndTag0.appendAttributeName("<org.j^oup.parser.Token$TokenT]pe<org.j^oup.parser.Token$TokenT]pe>  p=\"\">");
        token_EndTag0.appendAttributeName("org.j^oup.parser.Token$TokenT]pe");
    }

    @Test(timeout = 4000)
    public void test2527() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        token_EndTag0.appendTagName('J');
        String string0 = token_EndTag0.toString();
        assertEquals("</J>", string0);
    }

    @Test(timeout = 4000)
    public void test2628() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag("", (Attributes) null);
        // Undeclared exception!
        try {
            token_StartTag0.toString();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must be false
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test2729() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag("L8N5Xye})SGoac`r&", (Attributes) null);
        token_StartTag0.finaliseTag();
    }

    @Test(timeout = 4000)
    public void test2830() throws Throwable {
        Token.Character token_Character0 = new Token.Character("Doctype");
        String string0 = token_Character0.toString();
        assertEquals("Doctype", string0);
    }

    @Test(timeout = 4000)
    public void test2931() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        boolean boolean0 = token_Doctype0.isForceQuirks();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3032() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        token_Doctype0.getPublicIdentifier();
        assertFalse(token_Doctype0.isForceQuirks());
    }

    @Test(timeout = 4000)
    public void test3133() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        token_Doctype0.getName();
        assertFalse(token_Doctype0.isForceQuirks());
    }

    @Test(timeout = 4000)
    public void test3234() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        token_Doctype0.getSystemIdentifier();
        assertFalse(token_Doctype0.isForceQuirks());
    }

    @Test(timeout = 4000)
    public void test3335() throws Throwable {
        Token.Comment token_Comment0 = new Token.Comment();
        String string0 = token_Comment0.toString();
        assertEquals("<!---->", string0);
    }

    @Test(timeout = 4000)
    public void test3436() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        boolean boolean0 = token_EndTag0.isSelfClosing();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3537() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag("L8N5Xye})SGoac`r&", (Attributes) null);
        token_StartTag0.appendAttributeName('O');
        token_StartTag0.finaliseTag();
        String string0 = token_StartTag0.toString();
        assertEquals("<L8N5Xye})SGoac`r&  o=\"\">", string0);
    }

    @Test(timeout = 4000)
    public void test3638() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        Token.Tag token_Tag0 = token_EndTag0.name("");
        assertSame(token_EndTag0, token_Tag0);
    }

    @Test(timeout = 4000)
    public void test3739() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        Attributes attributes0 = token_EndTag0.getAttributes();
        assertNull(attributes0);
    }

    @Test(timeout = 4000)
    public void test3840() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        // Undeclared exception!
        try {
            token_Doctype0.asComment();
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // org.jsoup.parser.Token$Doctype cannot be cast to org.jsoup.parser.Token$Comment
            //
            verifyException("org.jsoup.parser.Token", e);
        }
    }

    @Test(timeout = 4000)
    public void test3941() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        Token.Doctype token_Doctype1 = token_Doctype0.asDoctype();
        Token.TokenType token_TokenType0 = Token.TokenType.EOF;
        token_Doctype1.type = token_TokenType0;
        boolean boolean0 = token_Doctype1.isEOF();
        assertFalse(token_Doctype1.isForceQuirks());
    }

    @Test(timeout = 4000)
    public void test3942() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        Token.Doctype token_Doctype1 = token_Doctype0.asDoctype();
        Token.TokenType token_TokenType0 = Token.TokenType.EOF;
        token_Doctype1.type = token_TokenType0;
        boolean boolean0 = token_Doctype1.isEOF();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test4043() throws Throwable {
        Token.Comment token_Comment0 = new Token.Comment();
        // Undeclared exception!
        try {
            token_Comment0.asStartTag();
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // org.jsoup.parser.Token$Comment cannot be cast to org.jsoup.parser.Token$StartTag
            //
            verifyException("org.jsoup.parser.Token", e);
        }
    }

    @Test(timeout = 4000)
    public void test4144() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        // Undeclared exception!
        try {
            token_Doctype0.asCharacter();
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // org.jsoup.parser.Token$Doctype cannot be cast to org.jsoup.parser.Token$Character
            //
            verifyException("org.jsoup.parser.Token", e);
        }
    }

    @Test(timeout = 4000)
    public void test4245() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        // Undeclared exception!
        try {
            token_Doctype0.asEndTag();
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // org.jsoup.parser.Token$Doctype cannot be cast to org.jsoup.parser.Token$EndTag
            //
            verifyException("org.jsoup.parser.Token", e);
        }
    }

    @Test(timeout = 4000)
    public void test4346() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        token_Doctype0.tokenType();
        assertFalse(token_Doctype0.isForceQuirks());
    }

    @Test(timeout = 4000)
    public void test4447() throws Throwable {
        Token.EOF token_EOF0 = new Token.EOF();
    }

    @Test(timeout = 4000)
    public void test4548() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag("org.j^oup.parser.Token$TokenT]pe");
        token_StartTag0.newAttribute();
    }

    @Test(timeout = 4000)
    public void test4649() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag("[b@%{]A> KC0:D2)5");
        token_EndTag0.appendAttributeName("[b@%{]A> KC0:D2)5");
        token_EndTag0.appendAttributeValue('!');
        token_EndTag0.newAttribute();
    }
}
