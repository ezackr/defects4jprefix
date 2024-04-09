/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 23:08:40 GMT 2024
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Option_ESTest extends Option_ESTest_scaffolding {

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
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        Option option0 = new Option("", "");
        option0.setType("");
        String string0 = option0.toString();
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
        Option option0 = new Option("m", false, "m");
        String string0 = option0.getDescription();
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        Option option0 = new Option("m", false, "m");
        String string0 = option0.getDescription();
    }

    @Test(timeout = 4000)
    public void test026() throws Throwable {
        Option option0 = new Option("m", false, "m");
        String string0 = option0.getDescription();
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test027() throws Throwable {
        Option option0 = new Option("m", false, "m");
        String string0 = option0.getDescription();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        Option option0 = new Option("W", false, "W");
        String string0 = option0.getArgName();
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        Option option0 = new Option("W", false, "W");
        String string0 = option0.getArgName();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test0310() throws Throwable {
        Option option0 = new Option("W", false, "W");
        String string0 = option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test0411() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        option0.setOptionalArg(true);
        boolean boolean0 = option0.acceptsArg();
        option0.hasOptionalArg();
    }

    @Test(timeout = 4000)
    public void test0412() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        option0.setOptionalArg(true);
        boolean boolean0 = option0.acceptsArg();
    }

    @Test(timeout = 4000)
    public void test0513() throws Throwable {
        Option option0 = new Option("", "");
        option0.setRequired(false);
        option0.isRequired();
    }

    @Test(timeout = 4000)
    public void test0514() throws Throwable {
        Option option0 = new Option("", "");
        option0.setRequired(false);
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test0515() throws Throwable {
        Option option0 = new Option("", "");
        option0.setRequired(false);
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test0516() throws Throwable {
        Option option0 = new Option("", "");
        option0.setRequired(false);
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test0617() throws Throwable {
        Option option0 = new Option((String) null, (String) null);
        option0.isRequired();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test0618() throws Throwable {
        Option option0 = new Option((String) null, (String) null);
        option0.isRequired();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test0719() throws Throwable {
        Option option0 = new Option("", "", false, "");
        option0.getValuesList();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test0720() throws Throwable {
        Option option0 = new Option("", "", false, "");
        option0.getValuesList();
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test0821() throws Throwable {
        Option option0 = new Option("W", "W");
        String string0 = option0.getLongOpt();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test0822() throws Throwable {
        Option option0 = new Option("W", "W");
        String string0 = option0.getLongOpt();
    }

    @Test(timeout = 4000)
    public void test0823() throws Throwable {
        Option option0 = new Option("W", "W");
        String string0 = option0.getLongOpt();
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test0924() throws Throwable {
        Option option0 = new Option("", "");
        option0.getId();
    }

    @Test(timeout = 4000)
    public void test1025() throws Throwable {
        Option option0 = new Option("4", "4");
        option0.addValue("4");
    }

    @Test(timeout = 4000)
    public void test1126() throws Throwable {
        Option option0 = new Option("", "");
        option0.getType();
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test1127() throws Throwable {
        Option option0 = new Option("", "");
        option0.getType();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test1128() throws Throwable {
        Option option0 = new Option("", "");
        option0.getType();
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
    public void test1231() throws Throwable {
        Option option0 = new Option("", "");
        option0.setDescription("");
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test1332() throws Throwable {
        Option option0 = new Option("", "");
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test1333() throws Throwable {
        Option option0 = new Option("", "");
        option0.setArgName("");
        boolean boolean0 = option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test1434() throws Throwable {
        Option option0 = new Option("m", "m", false, "m");
        option0.getOpt();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test1435() throws Throwable {
        Option option0 = new Option("m", "m", false, "m");
        option0.getOpt();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test1536() throws Throwable {
        Option option0 = new Option("", "", true, "");
        int int0 = option0.getArgs();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test1537() throws Throwable {
        Option option0 = new Option("", "", true, "");
        int int0 = option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test1638() throws Throwable {
        Option option0 = new Option("", "");
        option0.clearValues();
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test1639() throws Throwable {
        Option option0 = new Option("", "");
        option0.clearValues();
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test1640() throws Throwable {
        Option option0 = new Option("", "");
        option0.clearValues();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test1741() throws Throwable {
        Option option0 = new Option((String) null, true, (String) null);
        option0.getKey();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test1842() throws Throwable {
        Option option0 = new Option("", "");
        boolean boolean0 = option0.hasLongOpt();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test1843() throws Throwable {
        Option option0 = new Option("", "");
        boolean boolean0 = option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test1844() throws Throwable {
        Option option0 = new Option("", "");
        boolean boolean0 = option0.hasLongOpt();
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test1945() throws Throwable {
        Option option0 = new Option("", "");
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test1946() throws Throwable {
        Option option0 = new Option("", "");
        option0.setLongOpt("");
        boolean boolean0 = option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test2047() throws Throwable {
        Option option0 = new Option("", "", true, "");
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test2048() throws Throwable {
        Option option0 = new Option("", "", true, "");
        option0.setArgName((String) null);
        boolean boolean0 = option0.hasArgName();
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
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test2151() throws Throwable {
        Option option0 = new Option("", "");
        boolean boolean0 = option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test2252() throws Throwable {
        Option option0 = new Option("", "");
        option0.setArgs(424);
        option0.toString();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test2353() throws Throwable {
        Option option0 = new Option("", "");
        option0.hasArg();
    }

    @Test(timeout = 4000)
    public void test2354() throws Throwable {
        Option option0 = new Option("", "");
        option0.setArgs((-2));
        option0.toString();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test2455() throws Throwable {
        Option option0 = new Option("I", "I");
        option0.hasArgs();
    }

    @Test(timeout = 4000)
    public void test2456() throws Throwable {
        Option option0 = new Option("I", "I");
        option0.setArgs((-2));
        option0.addValueForProcessing("I");
        option0.getValues();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test2557() throws Throwable {
        Option option0 = new Option("", "");
        option0.addValueForProcessing("");
    }

    @Test(timeout = 4000)
    public void test2658() throws Throwable {
        Option option0 = new Option((String) null, true, "<5f-.U>^");
        option0.setValueSeparator('s');
        option0.setArgs((-2));
        option0.addValueForProcessing("org.apache.commons.cli.Optinalidator");
        option0.getValueSeparator();
    }

    @Test(timeout = 4000)
    public void test2759() throws Throwable {
        Option option0 = new Option("", "");
        option0.setArgs((-2098));
        option0.addValueForProcessing("");
    }

    @Test(timeout = 4000)
    public void test2860() throws Throwable {
        Option option0 = new Option("", "", true, "");
        option0.addValueForProcessing("");
        option0.getValue("");
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test2861() throws Throwable {
        Option option0 = new Option("", "", true, "");
        option0.addValueForProcessing("");
        option0.getValue("");
        option0.hasValueSeparator();
    }

    @Test(timeout = 4000)
    public void test2962() throws Throwable {
        Option option0 = new Option("", "");
        String string0 = option0.getValue("");
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test2963() throws Throwable {
        Option option0 = new Option("", "");
        String string0 = option0.getValue("");
    }

    @Test(timeout = 4000)
    public void test2964() throws Throwable {
        Option option0 = new Option("", "");
        String string0 = option0.getValue("");
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test2965() throws Throwable {
        Option option0 = new Option("", "");
        String string0 = option0.getValue("");
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test3066() throws Throwable {
        Option option0 = new Option("", "", true, "");
        option0.addValueForProcessing("");
        option0.getValue((-1));
    }

    @Test(timeout = 4000)
    public void test3167() throws Throwable {
        Option option0 = new Option("", "", true, "");
        option0.getValue((-1));
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test3268() throws Throwable {
        Option option0 = new Option("", "");
        String[] stringArray0 = option0.getValues();
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test3269() throws Throwable {
        Option option0 = new Option("", "");
        String[] stringArray0 = option0.getValues();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test3270() throws Throwable {
        Option option0 = new Option("", "");
        String[] stringArray0 = option0.getValues();
    }

    @Test(timeout = 4000)
    public void test3271() throws Throwable {
        Option option0 = new Option("", "");
        String[] stringArray0 = option0.getValues();
        option0.hasArgName();
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
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test3374() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        String string0 = option0.toString();
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test3475() throws Throwable {
        Option option0 = new Option("W", "W", true, "W");
        String string0 = option0.toString();
    }

    @Test(timeout = 4000)
    public void test3476() throws Throwable {
        Option option0 = new Option("W", "W", true, "W");
        String string0 = option0.toString();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test3577() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        boolean boolean0 = option0.equals(option0);
    }

    @Test(timeout = 4000)
    public void test3578() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        boolean boolean0 = option0.equals(option0);
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test3579() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        boolean boolean0 = option0.equals(option0);
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test3580() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        boolean boolean0 = option0.equals(option0);
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test3681() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        boolean boolean0 = option0.equals((Object) null);
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
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test3684() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        boolean boolean0 = option0.equals((Object) null);
        option0.getArgName();
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
    public void test3788() throws Throwable {
        Option option0 = new Option("", false, "");
        boolean boolean0 = option0.equals("");
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test3889() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option((String) null, (String) null, true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
    }

    @Test(timeout = 4000)
    public void test3890() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option((String) null, (String) null, true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test3891() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option((String) null, (String) null, true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test3892() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option((String) null, (String) null, true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
        option1.getArgName();
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
        option1.getOpt();
    }

    @Test(timeout = 4000)
    public void test3995() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option("", "Zmm_", true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
    }

    @Test(timeout = 4000)
    public void test3996() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option("", "Zmm_", true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test3997() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option("", "Zmm_", true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test3998() throws Throwable {
        Option option0 = new Option("Zmm_", "Zmm_");
        Option option1 = new Option("", "Zmm_", true, "Zmm_");
        boolean boolean0 = option1.equals(option0);
        option1.hasArgName();
    }

    @Test(timeout = 4000)
    public void test4099() throws Throwable {
        Option option0 = new Option((String) null, true, (String) null);
        Option option1 = new Option((String) null, true, (String) null);
        boolean boolean0 = option1.equals(option0);
    }

    @Test(timeout = 4000)
    public void test40100() throws Throwable {
        Option option0 = new Option((String) null, true, (String) null);
        Option option1 = new Option((String) null, true, (String) null);
        boolean boolean0 = option1.equals(option0);
        option1.getArgName();
    }

    @Test(timeout = 4000)
    public void test41101() throws Throwable {
        Option option0 = new Option("Zm", "Zm");
        Option option1 = new Option("Zm", "Zm", true, "Zm");
        boolean boolean0 = option1.equals(option0);
    }

    @Test(timeout = 4000)
    public void test41102() throws Throwable {
        Option option0 = new Option("Zm", "Zm");
        Option option1 = new Option("Zm", "Zm", true, "Zm");
        boolean boolean0 = option1.equals(option0);
        option1.hasArgName();
    }

    @Test(timeout = 4000)
    public void test41103() throws Throwable {
        Option option0 = new Option("Zm", "Zm");
        Option option1 = new Option("Zm", "Zm", true, "Zm");
        boolean boolean0 = option1.equals(option0);
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test42104() throws Throwable {
        Option option0 = new Option("_", "_", false, "_");
        Option option1 = (Option) option0.clone();
        boolean boolean0 = option0.equals(option1);
        option1.getArgs();
    }

    @Test(timeout = 4000)
    public void test42105() throws Throwable {
        Option option0 = new Option("_", "_", false, "_");
        Option option1 = (Option) option0.clone();
        boolean boolean0 = option0.equals(option1);
    }

    @Test(timeout = 4000)
    public void test42107() throws Throwable {
        Option option0 = new Option("_", "_", false, "_");
        Option option1 = (Option) option0.clone();
        boolean boolean0 = option0.equals(option1);
        option1.hasArgName();
    }

    @Test(timeout = 4000)
    public void test43108() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        Option option1 = (Option) option0.clone();
        option1.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test43109() throws Throwable {
        Option option0 = new Option("Bd", "Bd");
        Option option1 = (Option) option0.clone();
        option1.setLongOpt("Bd");
        boolean boolean0 = option0.equals(option1);
    }

    @Test(timeout = 4000)
    public void test44110() throws Throwable {
        Option option0 = new Option((String) null, "", false, "");
        option0.hashCode();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test44111() throws Throwable {
        Option option0 = new Option((String) null, "", false, "");
        option0.hashCode();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test44112() throws Throwable {
        Option option0 = new Option((String) null, "", false, "");
        option0.hashCode();
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test45113() throws Throwable {
        Option option0 = new Option("", "");
        option0.hashCode();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test45114() throws Throwable {
        Option option0 = new Option("", "");
        option0.hashCode();
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test45115() throws Throwable {
        Option option0 = new Option("", "");
        option0.hashCode();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test46116() throws Throwable {
        Option option0 = new Option((String) null, true, (String) null);
        option0.hasValueSeparator();
    }

    @Test(timeout = 4000)
    public void test46117() throws Throwable {
        Option option0 = new Option((String) null, true, (String) null);
        option0.addValueForProcessing((String) null);
        boolean boolean0 = option0.acceptsArg();
    }

    @Test(timeout = 4000)
    public void test46118() throws Throwable {
        Option option0 = new Option((String) null, true, (String) null);
        option0.addValueForProcessing((String) null);
        boolean boolean0 = option0.acceptsArg();
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test47119() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        boolean boolean0 = option0.requiresArg();
        option0.hasArgName();
    }

    @Test(timeout = 4000)
    public void test47120() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        boolean boolean0 = option0.requiresArg();
    }

    @Test(timeout = 4000)
    public void test47121() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        boolean boolean0 = option0.requiresArg();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test48122() throws Throwable {
        Option option0 = new Option("", "");
        option0.setOptionalArg(true);
        boolean boolean0 = option0.requiresArg();
        option0.hasOptionalArg();
    }

    @Test(timeout = 4000)
    public void test48123() throws Throwable {
        Option option0 = new Option("", "");
        option0.setOptionalArg(true);
        boolean boolean0 = option0.requiresArg();
    }

    @Test(timeout = 4000)
    public void test49124() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        option0.hasArgs();
    }

    @Test(timeout = 4000)
    public void test49125() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        option0.setArgs((-2));
        boolean boolean0 = option0.requiresArg();
    }

    @Test(timeout = 4000)
    public void test50127() throws Throwable {
        Option option0 = new Option("W", "W", false, "W");
        option0.setArgs((-2));
        option0.addValueForProcessing("W");
        boolean boolean0 = option0.requiresArg();
    }
}
