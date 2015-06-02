/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.home.module.user.bean;

import ar.home.module.user.entity.UserUser;
import ar.home.module.user.local.IUserUser;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alex
 */
@Stateless
public class UserUserBean implements IUserUser {

    @PersistenceContext(unitName = "reliable-business")
    private EntityManager em;

    @Override
    public UserUser read(int id) {
        try {
            return em.createQuery("SELECT uu FROM UserUser uu WHERE uu.id = :id ORDER BY uu.id", UserUser.class).setParameter("id", id).getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public UserUser readByUsername(String username) {
        try {
            return em.createQuery("SELECT uu FROM UserUser uu WHERE uu.username = :username", UserUser.class).setParameter("username", username).getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
