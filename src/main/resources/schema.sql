-- Spring Data JPA Starter를 활용할 때마다
-- 자동으로 schema.sql 파일을 가져와서 테이블을 생성
create table course
(
    id bigint not null,
    name varchar(255) not null,
    author varchar(255) not null,
    primary key (id)
);

