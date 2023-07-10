<!DOCTYPE html>
<html lang="es">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<head>
  <title>Página de contacto</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<header>
  <nav class="navbar navbar-default">
    <div class="container">
      <ul class="nav navbar-nav">
        <li><a href="/EJERCICIO_GRUPAL_02_MOD_06/">Inicio</a></li>
        <li class="active"><a href="#">Contacto</a></li>
        <li><a href="/EJERCICIO_GRUPAL_02_MOD_06/capacitaciones/crear">Capacitaciones</a></li>
      </ul>
    </div>
  </nav>
</header>

<div class="container">
  <h1>Contáctanos</h1>
  <form action="enviarConsulta.jsp" method="post">
    <div class="form-group">
      <label for="nombre">Nombre completo:</label>
      <input type="text" id="nombre" name="nombre" class="form-control" required>
    </div>
    <div class="form-group">
      <label for="email">Correo electrónico:</label>
      <input type="email" id="email" name="email" class="form-control" required>
    </div>
    <div class="form-group">
      <label for="consulta">Consulta:</label>
      <textarea id="consulta" name="consulta" class="form-control" required></textarea>
    </div>
    <button type="submit" class="btn btn-primary">Enviar consulta</button>
  </form>
</div>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>
</html>
