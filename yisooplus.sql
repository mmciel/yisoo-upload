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

 Date: 31/08/2019 19:33:31
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
-- Table structure for downlog
-- ----------------------------
DROP TABLE IF EXISTS `downlog`;
CREATE TABLE `downlog`  (
  `down_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '下载唯一id',
  `d_time` datetime NULL DEFAULT NULL COMMENT '下载的时间',
  `d_fileparent` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下载文件父目录',
  `d_filename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下载的文件名',
  `d_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下载的文件id（全部，单个 ，部分）',
  `d_ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下载的ip地址',
  `project_id` int(11) NULL DEFAULT NULL COMMENT '下载所属的项目',
  `yisooid_id` int(11) NULL DEFAULT NULL COMMENT '下载人',
  `d_md5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下载文件MD5\r\n',
  `d_hash` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'fileid的字符串',
  PRIMARY KEY (`down_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 58 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for fileinfo
-- ----------------------------
DROP TABLE IF EXISTS `fileinfo`;
CREATE TABLE `fileinfo`  (
  `file_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文件唯一标识',
  `g_id` int(11) NULL DEFAULT NULL COMMENT '文件提交者',
  `file_perm` int(11) NULL DEFAULT NULL COMMENT '文件权限',
  `project_id` int(11) NULL DEFAULT NULL COMMENT '项目id',
  `file_md5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件MD5',
  `file_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件名',
  `file_parent` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件的父目录',
  `file_size` double(32, 0) NULL DEFAULT NULL COMMENT '文件大小',
  `file_create` datetime NULL DEFAULT NULL COMMENT '文件创建日期',
  `file_suffix` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件后缀',
  `file_type` int(11) NULL DEFAULT NULL COMMENT '文件是否存在',
  PRIMARY KEY (`file_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 58 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
  `upload_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '提交返回码，用于下载本人文件 == upload_id',
  PRIMARY KEY (`upload_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 58 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

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
-- Table structure for viewinfo
-- ----------------------------
DROP TABLE IF EXISTS `viewinfo`;
CREATE TABLE `viewinfo`  (
  `view_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '查看id',
  `file_id` int(11) NULL DEFAULT NULL COMMENT '文件id',
  `pdf_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'pdf文件名',
  `v_time` datetime NULL DEFAULT NULL COMMENT '查看时间',
  `v_ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '查看地址',
  PRIMARY KEY (`view_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
