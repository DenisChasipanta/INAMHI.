package com.mycompany.solicitud.persistencia;

import com.mycompany.solicitud.logica.Persona;
import com.mycompany.solicitud.logica.Solicitud;
import com.mycompany.solicitud.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    PersonaJpaController personaJpa = new PersonaJpaController();
    SolicitudJpaController solicitudJpa = new SolicitudJpaController();

    public void guardar(Persona perso, Solicitud soli) {
        personaJpa.create(perso);

        solicitudJpa.create(soli);
    }

    public List<Solicitud> traerSolicitud() {
        return solicitudJpa.findSolicitudEntities();
    }

    public void borrarSolicitud(int num_codigo) {
        try {
            solicitudJpa.destroy(num_codigo);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Solicitud traerSolicitud(int num_codigo) {
        return solicitudJpa.findSolicitud(num_codigo);
    }

    public void modificarSolicitud(Solicitud soli) {
        try {
            solicitudJpa.edit(soli);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Persona traerPersona(int id_persona) {
        return personaJpa.findPersona(id_persona);
    }

    public void modificarPersona(Persona perso) {
        try {
            personaJpa.edit(perso);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
