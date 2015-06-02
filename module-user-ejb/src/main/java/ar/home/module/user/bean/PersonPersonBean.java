/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.home.module.user.bean;

import ar.home.module.user.entity.PersonPerson;
import ar.home.module.user.local.IPersonPerson;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alex
 */
@Stateless
public class PersonPersonBean implements IPersonPerson {

    @PersistenceContext(unitName = "reliable-business")
    private EntityManager em;

    @Override
    public PersonPerson read(int id) {
        try {
            return em.createQuery("SELECT pp FROM PersonPerson pp WHERE pp.id = :id ORDER BY pp.id", PersonPerson.class).setParameter("id", id).getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public PersonPerson readByIdUser(int idUser) {
        try {
            return em.createQuery("SELECT pp FROM PersonPerson pp WHERE pp.idUser.id = :idUser", PersonPerson.class).setParameter("idUser", idUser).getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
