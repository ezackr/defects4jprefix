# Defects4JPrefix

This repository generates test prefixes from the Defects4J buggy project versions using EvoSuite.

## Setup

### Defects4J

Follow the instructions on the [Defects4J GitHub page](https://github.com/rjust/defects4j) to clone and set up the Defects4J repository. Then, add the Defects4J directory to your path in a local terminal window:

```bash
export DEFECTS4J_HOME="path/to/defects4j"
```

### SDKMan

We automate the installation of SDKMan by running the script:

```bash
bash ./script/util/init.sh
```

## Generate prefixes

### Modified classes

Get a list of all modified classes in Defects4J:

```bash
bash ./script/util/modified_classes.sh
```

Generate prefixes for each class in each Defects4J bug:

```bash
bash ./script/prefix.sh
```

To only generate prefixes for a specific project, add a project name as an argument:

```bash
bash ./script/prefix.sh [project-name]
```