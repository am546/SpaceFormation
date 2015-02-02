package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Select extends HttpServlet {

    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

        ArrayList<Integer> parameterNames = new ArrayList<Integer>();
        String temp;
        Integer height = 35;
        Integer width = 60;

        temp = request.getParameter("nhsida_0");
        if (temp == "") {
            temp = "0";
        }
        parameterNames.add(Integer.parseInt(temp));
        temp = request.getParameter("nhsida_1");
        if (temp == "") {
            temp = "0";
        }
        parameterNames.add(Integer.parseInt(temp));
        temp = request.getParameter("nhsida_2");
        if (temp == "") {
            temp = "0";
        }
        parameterNames.add(Integer.parseInt(temp));
        temp = request.getParameter("nhsida_3");
        if (temp == "") {
            temp = "0";
        }
        parameterNames.add(Integer.parseInt(temp));
        temp = request.getParameter("nhsida_4");
        if (temp == "") {
            temp = "0";
        }
        parameterNames.add(Integer.parseInt(temp));
        temp = request.getParameter("nhsida_5");
        if (temp == "") {
            temp = "0";
        }
        parameterNames.add(Integer.parseInt(temp));

       
        Space ce = new Space(parameterNames, height, width);
        request.setAttribute("space",ce.getTypes());
        request.setAttribute("height", height);
        request.setAttribute("width", width);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }
}
