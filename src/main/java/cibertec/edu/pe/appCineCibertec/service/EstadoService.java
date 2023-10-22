package cibertec.edu.pe.appCineCibertec.service;

import cibertec.edu.pe.appCineCibertec.model.bd.Estado;
import cibertec.edu.pe.appCineCibertec.repository.EstadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class EstadoService {
    private EstadoRepository estadoRepository;

    public List<Estado> listarEstados() {
        return estadoRepository.findAll();
    }

    public boolean registrarEstado(Estado estado) {
        return estadoRepository.save(estado) != null;
    }

    public void eliminarEstado(Integer idestado) {
        estadoRepository.deleteById(idestado);
    }
}

