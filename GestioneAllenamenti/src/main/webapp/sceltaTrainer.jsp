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
  <select name="Allenamento">
  <% 
  List<PersonalTrainer> listaTrainer = (ArrayList<PersonalTrainer>)request.getAttribute("listaTrainer"); 
  if(listaTrainer!=null);
  for(PersonalTrainer personal : listaTrainer ){
 
  %>
    <option value="<%=personal.getSettoreAllenamento()%>"><%=personal.getSettoreAllenamento()%></option>
    <%}%>
  </select>
  <br><br>
  <input type="submit" value="Invia">
</form>
</body>
</html>