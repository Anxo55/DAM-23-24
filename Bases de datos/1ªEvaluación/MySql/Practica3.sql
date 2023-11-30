#1-    Realizar una consulta que me muestre toda las
#columnas de la tabla de productos
SELECT *
FROM products;


#2-    Realizar una consulta que me muestre el código, el
#nombre y el precio del producto
SELECT ProductID, ProductName, UnitPrice
FROM products;


#3-    Realizar una consulta que me muestre el código,
#nombre y la categoría de los productos que estén entre 18.00 y 20.00
SELECT ProductID, ProductName, UnitPrice
FROM products
WHERE UnitPrice BETWEEN 18 AND 20;


#9-    Realiza una consulta que permita presentar el nombre
#y apellidos de los empleados que tengan más de 40 años
SELECT FirstName, LastName
FROM Employees
WHERE DATEDIFF(CURDATE(), BirthDate) > 40;
#corregir, está mal, usar CURDATE.


#10- Realiza una consulta que permita presentar el número
#de fax que tiene cada país


#11- Realiza una consulta que permita presentar el
#máximo, mínimo y el promedio de años que llevan en la empresa los empleados
SELECT *
FROM employees;


#14- Realiza
#una consulta que muestre la mayor edad, la menor edad y la edad promedio de los
#empleados. Recuerde que para eso tiene que buscar la diferencia entre la fecha
#actual y la fecha de nacimiento.


#16- Realiza
#una consulta que me permita mostrar el número de la factura y el valor por
#concepto de envío


#17- Realiza
#una consulta que me permita mostrar el número de la factura y el valor por
#concepto de envío pero de aquellos que superen a los 10.