insert into course(id, name) values(101, 'java');
insert into course(id, name) values(102, 'javascript');
insert into course(id, name) values(103, 'php');

insert into passport(id, number) values(301, '301201');
insert into passport(id, number) values(302, '302202');
insert into passport(id, number) values(303, '303203');
insert into passport(id, number) values(304, '304204');

insert into student(id, name, passport_id) values(201, 'john', 301);
insert into student(id, name, passport_id) values(202, 'paul', 302);
insert into student(id, name, passport_id) values(203, 'simon', 303);

insert into review(id, rating, description, course_id) values(401, '3', 'good', 101);
insert into review(id, rating, description, course_id) values(402, '4', 'very good', 101);
insert into review(id, rating, description, course_id) values(403, '5', 'excellent', 103);

INSERT INTO student_course (student_id, course_id) VALUES (201, 101);
INSERT INTO student_course (student_id, course_id) VALUES (201, 102);
INSERT INTO student_course (student_id, course_id) VALUES (202, 103);
INSERT INTO student_course (student_id, course_id) VALUES (203, 101);