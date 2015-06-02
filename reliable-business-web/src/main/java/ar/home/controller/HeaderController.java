/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.home.controller;

import ar.home.module.user.entity.PersonPerson;
import ar.home.module.user.entity.UserUser;
import ar.home.module.user.local.IPersonPerson;
import ar.home.module.user.local.IUserUser;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
/**
 *
 * @author Alex
 */
@ManagedBean(name = "headerController")
@ViewScoped
public class HeaderController implements Serializable {

    private static final int ROLE_ADMIN = 1;
    private static final int ROLE_USER = 2;

    @EJB
    private IUserUser userBean;
    @EJB
    private IPersonPerson personBean;

    private UserUser user = new UserUser();
    private PersonPerson person = new PersonPerson();

    @PostConstruct
    public void init() {
        String sessionUsername = (String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("username");
        user = userBean.readByUsername(sessionUsername);
        person = personBean.readByIdUser(user.getId());
    }

//    public void getLogedConfiguration(UserUser user) {
//        if (user.getIdRol().getId() == ROLE_ADMIN) {
////            headerTitle = "PERFIL USUARIO";
////                //Menu
//            menu = menuBean.getMenuByRole(ROLE_USER);
//        } else if (user.getIdRole().getId() == ROLE_RECLUTADOR) {
////            headerTitle = "PERFIL RECLUTADOR";
////                //Menu
//            menu = menuBean.getMenuByRole(ROLE_RECLUTADOR);
//        }
//
//    }

    public UserUser getUser() {
        return user;
    }

    public void setUser(UserUser user) {
        this.user = user;
    }

    public PersonPerson getPerson() {
        return person;
    }

    public void setPerson(PersonPerson person) {
        this.person = person;
    }
    

}
