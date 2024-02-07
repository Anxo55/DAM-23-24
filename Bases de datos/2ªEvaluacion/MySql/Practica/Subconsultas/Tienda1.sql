#1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT *
FROM producto
WHERE id_fabricante=(SELECT id FROM fabricante WHERE nombre="Lenovo");

#2. Devuelve todos los datos de los productos que tienen el mismo precio que el producto más caro 
#del fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT *
FROM producto
WHERE precio=(SELECT MAX(precio) FROM producto WHERE id_fabricante=(SELECT id FROM fabricante  WHERE nombre="Lenovo"));

#3. Lista el nombre del producto más caro del fabricante Lenovo.
SELECT *
FROM producto
WHERE precio=(SELECT MAX(precio) FROM producto WHERE nombre = "Lenovo");

#4. Lista el nombre del producto más barato del fabricante Hewlett-Packard.
SELECT *
FROM producto
WHERE precio=(SELECT MIN(precio) FROM producto WHERE id_fabricante=(SELECT id FROM fabricante WHERE nombre = "Hewlett-Packard"));

#5. Devuelve todos los productos de la base de datos que tienen un precio mayor o igual al 
#producto más caro del fabricante Lenovo.
SELECT *
FROM producto
WHERE precio >= (SELECT MAX(precio) FROM producto WHERE id_fabricante=(SELECT id FROM fabricante  WHERE nombre="Lenovo"));


#6. Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio de 
#todos sus productos
SELECT *
FROM producto
WHERE precio > (SELECT AVG(precio) FROM producto WHERE id_fabricante=(SELECT id FROM fabricante WHERE nombre = "Asus"));

#8. Devuelve el producto más caro que existe en la tabla producto sin hacer uso de MAX, ORDER 
#BY ni LIMIT.
SELECT *
FROM producto
WHERE precio=(SELECT precio FROM producto ORDER BY precio DESC LIMIT 1);

SELECT *
FROM producto
WHERE precio >= ALL(SELECT precio FROM producto);

#9. Devuelve el producto más barato que existe en la tabla producto sin hacer uso de MIN, ORDER 
#BY ni LIMIT.
SELECT *
FROM producto
WHERE precio <= ALL(SELECT precio FROM producto);

#10. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando ALL o ANY).
SELECT *
FROM fabricante
WHERE id = ANY  (SELECT id_Fabricante FROM Producto);

#11. Devuelve los nombres de los fabricantes que no tienen productos asociados. 
#(#Utilizando ALL o ANY).
SELECT nombre
FROM fabricante
WHERE id <> ANY  (SELECT id_Fabricante FROM Producto);

 
#Subconsultas con IN y NOT IN 
#12. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT 
#IN).
SELECT *
FROM fabricante
WHERE id  IN  (SELECT id_Fabricante FROM Producto);

#13. Devuelve los nombres de los fabricantes que no tienen productos asociados. 
#(Utilizando IN o NOT IN).
SELECT *
FROM fabricante
WHERE id  NOT IN  (SELECT id_Fabricante FROM Producto);

#1.1.7.4 Subconsultas con EXISTS y NOT EXISTS 

#14. Devuelve los nombres de los fabricantes que tienen productos asociados. 
#(Utilizando EXISTS o NOT EXISTS).
SELECT *
FROM fabricante
WHERE id = EXISTS (SELECT id_fabricante FROM producto);

#15. Devuelve los nombres de los fabricantes que no tienen productos asociados. 
#(Utilizando EXISTS o NOT EXISTS).
#SELECT *
#FROM fabricante
#WHERE id = EXISTS (SELECT id_fabricante FROM producto);

#Subconsultas correlacionadas 
#16. Lista el nombre de cada fabricante con el nombre y el precio de su producto más caro.
SELECT nombre,(SELECT MAX(precio) FROM producto WHERE id_fabricante=f.id) "Precio máximo",
(SELECT MIN(precio) FROM producto WHERE id_fabricante=f.id) "Precio mínimo"
FROM fabricante f;

#17. Devuelve un listado de todos los productos que tienen un precio mayor o igual a la media de 
#todos los productos de su mismo fabricante.
SELECT *
FROM Producto
WHERE precio>=(SELECT AVG(precio) FROM Producto);


#18. Lista el nombre del producto más caro del fabricante Lenovo.
SELECT nombre
FROM producto
WHERE precio=(SELECT MAX(precio) FROM producto WHERE fabricante LIKE 'Lenovo');
 
#Subconsultas (En la cláusula HAVING) 
#19. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número de 
#productos que el fabricante Lenovo