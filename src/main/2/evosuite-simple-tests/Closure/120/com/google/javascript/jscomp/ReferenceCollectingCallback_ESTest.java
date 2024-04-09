/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 07:21:00 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CollapseProperties;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.ReferenceCollectingCallback;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.io.File;
import java.util.Spliterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ReferenceCollectingCallback_ESTest extends ReferenceCollectingCallback_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        SyntheticAst syntheticAst0 = new SyntheticAst("v-0w3L8%8{?g9M^");
        CompilerInput compilerInput0 = new CompilerInput(syntheticAst0);
        ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.createRefForTest(compilerInput0);
        ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference1 = referenceCollectingCallback_Reference0.cloneWithNewScope((Scope) null);
        assertNotSame(referenceCollectingCallback_Reference0, referenceCollectingCallback_Reference1);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        SourceFile sourceFile0 = new SourceFile("T}3+Z2zIF@?.$b");
        CompilerInput compilerInput0 = new CompilerInput(sourceFile0);
        ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.createRefForTest(compilerInput0);
        Compiler compiler0 = new Compiler();
        CollapseProperties collapseProperties0 = new CollapseProperties(compiler0, false, false);
        // Undeclared exception!
        try {
            collapseProperties0.getRefModule(referenceCollectingCallback_Reference0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.Compiler", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        SourceFile sourceFile0 = SourceFile.fromCode("com/google/javascript/rhino/head/NativeFunction", "com/google/javascript/rhino/head/NativeFunction", "com/google/javascript/rhino/head/NativeFunction");
        CompilerInput compilerInput0 = new CompilerInput(sourceFile0);
        ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.createRefForTest(compilerInput0);
        Scope scope0 = referenceCollectingCallback_Reference0.getScope();
        assertNull(scope0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        SourceFile sourceFile0 = SourceFile.fromCode("arguments", "arguments", "arguments");
        CompilerInput compilerInput0 = new CompilerInput(sourceFile0);
        ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.createRefForTest(compilerInput0);
        StaticSourceFile staticSourceFile0 = referenceCollectingCallback_Reference0.getSourceFile();
        assertNull(staticSourceFile0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        SourceFile sourceFile0 = SourceFile.fromCode("com/google/javascript/rhino/head/NativeFunction", "com/google/javascript/rhino/head/NativeFunction", "com/google/javascript/rhino/head/NativeFunction");
        CompilerInput compilerInput0 = new CompilerInput(sourceFile0);
        ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.createRefForTest(compilerInput0);
        ReferenceCollectingCallback.BasicBlock referenceCollectingCallback_BasicBlock0 = referenceCollectingCallback_Reference0.getBasicBlock();
        assertNull(referenceCollectingCallback_BasicBlock0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        SyntheticAst syntheticAst0 = new SyntheticAst("v-0w3L8%8{?g9M^");
        CompilerInput compilerInput0 = new CompilerInput(syntheticAst0);
        ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.createRefForTest(compilerInput0);
        // Undeclared exception!
        try {
            referenceCollectingCallback_Reference0.getSymbol();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // NAME is not a string node
            //
            verifyException("com.google.javascript.rhino.Node", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        SourceFile sourceFile0 = SourceFile.fromCode("T}3+Z2zDIF@].$b", "T}3+Z2zDIF@].$b", "T}3+Z2zDIF@].$b");
        CompilerInput compilerInput0 = new CompilerInput(sourceFile0);
        ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.createRefForTest(compilerInput0);
        // Undeclared exception!
        try {
            referenceCollectingCallback_Reference0.isVarDeclaration();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference", e);
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("bOa,5$z*0rHX@(~");
        ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, referenceCollectingCallback0);
        // Undeclared exception!
        try {
            ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, (ReferenceCollectingCallback.BasicBlock) null, node0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference", e);
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        SyntheticAst syntheticAst0 = new SyntheticAst("v-0w3L8%8{?zg9M^");
        CompilerInput compilerInput0 = new CompilerInput(syntheticAst0);
        ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.createRefForTest(compilerInput0);
        // Undeclared exception!
        try {
            referenceCollectingCallback_Reference0.isHoistedFunction();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.NodeUtil", e);
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
        Spliterator<ReferenceCollectingCallback.Reference> spliterator0 = referenceCollectingCallback_ReferenceCollection0.spliterator();
        assertNotNull(spliterator0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Compiler compiler0 = new Compiler();
        ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
        // Undeclared exception!
        try {
            referenceCollectingCallback0.getScope((Scope.Var) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.ReferenceCollectingCallback", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Compiler compiler0 = new Compiler();
        ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
        Iterable<Scope.Var> iterable0 = referenceCollectingCallback0.getAllSymbols();
        assertNotNull(iterable0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback((AbstractCompiler) null, referenceCollectingCallback_Behavior0);
        ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = referenceCollectingCallback0.getReferences((Scope.Var) null);
        assertNull(referenceCollectingCallback_ReferenceCollection0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        File file0 = MockFile.createTempFile(";LI", ".}lw9-+i7");
        MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
        PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
        Compiler compiler0 = new Compiler(printStreamErrorManager0);
        ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        Predicate<Scope.Var> predicate0 = (Predicate<Scope.Var>) mock(Predicate.class, new ViolatedAssumptionAnswer());
        ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0, predicate0);
        Node node0 = compiler0.parseSyntheticCode(";LI", ";LI");
        Node node1 = new Node(113, node0, node0);
        // Undeclared exception!
        try {
            referenceCollectingCallback0.hotSwapScript(node1, node1);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
            //   Node(WHILE): [source unknown]
            //   Parent: NULL
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("bOa,5$z*0rHX@(~");
        ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
        Node node1 = new Node(77, node0, node0, node0, node0, 50, (-325));
        // Undeclared exception!
        try {
            referenceCollectingCallback0.hotSwapScript(node1, node1);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
            //   Node(TRY): [source unknown]
            //   Parent: NULL
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("bOa,5$z*0rHX@(~");
        ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
        Node node1 = new Node(101, node0, node0, node0, node0, 1, 43);
        // Undeclared exception!
        try {
            referenceCollectingCallback0.hotSwapScript(node1, node1);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
            //   Node(AND): [source unknown]
            //   Parent: NULL
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("");
        ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
        Node node1 = new Node(108, node0, node0, node0, node0, 1, 1);
        // Undeclared exception!
        try {
            referenceCollectingCallback0.hotSwapScript(node1, node0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
            //   Node(IF): [source unknown]
            //   Parent: NULL
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("CqDCGURJPzd");
        ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
        Node node1 = new Node(114, node0, node0, node0, node0, 1, 43);
        // Undeclared exception!
        try {
            referenceCollectingCallback0.hotSwapScript(node1, node1);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
            //   Node(DO): [source unknown]
            //   Parent: NULL
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("CqDCGURJPzd");
        ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
        Node node1 = new Node(115, node0, node0, node0, node0, 1, 43);
        // Undeclared exception!
        try {
            referenceCollectingCallback0.hotSwapScript(node1, node1);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
            //   Node(FOR): [source unknown]
            //   Parent: NULL
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("bOa,5$z*0rHX@(~");
        ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
        Node node1 = new Node(119, node0, node0, node0, node0, 101, 36);
        // Undeclared exception!
        try {
            referenceCollectingCallback0.hotSwapScript(node1, node1);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
            //   Node(WITH): [source unknown]
            //   Parent: NULL
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("bOa_5$Z0$HX@(");
        ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
        Node node1 = compiler0.parseTestCode("bOa_5$Z0$HX@(");
        Node node2 = new Node(100, node0, node0, node0, node1, 47, 43);
        // Undeclared exception!
        try {
            referenceCollectingCallback0.hotSwapScript(node2, node2);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
            //   Node(OR): [source unknown]
            //   Parent: NULL
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
        referenceCollectingCallback_ReferenceCollection0.isAssignedOnceInLifetime();
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("arguments");
        Node node1 = new Node(55, node0, node0, node0, node0, 206, (-2220));
        ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        Predicate<Scope.Var> predicate0 = (Predicate<Scope.Var>) mock(Predicate.class, new ViolatedAssumptionAnswer());
        doReturn(true, false).when(predicate0).apply(any(com.google.javascript.jscomp.Scope.Var.class));
        ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0, predicate0);
        // Undeclared exception!
        try {
            referenceCollectingCallback0.process(node0, node0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // 55
            //
            verifyException("com.google.javascript.rhino.Token", e);
        }
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
        referenceCollectingCallback_ReferenceCollection0.add((ReferenceCollectingCallback.Reference) null);
        // Undeclared exception!
        try {
            referenceCollectingCallback_ReferenceCollection0.isWellDefined();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection", e);
        }
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean0 = referenceCollectingCallback_ReferenceCollection0.isWellDefined();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean0 = referenceCollectingCallback_ReferenceCollection0.isEscaped();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
        referenceCollectingCallback_ReferenceCollection0.add((ReferenceCollectingCallback.Reference) null);
        // Undeclared exception!
        try {
            referenceCollectingCallback_ReferenceCollection0.isEscaped();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference", e);
        }
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
        ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = referenceCollectingCallback_ReferenceCollection0.getInitializingReferenceForConstants();
        assertNull(referenceCollectingCallback_Reference0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
        referenceCollectingCallback_ReferenceCollection0.add((ReferenceCollectingCallback.Reference) null);
        // Undeclared exception!
        try {
            referenceCollectingCallback_ReferenceCollection0.getInitializingReferenceForConstants();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection", e);
        }
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
        referenceCollectingCallback_ReferenceCollection0.add((ReferenceCollectingCallback.Reference) null);
        // Undeclared exception!
        try {
            referenceCollectingCallback_ReferenceCollection0.isAssignedOnceInLifetime();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection", e);
        }
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean0 = referenceCollectingCallback_ReferenceCollection0.isNeverAssigned();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
        referenceCollectingCallback_ReferenceCollection0.add((ReferenceCollectingCallback.Reference) null);
        // Undeclared exception!
        try {
            referenceCollectingCallback_ReferenceCollection0.isNeverAssigned();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection", e);
        }
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean0 = referenceCollectingCallback_ReferenceCollection0.firstReferenceIsAssigningDeclaration();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        ReferenceCollectingCallback.ReferenceCollection referenceCollectingCallback_ReferenceCollection0 = new ReferenceCollectingCallback.ReferenceCollection();
        referenceCollectingCallback_ReferenceCollection0.add((ReferenceCollectingCallback.Reference) null);
        // Undeclared exception!
        try {
            referenceCollectingCallback_ReferenceCollection0.firstReferenceIsAssigningDeclaration();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection", e);
        }
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        SourceFile sourceFile0 = SourceFile.fromCode("com/google/javascript/rhino/head/NativeFunction", "com/google/javascript/rhino/head/NativeFunction", "com/google/javascript/rhino/head/NativeFunction");
        CompilerInput compilerInput0 = new CompilerInput(sourceFile0);
        ReferenceCollectingCallback.Reference referenceCollectingCallback_Reference0 = ReferenceCollectingCallback.Reference.createRefForTest(compilerInput0);
        Node node0 = referenceCollectingCallback_Reference0.getGrandparent();
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("");
        ReferenceCollectingCallback.BasicBlock referenceCollectingCallback_BasicBlock0 = new ReferenceCollectingCallback.BasicBlock((ReferenceCollectingCallback.BasicBlock) null, node0);
        ReferenceCollectingCallback.BasicBlock referenceCollectingCallback_BasicBlock1 = new ReferenceCollectingCallback.BasicBlock((ReferenceCollectingCallback.BasicBlock) null, node0);
        ReferenceCollectingCallback.BasicBlock referenceCollectingCallback_BasicBlock2 = new ReferenceCollectingCallback.BasicBlock(referenceCollectingCallback_BasicBlock0, node0);
        boolean boolean0 = referenceCollectingCallback_BasicBlock1.provablyExecutesBefore(referenceCollectingCallback_BasicBlock2);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("arguments");
        ReferenceCollectingCallback.BasicBlock referenceCollectingCallback_BasicBlock0 = new ReferenceCollectingCallback.BasicBlock((ReferenceCollectingCallback.BasicBlock) null, node0);
        boolean boolean0 = referenceCollectingCallback_BasicBlock0.provablyExecutesBefore(referenceCollectingCallback_BasicBlock0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("arguments", "arguments");
        ReferenceCollectingCallback.BasicBlock referenceCollectingCallback_BasicBlock0 = new ReferenceCollectingCallback.BasicBlock((ReferenceCollectingCallback.BasicBlock) null, node0);
        ReferenceCollectingCallback.BasicBlock referenceCollectingCallback_BasicBlock1 = new ReferenceCollectingCallback.BasicBlock(referenceCollectingCallback_BasicBlock0, node0);
        boolean boolean0 = referenceCollectingCallback_BasicBlock1.provablyExecutesBefore((ReferenceCollectingCallback.BasicBlock) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3737() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("arguments", "arguments");
        ReferenceCollectingCallback.BasicBlock referenceCollectingCallback_BasicBlock0 = new ReferenceCollectingCallback.BasicBlock((ReferenceCollectingCallback.BasicBlock) null, node0);
        ReferenceCollectingCallback.BasicBlock referenceCollectingCallback_BasicBlock1 = new ReferenceCollectingCallback.BasicBlock((ReferenceCollectingCallback.BasicBlock) null, node0);
        boolean boolean0 = referenceCollectingCallback_BasicBlock1.provablyExecutesBefore(referenceCollectingCallback_BasicBlock0);
        assertTrue(boolean0);
    }
}
