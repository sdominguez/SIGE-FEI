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

INSERT INTO `fei_examdb`.`quiz` (`name`, `description`, `open_date`, `close_date`, `time_minutes`, `type_quiz_id`, `status_id`, `course_clave`, `professor`) VALUES ('Parcial 1 DA', 'Primer examen parcial de la EE Desarrollo de Aplicaciones 2022', '2022-07-20 10:00', '2022-07-20 13:00', '70', '1', '1', 'DA4789', 'sauldominguez');

