/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Apr 06 13:41:32 GMT 2024
 */

package org.apache.commons.compress.archivers.tar;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TarArchiveInputStream_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.compress.archivers.tar.TarArchiveInputStream"; 
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
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("user.dir", "/Users/elliottzackrone/IdeaProjects/defects4jprefix"); 
    java.lang.System.setProperty("user.name", "elliottzackrone"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/vv/c7q6vm8920vc7d5p_87011w40000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TarArchiveInputStream_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.compress.archivers.zip.FallbackZipEncoding",
      "org.apache.commons.compress.archivers.tar.TarUtils$1",
      "org.apache.commons.compress.archivers.arj.ArjArchiveEntry",
      "org.apache.commons.compress.archivers.ArchiveEntry",
      "org.apache.commons.compress.archivers.tar.TarArchiveInputStream",
      "org.apache.commons.compress.utils.IOUtils",
      "org.apache.commons.compress.archivers.zip.ZipEncoding",
      "org.apache.commons.compress.archivers.zip.ZipEncodingHelper$SimpleEncodingHolder",
      "org.apache.commons.compress.archivers.zip.ZipEncodingHelper",
      "org.apache.commons.compress.archivers.tar.TarConstants",
      "org.apache.commons.compress.utils.ArchiveUtils",
      "org.apache.commons.compress.archivers.tar.TarArchiveEntry",
      "org.apache.commons.compress.archivers.tar.TarUtils",
      "org.apache.commons.compress.archivers.arj.LocalFileHeader",
      "org.apache.commons.compress.archivers.ArchiveInputStream",
      "org.apache.commons.compress.utils.Charsets"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TarArchiveInputStream_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.compress.archivers.ArchiveInputStream",
      "org.apache.commons.compress.archivers.tar.TarArchiveInputStream",
      "org.apache.commons.compress.utils.Charsets",
      "org.apache.commons.compress.archivers.zip.ZipEncodingHelper$SimpleEncodingHolder",
      "org.apache.commons.compress.archivers.zip.FallbackZipEncoding",
      "org.apache.commons.compress.archivers.zip.ZipEncodingHelper",
      "org.apache.commons.compress.utils.IOUtils",
      "org.apache.commons.compress.utils.ArchiveUtils",
      "org.apache.commons.compress.archivers.tar.TarArchiveEntry",
      "org.apache.commons.compress.archivers.zip.ZipArchiveEntry",
      "org.apache.commons.compress.archivers.zip.GeneralPurposeBit",
      "org.apache.commons.compress.archivers.tar.TarUtils$1",
      "org.apache.commons.compress.archivers.tar.TarUtils",
      "org.apache.commons.compress.archivers.dump.DumpArchiveEntry",
      "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TYPE",
      "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader",
      "org.apache.commons.compress.archivers.ar.ArArchiveEntry",
      "org.apache.commons.compress.archivers.zip.ZipShort",
      "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry",
      "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry",
      "org.apache.commons.compress.archivers.jar.JarArchiveEntry",
      "org.apache.commons.compress.archivers.zip.AsiExtraField",
      "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp",
      "org.apache.commons.compress.archivers.zip.X7875_NewUnix",
      "org.apache.commons.compress.archivers.zip.JarMarker",
      "org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField",
      "org.apache.commons.compress.archivers.zip.UnicodePathExtraField",
      "org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField",
      "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField",
      "org.apache.commons.compress.archivers.zip.ExtraFieldUtils",
      "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding",
      "org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding$Simple8BitChar",
      "org.apache.commons.compress.archivers.arj.ArjArchiveEntry",
      "org.apache.commons.compress.archivers.arj.LocalFileHeader",
      "org.apache.commons.compress.archivers.zip.NioZipEncoding",
      "org.apache.commons.compress.archivers.cpio.CpioUtil",
      "org.apache.commons.compress.archivers.zip.ZipLong",
      "org.apache.commons.compress.archivers.zip.ZipUtil"
    );
  }
}
