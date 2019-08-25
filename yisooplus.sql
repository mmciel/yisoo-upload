/*
 Navicat MySQL Data Transfer

 Source Server         : 本机
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : yisooplus

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 25/08/2019 15:07:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for air
-- ----------------------------
DROP TABLE IF EXISTS `air`;
CREATE TABLE `air`  (
  `air_id` int(32) NOT NULL AUTO_INCREMENT COMMENT '文件唯一ID',
  `air_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件名称',
  `air_md5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件MD5序列值',
  `air_num` int(32) NULL DEFAULT NULL COMMENT '可下载次数（-1为无限下载）',
  `air_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件存储地址',
  `air_date` datetime NULL DEFAULT NULL COMMENT '文件创建日期',
  `air_long` int(32) NULL DEFAULT NULL COMMENT '文件保存天数',
  `air_share` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件分享码',
  `air_size` int(32) NULL DEFAULT NULL COMMENT '文件尺寸',
  PRIMARY KEY (`air_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 101 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of air
-- ----------------------------
INSERT INTO `air` VALUES (80, 'java注解的理解.pdf', 'b4fdd5be23cee82227b32c1b438ab060', 55, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-12 16:14:36', 54, 'b4fdd5be23cee82227b32c1b438ab060', 4277892);
INSERT INTO `air` VALUES (81, 'java注解的理解.pdf', 'b4fdd5be23cee82227b32c1b438ab060', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-13 21:36:40', NULL, NULL, 4277892);
INSERT INTO `air` VALUES (82, 'example.xlsx', '01e20f6339a856948657f3017e40dff7', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:52:00', NULL, NULL, 9451);
INSERT INTO `air` VALUES (83, 'blob', 'cfd733d632fd7d395a325357dd1ef9fa', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:53:59', NULL, NULL, 1048576);
INSERT INTO `air` VALUES (84, 'blob', 'b58a60aadf7e61c49f86855117a76500', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:53:59', NULL, NULL, 1048576);
INSERT INTO `air` VALUES (85, 'blob', 'f06ee18415dc6d75431b25fa51d83a46', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:53:59', NULL, NULL, 1048576);
INSERT INTO `air` VALUES (86, 'blob', '6f74c1857a9b1904a8b2b2d43e4ca6fd', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:53:59', NULL, NULL, 1048576);
INSERT INTO `air` VALUES (87, 'blob', '381e36a5ba90ab220b0ab49f61aa6098', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:53:59', NULL, NULL, 1048576);
INSERT INTO `air` VALUES (88, 'blob', '76718fcdc114b6d25463e925a0a1cc3d', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:54:00', NULL, NULL, 1048576);
INSERT INTO `air` VALUES (89, 'blob', '0bb4e724e3490eda1bc475ffae732fa0', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:54:00', NULL, NULL, 1048576);
INSERT INTO `air` VALUES (90, 'blob', 'f7fddc2e139547244bb6a496d57f9013', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:54:00', NULL, NULL, 1048576);
INSERT INTO `air` VALUES (91, 'blob', '9439e2ac0f6a3ea232bb89983ca8ad2b', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:54:00', NULL, NULL, 1048576);
INSERT INTO `air` VALUES (92, 'blob', '9f20a6be25a00073427a660ce892cf6a', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:54:00', NULL, NULL, 1048576);
INSERT INTO `air` VALUES (93, 'blob', '3627e08b34312d2b77fd0b682b4e441f', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:54:00', NULL, NULL, 1048576);
INSERT INTO `air` VALUES (94, 'blob', 'f449235e0d2e1c6b0e21b192a2c04a34', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:54:00', NULL, NULL, 1048576);
INSERT INTO `air` VALUES (95, 'blob', '6f1b8898b4854ccf67051c8d6d888d5f', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:54:00', NULL, NULL, 1048576);
INSERT INTO `air` VALUES (96, 'blob', '71a3a20609d80deee52327bdd92fdab9', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:54:00', NULL, NULL, 1048576);
INSERT INTO `air` VALUES (97, 'blob', '87d7a2c34e5069785825d669dc7b3511', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:54:00', NULL, NULL, 912506);
INSERT INTO `air` VALUES (98, 'MF_RC522中文资料.pdf', '5a52aa47251678fbef6fb06b25bc6006', 89, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 19:54:37', 67, '5a52aa47251678fbef6fb06b25bc6006', 15592570);
INSERT INTO `air` VALUES (99, 'example.xlsx', '01e20f6339a856948657f3017e40dff7', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-15 20:02:13', NULL, NULL, 9451);
INSERT INTO `air` VALUES (100, 'MF_RC522中文资料.pdf', '5a52aa47251678fbef6fb06b25bc6006', NULL, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\air-warehouse', '2019-08-22 21:41:31', NULL, NULL, 15592570);

-- ----------------------------
-- Table structure for air_log
-- ----------------------------
DROP TABLE IF EXISTS `air_log`;
CREATE TABLE `air_log`  (
  `air_id` int(32) NULL DEFAULT NULL COMMENT '文件ID',
  `air_adress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'ip地址',
  `air_time` datetime NULL DEFAULT NULL COMMENT '时间',
  `air_flag` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '\"upload\"\"download\"'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of air_log
-- ----------------------------
INSERT INTO `air_log` VALUES (80, '127.0.0.1', '2019-08-12 16:14:38', 'upload');
INSERT INTO `air_log` VALUES (80, '127.0.0.1', '2019-08-12 16:14:48', 'download');
INSERT INTO `air_log` VALUES (80, '127.0.0.1', '2019-08-13 21:36:41', 'upload');
INSERT INTO `air_log` VALUES (80, '127.0.0.1', '2019-08-13 21:36:52', 'download');
INSERT INTO `air_log` VALUES (82, '127.0.0.1', '2019-08-15 19:52:00', 'upload');
INSERT INTO `air_log` VALUES (83, '127.0.0.1', '2019-08-15 19:53:59', 'upload');
INSERT INTO `air_log` VALUES (84, '127.0.0.1', '2019-08-15 19:53:59', 'upload');
INSERT INTO `air_log` VALUES (85, '127.0.0.1', '2019-08-15 19:53:59', 'upload');
INSERT INTO `air_log` VALUES (86, '127.0.0.1', '2019-08-15 19:53:59', 'upload');
INSERT INTO `air_log` VALUES (87, '127.0.0.1', '2019-08-15 19:54:00', 'upload');
INSERT INTO `air_log` VALUES (88, '127.0.0.1', '2019-08-15 19:54:00', 'upload');
INSERT INTO `air_log` VALUES (89, '127.0.0.1', '2019-08-15 19:54:00', 'upload');
INSERT INTO `air_log` VALUES (90, '127.0.0.1', '2019-08-15 19:54:00', 'upload');
INSERT INTO `air_log` VALUES (91, '127.0.0.1', '2019-08-15 19:54:00', 'upload');
INSERT INTO `air_log` VALUES (92, '127.0.0.1', '2019-08-15 19:54:00', 'upload');
INSERT INTO `air_log` VALUES (93, '127.0.0.1', '2019-08-15 19:54:00', 'upload');
INSERT INTO `air_log` VALUES (94, '127.0.0.1', '2019-08-15 19:54:00', 'upload');
INSERT INTO `air_log` VALUES (95, '127.0.0.1', '2019-08-15 19:54:00', 'upload');
INSERT INTO `air_log` VALUES (96, '127.0.0.1', '2019-08-15 19:54:00', 'upload');
INSERT INTO `air_log` VALUES (97, '127.0.0.1', '2019-08-15 19:54:00', 'upload');
INSERT INTO `air_log` VALUES (98, '127.0.0.1', '2019-08-15 19:54:37', 'upload');
INSERT INTO `air_log` VALUES (82, '127.0.0.1', '2019-08-15 20:02:13', 'upload');
INSERT INTO `air_log` VALUES (98, '127.0.0.1', '2019-08-22 21:41:33', 'upload');

-- ----------------------------
-- Table structure for fileinfo
-- ----------------------------
DROP TABLE IF EXISTS `fileinfo`;
CREATE TABLE `fileinfo`  (
  `file_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文件唯一标识',
  `file_perm` int(11) NULL DEFAULT NULL COMMENT '文件权限',
  `project_id` int(11) NULL DEFAULT NULL COMMENT '项目id',
  `file_md5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件MD5',
  `file_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件名',
  `file_parent` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件的父目录',
  `file_size` double(32, 0) NULL DEFAULT NULL COMMENT '文件大小',
  `file_create` datetime NULL DEFAULT NULL COMMENT '文件创建日期',
  `file_suffix` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件后缀',
  PRIMARY KEY (`file_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for groupdata
-- ----------------------------
DROP TABLE IF EXISTS `groupdata`;
CREATE TABLE `groupdata`  (
  `group_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '组ID',
  `yisoo_id` int(11) NULL DEFAULT NULL COMMENT '属于哪个用户',
  `g_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组名称',
  `is_num` tinyint(4) NULL DEFAULT NULL COMMENT '是否使用学号',
  `is_name` tinyint(255) NULL DEFAULT NULL COMMENT '是否使用名字',
  `is_class` tinyint(255) NULL DEFAULT NULL COMMENT '是否使用班级',
  `is_email` tinyint(255) NULL DEFAULT NULL COMMENT '是否使用email',
  `root_file_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件路径',
  `root_file_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件名',
  `root_file_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件类型',
  `root_file_md5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件名称(Md5加密)',
  PRIMARY KEY (`group_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 67 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of groupdata
-- ----------------------------
INSERT INTO `groupdata` VALUES (64, 3, '标准名单1', 1, 1, 1, 1, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\group-files', '1566049481360+1.xlsx', 'xlsx', '0e65c4e88fad24aa5a2ad2e9fee1ca0f');
INSERT INTO `groupdata` VALUES (65, 3, '标准二', 1, 1, 1, 1, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\group-files', '1566050573767+1.xlsx', 'xlsx', 'e9e2e6c30fc225c44d6f0c7e5b46ab56');
INSERT INTO `groupdata` VALUES (66, 3, '新一个测试组', 1, 1, 1, 1, 'D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\group-files', '1566292382423+1.xlsx', 'xlsx', '6a752b5f6fc2737b81a99e3f8c2bf8ce');

-- ----------------------------
-- Table structure for groupinfo
-- ----------------------------
DROP TABLE IF EXISTS `groupinfo`;
CREATE TABLE `groupinfo`  (
  `g_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一id数据',
  `group_id` int(11) NULL DEFAULT NULL COMMENT '组的标识',
  `g_number` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学号',
  `g_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `g_group` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '小组',
  `g_email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱，用于提醒',
  PRIMARY KEY (`g_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 157 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of groupinfo
-- ----------------------------
INSERT INTO `groupinfo` VALUES (1, 64, '541707090101', '曹梦颖', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (2, 64, '541707090102', '陈言凯', '物联网工程17-01', '761998183@qq.com');
INSERT INTO `groupinfo` VALUES (3, 64, '541707090103', '程陋石', '物联网工程17-01', '761998184@qq.com');
INSERT INTO `groupinfo` VALUES (4, 64, '541707090104', '丁悦', '物联网工程17-01', '761998185@qq.com');
INSERT INTO `groupinfo` VALUES (5, 64, '541707090105', '段国行', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (6, 64, '541707090106', '方铄', '物联网工程17-01', '761998183@qq.com');
INSERT INTO `groupinfo` VALUES (7, 64, '541707090107', '方宇', '物联网工程17-01', '761998184@qq.com');
INSERT INTO `groupinfo` VALUES (8, 64, '541707090108', '冯子尧', '物联网工程17-01', '761998185@qq.com');
INSERT INTO `groupinfo` VALUES (9, 64, '541707090109', '傅加文', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (10, 64, '541707090110', '高丽媛', '物联网工程17-01', '761998183@qq.com');
INSERT INTO `groupinfo` VALUES (11, 64, '541707090111', '谷文博', '物联网工程17-01', '761998184@qq.com');
INSERT INTO `groupinfo` VALUES (12, 64, '541707090112', '郭杰', '物联网工程17-01', '761998185@qq.com');
INSERT INTO `groupinfo` VALUES (13, 64, '541707090113', '韩禹', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (14, 64, '541707090115', '贾文文', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (15, 64, '541707090116', '蒋一铭', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (16, 64, '541707090117', '金智豪', '物联网工程17-01', '761998183@qq.com');
INSERT INTO `groupinfo` VALUES (17, 64, '541707090118', '靳超民', '物联网工程17-01', '761998184@qq.com');
INSERT INTO `groupinfo` VALUES (18, 64, '541707090119', '孔维业', '物联网工程17-01', '761998185@qq.com');
INSERT INTO `groupinfo` VALUES (19, 64, '541707090120', '雷东霖', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (20, 64, '541707090121', '李晨阳', '物联网工程17-01', '761998183@qq.com');
INSERT INTO `groupinfo` VALUES (21, 64, '541707090122', '李浩', '物联网工程17-01', '761998184@qq.com');
INSERT INTO `groupinfo` VALUES (22, 64, '541707090123', '李文豪', '物联网工程17-01', '761998185@qq.com');
INSERT INTO `groupinfo` VALUES (23, 64, '541707090124', '李宇霞', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (24, 64, '541707090125', '李卓', '物联网工程17-01', '761998183@qq.com');
INSERT INTO `groupinfo` VALUES (25, 64, '541707090126', '刘小妮', '物联网工程17-01', '761998184@qq.com');
INSERT INTO `groupinfo` VALUES (26, 64, '541707090127', '刘兴宇', '物联网工程17-01', '761998185@qq.com');
INSERT INTO `groupinfo` VALUES (27, 64, '541707090128', '刘亚炜', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (28, 64, '541707090130', '吕蓬伟', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (29, 64, '541707090131', '麻广霖', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (30, 64, '541707090132', '卯玉茜', '物联网工程17-01', '761998183@qq.com');
INSERT INTO `groupinfo` VALUES (31, 64, '541707090133', '聂锦宏', '物联网工程17-01', '761998184@qq.com');
INSERT INTO `groupinfo` VALUES (32, 64, '541707090134', '齐晓任', '物联网工程17-01', '761998185@qq.com');
INSERT INTO `groupinfo` VALUES (33, 64, '541707090135', '商飞', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (34, 64, '541707090136', '邵肖亚', '物联网工程17-01', '761998183@qq.com');
INSERT INTO `groupinfo` VALUES (35, 64, '541707090137', '孙大根', '物联网工程17-01', '761998184@qq.com');
INSERT INTO `groupinfo` VALUES (36, 64, '541707090138', '王辰轩', '物联网工程17-01', '761998185@qq.com');
INSERT INTO `groupinfo` VALUES (37, 64, '541707090140', '王洁', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (38, 64, '541707090141', '王一鸣', '物联网工程17-01', '761998183@qq.com');
INSERT INTO `groupinfo` VALUES (39, 64, '541707090142', '位少杰', '物联网工程17-01', '761998184@qq.com');
INSERT INTO `groupinfo` VALUES (40, 64, '541707090143', '夏鑫磊', '物联网工程17-01', '761998185@qq.com');
INSERT INTO `groupinfo` VALUES (41, 64, '541707090144', '肖明珂', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (42, 64, '5.41707090145E11', '徐文哲', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (43, 64, '541707090146', '闫玲玲', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (44, 64, '541707090147', '杨大宁', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (45, 64, '541707090148', '张海璇', '物联网工程17-01', '761998183@qq.com');
INSERT INTO `groupinfo` VALUES (46, 64, '541707090149', '张恒', '物联网工程17-01', '761998184@qq.com');
INSERT INTO `groupinfo` VALUES (47, 64, '541707090150', '张宇龙', '物联网工程17-01', '761998185@qq.com');
INSERT INTO `groupinfo` VALUES (48, 64, '541707090151', '张玉蛟', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (49, 64, '541707090152', '张志伟', '物联网工程17-01', '761998183@qq.com');
INSERT INTO `groupinfo` VALUES (50, 64, '541707090153', '赵芳震', '物联网工程17-01', '761998184@qq.com');
INSERT INTO `groupinfo` VALUES (51, 64, '541707090154', '赵新爽', '物联网工程17-01', '761998185@qq.com');
INSERT INTO `groupinfo` VALUES (52, 64, '541707090155', '赵星宇', '物联网工程17-01', '761998186@qq.com');
INSERT INTO `groupinfo` VALUES (53, 65, '541707090101', '曹梦颖', '物联网工程17-01', '1.0');
INSERT INTO `groupinfo` VALUES (54, 65, '541707090102', '陈言凯', '物联网工程17-01', '2.0');
INSERT INTO `groupinfo` VALUES (55, 65, '541707090103', '程陋石', '物联网工程17-01', '3.0');
INSERT INTO `groupinfo` VALUES (56, 65, '541707090104', '丁悦', '物联网工程17-01', '4.0');
INSERT INTO `groupinfo` VALUES (57, 65, '541707090105', '段国行', '物联网工程17-01', '5.0');
INSERT INTO `groupinfo` VALUES (58, 65, '541707090106', '方铄', '物联网工程17-01', '6.0');
INSERT INTO `groupinfo` VALUES (59, 65, '541707090107', '方宇', '物联网工程17-01', '7.0');
INSERT INTO `groupinfo` VALUES (60, 65, '541707090108', '冯子尧', '物联网工程17-01', '8.0');
INSERT INTO `groupinfo` VALUES (61, 65, '541707090109', '傅加文', '物联网工程17-01', '9.0');
INSERT INTO `groupinfo` VALUES (62, 65, '541707090110', '高丽媛', '物联网工程17-01', '10.0');
INSERT INTO `groupinfo` VALUES (63, 65, '541707090111', '谷文博', '物联网工程17-01', '11.0');
INSERT INTO `groupinfo` VALUES (64, 65, '541707090112', '郭杰', '物联网工程17-01', '12.0');
INSERT INTO `groupinfo` VALUES (65, 65, '541707090113', '韩禹', '物联网工程17-01', '13.0');
INSERT INTO `groupinfo` VALUES (66, 65, '541707090115', '贾文文', '物联网工程17-01', '14.0');
INSERT INTO `groupinfo` VALUES (67, 65, '541707090116', '蒋一铭', '物联网工程17-01', '15.0');
INSERT INTO `groupinfo` VALUES (68, 65, '541707090117', '金智豪', '物联网工程17-01', '16.0');
INSERT INTO `groupinfo` VALUES (69, 65, '541707090118', '靳超民', '物联网工程17-01', '17.0');
INSERT INTO `groupinfo` VALUES (70, 65, '541707090119', '孔维业', '物联网工程17-01', '18.0');
INSERT INTO `groupinfo` VALUES (71, 65, '541707090120', '雷东霖', '物联网工程17-01', '19.0');
INSERT INTO `groupinfo` VALUES (72, 65, '541707090121', '李晨阳', '物联网工程17-01', '20.0');
INSERT INTO `groupinfo` VALUES (73, 65, '541707090122', '李浩', '物联网工程17-01', '21.0');
INSERT INTO `groupinfo` VALUES (74, 65, '541707090123', '李文豪', '物联网工程17-01', '22.0');
INSERT INTO `groupinfo` VALUES (75, 65, '541707090124', '李宇霞', '物联网工程17-01', '23.0');
INSERT INTO `groupinfo` VALUES (76, 65, '541707090125', '李卓', '物联网工程17-01', '24.0');
INSERT INTO `groupinfo` VALUES (77, 65, '541707090126', '刘小妮', '物联网工程17-01', '25.0');
INSERT INTO `groupinfo` VALUES (78, 65, '541707090127', '刘兴宇', '物联网工程17-01', '26.0');
INSERT INTO `groupinfo` VALUES (79, 65, '541707090128', '刘亚炜', '物联网工程17-01', '27.0');
INSERT INTO `groupinfo` VALUES (80, 65, '541707090130', '吕蓬伟', '物联网工程17-01', '28.0');
INSERT INTO `groupinfo` VALUES (81, 65, '541707090131', '麻广霖', '物联网工程17-01', '29.0');
INSERT INTO `groupinfo` VALUES (82, 65, '541707090132', '卯玉茜', '物联网工程17-01', '30.0');
INSERT INTO `groupinfo` VALUES (83, 65, '541707090133', '聂锦宏', '物联网工程17-01', '31.0');
INSERT INTO `groupinfo` VALUES (84, 65, '541707090134', '齐晓任', '物联网工程17-01', '32.0');
INSERT INTO `groupinfo` VALUES (85, 65, '541707090135', '商飞', '物联网工程17-01', '33.0');
INSERT INTO `groupinfo` VALUES (86, 65, '541707090136', '邵肖亚', '物联网工程17-01', '34.0');
INSERT INTO `groupinfo` VALUES (87, 65, '541707090137', '孙大根', '物联网工程17-01', '35.0');
INSERT INTO `groupinfo` VALUES (88, 65, '541707090138', '王辰轩', '物联网工程17-01', '36.0');
INSERT INTO `groupinfo` VALUES (89, 65, '541707090140', '王洁', '物联网工程17-01', '37.0');
INSERT INTO `groupinfo` VALUES (90, 65, '541707090141', '王一鸣', '物联网工程17-01', '38.0');
INSERT INTO `groupinfo` VALUES (91, 65, '541707090142', '位少杰', '物联网工程17-01', '39.0');
INSERT INTO `groupinfo` VALUES (92, 65, '541707090143', '夏鑫磊', '物联网工程17-01', '40.0');
INSERT INTO `groupinfo` VALUES (93, 65, '541707090144', '肖明珂', '物联网工程17-01', '41.0');
INSERT INTO `groupinfo` VALUES (94, 65, '5.41707090145E11', '徐文哲', '物联网工程17-01', '42.0');
INSERT INTO `groupinfo` VALUES (95, 65, '541707090146', '闫玲玲', '物联网工程17-01', '43.0');
INSERT INTO `groupinfo` VALUES (96, 65, '541707090147', '杨大宁', '物联网工程17-01', '44.0');
INSERT INTO `groupinfo` VALUES (97, 65, '541707090148', '张海璇', '物联网工程17-01', '45.0');
INSERT INTO `groupinfo` VALUES (98, 65, '541707090149', '张恒', '物联网工程17-01', '46.0');
INSERT INTO `groupinfo` VALUES (99, 65, '541707090150', '张宇龙', '物联网工程17-01', '47.0');
INSERT INTO `groupinfo` VALUES (100, 65, '541707090151', '张玉蛟', '物联网工程17-01', '48.0');
INSERT INTO `groupinfo` VALUES (101, 65, '541707090152', '张志伟', '物联网工程17-01', '49.0');
INSERT INTO `groupinfo` VALUES (102, 65, '541707090153', '赵芳震', '物联网工程17-01', '50.0');
INSERT INTO `groupinfo` VALUES (103, 65, '541707090154', '赵新爽', '物联网工程17-01', '51.0');
INSERT INTO `groupinfo` VALUES (104, 65, '541707090155', '赵星宇', '物联网工程17-01', '52.0');
INSERT INTO `groupinfo` VALUES (105, 66, '541707090101', '曹梦颖', '物联网工程15-01', '1.0');
INSERT INTO `groupinfo` VALUES (106, 66, '541707090102', '陈言凯', '物联网工程15-01', '2.0');
INSERT INTO `groupinfo` VALUES (107, 66, '541707090103', '程陋石', '物联网工程15-01', '3.0');
INSERT INTO `groupinfo` VALUES (108, 66, '541707090104', '丁悦', '物联网工程15-01', '4.0');
INSERT INTO `groupinfo` VALUES (109, 66, '541707090105', '段国行', '物联网工程15-01', '5.0');
INSERT INTO `groupinfo` VALUES (110, 66, '541707090106', '方铄', '物联网工程15-01', '6.0');
INSERT INTO `groupinfo` VALUES (111, 66, '541707090107', '方宇', '物联网工程15-01', '7.0');
INSERT INTO `groupinfo` VALUES (112, 66, '541707090108', '冯子尧', '物联网工程15-01', '8.0');
INSERT INTO `groupinfo` VALUES (113, 66, '541707090109', '傅加文', '物联网工程15-01', '9.0');
INSERT INTO `groupinfo` VALUES (114, 66, '541707090110', '高丽媛', '物联网工程15-01', '10.0');
INSERT INTO `groupinfo` VALUES (115, 66, '541707090111', '谷文博', '物联网工程15-01', '11.0');
INSERT INTO `groupinfo` VALUES (116, 66, '541707090112', '郭杰', '物联网工程15-01', '12.0');
INSERT INTO `groupinfo` VALUES (117, 66, '541707090113', '韩禹', '物联网工程15-01', '13.0');
INSERT INTO `groupinfo` VALUES (118, 66, '541707090115', '贾文文', '物联网工程15-01', '14.0');
INSERT INTO `groupinfo` VALUES (119, 66, '541707090116', '蒋一铭', '物联网工程15-01', '15.0');
INSERT INTO `groupinfo` VALUES (120, 66, '541707090117', '金智豪', '物联网工程15-01', '16.0');
INSERT INTO `groupinfo` VALUES (121, 66, '541707090118', '靳超民', '物联网工程15-01', '17.0');
INSERT INTO `groupinfo` VALUES (122, 66, '541707090119', '孔维业', '物联网工程15-01', '18.0');
INSERT INTO `groupinfo` VALUES (123, 66, '541707090120', '雷东霖', '物联网工程15-01', '19.0');
INSERT INTO `groupinfo` VALUES (124, 66, '541707090121', '李晨阳', '物联网工程15-01', '20.0');
INSERT INTO `groupinfo` VALUES (125, 66, '541707090122', '李浩', '物联网工程15-01', '21.0');
INSERT INTO `groupinfo` VALUES (126, 66, '541707090123', '李文豪', '物联网工程15-01', '22.0');
INSERT INTO `groupinfo` VALUES (127, 66, '541707090124', '李宇霞', '物联网工程15-01', '23.0');
INSERT INTO `groupinfo` VALUES (128, 66, '541707090125', '李卓', '物联网工程15-01', '24.0');
INSERT INTO `groupinfo` VALUES (129, 66, '541707090126', '刘小妮', '物联网工程15-01', '25.0');
INSERT INTO `groupinfo` VALUES (130, 66, '541707090127', '刘兴宇', '物联网工程15-01', '26.0');
INSERT INTO `groupinfo` VALUES (131, 66, '541707090128', '刘亚炜', '物联网工程15-01', '27.0');
INSERT INTO `groupinfo` VALUES (132, 66, '541707090130', '吕蓬伟', '物联网工程15-01', '28.0');
INSERT INTO `groupinfo` VALUES (133, 66, '541707090131', '麻广霖', '物联网工程15-01', '29.0');
INSERT INTO `groupinfo` VALUES (134, 66, '541707090132', '卯玉茜', '物联网工程15-01', '30.0');
INSERT INTO `groupinfo` VALUES (135, 66, '541707090133', '聂锦宏', '物联网工程15-01', '31.0');
INSERT INTO `groupinfo` VALUES (136, 66, '541707090134', '齐晓任', '物联网工程15-01', '32.0');
INSERT INTO `groupinfo` VALUES (137, 66, '541707090135', '商飞', '物联网工程15-01', '33.0');
INSERT INTO `groupinfo` VALUES (138, 66, '541707090136', '邵肖亚', '物联网工程15-01', '34.0');
INSERT INTO `groupinfo` VALUES (139, 66, '541707090137', '孙大根', '物联网工程15-01', '35.0');
INSERT INTO `groupinfo` VALUES (140, 66, '541707090138', '王辰轩', '物联网工程15-01', '36.0');
INSERT INTO `groupinfo` VALUES (141, 66, '541707090140', '王洁', '物联网工程15-01', '37.0');
INSERT INTO `groupinfo` VALUES (142, 66, '541707090141', '王一鸣', '物联网工程15-01', '38.0');
INSERT INTO `groupinfo` VALUES (143, 66, '541707090142', '位少杰', '物联网工程15-01', '39.0');
INSERT INTO `groupinfo` VALUES (144, 66, '541707090143', '夏鑫磊', '物联网工程15-01', '40.0');
INSERT INTO `groupinfo` VALUES (145, 66, '541707090144', '肖明珂', '物联网工程15-01', '41.0');
INSERT INTO `groupinfo` VALUES (146, 66, '5.41707090145E11', '徐文哲', '物联网工程15-01', '42.0');
INSERT INTO `groupinfo` VALUES (147, 66, '541707090146', '闫玲玲', '物联网工程15-01', '43.0');
INSERT INTO `groupinfo` VALUES (148, 66, '541707090147', '杨大宁', '物联网工程15-01', '44.0');
INSERT INTO `groupinfo` VALUES (149, 66, '541707090148', '张海璇', '物联网工程15-01', '45.0');
INSERT INTO `groupinfo` VALUES (150, 66, '541707090149', '张恒', '物联网工程15-01', '46.0');
INSERT INTO `groupinfo` VALUES (151, 66, '541707090150', '张宇龙', '物联网工程15-01', '47.0');
INSERT INTO `groupinfo` VALUES (152, 66, '541707090151', '张玉蛟', '物联网工程15-01', '48.0');
INSERT INTO `groupinfo` VALUES (153, 66, '541707090152', '张志伟', '物联网工程15-01', '49.0');
INSERT INTO `groupinfo` VALUES (154, 66, '541707090153', '赵芳震', '物联网工程15-01', '50.0');
INSERT INTO `groupinfo` VALUES (155, 66, '541707090154', '赵新爽', '物联网工程15-01', '51.0');
INSERT INTO `groupinfo` VALUES (156, 66, '541707090155', '赵星宇', '物联网工程15-01', '52.0');

-- ----------------------------
-- Table structure for projectinfo
-- ----------------------------
DROP TABLE IF EXISTS `projectinfo`;
CREATE TABLE `projectinfo`  (
  `project_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '项目唯一标识',
  `yisoo_id` int(11) NULL DEFAULT NULL COMMENT '项目所有者',
  `p_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '项目标题',
  `p_word` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '项目内容',
  `p_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '项目存储的子目录地址',
  `p_status` int(11) NULL DEFAULT NULL COMMENT '项目当前状态',
  `p_group_id` int(11) NULL DEFAULT NULL COMMENT '项目采用的组',
  `p_group_is_class` tinyint(11) NULL DEFAULT NULL COMMENT '项目文件是否使用班级命名',
  `p_group_is_name` tinyint(11) NULL DEFAULT NULL COMMENT '项目文件是否使用姓名命名',
  `p_group_is_num` tinyint(11) NULL DEFAULT NULL COMMENT '项目文件是否使用学号命名',
  `p_group_is_email` tinyint(11) NULL DEFAULT NULL COMMENT '项目文件是否采用邮件',
  `is_share` tinyint(11) NULL DEFAULT NULL COMMENT '项目文件是否公开',
  `is_view` tinyint(11) NULL DEFAULT NULL COMMENT '项目提交信息是否公开到页面',
  `create_time` datetime NULL DEFAULT NULL COMMENT '项目创建日期',
  `start_time` datetime NULL DEFAULT NULL COMMENT '项目开始日期',
  `end_time` datetime NULL DEFAULT NULL COMMENT '项目结束日期',
  `is_remove` int(11) NULL DEFAULT NULL COMMENT '项目是否扔进了垃圾桶',
  PRIMARY KEY (`project_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of projectinfo
-- ----------------------------
INSERT INTO `projectinfo` VALUES (5, 3, '第一次作业', 'bujinjin', 'yid-3-pid-5', 1, 64, 0, 1, 1, 1, 1, 1, '2019-08-19 12:27:36', '2019-08-19 12:27:09', '2019-08-31 00:00:00', NULL);
INSERT INTO `projectinfo` VALUES (6, 3, '第二次作业', 'asdasd', 'yid-3-pid-6', 0, 65, 1, 1, 1, 1, 0, 1, '2019-08-19 12:32:22', '2019-08-19 12:31:23', '2019-08-28 00:00:00', NULL);
INSERT INTO `projectinfo` VALUES (9, 3, '测试主页面1', '爱啥啥大数据大卡司的哈死的骄傲时记得那时的泥沙及打隧道内爱的呢暗示大家都', 'yid-3-pid-9', 1, 64, 1, 1, 1, 1, 0, 1, '2019-08-21 20:57:23', '2019-08-21 20:57:11', '2019-08-30 00:00:00', 0);
INSERT INTO `projectinfo` VALUES (10, 3, '测试主页面2', '爱啥啥大数据大卡司的asdasd', 'yid-3-pid-10', 1, 64, 1, 1, 1, 1, 0, 1, '2019-08-21 20:57:44', '2019-08-07 20:57:11', '2019-08-30 00:00:00', 0);

-- ----------------------------
-- Table structure for uploadinfo
-- ----------------------------
DROP TABLE IF EXISTS `uploadinfo`;
CREATE TABLE `uploadinfo`  (
  `upload_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '提交唯一识别码',
  `project_id` int(11) NULL DEFAULT NULL COMMENT '提交来源于的项目',
  `g_id` int(11) NULL DEFAULT NULL COMMENT '提交人',
  `file_id` int(255) NULL DEFAULT NULL COMMENT '文件id',
  `upload_time` datetime NULL DEFAULT NULL COMMENT '提交时间',
  `upload_ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '提交IP',
  `upload_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '提交返回码，用于下载本人文件',
  PRIMARY KEY (`upload_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for userdata
-- ----------------------------
DROP TABLE IF EXISTS `userdata`;
CREATE TABLE `userdata`  (
  `yisoo_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一id',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录id',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱-用于找回密码',
  `user_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `login_status` int(11) NULL DEFAULT NULL COMMENT '登录状态',
  `login_last_ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最后一次登录IP',
  `login_last_time` datetime NULL DEFAULT NULL COMMENT '最后一次登录时间',
  `img_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `reg_time` datetime NULL DEFAULT NULL COMMENT '注册日期',
  `user_perm` int(11) NULL DEFAULT NULL COMMENT '权限',
  `other_1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留白1',
  `other_2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留白2',
  `other_3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留白3',
  PRIMARY KEY (`yisoo_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userdata
-- ----------------------------
INSERT INTO `userdata` VALUES (3, 'mmciel', '默认用户', '123456', '761998179@qq.com', '13283877393', 1, '127.0.0.1', '2019-08-22 22:05:28', NULL, '2019-08-14 21:29:42', 0, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
