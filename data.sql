USE `hospital`,

/* Medicos */
DELETE FROM `medicos`;
INSERT INTO `medicos` VALUES
(1,"164906015","Xaviera", "Hall"),
(2,"165708077","Olympia", "Mccall"),
(3,"162012249","Zachary", "Petty"),
(4,"163508236","Kai", "Garza"),
(5,"168807169","Wallace", "Trujillo");


/* Pacientes */
DELETE FROM `pacientes`;
INSERT INTO `pacientes` VALUES
(1,"166608194","Uriel", "Howe", "18", "calle, avenida", "correo@mail.com", "Quito"),
(2,"167209039","Amity", "Huffman", "38", "calle, avenida", "correo@mail.com", "Cuenca"),
(3,"163806073","Yvonne", "England", "68", "calle, avenida", "correo@mail.com", "Guayaquil"),
(4,"169101153","Lamar", "Mcclure", "22", "calle, avenida", "correo@mail.com", "Manta"),
(5,"169207079","Urielle", "Brock", "10", "calle, avenida", "correo@mail.com", "Loja");
