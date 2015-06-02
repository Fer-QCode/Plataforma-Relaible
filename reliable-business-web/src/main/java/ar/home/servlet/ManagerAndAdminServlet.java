/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.home.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex
 */
@ServletSecurity(@HttpConstraint(rolesAllowed={"manager", "admin"}))
public class ManagerAndAdminServlet extends HttpServlet{
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//manager und admin dürfen rein, der employee bleibt draußen mit einer SecurityException
        }
    
}
