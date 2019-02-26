DROP TABLE IF EXISTS contact;
DROP SEQUENCE IF EXISTS glob_seq_contact;

CREATE SEQUENCE glob_seq_contact   START 1;
CREATE TABLE contact (
  id   SERIAL PRIMARY KEY ,
  name VARCHAR(100)
)