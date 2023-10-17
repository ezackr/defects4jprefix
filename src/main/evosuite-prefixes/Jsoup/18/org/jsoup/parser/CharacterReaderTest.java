/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 20:50:09 GMT 2023
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.parser.CharacterReader;
import org.junit.runner.RunWith;

public class CharacterReaderTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("$B");
        boolean boolean0 = characterReader0.matchConsumeIgnoreCase("$B");
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("$B");
        boolean boolean0 = characterReader0.matchConsumeIgnoreCase("$B");
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("O_j{lD'oz@");
        boolean boolean0 = characterReader0.matchConsume("O_j{lD'oz@");
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("O_j{lD'oz@");
        boolean boolean0 = characterReader0.matchConsume("O_j{lD'oz@");
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader(">9SeM@!GS8U+v");
        characterReader0.consumeAsString();
        boolean boolean0 = characterReader0.matchesDigit();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader(">9SeM@!GS8U+v");
        characterReader0.consumeAsString();
        boolean boolean0 = characterReader0.matchesDigit();
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("bdbdbdbdzbzms#f;:+");
        characterReader0.consumeHexSequence();
        boolean boolean0 = characterReader0.matchesLetter();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("bdbdbdbdzbzms#f;:+");
        characterReader0.consumeHexSequence();
        boolean boolean0 = characterReader0.matchesLetter();
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("eaE$");
        characterReader0.consumeAsString();
        boolean boolean0 = characterReader0.matchesLetter();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("eaE$");
        characterReader0.consumeAsString();
        boolean boolean0 = characterReader0.matchesLetter();
    }

    @Test(timeout = 4000)
    public void test0510() throws Throwable {
        String string0 = "ZE)wYy,\\uj}";
        CharacterReader characterReader0 = new CharacterReader(string0);
        boolean boolean0 = characterReader0.matchesLetter();
    }

    @Test(timeout = 4000)
    public void test0611() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("Array must not contain any null objects");
        boolean boolean0 = characterReader0.matchesLetter();
    }

    @Test(timeout = 4000)
    public void test0712() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("[J=DRd5=:Uhxdjbv");
        characterReader0.consume();
        char[] charArray0 = new char[3];
        charArray0[0] = '[';
        boolean boolean0 = characterReader0.matchesAny(charArray0);
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test0713() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("[J=DRd5=:Uhxdjbv");
        characterReader0.consume();
        char[] charArray0 = new char[3];
        charArray0[0] = '[';
        boolean boolean0 = characterReader0.matchesAny(charArray0);
    }

    @Test(timeout = 4000)
    public void test0814() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("org.jsoup.parser.CharacterReader");
        boolean boolean0 = characterReader0.matches('C');
    }

    @Test(timeout = 4000)
    public void test0915() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("94)=-");
        characterReader0.consumeDigitSequence();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test1016() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("0gq)owzGcAH|R5Wq");
        characterReader0.consumeDigitSequence();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test1117() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("eaE$");
        characterReader0.consumeHexSequence();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test1218() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("F8rnT");
        characterReader0.consumeHexSequence();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test1319() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("WALp:");
        characterReader0.consumeAsString();
        characterReader0.consumeHexSequence();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test1420() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("94)=-");
        characterReader0.consumeHexSequence();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test1521() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("0#,Z}M;zfFm4HU<`");
        characterReader0.consumeHexSequence();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test1622() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("org.jsoup.parser.CharacterReader");
        char[] charArray0 = new char[3];
        charArray0[1] = 'p';
        characterReader0.consumeToAny(charArray0);
        characterReader0.consume();
        characterReader0.consume();
        characterReader0.consumeLetterSequence();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test1723() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("ZAMunt 8beDtrue");
        characterReader0.consumeAsString();
        characterReader0.consumeLetterSequence();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test1824() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("rC}_al#b@D)_uqc");
        characterReader0.consumeTo("C}_al#b@D)_uq");
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test1925() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader(")sy=)>_FwLvb");
        characterReader0.consume();
        characterReader0.consumeTo(')');
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test2026() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("3");
        char[] charArray0 = new char[0];
        characterReader0.consumeToAny(charArray0);
        characterReader0.unconsume();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test2027() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("3");
        char[] charArray0 = new char[0];
        characterReader0.consumeToAny(charArray0);
        characterReader0.unconsume();
        characterReader0.consumeTo('q');
        characterReader0.toString();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test2128() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("1");
        characterReader0.consumeAsString();
        int int0 = characterReader0.pos();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test2129() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("1");
        characterReader0.consumeAsString();
        int int0 = characterReader0.pos();
    }

    @Test(timeout = 4000)
    public void test2230() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("org.jsoup.helper.Validate");
        characterReader0.unconsume();
        int int0 = characterReader0.pos();
    }

    @Test(timeout = 4000)
    public void test2331() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("");
        characterReader0.advance();
        boolean boolean0 = characterReader0.matchesIgnoreCase("");
    }

    @Test(timeout = 4000)
    public void test2432() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("org.jsoup.parser.CharacterReader");
        boolean boolean0 = characterReader0.matches("B#H2Cf1%+I/(e");
    }

    @Test(timeout = 4000)
    public void test2533() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("");
        boolean boolean0 = characterReader0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test2634() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("bdbd6h5iezbzms#f;+");
        boolean boolean0 = characterReader0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test2735() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("bdbd6h5iezbzms#f;+");
        characterReader0.consumeLetterSequence();
        char char0 = characterReader0.current();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test2736() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("bdbd6h5iezbzms#f;+");
        characterReader0.consumeLetterSequence();
        char char0 = characterReader0.current();
    }

    @Test(timeout = 4000)
    public void test2837() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("bLQMgG;c\"d^(k#.2");
        char char0 = characterReader0.current();
    }

    @Test(timeout = 4000)
    public void test2938() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("s");
        String string0 = characterReader0.consumeToEnd();
    }

    @Test(timeout = 4000)
    public void test3039() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("");
        characterReader0.consume();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test3140() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("Array must not contain any null objects");
        characterReader0.unconsume();
        characterReader0.matchesLetter();
    }

    @Test(timeout = 4000)
    public void test3241() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("%'HSL");
        characterReader0.matchesIgnoreCase((String) null);
    }

    @Test(timeout = 4000)
    public void test3342() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("CV-qOcIV1>'8E9%");
        characterReader0.unconsume();
        characterReader0.matchesDigit();
    }

    @Test(timeout = 4000)
    public void test3443() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("org.jsoup.helper.Validate");
        char[] charArray0 = new char[1];
        characterReader0.unconsume();
        characterReader0.matchesAny(charArray0);
    }

    @Test(timeout = 4000)
    public void test3544() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("org.jsoup.parser.CharacterReader");
        characterReader0.matchesAny((char[]) null);
    }

    @Test(timeout = 4000)
    public void test3645() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("");
        characterReader0.advance();
        characterReader0.matches("");
    }

    @Test(timeout = 4000)
    public void test3746() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader(";1L@YWx");
        characterReader0.matches((String) null);
    }

    @Test(timeout = 4000)
    public void test3847() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("O_j{lD'oz@");
        characterReader0.unconsume();
        characterReader0.matches('');
    }

    @Test(timeout = 4000)
    public void test3948() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("");
        characterReader0.matchConsumeIgnoreCase((String) null);
    }

    @Test(timeout = 4000)
    public void test4049() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("O_j{lD'oz@");
        characterReader0.consumeToEnd();
        characterReader0.consumeAsString();
        characterReader0.matchConsume("O_j{lD'oz@");
    }

    @Test(timeout = 4000)
    public void test4150() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("");
        characterReader0.matchConsume((String) null);
    }

    @Test(timeout = 4000)
    public void test4251() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("1");
        characterReader0.containsIgnoreCase((String) null);
    }

    @Test(timeout = 4000)
    public void test4352() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("7{%");
        characterReader0.consume();
        characterReader0.consumeTo('7');
        characterReader0.consumeToEnd();
    }

    @Test(timeout = 4000)
    public void test4453() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("-$_HLg^m']W't ");
        characterReader0.unconsume();
        char[] charArray0 = new char[3];
        characterReader0.consumeToAny(charArray0);
    }

    @Test(timeout = 4000)
    public void test4554() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("94)=-");
        characterReader0.consumeToAny((char[]) null);
    }

    @Test(timeout = 4000)
    public void test4655() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("bdbdbdbdzbzms#f;:+");
        char[] charArray0 = new char[5];
        characterReader0.consumeToAny(charArray0);
        characterReader0.consumeTo("%VJ#Rn5=-WS(");
    }

    @Test(timeout = 4000)
    public void test4756() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("");
        characterReader0.consumeTo((String) null);
    }

    @Test(timeout = 4000)
    public void test4857() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("org.jsoup.parser.CharacterReader");
        characterReader0.consumeTo("opsGjde");
        characterReader0.consumeTo('H');
    }

    @Test(timeout = 4000)
    public void test4958() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("OJj}O7WvUdg");
        characterReader0.unconsume();
        characterReader0.consumeLetterSequence();
    }

    @Test(timeout = 4000)
    public void test5059() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("org.jsoup.helper.Validate");
        characterReader0.unconsume();
        characterReader0.consumeDigitSequence();
    }

    @Test(timeout = 4000)
    public void test5160() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("");
        characterReader0.unconsume();
        characterReader0.consume();
    }

    @Test(timeout = 4000)
    public void test5261() throws Throwable {
        CharacterReader characterReader0 = null;
        characterReader0 = new CharacterReader((String) null);
    }

    @Test(timeout = 4000)
    public void test5362() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("6\"#LD5Y");
        boolean boolean0 = characterReader0.containsIgnoreCase("6\"#LD5Y");
    }

    @Test(timeout = 4000)
    public void test5463() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("rC}_a;l#b@D)_uwc");
        boolean boolean0 = characterReader0.containsIgnoreCase("rC}_a;l#b@D)_uwc");
    }

    @Test(timeout = 4000)
    public void test5564() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("BDBD6\"5,Inm)'}@:+");
        boolean boolean0 = characterReader0.containsIgnoreCase("");
    }

    @Test(timeout = 4000)
    public void test5665() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("}?T");
        boolean boolean0 = characterReader0.matchConsumeIgnoreCase(":,Z:]9");
    }

    @Test(timeout = 4000)
    public void test5766() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader(")sy=)>_FwLvb");
        boolean boolean0 = characterReader0.matchConsume("sy");
    }

    @Test(timeout = 4000)
    public void test5867() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("bdbd6h5iezbzms#f;+");
        characterReader0.consumeLetterSequence();
        boolean boolean0 = characterReader0.matchesDigit();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test5868() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("bdbd6h5iezbzms#f;+");
        characterReader0.consumeLetterSequence();
        boolean boolean0 = characterReader0.matchesDigit();
    }

    @Test(timeout = 4000)
    public void test5969() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("orgjsoup.helper.Validat");
        characterReader0.consumeLetterSequence();
        boolean boolean0 = characterReader0.matchesDigit();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test5970() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("orgjsoup.helper.Validat");
        characterReader0.consumeLetterSequence();
        boolean boolean0 = characterReader0.matchesDigit();
    }

    @Test(timeout = 4000)
    public void test6071() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("bdbd6h5iezbzms#f;+");
        boolean boolean0 = characterReader0.matchesDigit();
    }

    @Test(timeout = 4000)
    public void test6172() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader(")sy=)>_FwLvb");
        boolean boolean0 = characterReader0.matchesLetter();
    }

    @Test(timeout = 4000)
    public void test6273() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("bdbd6h5iezbzms#f;+");
        char[] charArray0 = new char[7];
        charArray0[0] = 'b';
        boolean boolean0 = characterReader0.matchesAny(charArray0);
    }

    @Test(timeout = 4000)
    public void test6374() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("7");
        characterReader0.consumeHexSequence();
        char[] charArray0 = new char[14];
        boolean boolean0 = characterReader0.matchesAny(charArray0);
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test6375() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("7");
        characterReader0.consumeHexSequence();
        char[] charArray0 = new char[14];
        boolean boolean0 = characterReader0.matchesAny(charArray0);
    }

    @Test(timeout = 4000)
    public void test6476() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("O_j{lD'oz@");
        boolean boolean0 = characterReader0.matches('');
    }

    @Test(timeout = 4000)
    public void test6577() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("BDBD6\"5,Inm)'}@:+");
        boolean boolean0 = characterReader0.matches('K');
    }

    @Test(timeout = 4000)
    public void test6678() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("rC}_a;l#b@D)_uwc");
        characterReader0.advance();
        characterReader0.consumeTo("rC}_a;l#b@D)_uwc");
        boolean boolean0 = characterReader0.matches('F');
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test6679() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("rC}_a;l#b@D)_uwc");
        characterReader0.advance();
        characterReader0.consumeTo("rC}_a;l#b@D)_uwc");
        boolean boolean0 = characterReader0.matches('F');
    }

    @Test(timeout = 4000)
    public void test6780() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("BDBD6\"5,Inm)'}@:+");
        String string0 = characterReader0.consumeDigitSequence();
    }

    @Test(timeout = 4000)
    public void test6881() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("rC}_a;l#b@D)_uwc");
        characterReader0.advance();
        characterReader0.consumeTo("rC}_a;l#b@D)_uwc");
        characterReader0.consumeDigitSequence();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test6982() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("bdbd6h5iezbzms#f;+");
        characterReader0.consumeLetterSequence();
        char[] charArray0 = new char[7];
        charArray0[0] = 'b';
        characterReader0.consumeToAny(charArray0);
        characterReader0.consumeLetterSequence();
        characterReader0.consumeAsString();
        characterReader0.consumeHexSequence();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test7083() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("rC}_a;l#b@D)_uwc");
        String string0 = characterReader0.consumeHexSequence();
    }

    @Test(timeout = 4000)
    public void test7184() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("rC}_a;l#b@D)_uwc");
        characterReader0.consumeLetterSequence();
        boolean boolean0 = characterReader0.matchesLetter();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test7185() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("rC}_a;l#b@D)_uwc");
        characterReader0.consumeLetterSequence();
        boolean boolean0 = characterReader0.matchesLetter();
    }

    @Test(timeout = 4000)
    public void test7286() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader(")sy=)>_FwLvb");
        String string0 = characterReader0.consumeLetterSequence();
    }

    @Test(timeout = 4000)
    public void test7387() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader(")sy=)>_FwLvb");
        char[] charArray0 = new char[7];
        charArray0[4] = ')';
        String string0 = characterReader0.consumeToAny(charArray0);
    }

    @Test(timeout = 4000)
    public void test7488() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("org.jsoup.helper.Validate");
        String string0 = characterReader0.consumeTo("org.jsoup.helper.Validate");
    }

    @Test(timeout = 4000)
    public void test7489() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("org.jsoup.helper.Validate");
        String string0 = characterReader0.consumeTo("org.jsoup.helper.Validate");
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test7590() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("org.jsoup.parser.CharacterReader");
        characterReader0.consumeTo("opsGjde");
        characterReader0.consumeLetterSequence();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test7691() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("");
        characterReader0.consume();
        characterReader0.consumeAsString();
    }

    @Test(timeout = 4000)
    public void test7792() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("7");
        characterReader0.consumeHexSequence();
        char char0 = characterReader0.current();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test7793() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("7");
        characterReader0.consumeHexSequence();
        char char0 = characterReader0.current();
    }

    @Test(timeout = 4000)
    public void test7894() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("6!zy^?*=BxLN+>^&S\"");
        String string0 = characterReader0.consumeToEnd();
    }

    @Test(timeout = 4000)
    public void test7895() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("6!zy^?*=BxLN+>^&S\"");
        String string0 = characterReader0.consumeToEnd();
        boolean boolean0 = characterReader0.matchesLetter();
    }

    @Test(timeout = 4000)
    public void test7996() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("org.jsoup.helper.Validate");
        int int0 = characterReader0.pos();
    }

    @Test(timeout = 4000)
    public void test8097() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("O_j{lD'oz@");
        String string0 = characterReader0.consumeToEnd();
    }

    @Test(timeout = 4000)
    public void test8098() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("O_j{lD'oz@");
        String string0 = characterReader0.consumeToEnd();
        boolean boolean0 = characterReader0.matchesDigit();
    }

    @Test(timeout = 4000)
    public void test8199() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("6!zy^?*=BxLN+>^&S\"");
        String string0 = characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test82100() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("6!zy^?*=BxLN+>^&S\"");
        characterReader0.unconsume();
        characterReader0.current();
    }

    @Test(timeout = 4000)
    public void test83101() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("");
        boolean boolean0 = characterReader0.matches("");
    }

    @Test(timeout = 4000)
    public void test84102() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("");
        characterReader0.advance();
        characterReader0.consumeHexSequence();
    }

    @Test(timeout = 4000)
    public void test85103() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("");
        characterReader0.mark();
        characterReader0.toString();
    }

    @Test(timeout = 4000)
    public void test86104() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("");
        boolean boolean0 = characterReader0.matchesIgnoreCase("");
    }

    @Test(timeout = 4000)
    public void test87105() throws Throwable {
        CharacterReader characterReader0 = new CharacterReader("");
        characterReader0.rewindToMark();
        characterReader0.toString();
    }
}
