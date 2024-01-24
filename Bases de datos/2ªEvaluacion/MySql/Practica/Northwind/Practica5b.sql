#Ejercicio 201
#Realizar una consulta que me muestre todas las columnas de la tabla de productos.
SELECT *
FROM Products;

#Ejercicio 202
#Realizar una consulta que me muestre el código, el nombre y el precio del producto.
SELECT ProductID, ProductName, UnitPrice
FROM Products;

#Ejercicio 203
#Realizar una consulta que me muestre el código, nombre y la categoría de los productos cuyo precio
#que estén entre 18.00 y 20.00.
SELECT ProductID, ProductName, UnitPrice
FROM Products
WHERE UnitPrice BETWEEN 18 AND 20;

#Ejercicio 204
#Realiza una consulta que permita presentar la fecha actual mediante una función.
SELECT NOW();

#Ejercicio 205
#Realiza una consulta que permita presentar los apellidos de los empleados en minúscula.
SELECT LOWER(LastName)
FROM Employees;

#Ejercicio 206
#Realiza una consulta que permita presentar el nombre y apellido, y un correo electrónico de los
#empleados, éste deberá tener los siguientes datos:
#a. La primera letra del nombre, seguida del apellido.
#b. El correo deberá presentarse en minúscula.
SELECT  CONCAT(LEFT(FirstName, 1), ' ', LastName) AS nombre_completo
FROM Employees;

#Ejercicio 207
#Realiza una consulta que permita presentar el nombre y apellidos de los empleados que tengan más
#de 40 años.

#Ejercicio 208
#Realiza una consulta que permita presentar el número de fax que tiene cada país.
#Ejercicio 209
#Realiza una consulta que permita presentar el máximo, mínimo y el promedio de años que llevan en
#la empresa los empleados.

#Ejercicio 210
#Realiza una consulta que permita presentar un listado de países que no tienen faxes con su
#respectiva cantidad de clientes.
#Ejercicio 210 bis
#Realiza una consulta que permita presentar un listado de países que no tienen faxes con su
#respectiva cantidad de clientes.

#Ejercicio 211
#Realiza una consulta que permita presentar el nombre del cliente, el fax y el país al que pertenece

#Ejercicio 212
#Realiza una consulta que muestre la mayor edad, la menor edad y la edad promedio de los
#empleados. Recuerde que para eso tiene que buscar la diferencia entre la fecha actual y la fecha de
#nacimiento.
#Ejercicio 213
#Realiza una consulta que muestre la cantidad de facturas que se han registrado por cada año (order
#date).

#Ejercicio 214
#Realiza una consulta que muestre la cantidad de facturas que se han registrado por cada año, mes y
#empleado.

#Ejercicio 215
#Realiza una consulta que me permita mostrar el número de la factura y el valor por concepto de
#envío.

#Ejercicio 216
#Realiza una consulta que me permita mostrar el número de la factura y el valor por concepto de
#envío pero de aquellos que superen a los 10.

#Ejercicio 217
#Realiza una consulta que muestre el código de la categoría, el total de productos que tiene la
#categoría únicamente para las categorías que tengan más de 10 productos. Para esto utilice la
#cláusula having.

#Ejercicio 218
#Realizar una consulta que permita presentar el nombre del producto y con su respetiva categoría.

#Ejercicio 219
#Realizar una búsqueda de los nombres de compañías con las cuales se ha tenido ventas, ordenar por
#el código del vendedor.

#Ejercicio 220
#Realiza una consulta que muestre el listado de las facturas de cada cliente. El listado debe tener las
#siguientes columnas: nombre del cliente, país del cliente no. De factura fecha de factura ordenado
#por nombre del cliente en forma ascendente y luego por la fecha de la factura de forma descendente.

#Ejercicio 221
#Búsqueda de los nombres de compañías con las cuales se ha tenido ventas, ordenar por el código del
#vendedor.