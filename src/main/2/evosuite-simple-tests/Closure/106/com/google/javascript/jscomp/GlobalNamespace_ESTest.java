/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 06:27:22 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.GlobalNamespace;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.Node;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class GlobalNamespace_ESTest extends GlobalNamespace_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("");
        GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
        Map<String, GlobalNamespace.Name> map0 = globalNamespace0.getNameIndex();
        assertTrue(map0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("msO.anon.lenerator.rFturns");
        GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0, node0);
        globalNamespace0.getNameIndex();
        Map<String, GlobalNamespace.Name> map0 = globalNamespace0.getNameIndex();
        assertTrue(map0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("msO.anon.lenerator.rFturns");
        GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0, node0);
        Scope scope0 = new Scope(node0, compiler0);
        HashSet<Node> hashSet0 = new HashSet<Node>(7);
        globalNamespace0.scanNewNodes(scope0, hashSet0);
        assertTrue(hashSet0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("L", (GlobalNamespace.Name) null, true);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        globalNamespace_Name0.addRef(globalNamespace_Ref0);
        globalNamespace_Name0.addRef(globalNamespace_Ref0);
        globalNamespace_Name0.removeRef(globalNamespace_Ref0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.PROTOTYPE_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = null;
        try {
            globalNamespace_Ref0 = new GlobalNamespace.Ref((NodeTraversal) null, (Node) null, globalNamespace_Ref_Type0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.GlobalNamespace$Ref", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.DIRECT_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        GlobalNamespace.Ref globalNamespace_Ref1 = globalNamespace_Ref0.getTwin();
        assertNull(globalNamespace_Ref1);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("OTHER");
        GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0, node0);
        globalNamespace0.getNameForest();
        List<GlobalNamespace.Name> list0 = globalNamespace0.getNameForest();
        assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Node node0 = Node.newString("mSM|");
        Node node1 = new Node(64, node0);
        Compiler compiler0 = new Compiler();
        GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node1, node1);
        Map<String, GlobalNamespace.Name> map0 = globalNamespace0.getNameIndex();
        assertTrue(map0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Node node0 = Node.newString("mSM|");
        Node node1 = new Node(38, node0);
        Compiler compiler0 = new Compiler();
        GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node1, node1);
        // Undeclared exception!
        try {
            globalNamespace0.getNameForest();
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Node node0 = Node.newString("right");
        Node node1 = new Node(33, node0);
        Compiler compiler0 = new Compiler();
        GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node1, node0);
        List<GlobalNamespace.Name> list0 = globalNamespace0.getNameForest();
        assertTrue(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Node node0 = Node.newString("mSM|");
        Node node1 = new Node(64, node0);
        Compiler compiler0 = new Compiler();
        GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node1, node1);
        Node node2 = new Node(29, node1);
        Map<String, GlobalNamespace.Name> map0 = globalNamespace0.getNameIndex();
        assertEquals(0, map0.size());
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name((String) null, (GlobalNamespace.Name) null, false);
        GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("C}RfaCoY},", false);
        GlobalNamespace.Name globalNamespace_Name2 = globalNamespace_Name0.addProperty((String) null, false);
        assertNotSame(globalNamespace_Name2, globalNamespace_Name1);
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name((String) null, (GlobalNamespace.Name) null, false);
        GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("C}RfaCoY},", false);
        GlobalNamespace.Name globalNamespace_Name2 = globalNamespace_Name0.addProperty((String) null, false);
        assertNotNull(globalNamespace_Name2);
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name((String) null, (GlobalNamespace.Name) null, false);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.DIRECT_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        globalNamespace_Name0.addRef(globalNamespace_Ref0);
        globalNamespace_Name0.removeRef(globalNamespace_Ref0);
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name((String) null, (GlobalNamespace.Name) null, true);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        globalNamespace_Name0.addRef(globalNamespace_Ref0);
        globalNamespace_Name0.removeRef(globalNamespace_Ref0);
        globalNamespace_Name0.removeRef(globalNamespace_Ref0);
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name((String) null, (GlobalNamespace.Name) null, true);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.PROTOTYPE_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        globalNamespace_Name0.addRef(globalNamespace_Ref0);
        globalNamespace_Name0.removeRef(globalNamespace_Ref0);
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name((String) null, (GlobalNamespace.Name) null, true);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        globalNamespace_Name0.addRef(globalNamespace_Ref0);
        globalNamespace_Name0.addRef(globalNamespace_Ref0);
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("L", (GlobalNamespace.Name) null, true);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        globalNamespace_Name0.addRef(globalNamespace_Ref0);
        globalNamespace_Name0.removeRef(globalNamespace_Ref0);
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name((String) null, (GlobalNamespace.Name) null, true);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        globalNamespace_Name0.removeRef(globalNamespace_Ref0);
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name((String) null, (GlobalNamespace.Name) null, true);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        globalNamespace_Name0.declaration = globalNamespace_Ref0;
        globalNamespace_Name0.addRef(globalNamespace_Ref0);
        globalNamespace_Name0.removeRef(globalNamespace_Ref0);
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("L", (GlobalNamespace.Name) null, true);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.CALL_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        globalNamespace_Name0.addRef(globalNamespace_Ref0);
        globalNamespace_Name0.removeRef(globalNamespace_Ref0);
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name((String) null, (GlobalNamespace.Name) null, false);
        boolean boolean0 = globalNamespace_Name0.canEliminate();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name((String) null, (GlobalNamespace.Name) null, true);
        boolean boolean0 = globalNamespace_Name0.canCollapse();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name((String) null, (GlobalNamespace.Name) null, false);
        boolean boolean0 = globalNamespace_Name0.canCollapse();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("550OT;dZ&YsP$MK%.@", (GlobalNamespace.Name) null, false);
        globalNamespace_Name0.setIsClassOrEnum();
        boolean boolean0 = globalNamespace_Name0.canCollapse();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("L*Ja1;0R||l5D}Ibo?", (GlobalNamespace.Name) null, false);
        GlobalNamespace.Name globalNamespace_Name1 = new GlobalNamespace.Name("L*Ja1;0R||l5D}Ibo?", globalNamespace_Name0, false);
        boolean boolean0 = globalNamespace_Name1.canCollapse();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name((String) null, (GlobalNamespace.Name) null, false);
        globalNamespace_Name0.globalSets = 125;
        boolean boolean0 = globalNamespace_Name0.canCollapse();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name((String) null, (GlobalNamespace.Name) null, false);
        globalNamespace_Name0.localSets = 72;
        boolean boolean0 = globalNamespace_Name0.canCollapse();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("@d", (GlobalNamespace.Name) null, false);
        globalNamespace_Name0.addRef(globalNamespace_Ref0);
        boolean boolean0 = globalNamespace_Name0.needsToBeStubbed();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("", (GlobalNamespace.Name) null, false);
        boolean boolean0 = globalNamespace_Name0.needsToBeStubbed();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("", (GlobalNamespace.Name) null, false);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        globalNamespace_Name0.addRef(globalNamespace_Ref0);
        boolean boolean0 = globalNamespace_Name0.needsToBeStubbed();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("com.google.javascript.jscomp.GlobalNamespace$Name", (GlobalNamespace.Name) null, false);
        boolean boolean0 = globalNamespace_Name0.isNamespace();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3132() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("L*Ja1;0R||l5D}Ibo?", (GlobalNamespace.Name) null, true);
        GlobalNamespace.Name globalNamespace_Name1 = new GlobalNamespace.Name("L*Ja1;0R||l5D}Ibo?", globalNamespace_Name0, true);
        globalNamespace_Name1.setIsClassOrEnum();
        boolean boolean0 = globalNamespace_Name0.isNamespace();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3233() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("\u001B[39m", (GlobalNamespace.Name) null, false);
        GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("XH:g:50>", false);
        assertNotNull(globalNamespace_Name1);
    }

    @Test(timeout = 4000)
    public void test3234() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("\u001B[39m", (GlobalNamespace.Name) null, false);
        GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("XH:g:50>", false);
        boolean boolean0 = globalNamespace_Name1.isSimpleName();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3335() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("D#jqVB%+t7c%]Z5", (GlobalNamespace.Name) null, false);
        boolean boolean0 = globalNamespace_Name0.isSimpleName();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3436() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("L*Ja1;0R||l5D}Ibo?", (GlobalNamespace.Name) null, false);
        GlobalNamespace.Name globalNamespace_Name1 = new GlobalNamespace.Name("L*Ja1;0R||l5D}Ibo?", globalNamespace_Name0, false);
        String string0 = globalNamespace_Name1.toString();
        assertEquals("L*Ja1;0R||l5D}Ibo?.L*Ja1;0R||l5D}Ibo? (OTHER): globalSets=0, localSets=0, totalGets=0, aliasingGets=0, callGets=0", string0);
    }

    @Test(timeout = 4000)
    public void test3537() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        Node node0 = new Node((-14), (-14), (-14));
        Node node1 = new Node(37, node0);
        globalNamespace_Ref0.node = node0;
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("J5Mp[5Uu?p", (GlobalNamespace.Name) null, false);
        globalNamespace_Name0.addRef(globalNamespace_Ref0);
    }

    @Test(timeout = 4000)
    public void test3638() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        boolean boolean0 = globalNamespace_Ref0.isSet();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3739() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.CALL_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        boolean boolean0 = globalNamespace_Ref0.isSet();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3840() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        boolean boolean0 = globalNamespace_Ref0.isSet();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3941() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        // Undeclared exception!
        try {
            GlobalNamespace.Ref.markTwins(globalNamespace_Ref0, globalNamespace_Ref0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test4042() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.PROTOTYPE_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        // Undeclared exception!
        try {
            GlobalNamespace.Ref.markTwins(globalNamespace_Ref0, globalNamespace_Ref0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test4143() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type1 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
        GlobalNamespace.Ref globalNamespace_Ref1 = globalNamespace_Ref0.cloneAndReclassify(globalNamespace_Ref_Type1);
        GlobalNamespace.Ref.markTwins(globalNamespace_Ref1, globalNamespace_Ref0);
        assertNotSame(globalNamespace_Ref0, globalNamespace_Ref1);
    }

    @Test(timeout = 4000)
    public void test4244() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type1 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
        GlobalNamespace.Ref globalNamespace_Ref1 = globalNamespace_Ref0.cloneAndReclassify(globalNamespace_Ref_Type1);
        GlobalNamespace.Ref.markTwins(globalNamespace_Ref1, globalNamespace_Ref0);
        assertNotSame(globalNamespace_Ref1, globalNamespace_Ref0);
    }

    @Test(timeout = 4000)
    public void test4345() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type1 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
        GlobalNamespace.Ref globalNamespace_Ref1 = globalNamespace_Ref0.cloneAndReclassify(globalNamespace_Ref_Type1);
        GlobalNamespace.Ref.markTwins(globalNamespace_Ref0, globalNamespace_Ref1);
        assertNotSame(globalNamespace_Ref0, globalNamespace_Ref1);
    }

    @Test(timeout = 4000)
    public void test4446() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type1 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
        GlobalNamespace.Ref globalNamespace_Ref1 = globalNamespace_Ref0.cloneAndReclassify(globalNamespace_Ref_Type1);
        GlobalNamespace.Ref.markTwins(globalNamespace_Ref0, globalNamespace_Ref1);
        assertNotSame(globalNamespace_Ref0, globalNamespace_Ref1);
    }
}
