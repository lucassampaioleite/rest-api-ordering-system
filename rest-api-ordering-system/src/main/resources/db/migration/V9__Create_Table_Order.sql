CREATE TABLE `tb_order` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `moment` datetime(6) DEFAULT NULL,
  `order_status` int DEFAULT NULL,
  `client_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKi0x0rv7d65vsceuy33km9567n` (`client_id`),
  CONSTRAINT `FKi0x0rv7d65vsceuy33km9567n` FOREIGN KEY (`client_id`) REFERENCES `tb_user` (`id`)
); 
