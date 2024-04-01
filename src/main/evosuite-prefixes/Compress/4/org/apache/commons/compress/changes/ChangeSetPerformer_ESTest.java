/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 01:21:24 GMT 2023
 */
package org.apache.commons.compress.changes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.changes.ChangeSet;
import org.apache.commons.compress.changes.ChangeSetPerformer;
import org.apache.commons.compress.changes.ChangeSetResults;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ChangeSetPerformer_ESTest extends ChangeSetPerformer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        ChangeSet changeSet0 = new ChangeSet();
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = (byte) (-93);
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        ChangeSetPerformer changeSetPerformer0 = new ChangeSetPerformer(changeSet0);
        changeSetPerformer0.perform(tarArchiveInputStream0, (ArchiveOutputStream) null);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        ChangeSet changeSet0 = new ChangeSet();
        changeSet0.deleteDir("U");
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        ChangeSetPerformer changeSetPerformer0 = new ChangeSetPerformer(changeSet0);
        ChangeSetResults changeSetResults0 = changeSetPerformer0.perform(tarArchiveInputStream0, (ArchiveOutputStream) null);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        ChangeSet changeSet0 = new ChangeSet();
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("U", (byte) 121);
        changeSet0.add((ArchiveEntry) tarArchiveEntry0, (InputStream) byteArrayInputStream0, false);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        ChangeSetPerformer changeSetPerformer0 = new ChangeSetPerformer(changeSet0);
        changeSetPerformer0.perform(tarArchiveInputStream0, (ArchiveOutputStream) null);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        ChangeSet changeSet0 = new ChangeSet();
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("a", 0L);
        JarArchiveInputStream jarArchiveInputStream0 = new JarArchiveInputStream((InputStream) null);
        changeSet0.add((ArchiveEntry) arArchiveEntry0, (InputStream) jarArchiveInputStream0);
        ChangeSetPerformer changeSetPerformer0 = new ChangeSetPerformer(changeSet0);
        changeSetPerformer0.perform(jarArchiveInputStream0, (ArchiveOutputStream) null);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        ChangeSet changeSet0 = new ChangeSet();
        changeSet0.deleteDir("U");
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = (byte) (-93);
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        ChangeSetPerformer changeSetPerformer0 = new ChangeSetPerformer(changeSet0);
        changeSetPerformer0.perform(tarArchiveInputStream0, (ArchiveOutputStream) null);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        ChangeSet changeSet0 = new ChangeSet();
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = (byte) (-12);
        changeSet0.delete("@5IOC/=*+)P<bsy");
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        ChangeSetPerformer changeSetPerformer0 = new ChangeSetPerformer(changeSet0);
        changeSetPerformer0.perform(tarArchiveInputStream0, (ArchiveOutputStream) null);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        ChangeSet changeSet0 = new ChangeSet();
        byte[] byteArray0 = new byte[9];
        byteArray0[8] = (byte) (-63);
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        changeSet0.delete("");
        ChangeSetPerformer changeSetPerformer0 = new ChangeSetPerformer(changeSet0);
        ChangeSetResults changeSetResults0 = changeSetPerformer0.perform(tarArchiveInputStream0, (ArchiveOutputStream) null);
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        ChangeSet changeSet0 = new ChangeSet();
        byte[] byteArray0 = new byte[2];
        byteArray0[1] = (byte) 1;
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        TarArchiveInputStream tarArchiveInputStream0 = new TarArchiveInputStream(byteArrayInputStream0);
        MockPrintStream mockPrintStream0 = new MockPrintStream("~Wc,v'a?KG+#;>TG");
        TarArchiveOutputStream tarArchiveOutputStream0 = new TarArchiveOutputStream(mockPrintStream0);
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 1);
        changeSet0.add((ArchiveEntry) arArchiveEntry0, (InputStream) byteArrayInputStream0, false);
        ChangeSetPerformer changeSetPerformer0 = new ChangeSetPerformer(changeSet0);
        ChangeSetResults changeSetResults0 = changeSetPerformer0.perform(tarArchiveInputStream0, tarArchiveOutputStream0);
    }
}
