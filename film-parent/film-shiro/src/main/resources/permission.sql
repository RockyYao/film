/*
Navicat MySQL Data Transfer

Source Server         : 本地MYSQL
Source Server Version : 50631
Source Host           : localhost:3306
Source Database       : film_shiro

Target Server Type    : MYSQL
Target Server Version : 50631
File Encoding         : 65001

Date: 2019-03-15 17:17:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `modelname` varchar(20) NOT NULL,
  `permission` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------
