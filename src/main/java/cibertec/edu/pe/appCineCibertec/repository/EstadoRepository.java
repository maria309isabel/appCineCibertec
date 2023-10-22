package cibertec.edu.pe.appCineCibertec.repository;

import cibertec.edu.pe.appCineCibertec.model.bd.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
