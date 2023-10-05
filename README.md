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
export PATH=$PATH:"path2defects4j"/framework/bin
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

Get a list of all modified classes in Defects4J.

```bash
bash ./script/util/modified_classes.sh
```
