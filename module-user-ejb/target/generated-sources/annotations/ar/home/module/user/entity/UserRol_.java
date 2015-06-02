package ar.home.module.user.entity;

import ar.home.module.user.entity.UserUser;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-06-02T02:48:35")
@StaticMetamodel(UserRol.class)
public class UserRol_ { 

    public static volatile SingularAttribute<UserRol, Integer> id;
    public static volatile SingularAttribute<UserRol, Integer> status;
    public static volatile SingularAttribute<UserRol, String> rol;
    public static volatile ListAttribute<UserRol, UserUser> userUserList;

}