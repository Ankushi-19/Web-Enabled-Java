<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h2>Email Valid or not?</h2>
    <form action="mailid.jsp" method="post">
       Enter Email: <input type="text" name="email" required>
        <input type="submit" value="Validate">
    </form>
    
    <%
        String email = request.getParameter("email");
        if (email != null) {
            
            String emailPattern = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]{2,}$";
            
            if (email.matches(emailPattern)) {
                int atPosition = email.indexOf("@");
                int dotPosition = email.lastIndexOf(".");
                
                if (atPosition > 0 && dotPosition > atPosition + 2 && email.indexOf("@", atPosition + 1) == -1) {
                    out.println("<p style='color:green;'>The email ID is valid.</p>");
                } else {
                    out.println("<p style='color:yellow;'>!!The email ID is invalid. Ensure it contains exactly one '@', at least one '.', and at least two characters between '@' and '.'.</p>");
                }
            } else {
                out.println("<p style='color:red;'>The email ID does not match the pattern.</p>");
            }
        }
    %>
</body>
</html>