/*
 Navicat Premium Data Transfer

 Source Server         : work
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : agenda

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 05/07/2021 00:37:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int NOT NULL,
  `adminemail` varchar(255) NOT NULL,
  `adminname` varchar(255) DEFAULT NULL,
  `adminpassword` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
BEGIN;
INSERT INTO `admin` VALUES (1, 'admin@admin.com', '马庆（测试）', '123456');
COMMIT;

-- ----------------------------
-- Table structure for agen
-- ----------------------------
DROP TABLE IF EXISTS `agen`;
CREATE TABLE `agen` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `agen_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `agen_body` varchar(255) DEFAULT NULL,
  `agen_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`agen_title`),
  KEY `id` (`id`),
  KEY `name` (`username`),
  KEY `agen_title` (`agen_title`),
  KEY `agen_date` (`agen_date`),
  CONSTRAINT `name` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of agen
-- ----------------------------
BEGIN;
INSERT INTO `agen` VALUES (23, '庆哥', '123456789', '`12345678', '2021-07-01 00:00:00');
INSERT INTO `agen` VALUES (15, '庆哥', '321321', '312321', '2021-08-23 00:00:00');
INSERT INTO `agen` VALUES (22, '庆哥', '333', '3333', '2021-07-01 00:00:00');
INSERT INTO `agen` VALUES (9, '庆哥', 'dasdsada', 'dasdasdasdasdasdawewqeqweqw', '2021-06-30 23:04:33');
INSERT INTO `agen` VALUES (14, '庆哥', 'ddd', 'ddsadsadasd', '2021-07-01 01:06:33');
INSERT INTO `agen` VALUES (8, '庆哥', 'hhhhh', 'ghghghghgh', '2021-06-30 00:00:00');
INSERT INTO `agen` VALUES (21, '庆哥', 'sasas', 'sasasasa', '2021-07-01 00:00:00');
INSERT INTO `agen` VALUES (20, '庆哥', 'sss', 'ssss', '2021-07-01 00:00:00');
INSERT INTO `agen` VALUES (11, '庆哥', 'wwwwww', 'qqqqqqqqq', '2021-05-13 00:13:30');
INSERT INTO `agen` VALUES (24, '庆哥', '七月15', '大大的点点滴滴', '2021-07-15 00:00:00');
INSERT INTO `agen` VALUES (18, '庆哥', '七月1日', '的点点滴滴', '2021-07-01 00:00:00');
INSERT INTO `agen` VALUES (16, '庆哥', '七月2日', '呵呵呵呵呵呵呵呵呵额呵呵呵', '2021-07-02 00:00:00');
INSERT INTO `agen` VALUES (17, '庆哥', '七月3号', '日视图展示', '2021-07-03 00:00:00');
INSERT INTO `agen` VALUES (5, '庆哥', '呵呵', '人生恰如三月花，倾我一生一世念。来如飞花散似烟，醉里不知年华限。', '2021-06-29 00:00:00');
INSERT INTO `agen` VALUES (4, '庆哥', '很多事', '很多事犹如天气，慢慢热或者渐渐冷，等到惊悟，已过了一季。', '2021-06-28 00:00:00');
INSERT INTO `agen` VALUES (2, '庆哥', '测试标题', '❌：这是一条从数据库提取出来的数据', '2021-06-28 00:00:00');
INSERT INTO `agen` VALUES (3, '庆哥', '这个日程', 'dsadasdasdasdasdasdasdas', '2021-06-28 00:00:00');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `useremail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `role` varchar(255) DEFAULT NULL COMMENT '角色权限',
  PRIMARY KEY (`id`),
  KEY `name` (`username`),
  KEY `email` (`useremail`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, '123@123.com', '庆哥', '123', NULL);
INSERT INTO `user` VALUES (9, 'maqing377025773@gmail.com', '庆哥', '123', NULL);
INSERT INTO `user` VALUES (10, '121212@11.xxx', '庆哥', '123', NULL);
INSERT INTO `user` VALUES (11, 'test1@test.test', '庆哥', '123', NULL);
INSERT INTO `user` VALUES (13, 'test2@test.test', '庆哥', '123', NULL);
INSERT INTO `user` VALUES (15, 'test3@test.test', '庆哥', '123', NULL);
INSERT INTO `user` VALUES (16, 'dsq@123.com', '庆哥', '123', NULL);
INSERT INTO `user` VALUES (17, '1233@333.com', '庆哥', '123', NULL);
INSERT INTO `user` VALUES (18, 'maqing@163.com', '庆哥', '123', NULL);
INSERT INTO `user` VALUES (19, 'MQ@MQ.com', '庆哥', '123', NULL);
INSERT INTO `user` VALUES (20, 'hhh@hhh.com', '庆哥', '123', NULL);
INSERT INTO `user` VALUES (21, 'maqing377025773@gmail.com', '庆哥', '123', NULL);
INSERT INTO `user` VALUES (22, 'cgy@sunzi.com', '庆哥', '123', NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
