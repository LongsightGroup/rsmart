DROP TABLE IF EXISTS CLOG_GLOBAL_PREFERENCES;

--ALTER TABLE CLOG_COMMENT ADD COLUMN SITE_ID VARCHAR(255) NOT NULL AFTER POST_ID
call AddColumnUnlessExists(DATABASE(), 'CLOG_COMMENT', 'SITE_ID', 'VARCHAR(255) NOT NULL AFTER POST_ID');