/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 21:52:56 GMT 2023
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.cli.Option;
import org.junit.runner.RunWith;

public class OptionTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Option option0 = new Option("", "");
        option0.setType("");
        String string0 = option0.toString();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        Option option0 = new Option("", "");
        option0.setType("");
        String string0 = option0.toString();
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        Option option0 = new Option("", "");
        option0.setType("");
        String string0 = option0.toString();
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        Option option0 = new Option((String) null, true, "<5f-.U>^");
        option0.setValueSeparator('s');
        option0.addValueForProcessing("org.apache.commons.cli.Optinalidator");
        option0.getValueSeparator();
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        Option option0 = new Option("m", "m", false, "m");
        option0.getDescription();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        Option option0 = new Option("m", "m", false, "m");
        option0.getDescription();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        Option option0 = new Option("W", false, "W");
        String string0 = option0.getArgName();
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        Option option0 = new Option("W", false, "W");
        String string0 = option0.getArgName();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        Option option0 = new Option("W", false, "W");
        String string0 = option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        option0.setOptionalArg(true);
        boolean boolean0 = option0.acceptsArg();
        option0.hasOptionalArg();
    }

    @Test(timeout = 4000)
    public void test0410() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        option0.setOptionalArg(true);
        boolean boolean0 = option0.acceptsArg();
    }

    @Test(timeout = 4000)
    public void test0511() throws Throwable {
        Option option0 = new Option("", "");
        option0.setRequired(false);
        option0.isRequired();
    }

    @Test(timeout = 4000)
    public void test0512() throws Throwable {
        Option option0 = new Option("", "");
        option0.setRequired(false);
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test0513() throws Throwable {
        Option option0 = new Option("", "");
        option0.setRequired(false);
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test0514() throws Throwable {
        Option option0 = new Option("", "");
        option0.setRequired(false);
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test0615() throws Throwable {
        Option option0 = new Option((String) null, (String) null);
        option0.isRequired();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test0616() throws Throwable {
        Option option0 = new Option((String) null, (String) null);
        option0.isRequired();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test0717() throws Throwable {
        Option option0 = new Option("", "", false, "");
        option0.getValuesList();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test0718() throws Throwable {
        Option option0 = new Option("", "", false, "");
        option0.getValuesList();
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test0819() throws Throwable {
        Option option0 = new Option("W", "W");
        String string0 = option0.getLongOpt();
    }

    @Test(timeout = 4000)
    public void test0820() throws Throwable {
        Option option0 = new Option("W", "W");
        String string0 = option0.getLongOpt();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test0821() throws Throwable {
        Option option0 = new Option("W", "W");
        String string0 = option0.getLongOpt();
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test0922() throws Throwable {
        Option option0 = new Option("m", "m", false, "m");
        option0.getId();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test0923() throws Throwable {
        Option option0 = new Option("m", "m", false, "m");
        option0.getId();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test1024() throws Throwable {
        Option option0 = new Option("4", "4");
        option0.addValue("4");
    }

    @Test(timeout = 4000)
    public void test1125() throws Throwable {
        Option option0 = new Option("", "");
        option0.getType();
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test1126() throws Throwable {
        Option option0 = new Option("", "");
        option0.getType();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test1127() throws Throwable {
        Option option0 = new Option("", "");
        option0.getType();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test1228() throws Throwable {
        Option option0 = new Option("", "");
        option0.setDescription("");
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test1229() throws Throwable {
        Option option0 = new Option("", "");
        option0.setDescription("");
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test1230() throws Throwable {
        Option option0 = new Option("", "");
        option0.setDescription("");
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test1331() throws Throwable {
        Option option0 = new Option("", "");
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test1332() throws Throwable {
        Option option0 = new Option("", "");
        option0.setArgName("");
        boolean boolean0 = option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test1433() throws Throwable {
        Option option0 = new Option("m", "m", false, "m");
        option0.getOpt();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test1434() throws Throwable {
        Option option0 = new Option("m", "m", false, "m");
        option0.getOpt();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test1535() throws Throwable {
        Option option0 = new Option("", "", true, "");
        int int0 = option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test1536() throws Throwable {
        Option option0 = new Option("", "", true, "");
        int int0 = option0.getArgs();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test1637() throws Throwable {
        Option option0 = new Option("", "");
        option0.clearValues();
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test1638() throws Throwable {
        Option option0 = new Option("", "");
        option0.clearValues();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test1639() throws Throwable {
        Option option0 = new Option("", "");
        option0.clearValues();
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test1740() throws Throwable {
        Option option0 = new Option((String) null, true, (String) null);
        option0.getKey();
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test1841() throws Throwable {
        Option option0 = new Option("", "");
        boolean boolean0 = option0.hasLongOpt();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test1842() throws Throwable {
        Option option0 = new Option("", "");
        boolean boolean0 = option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test1843() throws Throwable {
        Option option0 = new Option("", "");
        boolean boolean0 = option0.hasLongOpt();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test1944() throws Throwable {
        Option option0 = new Option("", "");
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test1945() throws Throwable {
        Option option0 = new Option("", "");
        option0.setLongOpt("");
        boolean boolean0 = option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test2046() throws Throwable {
        Option option0 = new Option("", "", true, "");
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test2047() throws Throwable {
        Option option0 = new Option("", "", true, "");
        option0.setArgName((String) null);
        boolean boolean0 = option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test2148() throws Throwable {
        Option option0 = new Option("", "");
        boolean boolean0 = option0.hasArgName();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test2149() throws Throwable {
        Option option0 = new Option("", "");
        boolean boolean0 = option0.hasArgName();
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test2150() throws Throwable {
        Option option0 = new Option("", "");
        boolean boolean0 = option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test2251() throws Throwable {
        Option option0 = new Option("", "");
        option0.setArgs(424);
        option0.toString();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test2352() throws Throwable {
        Option option0 = new Option("", "");
        option0.hasArg();
    }

    @Test(timeout = 4000)
    public void test2353() throws Throwable {
        Option option0 = new Option("", "");
        option0.setArgs((-2));
        option0.toString();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test2454() throws Throwable {
        Option option0 = new Option("I", "I");
        option0.hasArgs();
    }

    @Test(timeout = 4000)
    public void test2455() throws Throwable {
        Option option0 = new Option("I", "I");
        option0.setArgs((-2));
        option0.addValueForProcessing("I");
        option0.getValues();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test2556() throws Throwable {
        Option option0 = new Option("", "");
        option0.addValueForProcessing("");
    }

    @Test(timeout = 4000)
    public void test2657() throws Throwable {
        Option option0 = new Option((String) null, true, "<5f-.U>^");
        option0.setValueSeparator('s');
        option0.setArgs((-2));
        option0.addValueForProcessing("org.apache.commons.cli.Optinalidator");
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test2758() throws Throwable {
        Option option0 = new Option("", "");
        option0.setArgs((-1519));
        option0.addValueForProcessing("");
    }

    @Test(timeout = 4000)
    public void test2859() throws Throwable {
        Option option0 = new Option("", "", true, "");
        option0.addValueForProcessing("");
        option0.getValue("");
        option0.hasValueSeparator();
    }

    @Test(timeout = 4000)
    public void test2860() throws Throwable {
        Option option0 = new Option("", "", true, "");
        option0.addValueForProcessing("");
        option0.getValue("");
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test2961() throws Throwable {
        Option option0 = new Option("", "");
        String string0 = option0.getValue("");
    }

    @Test(timeout = 4000)
    public void test2962() throws Throwable {
        Option option0 = new Option("", "");
        String string0 = option0.getValue("");
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test2963() throws Throwable {
        Option option0 = new Option("", "");
        String string0 = option0.getValue("");
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test2964() throws Throwable {
        Option option0 = new Option("", "");
        String string0 = option0.getValue("");
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test3065() throws Throwable {
        Option option0 = new Option("", "", true, "");
        option0.addValueForProcessing("");
        option0.getValue((-2));
    }

    @Test(timeout = 4000)
    public void test3166() throws Throwable {
        Option option0 = new Option("", "", true, "");
        option0.getValue((-1));
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test3267() throws Throwable {
        Option option0 = new Option("", "");
        String[] stringArray0 = option0.getValues();
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test3268() throws Throwable {
        Option option0 = new Option("", "");
        String[] stringArray0 = option0.getValues();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test3269() throws Throwable {
        Option option0 = new Option("", "");
        String[] stringArray0 = option0.getValues();
    }

    @Test(timeout = 4000)
    public void test3270() throws Throwable {
        Option option0 = new Option("", "");
        String[] stringArray0 = option0.getValues();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test3371() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        String string0 = option0.toString();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test3372() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        String string0 = option0.toString();
    }

    @Test(timeout = 4000)
    public void test3373() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        String string0 = option0.toString();
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test3474() throws Throwable {
        Option option0 = new Option("W", "W", true, "W");
        String string0 = option0.toString();
    }

    @Test(timeout = 4000)
    public void test3475() throws Throwable {
        Option option0 = new Option("W", "W", true, "W");
        String string0 = option0.toString();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test3576() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        boolean boolean0 = option0.equals(option0);
    }

    @Test(timeout = 4000)
    public void test3577() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        boolean boolean0 = option0.equals(option0);
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test3578() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        boolean boolean0 = option0.equals(option0);
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test3579() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        boolean boolean0 = option0.equals(option0);
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test3680() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        boolean boolean0 = option0.equals((Object) null);
    }

    @Test(timeout = 4000)
    public void test3681() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        boolean boolean0 = option0.equals((Object) null);
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test3682() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        boolean boolean0 = option0.equals((Object) null);
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test3683() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        boolean boolean0 = option0.equals((Object) null);
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test3784() throws Throwable {
        Option option0 = new Option("", false, "");
        boolean boolean0 = option0.equals("");
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test3785() throws Throwable {
        Option option0 = new Option("", false, "");
        boolean boolean0 = option0.equals("");
    }

    @Test(timeout = 4000)
    public void test3786() throws Throwable {
        Option option0 = new Option("", false, "");
        boolean boolean0 = option0.equals("");
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test3787() throws Throwable {
        Option option0 = new Option("", false, "");
        boolean boolean0 = option0.equals("");
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test3888() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option((String) null, (String) null, true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
    }

    @Test(timeout = 4000)
    public void test3889() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option((String) null, (String) null, true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test3890() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option((String) null, (String) null, true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test3891() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option((String) null, (String) null, true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
        option1.getArgName();
    }

    @Test(timeout = 4000)
    public void test3992() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option("", "Zmm_", true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
    }

    @Test(timeout = 4000)
    public void test3993() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option("", "Zmm_", true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
        option1.getDescription();
    }

    @Test(timeout = 4000)
    public void test3994() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option("", "Zmm_", true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test3995() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option("", "Zmm_", true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test3996() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option("", "Zmm_", true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
        option1.getArgName();
    }

    @Test(timeout = 4000)
    public void test3997() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option("", "Zmm_", true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
        option1.getOpt();
    }

    @Test(timeout = 4000)
    public void test4098() throws Throwable {
        Option option0 = new Option((String) null, true, (String) null);
        Option option1 = new Option((String) null, true, (String) null);
        boolean boolean0 = option1.equals(option0);
    }

    @Test(timeout = 4000)
    public void test4099() throws Throwable {
        Option option0 = new Option((String) null, true, (String) null);
        Option option1 = new Option((String) null, true, (String) null);
        boolean boolean0 = option1.equals(option0);
        option1.getArgName();
    }

    @Test(timeout = 4000)
    public void test41100() throws Throwable {
        Option option0 = new Option("Zm", "Zm");
        Option option1 = new Option("Zm", "Zm", true, "Zm");
        boolean boolean0 = option1.equals(option0);
    }

    @Test(timeout = 4000)
    public void test41101() throws Throwable {
        Option option0 = new Option("Zm", "Zm");
        Option option1 = new Option("Zm", "Zm", true, "Zm");
        boolean boolean0 = option1.equals(option0);
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test41102() throws Throwable {
        Option option0 = new Option("Zm", "Zm");
        Option option1 = new Option("Zm", "Zm", true, "Zm");
        boolean boolean0 = option1.equals(option0);
        option1.hasArgName();
    }

    @Test(timeout = 4000)
    public void test42103() throws Throwable {
        Option option0 = new Option("_", "_", false, "_");
        Option option1 = (Option) option0.clone();
        boolean boolean0 = option0.equals(option1);
        option1.getArgs();
    }

    @Test(timeout = 4000)
    public void test42104() throws Throwable {
        Option option0 = new Option("_", "_", false, "_");
        Option option1 = (Option) option0.clone();
        boolean boolean0 = option0.equals(option1);
    }

    @Test(timeout = 4000)
    public void test42105() throws Throwable {
        Option option0 = new Option("_", "_", false, "_");
        Option option1 = (Option) option0.clone();
        boolean boolean0 = option0.equals(option1);
    }

    @Test(timeout = 4000)
    public void test42106() throws Throwable {
        Option option0 = new Option("_", "_", false, "_");
        Option option1 = (Option) option0.clone();
        boolean boolean0 = option0.equals(option1);
        option1.hasArgName();
    }

    @Test(timeout = 4000)
    public void test43107() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        Option option1 = (Option) option0.clone();
        option1.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test43108() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        Option option1 = (Option) option0.clone();
        option1.setLongOpt("Bd");
        boolean boolean0 = option0.equals(option1);
    }

    @Test(timeout = 4000)
    public void test44109() throws Throwable {
        Option option0 = new Option((String) null, "", false, "");
        option0.hashCode();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test44110() throws Throwable {
        Option option0 = new Option((String) null, "", false, "");
        option0.hashCode();
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test44111() throws Throwable {
        Option option0 = new Option((String) null, "", false, "");
        option0.hashCode();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test45112() throws Throwable {
        Option option0 = new Option("", "");
        option0.hashCode();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test45113() throws Throwable {
        Option option0 = new Option("", "");
        option0.hashCode();
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test45114() throws Throwable {
        Option option0 = new Option("", "");
        option0.hashCode();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test46115() throws Throwable {
        Option option0 = new Option((String) null, true, (String) null);
        option0.hasValueSeparator();
    }

    @Test(timeout = 4000)
    public void test46116() throws Throwable {
        Option option0 = new Option((String) null, true, (String) null);
        option0.addValueForProcessing((String) null);
        boolean boolean0 = option0.acceptsArg();
    }

    @Test(timeout = 4000)
    public void test46117() throws Throwable {
        Option option0 = new Option((String) null, true, (String) null);
        option0.addValueForProcessing((String) null);
        boolean boolean0 = option0.acceptsArg();
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test47118() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        boolean boolean0 = option0.requiresArg();
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test47119() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        boolean boolean0 = option0.requiresArg();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test47120() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        boolean boolean0 = option0.requiresArg();
    }

    @Test(timeout = 4000)
    public void test48121() throws Throwable {
        Option option0 = new Option("", "");
        option0.setOptionalArg(true);
        boolean boolean0 = option0.requiresArg();
        option0.hasOptionalArg();
    }

    @Test(timeout = 4000)
    public void test48122() throws Throwable {
        Option option0 = new Option("", "");
        option0.setOptionalArg(true);
        boolean boolean0 = option0.requiresArg();
    }

    @Test(timeout = 4000)
    public void test49123() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        option0.hasArg();
    }

    @Test(timeout = 4000)
    public void test49124() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        option0.setArgs((-2));
        boolean boolean0 = option0.requiresArg();
    }

    @Test(timeout = 4000)
    public void test50125() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        option0.hasArgs();
    }

    @Test(timeout = 4000)
    public void test50126() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        option0.setArgs((-2));
        option0.addValueForProcessing("W");
        boolean boolean0 = option0.requiresArg();
    }
}
