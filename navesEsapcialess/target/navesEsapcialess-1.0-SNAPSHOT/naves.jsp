<%-- 
    Document   : naves
    Created on : 22/03/2023, 12:22:28 p. m.
    Author     : sebas
--%>
<link href="newcss.css" rel="stylesheet" type="text/css"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>La cantidad total de combustible necesario para la guerra es: ${total} litros </h1>
         <h3>La cantidad de Halcones Milenarios que se van a llevar a la guerras: ${halconcant}, el consumo total de las naves son: ${tot1} litros, y la cantidad de personas en esta nave es de: ${halconperson}<br></h3>
         <h3>La cantidad de Destructor Estelar que se van a llevar a la guerras: ${destructorcant}, el consumo total de las naves son: ${tot2} litros, y la cantidad de personas en esta nave es de: ${destructorperson}<br></h3>
         <h3>La cantidad de Lanzadera Imperial que se van a llevar a la guerras: ${lanzcant}, el consumo total de las naves son: ${tot3} litros, y la cantidad de personas en esta nave es de: ${lanzperson}<br></h3>
         <h3>La cantidad de Supremacy que se van a llevar a la guerras: ${supcant}, el consumo total del vehiculo es de: ${tot4} litros, y la cantidad de personas en este vehiculo es de: ${supperson}, este vehiculo va a cargar ${suptran} naves<br></h3>
         <h3>La At-At que se van a llevar a la guerras: ${atcant}, el consumo total de las naves son: ${tot5} litros, y la cantidad de personas en esta nave es de: ${atperson}<br></h3>
    </body>
</html>
