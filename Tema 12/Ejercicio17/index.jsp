
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>Configurador coche</title>
  </head>
  <body>
    <h1 style="text-align: center">Bienvenido al configurador de coches de Ismael</h1>
    <form action="coche.jsp" method="POST">
      <div class="form-group">
        <label for="colorTapiceria">Color tapiceria</label>
        <select name="color" class="form-control" id="colorTapiceria">
          <option value="blanco">Blanco</option>
          <option value="negro">Negro</option>
          <option value="berenjena">Berenjena</option>
        </select>
      </div>
      <div class="form-group">
        <label for="materialMolduras">Material molduras</label>
        <select name="moldura" class="form-control" id="materialMolduras">
          <option value="madera">Madera</option>
          <option value="carbono">Carbono</option>
        </select>
      </div>
      <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
  </body>
</html>
