/*
Navicat MySQL Data Transfer

Source Server         : 本地MYSQL
Source Server Version : 50631
Source Host           : localhost:3306
Source Database       : film_shiro

Target Server Type    : MYSQL
Target Server Version : 50631
File Encoding         : 65001

Date: 2019-03-15 17:17:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `rid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
