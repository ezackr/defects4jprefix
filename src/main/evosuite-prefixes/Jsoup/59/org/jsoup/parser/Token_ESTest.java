/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 22:19:07 GMT 2023
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
        Token.StartTag token_StartTag0 = new Token.StartTag();
        token_StartTag0.appendAttributeName('G');
        token_StartTag0.appendTagName('j');
        token_StartTag0.newAttribute();
        String string0 = token_StartTag0.toString();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        token_EndTag0.tagName = "muted";
        String string0 = token_EndTag0.normalName();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        Token.StartTag token_StartTag1 = (Token.StartTag) token_StartTag0.name("2l.-EN7/NU;bq");
        String string0 = token_StartTag1.name();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        token_StartTag0.appendTagName('j');
        String string0 = token_StartTag0.toString();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        Token.Tag token_Tag0 = token_EndTag0.reset();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        token_StartTag0.name();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Token.Comment token_Comment0 = new Token.Comment();
        String string0 = token_Comment0.getData();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Token.Character token_Character0 = new Token.Character();
        String string0 = token_Character0.getData();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        Token.StartTag token_StartTag1 = token_StartTag0.asStartTag();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        Token.EndTag token_EndTag1 = token_EndTag0.asEndTag();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        Token.Doctype token_Doctype1 = token_Doctype0.asDoctype();
        token_Doctype1.isForceQuirks();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Token.Comment token_Comment0 = new Token.Comment();
        Token.Comment token_Comment1 = token_Comment0.asComment();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Token.Character token_Character0 = new Token.Character();
        Token.Character token_Character1 = token_Character0.asCharacter();
        token_Character1.toString();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        Attributes attributes0 = new Attributes();
        Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("org.jsoup.parser.Token$1", attributes0);
        Token.TokenType token_TokenType0 = Token.TokenType.EOF;
        token_StartTag1.type = token_TokenType0;
        boolean boolean0 = token_StartTag0.isEOF();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        boolean boolean0 = token_StartTag0.isEOF();
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        Token.TokenType token_TokenType0 = Token.TokenType.Character;
        token_StartTag0.type = token_TokenType0;
        boolean boolean0 = token_StartTag0.isCharacter();
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        boolean boolean0 = token_StartTag0.isCharacter();
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        Token.TokenType token_TokenType0 = Token.TokenType.Comment;
        token_EndTag0.type = token_TokenType0;
        boolean boolean0 = token_EndTag0.isComment();
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Token.Character token_Character0 = new Token.Character();
        boolean boolean0 = token_Character0.isComment();
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Token.Comment token_Comment0 = new Token.Comment();
        Token.TokenType token_TokenType0 = Token.TokenType.EndTag;
        token_Comment0.type = token_TokenType0;
        boolean boolean0 = token_Comment0.isEndTag();
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        boolean boolean0 = token_StartTag0.isEndTag();
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        boolean boolean0 = token_StartTag0.isStartTag();
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Token.Comment token_Comment0 = new Token.Comment();
        boolean boolean0 = token_Comment0.isStartTag();
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        Token.Character token_Character0 = new Token.Character();
        Token.TokenType token_TokenType0 = Token.TokenType.Doctype;
        token_Character0.type = token_TokenType0;
        boolean boolean0 = token_Character0.isDoctype();
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        boolean boolean0 = token_StartTag0.isDoctype();
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("", (Attributes) null);
        token_StartTag1.toString();
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        token_EndTag0.appendAttributeValue("<!---->");
        int[] intArray0 = new int[6];
        token_EndTag0.appendAttributeValue(intArray0);
    }

    @Test(timeout = 4000)
    public void test2927() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        Token.Tag token_Tag0 = token_StartTag0.name("2l.-EN7/NU;bq");
        token_StartTag0.appendTagName("org.jsoup.parser.Token$Doctype");
    }

    @Test(timeout = 4000)
    public void test3628() throws Throwable {
        Token.Character token_Character0 = new Token.Character();
        Token.Character token_Character1 = token_Character0.data("_Y1\" Km`hOh~z");
        token_Character1.toString();
    }

    @Test(timeout = 4000)
    public void test3729() throws Throwable {
        Token.Character token_Character0 = new Token.Character();
        Token token0 = token_Character0.reset();
        token0.toString();
    }

    @Test(timeout = 4000)
    public void test3830() throws Throwable {
        Token.Character token_Character0 = new Token.Character();
        String string0 = token_Character0.toString();
    }

    @Test(timeout = 4000)
    public void test3931() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        boolean boolean0 = token_Doctype0.isForceQuirks();
    }

    @Test(timeout = 4000)
    public void test4032() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        token_Doctype0.getPublicIdentifier();
        token_Doctype0.isForceQuirks();
    }

    @Test(timeout = 4000)
    public void test4133() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        token_Doctype0.getPubSysKey();
        token_Doctype0.isForceQuirks();
    }

    @Test(timeout = 4000)
    public void test4234() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        Token.Doctype token_Doctype1 = (Token.Doctype) token_Doctype0.reset();
        token_Doctype1.forceQuirks = true;
        Token.Doctype token_Doctype2 = token_Doctype1.asDoctype();
        token_Doctype2.isForceQuirks();
    }

    @Test(timeout = 4000)
    public void test4335() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        token_Doctype0.getName();
        token_Doctype0.isForceQuirks();
    }

    @Test(timeout = 4000)
    public void test4436() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        token_Doctype0.getSystemIdentifier();
        token_Doctype0.isForceQuirks();
    }

    @Test(timeout = 4000)
    public void test4537() throws Throwable {
        Token.Comment token_Comment0 = new Token.Comment();
        Token token0 = token_Comment0.reset();
    }

    @Test(timeout = 4000)
    public void test4638() throws Throwable {
        Token.Comment token_Comment0 = new Token.Comment();
        String string0 = token_Comment0.toString();
    }

    @Test(timeout = 4000)
    public void test4739() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        boolean boolean0 = token_StartTag0.isSelfClosing();
    }

    @Test(timeout = 4000)
    public void test4840() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        token_EndTag0.appendTagName('J');
        String string0 = token_EndTag0.toString();
    }

    @Test(timeout = 4000)
    public void test5141() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        Attributes attributes0 = token_EndTag0.getAttributes();
    }

    @Test(timeout = 4000)
    public void test5242() throws Throwable {
        Token.Character token_Character0 = new Token.Character();
        token_Character0.asComment();
    }

    @Test(timeout = 4000)
    public void test5343() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        token_EndTag0.asDoctype();
    }

    @Test(timeout = 4000)
    public void test5444() throws Throwable {
        Token.EndTag token_EndTag0 = new Token.EndTag();
        token_EndTag0.asStartTag();
    }

    @Test(timeout = 4000)
    public void test5545() throws Throwable {
        Token.Doctype token_Doctype0 = new Token.Doctype();
        token_Doctype0.asCharacter();
    }

    @Test(timeout = 4000)
    public void test5646() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        token_StartTag0.asEndTag();
    }

    @Test(timeout = 4000)
    public void test5747() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        String string0 = token_StartTag0.tokenType();
    }

    @Test(timeout = 4000)
    public void test5848() throws Throwable {
        Token.EOF token_EOF0 = new Token.EOF();
        Token token0 = token_EOF0.reset();
    }

    @Test(timeout = 4000)
    public void test5949() throws Throwable {
        Token.StartTag token_StartTag0 = new Token.StartTag();
        Token.Tag token_Tag0 = token_StartTag0.reset();
    }
}
