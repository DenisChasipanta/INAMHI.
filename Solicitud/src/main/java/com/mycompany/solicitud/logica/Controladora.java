package com.mycompany.solicitud.logica;

import com.mycompany.solicitud.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String codigo, String nombreFuncionario, String direccion, String email, String tipoRegistro, String fecha, String tipoEquipo,
            String sistemaOperativo, String procesador, String tipoDisco, String ram, String capacidad, String marcaDisco, String marcaCase, String marcaMonitor,
            String marcaTeclado, String maracaMouse, String marcaUps, String maracaParlantes, String marcaMemoriaRam, String marcaCamara, String marcaBateria,
            String marcaCargadorPortatil, String marcaMicrofono, String marcaTajetaRed, String modeloDisco, String modeloCase, String modeloMonitor,
            String modeloTeclado, String modeloMouse, String modeloUps, String modeloParlantes, String modeloMemoriaRam, String modeloCamara, String modeloBateria,
            String modeloCargadorPortatil, String modeloMicrofono, String modeloTarjetaRed, String serieDisco, String serieCase, String serieMonitor, String serieTeclado,
            String serieMouse, String serieUps, String serieParlantes, String serieMemoriaRam, String serieCamara, String serieBateria, String serieCargadorPortatil,
            String serieMicrofono, String serieTarjetaRed, String estadoDisco, String estadoCase, String estadoMonitor, String estadoTeclado, String estadoMouse,
            String estadoUps, String estadoParlantes, String estadoMemoriaRam, String estadoCamara, String estadoBateria, String estadoCargadorPortatil,
            String estadoMicrofono, String estadoTarjetaRed, String observacionDisco, String observacionCase, String observacionMonitor, String observacionTeclado,
            String observacionMouse, String observacionUps, String observacionParlantes, String observacionMemoriaRam, String observacionCamara, String observacionBateria,
            String observacionCargadorPortatil, String observacionMicrofono, String observacionTarjetaRed, String funcionaCableEnegia, String funcionaTouchpad,
            String funcionaLector, String funcionaLectorTarjetas, String funcionaPuertoEthernet, String observacionCableEnergia, String observacionTouchpad,
            String observacionLector, String observacionLectorTarjetas, String observacionPuertoEthernet, String funcionaPuertoHDMI, String funcionaPuertoVGA,
            String funcionaIndicadoresLuminosos, String funcionaSalidaAudio, String funcionaWifi, String observacionPuertoHDMI, String observacionPuertoVGA,
            String observacionIndicadoresLuminosos, String observacionLectorSalidaAudio, String observacionWifi, String mantenimiento, String revisado, String recibido,
            String cargoRevisado, String cargoRecibido) {
        Persona perso = new Persona();
        perso.setNombre(nombreFuncionario);

        Solicitud soli = new Solicitud();
        soli.setCodigo(codigo);
        soli.setUnPersona(perso);
        soli.setNombre_funcionario(nombreFuncionario);
        soli.setDireccion(direccion);
        soli.setEmail(email);
        soli.setTipo_registro(tipoRegistro);
        soli.setFecha(fecha);
        soli.setTipo_equipo(tipoEquipo);
        soli.setSistema_operativo(sistemaOperativo);
        soli.setProcesador(procesador);
        soli.setTipo_disco(tipoDisco);
        soli.setRam(ram);
        soli.setCapacidad_disco(capacidad);
        soli.setMarca_discoDuro(marcaDisco);
        soli.setMarca_case(marcaCase);
        soli.setMarca_monitor(marcaMonitor);
        soli.setMarca_teclado(marcaTeclado);
        soli.setMarca_mouse(maracaMouse);
        soli.setMarca_ups(marcaUps);
        soli.setMarca_parlantes(maracaParlantes);
        soli.setMarca_memoriaRam(marcaMemoriaRam);
        soli.setMarca_camara(marcaCamara);
        soli.setMarca_bateria(marcaBateria);
        soli.setMarca_cargadorPortatil(marcaCargadorPortatil);
        soli.setMarca_microfono(marcaMicrofono);
        soli.setMarca_tarjetaRed(marcaTajetaRed);
        soli.setModelo_discoDuro(modeloDisco);
        soli.setModelo_case(modeloCase);
        soli.setModelo_monitor(modeloMonitor);
        soli.setModelo_teclado(modeloTeclado);
        soli.setModelo_mouse(modeloMouse);
        soli.setModelo_ups(modeloUps);
        soli.setModelo_parlantes(modeloParlantes);
        soli.setModelo_memoriaRam(modeloMemoriaRam);
        soli.setModelo_camara(modeloCamara);
        soli.setModelo_bateria(modeloBateria);
        soli.setModelo_cargadorPortatil(modeloCargadorPortatil);
        soli.setModelo_microfono(modeloMicrofono);
        soli.setModelo_tarjetaRed(modeloTarjetaRed);
        soli.setSerie_discoDuro(serieDisco);
        soli.setSerie_case(serieCase);
        soli.setSerie_monitor(serieMonitor);
        soli.setSerie_teclado(serieTeclado);
        soli.setSerie_mouse(serieMouse);
        soli.setSerie_ups(serieUps);
        soli.setSerie_parlantes(serieParlantes);
        soli.setSerie_memoriaRam(serieMemoriaRam);
        soli.setSerie_camara(serieCamara);
        soli.setSerie_bateria(serieBateria);
        soli.setSerie_cargadorPortatil(serieCargadorPortatil);
        soli.setSerie_microfono(serieMicrofono);
        soli.setSerie_tarjetaRed(serieTarjetaRed);
        soli.setEstado_discoDuro(estadoDisco);
        soli.setEstado_case(estadoCase);
        soli.setEstado_monitor(estadoMonitor);
        soli.setEstado_teclado(estadoTeclado);
        soli.setEstado_mouse(estadoMouse);
        soli.setEstado_ups(estadoUps);
        soli.setEstado_parlantes(estadoParlantes);
        soli.setEstado_memoriaRam(estadoMemoriaRam);
        soli.setEstado_camara(estadoCamara);
        soli.setEstado_bateria(estadoBateria);
        soli.setEstado_cargadorPortatil(estadoCargadorPortatil);
        soli.setEstado_microfono(estadoMicrofono);
        soli.setEstado_tarjetaRed(estadoTarjetaRed);
        soli.setObservacion_dicoDuro(observacionDisco);
        soli.setObservacion_case(observacionCase);
        soli.setObservacion_monitor(observacionMonitor);
        soli.setObservacion_teclado(observacionTeclado);
        soli.setObservacion_mouse(observacionMouse);
        soli.setObservacion_ups(observacionUps);
        soli.setObservacion_parlantes(observacionParlantes);
        soli.setObservacion_memoriaRam(observacionMemoriaRam);
        soli.setObservacion_camara(observacionCamara);
        soli.setObservacion_bateria(observacionBateria);
        soli.setObservacion_cargadorPortatil(observacionCargadorPortatil);
        soli.setObservacion_microfono(observacionMicrofono);
        soli.setObservacion_tarjetaRed(observacionTarjetaRed);
        soli.setFunciona_cableEnergia(funcionaCableEnegia);
        soli.setFunciona_touchpad(funcionaTouchpad);
        soli.setFunciona_lector(funcionaLector);
        soli.setFunciona_lectorTarjetas(funcionaLectorTarjetas);
        soli.setFunciona_puertoEthernet(funcionaPuertoEthernet);
        soli.setObservacion_cableEnergia(observacionCableEnergia);
        soli.setObservacion_touchpad(observacionTouchpad);
        soli.setObservacion_lector(observacionLector);
        soli.setObservacion_lectorTarjetas(observacionLectorTarjetas);
        soli.setObservacion_puertoEthernet(observacionPuertoEthernet);
        soli.setFunciona_puertoHDMI(funcionaPuertoHDMI);
        soli.setFunciona_puertoVGA(funcionaPuertoVGA);
        soli.setFunciona_indicadoresLuminosos(funcionaIndicadoresLuminosos);
        soli.setFunciona_salidaAudio(funcionaSalidaAudio);
        soli.setFunicona_wifi(funcionaWifi);
        soli.setObservacion_puertoHDMI(observacionPuertoHDMI);
        soli.setObservacion_puertoVGA(observacionPuertoVGA);
        soli.setObservacion_indicadoresLuminosos(observacionIndicadoresLuminosos);
        soli.setObservacion_salidaAudio(observacionLectorSalidaAudio);
        soli.setObservacion_wifi(observacionWifi);
        soli.setMantenimiento(mantenimiento);
        soli.setRevisadoPor(revisado);
        soli.setRecibidoPor(recibido);
        soli.setCargoRevisado(cargoRevisado);
        soli.setCargoRecibido(cargoRecibido);
        controlPersis.guardar(perso, soli);
    }

    public List<Solicitud> traerSolicitud() {
        return controlPersis.traerSolicitud();
    }

    public void borrarSolicitud(int num_codigo) {
        controlPersis.borrarSolicitud(num_codigo);
    }

    public Solicitud traerSolicitud(int num_codigo) {
        return controlPersis.traerSolicitud(num_codigo);
    }

    public void modificarSolicitud(Solicitud soli, String codigo, String nombreFuncionario, String direccion, String email, String tipoRegistro, String fecha, String tipoEquipo,
            String sistemaOperativo, String procesador, String tipoDisco, String ram, String capacidad, String marcaDisco, String marcaCase, String marcaMonitor, String marcaTeclado,
            String maracaMouse, String marcaUps, String maracaParlantes, String marcaMemoriaRam, String marcaCamara, String marcaBateria, String marcaCargadorPortatil,
            String marcaMicrofono, String marcaTajetaRed, String modeloDisco, String modeloCase, String modeloMonitor, String modeloTeclado, String modeloMouse, String modeloUps,
            String modeloParlantes, String modeloMemoriaRam, String modeloCamara, String modeloBateria, String modeloCargadorPortatil, String modeloMicrofono, String modeloTarjetaRed,
            String serieDisco, String serieCase, String serieMonitor, String serieTeclado, String serieMouse, String serieUps, String serieParlantes, String serieMemoriaRam,
            String serieCamara, String serieBateria, String serieCargadorPortatil, String serieMicrofono, String serieTarjetaRed, String estadoDisco, String estadoCase,
            String estadoMonitor, String estadoTeclado, String estadoMouse, String estadoUps, String estadoParlantes, String estadoMemoriaRam, String estadoCamara, String estadoBateria,
            String estadoCargadorPortatil, String estadoMicrofono, String estadoTarjetaRed, String observacionDisco, String observacionCase, String observacionMonitor,
            String observacionTeclado, String observacionMouse, String observacionUps, String observacionParlantes, String observacionMemoriaRam, String observacionCamara,
            String observacionBateria, String observacionCargadorPortatil, String observacionMicrofono, String observacionTarjetaRed, String funcionaCableEnegia, String funcionaTouchpad,
            String funcionaLector, String funcionaLectorTarjetas, String funcionaPuertoEthernet, String observacionCableEnergia, String observacionTouchpad, String observacionLector,
            String observacionLectorTarjetas, String observacionPuertoEthernet, String funcionaPuertoHDMI, String funcionaPuertoVGA, String funcionaIndicadoresLuminosos,
            String funcionaSalidaAudio, String funcionaWifi, String observacionPuertoHDMI, String observacionPuertoVGA, String observacionIndicadoresLuminosos, String observacionLectorSalidaAudio,
            String observacionWifi, String mantenimiento, String revisado, String recibido, String cargoRevisado, String cargoRecibido) {
        soli.setCodigo(codigo);
        soli.setNombre_funcionario(nombreFuncionario);
        soli.setDireccion(direccion);
        soli.setEmail(email);
        soli.setTipo_registro(tipoRegistro);
        soli.setFecha(fecha);
        soli.setTipo_equipo(tipoEquipo);
        soli.setSistema_operativo(sistemaOperativo);
        soli.setProcesador(procesador);
        soli.setTipo_disco(tipoDisco);
        soli.setRam(ram);
        soli.setCapacidad_disco(capacidad);
        soli.setMarca_discoDuro(marcaDisco);
        soli.setMarca_case(marcaCase);
        soli.setMarca_monitor(marcaMonitor);
        soli.setMarca_teclado(marcaTeclado);
        soli.setMarca_mouse(maracaMouse);
        soli.setMarca_ups(marcaUps);
        soli.setMarca_parlantes(maracaParlantes);
        soli.setMarca_memoriaRam(marcaMemoriaRam);
        soli.setMarca_camara(marcaCamara);
        soli.setMarca_bateria(marcaBateria);
        soli.setMarca_cargadorPortatil(marcaCargadorPortatil);
        soli.setMarca_microfono(marcaMicrofono);
        soli.setMarca_tarjetaRed(marcaTajetaRed);
        soli.setModelo_discoDuro(modeloDisco);
        soli.setModelo_case(modeloCase);
        soli.setModelo_monitor(modeloMonitor);
        soli.setModelo_teclado(modeloTeclado);
        soli.setModelo_mouse(modeloMouse);
        soli.setModelo_ups(modeloUps);
        soli.setModelo_parlantes(modeloParlantes);
        soli.setModelo_memoriaRam(modeloMemoriaRam);
        soli.setModelo_camara(modeloCamara);
        soli.setModelo_bateria(modeloBateria);
        soli.setModelo_cargadorPortatil(modeloCargadorPortatil);
        soli.setModelo_microfono(modeloMicrofono);
        soli.setModelo_tarjetaRed(modeloTarjetaRed);
        soli.setSerie_discoDuro(serieDisco);
        soli.setSerie_case(serieCase);
        soli.setSerie_monitor(serieMonitor);
        soli.setSerie_teclado(serieTeclado);
        soli.setSerie_mouse(serieMouse);
        soli.setSerie_ups(serieUps);
        soli.setSerie_parlantes(serieParlantes);
        soli.setSerie_memoriaRam(serieMemoriaRam);
        soli.setSerie_camara(serieCamara);
        soli.setSerie_bateria(serieBateria);
        soli.setSerie_cargadorPortatil(serieCargadorPortatil);
        soli.setSerie_microfono(serieMicrofono);
        soli.setSerie_tarjetaRed(serieTarjetaRed);
        soli.setEstado_discoDuro(estadoDisco);
        soli.setEstado_case(estadoCase);
        soli.setEstado_monitor(estadoMonitor);
        soli.setEstado_teclado(estadoTeclado);
        soli.setEstado_mouse(estadoMouse);
        soli.setEstado_ups(estadoUps);
        soli.setEstado_parlantes(estadoParlantes);
        soli.setEstado_memoriaRam(estadoMemoriaRam);
        soli.setEstado_camara(estadoCamara);
        soli.setEstado_bateria(estadoBateria);
        soli.setEstado_cargadorPortatil(estadoCargadorPortatil);
        soli.setEstado_microfono(estadoMicrofono);
        soli.setEstado_tarjetaRed(estadoTarjetaRed);
        soli.setObservacion_dicoDuro(observacionDisco);
        soli.setObservacion_case(observacionCase);
        soli.setObservacion_monitor(observacionMonitor);
        soli.setObservacion_teclado(observacionTeclado);
        soli.setObservacion_mouse(observacionMouse);
        soli.setObservacion_ups(observacionUps);
        soli.setObservacion_parlantes(observacionParlantes);
        soli.setObservacion_memoriaRam(observacionMemoriaRam);
        soli.setObservacion_camara(observacionCamara);
        soli.setObservacion_bateria(observacionBateria);
        soli.setObservacion_cargadorPortatil(observacionCargadorPortatil);
        soli.setObservacion_microfono(observacionMicrofono);
        soli.setObservacion_tarjetaRed(observacionTarjetaRed);
        soli.setFunciona_cableEnergia(funcionaCableEnegia);
        soli.setFunciona_touchpad(funcionaTouchpad);
        soli.setFunciona_lector(funcionaLector);
        soli.setFunciona_lectorTarjetas(funcionaLectorTarjetas);
        soli.setFunciona_puertoEthernet(funcionaPuertoEthernet);
        soli.setObservacion_cableEnergia(observacionCableEnergia);
        soli.setObservacion_touchpad(observacionTouchpad);
        soli.setObservacion_lector(observacionLector);
        soli.setObservacion_lectorTarjetas(observacionLectorTarjetas);
        soli.setObservacion_puertoEthernet(observacionPuertoEthernet);
        soli.setFunciona_puertoHDMI(funcionaPuertoHDMI);
        soli.setFunciona_puertoVGA(funcionaPuertoVGA);
        soli.setFunciona_indicadoresLuminosos(funcionaIndicadoresLuminosos);
        soli.setFunciona_salidaAudio(funcionaSalidaAudio);
        soli.setFunicona_wifi(funcionaWifi);
        soli.setObservacion_puertoHDMI(observacionPuertoHDMI);
        soli.setObservacion_puertoVGA(observacionPuertoVGA);
        soli.setObservacion_indicadoresLuminosos(observacionIndicadoresLuminosos);
        soli.setObservacion_salidaAudio(observacionLectorSalidaAudio);
        soli.setObservacion_wifi(observacionWifi);
        soli.setMantenimiento(mantenimiento);
        soli.setRevisadoPor(revisado);
        soli.setRecibidoPor(recibido);
        soli.setCargoRevisado(cargoRevisado);
        soli.setCargoRecibido(cargoRecibido);

        controlPersis.modificarSolicitud(soli);

        Persona perso = this.buscarPersona(soli.getUnPersona().getId_persona());
        perso.setNombre(nombreFuncionario);

        this.modificarPersona(perso);
    }

    private Persona buscarPersona(int id_persona) {
        return controlPersis.traerPersona(id_persona);
    }

    private void modificarPersona(Persona perso) {
        controlPersis.modificarPersona(perso);
    }
}
