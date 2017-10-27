/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : spring_batch_example

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2016-12-01 09:28:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(128) NOT NULL,
  `DESCRIPTION` varchar(128) default NULL,
  `QUANTITY` int(11) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
