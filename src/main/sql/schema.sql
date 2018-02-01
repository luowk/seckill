--创建数据库
CREATE DATABASE seckill;
--切换数据库
USE seckill;

--创建表
--秒杀商品表
CREATE TABLE seckill(
  `seckill_id` bigint NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `name` varchar(120) NOT NULL COMMENT '商品名称',
  `number` int NOT NULL COMMENT '库存数量',
  `start_time` timestamp DEFAULT '2018-01-01' COMMENT '开始时间',
  `end_time` timestamp DEFAULT '2018-01-01' COMMENT '结束时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY(seckill_id),
  KEY idx_start_time(start_time),
  KEY idx_end_time(end_time),
  KEY idx_create_time(create_time)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=UTF8 COMMENT '秒杀商品表' ;

--初始化数据
insert into seckill (name, number, start_time, end_time)
values
  ('1000元秒杀iPhone 6', 100, '2018-01-10 00:00:00', '2018-01-11 00:00:00'),
  ('500元秒杀iPad 2', 200, '2018-01-10 00:00:00', '2018-01-11 00:00:00'),
  ('300元秒杀XiaoMi 4', 300, '2018-01-10 00:00:00', '2018-01-11 00:00:00'),
  ('200元秒杀RedMi Note', 400, '2018-01-10 00:00:00', '2018-01-11 00:00:00');

--创建秒杀成功表
CREATE TABLE success_killed(
  `seckill_id` bigint NOT NULL COMMENT '商品id',
  `user_phone` varchar(11) NOT NULL COMMENT '用户手机号',
  `state` tinyint NOT NULL DEFAULT -1 COMMENT '状态标识:-1无效 0成功 1已付款 2已发货 3已签收',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY(seckill_id, user_phone),
  KEY idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT '秒杀成功表' ;

--连接控制台
mysql -u root -p

--为什么手写DDL
--记录每次上线的DDL修改
-- 上线V。1版本
ALTER TABLE seckill
    DROP INDEX idx_create_time,
  ADD INDEX idx_c_s(create_time,start_time);

--上线V1.2
--DDL