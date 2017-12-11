# antlr-plsql
Antlr PL/SQL Lexer Parser
Forked from https://github.com/antlr/grammars-v4/tree/master/plsql

## Setup Instructions

You need to get JDK and Kotlin installed. For Mac:
1. `brew cask install java`
1. `brew install kotlin`

### Generate JSON with Prebuilt JARs

- `lib/pps`

This Repo ships prebuilt PlSql.jar and dependencies (in `lib` folder). You are able to call `lib/pps` to parse multiple PL/SQL files. It will generate JSON output.

### Antlr4 GUI

1. `brew install antlr`
1. `echo 'export CLASSPATH=".:/usr/local/lib/antlr-4.7-complete.jar:$CLASSPATH"' >> ~/.bash_profile`
1. `cd grammar && ./build && cd ../bin`

Now it's ready to call `./gjg <file>` to test grammars. 

---

## Open Code with IDEA (Community Edition)

1. You may need `Tools` -> `Kotlin` -> `Configure Kotlin in Project`
1. You may need to add lines below into `Help` -> `Edit Custom Properties...`
	```
	idea_rt
	idea.no.launcher=true
	idea.max.intellisense.filesize=3000
	```
1. `Run` -> `Edit Configurations`, `Add New Configuration` (button "+" on up-left corner), name it and set `Main class` to `PlSql`
1. Install latest `org.antlr:antlr4-runtime` and `org.json:json` via Maven
1. You may need to increase your console buffer size via `Preferences`, `Editor` -> `General` -> `Console`, `Override console cycle buffer size` like 10MB

After restarting IDEA you should be able to Run `src/PlSql.kt`.

## Pack JAR

1. Build with IDEA. The files should be placed in `target/classes`
1. Run `bin/pack` to generate JAR file as `lib/PlSql.jar`
