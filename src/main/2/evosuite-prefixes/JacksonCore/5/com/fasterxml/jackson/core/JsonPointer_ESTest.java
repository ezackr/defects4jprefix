/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 16:36:23 GMT 2024
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
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class JsonPointer_ESTest extends JsonPointer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        jsonPointer0.hashCode();
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("mc$,q3r8hc");
        String string0 = jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("mc$,q3r8hc");
        String string0 = jsonPointer0.getMatchingProperty();
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("mc$,q3r8hc");
        String string0 = jsonPointer0.getMatchingProperty();
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("mc$,q3r8hc");
        String string0 = jsonPointer0.getMatchingProperty();
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test026() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = jsonPointer0.tail();
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test027() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        JsonPointer jsonPointer1 = jsonPointer0.tail();
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.EMPTY;
        String string0 = jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.valueOf("");
        boolean boolean0 = jsonPointer0.equals((Object) null);
    }

    @Test(timeout = 4000)
    public void test0510() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile("");
        int int0 = jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test0611() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile((String) null);
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test0712() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile("/{E$:@<Di:#(1^xN'");
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test0713() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile("/{E$:@<Di:#(1^xN'");
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test0714() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile("/{E$:@<Di:#(1^xN'");
        jsonPointer0.mayMatchProperty();
    }

    @Test(timeout = 4000)
    public void test0715() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile("/{E$:@<Di:#(1^xN'");
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test0716() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.compile("/{E$:@<Di:#(1^xN'");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test0817() throws Throwable {
        JsonPointer.compile("E/VaJV~");
    }

    @Test(timeout = 4000)
    public void test0918() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("tfVvS{,k6");
        boolean boolean0 = jsonPointer0.matches();
        jsonPointer0.mayMatchProperty();
    }

    @Test(timeout = 4000)
    public void test0919() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("tfVvS{,k6");
        boolean boolean0 = jsonPointer0.matches();
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test0920() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("tfVvS{,k6");
        boolean boolean0 = jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test0921() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("tfVvS{,k6");
        boolean boolean0 = jsonPointer0.matches();
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test0922() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("tfVvS{,k6");
        boolean boolean0 = jsonPointer0.matches();
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test1023() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.EMPTY;
        boolean boolean0 = jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test1124() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.EMPTY;
        boolean boolean0 = jsonPointer0.mayMatchProperty();
    }

    @Test(timeout = 4000)
    public void test1225() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.EMPTY;
        boolean boolean0 = jsonPointer0.mayMatchElement();
    }

    @Test(timeout = 4000)
    public void test1326() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("05");
        boolean boolean0 = jsonPointer0.mayMatchElement();
    }

    @Test(timeout = 4000)
    public void test1327() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("05");
        boolean boolean0 = jsonPointer0.mayMatchElement();
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test1328() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("05");
        boolean boolean0 = jsonPointer0.mayMatchElement();
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test1329() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("05");
        boolean boolean0 = jsonPointer0.mayMatchElement();
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test1430() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        jsonPointer0.matchProperty("i`LC4r3\u0001");
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test1531() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("i`LC4r3\u0001");
        jsonPointer0.mayMatchProperty();
    }

    @Test(timeout = 4000)
    public void test1532() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("i`LC4r3\u0001");
        JsonPointer jsonPointer1 = jsonPointer0.matchProperty("i`LC4r3\u0001");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test1533() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("i`LC4r3\u0001");
        JsonPointer jsonPointer1 = jsonPointer0.matchProperty("i`LC4r3\u0001");
    }

    @Test(timeout = 4000)
    public void test1534() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("i`LC4r3\u0001");
        JsonPointer jsonPointer1 = jsonPointer0.matchProperty("i`LC4r3\u0001");
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test1535() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("i`LC4r3\u0001");
        JsonPointer jsonPointer1 = jsonPointer0.matchProperty("i`LC4r3\u0001");
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test1636() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("E/VaJV~");
        JsonPointer jsonPointer1 = jsonPointer0.matchProperty("");
    }

    @Test(timeout = 4000)
    public void test1637() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("E/VaJV~");
        JsonPointer jsonPointer1 = jsonPointer0.matchProperty("");
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test1638() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("E/VaJV~");
        JsonPointer jsonPointer1 = jsonPointer0.matchProperty("");
        jsonPointer1.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test1639() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("E/VaJV~");
        JsonPointer jsonPointer1 = jsonPointer0.matchProperty("");
        jsonPointer1.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test1740() throws Throwable {
        JsonPointer jsonPointer0 = new JsonPointer();
        jsonPointer0.matchElement(48);
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test1841() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("e2");
        JsonPointer jsonPointer1 = jsonPointer0.matchElement(2);
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test1842() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("e2");
        JsonPointer jsonPointer1 = jsonPointer0.matchElement(2);
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test1843() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("e2");
        JsonPointer jsonPointer1 = jsonPointer0.matchElement(2);
    }

    @Test(timeout = 4000)
    public void test1944() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer.EMPTY;
        JsonPointer jsonPointer1 = jsonPointer0.matchElement((-1));
    }

    @Test(timeout = 4000)
    public void test2045() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("tfVvSk6");
        JsonPointer jsonPointer1 = JsonPointer._parseTail("tfVvSk6");
        boolean boolean0 = jsonPointer0.equals(jsonPointer1);
        jsonPointer1.matches();
    }

    @Test(timeout = 4000)
    public void test2046() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("tfVvSk6");
        JsonPointer jsonPointer1 = JsonPointer._parseTail("tfVvSk6");
        boolean boolean0 = jsonPointer0.equals(jsonPointer1);
    }

    @Test(timeout = 4000)
    public void test2047() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("tfVvSk6");
        JsonPointer jsonPointer1 = JsonPointer._parseTail("tfVvSk6");
        boolean boolean0 = jsonPointer0.equals(jsonPointer1);
        jsonPointer1.toString();
    }

    @Test(timeout = 4000)
    public void test2048() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("tfVvSk6");
        JsonPointer jsonPointer1 = JsonPointer._parseTail("tfVvSk6");
        boolean boolean0 = jsonPointer0.equals(jsonPointer1);
        jsonPointer1.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test2049() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("tfVvSk6");
        JsonPointer jsonPointer1 = JsonPointer._parseTail("tfVvSk6");
        boolean boolean0 = jsonPointer0.equals(jsonPointer1);
        jsonPointer1.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test2150() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("tfVvSk6");
        boolean boolean0 = jsonPointer0.equals(jsonPointer0);
    }

    @Test(timeout = 4000)
    public void test2151() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("tfVvSk6");
        boolean boolean0 = jsonPointer0.equals(jsonPointer0);
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test2152() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("tfVvSk6");
        boolean boolean0 = jsonPointer0.equals(jsonPointer0);
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test2153() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("tfVvSk6");
        boolean boolean0 = jsonPointer0.equals(jsonPointer0);
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test2154() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("tfVvSk6");
        boolean boolean0 = jsonPointer0.equals(jsonPointer0);
        jsonPointer0.mayMatchElement();
    }

    @Test(timeout = 4000)
    public void test2255() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("3`;[0HHTlcE");
        boolean boolean0 = jsonPointer0.equals("3`;[0HHTlcE");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test2256() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("3`;[0HHTlcE");
        boolean boolean0 = jsonPointer0.equals("3`;[0HHTlcE");
    }

    @Test(timeout = 4000)
    public void test2257() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("3`;[0HHTlcE");
        boolean boolean0 = jsonPointer0.equals("3`;[0HHTlcE");
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test2258() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("3`;[0HHTlcE");
        boolean boolean0 = jsonPointer0.equals("3`;[0HHTlcE");
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test2259() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("3`;[0HHTlcE");
        boolean boolean0 = jsonPointer0.equals("3`;[0HHTlcE");
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test2360() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("(o37x/q0e~v/ @7<P");
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test2361() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("(o37x/q0e~v/ @7<P");
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test2362() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("(o37x/q0e~v/ @7<P");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test2463() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("u5a9s5\u00E6M");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test2464() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("u5a9s5\u00E6M");
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test2465() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("u5a9s5\u00E6M");
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test2466() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("u5a9s5\u00E6M");
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test2567() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("O~1zkKH}b");
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test2568() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("O~1zkKH}b");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test2669() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("z@KAk%~+F~");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test2670() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("z@KAk%~+F~");
        jsonPointer0.getMatchingIndex();
    }

    @Test(timeout = 4000)
    public void test2771() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("ua%.5y~.(gH[~j+N`bd");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test2772() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("ua%.5y~.(gH[~j+N`bd");
        jsonPointer0.matches();
    }

    @Test(timeout = 4000)
    public void test2773() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("ua%.5y~.(gH[~j+N`bd");
        jsonPointer0.mayMatchElement();
    }

    @Test(timeout = 4000)
    public void test2874() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("<)~0%8");
        jsonPointer0.toString();
    }

    @Test(timeout = 4000)
    public void test2875() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("<)~0%8");
        jsonPointer0.getMatchingProperty();
    }

    @Test(timeout = 4000)
    public void test2876() throws Throwable {
        JsonPointer jsonPointer0 = JsonPointer._parseTail("<)~0%8");
        jsonPointer0.getMatchingIndex();
    }
}
