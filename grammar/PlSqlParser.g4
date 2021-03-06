/**
 * Oracle(c) PL/SQL 11g Parser
 *
 * Copyright (c) 2009-2011 Alexandre Porcelli <alexandre.porcelli@gmail.com>
 * Copyright (c) 2015-2017 Ivan Kochurkin (KvanTTT, kvanttt@gmail.com, Positive Technologies).
 * Copyright (c) 2017      Mark Adams <madams51703@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

parser grammar PlSqlParser;

options { tokenVocab=PlSqlLexer; }

javln
	: sql_plus_command? (main (SEMICOLON | sql_plus_command)?)+ EOF
	;

main
	: create_function_body
	| create_procedure_body
	| create_package
	| create_package_body
	| create_table
	| create_trigger
	| create_view
	| anonymouse_block
	;

// sql_script
//     : ((unit_statement | sql_plus_command) SEMICOLON?)* EOF
//     ;

// unit_statement
//     : transaction_control_statements
//     | alter_function
//     | alter_package
//     | alter_procedure
//     | alter_sequence
//     | alter_trigger
//     | alter_type
//     | alter_table
//     | alter_index
//     | alter_user

//     | create_function_body
//     | create_procedure_body
//     | create_package
//     | create_package_body

//     | create_index
//     | create_table
//     | create_tablespace
//     | create_view //TODO
// //  | create_directory //TODO
//     | create_materialized_view
//     | create_materialized_view_log
//     | create_user

//     | create_sequence
//     | create_trigger
//     | create_type
//     | create_synonym

//     | drop_function
//     | drop_package
//     | drop_procedure
//     | drop_sequence
//     | drop_trigger
//     | drop_type
//     | data_manipulation_language_statements
//     | drop_table
//     | drop_index

//     | comment_on_column
//     | comment_on_table

//     | anonymous_block

//     | grant_statement
//     ;

// DDL -> SQL Statements for Stored PL/SQL Units

// Function DDLs

drop_function
	: DROP FUNCTION regular_name ';'
	;

alter_function
	: ALTER FUNCTION regular_name COMPILE DEBUG? compiler_parameters_clause* (REUSE SETTINGS)? ';'
	;

create_function_body
	: CREATE (OR REPLACE)? FUNCTION regular_name parameters
	  RETURN type_spec (invoker_rights_clause | parallel_enable_clause | result_cache_clause | DETERMINISTIC)*
	  ((PIPELINED? (IS | AS) (DECLARE? seq_of_declare_specs? body | call_spec)) | (PIPELINED | AGGREGATE) USING regular_name) ';'
	;

// Creation Function - Specific Clauses

parallel_enable_clause
	: PARALLEL_ENABLE partition_by_clause?
	;

partition_by_clause
	: '(' PARTITION expression BY (ANY | (HASH | RANGE | LIST) paren_column_list) streaming_clause? ')'
	;

result_cache_clause
	: RESULT_CACHE relies_on_part?
	;

relies_on_part
	: RELIES_ON '(' tableview_name (',' tableview_name)* ')'
	;

streaming_clause
	: (ORDER | CLUSTER) expression BY paren_column_list
	;

// Package DDLs

drop_package
	: DROP PACKAGE BODY? (id_expression '.')? common_name ';'
	;

alter_package
	: ALTER PACKAGE common_name COMPILE DEBUG? (PACKAGE | BODY | SPECIFICATION)? compiler_parameters_clause* (REUSE SETTINGS)? ';'
	;

create_package
	: CREATE (OR REPLACE)? PACKAGE (id_expression '.')? common_name invoker_rights_clause? (IS | AS) package_obj_spec* END common_name? ';'
	;

create_package_body
	: CREATE (OR REPLACE)? PACKAGE BODY (id_expression '.')? common_name (IS | AS) package_obj_body* (BEGIN seq_of_statements)? END common_name? ';'
	;

// Create Package Specific Clauses

package_obj_spec
	: variable_declaration
	| subtype_declaration
	| cursor_declaration
	| exception_declaration
	| pragma_declaration
	| type_declaration
	| procedure_spec
	| function_spec
	;

procedure_spec
	: PROCEDURE common_name parameters ';'
	;

function_spec
	: FUNCTION common_name parameters
	  RETURN type_spec (DETERMINISTIC)? (RESULT_CACHE)? ';'
	;

package_obj_body
	: variable_declaration
	| subtype_declaration
	| cursor_declaration
	| exception_declaration
	| type_declaration
	| procedure_body
	| function_body
	| procedure_spec
	| function_spec
	;

// Procedure DDLs

drop_procedure
	: DROP PROCEDURE regular_name ';'
	;

alter_procedure
	: ALTER PROCEDURE regular_name COMPILE DEBUG? compiler_parameters_clause* (REUSE SETTINGS)? ';'
	;

function_body
	: FUNCTION common_name parameters
	  RETURN type_spec (invoker_rights_clause | parallel_enable_clause | result_cache_clause | DETERMINISTIC)*
	  ((PIPELINED? (IS | AS) (DECLARE? seq_of_declare_specs? body | call_spec)) | (PIPELINED | AGGREGATE) USING regular_name) ';'
	;

procedure_body
	: PROCEDURE common_name parameters (IS | AS)
	  (DECLARE? seq_of_declare_specs? body | call_spec | EXTERNAL) ';'
	;

create_procedure_body
	: CREATE (OR REPLACE)? PROCEDURE regular_name parameters
	  invoker_rights_clause? (IS | AS)
	  (DECLARE? seq_of_declare_specs? body | call_spec | EXTERNAL) ';'
	;

parameters
	: ('(' parameter (',' parameter)* ')')?
	;

// Trigger DDLs

drop_trigger
	: DROP TRIGGER regular_name ';'
	;

alter_trigger
	: ALTER TRIGGER alter_trigger_name=regular_name
	  ((ENABLE | DISABLE) | RENAME TO rename_trigger_name=regular_name | COMPILE DEBUG? compiler_parameters_clause* (REUSE SETTINGS)?) ';'
	;

create_trigger
	: CREATE ( OR REPLACE )? TRIGGER regular_name
	  (simple_dml_trigger | compound_dml_trigger | non_dml_trigger)
	  trigger_follows_clause? (ENABLE | DISABLE)? trigger_when_clause? trigger_body ';'
	;

trigger_follows_clause
	: FOLLOWS regular_name (',' regular_name)*
	;

trigger_when_clause
	: WHEN '(' expression ')'
	;

// Create Trigger Specific Clauses

simple_dml_trigger
	: (BEFORE | AFTER | INSTEAD OF) dml_event_clause referencing_clause? for_each_row?
	;

for_each_row
	: FOR EACH ROW
	;

compound_dml_trigger
	: FOR dml_event_clause referencing_clause?
	;

non_dml_trigger
	: (BEFORE | AFTER) non_dml_event (OR non_dml_event)* ON (DATABASE | (common_name '.')? SCHEMA)
	;

trigger_body
	: COMPOUND TRIGGER
	| CALL identifier
	| DECLARE? trigger_block
	;

routine_clause
	: routine_name function_argument?
	;

compound_trigger_block
	: COMPOUND TRIGGER seq_of_declare_specs? timing_point_section+ END regular_name
	;

timing_point_section
	: bk=BEFORE STATEMENT IS trigger_block BEFORE STATEMENT ';'
	| bk=BEFORE EACH ROW IS trigger_block BEFORE EACH ROW ';'
	| ak=AFTER STATEMENT IS trigger_block AFTER STATEMENT ';'
	| ak=AFTER EACH ROW IS trigger_block AFTER EACH ROW ';'
	;

non_dml_event
	: ALTER
	| ANALYZE
	| ASSOCIATE STATISTICS
	| AUDIT
	| COMMENT
	| CREATE
	| DISASSOCIATE STATISTICS
	| DROP
	| GRANT
	| NOAUDIT
	| RENAME
	| REVOKE
	| TRUNCATE
	| DDL
	| STARTUP
	| SHUTDOWN
	| DB_ROLE_CHANGE
	| LOGON
	| LOGOFF
	| SERVERERROR
	| SUSPEND
	| DATABASE
	| SCHEMA
	| FOLLOWS
	;

dml_event_clause
	: dml_event_element (OR dml_event_element)* ON dml_event_nested_clause? tableview_name
	;

dml_event_element
	: (DELETE | INSERT | UPDATE) (OF column_list)?
	;

dml_event_nested_clause
	: NESTED TABLE tableview_name OF
	;

referencing_clause
	: REFERENCING referencing_element+
	;

referencing_element
	: (NEW | OLD | PARENT) column_alias
	;

// DDLs

drop_type
	: DROP TYPE BODY? id_expr_name (FORCE | VALIDATE)? ';'
	;

alter_type
	: ALTER TYPE id_expr_name
	(compile_type_clause
	| replace_type_clause
	//TODO | {input.LT(2).getText().equalsIgnoreCase("attribute")}? alter_attribute_definition
	| alter_method_spec
	| alter_collection_clauses
	| modifier_clause
	) dependent_handling_clause? ';'
	;

// Alter Type Specific Clauses

compile_type_clause
	: COMPILE DEBUG? (SPECIFICATION | BODY)? compiler_parameters_clause* (REUSE SETTINGS)?
	;

replace_type_clause
	: REPLACE invoker_rights_clause? AS OBJECT '(' object_member_spec (',' object_member_spec)* ')'
	;

alter_method_spec
	: alter_method_element (',' alter_method_element)*
	;

alter_method_element
	: (ADD | DROP) (map_order_function_spec | subprogram_spec)
	;

alter_attribute_definition
	: (ADD | MODIFY | DROP) ATTRIBUTE (attribute_definition | '(' attribute_definition (',' attribute_definition)* ')')
	;

attribute_definition
	: common_name type_spec?
	;

alter_collection_clauses
	: MODIFY (LIMIT expression | ELEMENT TYPE type_spec)
	;

dependent_handling_clause
	: INVALIDATE
	| CASCADE (CONVERT TO SUBSTITUTABLE | NOT? INCLUDING TABLE DATA)? dependent_exceptions_part?
	;

dependent_exceptions_part
	: FORCE? EXCEPTIONS INTO tableview_name
	;

create_type
	: CREATE (OR REPLACE)? TYPE (type_definition | type_body) ';'
	;

// Create Type Specific Clauses

type_definition
	: id_expr_name (OID CHAR_STRING)? object_type_def?
	;

object_type_def
	: invoker_rights_clause? (object_as_part | object_under_part) sqlj_object_type?
	  ('(' object_member_spec (',' object_member_spec)* ')')? modifier_clause*
	;

object_as_part
	: (IS | AS) (OBJECT | varray_type_def | nested_table_type_def)
	;

object_under_part
	: UNDER type_spec
	;

nested_table_type_def
	: TABLE OF type_spec (NOT NULL)?
	;

sqlj_object_type
	: EXTERNAL NAME expression LANGUAGE JAVA USING (SQLDATA | CUSTOMDATUM | ORADATA)
	;

type_body
	: BODY id_expr_name (IS | AS) (type_body_elements)+ END
	;

type_body_elements
	: map_order_func_declaration
	| subprog_decl_in_type
	;

map_order_func_declaration
	: (MAP | ORDER) MEMBER func_decl_in_type
	;

subprog_decl_in_type
	: (MEMBER | STATIC) (proc_decl_in_type | func_decl_in_type | constructor_declaration)
	;

proc_decl_in_type
	: PROCEDURE regular_name '(' type_elements_parameter (',' type_elements_parameter)* ')'
	  (IS | AS) (call_spec | DECLARE? seq_of_declare_specs? body ';')
	;

func_decl_in_type
	: FUNCTION regular_name ('(' type_elements_parameter (',' type_elements_parameter)* ')')?
	  RETURN type_spec (IS | AS) (call_spec | DECLARE? seq_of_declare_specs? body ';')
	;

constructor_declaration
	: FINAL? INSTANTIABLE? CONSTRUCTOR FUNCTION type_spec
	  ('(' (SELF IN OUT type_spec ',') type_elements_parameter (',' type_elements_parameter)*  ')')?
	  RETURN SELF AS RESULT (IS | AS) (call_spec | DECLARE? seq_of_declare_specs? body ';')
	;

// Common Type Clauses

modifier_clause
	: NOT? (INSTANTIABLE | FINAL | OVERRIDING)
	;

object_member_spec
	: identifier type_spec sqlj_object_type_attr?
	| element_spec
	;

sqlj_object_type_attr
	: EXTERNAL NAME expression
	;

element_spec
	: modifier_clause? element_spec_options+ (',' pragma_clause)?
	;

element_spec_options
	: subprogram_spec
	| constructor_spec
	| map_order_function_spec
	;

subprogram_spec
	: (MEMBER | STATIC) (type_procedure_spec | type_function_spec)
	;

type_procedure_spec
	: PROCEDURE regular_name '(' type_elements_parameter (',' type_elements_parameter)* ')' ((IS | AS) call_spec)?
	;

type_function_spec
	: FUNCTION regular_name ('(' type_elements_parameter (',' type_elements_parameter)* ')')?
	  RETURN (type_spec | SELF AS RESULT) ((IS | AS) call_spec | EXTERNAL VARIABLE? NAME expression)?
	;

constructor_spec
	: FINAL? INSTANTIABLE? CONSTRUCTOR FUNCTION
	  type_spec ('(' (SELF IN OUT type_spec ',') type_elements_parameter (',' type_elements_parameter)*  ')')?
	  RETURN SELF AS RESULT ((IS | AS) call_spec)?
	;

map_order_function_spec
	: (MAP | ORDER) MEMBER type_function_spec
	;

pragma_clause
	: PRAGMA RESTRICT_REFERENCES '(' pragma_elements (',' pragma_elements)* ')'
	;

pragma_elements
	: identifier
	| DEFAULT
	;

type_elements_parameter
	: common_name type_spec
	;

// Sequence DDLs

drop_sequence
	: DROP SEQUENCE id_expr_name ';'
	;

alter_sequence
	: ALTER SEQUENCE id_expr_name sequence_spec+ ';'
	;

create_sequence
	: CREATE SEQUENCE id_expr_name (sequence_start_clause | sequence_spec)* ';'
	;

// Common Sequence

sequence_spec
	: INCREMENT BY UNSIGNED_INTEGER
	| MAXVALUE UNSIGNED_INTEGER
	| NOMAXVALUE
	| MINVALUE UNSIGNED_INTEGER
	| NOMINVALUE
	| CYCLE
	| NOCYCLE
	| CACHE UNSIGNED_INTEGER
	| NOCACHE
	| ORDER
	| NOORDER
	;

sequence_start_clause
	: START WITH UNSIGNED_INTEGER
	;

create_index
	: CREATE UNIQUE? INDEX regular_name ON tableview_name paren_column_list (TABLESPACE id_expression)? (COMPUTE STATISTICS)? ';'
	;

alter_index
	: ALTER INDEX old_index_name=regular_name RENAME TO new_index_name=regular_name ';'
	;

create_user
	: CREATE USER
	  id_expression
		( identified_by
		  | identified_other_clause
		  | user_tablespace_clause
		  | quota_clause
		  | profile_clause
		  | password_expire_clause
		  | user_lock_clause
		  | user_editions_clause
		  | container_clause
		)+ ';'
	;

// The standard clauses only permit one user per statement.
// The proxy clause allows multiple users for a proxy designation.
alter_user
	: ALTER USER
	  id_expression
		( alter_identified_by
		| identified_other_clause
		| user_tablespace_clause
		| quota_clause
		| profile_clause
		| user_default_role_clause
		| password_expire_clause
		| user_lock_clause
		| alter_user_editions_clause
		| container_clause
		| container_data_clause
		)+
	  ';'
	  | (','? id_expression)+ proxy_clause ';'
	;

alter_identified_by
	: identified_by (REPLACE id_expression)?
	;

identified_by
	: IDENTIFIED BY id_expression
	;

identified_other_clause
	: IDENTIFIED (EXTERNALLY | GLOBALLY) (AS quoted_string)?
	;

user_tablespace_clause
	: (DEFAULT | TEMPORARY) TABLESPACE id_expression
	;

quota_clause
	: QUOTA (size_clause | UNLIMITED) ON id_expression
	;

profile_clause
	: PROFILE id_expression
	;

role_clause
	: (','? role_name)+
	| ALL (EXCEPT (','? role_name)+)*
	;

user_default_role_clause
	: DEFAULT ROLE (NONE | role_clause)
	;

password_expire_clause
	: PASSWORD EXPIRE
	;

user_lock_clause
	: ACCOUNT (LOCK | UNLOCK)
	;

user_editions_clause
	: ENABLE EDITIONS
	;

alter_user_editions_clause
	: user_editions_clause (FOR (','? regular_id)+)? FORCE?
	;

proxy_clause
	: REVOKE CONNECT THROUGH (ENTERPRISE USERS | id_expression)
	| GRANT CONNECT THROUGH
		( ENTERPRISE USERS
		| id_expression
			(WITH (NO ROLES | ROLE role_clause))?
			(AUTHENTICATION REQUIRED)?
			(AUTHENTICATED USING (PASSWORD | CERTIFICATE | DISTINGUISHED NAME))?
	   )
	;

container_names
	: LEFT_PAREN (','? id_expression)+ RIGHT_PAREN
	;

set_container_data
	: SET CONTAINER_DATA EQUALS_OP (ALL | DEFAULT | container_names)
	;

add_rem_container_data
	: (ADD | REMOVE) CONTAINER_DATA EQUALS_OP container_names
	;

container_data_clause
	: set_container_data
	| add_rem_container_data (FOR regular_name)?
	;

drop_index
	: DROP INDEX regular_name ';'
	;

grant_statement
	: GRANT
		( ','?
		  (role_name
		  | system_privilege
		  | object_privilege paren_column_list?
		  )
		)+
	  (ON grant_object_name)?
	  TO (','? grantee_name | PUBLIC)+
	  (WITH (ADMIN | DELEGATE) OPTION)?
	  (WITH HIERARCHY OPTION)?
	  (WITH GRANT OPTION)?
	  container_clause? ';'
	;

container_clause
	: CONTAINER EQUALS_OP (CURRENT | ALL)
	;

create_view
	: CREATE (OR REPLACE)? (OR? FORCE)? EDITIONING? VIEW
	  tableview_name view_options?
	  AS subquery order_by_clause? subquery_restriction_clause?
	;

view_options
	: ( view_alias_constraint
	  | object_view_clause
//      | xmltype_view_clause //TODO
	  )
	;

view_alias_constraint
	: '(' ( ','? (table_alias inline_constraint* | out_of_line_constraint) )+ ')'
	;

object_view_clause
	: OF id_expr_name
	   ( WITH OBJECT (IDENTIFIER|ID|OID) ( DEFAULT | '(' (','? REGULAR_ID)+ ')' )
	   | UNDER tableview_name
	   )
	   ( '(' ( ','? (out_of_line_constraint | REGULAR_ID inline_constraint ) )+ ')' )*
	;

inline_constraint
	: (CONSTRAINT constraint_name)?
		( NOT? NULL
		| UNIQUE
		| PRIMARY KEY
		| references_clause
		| check_constraint
		)
	  constraint_state?
	;

out_of_line_constraint
	: ( (CONSTRAINT constraint_name)?
		  ( primary_key_clause
		  | foreign_key_clause
		  | unique_key_clause
		  | check_constraint
		  )
	   )+
	  constraint_state?
	;

constraint_state
	: ( NOT? DEFERRABLE
	  | INITIALLY (IMMEDIATE|DEFERRED)
	  | (RELY|NORELY)
	  | (ENABLE|DISABLE)
	  | (VALIDATE|NOVALIDATE)
	  )+
	;

create_tablespace
	: CREATE (BIGFILE | SMALLFILE)?
		( permanent_tablespace_clause
		| temporary_tablespace_clause
		| undo_tablespace_clause
		)
	  ';'
	;

permanent_tablespace_clause
	: TABLESPACE id_expression datafile_specification?
		( MINIMUM EXTENT size_clause
		| BLOCKSIZE size_clause
		| logging_clause
		| FORCE LOGGING
		| (ONLINE | OFFLINE)
		| ENCRYPTION tablespace_encryption_spec
		| DEFAULT //TODO table_compression? storage_clause?
		| extent_management_clause
		| segment_management_clause
		| flashback_mode_clause
		)*
	;

tablespace_encryption_spec
	: USING encrypt_algorithm=CHAR_STRING
	;

logging_clause
	: LOGGING
	 | NOLOGGING
	 | FILESYSTEM_LIKE_LOGGING
	;

extent_management_clause
	: EXTENT MANAGEMENT LOCAL
		( AUTOALLOCATE
		| UNIFORM (SIZE size_clause)?
		)?
	;

segment_management_clause
	: SEGMENT SPACE_KEYWORD MANAGEMENT (AUTO | MANUAL)
	;

flashback_mode_clause
	: FLASHBACK (ON | OFF)
	;

temporary_tablespace_clause
	: TEMPORARY TABLESPACE tablespace_name=id_expression
		tempfile_specification?
		tablespace_group_clause? extent_management_clause?
	;

tablespace_group_clause
	: TABLESPACE GROUP (REGULAR_ID | CHAR_STRING)
	;

undo_tablespace_clause
	: UNDO TABLESPACE tablespace_name=id_expression
		datafile_specification?
		extent_management_clause? tablespace_retention_clause?
	;

tablespace_retention_clause
	: RETENTION (GUARANTEE | NOGUARANTEE)
	;

datafile_specification
	: DATAFILE
	  (','? datafile_tempfile_spec)
	;

tempfile_specification
	: TEMPFILE
	  (','? datafile_tempfile_spec)
	;

datafile_tempfile_spec
	: CHAR_STRING? (SIZE size_clause)? REUSE? autoextend_clause?
	;

redo_log_file_spec
	: DATAFILE ( CHAR_STRING
	  | '(' ( ','? CHAR_STRING )+ ')'
	  )?
		(SIZE size_clause)?
		(BLOCKSIZE size_clause)?
		REUSE?
	;

autoextend_clause
	: AUTOEXTEND (OFF | ON (NEXT size_clause)? maxsize_clause? )
	;

maxsize_clause
	: MAXSIZE (UNLIMITED | size_clause)
	;

build_clause
	: BUILD (IMMEDIATE | DEFERRED)
	;

parallel_clause
	: NOPARALLEL
	| PARALLEL parallel_count=UNSIGNED_INTEGER

	;

create_materialized_view_log
	: CREATE MATERIALIZED VIEW LOG ON tableview_name
		( ( physical_attributes_clause
		  | TABLESPACE tablespace_name=id_expression
		  | logging_clause
		  | (CACHE | NOCACHE)
		  )+
		 )?
		parallel_clause?
		// table_partitioning_clauses TODO
		( WITH
		   ( ','?
			 ( OBJECT ID
			 | PRIMARY KEY
			 | ROWID
			 | SEQUENCE
			 | COMMIT SCN
			 )
		   )*
		   ('(' ( ','? regular_id )+ ')' new_values_clause? )?
		   mv_log_purge_clause?
		)*
	;

new_values_clause
	: (INCLUDING | EXCLUDING ) NEW VALUES
	;

mv_log_purge_clause
	: PURGE
		 ( IMMEDIATE (SYNCHRONOUS | ASYNCHRONOUS)?
	  // |START WITH CLAUSES TODO
		 )
	;

create_materialized_view
	: CREATE MATERIALIZED VIEW tableview_name
	  (OF id_expr_name )?
//scoped_table_ref and column alias goes here  TODO
		( ON PREBUILT TABLE ( (WITH | WITHOUT) REDUCED PRECISION)?
		| physical_properties?  (CACHE | NOCACHE)? parallel_clause? build_clause?
		)
		( USING INDEX ( (physical_attributes_clause | TABLESPACE mv_tablespace=id_expression)+ )*
		| USING NO INDEX
		)?
		create_mv_refresh?
		(FOR UPDATE)?
		( (DISABLE | ENABLE) QUERY REWRITE )?
		AS subquery order_by_clause?
		';'
	;

create_mv_refresh
	: ( NEVER REFRESH
	  | REFRESH
		 ( (FAST | COMPLETE | FORCE)
		 | ON (DEMAND | COMMIT)
		 | (START WITH | NEXT) //date goes here TODO
		 | WITH (PRIMARY KEY | ROWID)
		 | USING
			 ( DEFAULT (MASTER | LOCAL)? ROLLBACK SEGMENT
			 | (MASTER | LOCAL)? ROLLBACK SEGMENT rb_segment=REGULAR_ID
			 )
		 | USING (ENFORCED | TRUSTED) CONSTRAINTS
		 )+
	  )
	;

create_table
	: CREATE (GLOBAL TEMPORARY)? TABLE tableview_name
		( '(' (','? datatype_null_enable)+
		(',' (CONSTRAINT constraint_name)?
		  ( primary_key_clause
		  | foreign_key_clause
		  | unique_key_clause
		  | check_constraint
		  )
		)*
		')' )?
		(ON COMMIT (DELETE | PRESERVE) ROWS)?
		physical_properties?
		table_compression?
// Column_properties clause goes here
// Partition clause goes here
		 table_range_partition_by_clause?
// Many more varations to capture
	   row_movement_clause?
	   flashback_archive_clause?

	  (AS subquery)?

	  ';'
	;

table_range_partition_by_clause
	: PARTITION BY RANGE
		paren_column_list
		  (INTERVAL '(' expression ')'
			  (STORE IN '('
						(','? tablespace_name=REGULAR_ID )+
						')'
			  )?
		  )?
		'('
			(COMMA? PARTITION partition_name=REGULAR_ID
				 VALUES LESS THAN
// Supposed to be literal in here, will need to refine this
					 '('
						(','? CHAR_STRING
						| ','? standard_function
						| ','? numeric
						| ','? MAXVALUE
						)+
					 ')'
				(TABLESPACE partition_tablespace=id_expression)?

				(ON COMMIT (DELETE | PRESERVE) ROWS)?
				deferred_segment_creation?
				physical_attributes_clause?
			)+
		')'
	;

datatype_null_enable
	: id_name datatype
		 SORT?  (DEFAULT expression)? (ENCRYPT ( USING  CHAR_STRING )? (IDENTIFIED BY REGULAR_ID)? CHAR_STRING? ( NO? SALT )? )?
		 (NOT NULL)? (ENABLE | DISABLE)?
	;

//Technically, this should only allow 'K' | 'M' | 'G' | 'T' | 'P' | 'E'
// but having issues with examples/numbers01.sql line 11 "sysdate -1m"
size_clause
	: UNSIGNED_INTEGER REGULAR_ID?
	;


table_compression
	: COMPRESS
		( BASIC
		| FOR ( OLTP
			  | (QUERY | ARCHIVE) (LOW | HIGH)?
			  )
		)?
	  | NOCOMPRESS
	;

physical_attributes_clause
	: (PCTFREE pctfree=UNSIGNED_INTEGER
		| PCTUSED pctused=UNSIGNED_INTEGER
		| INITRANS inittrans=UNSIGNED_INTEGER
		| storage_clause
		)+
	;

storage_clause
	: STORAGE '('
		 (INITIAL initial_size=size_clause
		 | NEXT next_size=size_clause
		 | MINEXTENTS minextents=(UNSIGNED_INTEGER | UNLIMITED)
		 | PCTINCREASE pctincrease=UNSIGNED_INTEGER
		 | FREELISTS freelists=UNSIGNED_INTEGER
		 | FREELIST GROUPS freelist_groups=UNSIGNED_INTEGER
		 | OPTIMAL (size_clause | NULL )
		 | BUFFER_POOL (KEEP | RECYCLE | DEFAULT)
		 | FLASH_CACHE (KEEP | NONE | DEFAULT)
		 | ENCRYPT
		 )+
	   ')'
	;

deferred_segment_creation
	: SEGMENT CREATION (IMMEDIATE | DEFERRED)
	;

segment_attributes_clause
	: ( physical_attributes_clause
	  | TABLESPACE tablespace_name=id_expression
	  | logging_clause
	  )+
	;

physical_properties
	: deferred_segment_creation?  segment_attributes_clause table_compression?
	;

row_movement_clause
	: (ENABLE | DISABLE)? ROW MOVEMENT
	;

flashback_archive_clause
	: ( FLASHBACK ARCHIVE flashback_archive=REGULAR_ID
	  | NO FLASHBACK ARCHIVE
	  )
	;

drop_table
	: DROP TABLE tableview_name SEMICOLON
	;

comment_on_column
	: COMMENT ON COLUMN tableview_name PERIOD id_name IS quoted_string
	;

// Synonym DDL Clauses

create_synonym
	// Synonym's schema cannot be specified for public synonyms
	: CREATE (OR REPLACE)? PUBLIC SYNONYM common_name FOR (common_name PERIOD)? id_expression (AT_SIGN common_name)?
	| CREATE (OR REPLACE)? SYNONYM (common_name PERIOD)? common_name FOR (common_name PERIOD)? id_expression (AT_SIGN common_name)?
	;

comment_on_table
	: COMMENT ON TABLE tableview_name IS quoted_string
	;

alter_table
	: ALTER TABLE tableview_name
	  ( add_constraint
	  | drop_constraint
	  | enable_constraint
	  | disable_constraint
	  )
	;

add_constraint
	: ADD (CONSTRAINT constraint_name)?
	 ( primary_key_clause
	 | foreign_key_clause
	 | unique_key_clause
	 | check_constraint
	 )
	;

check_constraint
	: CHECK '(' expression ')' DISABLE?
	;

drop_constraint
	: DROP CONSTRAINT constraint_name
	;

enable_constraint
	: ENABLE CONSTRAINT constraint_name
	;

disable_constraint
	: DISABLE CONSTRAINT constraint_name
	;

foreign_key_clause
	: FOREIGN KEY paren_column_list references_clause on_delete_clause?
	;

references_clause
	: REFERENCES tableview_name paren_column_list
	;

on_delete_clause
	: ON DELETE (CASCADE | SET NULL)
	;

unique_key_clause
	: UNIQUE paren_column_list
	  // TODO implement  USING INDEX clause
	;

primary_key_clause
	: PRIMARY KEY paren_column_list
	  // TODO implement  USING INDEX clause
	;

// Anonymous PL/SQL code block

anonymous_block
	: (DECLARE seq_of_declare_specs)? BEGIN seq_of_statements exceptions? END SEMICOLON
	;

// Common DDL Clauses

invoker_rights_clause
	: AUTHID (CURRENT_USER | DEFINER)
	;

compiler_parameters_clause
	: identifier '=' expression
	;

call_spec
	: LANGUAGE (java_spec | c_spec)
	;

// Call Spec Specific Clauses

java_spec
	: JAVA NAME CHAR_STRING
	;

c_spec
	: C_LETTER (NAME CHAR_STRING)? LIBRARY identifier c_agent_in_clause? (WITH CONTEXT)? c_parameters_clause?
	;

c_agent_in_clause
	: AGENT IN '(' argument_list ')'
	;

c_parameters_clause
	: PARAMETERS '(' (argument_list | '.' '.' '.') ')'
	;

parameter
	: common_name parameter_desc type_spec? default_value_part?
	;

parameter_desc
	: (IN | OUT | INOUT | NOCOPY)*
	;

default_value_part
	: (ASSIGN_OP | DEFAULT) expression
	;

// Elements Declarations

seq_of_declare_specs
	: declare_spec+
	;

declare_spec
	: variable_declaration
	| subtype_declaration
	| cursor_declaration
	| exception_declaration
	| pragma_declaration
	| type_declaration
	| procedure_spec
	| function_spec
	| procedure_body
	| function_body
	;

// incorporates constant_declaration
variable_declaration
	: identifier CONSTANT? type_spec (NOT NULL)? default_value_part? ';'
	;

subtype_declaration
	: SUBTYPE identifier IS type_spec (RANGE expression '..' expression)? (NOT NULL)? ';'
	;

// cursor_declaration incorportates curscursor_body and cursor_spec

cursor_declaration
	: CURSOR identifier ('(' (','? parameter_spec)+ ')' )? (RETURN type_spec)? (IS select_statement)? ';'
	;

parameter_spec
	: common_name (IN? type_spec)? default_value_part?
	;

exception_declaration
	: identifier EXCEPTION ';'
	;

pragma_declaration
	: PRAGMA (SERIALLY_REUSABLE
	| AUTONOMOUS_TRANSACTION
	| EXCEPTION_INIT '(' id_name ',' numeric_negative ')'
	| INLINE '(' id1=identifier ',' expression ')'
	| RESTRICT_REFERENCES '(' (identifier | DEFAULT) (',' identifier)+ ')') ';'
	;

// Record Declaration Specific Clauses

// incorporates ref_cursor_type_definition

record_type_def
	: RECORD '(' (','? field_spec)+ ')'
	;

field_spec
	: id_name type_spec? (NOT NULL)? default_value_part?
	;

ref_cursor_type_def
	: REF CURSOR (RETURN type_spec)?
	;

type_declaration
	: TYPE identifier IS (table_type_def | varray_type_def | record_type_def | ref_cursor_type_def) ';'
	;

table_type_def
	: TABLE OF type_spec table_indexed_by_part? (NOT NULL)?
	;

table_indexed_by_part
	: (idx1=INDEXED | idx2=INDEX) BY type_spec
	;

varray_type_def
	: (VARRAY | VARYING ARRAY) '(' expression ')' OF type_spec (NOT NULL)?
	;

// Statements

seq_of_statements
	: (statement (';' | EOF) | label_declaration)+
	;

label_declaration
	: ltp1= '<' '<' id_expression '>' '>'
	;

statement
	: CREATE swallow_to_semi
	| TRUNCATE swallow_to_semi
	| body
	| block
	| assignment_statement
	| continue_statement
	| exit_statement
	| goto_statement
	| if_statement
	| loop_statement
	| forall_statement
	| null_statement
	| raise_statement
	| return_statement
	| case_statement/*[true]*/
	| sql_statement
	| function_call
	| pipe_row_statement
	;

swallow_to_semi
	: ~';'+
	;

assignment_statement
	: (general_element | bind_variable) ASSIGN_OP expression
	;

continue_statement
	: CONTINUE id_expression? (WHEN expression)?
	;

exit_statement
	: EXIT id_expression? (WHEN expression)?
	;

goto_statement
	: GOTO id_expression
	;

if_statement
	: IF expression THEN seq_of_statements elsif_part* else_part? END IF
	;

elsif_part
	: ELSIF expression THEN seq_of_statements
	;

else_part
	: ELSE seq_of_statements
	;

loop_statement
	: label_declaration? (WHILE expression | FOR cursor_loop_param)? LOOP seq_of_statements END LOOP id_expression?
	;

// Loop Specific Clause

cursor_loop_param
	: regular_name IN REVERSE? lower_bound range_separator='..' upper_bound
	| record_name IN (cursor_name ('(' argument_list? ')')? | '(' select_statement ')')
	;

forall_statement
	: FORALL regular_name IN bounds_clause sql_statement (SAVE EXCEPTIONS)?
	;

bounds_clause
	: lower_bound '..' upper_bound
	| INDICES OF regular_name between_bound?
	| VALUES OF regular_name
	;

between_bound
	: BETWEEN lower_bound AND upper_bound
	;

lower_bound
	: concatenation
	;

upper_bound
	: concatenation
	;

null_statement
	: NULL
	;

raise_statement
	: RAISE id_name?
	;

return_statement
	: RETURN expression?
	;

function_call
	: CALL? routine_name function_argument?
	;

pipe_row_statement
	: PIPE ROW '(' expression ')';

body
	: BEGIN seq_of_statements exceptions? END id_expression?
	;

exceptions
	: EXCEPTION exception_handler+
	;

// Body Specific Clause

exception_handler
	: WHEN id_name (OR id_name)* THEN seq_of_statements
	;

trigger_block
	: (DECLARE? seq_of_declare_specs)? body
	;

anonymouse_block
	: (DECLARE? seq_of_declare_specs)? body
	;

block
	: DECLARE seq_of_declare_specs body
	;

// SQL Statements

sql_statement
	: execute_immediate
	| data_manipulation_language_statements
	| cursor_manipulation_statements
	| transaction_control_statements
	;

execute_immediate
	: EXECUTE IMMEDIATE expression (into_clause using_clause? | using_clause dynamic_returning_clause? | dynamic_returning_clause)?
	;

// Execute Immediate Specific Clause

dynamic_returning_clause
	: (RETURNING | RETURN) into_clause
	;

// DML Statements

data_manipulation_language_statements
	: merge_statement
	| lock_table_statement
	| select_statement
	| update_statement
	| delete_statement
	| insert_statement
	| explain_statement
	;

// Cursor Manipulation Statements

cursor_manipulation_statements
	: close_statement
	| open_statement
	| fetch_statement
	| open_for_statement
	;

close_statement
	: CLOSE cursor_name
	;

open_statement
	: OPEN cursor_name ('(' argument_list ')')?
	;

fetch_statement
	: FETCH cursor_name (it1=INTO (','? variable_name)+ | BULK COLLECT INTO (','? variable_name)+)
	;

open_for_statement
	: OPEN variable_name FOR (select_statement | expression) using_clause?
	;

// Transaction Control SQL Statements

transaction_control_statements
	: set_transaction_command
	| set_constraint_command
	| commit_statement
	| rollback_statement
	| savepoint_statement
	;

set_transaction_command
	: SET TRANSACTION
	  (READ (ONLY | WRITE) | ISOLATION LEVEL (SERIALIZABLE | READ COMMITTED) | USE ROLLBACK SEGMENT common_name)?
	  (NAME quoted_string)?
	;

set_constraint_command
	: SET (CONSTRAINT | CONSTRAINTS) (ALL | (','? constraint_name)+) (IMMEDIATE | DEFERRED)
	;

commit_statement
	: COMMIT WORK?
	  (COMMENT expression | FORCE (CORRUPT_XID expression | CORRUPT_XID_ALL | expression (',' expression)?))?
	  write_clause?
	;

write_clause
	: WRITE (WAIT | NOWAIT)? (IMMEDIATE | BATCH)?
	;

rollback_statement
	: ROLLBACK WORK? (TO SAVEPOINT? common_name | FORCE quoted_string)?
	;

savepoint_statement
	: SAVEPOINT common_name
	;

// Dml

/* TODO
//SHOULD BE OVERRIDEN!
compilation_unit
	: seq_of_statements* EOF
	;

//SHOULD BE OVERRIDEN!
seq_of_statements
	: select_statement
	| update_statement
	| delete_statement
	| insert_statement
	| lock_table_statement
	| merge_statement
	| explain_statement
//    | case_statement[true]
	;
*/

explain_statement
	: EXPLAIN PLAN (SET STATEMENT_ID '=' quoted_string)? (INTO tableview_name)?
	  FOR (select_statement | update_statement | delete_statement | insert_statement | merge_statement)
	;

select_statement
	: (WITH factoring_element (',' factoring_element)*)? subquery (for_update_clause | order_by_clause)*
	;

// Select Specific Clauses

factoring_element
	: common_name paren_column_list? AS '(' subquery order_by_clause? ')'
	  search_clause? cycle_clause?
	;

search_clause
	: SEARCH (DEPTH | BREADTH) FIRST BY id_name ASC? DESC? (NULLS FIRST)? (NULLS LAST)?
	  (',' id_name ASC? DESC? (NULLS FIRST)? (NULLS LAST)?)* SET id_name
	;

cycle_clause
	: CYCLE column_list SET id_name TO expression DEFAULT expression
	;

subquery
	: subquery_basic_elements subquery_operation_part*
	;

subquery_basic_elements
	: query_block
	| '(' subquery ')'
	;

subquery_operation_part
	: (UNION ALL? | INTERSECT | MINUS) subquery_basic_elements
	;

query_block
	: SELECT (DISTINCT | UNIQUE | ALL)? selected_fields into_clause?
	  from_clause where_clause? hierarchical_query_clause? group_by_clause? model_clause?
	;

selected_fields
	: selected_element ( ',' selected_element )*
	;

selected_element
	: select_list_elements column_alias?
	;

from_clause
	: FROM table_ref (',' table_ref)*
	;

select_list_elements
	: ( tableview_name '.' )? '*'
	| expression
	;

// NOTE to PIVOT clause
// according the SQL reference this should not be possible
// according to he reality it is. Here we probably apply pivot/unpivot onto whole join clause
// eventhough it is not enclosed in parenthesis. See pivot examples 09,10,11

table_ref
	: table_ref_aux join_clause* (pivot_clause | unpivot_clause)?
	;

table_ref_aux
	: table_ref_aux_internal flashback_query_clause* (/*{isTableAlias()}?*/ table_alias)?
	;

table_ref_aux_internal
	: dml_table_expression_clause (pivot_clause | unpivot_clause)?                # table_ref_aux_internal_one
	| '(' table_ref subquery_operation_part* ')' (pivot_clause | unpivot_clause)?  # table_ref_aux_internal_two
	| ONLY '(' dml_table_expression_clause ')'                                     # table_ref_aux_internal_three
	;

join_clause
	: query_partition_clause? (CROSS | NATURAL)? (INNER | outer_join_type)?
	  JOIN table_ref_aux query_partition_clause? (join_on_part | join_using_part)*
	;

join_on_part
	: ON expression
	;

join_using_part
	: USING paren_column_list
	;

outer_join_type
	: (FULL | LEFT | RIGHT) OUTER?
	;

query_partition_clause
	: PARTITION BY (('(' (subquery | argument_list)? ')') | argument_list)
	;

flashback_query_clause
	: VERSIONS BETWEEN (SCN | TIMESTAMP) expression
	| AS OF (SCN | TIMESTAMP | SNAPSHOT) expression
	;

pivot_clause
	: PIVOT XML? '(' (','? pivot_element)+ pivot_for_clause pivot_in_clause ')'
	;

pivot_element
	: id_name '(' expression ')' column_alias?
	;

pivot_for_clause
	: FOR (id_name | paren_column_list)
	;

pivot_in_clause
	: IN '(' (subquery | (','? ANY)+ | (','? pivot_in_clause_element)+) ')'
	;

pivot_in_clause_element
	: pivot_in_clause_elements column_alias?
	;

pivot_in_clause_elements
	: expression
	| '(' argument_list? ')'
	;

unpivot_clause
	: UNPIVOT ((INCLUDE | EXCLUDE) NULLS)?
	'(' (id_name | paren_column_list) pivot_for_clause unpivot_in_clause ')'
	;

unpivot_in_clause
	: IN '(' (','? unpivot_in_elements)+ ')'
	;

unpivot_in_elements
	: (id_name | paren_column_list)
	  (AS (constant | '(' (','? constant)+ ')'))?
	;

hierarchical_query_clause
	: CONNECT BY NOCYCLE? expression start_part?
	| start_part CONNECT BY NOCYCLE? expression
	;

start_part
	: START WITH expression
	;

group_by_clause
	: GROUP BY (','? group_by_elements)+ having_clause?
	| having_clause (GROUP BY (','? group_by_elements)+)?
	;

group_by_elements
	: grouping_sets_clause
	| rollup_cube_clause
	| expression
	;

rollup_cube_clause
	: (ROLLUP | CUBE) '(' (','? grouping_sets_elements)+ ')'
	;

grouping_sets_clause
	: GROUPING SETS '(' (','? grouping_sets_elements)+ ')'
	;

grouping_sets_elements
	: rollup_cube_clause
	| '(' argument_list? ')'
	| expression
	;

having_clause
	: HAVING expression
	;

model_clause
	: MODEL cell_reference_options* return_rows_clause? reference_model* main_model
	;

cell_reference_options
	: (IGNORE | KEEP) NAV
	| UNIQUE (DIMENSION | SINGLE REFERENCE)
	;

return_rows_clause
	: RETURN (UPDATED | ALL) ROWS
	;

reference_model
	: REFERENCE common_name ON '(' subquery ')' model_column_clauses cell_reference_options*
	;

main_model
	: (MAIN common_name)? model_column_clauses cell_reference_options* model_rules_clause
	;

model_column_clauses
	: model_column_partition_part? DIMENSION BY model_column_list MEASURES model_column_list
	;

model_column_partition_part
	: PARTITION BY model_column_list
	;

model_column_list
	: '(' (','? model_column)+  ')'
	;

model_column
	: (expression | query_block) column_alias?
	;

model_rules_clause
	: model_rules_part? '(' (','? model_rules_element)* ')'
	;

model_rules_part
	: RULES (UPDATE | UPSERT ALL?)? ((AUTOMATIC | SEQUENTIAL) ORDER)? model_iterate_clause?
	;

model_rules_element
	: (UPDATE | UPSERT ALL?)? cell_assignment order_by_clause? '=' expression
	;

cell_assignment
	: model_expression
	;

model_iterate_clause
	: ITERATE '(' expression ')' until_part?
	;

until_part
	: UNTIL '(' expression ')'
	;

order_by_clause
	: ORDER SIBLINGS? BY (','? order_by_elements)+
	;

order_by_elements
	: expression (ASC | DESC)? (NULLS (FIRST | LAST))?
	;

for_update_clause
	: FOR UPDATE for_update_of_part? for_update_options?
	;

for_update_of_part
	: OF column_list
	;

for_update_options
	: SKIP_ LOCKED
	| NOWAIT
	| WAIT expression
	;

update_statement
	: UPDATE general_table_ref update_set_clause where_clause? static_returning_clause? error_logging_clause?
	;

// Update Specific Clauses

update_set_clause
	: SET
	  ((','? column_based_update_set_clause)+ | VALUE '(' identifier ')' '=' expression)
	;

column_based_update_set_clause
	: id_name '=' expression
	| paren_column_list '=' subquery
	;

delete_statement
	: DELETE FROM? general_table_ref where_clause? static_returning_clause? error_logging_clause?
	;

insert_statement
	: INSERT (single_table_insert | multi_table_insert)
	;

// Insert Specific Clauses

single_table_insert
	: insert_into_clause (values_clause static_returning_clause? | select_statement) error_logging_clause?
	;

multi_table_insert
	: (ALL multi_table_element+ | conditional_insert_clause) select_statement
	;

multi_table_element
	: insert_into_clause values_clause? error_logging_clause?
	;

conditional_insert_clause
	: (ALL | FIRST)? conditional_insert_when_part+ conditional_insert_else_part?
	;

conditional_insert_when_part
	: WHEN expression THEN multi_table_element+
	;

conditional_insert_else_part
	: ELSE multi_table_element+
	;

insert_into_clause
	: INTO general_table_ref paren_column_list?
	;

values_clause
	: VALUES ( regular_id |'(' argument_list? ')' )
	;

merge_statement
	: MERGE INTO tableview_name table_alias? USING selected_tableview ON '(' expression ')'
	  (merge_update_clause merge_insert_clause? | merge_insert_clause merge_update_clause?)?
	  error_logging_clause?
	;

// Merge Specific Clauses

merge_update_clause
	: WHEN MATCHED THEN UPDATE SET merge_element (',' merge_element)* where_clause? merge_update_delete_part?
	;

merge_element
	: id_name '=' expression
	;

merge_update_delete_part
	: DELETE where_clause
	;

merge_insert_clause
	: WHEN NOT MATCHED THEN INSERT paren_column_list?
	  VALUES '(' argument_list? ')' where_clause?
	;

selected_tableview
	: (tableview_name | '(' select_statement ')') table_alias?
	;

lock_table_statement
	: LOCK TABLE lock_table_element (',' lock_table_element)* IN lock_mode MODE wait_nowait_part?
	;

wait_nowait_part
	: WAIT expression
	| NOWAIT
	;

// Lock Specific Clauses

lock_table_element
	: tableview_name partition_extension_clause?
	;

lock_mode
	: ROW SHARE
	| ROW EXCLUSIVE
	| SHARE UPDATE?
	| SHARE ROW EXCLUSIVE
	| EXCLUSIVE
	;

// Common DDL Clauses

general_table_ref
	: (dml_table_expression_clause | ONLY '(' dml_table_expression_clause ')') table_alias?
	;

static_returning_clause
	: (RETURNING | RETURN) argument_list into_clause
	;

error_logging_clause
	: LOG ERRORS error_logging_into_part? expression? error_logging_reject_part?
	;

error_logging_into_part
	: INTO tableview_name
	;

error_logging_reject_part
	: REJECT LIMIT (UNLIMITED | expression)
	;

dml_table_expression_clause
	: table_collection_expression
	| '(' select_statement subquery_restriction_clause? ')'
	| tableview_name sample_clause?
	;

table_collection_expression
	: (TABLE | THE) ('(' subquery ')' | '(' expression ')' ('(' '+' ')')?)
	;

subquery_restriction_clause
	: WITH (READ ONLY | CHECK OPTION (CONSTRAINT constraint_name)?)
	;

sample_clause
	: SAMPLE BLOCK? '(' expression (',' expression)? ')' seed_part?
	;

seed_part
	: SEED '(' expression ')'
	;

argument_list
	: argument (',' argument)*
	;

// Expression & Condition

expression
	: cursor_expression
	| logical_expression
	;

cursor_expression
	: CURSOR '(' subquery ')'
	;

logical_expression
	: multiset_expression is_expr?
	| NOT logical_expression
	| logical_expression AND logical_expression
	| logical_expression OR logical_expression
	;

is_expr
	: IS NOT? (
		NULL | NAN | PRESENT | INFINITE | A_LETTER SET | EMPTY | OF TYPE?
		'(' ONLY? type_spec (',' type_spec)* ')' )
	;

multiset_expression
	: relational_expression (multiset_type=(MEMBER | SUBMULTISET) OF? concatenation)?
	;

relational_expression
	: compound_expression
	| relational_expression relational_operator compound_expression
	;

compound_expression
	: concatenation bool_expr?
	;

bool_expr
	: NOT? (
		  IN in_elements
		| BETWEEN between_elements
		| like_type=(LIKE | LIKEC | LIKE2 | LIKE4)
			concatenation (ESCAPE concatenation)?
		)
	;

relational_operator
	: '='
	| (NOT_EQUAL_OP | '<' '>' | '!' '=' | '^' '=')
	| ('<' | '>') '='?
	;

in_elements
	: '(' subquery ')'
	| '(' concatenation (',' concatenation)* ')'
	| constant
	| bind_variable
	| general_element
	;

between_elements
	: concatenation AND concatenation
	;

concatenation
	: model_expression interval_expression?
	| concatenation op=(ASTERISK | SOLIDUS) model_expression
	| concatenation op=(PLUS_SIGN | MINUS_SIGN) model_expression
	| concatenation BAR BAR model_expression
	;

interval_expression
	: AT (LOCAL | TIME ZONE concatenation)
	| DAY ('(' concatenation ')')? TO SECOND ('(' concatenation ')')?
	| YEAR ('(' concatenation ')')? TO MONTH
	;

model_expression
	: unary_expression ('[' model_expression_element ']')?
	;

model_expression_element
	: (ANY | expression) (',' (ANY | expression))*
	| single_column_for_loop (',' single_column_for_loop)*
	| multi_column_for_loop
	;

single_column_for_loop
	: FOR id_name
	   ( IN '(' argument_list? ')'
	   | (LIKE expression)? FROM fromExpr=expression TO toExpr=expression
		 action_type=(INCREMENT | DECREMENT) action_expr=expression)
	;

multi_column_for_loop
	: FOR paren_column_list
	  IN  '(' (subquery | '(' argument_list? ')') ')'
	;

unary_expression
	: ('-' | '+') unary_expression
	| PRIOR unary_expression
	| CONNECT_BY_ROOT unary_expression
	| /*TODO {input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals(".")}?*/ NEW unary_expression
	| DISTINCT unary_expression
	| ALL unary_expression
	| /*TODO{(input.LA(1) == CASE || input.LA(2) == CASE)}?*/ case_statement /*[false]*/
	| quantified_expression
	| standard_function
	| atom
	;

case_statement /*TODO [boolean isStatementParameter]
TODO scope    {
	boolean isStatement;
}
@init    {$case_statement::isStatement = $isStatementParameter;}*/
	: id_expression? ck1=CASE expression? case_when_part+ case_else_part? END CASE? id_expression?
	;

// CASE

case_when_part
	: WHEN expression THEN (/*TODO{$case_statement::isStatement}?*/ seq_of_statements | expression)
	;

case_else_part
	: ELSE (/*{$case_statement::isStatement}?*/ seq_of_statements | expression)
	;

atom
	: table_element outer_join_sign
	| bind_variable
	| constant
	| general_element
	| '(' subquery ')' subquery_operation_part*
	| '(' expression ')'
	;

quantified_expression
	: (SOME | EXISTS | ALL | ANY) ('(' subquery ')' | '(' expression ')')
	;

standard_function
	: special_function
	| regular_function
	| cursor_percent
	;

special_function
	: CHR '(' concatenation USING NCHAR_CS ')'
	| TRIM '(' ((LEADING | TRAILING | BOTH)? quoted_string? FROM)? concatenation ')'
	| SUM '(' (DISTINCT | ALL)? expression ')'
	| COUNT '(' ( '*' | ((DISTINCT | UNIQUE | ALL)? concatenation)? ) ')' over_clause?
	| ROUND '(' expression (',' UNSIGNED_INTEGER)?  ')'
	| AVG '(' (DISTINCT | ALL)? expression ')'
	| MAX '(' (DISTINCT | ALL)? expression ')'
	| CAST '(' (MULTISET '(' subquery ')' | concatenation) AS type_spec ')'
	| COLLECT '(' (DISTINCT | UNIQUE)? concatenation collect_order_by_part? ')'
	| DECOMPOSE '(' concatenation (CANONICAL | COMPATIBILITY)? ')'
	| EXTRACT '(' regular_id FROM concatenation ')'
	| TRANSLATE '(' expression (USING (CHAR_CS | NCHAR_CS))? (',' expression)* ')'
	| TREAT '(' expression AS REF? type_spec ')'
	| within_or_over_clause_keyword function_argument
		( WITHIN GROUP '(' order_by_clause ')' | over_clause )+
	;

regular_function
	: id_expr_name '(' argument_list? ')'
	;

cursor_percent
	: cursor_name ( PERCENT_ISOPEN | PERCENT_FOUND | PERCENT_NOTFOUND | PERCENT_ROWCOUNT )
	;

over_clause_keyword
	: AVG
	| CORR
	| LAG
	| LEAD
	| MAX
	| MEDIAN
	| MIN
	| NTILE
	| RATIO_TO_REPORT
	| ROW_NUMBER
	| SUM
	| VARIANCE
	| REGR_
	| STDDEV
	| VAR_
	| COVAR_
	;

within_or_over_clause_keyword
	: CUME_DIST
	| DENSE_RANK
	| LISTAGG
	| PERCENT_RANK
	| PERCENTILE_CONT
	| PERCENTILE_DISC
	| RANK
	;

standard_prediction_function_keyword
	: PREDICTION
	| PREDICTION_BOUNDS
	| PREDICTION_COST
	| PREDICTION_DETAILS
	| PREDICTION_PROBABILITY
	| PREDICTION_SET
	;

over_clause
	: OVER '(' query_partition_clause? (order_by_clause windowing_clause?)? ')'
	;

windowing_clause
	: windowing_type
	  (BETWEEN windowing_elements AND windowing_elements | windowing_elements)
	;

windowing_type
	: ROWS
	| RANGE
	;

windowing_elements
	: UNBOUNDED PRECEDING
	| CURRENT ROW
	| concatenation (PRECEDING | FOLLOWING)
	;

using_clause
	: USING ('*' | (','? using_element)+)
	;

using_element
	: (IN OUT? | OUT)? select_list_elements column_alias?
	;

collect_order_by_part
	: ORDER BY concatenation
	;

cost_matrix_clause
	: COST (MODEL AUTO? | '(' (','? common_name)+ ')' VALUES '(' argument_list? ')')
	;

xml_passing_clause
	: PASSING (BY VALUE)? expression column_alias? (',' expression column_alias?)
	;

xml_attributes_clause
	: XMLATTRIBUTES
	 '(' (ENTITYESCAPING | NOENTITYESCAPING)? (SCHEMACHECK | NOSCHEMACHECK)?
	 (','? xml_multiuse_expression_element)+ ')'
	;

xml_namespaces_clause
	: XMLNAMESPACES
	  '(' (concatenation column_alias)? (',' concatenation column_alias)*
	  xml_general_default_part? ')'
	;

xml_table_column
	: xml_column_name
	  (FOR ORDINALITY | type_spec (PATH concatenation)? xml_general_default_part?)
	;

xml_general_default_part
	: DEFAULT concatenation
	;

xml_multiuse_expression_element
	: expression (AS (id_expression | EVALNAME concatenation))?
	;

xmlroot_param_version_part
	: VERSION (NO VALUE | expression)
	;

xmlroot_param_standalone_part
	: STANDALONE (YES | NO VALUE?)
	;

xmlserialize_param_enconding_part
	: ENCODING concatenation
	;

xmlserialize_param_version_part
	: VERSION concatenation
	;

xmlserialize_param_ident_part
	: NO INDENT
	| INDENT (SIZE '=' concatenation)?
	;

// SqlPlus

sql_plus_command
	: '/'
	| EXIT
	| PROMPT
	| SHOW (ERR | ERRORS)
	| START_CMD
	| whenever_command
	| set_command
	;

whenever_command
	: WHENEVER (SQLERROR | OSERROR)
		 ( EXIT (SUCCESS | FAILURE | WARNING) (COMMIT | ROLLBACK)
		 | CONTINUE (COMMIT | ROLLBACK | NONE))
	;

set_command
	: SET regular_id (CHAR_STRING | ON | OFF | /*EXACT_NUM_LIT*/numeric | regular_id)
	;

// Common

partition_extension_clause
	: (SUBPARTITION | PARTITION) FOR? '(' argument_list? ')'
	;

column_alias
	: AS? (identifier | quoted_string)
	| AS
	;

table_alias
	: identifier
	| quoted_string
	;

where_clause
	: WHERE (CURRENT OF cursor_name | expression)
	;

into_clause
	: (BULK COLLECT)? INTO (','? variable_name)+
	;

// Common Named Elements

xml_column_name
	: identifier
	| quoted_string
	;

routine_name
	: id_name ('@' common_name)?
	;

common_name
	: identifier
	;

regular_name
	: identifier ('.' id_expression)?
	;

id_name
	: identifier ('.' id_expression)*
	;

grantee_name
	: id_expression identified_by?
	;

role_name
	: id_expression
	| CONNECT
	;

constraint_name
	: id_name ('@' common_name)?
	;

id_expr_name
	: id_expression ('.' id_expression)*
	;

variable_name
	: (INTRODUCER id_expr_name)? id_expression ('.' id_expression)?
	| bind_variable
	;

cursor_name
	: general_element
	| bind_variable
	;

record_name
	: identifier
	| bind_variable
	;

tableview_name
	: identifier ('.' id_expression)?
	  ('@' common_name | /*TODO{!(input.LA(2) == BY)}?*/ partition_extension_clause)?
	;

// Represents a valid DB object name in DDL commands which are valid for several DB (or schema) objects.
// For instance, create synonym ... for <DB object name>, or rename <old DB object name> to <new DB object name>.
// Both are valid for sequences, tables, views, etc.
grant_object_name
	: tableview_name
	| USER (','? id_expression)+
	| DIRECTORY id_expression
	| EDITION id_expression
	| MINING MODEL id_expression
	| JAVA (SOURCE | RESOURCE) id_expression
	| SQL TRANSLATION PROFILE id_expression
	;

column_list
	: (','? id_name)+
	;

paren_column_list
	: LEFT_PAREN column_list RIGHT_PAREN
	;

// PL/SQL Specs

// NOTE: In reality this applies to aggregate functions only
keep_clause
	: KEEP '(' DENSE_RANK (FIRST | LAST) order_by_clause ')' over_clause?
	;

function_argument
	: '(' argument_list? ')' keep_clause?
	;

function_argument_analytic
	: '(' (','? argument respect_or_ignore_nulls?)* ')' keep_clause?
	;

function_argument_modeling
	: '(' id_name (',' (numeric | NULL) (',' (numeric | NULL))?)?
	  USING (tableview_name '.' '*' | '*' | (','? expression column_alias?)+)
	  ')' keep_clause?
	;

respect_or_ignore_nulls
	: (RESPECT | IGNORE) NULLS
	;

argument
	: (identifier '=' '>')? expression
	;

type_spec
	: datatype
	| REF? id_expr_name (PERCENT_ROWTYPE | PERCENT_TYPE)?
	;

datatype
	: native_datatype_element precision_part? (WITH LOCAL? TIME ZONE | CHARACTER SET id_expr_name)?
	| INTERVAL (YEAR | DAY) ('(' expression ')')? TO (MONTH | SECOND) ('(' expression ')')?
	;

precision_part
	: '(' numeric (',' numeric)? (CHAR | BYTE)? ')'
	;

native_datatype_element
	: BINARY_INTEGER
	| PLS_INTEGER
	| NATURAL
	| BINARY_FLOAT
	| BINARY_DOUBLE
	| NATURALN
	| POSITIVE
	| POSITIVEN
	| SIGNTYPE
	| SIMPLE_INTEGER
	| NVARCHAR2
	| DEC
	| INTEGER
	| INT
	| NUMERIC
	| SMALLINT
	| NUMBER
	| DECIMAL
	| DOUBLE PRECISION?
	| FLOAT
	| REAL
	| NCHAR
	| LONG RAW?
	| CHAR
	| CHARACTER
	| VARCHAR2
	| VARCHAR
	| STRING
	| RAW
	| BOOLEAN
	| DATE
	| ROWID
	| UROWID
	| YEAR
	| MONTH
	| DAY
	| HOUR
	| MINUTE
	| SECOND
	| TIMEZONE_HOUR
	| TIMEZONE_MINUTE
	| TIMEZONE_REGION
	| TIMEZONE_ABBR
	| TIMESTAMP
	| TIMESTAMP_UNCONSTRAINED
	| TIMESTAMP_TZ_UNCONSTRAINED
	| TIMESTAMP_LTZ_UNCONSTRAINED
	| YMINTERVAL_UNCONSTRAINED
	| DSINTERVAL_UNCONSTRAINED
	| BFILE
	| BLOB
	| CLOB
	| NCLOB
	| MLSLABEL
	;

bind_variable
	: (BINDVAR | ':' UNSIGNED_INTEGER)
	  // Pro*C/C++ indicator variables
	  (INDICATOR? (BINDVAR | ':' UNSIGNED_INTEGER))?
	  ('.' general_element_part)*
	;

general_element
	: general_element_part ('.' general_element_part)*
	;

general_element_part
	: (INTRODUCER id_expr_name)? id_expr_name ('@' common_name)? function_argument?
	;

table_element
	: (INTRODUCER id_expr_name)? id_expr_name
	;

object_privilege
	: ALL PRIVILEGES?
	| ALTER
	| DEBUG
	| DELETE
	| EXECUTE
	| FLASHBACK ARCHIVE
	| INDEX
	| INHERIT PRIVILEGES
	| INSERT
	| KEEP SEQUENCE
	| MERGE VIEW
	| ON COMMIT REFRESH
	| QUERY REWRITE
	| READ
	| REFERENCES
	| SELECT
	| TRANSLATE SQL
	| UNDER
	| UPDATE
	| USE
	| WRITE
	;

//Ordered by type rather than alphabetically
system_privilege
	: ALL PRIVILEGES
	| ADVISOR
	| ADMINISTER ANY? SQL TUNING SET
	| (ALTER | CREATE | DROP) ANY SQL PROFILE
	| ADMINISTER SQL MANAGEMENT OBJECT
	| CREATE ANY? CLUSTER
	| (ALTER | DROP) ANY CLUSTER
	| (CREATE | DROP) ANY CONTEXT
	| EXEMPT REDACTION POLICY
	| ALTER DATABASE
	| (ALTER | CREATE) PUBLIC? DATABASE LINK
	| DROP PUBLIC DATABASE LINK
	| DEBUG CONNECT SESSION
	| DEBUG ANY PROCEDURE
	| ANALYZE ANY DICTIONARY
	| CREATE ANY? DIMENSION
	| (ALTER | DROP) ANY DIMENSION
	| (CREATE | DROP) ANY DIRECTORY
	| (CREATE | DROP) ANY EDITION
	| FLASHBACK (ARCHIVE ADMINISTER | ANY TABLE)
	| (ALTER | CREATE | DROP) ANY INDEX
	| CREATE ANY? INDEXTYPE
	| (ALTER | DROP | EXECUTE) ANY INDEXTYPE
	| CREATE (ANY | EXTERNAL)? JOB
	| EXECUTE ANY (CLASS | PROGRAM)
	| MANAGE SCHEDULER
	| ADMINISTER KEY MANAGEMENT
	| CREATE ANY? LIBRARY
	| (ALTER | DROP | EXECUTE) ANY LIBRARY
	| LOGMINING
	| CREATE ANY? MATERIALIZED VIEW
	| (ALTER | DROP) ANY MATERIALIZED VIEW
	| GLOBAL? QUERY REWRITE
	| ON COMMIT REFRESH
	| CREATE ANY? MINING MODEL
	| (ALTER | DROP | SELECT | COMMENT) ANY MINING MODEL
	| CREATE ANY? CUBE
	| (ALTER | DROP | SELECT | UPDATE) ANY CUBE
	| CREATE ANY? MEASURE FOLDER
	| (DELETE | DROP | INSERT) ANY MEASURE FOLDER
	| CREATE ANY? CUBE DIMENSION
	| (ALTER | DELETE | DROP | INSERT | SELECT | UPDATE) ANY CUBE DIMENSION
	| CREATE ANY? CUBE BUILD PROCESS
	| (DROP | UPDATE) ANY CUBE BUILD PROCESS
	| CREATE ANY? OPERATOR
	| (ALTER | DROP | EXECUTE) ANY OPERATOR
	| (CREATE | ALTER | DROP) ANY OUTLINE
	| CREATE PLUGGABLE DATABASE
	| SET CONTAINER
	| CREATE ANY? PROCEDURE
	| (ALTER | DROP | EXECUTE) ANY PROCEDURE
	| (CREATE | ALTER | DROP ) PROFILE
	| CREATE ROLE
	| (ALTER | DROP | GRANT) ANY ROLE
	| (CREATE | ALTER | DROP) ROLLBACK SEGMENT
	| CREATE ANY? SEQUENCE
	| (ALTER | DROP | SELECT) ANY SEQUENCE
	| (ALTER | CREATE | RESTRICTED) SESSION
	| ALTER RESOURCE COST
	| CREATE ANY? SQL TRANSLATION PROFILE
	| (ALTER | DROP | USE) ANY SQL TRANSLATION PROFILE
	| TRANSLATE ANY SQL
	| CREATE ANY? SYNONYM
	| DROP ANY SYNONYM
	| (CREATE | DROP) PUBLIC SYNONYM
	| CREATE ANY? TABLE
	| (ALTER | BACKUP | COMMENT | DELETE | DROP | INSERT | LOCK | READ | SELECT | UPDATE) ANY TABLE
	| (CREATE | ALTER | DROP | MANAGE | UNLIMITED) TABLESPACE
	| CREATE ANY? TRIGGER
	| (ALTER | DROP) ANY TRIGGER
	| ADMINISTER DATABASE TRIGGER
	| CREATE ANY? TYPE
	| (ALTER | DROP | EXECUTE | UNDER) ANY TYPE
	| (CREATE | ALTER | DROP) USER
	| CREATE ANY? VIEW
	| (DROP | UNDER | MERGE) ANY VIEW
	| (ANALYZE | AUDIT) ANY
	| BECOME USER
	| CHANGE NOTIFICATION
	| EXEMPT ACCESS POLICY
	| FORCE ANY? TRANSACTION
	| GRANT ANY OBJECT? PRIVILEGE
	| INHERIT ANY PRIVILEGES
	| KEEP DATE TIME
	| KEEP SYSGUID
	| PURGE DBA_RECYCLEBIN
	| RESUMABLE
	| SELECT ANY (DICTIONARY | TRANSACTION)
	| SYSBACKUP
	| SYSDBA
	| SYSDG
	| SYSKM
	| SYSOPER
	;

// $>

// $<Lexer Mappings

constant
	: TIMESTAMP (quoted_string | bind_variable) (AT TIME ZONE quoted_string)?
	| INTERVAL (quoted_string | bind_variable | general_element_part)
	  (YEAR | MONTH | DAY | HOUR | MINUTE | SECOND)
	  ('(' (UNSIGNED_INTEGER | bind_variable) (',' (UNSIGNED_INTEGER | bind_variable) )? ')')?
	  (TO ( DAY | HOUR | MINUTE | SECOND ('(' (UNSIGNED_INTEGER | bind_variable) ')')?))?
	| numeric
	| DATE quoted_string
	| quoted_string
	| NULL
	| TRUE
	| FALSE
	| DBTIMEZONE
	| SESSIONTIMEZONE
	| MINVALUE
	| MAXVALUE
	| DEFAULT
	;

numeric
	: UNSIGNED_INTEGER
	| APPROXIMATE_NUM_LIT
	;

numeric_negative
	: MINUS_SIGN numeric
	;

quoted_string
	: CHAR_STRING
	//| CHAR_STRING_PERL
	| NATIONAL_CHAR_STRING_LIT
	;

identifier
	: (INTRODUCER id_expr_name)? id_expression
	;

id_expression
	: regular_id
	| delimited_id
	;

delimited_id
	: DELIMITED_ID
	;

outer_join_sign
	: '(' '+' ')'
	;

regular_id
	: REGULAR_ID
	| A_LETTER
	| ADD
	| AFTER
	| AGENT
	| AGGREGATE
	//| ALL
	//| ALTER
	| ANALYZE
	//| AND
	//| ANY
	| ARRAY
	// | AS
	//| ASC
	| ASSOCIATE
	| AT
	| ATTRIBUTE
	| AUDIT
	| AUTHID
	| AUTO
	| AUTOMATIC
	| AUTONOMOUS_TRANSACTION
	| BATCH
	| BEFORE
	//| BEGIN
	// | BETWEEN
	| BFILE
	| BINARY_DOUBLE
	| BINARY_FLOAT
	| BINARY_INTEGER
	| BLOB
	| BLOCK
	| BODY
	| BOOLEAN
	| BOTH
	// | BREADTH
	| BULK
	// | BY
	| BYTE
	| C_LETTER
	| CACHE
	| CALL
	| CANONICAL
	| CASCADE
	//| CASE
	| CAST
	| CHAR
	| CHAR_CS
	| CHARACTER
	//| CHECK
	| CHR
	| CLASS
	| CLOB
	| CLOSE
	| CLUSTER
	| COLLECT
	| COLUMNS
	| COMMENT
	| COMMIT
	| COMMITTED
	| COMPATIBILITY
	| COMPLETE
	| COMPILE
	| COMPOUND
	//| CONNECT
	//| CONNECT_BY_ROOT
	| CONSTANT
	| CONSTRAINT
	| CONSTRAINTS
	| CONSTRUCTOR
	| CONTENT
	| CONTEXT
	| CONTINUE
	| CONVERT
	| CORRUPT_XID
	| CORRUPT_XID_ALL
	| COST
	| COUNT
	//| CREATE
	| CROSS
	| CUBE
	//| CURRENT
	| CURRENT_USER
	| CURSOR
	| CUSTOMDATUM
	| CYCLE
	| DATA
	| DATABASE
	//| DATE
	| DAY
	| DB_ROLE_CHANGE
	| DBTIMEZONE
	| DDL
	| DEBUG
	| DEC
	| DECIMAL
	| DECODE
	//| DECLARE
	| DECOMPOSE
	| DECREMENT
	//| DEFAULT
	| DEFAULTS
	| DEFERRED
	| DEFINER
	| DELETE
	// | DEPTH
	//| DESC
	| DETERMINISTIC
	| DIMENSION
	| DISABLE
	| DISASSOCIATE
	| DIRECTORY
	//| DISTINCT
	| DOCUMENT
	| DOUBLE
	//| DROP
	| DSINTERVAL_UNCONSTRAINED
	| EACH
	| ELEMENT
	//| ELSE
	//| ELSIF
	| EMPTY
	| ENABLE
	| ENCODING
	| ENCRYPT
	//| END
	| ENTITYESCAPING
	| ERR
	| ERRORS
	| ESCAPE
	| EVALNAME
	| EXCEPTION
	| EXCEPTION_INIT
	| EXCEPTIONS
	| EXCLUDE
	//| EXCLUSIVE
	| EXECUTE
	//| EXISTS
	| EXIT
	| EXPLAIN
	| EXTERNAL
	| EXTRACT
	| FAILURE
	//| FALSE
	//| FETCH
	| FINAL
	| FIRST
	| FIRST_VALUE
	| FLOAT
	| FOLLOWING
	| FOLLOWS
	//| FOR
	| FORALL
	| FORCE
	// | FROM
	| FULL
	| FUNCTION
	//| GOTO
	//| GRANT
	//| GROUP
	| GREATEST
	| GROUPING
	| HASH
	//| HAVING
	| HIDE
	| HOUR
	| ID
	| IDENTIFIER
	//| IF
	| IGNORE
	| IMMEDIATE
	// | IN
	| INCLUDE
	| INCLUDING
	| INCREMENT
	| INDENT
	//| INDEX
	| INDEXED
	| INDICATOR
	| INDICES
	| INFINITE
	| INLINE
	| INNER
	| INOUT
	//| INSERT
	| INSTANTIABLE
	| INSTEAD
	| INT
	| INTEGER
	//| INTERSECT
	| INTERVAL
	// | INTO
	| INVALIDATE
	//| IS
	| ISOLATION
	| ITERATE
	| JAVA
	| JOIN
	| KEEP
	| KEY
	| LANGUAGE
	| LAST
	| LAST_VALUE
	| LEADING
	| LEAST
	| LEFT
	| LEVEL
	| LIBRARY
	// | LIKE
	| LIKE2
	| LIKE4
	| LIKEC
	| LIMIT
	| LINK
	| LIST
	| LOCAL
	//| LOCK
	| LOCKED
	| LOG
	| LOGOFF
	| LOGON
	| LONG
	| LOOP
	| MAIN
	| MAP
	| MATCHED
	| MAXVALUE
	| MEASURES
	| MEMBER
	| MERGE
	//| MINUS
	| MINIMUM
	| MINUTE
	| MINVALUE
	| MLSLABEL
	//| MODE
	| MODEL
	| MODIFY
	| MONTH
	| MULTISET
	| NAME
	| NAN
	| NATURAL
	| NATURALN
	| NAV
	| NCHAR
	| NCHAR_CS
	| NCLOB
	| NESTED
	| NEW
	| NEXT
	| NO
	| NOAUDIT
	// | NOCACHE
	| NOCOPY
	| NOCYCLE
	| NOENTITYESCAPING
	//| NOMAXVALUE
	//| NOMINVALUE
	| NONE
	// | NOORDER
	| NOSCHEMACHECK
	//| NOT
	//| NOWAIT
	// | NULL
	| NULLS
	| NUMBER
	| NUMERIC
	| NVARCHAR2
	| NVL
	| OBJECT
	//| OF
	| OFF
	| OID
	| OLD
	//| ON
	| ONLINE
	| ONLY
	| OPEN
	| OPERATOR
	//| OPTION
	//| OR
	| ORADATA
	//| ORDER
	| ORDINALITY
	| OSERROR
	| OUT
	| OUTER
	| OVER
	| OVERRIDING
	| PACKAGE
	| PARALLEL_ENABLE
	| PARAMETERS
	| PARENT
	| PARTITION
	| PASSING
	| PATH
	//| PERCENT_ROWTYPE
	//| PERCENT_TYPE
	| PIPELINED
	//| PIVOT
	| PLAN
	| PLS_INTEGER
	| POLICY
	| POSITIVE
	| POSITIVEN
	| PRAGMA
	| PRECEDING
	| PRECISION
	| PRESENT
	//| PRIOR
	//| PROCEDURE
	| PROFILE
	| PROGRAM
	| RAISE
	| RANGE
	| RAW
	| READ
	| REAL
	| RECORD
	| REF
	| REFERENCE
	| REFERENCING
	| REJECT
	| RELIES_ON
	| RENAME
	| REPLACE
	| RESPECT
	| RESTRICT_REFERENCES
	| RESULT
	| RESULT_CACHE
	| RETURN
	| RETURNING
	| REUSE
	| REVERSE
	//| REVOKE
	| RIGHT
	| ROLES
	| ROLLBACK
	| ROLLUP
	| ROW
	| ROWID
	| ROWS
	| RULES
	| SALT
	| SAMPLE
	| SAVE
	| SAVEPOINT
	| SCHEMA
	| SCHEMACHECK
	| SCN
	// | SEARCH
	| SECOND
	| SEED
	| SEGMENT
	// | SELECT
	| SELF
	// | SEQUENCE
	| SEQUENTIAL
	| SERIALIZABLE
	| SERIALLY_REUSABLE
	| SERVERERROR
	| SESSIONTIMEZONE
	| SET
	| SETS
	| SETTINGS
	//| SHARE
	| SHOW
	| SHUTDOWN
	| SIBLINGS
	| SIGNTYPE
	| SIMPLE_INTEGER
	| SINGLE
	//| SIZE
	| SKIP_
	| SMALLINT
	| SNAPSHOT
	| SOME
	| SPECIFICATION
	| SQL
	| SQLDATA
	| SQLERROR
	| STANDALONE
	//| START
	| STARTUP
	| STATEMENT
	| STATEMENT_ID
	| STATIC
	| STATISTICS
	| STRING
	| STORE
	| SUBSTR
	| SUBMULTISET
	| SUBPARTITION
	| SUBSTITUTABLE
	| SUBTYPE
	| SUCCESS
	| SUSPEND
	| SYSDATE
	| TEMPORARY
	//| TABLE
	//| THE
	//| THEN
	| TIME
	| TIMESTAMP
	| TIMESTAMP_LTZ_UNCONSTRAINED
	| TIMESTAMP_TZ_UNCONSTRAINED
	| TIMESTAMP_UNCONSTRAINED
	| TIMEZONE_ABBR
	| TIMEZONE_HOUR
	| TIMEZONE_MINUTE
	| TIMEZONE_REGION
	//| TO
	| TO_DATE
	| TO_CHAR
	| TRAILING
	| TRANSACTION
	| TRANSLATE
	| TREAT
	| TRIGGER
	| TRIM
	//| TRUE
	| TRUNCATE
	| TYPE
	| UNBOUNDED
	| UNDER
	//| UNION
	//| UNIQUE
	| UNLIMITED
	//| UNPIVOT
	| UNTIL
	//| UPDATE
	| UPDATED
	| UPSERT
	| UROWID
	| USE
	| USER
	| USERS
	//| USING
	| VALIDATE
	| VALUE
	//| VALUES
	| VARCHAR
	| VARCHAR2
	| VARIABLE
	| VARRAY
	| VARYING
	| VERSION
	| VERSIONS
	| WAIT
	| WARNING
	| WELLFORMED
	// | WHEN
	| WHENEVER
	// | WHERE
	| WHILE
	//| WITH
	| WITHIN
	| WORK
	| WRITE
	| XML
	| XMLAGG
	| XMLATTRIBUTES
	| XMLCAST
	| XMLCOLATTVAL
	| XMLELEMENT
	| XMLEXISTS
	| XMLFOREST
	| XMLNAMESPACES
	| XMLPARSE
	| XMLPI
	| XMLQUERY
	| XMLROOT
	| XMLSERIALIZE
	| XMLTABLE
	| YEAR
	| YES
	| YMINTERVAL_UNCONSTRAINED
	| ZONE
	| PREDICTION
	| PREDICTION_BOUNDS
	| PREDICTION_COST
	| PREDICTION_DETAILS
	| PREDICTION_PROBABILITY
	| PREDICTION_SET
	| CUME_DIST
	| DENSE_RANK
	| LISTAGG
	| PERCENT_RANK
	| PERCENTILE_CONT
	| PERCENTILE_DISC
	| RANK
	| AVG
	| CORR
	| LAG
	| LEAD
	| MAX
	| MEDIAN
	| MIN
	| NTILE
	| RATIO_TO_REPORT
	| ROW_NUMBER
	| SUM
	| VARIANCE
	| REGR_
	| STDDEV
	| VAR_
	| COVAR_
	;
