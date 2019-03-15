/*
Navicat MySQL Data Transfer

Source Server         : 本地MYSQL
Source Server Version : 50631
Source Host           : localhost:3306
Source Database       : film_shiro

Target Server Type    : MYSQL
Target Server Version : 50631
File Encoding         : 65001

Date: 2019-03-15 17:17:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(20) NOT NULL,
  `roledesc` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
