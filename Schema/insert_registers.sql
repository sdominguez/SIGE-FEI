
USE fei_examdb;

INSERT INTO typequiz (`id`, `name`) VALUES ('1', 'PARCIAL');
INSERT INTO typequiz (`id`, `name`) VALUES ('2', 'ORDINARIO');
INSERT INTO typequiz (`id`, `name`) VALUES ('3', 'EXTRAORDINARIO');
INSERT INTO typequiz (`id`, `name`) VALUES ('4', 'TITULO');

INSERT INTO `fei_examdb`.`status` (`id`, `name`) VALUES ('0', 'CERRADO');
INSERT INTO `fei_examdb`.`status` (`id`, `name`) VALUES ('1', 'ABIERTO');
INSERT INTO `fei_examdb`.`status` (`id`, `name`) VALUES ('2', 'OCUPADO');

INSERT INTO `fei_examdb`.`rol` (`id_rol`, `name_rol`) VALUES ('1', 'PROFESOR');
INSERT INTO `fei_examdb`.`rol` (`id_rol`, `name_rol`) VALUES ('2', 'ESTUDIANTE');
