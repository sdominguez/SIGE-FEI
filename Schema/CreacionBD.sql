-- MySQL Script generated by MySQL Workbench
-- Mon Jul  4 19:29:55 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema fei_examdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `fei_examdb` ;

-- -----------------------------------------------------
-- Schema fei_examdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `fei_examdb` DEFAULT CHARACTER SET utf8 ;
USE `fei_examdb` ;

-- -----------------------------------------------------
-- Table `fei_examdb`.`TypeQuiz`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fei_examdb`.`TypeQuiz` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `created_on` DATETIME NULL,
  `updated_on` DATETIME NULL,
  `created_by` VARCHAR(45) NULL DEFAULT 'DEFAULT',
  `updated_by` VARCHAR(45) NULL DEFAULT 'DEFAULT',
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `fei_examdb`.`Status`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fei_examdb`.`Status` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `created_on` DATETIME NULL,
  `updated_on` DATETIME NULL,
  `created_by` VARCHAR(45) NULL DEFAULT 'DEFAULT',
  `updated_by` VARCHAR(45) NULL DEFAULT 'DEFAULT',
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `fei_examdb`.`Quiz`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fei_examdb`.`Quiz` (
  `id_quiz` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `description` TEXT NULL,
  `open_date` DATETIME NULL,
  `close_date` DATETIME NULL,
  `time_minutes` INT NULL,
  `type_quiz_id` INT NOT NULL,
  `status_id` INT NOT NULL,
  `course_clave` VARCHAR(45) NOT NULL,
  `professor` VARCHAR(45) NOT NULL,
  `created_on` DATETIME NULL,
  `updated_on` DATETIME NULL,
  `created_by` VARCHAR(45) NULL DEFAULT 'DEFAULT',
  `updated_by` VARCHAR(45) NULL DEFAULT 'DEFAULT',
  PRIMARY KEY (`id_quiz`),
  INDEX `fk_Quiz_TypeQuiz_idx` (`type_quiz_id` ASC) VISIBLE,
  INDEX `fk_Quiz_Status1_idx` (`status_id` ASC) VISIBLE,
  CONSTRAINT `fk_Quiz_TypeQuiz`
    FOREIGN KEY (`type_quiz_id`)
    REFERENCES `fei_examdb`.`TypeQuiz` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Quiz_Status1`
    FOREIGN KEY (`status_id`)
    REFERENCES `fei_examdb`.`Status` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `fei_examdb`.`Question`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fei_examdb`.`Question` (
  `id_question` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `description` TEXT NOT NULL,
  `points` INT NOT NULL,
  `is_multiple` TINYINT NOT NULL,
  `created_on` DATETIME NULL,
  `updated_on` DATETIME NULL,
  `created_by` VARCHAR(45) NULL DEFAULT 'DEFAULT',
  `updated_by` VARCHAR(45) NULL DEFAULT 'DEFAULT',
  PRIMARY KEY (`id_question`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `fei_examdb`.`Quiz_Question`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fei_examdb`.`Quiz_Question` (
  `id_quiz` INT NOT NULL,
  `id_question` INT NOT NULL,
  `created_on` DATETIME NULL,
  `updated_on` DATETIME NULL,
  `created_by` VARCHAR(45) NULL DEFAULT 'DEFAULT',
  `updated_by` VARCHAR(45) NULL DEFAULT 'DEFAULT',
  PRIMARY KEY (`id_quiz`, `id_question`),
  INDEX `fk_Quiz_has_Question_Question1_idx` (`id_question` ASC) VISIBLE,
  INDEX `fk_Quiz_has_Question_Quiz1_idx` (`id_quiz` ASC) VISIBLE,
  CONSTRAINT `fk_Quiz_has_Question_Quiz1`
    FOREIGN KEY (`id_quiz`)
    REFERENCES `fei_examdb`.`Quiz` (`id_quiz`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Quiz_has_Question_Question1`
    FOREIGN KEY (`id_question`)
    REFERENCES `fei_examdb`.`Question` (`id_question`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `fei_examdb`.`OptionResponses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fei_examdb`.`OptionResponses` (
  `id_option` INT NOT NULL,
  `description` VARCHAR(200) NOT NULL,
  `percentage` INT NOT NULL,
  `id_question` INT NOT NULL,
  `created_on` DATETIME NULL,
  `updated_on` DATETIME NULL,
  `created_by` VARCHAR(45) NULL DEFAULT 'DEFAULT',
  `updated_by` VARCHAR(45) NULL DEFAULT 'DEFAULT',
  PRIMARY KEY (`id_option`, `id_question`),
  INDEX `fk_OptionResponses_Question1_idx` (`id_question` ASC) VISIBLE,
  CONSTRAINT `fk_OptionResponses_Question1`
    FOREIGN KEY (`id_question`)
    REFERENCES `fei_examdb`.`Question` (`id_question`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `fei_examdb`.`Try`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fei_examdb`.`Try` (
  `id_try` INT NOT NULL,
  `id_quiz` INT NOT NULL,
  `student` VARCHAR(45) NOT NULL,
  `time_init` DATETIME NULL,
  `time_finish` DATETIME NULL,
  PRIMARY KEY (`id_try`, `id_quiz`),
  INDEX `fk_Try_Quiz1_idx` (`id_quiz` ASC) VISIBLE,
  CONSTRAINT `fk_Try_Quiz1`
    FOREIGN KEY (`id_quiz`)
    REFERENCES `fei_examdb`.`Quiz` (`id_quiz`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `fei_examdb`.`Try_OptionResponses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fei_examdb`.`Try_OptionResponses` (
  `id_option` INT NOT NULL,
  `id_question` INT NOT NULL,
  `id_try` INT NOT NULL,
  `id_quiz` INT NOT NULL,
  `student` VARCHAR(45) NOT NULL,
  `answered_on` DATETIME NULL,
  PRIMARY KEY (`id_option`, `id_question`, `id_try`, `id_quiz`),
  INDEX `fk_OptionResponses_has_Try_Try1_idx` (`id_try` ASC, `id_quiz` ASC) VISIBLE,
  INDEX `fk_OptionResponses_has_Try_OptionResponses1_idx` (`id_option` ASC, `id_question` ASC) VISIBLE,
  CONSTRAINT `fk_OptionResponses_has_Try_OptionResponses1`
    FOREIGN KEY (`id_option` , `id_question`)
    REFERENCES `fei_examdb`.`OptionResponses` (`id_option` , `id_question`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_OptionResponses_has_Try_Try1`
    FOREIGN KEY (`id_try` , `id_quiz`)
    REFERENCES `fei_examdb`.`Try` (`id_try` , `id_quiz`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `fei_examdb`.`Rol`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fei_examdb`.`Rol` (
  `id_rol` INT NOT NULL,
  `name_rol` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_rol`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `fei_examdb`.`Users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fei_examdb`.`Users` (
  `id_users` INT NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(60) NOT NULL,
  `password` VARCHAR(45) NOT NULL DEFAULT '1234',
  `last_access` DATETIME NULL,
  `id_rol` INT NOT NULL,
  PRIMARY KEY (`id_users`),
  INDEX `fk_Users_Rol1_idx` (`id_rol` ASC) VISIBLE,
  CONSTRAINT `fk_Users_Rol1`
    FOREIGN KEY (`id_rol`)
    REFERENCES `fei_examdb`.`Rol` (`id_rol`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `fei_examdb`;

DELIMITER $$
USE `fei_examdb`$$
CREATE DEFINER = CURRENT_USER TRIGGER `fei_examdb`.`TypeQuiz_BEFORE_INSERT` BEFORE INSERT ON `TypeQuiz` FOR EACH ROW
BEGIN
	SET NEW.created_on = SYSDATE();
    SET NEW.updated_on = SYSDATE();
END$$

USE `fei_examdb`$$
CREATE DEFINER = CURRENT_USER TRIGGER `fei_examdb`.`TypeQuiz_BEFORE_UPDATE` BEFORE UPDATE ON `TypeQuiz` FOR EACH ROW
BEGIN
	SET NEW.updated_on = SYSDATE();
END$$

USE `fei_examdb`$$
CREATE DEFINER = CURRENT_USER TRIGGER `fei_examdb`.`Status_BEFORE_INSERT` BEFORE INSERT ON `Status` FOR EACH ROW
BEGIN
	SET NEW.created_on = SYSDATE();
    SET NEW.updated_on = SYSDATE();
END$$

USE `fei_examdb`$$
CREATE DEFINER = CURRENT_USER TRIGGER `fei_examdb`.`Status_BEFORE_UPDATE` BEFORE UPDATE ON `Status` FOR EACH ROW
BEGIN
    SET NEW.updated_on = SYSDATE();
END$$

USE `fei_examdb`$$
CREATE DEFINER = CURRENT_USER TRIGGER `fei_examdb`.`Quiz_BEFORE_INSERT` BEFORE INSERT ON `Quiz` FOR EACH ROW
BEGIN
	SET NEW.created_on = SYSDATE();
    SET NEW.updated_on = SYSDATE();
END$$

USE `fei_examdb`$$
CREATE DEFINER = CURRENT_USER TRIGGER `fei_examdb`.`Quiz_BEFORE_UPDATE` BEFORE UPDATE ON `Quiz` FOR EACH ROW
BEGIN
    SET NEW.updated_on = SYSDATE();
END$$

USE `fei_examdb`$$
CREATE DEFINER = CURRENT_USER TRIGGER `fei_examdb`.`Question_BEFORE_INSERT` BEFORE INSERT ON `Question` FOR EACH ROW
BEGIN
	SET NEW.created_on = SYSDATE();
    SET NEW.updated_on = SYSDATE();
END$$

USE `fei_examdb`$$
CREATE DEFINER = CURRENT_USER TRIGGER `fei_examdb`.`Question_BEFORE_UPDATE` BEFORE UPDATE ON `Question` FOR EACH ROW
BEGIN
    SET NEW.updated_on = SYSDATE();
END$$

USE `fei_examdb`$$
CREATE DEFINER = CURRENT_USER TRIGGER `fei_examdb`.`Quiz_Question_BEFORE_INSERT` BEFORE INSERT ON `Quiz_Question` FOR EACH ROW
BEGIN
	SET NEW.created_on = SYSDATE();
    SET NEW.updated_on = SYSDATE();
END$$

USE `fei_examdb`$$
CREATE DEFINER = CURRENT_USER TRIGGER `fei_examdb`.`Quiz_Question_BEFORE_UPDATE` BEFORE UPDATE ON `Quiz_Question` FOR EACH ROW
BEGIN
    SET NEW.updated_on = SYSDATE();
END$$

USE `fei_examdb`$$
CREATE DEFINER = CURRENT_USER TRIGGER `fei_examdb`.`OptionResponses_BEFORE_INSERT` BEFORE INSERT ON `OptionResponses` FOR EACH ROW
BEGIN
	SET NEW.created_on = SYSDATE();
    SET NEW.updated_on = SYSDATE();
END$$

USE `fei_examdb`$$
CREATE DEFINER = CURRENT_USER TRIGGER `fei_examdb`.`OptionResponses_BEFORE_UPDATE` BEFORE UPDATE ON `OptionResponses` FOR EACH ROW
BEGIN
    SET NEW.updated_on = SYSDATE();
END$$


DELIMITER ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
