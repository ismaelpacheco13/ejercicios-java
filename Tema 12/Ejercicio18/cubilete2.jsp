
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
      int cubileteElegido = 2;
    %>
    
    <div class="container" style="text-align: center;">
      <div class="row">
        <div class="col">
          <img src="cubilete_sin_bola.png">
        </div>
        <div class="col">
          <%
            if (Integer.parseInt(request.getParameter("cubileteConBola")) == cubileteElegido) {
          %><img src="cubilete_con_1bola.png"><%
          } else {
          %><img src="cubilete_sin_bola.png"><%
          }
          %>
        </div>
        <div class="col">
          <img src="cubilete_sin_bola.png">
        </div>
      </div>
    </div>
  </body>
</html>
