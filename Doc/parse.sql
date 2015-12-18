DROP TABLE `business` if EXISTS ;
CREATE TABLE `business` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(128) NOT NULL DEFAULT '''' COMMENT "商家名称",
  `descrp` varchar(1024) NOT NULL DEFAULT '' COMMENT "商家简介",
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT "商家状态",
  `key` varchar(512) NOT NULL DEFAULT '''' COMMENT "搜索关键字",
  `sort` tinyint(4) NOT NULL DEFAULT '0' COMMENT "排序值",
  `createTime` datetime NOT NULL COMMENT "创建时间",
  `modifyTime` datetime NOT NULL COMMENT "修改时间",
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
