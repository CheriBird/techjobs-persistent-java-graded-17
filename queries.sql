--Part 1
-- job table columns and data types:
SELECT column_name, data_type
FROM information_schema.columns
WHERE table_name = 'job';

--  COLUMN_NAME  DATA_TYPE
--  id              int
--  employer        varchar
--  name            varchar
--  skills          varchar

--Part 2
SELECT name
FROM employer
WHERE location = "St. Louis City";

--Part 3
DROP TABLE job;

--Part 4
SELECT *
FROM skill
INNER JOIN job_skills
    ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;
