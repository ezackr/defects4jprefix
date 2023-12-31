/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 13:57:27 GMT 2023
 */
package org.apache.commons.math3.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.math3.genetics.Chromosome;
import org.apache.commons.math3.genetics.ElitisticListPopulation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class ElitisticListPopulation_ESTest extends ElitisticListPopulation_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
        int int0 = 1745;
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 1745, 1745);
        elitisticListPopulation0.setElitismRate(0.0);
        elitisticListPopulation0.setElitismRate((-3480.99221112174));
        Chromosome chromosome0 = elitisticListPopulation0.getFittestChromosome();
        linkedList0.addLast(chromosome0);
    }

    @Test(timeout = 4000)
    public void test041() throws Throwable {
        LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
        int int0 = 0;
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 0, (-763.75318048848));
        elitisticListPopulation0.setElitismRate(int0);
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        int int0 = (-881);
        double double0 = 700.3623;
        ElitisticListPopulation elitisticListPopulation0 = null;
        elitisticListPopulation0 = new ElitisticListPopulation((-881), 700.3623);
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        List<Chromosome> list0 = null;
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) null, 0, 0);
        elitisticListPopulation0.setChromosomes(list0);
    }

    @Test(timeout = 4000)
    public void test084() throws Throwable {
        int int0 = 1054;
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1054, 0.0);
        List<Chromosome> list0 = elitisticListPopulation0.getChromosomes();
        ElitisticListPopulation elitisticListPopulation1 = new ElitisticListPopulation(list0, 1054, 1054);
        elitisticListPopulation1.nextGeneration();
        elitisticListPopulation1.setElitismRate(1054);
        elitisticListPopulation1.iterator();
    }

    @Test(timeout = 4000)
    public void test185() throws Throwable {
        ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(254, 254);
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        elitisticListPopulation0.forEach(consumer0);
        elitisticListPopulation0.setPopulationLimit((-1073741824));
        elitisticListPopulation0.addChromosome((Chromosome) null);
        List<Chromosome> list0 = elitisticListPopulation0.getChromosomes();
        ElitisticListPopulation elitisticListPopulation1 = new ElitisticListPopulation(list0, 254, 254);
        elitisticListPopulation1.iterator();
        elitisticListPopulation1.nextGeneration();
        elitisticListPopulation0.nextGeneration();
        elitisticListPopulation0.nextGeneration();
        elitisticListPopulation0.nextGeneration();
    }
}
