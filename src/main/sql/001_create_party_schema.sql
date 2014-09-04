connect sys/welcome1@XE as sysdba;
create user miniobpuser identified by password;
grant connect,resource,dba to miniobpuser;
grant create session,grant any privilege to miniobpuser;
grant unlimited tablespace to miniobpuser;
disconnect

connect miniobpuser/password@XE;

create table party(id char(10) not null primary key, name varchar2(10), branch_name varchar2(10));
create table party_address(party char(10), street_name varchar2(10), city varchar2(10), state varchar2(2), country varchar2(10), zipcode varchar2(10), FOREIGN KEY (party) REFERENCES party(id));



