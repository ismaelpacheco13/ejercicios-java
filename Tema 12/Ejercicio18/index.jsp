<%-- 
    Document   : index
    Created on : 17-feb-2020, 10:12:29
    Author     : alumnoismael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>Juego del Cubilete</title>
  </head>
  <body>
    <h1 style="text-align: center;">¡Bienvenido al Juego del Cubilete!</h1>
    <%
      int cubileteConBola = (int)(Math.random() * 3 + 1);
    %>
    
    <h2><% out.print(cubileteConBola); %></h2>
    <div class="container" style="text-align: center;">
      <div class="row">
        <div class="col">
          <img src="cubilete_tapando_bolas.png">
        </div>
        <div class="col">
          <img src="cubilete_tapando_bolas.png">
        </div>
        <div class="col">
          <img src="cubilete_tapando_bolas.png">
        </div>
      </div>
        <div class="row">
          <div class="col">
            <form action="cubilete1.jsp" method="POST">
            <button type="submit" name="cubilete0" class="btn btn-primary">Cubilete 1</button>
            </form>
          </div>
          <div class="col">
            <form action="cubilete2.jsp" method="POST">
            <button type="submit" name="cubilete1" class="btn btn-danger">Cubilete 2</button>
            </form>
          </div>
          <div class="col">
            <form action="cubilete3.jsp" method="POST">
            <button type="submit" name="cubilete2" class="btn btn-warning">Cubilete 3</button>
            </form>
          </div>
        </div>
    </div>
  </body>
</html>
