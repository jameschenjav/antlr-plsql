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

'OFF'			return 'OFF';
'REPLACE'		return 'REPLACE';
'CURRENT_USER'	return 'REPLACE';

'+'		return '+';
'%'		return '%';
'''		return ''';
'.'		return '.';
'/'		return '/';
'('		return '(';
')'		return ')';
','		return ',';
'*'		return '*';
'"'		return '"';
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
'/*'	return '/*';
'*/'	return '*/';
'..'	return '..';
'<>'	return '<>';
'!='	return '!=';
'~='	return '~=';
'^='	return '^=';
'<='	return '<=';
'>='	return '>=';
'--'	return '--';

':'{BID_BEG}{ID_BODY}*	return 'bound_id';
{ID_BEG}{ID_BODY}*		return 'identifier';
'"'[^"]+'"'				return 'quoted_id';

[0-9]+'.'?{E}?FS?			return 'number';
[0-9]*'.'[0-9]+?{E}?FS?		return 'number';
"'"(''|[^'])*"'"	return 'string';
"q'!".*"!'"			return 'string';
"q'[".*"]'"			return 'string';
"q'{".*"}'"			return 'string';
"q'(".*")'"			return 'string';
"q'<".*">'"			return 'string';

'TRUE'		return 'bool';
'FALSE'		return 'bool';

<<EOF>>		return 'EOF';
.			return 'UNKNOWN';

/lex

%start main

%%

main
	: ('SET' 'DEFINE' ('ON' | 'OFF'))? main_structure ('/')? 'EOF'
	;

main_structure
	;

main_create_procedure
	: create_or_replace 'PROCEDURE' identifier parameters?
		invoker_rights_clause? 'IS'
		declaration?
	;

main_create_function
	: create_or_replace 'FUNCTION' identifier parameters? 'RETURN' simple_type
		invoker_rights_clause? 'IS'
		declaration?
	;

declaration
	: 'DECLARE'?
	;

simple_type
	: identifier ( '(' 'number' ('BYTE' | 'CHAR' | ',' 'number')? ')' )?
	;

invoker_rights_clause
    : 'AUTHID' ('CURRENT_USER' | identifier)
    ;

create_or_replace
	| 'CREATE' ('OR' 'REPLACE')?

identifier
	:	'identifier'
	|	'quoted_id'
	|	keyword
	|	semantic
	;

ref_identifier
	:	identifier
	|	'bound_id'
	;

semantic
	:	'OFF'
	|	'REPLACE'
	|	'CURRENT_USER'
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

