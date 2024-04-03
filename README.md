# Defects4JPrefix

This project generates test prefixes for each bug in [Defects4J](https://github.com/rjust/defects4j). A test prefix is defined as the non-assertion statements in a test case that set up a program state to be evaluated. For example:

```java
public class MyClassTest {
    @Test
    public void addTest() {
        int a = 5;              // prefix
        int b = 3;              // prefix cont.
        int sum = add(a, b);    // prefix cont.
        assertEqual(8, sum);    // oracle
    }
}
```

Defects4J contains both buggy and fixed versions of the same program. This repository uses the buggy program version to generate test prefixes. Specifically, this project uses the `gen_tests` command from Defects4J with EvoSuite to generate a test suite for each class modified between the buggy and fixed program versions. Then, the [OracleRemover](https://github.com/AML14/tratto/blob/experiment-end-to-end/experiment/src/main/java/OracleRemover.java) class from the Tratto project is used to remove all oracles from the test suite.

## Setup

### Defects4J

Follow the instructions on the
[Defects4J GitHub page](https://github.com/rjust/defects4j) to clone and set
up the Defects4J repository. Then, export the Defects4J directory to your path
in a local terminal window:

```bash
export DEFECTS4J_HOME="path/to/defects4j"
```
The command must be repeated any time a new terminal window is opened. Alternatively, open the script `./script/util/global_variables.sh`,
uncomment the line `#DEFECTS4J_HOME="path_to_defects4j"`and set the `DEFECTS4J_HOME` variable to the path of the Defects4J repository permanently.


### SDKMan

We automate the installation of SDKMan by running the script:

```bash
bash ./script/util/init.sh
```

## Generate prefixes

(1) Get a list of all modified classes in Defects4J:

```bash
./script/util/modified_classes.sh
```

(2) Generate prefixes for each class in each Defects4J bug:

```bash
./script/prefix.sh
```

**(Optional)** To only generate prefixes for a specific project bug, add the
project name and bug id as arguments:

```bash
./script/prefix.sh [project-name] [bug-id]
```

For example,

```bash
./script/prefix.sh Closure 2
```