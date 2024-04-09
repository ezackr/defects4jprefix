/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Apr 06 14:20:05 GMT 2024
 */

package org.apache.commons.compress.archivers.sevenz;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SevenZFile_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.compress.archivers.sevenz.SevenZFile"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/Users/elliottzackrone/IdeaProjects/defects4jprefix"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/vv/c7q6vm8920vc7d5p_87011w40000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SevenZFile_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.compress.archivers.sevenz.SevenZFile",
      "org.apache.commons.compress.utils.CRC32VerifyingInputStream",
      "org.apache.commons.compress.utils.ChecksumVerifyingInputStream",
      "org.apache.commons.compress.archivers.ArchiveEntry",
      "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry",
      "org.apache.commons.compress.utils.BoundedInputStream",
      "org.apache.commons.compress.archivers.sevenz.StartHeader",
      "org.apache.commons.compress.archivers.sevenz.Archive",
      "org.apache.commons.compress.archivers.sevenz.Folder",
      "org.apache.commons.compress.archivers.sevenz.BoundedRandomAccessFileInputStream"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SevenZFile_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.compress.archivers.sevenz.SevenZFile",
      "org.apache.commons.compress.archivers.sevenz.SevenZMethod",
      "org.apache.commons.compress.archivers.sevenz.Coders$1",
      "org.apache.commons.compress.archivers.sevenz.CoderBase",
      "org.apache.commons.compress.archivers.sevenz.Coders$CopyDecoder",
      "org.apache.commons.compress.archivers.sevenz.Coders$LZMADecoder",
      "org.apache.commons.compress.archivers.sevenz.LZMA2Decoder",
      "org.apache.commons.compress.archivers.sevenz.Coders$DeflateDecoder",
      "org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder",
      "org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder",
      "org.apache.commons.compress.archivers.sevenz.Coders$BCJDecoder",
      "org.tukaani.xz.FilterOptions",
      "org.tukaani.xz.BCJOptions",
      "org.tukaani.xz.X86Options",
      "org.tukaani.xz.PowerPCOptions",
      "org.tukaani.xz.IA64Options",
      "org.tukaani.xz.ARMOptions",
      "org.tukaani.xz.ARMThumbOptions",
      "org.tukaani.xz.SPARCOptions",
      "org.apache.commons.compress.archivers.sevenz.DeltaDecoder",
      "org.apache.commons.compress.archivers.sevenz.Coders",
      "org.apache.commons.compress.utils.IOUtils"
    );
  }
}
