SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `Emp_Mgmt_System` ;
USE `Emp_Mgmt_System` ;

-- -----------------------------------------------------
-- Table `Emp_Mgmt_System`.`department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Emp_Mgmt_System`.`department` (
  `department_id` BIGINT NOT NULL,
  `department_name` ENUM('JAVA','PHP','ROR','DEVOPS','UI/UX') NULL,
  `department_description` VARCHAR(45) NULL,
  PRIMARY KEY (`department_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Emp_Mgmt_System`.`salary`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Emp_Mgmt_System`.`salary` (
  `salary_id` BIGINT NOT NULL,
  `basic_salary` DOUBLE NULL,
  `internet_incentive` DOUBLE NULL DEFAULT 600,
  `laptop_incentive` DOUBLE NULL DEFAULT 1500,
  `bonus_salary` DOUBLE NULL,
  PRIMARY KEY (`salary_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Emp_Mgmt_System`.`designation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Emp_Mgmt_System`.`designation` (
  `designation_id` BIGINT NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `title_description` VARCHAR(45) NULL,
  PRIMARY KEY (`designation_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Emp_Mgmt_System`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Emp_Mgmt_System`.`employee` (
  `employee_id` INT NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `middle_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `department` BIGINT NULL,
  `designation` BIGINT NULL,
  `salary` BIGINT NULL,
  PRIMARY KEY (`employee_id`),
  INDEX `fk_Department_idx` (`department` ASC, `salary` ASC),
  INDEX `fk_Salary_idx` (`salary` ASC),
  INDEX `fk_designation_idx` (`designation` ASC),
  CONSTRAINT `fk_department_id`
    FOREIGN KEY (`department` , `salary`)
    REFERENCES `Emp_Mgmt_System`.`department` (`department_id` , `department_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_salary_id`
    FOREIGN KEY (`salary`)
    REFERENCES `Emp_Mgmt_System`.`salary` (`salary_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_designation_id`
    FOREIGN KEY (`designation`)
    REFERENCES `Emp_Mgmt_System`.`designation` (`designation_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
