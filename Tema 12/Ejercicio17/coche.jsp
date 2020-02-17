
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>Configurador coche</title>
  </head>
  <body>
    <h1 style="text-align: center;">Aquí tiene su coche personalizado</h1>
    <%
      String tapiceria = request.getParameter("color");
      String moldura = request.getParameter("moldura");
      String imagen = tapiceria + moldura + ".jpg";
    %>
    <img src="<%= imagen %>">
    <a style="margin-left: 15px; margin-top: 15px;" href="index.jsp" type="button" class="btn btn-dark btn-lg">Volver</a>
  </body>
</html>
