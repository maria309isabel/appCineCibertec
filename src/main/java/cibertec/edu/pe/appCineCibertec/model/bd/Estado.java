package cibertec.edu.pe.appCineCibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idestado;
    @Column(name = "descestado")
    private String descestado;
}
