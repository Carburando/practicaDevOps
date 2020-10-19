package prog3devops.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table (name="alumno")
//Problemas con lombok, plug-in instalado,compilador configurado, pom.xml en orden.Pero no he podido incluir las anotaciones lombok
//p
public class Alumno implements Serializable {
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column (name="email")
    private String email;
    @Column (name= "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @PrePersist
    public void prePersist (){
        this.createAt=new Date();
    }
}
