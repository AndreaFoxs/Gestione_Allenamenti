<%@page import="java.util.ArrayList"%>
<%@page import="Gestione.Allenamenti.PersonalTrainer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="SceltaTrainer" method="post">
  
  Scegliere il tipo di allenamento<br>
  <select name="Allenamento">
  <% 
  List<String> listaAllenamenti = (ArrayList<String>)request.getAttribute("listaAllenamenti"); 
  if(listaAllenamenti!=null){
  for(String allenamenti : listaAllenamenti){
 
  %>
    <option value="<%=allenamenti%>"><%=allenamenti%></option>
    <%}}%>
  </select>
  <br><br>
  <input type="submit" value="Invia">
</form>

<form action="SceltaTrainer" method="post">
  
  Scegliere il trainer<br>
  <select name="trainer">
  <% 
  List<String> listaTrainer = (ArrayList<String>)request.getAttribute("listaTrainer"); 
  if(listaTrainer!=null){
  for(String trainer : listaTrainer ){
 
  %>
    <option value="<%=trainer%>"><%=trainer%></option>
    <%}}%>
  </select>
  <br><br>
  <input type="submit" value="Invia">
</form>

<form action="SceltaTrainer" method="post">
  <br>Scegli il giorno<br>
  <select name="giorno">
    <option value="Lunedi">Lunedi</option>
    <option value="Martedi">Martedi</option>
    <option value="Mercoledi">Mercoledi</option>
    <option value="Giovedi">Giovedi</option>
    <option value="Venerdi">Venerdi</option>
    <option value="Sabato">Sabato</option>
    <option value="Domenica">Domenica</option>
  </select>
  <br><br>
  <!-- <input type="submit"> -->
</form>
<form action="SceltaTrainer" method="post">
  Inserisci l'ora della prenotazione es(13:00) :<br>
  <input type="text" name="ora"><br>
<input type="submit">
</body>
</html>