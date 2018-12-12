package com.spring.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
class EmployeeController {

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String addEmployee(HttpServletRequest request)  {
        String pathValue1 = request.getParameter("name");
        String pathValue2 = request.getParameter("id");
        String pathValue3 = request.getParameter("ContactNumber");
        String html =
                "<html>" +
                "<h1> Emloyee detail </h1>" +
                        "<h3 id=\"name\"> Name: " + pathValue1 + "</h3>" +
                        "<h3 id=\"id\"> Id: " + pathValue2 + "</h3>" +
                        "<h3 id=\"num\"> ContactNumber: " + pathValue3 + "</h3>" +
                "</html>";
        return html;
    }
}
