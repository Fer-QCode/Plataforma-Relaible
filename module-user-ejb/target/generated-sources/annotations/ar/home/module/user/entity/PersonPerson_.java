package ar.home.module.user.entity;

import ar.home.module.user.entity.UserUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2015-06-02T02:48:35")
@StaticMetamodel(PersonPerson.class)
public class PersonPerson_ { 

    public static volatile SingularAttribute<PersonPerson, String> nombre;
    public static volatile SingularAttribute<PersonPerson, Integer> id;
    public static volatile SingularAttribute<PersonPerson, Integer> genero;
    public static volatile SingularAttribute<PersonPerson, Boolean> status;
    public static volatile SingularAttribute<PersonPerson, Integer> edad;
    public static volatile SingularAttribute<PersonPerson, Integer> idArea;
    public static volatile SingularAttribute<PersonPerson, Integer> idEstado;
    public static volatile SingularAttribute<PersonPerson, String> apellidoMaterno;
    public static volatile SingularAttribute<PersonPerson, UserUser> idUser;
    public static volatile SingularAttribute<PersonPerson, String> apellidoPaterno;
    public static volatile SingularAttribute<PersonPerson, Integer> idOperacion;
    public static volatile SingularAttribute<PersonPerson, Date> fechaNacimiento;

}