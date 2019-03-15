/*
Navicat MySQL Data Transfer

Source Server         : 本地MYSQL
Source Server Version : 50631
Source Host           : localhost:3306
Source Database       : film_shiro

Target Server Type    : MYSQL
Target Server Version : 50631
File Encoding         : 65001

Date: 2019-03-15 17:17:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'rocky', '123456');
