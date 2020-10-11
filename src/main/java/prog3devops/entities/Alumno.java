package prog3devops.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name="alumno")
@Data
@AllArgsConstructor
@NoArgsConstructor

//Problemas con lombok, plug-in instalado,compilador configurado, pom.xml en orden.Pero no he podido incluir las anotaciones lombok

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
