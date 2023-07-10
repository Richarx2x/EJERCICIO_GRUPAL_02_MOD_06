<!DOCTYPE html>
<html lang="es">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<head>
    <title>Éxito</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/5.3.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="/views/style.css">
</head>
<body>

<header>
    <nav class="navbar navbar-default">
        <div class="container">
            <ul class="nav navbar-nav">
               <li><a href="/EJERCICIO_GRUPAL_02_MOD_06/">Inicio</a></li>
               <li><a href="/EJERCICIO_GRUPAL_02_MOD_06/contacto">Contacto</a></li>
               <li><a href="/EJERCICIO_GRUPAL_02_MOD_06/capacitaciones">Capacitaciones</a></li>
               <li><a href="/EJERCICIO_GRUPAL_02_MOD_06/capacitaciones/crear">Crear Capacitación</a></li>
            </ul>
        </div>
    </nav>
</header>

<!-- Cuerpo de la página -->
<div class="container mt-4">
    <h1>¡Capacitación creada con éxito!</h1>
    <p>Gracias por ingresar la capacitación.</p>
    <a href="/EJERCICIO_GRUPAL_02_MOD_06/capacitaciones/crear" class="btn btn-primary">Volver</a>
</div>

<!-- Agrega los enlaces a los archivos JavaScript de Bootstrap -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
