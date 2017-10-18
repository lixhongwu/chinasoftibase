/*
Navicat MySQL Data Transfer

Source Server         : chinasofti
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : mall

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2017-10-16 11:29:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cms_menu_manage
-- ----------------------------
DROP TABLE IF EXISTS `cms_menu_manage`;
CREATE TABLE `cms_menu_manage` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '类目ID',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父类目ID=0时，代表的是一级的类目',
  `name` varchar(50) DEFAULT NULL COMMENT '菜单名称',
  `status` int(1) DEFAULT '1' COMMENT '状态。可选值:1(正常),2(删除)',
  `is_parent` tinyint(1) DEFAULT '1' COMMENT '该类目是否为父类目，1为true，0为false',
  `created` datetime DEFAULT NULL COMMENT '创建时间',
  `updated` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `parent_id` (`parent_id`,`status`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='内容分类';

-- ----------------------------
-- Records of cms_menu_manage
-- ----------------------------
INSERT INTO `cms_menu_manage` VALUES ('1', '0', '商品管理', '1', '1', '2017-10-16 10:43:40', '2017-10-16 10:43:45');
INSERT INTO `cms_menu_manage` VALUES ('2', '0', '商品分类管理', '1', '1', '2017-10-16 10:44:06', '2017-10-16 10:44:08');
INSERT INTO `cms_menu_manage` VALUES ('3', '0', '订单管理', '1', '1', '2017-10-16 10:44:32', '2017-10-16 10:44:34');
INSERT INTO `cms_menu_manage` VALUES ('4', '0', '用户管理', '1', '1', '2017-10-16 10:44:47', '2017-10-16 10:44:48');
