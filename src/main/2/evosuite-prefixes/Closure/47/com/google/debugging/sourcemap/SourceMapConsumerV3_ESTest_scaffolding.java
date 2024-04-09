/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Apr 06 02:15:57 GMT 2024
 */

package com.google.debugging.sourcemap;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SourceMapConsumerV3_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.debugging.sourcemap.SourceMapConsumerV3"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SourceMapConsumerV3_ESTest_scaffolding.class.getClassLoader() ,
      "org.json.JSONObject$Null",
      "com.google.debugging.sourcemap.SourceMapping",
      "com.google.protobuf.Descriptors$GenericDescriptor",
      "com.google.protobuf.FieldSet$FieldDescriptorLite",
      "com.google.protobuf.Message$Builder",
      "com.google.debugging.sourcemap.SourceMapSupplier",
      "com.google.debugging.sourcemap.Base64VLQ$CharIterator",
      "com.google.protobuf.MessageOrBuilder",
      "com.google.protobuf.AbstractMessage$Builder",
      "com.google.protobuf.GeneratedMessage$ExtensionDescriptorRetriever",
      "com.google.protobuf.AbstractMessageLite$Builder",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$DefaultSourceMapSupplier",
      "org.json.JSONException",
      "com.google.debugging.sourcemap.SourceMapParseException",
      "org.json.JSONObject",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$EntryVisitor",
      "com.google.protobuf.MessageLite$Builder",
      "com.google.protobuf.ExtensionRegistryLite",
      "com.google.protobuf.GeneratedMessage",
      "com.google.protobuf.AbstractMessageLite",
      "com.google.debugging.sourcemap.proto.Mapping$OriginalMapping$Builder",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$MappingBuilder",
      "com.google.protobuf.CodedOutputStream",
      "com.google.debugging.sourcemap.SourceMapConsumer",
      "com.google.protobuf.UnknownFieldSet",
      "com.google.debugging.sourcemap.proto.Mapping$OriginalMapping",
      "com.google.debugging.sourcemap.proto.Mapping",
      "com.google.protobuf.InvalidProtocolBufferException",
      "com.google.protobuf.AbstractMessage",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry",
      "org.json.JSONTokener",
      "com.google.debugging.sourcemap.SourceMapConsumerV3",
      "com.google.protobuf.Descriptors$Descriptor",
      "com.google.protobuf.MessageLiteOrBuilder",
      "com.google.debugging.sourcemap.proto.Mapping$OriginalMappingOrBuilder",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry",
      "com.google.protobuf.ByteString",
      "com.google.protobuf.MessageLite",
      "com.google.protobuf.Descriptors$FieldDescriptor",
      "com.google.protobuf.GeneratedMessage$GeneratedExtension",
      "com.google.protobuf.CodedInputStream",
      "com.google.protobuf.Message",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$StringCharIterator",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$UnnamedEntry",
      "com.google.debugging.sourcemap.SourceMappingReversable",
      "com.google.protobuf.GeneratedMessage$Builder",
      "org.json.JSONArray",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$Entry"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SourceMapConsumerV3_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.debugging.sourcemap.SourceMapConsumerV3",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$DefaultSourceMapSupplier",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$MappingBuilder",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$StringCharIterator",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$UnmappedEntry",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$UnnamedEntry",
      "com.google.debugging.sourcemap.SourceMapConsumerV3$NamedEntry",
      "com.google.protobuf.AbstractMessageLite",
      "com.google.protobuf.AbstractMessage",
      "com.google.protobuf.GeneratedMessage",
      "com.google.protobuf.UnknownFieldSet",
      "com.google.debugging.sourcemap.proto.Mapping$OriginalMapping",
      "com.google.protobuf.AbstractMessageLite$Builder",
      "com.google.protobuf.AbstractMessage$Builder",
      "com.google.protobuf.GeneratedMessage$Builder",
      "com.google.debugging.sourcemap.proto.Mapping$OriginalMapping$Builder",
      "com.google.protobuf.CodedInputStream",
      "com.google.protobuf.ExtensionRegistryLite",
      "com.google.protobuf.ExtensionRegistry",
      "com.google.protobuf.UnknownFieldSet$Builder",
      "com.google.protobuf.WireFormat",
      "com.google.protobuf.InvalidProtocolBufferException",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3",
      "com.google.common.collect.Lists",
      "com.google.common.base.Joiner",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.Collections2",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.Maps",
      "com.google.debugging.sourcemap.FilePosition",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$ConsumerEntryVisitor",
      "org.json.JSONArray",
      "org.json.JSONException",
      "org.json.JSONObject$Null",
      "org.json.JSONObject",
      "org.json.JSONTokener",
      "com.google.debugging.sourcemap.SourceMapParseException",
      "com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Type$1",
      "com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Type",
      "com.google.protobuf.GeneratedMessage$ExtendableMessage",
      "com.google.protobuf.SmallSortedMap",
      "com.google.protobuf.SmallSortedMap$1",
      "com.google.protobuf.SmallSortedMap$EmptySet$1",
      "com.google.protobuf.SmallSortedMap$EmptySet$2",
      "com.google.protobuf.SmallSortedMap$EmptySet",
      "com.google.protobuf.FieldSet",
      "com.google.protobuf.DescriptorProtos$FieldOptions$CType$1",
      "com.google.protobuf.DescriptorProtos$FieldOptions$CType",
      "com.google.protobuf.DescriptorProtos$FieldOptions",
      "com.google.protobuf.DescriptorProtos$FieldDescriptorProto",
      "com.google.protobuf.DescriptorProtos$1",
      "com.google.protobuf.Descriptors$FileDescriptor",
      "com.google.protobuf.UnmodifiableLazyStringList",
      "com.google.protobuf.LazyStringArrayList",
      "com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode$1",
      "com.google.protobuf.DescriptorProtos$FileOptions$OptimizeMode",
      "com.google.protobuf.DescriptorProtos$FileOptions",
      "com.google.protobuf.DescriptorProtos$SourceCodeInfo",
      "com.google.protobuf.DescriptorProtos$FileDescriptorProto",
      "com.google.protobuf.DescriptorProtos$FileDescriptorProto$Builder",
      "com.google.protobuf.ByteString",
      "com.google.protobuf.DescriptorProtos$MessageOptions",
      "com.google.protobuf.DescriptorProtos$DescriptorProto",
      "com.google.protobuf.DescriptorProtos$DescriptorProto$Builder",
      "com.google.protobuf.DescriptorProtos$FieldDescriptorProto$Builder",
      "com.google.protobuf.DescriptorProtos$EnumOptions",
      "com.google.protobuf.DescriptorProtos$EnumDescriptorProto",
      "com.google.protobuf.DescriptorProtos$EnumDescriptorProto$Builder",
      "com.google.protobuf.DescriptorProtos$EnumValueOptions",
      "com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto",
      "com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto$Builder",
      "com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange",
      "com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange$Builder",
      "com.google.protobuf.GeneratedMessage$ExtendableBuilder",
      "com.google.protobuf.DescriptorProtos$FieldOptions$Builder",
      "com.google.protobuf.DescriptorProtos$FileOptions$Builder",
      "com.google.protobuf.Descriptors$DescriptorPool",
      "com.google.protobuf.Internal",
      "com.google.protobuf.Descriptors$DescriptorPool$PackageDescriptor",
      "com.google.protobuf.Descriptors$Descriptor",
      "com.google.protobuf.Descriptors",
      "com.google.protobuf.WireFormat$JavaType",
      "com.google.protobuf.WireFormat$FieldType",
      "com.google.protobuf.Descriptors$FieldDescriptor$JavaType",
      "com.google.protobuf.Descriptors$FieldDescriptor$Type",
      "com.google.protobuf.Descriptors$FieldDescriptor",
      "com.google.protobuf.Descriptors$EnumDescriptor",
      "com.google.protobuf.Descriptors$EnumValueDescriptor",
      "com.google.protobuf.Descriptors$DescriptorPool$DescriptorIntPair",
      "com.google.protobuf.Descriptors$1",
      "com.google.protobuf.GeneratedMessage$FieldAccessorTable",
      "com.google.protobuf.GeneratedMessage$FieldAccessorTable$RepeatedFieldAccessor",
      "com.google.protobuf.GeneratedMessage$FieldAccessorTable$RepeatedMessageFieldAccessor",
      "com.google.protobuf.GeneratedMessage$FieldAccessorTable$SingularFieldAccessor",
      "com.google.protobuf.GeneratedMessage$FieldAccessorTable$SingularMessageFieldAccessor",
      "com.google.protobuf.GeneratedMessage$FieldAccessorTable$SingularEnumFieldAccessor",
      "com.google.protobuf.DescriptorProtos",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$Mapping",
      "com.google.protobuf.DynamicMessage",
      "com.google.protobuf.DynamicMessage$Builder",
      "com.google.protobuf.UnknownFieldSet$Field$Builder",
      "com.google.protobuf.UnknownFieldSet$Field",
      "com.google.debugging.sourcemap.Util",
      "com.google.protobuf.DescriptorProtos$SourceCodeInfo$Location",
      "com.google.protobuf.DescriptorProtos$SourceCodeInfo$Location$Builder",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$MappingTraversal",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$UsedMappingCheck",
      "com.google.debugging.sourcemap.SourceMapGeneratorV3$LineMapper",
      "com.google.protobuf.GeneratedMessage$GeneratedExtension",
      "com.google.protobuf.ByteString$Output",
      "com.google.protobuf.AbstractMessageLite$Builder$LimitedInputStream",
      "com.google.protobuf.DescriptorProtos$UninterpretedOption",
      "com.google.protobuf.GeneratedMessage$1",
      "com.google.debugging.sourcemap.SourceMapSection",
      "com.google.protobuf.UnmodifiableLazyStringList$2",
      "com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePart"
    );
  }
}
