%lex

%options case-insensitive

ID_BEG	[a-zA-Z]
ID_BODY	[a-zA-Z0-9_$#]
BID_BEG	[a-zA-Z0-9]
E	([Ee][+-]?[0-9][0-9_]*)
FS	[df]

%%

'/*'(.|\n)*?'/*'	/* skip comments */
'--'[^\n]*				/* skip comments */
\s+		/* skip whitespace */

':'{BID_BEG}{ID_BODY}*	return 'bound_id';
'"'[^"]+'"'				return 'quoted_id';

[0-9]+'.'?{E}?FS?			return 'number';
[0-9]*'.'[0-9]+?{E}?FS?		return 'number';
"'"(''|[^'])*"'"	return 'string';
"q'!".*"!'"			return 'string';
"q'[".*"]'"			return 'string';
"q'{".*"}'"			return 'string';
"q'(".*")'"			return 'string';
"q'<".*">'"			return 'string';

'%TYPE'			return '%TYPE';
'%ROWTYPE'		return '%ROWTYPE';
'%FOUND'		return '%FOUND';
'%ISOPEN'		return '%ISOPEN';
'%NOTFOUND'		return '%NOTFOUND';

'ALL'			return 'ALL';
'ALTER'			return 'ALTER';
'AND'			return 'AND';
'ANY'			return 'ANY';
'ARRAY'			return 'ARRAY';
'ARROW'			return 'ARROW';
'AS'			return 'AS';
'ASC'			return 'ASC';
'AT'			return 'AT';
'BEGIN'			return 'BEGIN';
'BETWEEN'		return 'BETWEEN';
'BY'			return 'BY';
'CASE'			return 'CASE';
'CHECK'			return 'CHECK';
'CLUSTER'		return 'CLUSTER';
'CLUSTERS'		return 'CLUSTERS';
'COLAUTH'		return 'COLAUTH';
'COLUMNS'		return 'COLUMNS';
'COMPRESS'		return 'COMPRESS';
'CONNECT'		return 'CONNECT';
'CRASH'			return 'CRASH';
'CREATE'		return 'CREATE';
'CURRENT'		return 'CURRENT';
'DECIMAL'		return 'DECIMAL';
'DECLARE'		return 'DECLARE';
'DEFAULT'		return 'DEFAULT';
'DELETE'		return 'DELETE';
'DESC'			return 'DESC';
'DISTINCT'		return 'DISTINCT';
'DROP'			return 'DROP';
'ELSE'			return 'ELSE';
'END'			return 'END';
'EXCEPTION'		return 'EXCEPTION';
'EXCLUSIVE'		return 'EXCLUSIVE';
'EXISTS'		return 'EXISTS';
'FETCH'			return 'FETCH';
'FOR'			return 'FOR';
'FORM'			return 'FORM';
'FROM'			return 'FROM';
'GOTO'			return 'GOTO';
'GRANT'			return 'GRANT';
'GROUP'			return 'GROUP';
'HAVING'		return 'HAVING';
'IDENTIFIED'	return 'IDENTIFIED';
'IF'			return 'IF';
'IN'			return 'IN';
'INDEX'			return 'INDEX';
'INDEXES'		return 'INDEXES';
'INSERT'		return 'INSERT';
'INTERSECT'		return 'INTERSECT';
'INTO'			return 'INTO';
'IS'			return 'IS';
'LIKE'			return 'LIKE';
'LOCK'			return 'LOCK';
'MINUS'			return 'MINUS';
'MODE'			return 'MODE';
'NOCOMPRESS'	return 'NOCOMPRESS';
'NOT'			return 'NOT';
'NOWAIT'		return 'NOWAIT';
'NULL'			return 'NULL';
'OF'			return 'OF';
'ON'			return 'ON';
'OPTION'		return 'OPTION';
'OR'			return 'OR';
'ORDER'			return 'ORDER';
'OVERLAPS'		return 'OVERLAPS';
'PRIOR'			return 'PRIOR';
'PROCEDURE'		return 'PROCEDURE';
'PUBLIC'		return 'PUBLIC';
'RANGE'			return 'RANGE';
'RECORD'		return 'RECORD';
'RESOURCE'		return 'RESOURCE';
'REVOKE'		return 'REVOKE';
'SELECT'		return 'SELECT';
'SHARE'			return 'SHARE';
'SIZE'			return 'SIZE';
'SQL'			return 'SQL';
'START'			return 'START';
'SUBTYPE'		return 'SUBTYPE';
'TABAUTH'		return 'TABAUTH';
'TABLE'			return 'TABLE';
'THEN'			return 'THEN';
'TO'			return 'TO';
'TYPE'			return 'TYPE';
'UNION'			return 'UNION';
'UNIQUE'		return 'UNIQUE';
'UPDATE'		return 'UPDATE';
'USE'			return 'USE';
'VALUES'		return 'VALUES';
'VIEW'			return 'VIEW';
'VIEWS'			return 'VIEWS';
'WHEN'			return 'WHEN';
'WHERE'			return 'WHERE';
'WITH'			return 'WITH';

'A'					return 'A';
'ADD'				return 'ADD';
'AGENT'				return 'AGENT';
'AGGREGATE'			return 'AGGREGATE';
'ARRAY'				return 'ARRAY';
'ATTRIBUTE'			return 'ATTRIBUTE';
'AUTHID'			return 'AUTHID';
'AVG'				return 'AVG';
'BFILE_BASE'		return 'BFILE_BASE';
'BINARY'			return 'BINARY';
'BLOB_BASE'			return 'BLOB_BASE';
'BLOCK'				return 'BLOCK';
'BODY'				return 'BODY';
'BOTH'				return 'BOTH';
'BOUND'				return 'BOUND';
'BULK'				return 'BULK';
'BYTE'				return 'BYTE';
'C'					return 'C';
'CALL'				return 'CALL';
'CALLING'			return 'CALLING';
'CASCADE'			return 'CASCADE';
'CHAR'				return 'CHAR';
'CHAR_BASE'			return 'CHAR_BASE';
'CHARACTER'			return 'CHARACTER';
'CHARSETFORM'		return 'CHARSETFORM';
'CHARSETID'			return 'CHARSETID';
'CHARSET'			return 'CHARSET';
'CLOB_BASE'			return 'CLOB_BASE';
'CLOSE'				return 'CLOSE';
'COLLECT'			return 'COLLECT';
'COMMENT'			return 'COMMENT';
'COMMIT'			return 'COMMIT';
'COMMITTED'			return 'COMMITTED';
'COMPILED'			return 'COMPILED';
'CONSTANT'			return 'CONSTANT';
'CONSTRUCTOR'		return 'CONSTRUCTOR';
'CONTEXT'			return 'CONTEXT';
'CONVERT'			return 'CONVERT';
'COUNT'				return 'COUNT';
'CURSOR'			return 'CURSOR';
'CUSTOMDATUM'		return 'CUSTOMDATUM';
'DANGLING'			return 'DANGLING';
'DATA'				return 'DATA';
'DATE'				return 'DATE';
'DATE_BASE'			return 'DATE_BASE';
'DAY'				return 'DAY';
'DEFINE'			return 'DEFINE';
'DETERMINISTIC'		return 'DETERMINISTIC';
'DOUBLE'			return 'DOUBLE';
'DURATION'			return 'DURATION';
'ELEMENT'			return 'ELEMENT';
'ELSIF'				return 'ELSIF';
'EMPTY'				return 'EMPTY';
'ESCAPE'			return 'ESCAPE';
'EXCEPT'			return 'EXCEPT';
'EXCEPTIONS'		return 'EXCEPTIONS';
'EXECUTE'			return 'EXECUTE';
'EXIT'				return 'EXIT';
'EXTERNAL'			return 'EXTERNAL';
'FINAL'				return 'FINAL';
'FIXED'				return 'FIXED';
'FLOAT'				return 'FLOAT';
'FORALL'			return 'FORALL';
'FORCE'				return 'FORCE';
'FUNCTION'			return 'FUNCTION';
'GENERAL'			return 'GENERAL';
'HASH'				return 'HASH';
'HEAP'				return 'HEAP';
'HIDDEN'			return 'HIDDEN';
'HOUR'				return 'HOUR';
'IMMEDIATE'			return 'IMMEDIATE';
'INCLUDING'			return 'INCLUDING';
'INDICATOR'			return 'INDICATOR';
'INDICES'			return 'INDICES';
'INFINITE'			return 'INFINITE';
'INSTANTIABLE'		return 'INSTANTIABLE';
'INT'				return 'INT';
'INTERFACE'			return 'INTERFACE';
'INTERVAL'			return 'INTERVAL';
'INVALIDATE'		return 'INVALIDATE';
'ISOLATION'			return 'ISOLATION';
'JAVA'				return 'JAVA';
'LANGUAGE'			return 'LANGUAGE';
'LARGE'				return 'LARGE';
'LEADING'			return 'LEADING';
'LENGTH'			return 'LENGTH';
'LEVEL'				return 'LEVEL';
'LIBRARY'			return 'LIBRARY';
'LIKE2'				return 'LIKE2';
'LIKE4'				return 'LIKE4';
'LIKEC'				return 'LIKEC';
'LIMIT'				return 'LIMIT';
'LIMITED'			return 'LIMITED';
'LOCAL'				return 'LOCAL';
'LONG'				return 'LONG';
'LOOP'				return 'LOOP';
'MAP'				return 'MAP';
'MAX'				return 'MAX';
'MAXLEN'			return 'MAXLEN';
'MEMBER'			return 'MEMBER';
'MERGE'				return 'MERGE';
'MIN'				return 'MIN';
'MINUTE'			return 'MINUTE';
'MOD'				return 'MOD';
'MODIFY'			return 'MODIFY';
'MONTH'				return 'MONTH';
'MULTISET'			return 'MULTISET';
'NAME'				return 'NAME';
'NAN'				return 'NAN';
'NATIONAL'			return 'NATIONAL';
'NATIVE'			return 'NATIVE';
'NCHAR'				return 'NCHAR';
'NEW'				return 'NEW';
'NOCOPY'			return 'NOCOPY';
'NUMBER_BASE'		return 'NUMBER_BASE';
'OBJECT'			return 'OBJECT';
'OCICOLL'			return 'OCICOLL';
'OCIDATETIME'		return 'OCIDATETIME';
'OCIDATE'			return 'OCIDATE';
'OCIDURATION'		return 'OCIDURATION';
'OCIINTERVAL'		return 'OCIINTERVAL';
'OCILOBLOCATOR'		return 'OCILOBLOCATOR';
'OCINUMBER'			return 'OCINUMBER';
'OCIRAW'			return 'OCIRAW';
'OCIREFCURSOR'		return 'OCIREFCURSOR';
'OCIREF'			return 'OCIREF';
'OCIROWID'			return 'OCIROWID';
'OCISTRING'			return 'OCISTRING';
'OCITYPE'			return 'OCITYPE';
'ONLY'				return 'ONLY';
'OPAQUE'			return 'OPAQUE';
'OPEN'				return 'OPEN';
'OPERATOR'			return 'OPERATOR';
'ORACLE'			return 'ORACLE';
'ORADATA'			return 'ORADATA';
'ORGANIZATION'		return 'ORGANIZATION';
'ORLANY'			return 'ORLANY';
'ORLVARY'			return 'ORLVARY';
'OTHERS'			return 'OTHERS';
'OUT'				return 'OUT';
'OVERRIDING'		return 'OVERRIDING';
'PACKAGE'			return 'PACKAGE';
'PARALLEL_ENABLE'	return 'PARALLEL_ENABLE';
'PARAMETER'			return 'PARAMETER';
'PARAMETERS'		return 'PARAMETERS';
'PARTITION'			return 'PARTITION';
'PASCAL'			return 'PASCAL';
'PIPE'				return 'PIPE';
'PIPELINED'			return 'PIPELINED';
'PRAGMA'			return 'PRAGMA';
'PRECISION'			return 'PRECISION';
'PRIVATE'			return 'PRIVATE';
'RAISE'				return 'RAISE';
'RANGE'				return 'RANGE';
'RAW'				return 'RAW';
'READ'				return 'READ';
'RECORD'			return 'RECORD';
'REF'				return 'REF';
'REFERENCE'			return 'REFERENCE';
'REM'				return 'REM';
'REMAINDER'			return 'REMAINDER';
'RENAME'			return 'RENAME';
'RESULT'			return 'RESULT';
'RETURN'			return 'RETURN';
'RETURNING'			return 'RETURNING';
'REVERSE'			return 'REVERSE';
'ROLLBACK'			return 'ROLLBACK';
'ROW'				return 'ROW';
'SAMPLE'			return 'SAMPLE';
'SAVE'				return 'SAVE';
'SAVEPOINT'			return 'SAVEPOINT';
'SB1'				return 'SB1';
'SB2'				return 'SB2';
'SB4'				return 'SB4';
'SECOND'			return 'SECOND';
'SEGMENT'			return 'SEGMENT';
'SELF'				return 'SELF';
'SEPARATE'			return 'SEPARATE';
'SEQUENCE'			return 'SEQUENCE';
'SERIALIZABLE'		return 'SERIALIZABLE';
'SET'				return 'SET';
'SHORT'				return 'SHORT';
'SIZE_T'			return 'SIZE_T';
'SOME'				return 'SOME';
'SPARSE'			return 'SPARSE';
'SQLCODE'			return 'SQLCODE';
'SQLDATA'			return 'SQLDATA';
'SQLNAME'			return 'SQLNAME';
'SQLSTATE'			return 'SQLSTATE';
'STANDARD'			return 'STANDARD';
'STATIC'			return 'STATIC';
'STDDEV'			return 'STDDEV';
'STORED'			return 'STORED';
'STRING'			return 'STRING';
'STRUCT'			return 'STRUCT';
'STYLE'				return 'STYLE';
'SUBMULTISET'		return 'SUBMULTISET';
'SUBPARTITION'		return 'SUBPARTITION';
'SUBSTITUTABLE'		return 'SUBSTITUTABLE';
'SUBTYPE'			return 'SUBTYPE';
'SUM'				return 'SUM';
'SYNONYM'			return 'SYNONYM';
'TDO'				return 'TDO';
'THE'				return 'THE';
'TIME'				return 'TIME';
'TIMESTAMP'			return 'TIMESTAMP';
'TIMEZONE_ABBR'		return 'TIMEZONE_ABBR';
'TIMEZONE_HOUR'		return 'TIMEZONE_HOUR';
'TIMEZONE_MINUTE'	return 'TIMEZONE_MINUTE';
'TIMEZONE_REGION'	return 'TIMEZONE_REGION';
'TRAILING'			return 'TRAILING';
'TRANSAC'			return 'TRANSAC';
'TRANSACTIONAL'		return 'TRANSACTIONAL';
'TRUSTED'			return 'TRUSTED';
'TYPE'				return 'TYPE';
'UB1'				return 'UB1';
'UB2'				return 'UB2';
'UB4'				return 'UB4';
'UNDER'				return 'UNDER';
'UNSIGNED'			return 'UNSIGNED';
'UNTRUSTED'			return 'UNTRUSTED';
'USE'				return 'USE';
'USING'				return 'USING';
'VALIST'			return 'VALIST';
'VALUE'				return 'VALUE';
'VARIABLE'			return 'VARIABLE';
'VARIANCE'			return 'VARIANCE';
'VARRAY'			return 'VARRAY';
'VARYING'			return 'VARYING';
'VOID'				return 'VOID';
'WHILE'				return 'WHILE';
'WORK'				return 'WORK';
'WRAPPED'			return 'WRAPPED';
'WRITE'				return 'WRITE';
'YEAR'				return 'YEAR';
'ZONE'				return 'ZONE';

'CURRENT_USER'	return 'CURRENT_USER';
'INOUT'			return 'INOUT';
'OFF'			return 'OFF';
'REPLACE'		return 'REPLACE';
'AUTONOMOUS_TRANSACTION'		return 'AUTONOMOUS_TRANSACTION';
'EXCEPTION_INIT'		return 'EXCEPTION_INIT';

'TRUE'		return 'bool';
'FALSE'		return 'bool';

{ID_BEG}{ID_BODY}*		return 'identifier';

'+'		return '+';
'.'		return '.';
'/'		return '/';
'('		return '(';
')'		return ')';
','		return ',';
'*'		return '*';
'='		return '=';
'<'		return '<';
'>'		return '>';
'@'		return '@';
';'		return ';';
'-'		return '-';

':='	return ':=';
'=>'	return '=>';
'||'	return '||';
'**'	return '**';
'<<'	return '<<';
'>>'	return '>>';
'..'	return '..';
'<>'	return '<>';
'!='	return '!=';
'~='	return '~=';
'^='	return '^=';
'<='	return '<=';
'>='	return '>=';

<<EOF>>		return 'EOF';
.			return 'UNKNOWN';

/lex

%start main

%%

main
	: ('SET' 'DEFINE' ('ON' | 'OFF'))? creations '/'? 'EOF'
	| plsql_block ';'? '/'? 'EOF'
	;

creations
	: create_procedure
	| create_function
	;

plsql_block
	: declare_label* ('DECLARE' declare_secion)? body
	;

declare_secion
	: item_list_1 item_list_2?
	| item_list_2
	;

item_list_1_subset
	: type_definition
	| item_declaration
	| function_declaration
	| procedure_declaration
	;

item_list_1
	: item_list_1_subset ( item_list_1_subset | pragma )*
	;

item_list_2_subset
	: function_declaration
	| function_definition
	| procedure_declaration
	| procedure_definition
	;

item_list_2
	: item_list_2_subset ( item_list_2_subset | pragma )*
	;

type_definition
	: record_type_definition
	| ref_cursor_type_definition
	| subtype_definition
	| collection_type_definition
	;

collection_type_definition
	: 'TYPE' identifier is ( table_type_def | varray_type_def ) ';'
	;

table_type_def
	: 'TABLE' 'OF' element_type not_null? ( 'INDEX' 'BY' type_regular )?
	;

collection_variable_dec
	: identifier element_type ';'
	;

varray_type_def
	: ( 'VARRAY' | 'VARYING' 'ARRAY' ) '(' expression ')' OF element_type not_null?
	;

subtype_definition
	: 'SUBTYPE' identifier is element_type ('RANGE' expression '..' expression )? not_null?
	;

element_type
	: identifier_plus ('%ROWTYPE' | '%TYPE')
	| 'REF'? identifier_plus
	| type_regular
	;

item_declaration
	: collection_variable_dec
	| constant_declaration
	| cursor_declaration
	| cursor_variable_declaration
	| exception_declaration
	| object_declaration
	| object_ref_declaration
	| record_type_declaration
	| variable_declaration
	;

variable_declaration
	: identifier element_type not_null? default_value? ';'
	;

pragma
	: autonomous_transaction_pragma
	| exception_init_pragma
	| inline_pragma
	| restrict_references_pragma
	| serially_resuable_pragma
	;

autonomous_transaction_pragma
	: 'PRAGMA' 'AUTONOMOUS_TRANSACTION' ';'
	;

body
	: 'BEGIN' statement ( statement | pragma )* ( 'EXCEPTION' exception_handler* )? 'END' identifier? ';'
	;

statement
	: declare_label* (
		assignment_statement |
		close_statement |
		continue_statement |
		execute_immediate_statement |
		exit_statement |
		fetch_statement |
		forall_statement |
		goto_statement |
		if_statement |
		basic_loop_statement |
		while_loop_statement |
		for_loop_statement |
		cursor_for_loop_statement |
		null_statement |
		open_statement |
		open_for_statement |
		plsql_block |
		raise_statement |
		return_statement |
		searched_case_statement |
		simple_case_statement |
		sql_statement )
	;

assignment_statement
	: ref_identifier ( '(' expression ')' )? ':=' expression ';'
	;

sql_statement
	: commit_statement
	| delete_statement
	| insert_statement
	| lock_table_statement
	| rollback_statement
	| savepoint_statement
	| select_statement
	| set_transaction_statement
	| update_statement
	;

commit_statement
	: 'COMMIT'
	;

close_statement
	: 'CLOSE' ref_identifier ';'
	;

searched_case_statement
	: identifier? 'CASE'
		('WHEN' boolean_expression 'THEN' statement)+
		('ELSE' statement+)?
		'END' 'CASE' identifier? ';'
	;

simple_case_statement
	: identifier? 'CASE' expression
		('WHEN' expression 'THEN' statement)+
		('ELSE' statement+)?
		'END' 'CASE' identifier? ';'
	;

collection_method_call
	: collection_name '.' (
		'COUNT' |
		'DELETE' ( expression (',' expression)* )? |
		'EXISTS' '(' expression ')' |
		'EXTEND' ( expression (',' expression)* )? |
		'FIRST' |
		'LAST' |
		'LIMIT' |
		'NEXT' '(' expression ')' |
		'PRIOR' '(' expression ')' |
		'TRIM' ( '(' expression ')' )? )
	;

constant_declaration
	: identifier 'CONSTANT' element_type not_null? default_value ';'
	;

continue_statement
	: 'CONTINUE' identifier? ('WHEN' expression)? ';'
	;

cursor_attribute
	: ref_identifier ( '%FOUND' | '%ISOPEN' | '%NOTFOUND' | '%ROWCOUNT' )
	;

ref_cursor_type_definition
	: 'TYPE' identifier is 'REF' 'CURSOR' ( 'RETURN' element_type )? ';'
	;

exception_init_pragma
	: 'PRAGMA' 'EXCEPTION_INIT' '(' identifier ',' expression ')' ';'
	;

exception_declaration
	: 'WHEN' ( (identifier ('OR' identifier)*) | 'OTHERS' ) 'THEN' statement+ ';'
	;

exception_handler
	: identifier 'EXCEPTION' ';'
	;

execute_immediate_statement
	: 'EXECUTE' 'IMMEDIATE' sql_statement (
		into_clause using_clause? |
		bulk_collect_into_clause using_clause? |
		using_clause dynamic_returning_clause? |
		dynamic_returning_clause )?
	;

into_clause
	: 'INTO' ref_identifier ( ',' ref_identifier )*
	;

bulk_collect_into_clause
	: 'BULK' 'COLLECT' 'INTO' ref_identifier ( ',' ref_identifier )*
	;

fetch_statement
	: 'FETCH' ref_identifier ( into_clause | ( bulk_collect_into_clause ( 'LIMIT' expression )? ) ) ';'
	;

forall_statement
	: 'FORALL' identifier 'IN' bounds_clause sql_statement ( 'SAVE' 'EXCEPTIONS' ) ';'
	;

bounds_clause
	: expression '..' expression
	| 'INDICES' 'OF' ref_identifier ( 'BETWEEN' expression 'AND' expression )?
	| 'VALUES' 'OF' ref_identifier
	;

using_clause
	: 'USING' in_out ref_identifier ( ',' in_out ref_identifier )*
	;

in_out
	: 'IN'
	| 'OUT'
	| 'INOUT'
	| 'IN' 'OUT'
	;

exit_statement
	: 'EXIT' identifier? ( 'WHEN' expression )? ';'
	;

cursor_declaration
	: 'CURSOR' identifier ( cursor_parameter_declaration ( ',' cursor_parameter_declaration )* )?
		( 'RETURN' element_type )? is select_statement ';'
	;

cursor_spec
	: 'CURSOR' identifier ( cursor_parameter_declaration ( ',' cursor_parameter_declaration )* )?
		'RETURN' element_type
	;

cursor_body
	: 'CURSOR' identifier ( cursor_parameter_declaration ( ',' cursor_parameter_declaration )* )?
		'RETURN' element_type is select_statement ';'
	;

cursor_parameter_declaration
	: identifier 'IN'? element_type default_value?

expression
	: or_expression
	;

or_expression
	: and_expression
	| or_expression 'OR' and_expression
	;

and_expression
	: rational_expression
	| and_expression 'AND' rational_expression
	;

rational_expression
	: additive_expression (
		( 'IS' 'NOT'? 'NULL' ) |
		'NOT'? (
			('LIKE' expression) |
			('BETWEEN' expression 'AND' expression) |
			('IN' '(' expression ( ',' expression)* ')' )
		)?
	| rational_expression ( '=' | '>' | '<' | '<>' | '!=' | '>=' | '<=' | '~=' | '^=' ) additive_expression
	| 'NOT' rational_expression
	;

additive_expression
	: string_contactive_expresion
	| numeric_additive_expression
	;

string_contactive_expresion
	: expression_basic
	: string_contactive_expresion '||' expression_basic
	;

additive_expression
	: multiplicative_expression
	| additive_expression ('+' | '-') multiplicative_expression
	;

multiplicative_expression
	: exponent_expression
	| multiplicative_expression ('*' | '/') exponent_expression
	;

exponent_expression
	: unary_expression
	| exponent_expression '**' unary_expression
	;

unary_expression
	: expression_element
	| ( '+' | '-' ) unary_expression
	;

expression_basic
	: ref_identifier
	| function_call
	| literal
	| case_expression
	| '(' expression ')'
	;

sql_cursor
	| sql ( '%FOUND' | '%ISOPEN' | '%NOTFOUND' | '%ROWCOUNT' |
		( '%BULK_ROWCOUNT' '(' expression ')' ) |
		( '%BULK_EXCEPTIONS' '(' expression ')' '.' ( 'ERROR_INDEX' | 'ERROR_CODE' ) ) )
	;

expression_element
	: ref_identifier ( '%FOUND' | '%ISOPEN' | '%NOTFOUND' | '%ROWCOUNT' )?
	| sql_cursor
	| expression_basic
	;

case_expression
	: 'CASE' expression?
		('WHEN' expression 'THEN' expression)+
		'ELSE' expression
		'END' 'CASE'
	;

function_declaration
	: function_heading ( 'DETERMINISTIC' | 'PIPELINED' | 'RESULT_CACHE' )* ';'
	;

function_heading
	: 'FUNCTION' identifier
		( '(' parameter_declaration ( ',' parameter_declaration )* ')' )?
		'RETURN' element_type
	;

result_cache_clause
	: 'RESULT_CACHE' ( 'RELIES_ON' '(' identifier_plus (',' identifier_plus)* ')' )?
	;

function_definition
	: function_heading ( 'DETERMINISTIC' | 'PIPELINED' | result_cache_clause )*
		is declare_secion? body
	;

label_declaration
	: '<<' identifier '>>'
	;

if_statement
	: 'IF' expression 'THEN' statement+
		( 'ELSIF' expression 'THEN' statement+ )*
		( 'ELSE' statement+ )?
		'END' 'IF' ';'
	;

inline_pragma
	: 'PRAGMA' 'INLINE' '(' identifier ',' 'string' ')' ';'
	;

goto_statement
	: 'GOTO' identifier ';'
	;

loop_statement_main
	: 'LOOP' statement+ 'END' 'LOOP' identifier?
	;

basic_loop_statement
	: label_declaration? loop_statement_main ';'
	;

while_loop_statement
	: label_declaration? 'WHILE' expression loop_statement_main ';'
	;

for_loop_statement
	: label_declaration? 'FOR' identifier 'IN' 'REVERSE'? expression '..' expression loop_statement_main ';'
	;

cursor_for_loop_statement
	: label_declaration? 'FOR' identifier 'IN' '(' select_statement ')' loop_statement_main ';'
	;

null_statement
	: 'NULL' ';'
	;

open_statement
	: 'OPEN' ref_identifier ( '(' expression ( ',' expression )* ')' )? ';'
	;

open_for_statement
	: 'OPEN' ref_identifier 'FOR' ( select_statement | expression ) using_clause? ';'
	;

parameter_declaration
	: identifier ( 'IN' | ( 'OUT' | 'IN' 'OUT' | 'INOUT' ) 'NOCOPY'? ) element_type default_value?
	;

procedure_declaration
	: procedure_heading
	;

procedure_heading
	: 'PROCEDURE' identifier ( '(' parameter_declaration ( ',' parameter_declaration )* ')' )?
	;

procedure_definition
	: procedure_heading is declare_secion? body
	;

raise_statement
	: 'RAISE' ref_identifier ';'
	;

record_type_definition
	: 'TYPE' identifier 'IS' 'RECORD' '(' record_field_declaration ( ',' record_field_declaration )* ')' ';'
	;

record_field_declaration
	: identifier element_type not_null? default_value?
	;

record_type_declaration
	: identifier element_type
	;

restrict_references_pragma
	: 'PRAGMA' 'RESTRICT' 'REFERENCES' '('
		( identifier | 'DEFAULT' ) ',' restrict_value (',' restrict_value)*
		')'
	;

restrict_value
	: ( 'RNDS' | 'WNDS' | 'RNPS' | 'WNPS' | 'TRUST' )
	;

return_statement
	: 'RETURN' expression ';'
	;

returning_clause
	: ( 'RETURN' | 'RETURNING' ) (
		( ( single_row_expresion ( ',' single_row_expresion )* )? into_clause ) |
		( ( multiple_row_expresion ( ',' multiple_row_expresion )* )? bulk_collect_into_clause ) )
	;

select_into_statement
	: SELECT ( DISTINCT | UNIQUE | ALL )? ( '*' | select_item ( ',' select_item )* )
		( BULK COLLECT )? INTO ref_identifier ( ',' ref_identifier )*
		FROM from_item ( ',' from_item )* rest ';'
	;

select_item
	: expression identifier?
	;

from_item
	: ( ref_identifier | 'THE'? '(' subquery ')' ) ( 'AS'? identifier )?
	;

serially_resuable_pragma
	: PRAGMA 'SERIALLY_RESUABLE' ';'
	;

compiler_parameters_clause
	: identifier '=' expression
	;

create_function
	: create_or_replace 'FUNCTION' identifier_plus
		( '(' parameter_declaration ( ',' parameter_declaration )* ')' )?
		'RETURN' element_type
		( invoker_rights_clause | 'DETERMINISTIC' | parallel_enable_clause | result_cache_clause )*
		(
			( 'AGGREGATE' | 'PIPELINED' ) USING identifier_plus |
			'PIPELINED'? is declare_secion? body
		)
	;

create_package
	: create_or_replace 'PACKAGE' identifier_plus invoker_rights_clause? is item_list_1 'END' identifier? ';'
	;

create_package_body
	: create_or_replace 'PACKAGE' 'BODY' identifier_plus
		is declare_secion? body? 'END' identifier? ';'
	;

create_procedure
	: create_or_replace 'PROCEDURE' identifier_plus
		( '(' parameter_declaration ( ',' parameter_declaration )* ')' )?
		invoker_rights_clause? is (
			declare_secion? body |
			'EXTERNAL'
		)
	;

parallel_enable_clause
	: '(' 'PARTITION' identifier 'BY' (
		'ANY' |
		( 'HASH' | 'RANGE' ) '(' column, ( ',' column )* ')'
		) ')'
		( 'ORDER' | 'CLUSTER' ) expression 'BY' '(' column, ( ',' column )* ')'
	;

type_regular
	: identifier ( '(' 'number' ('BYTE' | 'CHAR' | ',' 'number')? ')' )?
	;

invoker_rights_clause
	: 'AUTHID' ('CURRENT_USER' | identifier)
	;

default_value
	: (':=' | 'DEFAULT') expression
	;

create_or_replace	: 'CREATE' ( 'OR' 'REPLACE' )? ;

is	: ('IS' | 'AS') ;

not_null	: ('NOT' 'NULL') ;

identifier
	:	'identifier'
	|	'quoted_id'
	|	keyword
	|	semantic
	;

identifier_plus
	:	identifier (('.' | '@') identifier)*
	;

ref_identifier
	:	identifier_plus
	|	'bound_id'
	;

semantic
	:	'OFF'
	|	'CURRENT_USER'
	|	'INOUT'
	|	'REPLACE'
	;

literal
	:	'number'
	|	'string'
	|	'bool'
	;

keyword
	:	'A'
	|	'ADD'
	|	'AGENT'
	|	'AGGREGATE'
	|	'ARRAY'
	|	'ATTRIBUTE'
	|	'AUTHID'
	|	'AVG'
	|	'BFILE_BASE'
	|	'BINARY'
	|	'BLOB_BASE'
	|	'BLOCK'
	|	'BODY'
	|	'BOTH'
	|	'BOUND'
	|	'BULK'
	|	'BYTE'
	|	'C'
	|	'CALL'
	|	'CALLING'
	|	'CASCADE'
	|	'CHAR'
	|	'CHAR_BASE'
	|	'CHARACTER'
	|	'CHARSETFORM'
	|	'CHARSETID'
	|	'CHARSET'
	|	'CLOB_BASE'
	|	'CLOSE'
	|	'COLLECT'
	|	'COMMENT'
	|	'COMMIT'
	|	'COMMITTED'
	|	'COMPILED'
	|	'CONSTANT'
	|	'CONSTRUCTOR'
	|	'CONTEXT'
	|	'CONVERT'
	|	'COUNT'
	|	'CURSOR'
	|	'CUSTOMDATUM'
	|	'DANGLING'
	|	'DATA'
	|	'DATE'
	|	'DATE_BASE'
	|	'DAY'
	|	'DEFINE'
	|	'DETERMINISTIC'
	|	'DOUBLE'
	|	'DURATION'
	|	'ELEMENT'
	|	'ELSIF'
	|	'EMPTY'
	|	'ESCAPE'
	|	'EXCEPT'
	|	'EXCEPTIONS'
	|	'EXECUTE'
	|	'EXIT'
	|	'EXTERNAL'
	|	'FINAL'
	|	'FIXED'
	|	'FLOAT'
	|	'FORALL'
	|	'FORCE'
	|	'FUNCTION'
	|	'GENERAL'
	|	'HASH'
	|	'HEAP'
	|	'HIDDEN'
	|	'HOUR'
	|	'IMMEDIATE'
	|	'INCLUDING'
	|	'INDICATOR'
	|	'INDICES'
	|	'INFINITE'
	|	'INSTANTIABLE'
	|	'INT'
	|	'INTERFACE'
	|	'INTERVAL'
	|	'INVALIDATE'
	|	'ISOLATION'
	|	'JAVA'
	|	'LANGUAGE'
	|	'LARGE'
	|	'LEADING'
	|	'LENGTH'
	|	'LEVEL'
	|	'LIBRARY'
	|	'LIKE2'
	|	'LIKE4'
	|	'LIKEC'
	|	'LIMIT'
	|	'LIMITED'
	|	'LOCAL'
	|	'LONG'
	|	'LOOP'
	|	'MAP'
	|	'MAX'
	|	'MAXLEN'
	|	'MEMBER'
	|	'MERGE'
	|	'MIN'
	|	'MINUTE'
	|	'MOD'
	|	'MODIFY'
	|	'MONTH'
	|	'MULTISET'
	|	'NAME'
	|	'NAN'
	|	'NATIONAL'
	|	'NATIVE'
	|	'NCHAR'
	|	'NEW'
	|	'NOCOPY'
	|	'NUMBER_BASE'
	|	'OBJECT'
	|	'OCICOLL'
	|	'OCIDATETIME'
	|	'OCIDATE'
	|	'OCIDURATION'
	|	'OCIINTERVAL'
	|	'OCILOBLOCATOR'
	|	'OCINUMBER'
	|	'OCIRAW'
	|	'OCIREFCURSOR'
	|	'OCIREF'
	|	'OCIROWID'
	|	'OCISTRING'
	|	'OCITYPE'
	|	'ONLY'
	|	'OPAQUE'
	|	'OPEN'
	|	'OPERATOR'
	|	'ORACLE'
	|	'ORADATA'
	|	'ORGANIZATION'
	|	'ORLANY'
	|	'ORLVARY'
	|	'OTHERS'
	|	'OUT'
	|	'OVERRIDING'
	|	'PACKAGE'
	|	'PARALLEL_ENABLE'
	|	'PARAMETER'
	|	'PARAMETERS'
	|	'PARTITION'
	|	'PASCAL'
	|	'PIPE'
	|	'PIPELINED'
	|	'PRAGMA'
	|	'PRECISION'
	|	'PRIVATE'
	|	'RAISE'
	|	'RANGE'
	|	'RAW'
	|	'READ'
	|	'RECORD'
	|	'REF'
	|	'REFERENCE'
	|	'REM'
	|	'REMAINDER'
	|	'RENAME'
	|	'RESULT'
	|	'RETURN'
	|	'RETURNING'
	|	'REVERSE'
	|	'ROLLBACK'
	|	'ROW'
	|	'SAMPLE'
	|	'SAVE'
	|	'SAVEPOINT'
	|	'SB1'
	|	'SB2'
	|	'SB4'
	|	'SECOND'
	|	'SEGMENT'
	|	'SELF'
	|	'SEPARATE'
	|	'SEQUENCE'
	|	'SERIALIZABLE'
	|	'SET'
	|	'SHORT'
	|	'SIZE_T'
	|	'SOME'
	|	'SPARSE'
	|	'SQLCODE'
	|	'SQLDATA'
	|	'SQLNAME'
	|	'SQLSTATE'
	|	'STANDARD'
	|	'STATIC'
	|	'STDDEV'
	|	'STORED'
	|	'STRING'
	|	'STRUCT'
	|	'STYLE'
	|	'SUBMULTISET'
	|	'SUBPARTITION'
	|	'SUBSTITUTABLE'
	|	'SUBTYPE'
	|	'SUM'
	|	'SYNONYM'
	|	'TDO'
	|	'THE'
	|	'TIME'
	|	'TIMESTAMP'
	|	'TIMEZONE_ABBR'
	|	'TIMEZONE_HOUR'
	|	'TIMEZONE_MINUTE'
	|	'TIMEZONE_REGION'
	|	'TRAILING'
	|	'TRANSAC'
	|	'TRANSACTIONAL'
	|	'TRUSTED'
	|	'TYPE'
	|	'UB1'
	|	'UB2'
	|	'UB4'
	|	'UNDER'
	|	'UNSIGNED'
	|	'UNTRUSTED'
	|	'USE'
	|	'USING'
	|	'VALIST'
	|	'VALUE'
	|	'VARIABLE'
	|	'VARIANCE'
	|	'VARRAY'
	|	'VARYING'
	|	'VOID'
	|	'WHILE'
	|	'WORK'
	|	'WRAPPED'
	|	'WRITE'
	|	'YEAR'
	|	'ZONE'
	;

