/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 22:16:18 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.collect.ImmutableSortedSet;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.GlobalNamespace;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.Node;
import java.util.List;
import java.util.Map;
import org.junit.runner.RunWith;

public class GlobalNamespaceTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("Ordering.natural().reverse()", "Ordering.natural().reverse()");
        GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
        Map<String, GlobalNamespace.Name> map0 = globalNamespace0.getNameIndex();
        map0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.mozilla.rhino.xml.XMLObject", "com.google.javascript.jscomp.mozilla.rhino.xml.XMLObject");
        GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
        ImmutableSortedSet<Node> immutableSortedSet0 = ImmutableSortedSet.of();
        TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
        Scope scope0 = typedScopeCreator0.createInitialScope(node0);
        globalNamespace0.scanNewNodes(scope0, immutableSortedSet0);
        scope0.isGlobal();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = null;
        globalNamespace_Ref0 = new GlobalNamespace.Ref((NodeTraversal) null, (Node) null, globalNamespace_Ref_Type0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.PROTOTYPE_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        GlobalNamespace.Ref globalNamespace_Ref1 = globalNamespace_Ref0.getTwin();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.mozilla.rhino.xml.XMLObject", "com.google.javascript.jscomp.mozilla.rhino.xml.XMLObject");
        GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
        globalNamespace0.getNameForest();
        List<GlobalNamespace.Name> list0 = globalNamespace0.getNameForest();
        list0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("$VAUES", "$VAUES");
        GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
        globalNamespace0.getNameForest();
        Map<String, GlobalNamespace.Name> map0 = globalNamespace0.getNameIndex();
        map0.size();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.mozilla.rhino.xml.XMLObject", "com.google.javascript.jscomp.mozilla.rhino.xml.XMLObject");
        GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0, node0);
        Map<String, GlobalNamespace.Name> map0 = globalNamespace0.getNameIndex();
        map0.size();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Node.newString("CALL_GET");
        GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
        Map<String, GlobalNamespace.Name> map0 = globalNamespace0.getNameIndex();
        map0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = new Node(38, (-354), 40);
        GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
        globalNamespace0.getNameForest();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Node node0 = new Node(33, 33, 33);
        Compiler compiler0 = new Compiler();
        GlobalNamespace globalNamespace0 = new GlobalNamespace(compiler0, node0);
        globalNamespace0.getNameIndex();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
        GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("}9:x5", false);
        GlobalNamespace.Name globalNamespace_Name2 = globalNamespace_Name0.addProperty("}9:x5", false);
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
        GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("}9:x5", false);
        GlobalNamespace.Name globalNamespace_Name2 = globalNamespace_Name0.addProperty("}9:x5", false);
    }

    @Test(timeout = 4000)
    public void test2212() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("", (GlobalNamespace.Name) null, false);
        boolean boolean0 = globalNamespace_Name0.canEliminate();
    }

    @Test(timeout = 4000)
    public void test2313() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:5", (GlobalNamespace.Name) null, true);
        boolean boolean0 = globalNamespace_Name0.canCollapse();
    }

    @Test(timeout = 4000)
    public void test2414() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
        boolean boolean0 = globalNamespace_Name0.canCollapse();
    }

    @Test(timeout = 4000)
    public void test2515() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
        globalNamespace_Name0.setIsClassOrEnum();
        boolean boolean0 = globalNamespace_Name0.canCollapse();
    }

    @Test(timeout = 4000)
    public void test2616() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
        GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("}9:x5", false);
    }

    @Test(timeout = 4000)
    public void test2617() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
        GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("}9:x5", false);
        boolean boolean0 = globalNamespace_Name1.canCollapse();
    }

    @Test(timeout = 4000)
    public void test2618() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
        GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("}9:x5", false);
        boolean boolean0 = globalNamespace_Name1.canCollapse();
    }

    @Test(timeout = 4000)
    public void test2719() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        globalNamespace_Name0.addRef(globalNamespace_Ref0);
        boolean boolean0 = globalNamespace_Name0.canCollapse();
    }

    @Test(timeout = 4000)
    public void test2820() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("\"GWz8", (GlobalNamespace.Name) null, false);
        globalNamespace_Name0.localSets = 415;
        boolean boolean0 = globalNamespace_Name0.canCollapse();
    }

    @Test(timeout = 4000)
    public void test2921() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("SlUfZ9", (GlobalNamespace.Name) null, false);
        boolean boolean0 = globalNamespace_Name0.shouldKeepKeys();
    }

    @Test(timeout = 4000)
    public void test3022() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("H}hcvx>rY\"d{chtWT*!", (GlobalNamespace.Name) null, false);
        globalNamespace_Name0.globalSets = 115;
        boolean boolean0 = globalNamespace_Name0.needsToBeStubbed();
    }

    @Test(timeout = 4000)
    public void test3123() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("JSC_INEXISTENT_PROPERTY", (GlobalNamespace.Name) null, true);
        boolean boolean0 = globalNamespace_Name0.needsToBeStubbed();
    }

    @Test(timeout = 4000)
    public void test3224() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("JSC_INEXISTENT_PROPERTY", (GlobalNamespace.Name) null, true);
        globalNamespace_Name0.localSets = 98;
        boolean boolean0 = globalNamespace_Name0.needsToBeStubbed();
    }

    @Test(timeout = 4000)
    public void test3325() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
        GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("}9:x5", false);
        globalNamespace_Name1.setIsClassOrEnum();
        boolean boolean0 = globalNamespace_Name0.isNamespace();
    }

    @Test(timeout = 4000)
    public void test3326() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
        GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("}9:x5", false);
        globalNamespace_Name1.setIsClassOrEnum();
        boolean boolean0 = globalNamespace_Name0.isNamespace();
    }

    @Test(timeout = 4000)
    public void test3427() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
        boolean boolean0 = globalNamespace_Name0.isNamespace();
    }

    @Test(timeout = 4000)
    public void test3528() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("> 2$q @(zkv()&", (GlobalNamespace.Name) null, false);
        GlobalNamespace.Name globalNamespace_Name1 = new GlobalNamespace.Name(".p[ototy!e", globalNamespace_Name0, true);
        boolean boolean0 = globalNamespace_Name1.isSimpleName();
    }

    @Test(timeout = 4000)
    public void test3629() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("> 2$q @(zkv()&", (GlobalNamespace.Name) null, false);
        boolean boolean0 = globalNamespace_Name0.isSimpleName();
    }

    @Test(timeout = 4000)
    public void test3730() throws Throwable {
        GlobalNamespace.Name globalNamespace_Name0 = new GlobalNamespace.Name("}9:x5", (GlobalNamespace.Name) null, false);
        GlobalNamespace.Name globalNamespace_Name1 = globalNamespace_Name0.addProperty("}9:x5", false);
        String string0 = globalNamespace_Name1.toString();
    }

    @Test(timeout = 4000)
    public void test3831() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        boolean boolean0 = globalNamespace_Ref0.isSet();
    }

    @Test(timeout = 4000)
    public void test3932() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        boolean boolean0 = globalNamespace_Ref0.isSet();
    }

    @Test(timeout = 4000)
    public void test4033() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        boolean boolean0 = globalNamespace_Ref0.isSet();
    }

    @Test(timeout = 4000)
    public void test4134() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        GlobalNamespace.Ref.markTwins(globalNamespace_Ref0, globalNamespace_Ref0);
    }

    @Test(timeout = 4000)
    public void test4235() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type1 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
        GlobalNamespace.Ref globalNamespace_Ref1 = globalNamespace_Ref0.cloneAndReclassify(globalNamespace_Ref_Type1);
        GlobalNamespace.Ref.markTwins(globalNamespace_Ref1, globalNamespace_Ref0);
        globalNamespace_Ref0.equals((Object) globalNamespace_Ref1);
    }

    @Test(timeout = 4000)
    public void test4336() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        GlobalNamespace.Ref.markTwins(globalNamespace_Ref0, globalNamespace_Ref0);
    }

    @Test(timeout = 4000)
    public void test4437() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type1 = GlobalNamespace.Ref.Type.ALIASING_GET;
        GlobalNamespace.Ref globalNamespace_Ref1 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type1);
        GlobalNamespace.Ref.markTwins(globalNamespace_Ref0, globalNamespace_Ref1);
        globalNamespace_Ref1.equals((Object) globalNamespace_Ref0);
    }

    @Test(timeout = 4000)
    public void test4538() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type1 = GlobalNamespace.Ref.Type.SET_FROM_GLOBAL;
        GlobalNamespace.Ref globalNamespace_Ref1 = globalNamespace_Ref0.cloneAndReclassify(globalNamespace_Ref_Type1);
        GlobalNamespace.Ref.markTwins(globalNamespace_Ref0, globalNamespace_Ref1);
        globalNamespace_Ref0.equals((Object) globalNamespace_Ref1);
    }

    @Test(timeout = 4000)
    public void test4639() throws Throwable {
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type0 = GlobalNamespace.Ref.Type.ALIASING_GET;
        GlobalNamespace.Ref globalNamespace_Ref0 = GlobalNamespace.Ref.createRefForTesting(globalNamespace_Ref_Type0);
        GlobalNamespace.Ref.Type globalNamespace_Ref_Type1 = GlobalNamespace.Ref.Type.SET_FROM_LOCAL;
        GlobalNamespace.Ref globalNamespace_Ref1 = globalNamespace_Ref0.cloneAndReclassify(globalNamespace_Ref_Type1);
        GlobalNamespace.Ref.markTwins(globalNamespace_Ref0, globalNamespace_Ref1);
        globalNamespace_Ref1.equals((Object) globalNamespace_Ref0);
    }
}
