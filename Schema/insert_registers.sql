USE fei_examdb;

INSERT INTO typequiz (`name`) VALUES ('PARCIAL');
INSERT INTO typequiz (`name`) VALUES ('ORDINARIO');
INSERT INTO typequiz (`name`) VALUES ('EXTRAORDINARIO');
INSERT INTO typequiz (`name`) VALUES ('TITULO');

INSERT INTO `fei_examdb`.`status` (`name`) VALUES ('CERRADO');
INSERT INTO `fei_examdb`.`status` (`name`) VALUES ('ABIERTO');
INSERT INTO `fei_examdb`.`status` (`name`) VALUES ('OCUPADO');


INSERT INTO `fei_examdb`.`rol` (`id_rol`, `name_rol`) VALUES ('1', 'PROFESOR');
INSERT INTO `fei_examdb`.`rol` (`id_rol`, `name_rol`) VALUES ('2', 'ESTUDIANTE');

INSERT INTO `fei_examdb`.`users` (`id_users`, `user_name`, `password`, `id_rol`) VALUES ('1', 'sauldominguez', '123456', '1');
