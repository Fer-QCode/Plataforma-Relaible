/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.home.controller;

import java.io.Serializable;
import java.security.Principal;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alex
 */
@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

    private String username;
    private String password;

    public String login() {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) fc.getExternalContext().getRequest();
        try {
            //Login per Servlet 3.0
            request.login(username, password);

            // Der Principal entspricht dem Usernamen
            Principal principal = request.getUserPrincipal();

            if (request.isUserInRole("admin")) {
                fc.getExternalContext().getSessionMap().put("username", principal.getName());
                return "/admin/panel-admin?faces-redirect=true";
            } else if (request.isUserInRole("usuario")) {
                fc.getExternalContext().getSessionMap().put("username", principal.getName());
                return "/usuario/panel-usuario?faces-redirect=true";
            } else {
                return "du_musst_die_rollen_noch_definieren";
            }
        } catch (Exception e) {
            addMessage(FacesMessage.SEVERITY_ERROR, "Login fallido", "Usuario y/o password incorrectos");
            System.out.println(e.getLocalizedMessage());
        }
        return "loginFailed";
    }

    public void logout() {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
        if (session != null) {
            session.invalidate();
        }
        fc.getApplication().getNavigationHandler().handleNavigation(fc, null, "/login/login?faces-redirect=true");
    }

    public void addMessage(FacesMessage.Severity severity, String summary, String detail) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, summary, detail));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
