package ar.home.module.user.entity;

import ar.home.module.user.entity.PersonPerson;
import ar.home.module.user.entity.UserRol;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-06-02T02:48:35")
@StaticMetamodel(UserUser.class)
public class UserUser_ { 

    public static volatile SingularAttribute<UserUser, Integer> id;
    public static volatile SingularAttribute<UserUser, String> username;
    public static volatile SingularAttribute<UserUser, Boolean> status;
    public static volatile ListAttribute<UserUser, PersonPerson> personPersonList;
    public static volatile SingularAttribute<UserUser, String> password;
    public static volatile SingularAttribute<UserUser, UserRol> idRol;

}