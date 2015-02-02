<%-- 
    Document   : result
    Created on : Jan 30, 2015, 3:27:01 PM
    Author     : atsou
--%>
<%@ page import="java.util.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <br>
    <br>
    <br>
    <br>
    
        <%
            char[][] space = (char[][]) request.getAttribute("space");
            Integer height = (Integer) request.getAttribute("height");
            Integer width = (Integer) request.getAttribute("width");
            %>
            
        <link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />


    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Formatted Space</title>
    </head>
    <body>
      
        <%
        if (space[0][0] == 'f') {
                out.print("it doesn't fit!");
            } else {
            out.print("<table>\n");
                for (int i = 0; i < height + 2; i++) {
                    out.print("\t<tr>\n");
                    for (int j = 0; j < width + 2; j++) {
                        out.print("\t\t<td><img src=\"img/" + space[i][j] + ".png\"></td>\n");
                    }
                    out.print("\t</tr>\n");
                }
            }
            out.print("</table>");
            
        %>
       

    </body>
</html>
