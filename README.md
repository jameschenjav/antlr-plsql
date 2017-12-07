# antlr-plsql
Antlr PL/SQL Lexer Parser

## Usage (for Mac)

1. `brew install antlr`
1. `echo 'export CLASSPATH=".:/usr/local/lib/antlr-4.7-complete.jar:$CLASSPATH"' >> ~/.bash_profile`
1. `cd grammar && ./build && cd ../src`

Now it's ready to call `grun PlSql <pattern> -gui <file>` to test grammars.
The pattern `javln` is ready for internal usage (procedures/functions/packages/views in folder `fs/db/db_code/gerrit`)
