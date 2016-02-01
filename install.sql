CREATE OR REPLACE DATABASE `hospital`;
USE `hospital`;

CREATE OR REPLACE TABLE `medicos`
(
    `id_medico` integer,
    `cedula`    varchar(10) NOT NULL,
    `nombre`    varchar(50) NOT NULL,
    `apellido`  varchar(50) NOT NULL
) ENGINE = InnoDB;

CREATE OR REPLACE TABLE `pacientes`
(
    `id_paciente` integer,
    `cedula`      varchar(10) NOT NULL,
    `nombre`      varchar(50) NOT NULL,
    `apellido`    varchar(50) NOT NULL,
    `edad`        integer NOT NULL,
    `direccion`   varchar(50) NOT NULL,
    `email`       varchar(50) NOT NULL,
    `procedencia` varchar(50) NOT NULL
) ENGINE = InnoDB;

CREATE OR REPLACE TABLE `examenes`
(
    `id_examen` integer,
    `fecha`          date NOT NULL,
    `diagnostico`    varchar(50) NOT NULL,
    `examen`         varchar(50) NOT NULL,
    `medico`         integer NOT NULL,
    `paciente`       integer NOT NULL
) ENGINE = InnoDB;

/* CREATE OR REPLACE TABLE `facturas` */
/* ( */
/*     `id_factura` integer, */
/*     `cliente`    integer NOT NULL, */
/*     `fecha`      date NOT NULL, */
/*     `valor`      float NOT NULL, */
/*     `pagado`     boolean NOT NULL */
/* ) ENGINE = InnoDB; */

/* CREATE OR REPLACE TABLE `facturas_clientes` */
/* ( */
/*     `id_cliente` integer, */
/*     `id_factura` integer NOT NULL */
/* ) ENGINE = InnoDB; */

/* CREATE OR REPLACE TABLE `eventos` */
/* ( */
/*     `id_evento`   integer, */
/*     `fecha`       date NOT NULL, */
/*     `descripcion` varchar(50) NOT NULL */
/* ) ENGINE = InnoDB; */


CREATE OR REPLACE USER 'usuario'@'localhost' identified by '1234';
grant all privileges on hospital.* to 'usuario'@'localhost';
