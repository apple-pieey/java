drop table member;
select * from team;
select * from member;
select * from user_tables;
select * from problem;
commit;
insert into member (m_no, m_id, m_pw, m_name, m_teamno)values (4, '심우석', 'test', 'test', 1);

insert into team (t_no, t_name, t_score) values (2, '테스트팀2', 777);
select * from team order by t_score desc;


insert into team (t_no, t_name, t_score) values (1, '테스트팀', 0);

select * from member order by m_score asc


CREATE TABLE member (
m_no NUMBER PRIMARY KEY,
m_id VARCHAR(20) NOT NULL UNIQUE,
m_pw VARCHAR(20) NOT NULL,
m_name VARCHAR(20) NOT NULL,
m_teamno NUMBER REFERENCES team(t_no)
);

CREATE TABLE team (
t_no NUMBER PRIMARY KEY,
t_name VARCHAR(20) NOT NULL UNIQUE,
t_score NUMBER default 0
);

CREATE TABLE problem (
p_no NUMBER PRIMARY KEY,
p_desc VARCHAR(500) NOT NULL,
p_score NUMBER NOT NULL,
p_time NUMBER NOT NULL
);

create sequence m_no_seq
increment by 1
start with 1
maxvalue 9999999
nocache
nocycle;

drop sequence m_no_seq;

select m_id, m_pw, m_teamno, m_name, t_score from member, team where m_id = 'test' and member.m_teamno = team.t_no;