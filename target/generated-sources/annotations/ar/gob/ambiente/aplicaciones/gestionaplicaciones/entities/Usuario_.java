package ar.gob.ambiente.aplicaciones.gestionaplicaciones.entities;

import ar.gob.ambiente.aplicaciones.gestionaplicaciones.entities.Aplicacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-05-15T17:32:47")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Long> id;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile ListAttribute<Usuario, Aplicacion> aplicaciones;
    public static volatile SingularAttribute<Usuario, String> persona;

}