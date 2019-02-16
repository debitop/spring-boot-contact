DROP TABLE IF EXISTS contact;
DROP SEQUENCE IF EXISTS glob_seq_contact;

CREATE SEQUENCE glob_seq_contact   START 1;
CREATE TABLE contact (
  id   INTEGER PRIMARY KEY DEFAULT nextval('glob_seq_contact'),
  name VARCHAR(100)
)