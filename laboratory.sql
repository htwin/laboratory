/*
Navicat MySQL Data Transfer

Source Server         : 47.102.120.6
Source Server Version : 50726
Source Host           : 47.102.120.6:3306
Source Database       : laboratory

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2019-05-15 19:18:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_apply
-- ----------------------------
DROP TABLE IF EXISTS `tb_apply`;
CREATE TABLE `tb_apply` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `applicant` varchar(255) DEFAULT NULL,
  `apply_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `apply_e_name` varchar(255) DEFAULT NULL,
  `apply_e_amount` varchar(255) DEFAULT NULL,
  `apply_e_factory` varchar(255) DEFAULT NULL,
  `apply_e_type` varchar(255) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `reason` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tb_apply
-- ----------------------------
INSERT INTO `tb_apply` VALUES ('2', '黄通', '2019-05-15 18:15:41', '设备1', '123', '四川绵阳', '123', '123.00', '实验室需要设备');
INSERT INTO `tb_apply` VALUES ('3', '1', '2019-05-15 18:16:25', '测试导出设备', '123', '123', '123', '123.00', '123');

-- ----------------------------
-- Table structure for tb_equipment
-- ----------------------------
DROP TABLE IF EXISTS `tb_equipment`;
CREATE TABLE `tb_equipment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `number` varchar(255) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `from_factory` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tb_equipment
-- ----------------------------
INSERT INTO `tb_equipment` VALUES ('2', '设备2', '型号yy', '2', '100.22', '12', '绵阳师范学院', '0', '2019-05-11 16:29:24');
INSERT INTO `tb_equipment` VALUES ('3', '设备3', '型号zz', '3', '15462.00', '13', '绵阳师范学院', '0', '2019-05-12 16:29:52');
INSERT INTO `tb_equipment` VALUES ('4', '设备4', '型号qq', '4', '123.20', '10', '信息工程学院', '0', '2019-05-12 16:30:17');
INSERT INTO `tb_equipment` VALUES ('5', '设备5', '型号ww', '5', '1547.00', '10', '四川德阳', '0', '2019-05-12 16:30:40');
INSERT INTO `tb_equipment` VALUES ('7', '设备6', '型号xyz6', '18', '10006.00', '6', '四川绵阳', '0', '2019-05-12 16:47:54');
INSERT INTO `tb_equipment` VALUES ('8', '设备7', '型号xyz7', '21', '10007.00', '7', '四川绵阳', '2', '2019-05-13 23:19:46');
INSERT INTO `tb_equipment` VALUES ('9', '设备8', '型号xyz8', '24', '10008.00', '8', '四川德阳', '2', '2019-05-13 15:09:17');
INSERT INTO `tb_equipment` VALUES ('10', '设备9', '型号xyz9', '27', '10009.00', '9', '四川绵阳', '2', '2019-05-13 16:59:56');
INSERT INTO `tb_equipment` VALUES ('11', '设备10', '型号xyz10', '30', '100010.00', '10', '四川绵阳', '2', '2019-05-13 23:16:34');
INSERT INTO `tb_equipment` VALUES ('12', '设备11', '型号xyz11', '33', '100011.00', '11', '四川成都', '2', '2019-05-13 23:16:40');
INSERT INTO `tb_equipment` VALUES ('13', '设备12', '型号xyz12', '36', '100012.00', '12', '四川绵阳', '2', '2019-05-14 12:49:43');
INSERT INTO `tb_equipment` VALUES ('14', '设备13', '型号xyz13', '39', '100013.00', '13', '四川绵阳', '1', '2019-05-14 12:46:48');
INSERT INTO `tb_equipment` VALUES ('15', '设备14', '型号xyz14', '42', '100014.00', '14', '四川绵阳', '2', '2019-05-14 12:49:54');
INSERT INTO `tb_equipment` VALUES ('16', '设备15', '型号xyz15', '45', '100015.00', '15', '四川绵阳', '1', '2019-05-14 12:48:01');
INSERT INTO `tb_equipment` VALUES ('19', '设备18', '型号xyz18', '54', '100018.00', '18', '四川绵阳', '1', '2019-05-15 15:38:17');
INSERT INTO `tb_equipment` VALUES ('20', '设备19', '型号xyz19', '57', '100019.00', '19', '四川绵阳', '2', '2019-05-15 15:42:12');
INSERT INTO `tb_equipment` VALUES ('21', '测试', '123', null, '149.00', '1', '四川绵阳', '0', '2019-05-02 00:00:00');
INSERT INTO `tb_equipment` VALUES ('23', '测试设备001', '10', null, '10.00', '10', '绵阳师范', '2', '2019-05-15 14:14:28');
INSERT INTO `tb_equipment` VALUES ('24', '测试123', 'xx型号', null, '123.00', '123', '绵阳师范', '0', '2019-05-15 00:00:00');

-- ----------------------------
-- Table structure for tb_repair
-- ----------------------------
DROP TABLE IF EXISTS `tb_repair`;
CREATE TABLE `tb_repair` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `repair_name` varchar(255) DEFAULT NULL,
  `repair_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `repair_price` decimal(10,2) DEFAULT NULL,
  `repair_factory` varchar(255) DEFAULT NULL,
  `equipment_id` int(11) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tb_repair
-- ----------------------------
INSERT INTO `tb_repair` VALUES ('9', '李四', '2019-05-14 00:00:00', '10.00', 'xxx', '16', '2019-05-14 12:47:23');
INSERT INTO `tb_repair` VALUES ('11', '黄通', null, null, null, '14', '2019-05-14 12:46:49');
INSERT INTO `tb_repair` VALUES ('12', '张三xx', null, null, null, '16', '2019-05-14 12:48:02');
INSERT INTO `tb_repair` VALUES ('15', 'ht', null, null, null, '19', '2019-05-15 15:38:17');

-- ----------------------------
-- Table structure for tb_scrap
-- ----------------------------
DROP TABLE IF EXISTS `tb_scrap`;
CREATE TABLE `tb_scrap` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `scrap_name` varchar(255) DEFAULT NULL,
  `scrap_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `equipment_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tb_scrap
-- ----------------------------
INSERT INTO `tb_scrap` VALUES ('6', '黄通', '2019-05-14 12:49:43', '13');
INSERT INTO `tb_scrap` VALUES ('12', 'ht', '2019-05-15 14:14:28', '23');
INSERT INTO `tb_scrap` VALUES ('13', '黄通', '2019-05-15 15:42:12', '20');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'htht', '226998');
SET FOREIGN_KEY_CHECKS=1;
