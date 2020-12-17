-- populate role table with audit
INSERT INTO role (id, is_active, name, value)
VALUES (1, true, 'ADMIN', 'Администратор');
INSERT INTO my_revision_entity (id, timestamp, user_name)
VALUES (2, (SELECT EXTRACT(EPOCH FROM now())) * 1000, null);
INSERT INTO role_aud (id, rev, revtype, name, value)
VALUES (3, 2, 0, 'ADMIN', 'Администратор');

INSERT INTO role (id, is_active, name, value)
VALUES (4, true, 'ENGINEER', 'Технолог');
INSERT INTO my_revision_entity (id, timestamp, user_name)
VALUES (5, (SELECT EXTRACT(EPOCH FROM now())) * 1000, null);
INSERT INTO role_aud (id, rev, revtype, name, value)
VALUES (6, 5, 0, 'ENGINEER', 'Технолог');

INSERT INTO role (id, is_active, name, value)
VALUES (7, true, 'OPERATOR', 'Оператор');
INSERT INTO my_revision_entity (id, timestamp, user_name)
VALUES (8, (SELECT EXTRACT(EPOCH FROM now())) * 1000, null);
INSERT INTO role_aud (id, rev, revtype, name, value)
VALUES (9, 8, 0, 'OPERATOR', 'Оператор');

-- populate users table
INSERT INTO users (id, is_active, email, first_name, last_name)
VALUES (10, true, 'yuri@o.ru', 'Yuri', 'Okhvat');
INSERT INTO my_revision_entity (id, timestamp, user_name)
VALUES (11, (SELECT EXTRACT(EPOCH FROM now())) * 1000, null);
INSERT INTO users_aud (id, rev, revtype, email, first_name, last_name)
VALUES (12, 10, 0, 'yuri@o.ru', 'Yuri', 'Okhvat');

INSERT INTO public.users (id, is_active, email, first_name, last_name)
VALUES (13, true, 'imer@nekto.ru', 'Imyarek', 'Nektoev');
INSERT INTO my_revision_entity (id, timestamp, user_name)
VALUES (14, (SELECT EXTRACT(EPOCH FROM now())) * 1000, null);
INSERT INTO users_aud (id, rev, revtype, email, first_name, last_name)
VALUES (15, 14, 0, 'imer@nekto.ru', 'Imyarek', 'Nektoev');

-- populate user_role relations
INSERT INTO user_role (user_id, role_id)
VALUES (10, 1);
INSERT INTO my_revision_entity (id, timestamp, user_name)
VALUES (16, (SELECT EXTRACT(EPOCH FROM now())) * 1000, null);
INSERT INTO public.user_role_aud (rev, user_id, role_id, revtype)
VALUES (16, 10, 1, 0);

INSERT INTO user_role (user_id, role_id)
VALUES (10, 4);
INSERT INTO my_revision_entity (id, timestamp, user_name)
VALUES (17, (SELECT EXTRACT(EPOCH FROM now())) * 1000, null);
INSERT INTO public.user_role_aud (rev, user_id, role_id, revtype)
VALUES (17, 10, 4, 0);

INSERT INTO user_role (user_id, role_id)
VALUES (13, 7);
INSERT INTO my_revision_entity (id, timestamp, user_name)
VALUES (18, (SELECT EXTRACT(EPOCH FROM now())) * 1000, null);
INSERT INTO public.user_role_aud (rev, user_id, role_id, revtype)
VALUES (18, 13, 7, 0);

CREATE SEQUENCE hibernate_sequence;
Select setval('hibernate_sequence', 90);