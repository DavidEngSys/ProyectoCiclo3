CREATE DATABASE TECHNOLOGY;
USE TECHNOLOGY ;

CREATE TABLE  almacenes(
  id_almacen INT NOT NULL,
  nombre_almacen VARCHAR(45) ,
  direccion_almacen VARCHAR(200) ,
  telefono_almacen VARCHAR(45) , 
  PRIMARY KEY (id_almacen)
  );

CREATE TABLE usuarios (
  id_usuario BIGINT NOT NULL,
  nombre_completo VARCHAR(45) ,
  usuario VARCHAR(45) ,
  contrasena_usuario VARCHAR(45) ,
  genero TinyInt(2),
  perfil_Ususario TinyInt(2),
  PRIMARY KEY (id_usuario)

  );


CREATE TABLE productos (
  id_producto INT NOT NULL,
  descripcion_producto VARCHAR(45) ,
  cantidad_producto INT NOT NULL,
  id_almacen INT NOT NULL,
  PRIMARY KEY (id_producto),
  CONSTRAINT almacenes_id_almacen_FK FOREIGN KEY (id_almacen) REFERENCES almacenes (id_almacen)
   );
   
INSERT INTO almacenes VALUES (1,"almacen01","diag 15 #37 10",6364000);
INSERT INTO almacenes VALUES (2,"almacen02","kr 33 # 20 -15 ",6590175);
INSERT INTO almacenes VALUES (3,"almacen03","cc megamall",6340560);
INSERT INTO almacenes VALUES (4,"almacen04","cc el cacique",3111234569);
INSERT INTO almacenes VALUES (5,"Bodega PPAL","parque industrial",6163302);
INSERT INTO almacenes VALUES (6,"almacen 06","Bogota",NULL);
INSERT INTO almacenes VALUES (7,"almacen  07","Medellin",3154000);

INSERT INTO usuarios VALUES (1,"oscar alexis","oscar123",1234,1,1);
INSERT INTO usuarios VALUES (2,"david","david123",NULL,1,1);

INSERT INTO productos VALUES (1,"producto1",10,1);
INSERT INTO productos VALUES (2,"producto2",15,2);
INSERT INTO productos VALUES (3,"producto3",5,4);
INSERT INTO productos VALUES (4,"producto4",1,3);
