# select语句
select * from city limit 10;

select Name,CountryCode from city limit 5;

# 排除重复 distinct
select distinct CountryCode from city limit 5;

# where 关键字 条件查询  like 模糊查询 占位符(通配符) %
select CountryCode from city where CountryCode = 'NLD';

select *
from city where CountryCode like 'A%' limit 5;

# and or 条件查询

select * from city where Name = 'Haag' and CountryCode = 'NLD';

select * from city where CountryCode = 'AFG' or CountryCode = 'AUS' limit 10;

select * from city where (CountryCode = 'AFG' or CountryCode = 'AUS') and District = 'Herat';

# order by 默认升序排序  降序在order by 字段名 后用关键字 desc  升序用asc

select * from city order by Population limit 9;

select * from city order by Population desc limit 9;

select * from city order by CountryCode desc ,Population asc limit 9;


# insert语句  INSERT INTO 表名称 VALUES (值1, 值2,....)  INSERT INTO table_name (列1, 列2,...) VALUES (值1, 值2,....)

insert into student values ('shaoming',20,'男');

insert into student (name, age) values ('测试',23);

insert into student (name, age) values ('测试1',21),
                                       ('测试2',22),
                                       ('测试3',24);


# update语句 更新操作  UPDATE 表名称 SET 列名称 = 新值 WHERE 列名称 = 某值

update student set name = '你好' where age = 22;

update student set name = 'MM',gender = '女' where age = 20;


# delete语句 删除操作   DELETE FROM 表名称 WHERE 列名称 = 值

delete from student where age = 21;

# 删除所有行 DELETE FROM table_name  或者：  DELETE * FROM table_name


# 不包含 Not

select * from student where age not like '%3';


# 通配符   % 代替一个或多个字符   _  代替一个字符
# [charlist]  需配合 RLIKE 使用  匹配以字符列表中的字符 开头的记录

SELECT * FROM person WHERE City RLIKE '[A-N]';

SELECT * FROM person WHERE City NOT RLIKE '[L]';