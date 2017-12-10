# antlr-plsql
Antlr PL/SQL Lexer Parser
Forked from https://github.com/antlr/grammars-v4/tree/master/plsql

## Usage (for Mac)

1. `brew install antlr`
1. `echo 'export CLASSPATH=".:/usr/local/lib/antlr-4.7-complete.jar:$CLASSPATH"' >> ~/.bash_profile`
1. `cd grammar && ./build && cd ../bin`

Now it's ready to call `grun PlSql <pattern> -gui <file>` to test grammars.
The pattern `javln` is ready for internal usage (procedures/functions/packages/views in folder `fs/db/db_code/gerrit`)

## Open with IDEA (Community Edition)

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
