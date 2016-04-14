/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.9-log : Database - ci
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `t_sys_user` */

DROP TABLE IF EXISTS `t_sys_user`;

CREATE TABLE `t_sys_user` (
  `id` varchar(64) NOT NULL COMMENT '主键',
  `user_name` varchar(100) DEFAULT NULL COMMENT '用户名',
  `real_name` varchar(100) DEFAULT NULL COMMENT '真实姓名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `mobile` varchar(13) DEFAULT NULL COMMENT '手机号',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `dep_id` varchar(64) DEFAULT NULL COMMENT '部门ID',
  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
  `update_date` datetime DEFAULT NULL COMMENT '更新日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UNIQUE_USER_NAME` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_sys_user` */

insert  into `t_sys_user`(`id`,`user_name`,`real_name`,`password`,`mobile`,`email`,`dep_id`,`create_date`,`update_date`) values ('da0b72815fad4b28b6fe1e5511d17631','zhangsan','张三','3d874233a0bb355d9c58eaf7dbc49f09','18591909887','zhangsan@126.com','','2016-03-30 15:50:52','2016-03-30 15:50:52'),('f6affe912ac34ac0a2c5e1b48c207d35','lisi','李四','397151b7e8986536a76265b0cb8d5dd6','18500199899','lisi@sina.com','','2016-03-30 15:55:12','2016-03-30 15:55:12');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
