/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.home.module.user.local;

import ar.home.module.user.entity.UserUser;
import javax.ejb.Local;

/**
 *
 * @author Alex
 */
@Local
public interface IUserUser {
    public UserUser read(int id);
    public UserUser readByUsername(String username);
}
