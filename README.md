# Defects4JPrefix

This repository generates test prefixes from the Defects4J buggy project versions using EvoSuite.

## Setup

### Defects4J

To setup the repository to generate prefixes, we must setup Defects4J. First, clone the repository:

```bash
git clone https://github.com/rjust/defects4j
```

Initialize Defects4J:

```bash
cd defects4j || exit 1
cpan --installdeps .
./init.sh
cd ..
```

Add Defects4J executables to your `PATH`:

```bash
export PATH=$PATH:$(realpath .)"/defects4j/framework/bin"
```

Check installation:
```bash
defects4j info -p Lang
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