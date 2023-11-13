package com.mycompany.solicitud.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Solicitud implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_codigo;
    private String codigo;
    private String nombre_funcionario;
    private String direccion;
    private String email;
    private String tipo_registro;
    private String fecha;
    private String tipo_equipo;
    private String sistema_operativo;
    private String procesador;
    private String tipo_disco;
    private String ram;
    private String capacidad_disco;
    private String marca_discoDuro;
    private String modelo_discoDuro;
    private String serie_discoDuro;
    private String estado_discoDuro;
    private String observacion_dicoDuro;
    private String marca_case;
    private String modelo_case;
    private String serie_case;
    private String estado_case;
    private String observacion_case;
    private String marca_monitor;
    private String modelo_monitor;
    private String serie_monitor;
    private String estado_monitor;
    private String observacion_monitor;
    private String marca_teclado;
    private String modelo_teclado;
    private String serie_teclado;
    private String estado_teclado;
    private String observacion_teclado;
    private String marca_mouse;
    private String modelo_mouse;
    private String serie_mouse;
    private String estado_mouse;
    private String observacion_mouse;
    private String marca_ups;
    private String modelo_ups;
    private String serie_ups;
    private String estado_ups;
    private String observacion_ups;
    private String marca_parlantes;
    private String modelo_parlantes;
    private String serie_parlantes;
    private String estado_parlantes;
    private String observacion_parlantes;
    private String marca_memoriaRam;
    private String modelo_memoriaRam;
    private String serie_memoriaRam;
    private String estado_memoriaRam;
    private String observacion_memoriaRam;
    private String marca_camara;
    private String modelo_camara;
    private String serie_camara;
    private String estado_camara;
    private String observacion_camara;
    private String marca_bateria;
    private String modelo_bateria;
    private String serie_bateria;
    private String estado_bateria;
    private String observacion_bateria;
    private String marca_cargadorPortatil;
    private String modelo_cargadorPortatil;
    private String serie_cargadorPortatil;
    private String estado_cargadorPortatil;
    private String observacion_cargadorPortatil;
    private String marca_microfono;
    private String modelo_microfono;
    private String serie_microfono;
    private String estado_microfono;
    private String observacion_microfono;
    private String marca_tarjetaRed;
    private String modelo_tarjetaRed;
    private String serie_tarjetaRed;
    private String estado_tarjetaRed;
    private String observacion_tarjetaRed;
    private String funciona_cableEnergia;
    private String funciona_touchpad;
    private String funciona_lector;
    private String funciona_lectorTarjetas;
    private String funciona_puertoEthernet;
    private String observacion_cableEnergia;
    private String observacion_touchpad;
    private String observacion_lector;
    private String observacion_lectorTarjetas;
    private String observacion_puertoEthernet;
    private String funciona_puertoHDMI;
    private String funciona_puertoVGA;
    private String funciona_indicadoresLuminosos;
    private String funciona_salidaAudio;
    private String funicona_wifi;
    private String observacion_puertoHDMI;
    private String observacion_puertoVGA;
    private String observacion_indicadoresLuminosos;
    private String observacion_salidaAudio;
    private String observacion_wifi;
    private String mantenimiento;
    private String revisadoPor;
    private String cargoRevisado;
    private String recibidoPor;
    private String cargoRecibido;

    @OneToOne
    private Persona unPersona;

    public Solicitud() {
    }

    public Solicitud(int num_codigo, String codigo, String nombre_funcionario, String direccion, String email, String tipo_registro, String fecha, String tipo_equipo, String sistema_operativo, String procesador, String tipo_disco, String ram, String capacidad_disco, String marca_discoDuro, String modelo_discoDuro, String serie_discoDuro, String estado_discoDuro, String observacion_dicoDuro, String marca_case, String modelo_case, String serie_case, String estado_case, String observacion_case, String marca_monitor, String modelo_monitor, String serie_monitor, String estado_monitor, String observacion_monitor, String marca_teclado, String modelo_teclado, String serie_teclado, String estado_teclado, String observacion_teclado, String marca_mouse, String modelo_mouse, String serie_mouse, String estado_mouse, String observacion_mouse, String marca_ups, String modelo_ups, String serie_ups, String estado_ups, String observacion_ups, String marca_parlantes, String modelo_parlantes, String serie_parlantes, String estado_parlantes, String observacion_parlantes, String marca_memoriaRam, String modelo_memoriaRam, String serie_memoriaRam, String estado_memoriaRam, String observacion_memoriaRam, String marca_camara, String modelo_camara, String serie_camara, String estado_camara, String observacion_camara, String marca_bateria, String modelo_bateria, String serie_bateria, String estado_bateria, String observacion_bateria, String marca_cargadorPortatil, String modelo_cargadorPortatil, String serie_cargadorPortatil, String estado_cargadorPortatil, String observacion_cargadorPortatil, String marca_microfono, String modelo_microfono, String serie_microfono, String estado_microfono, String observacion_microfono, String marca_tarjetaRed, String modelo_tarjetaRed, String serie_tarjetaRed, String estado_tarjetaRed, String observacion_tarjetaRed, String funciona_cableEnergia, String funciona_touchpad, String funciona_lector, String funciona_lectorTarjetas, String funciona_puertoEthernet, String observacion_cableEnergia, String observacion_touchpad, String observacion_lector, String observacion_lectorTarjetas, String observacion_puertoEthernet, String funciona_puertoHDMI, String funciona_puertoVGA, String funciona_indicadoresLuminosos, String funciona_salidaAudio, String funicona_wifi, String observacion_puertoHDMI, String observacion_puertoVGA, String observacion_indicadoresLuminosos, String observacion_salidaAudio, String observacion_wifi, String mantenimiento, String revisadoPor, String cargoRevisado, String recibidoPor, String cargoRecibido, Persona unPersona) {
        this.num_codigo = num_codigo;
        this.codigo = codigo;
        this.nombre_funcionario = nombre_funcionario;
        this.direccion = direccion;
        this.email = email;
        this.tipo_registro = tipo_registro;
        this.fecha = fecha;
        this.tipo_equipo = tipo_equipo;
        this.sistema_operativo = sistema_operativo;
        this.procesador = procesador;
        this.tipo_disco = tipo_disco;
        this.ram = ram;
        this.capacidad_disco = capacidad_disco;
        this.marca_discoDuro = marca_discoDuro;
        this.modelo_discoDuro = modelo_discoDuro;
        this.serie_discoDuro = serie_discoDuro;
        this.estado_discoDuro = estado_discoDuro;
        this.observacion_dicoDuro = observacion_dicoDuro;
        this.marca_case = marca_case;
        this.modelo_case = modelo_case;
        this.serie_case = serie_case;
        this.estado_case = estado_case;
        this.observacion_case = observacion_case;
        this.marca_monitor = marca_monitor;
        this.modelo_monitor = modelo_monitor;
        this.serie_monitor = serie_monitor;
        this.estado_monitor = estado_monitor;
        this.observacion_monitor = observacion_monitor;
        this.marca_teclado = marca_teclado;
        this.modelo_teclado = modelo_teclado;
        this.serie_teclado = serie_teclado;
        this.estado_teclado = estado_teclado;
        this.observacion_teclado = observacion_teclado;
        this.marca_mouse = marca_mouse;
        this.modelo_mouse = modelo_mouse;
        this.serie_mouse = serie_mouse;
        this.estado_mouse = estado_mouse;
        this.observacion_mouse = observacion_mouse;
        this.marca_ups = marca_ups;
        this.modelo_ups = modelo_ups;
        this.serie_ups = serie_ups;
        this.estado_ups = estado_ups;
        this.observacion_ups = observacion_ups;
        this.marca_parlantes = marca_parlantes;
        this.modelo_parlantes = modelo_parlantes;
        this.serie_parlantes = serie_parlantes;
        this.estado_parlantes = estado_parlantes;
        this.observacion_parlantes = observacion_parlantes;
        this.marca_memoriaRam = marca_memoriaRam;
        this.modelo_memoriaRam = modelo_memoriaRam;
        this.serie_memoriaRam = serie_memoriaRam;
        this.estado_memoriaRam = estado_memoriaRam;
        this.observacion_memoriaRam = observacion_memoriaRam;
        this.marca_camara = marca_camara;
        this.modelo_camara = modelo_camara;
        this.serie_camara = serie_camara;
        this.estado_camara = estado_camara;
        this.observacion_camara = observacion_camara;
        this.marca_bateria = marca_bateria;
        this.modelo_bateria = modelo_bateria;
        this.serie_bateria = serie_bateria;
        this.estado_bateria = estado_bateria;
        this.observacion_bateria = observacion_bateria;
        this.marca_cargadorPortatil = marca_cargadorPortatil;
        this.modelo_cargadorPortatil = modelo_cargadorPortatil;
        this.serie_cargadorPortatil = serie_cargadorPortatil;
        this.estado_cargadorPortatil = estado_cargadorPortatil;
        this.observacion_cargadorPortatil = observacion_cargadorPortatil;
        this.marca_microfono = marca_microfono;
        this.modelo_microfono = modelo_microfono;
        this.serie_microfono = serie_microfono;
        this.estado_microfono = estado_microfono;
        this.observacion_microfono = observacion_microfono;
        this.marca_tarjetaRed = marca_tarjetaRed;
        this.modelo_tarjetaRed = modelo_tarjetaRed;
        this.serie_tarjetaRed = serie_tarjetaRed;
        this.estado_tarjetaRed = estado_tarjetaRed;
        this.observacion_tarjetaRed = observacion_tarjetaRed;
        this.funciona_cableEnergia = funciona_cableEnergia;
        this.funciona_touchpad = funciona_touchpad;
        this.funciona_lector = funciona_lector;
        this.funciona_lectorTarjetas = funciona_lectorTarjetas;
        this.funciona_puertoEthernet = funciona_puertoEthernet;
        this.observacion_cableEnergia = observacion_cableEnergia;
        this.observacion_touchpad = observacion_touchpad;
        this.observacion_lector = observacion_lector;
        this.observacion_lectorTarjetas = observacion_lectorTarjetas;
        this.observacion_puertoEthernet = observacion_puertoEthernet;
        this.funciona_puertoHDMI = funciona_puertoHDMI;
        this.funciona_puertoVGA = funciona_puertoVGA;
        this.funciona_indicadoresLuminosos = funciona_indicadoresLuminosos;
        this.funciona_salidaAudio = funciona_salidaAudio;
        this.funicona_wifi = funicona_wifi;
        this.observacion_puertoHDMI = observacion_puertoHDMI;
        this.observacion_puertoVGA = observacion_puertoVGA;
        this.observacion_indicadoresLuminosos = observacion_indicadoresLuminosos;
        this.observacion_salidaAudio = observacion_salidaAudio;
        this.observacion_wifi = observacion_wifi;
        this.mantenimiento = mantenimiento;
        this.revisadoPor = revisadoPor;
        this.cargoRevisado = cargoRevisado;
        this.recibidoPor = recibidoPor;
        this.cargoRecibido = cargoRecibido;
        this.unPersona = unPersona;
    }

    public int getNum_codigo() {
        return num_codigo;
    }

    public void setNum_codigo(int num_codigo) {
        this.num_codigo = num_codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre_funcionario() {
        return nombre_funcionario;
    }

    public void setNombre_funcionario(String nombre_funcionario) {
        this.nombre_funcionario = nombre_funcionario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo_registro() {
        return tipo_registro;
    }

    public void setTipo_registro(String tipo_registro) {
        this.tipo_registro = tipo_registro;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo_equipo() {
        return tipo_equipo;
    }

    public void setTipo_equipo(String tipo_equipo) {
        this.tipo_equipo = tipo_equipo;
    }

    public String getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTipo_disco() {
        return tipo_disco;
    }

    public void setTipo_disco(String tipo_disco) {
        this.tipo_disco = tipo_disco;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCapacidad_disco() {
        return capacidad_disco;
    }

    public void setCapacidad_disco(String capacidad_disco) {
        this.capacidad_disco = capacidad_disco;
    }

    public String getMarca_discoDuro() {
        return marca_discoDuro;
    }

    public void setMarca_discoDuro(String marca_discoDuro) {
        this.marca_discoDuro = marca_discoDuro;
    }

    public String getModelo_discoDuro() {
        return modelo_discoDuro;
    }

    public void setModelo_discoDuro(String modelo_discoDuro) {
        this.modelo_discoDuro = modelo_discoDuro;
    }

    public String getSerie_discoDuro() {
        return serie_discoDuro;
    }

    public void setSerie_discoDuro(String serie_discoDuro) {
        this.serie_discoDuro = serie_discoDuro;
    }

    public String getEstado_discoDuro() {
        return estado_discoDuro;
    }

    public void setEstado_discoDuro(String estado_discoDuro) {
        this.estado_discoDuro = estado_discoDuro;
    }

    public String getObservacion_dicoDuro() {
        return observacion_dicoDuro;
    }

    public void setObservacion_dicoDuro(String observacion_dicoDuro) {
        this.observacion_dicoDuro = observacion_dicoDuro;
    }

    public String getMarca_case() {
        return marca_case;
    }

    public void setMarca_case(String marca_case) {
        this.marca_case = marca_case;
    }

    public String getModelo_case() {
        return modelo_case;
    }

    public void setModelo_case(String modelo_case) {
        this.modelo_case = modelo_case;
    }

    public String getSerie_case() {
        return serie_case;
    }

    public void setSerie_case(String serie_case) {
        this.serie_case = serie_case;
    }

    public String getEstado_case() {
        return estado_case;
    }

    public void setEstado_case(String estado_case) {
        this.estado_case = estado_case;
    }

    public String getObservacion_case() {
        return observacion_case;
    }

    public void setObservacion_case(String observacion_case) {
        this.observacion_case = observacion_case;
    }

    public String getMarca_monitor() {
        return marca_monitor;
    }

    public void setMarca_monitor(String marca_monitor) {
        this.marca_monitor = marca_monitor;
    }

    public String getModelo_monitor() {
        return modelo_monitor;
    }

    public void setModelo_monitor(String modelo_monitor) {
        this.modelo_monitor = modelo_monitor;
    }

    public String getSerie_monitor() {
        return serie_monitor;
    }

    public void setSerie_monitor(String serie_monitor) {
        this.serie_monitor = serie_monitor;
    }

    public String getEstado_monitor() {
        return estado_monitor;
    }

    public void setEstado_monitor(String estado_monitor) {
        this.estado_monitor = estado_monitor;
    }

    public String getObservacion_monitor() {
        return observacion_monitor;
    }

    public void setObservacion_monitor(String observacion_monitor) {
        this.observacion_monitor = observacion_monitor;
    }

    public String getMarca_teclado() {
        return marca_teclado;
    }

    public void setMarca_teclado(String marca_teclado) {
        this.marca_teclado = marca_teclado;
    }

    public String getModelo_teclado() {
        return modelo_teclado;
    }

    public void setModelo_teclado(String modelo_teclado) {
        this.modelo_teclado = modelo_teclado;
    }

    public String getSerie_teclado() {
        return serie_teclado;
    }

    public void setSerie_teclado(String serie_teclado) {
        this.serie_teclado = serie_teclado;
    }

    public String getEstado_teclado() {
        return estado_teclado;
    }

    public void setEstado_teclado(String estado_teclado) {
        this.estado_teclado = estado_teclado;
    }

    public String getObservacion_teclado() {
        return observacion_teclado;
    }

    public void setObservacion_teclado(String observacion_teclado) {
        this.observacion_teclado = observacion_teclado;
    }

    public String getMarca_mouse() {
        return marca_mouse;
    }

    public void setMarca_mouse(String marca_mouse) {
        this.marca_mouse = marca_mouse;
    }

    public String getModelo_mouse() {
        return modelo_mouse;
    }

    public void setModelo_mouse(String modelo_mouse) {
        this.modelo_mouse = modelo_mouse;
    }

    public String getSerie_mouse() {
        return serie_mouse;
    }

    public void setSerie_mouse(String serie_mouse) {
        this.serie_mouse = serie_mouse;
    }

    public String getEstado_mouse() {
        return estado_mouse;
    }

    public void setEstado_mouse(String estado_mouse) {
        this.estado_mouse = estado_mouse;
    }

    public String getObservacion_mouse() {
        return observacion_mouse;
    }

    public void setObservacion_mouse(String observacion_mouse) {
        this.observacion_mouse = observacion_mouse;
    }

    public String getMarca_ups() {
        return marca_ups;
    }

    public void setMarca_ups(String marca_ups) {
        this.marca_ups = marca_ups;
    }

    public String getModelo_ups() {
        return modelo_ups;
    }

    public void setModelo_ups(String modelo_ups) {
        this.modelo_ups = modelo_ups;
    }

    public String getSerie_ups() {
        return serie_ups;
    }

    public void setSerie_ups(String serie_ups) {
        this.serie_ups = serie_ups;
    }

    public String getEstado_ups() {
        return estado_ups;
    }

    public void setEstado_ups(String estado_ups) {
        this.estado_ups = estado_ups;
    }

    public String getObservacion_ups() {
        return observacion_ups;
    }

    public void setObservacion_ups(String observacion_ups) {
        this.observacion_ups = observacion_ups;
    }

    public String getMarca_parlantes() {
        return marca_parlantes;
    }

    public void setMarca_parlantes(String marca_parlantes) {
        this.marca_parlantes = marca_parlantes;
    }

    public String getModelo_parlantes() {
        return modelo_parlantes;
    }

    public void setModelo_parlantes(String modelo_parlantes) {
        this.modelo_parlantes = modelo_parlantes;
    }

    public String getSerie_parlantes() {
        return serie_parlantes;
    }

    public void setSerie_parlantes(String serie_parlantes) {
        this.serie_parlantes = serie_parlantes;
    }

    public String getEstado_parlantes() {
        return estado_parlantes;
    }

    public void setEstado_parlantes(String estado_parlantes) {
        this.estado_parlantes = estado_parlantes;
    }

    public String getObservacion_parlantes() {
        return observacion_parlantes;
    }

    public void setObservacion_parlantes(String observacion_parlantes) {
        this.observacion_parlantes = observacion_parlantes;
    }

    public String getMarca_memoriaRam() {
        return marca_memoriaRam;
    }

    public void setMarca_memoriaRam(String marca_memoriaRam) {
        this.marca_memoriaRam = marca_memoriaRam;
    }

    public String getModelo_memoriaRam() {
        return modelo_memoriaRam;
    }

    public void setModelo_memoriaRam(String modelo_memoriaRam) {
        this.modelo_memoriaRam = modelo_memoriaRam;
    }

    public String getSerie_memoriaRam() {
        return serie_memoriaRam;
    }

    public void setSerie_memoriaRam(String serie_memoriaRam) {
        this.serie_memoriaRam = serie_memoriaRam;
    }

    public String getEstado_memoriaRam() {
        return estado_memoriaRam;
    }

    public void setEstado_memoriaRam(String estado_memoriaRam) {
        this.estado_memoriaRam = estado_memoriaRam;
    }

    public String getObservacion_memoriaRam() {
        return observacion_memoriaRam;
    }

    public void setObservacion_memoriaRam(String observacion_memoriaRam) {
        this.observacion_memoriaRam = observacion_memoriaRam;
    }

    public String getMarca_camara() {
        return marca_camara;
    }

    public void setMarca_camara(String marca_camara) {
        this.marca_camara = marca_camara;
    }

    public String getModelo_camara() {
        return modelo_camara;
    }

    public void setModelo_camara(String modelo_camara) {
        this.modelo_camara = modelo_camara;
    }

    public String getSerie_camara() {
        return serie_camara;
    }

    public void setSerie_camara(String serie_camara) {
        this.serie_camara = serie_camara;
    }

    public String getEstado_camara() {
        return estado_camara;
    }

    public void setEstado_camara(String estado_camara) {
        this.estado_camara = estado_camara;
    }

    public String getObservacion_camara() {
        return observacion_camara;
    }

    public void setObservacion_camara(String observacion_camara) {
        this.observacion_camara = observacion_camara;
    }

    public String getMarca_bateria() {
        return marca_bateria;
    }

    public void setMarca_bateria(String marca_bateria) {
        this.marca_bateria = marca_bateria;
    }

    public String getModelo_bateria() {
        return modelo_bateria;
    }

    public void setModelo_bateria(String modelo_bateria) {
        this.modelo_bateria = modelo_bateria;
    }

    public String getSerie_bateria() {
        return serie_bateria;
    }

    public void setSerie_bateria(String serie_bateria) {
        this.serie_bateria = serie_bateria;
    }

    public String getEstado_bateria() {
        return estado_bateria;
    }

    public void setEstado_bateria(String estado_bateria) {
        this.estado_bateria = estado_bateria;
    }

    public String getObservacion_bateria() {
        return observacion_bateria;
    }

    public void setObservacion_bateria(String observacion_bateria) {
        this.observacion_bateria = observacion_bateria;
    }

    public String getMarca_cargadorPortatil() {
        return marca_cargadorPortatil;
    }

    public void setMarca_cargadorPortatil(String marca_cargadorPortatil) {
        this.marca_cargadorPortatil = marca_cargadorPortatil;
    }

    public String getModelo_cargadorPortatil() {
        return modelo_cargadorPortatil;
    }

    public void setModelo_cargadorPortatil(String modelo_cargadorPortatil) {
        this.modelo_cargadorPortatil = modelo_cargadorPortatil;
    }

    public String getSerie_cargadorPortatil() {
        return serie_cargadorPortatil;
    }

    public void setSerie_cargadorPortatil(String serie_cargadorPortatil) {
        this.serie_cargadorPortatil = serie_cargadorPortatil;
    }

    public String getEstado_cargadorPortatil() {
        return estado_cargadorPortatil;
    }

    public void setEstado_cargadorPortatil(String estado_cargadorPortatil) {
        this.estado_cargadorPortatil = estado_cargadorPortatil;
    }

    public String getObservacion_cargadorPortatil() {
        return observacion_cargadorPortatil;
    }

    public void setObservacion_cargadorPortatil(String observacion_cargadorPortatil) {
        this.observacion_cargadorPortatil = observacion_cargadorPortatil;
    }

    public String getMarca_microfono() {
        return marca_microfono;
    }

    public void setMarca_microfono(String marca_microfono) {
        this.marca_microfono = marca_microfono;
    }

    public String getModelo_microfono() {
        return modelo_microfono;
    }

    public void setModelo_microfono(String modelo_microfono) {
        this.modelo_microfono = modelo_microfono;
    }

    public String getSerie_microfono() {
        return serie_microfono;
    }

    public void setSerie_microfono(String serie_microfono) {
        this.serie_microfono = serie_microfono;
    }

    public String getEstado_microfono() {
        return estado_microfono;
    }

    public void setEstado_microfono(String estado_microfono) {
        this.estado_microfono = estado_microfono;
    }

    public String getObservacion_microfono() {
        return observacion_microfono;
    }

    public void setObservacion_microfono(String observacion_microfono) {
        this.observacion_microfono = observacion_microfono;
    }

    public String getMarca_tarjetaRed() {
        return marca_tarjetaRed;
    }

    public void setMarca_tarjetaRed(String marca_tarjetaRed) {
        this.marca_tarjetaRed = marca_tarjetaRed;
    }

    public String getModelo_tarjetaRed() {
        return modelo_tarjetaRed;
    }

    public void setModelo_tarjetaRed(String modelo_tarjetaRed) {
        this.modelo_tarjetaRed = modelo_tarjetaRed;
    }

    public String getSerie_tarjetaRed() {
        return serie_tarjetaRed;
    }

    public void setSerie_tarjetaRed(String serie_tarjetaRed) {
        this.serie_tarjetaRed = serie_tarjetaRed;
    }

    public String getEstado_tarjetaRed() {
        return estado_tarjetaRed;
    }

    public void setEstado_tarjetaRed(String estado_tarjetaRed) {
        this.estado_tarjetaRed = estado_tarjetaRed;
    }

    public String getObservacion_tarjetaRed() {
        return observacion_tarjetaRed;
    }

    public void setObservacion_tarjetaRed(String observacion_tarjetaRed) {
        this.observacion_tarjetaRed = observacion_tarjetaRed;
    }

    public String getFunciona_cableEnergia() {
        return funciona_cableEnergia;
    }

    public void setFunciona_cableEnergia(String funciona_cableEnergia) {
        this.funciona_cableEnergia = funciona_cableEnergia;
    }

    public String getFunciona_touchpad() {
        return funciona_touchpad;
    }

    public void setFunciona_touchpad(String funciona_touchpad) {
        this.funciona_touchpad = funciona_touchpad;
    }

    public String getFunciona_lector() {
        return funciona_lector;
    }

    public void setFunciona_lector(String funciona_lector) {
        this.funciona_lector = funciona_lector;
    }

    public String getFunciona_lectorTarjetas() {
        return funciona_lectorTarjetas;
    }

    public void setFunciona_lectorTarjetas(String funciona_lectorTarjetas) {
        this.funciona_lectorTarjetas = funciona_lectorTarjetas;
    }

    public String getFunciona_puertoEthernet() {
        return funciona_puertoEthernet;
    }

    public void setFunciona_puertoEthernet(String funciona_puertoEthernet) {
        this.funciona_puertoEthernet = funciona_puertoEthernet;
    }

    public String getObservacion_cableEnergia() {
        return observacion_cableEnergia;
    }

    public void setObservacion_cableEnergia(String observacion_cableEnergia) {
        this.observacion_cableEnergia = observacion_cableEnergia;
    }

    public String getObservacion_touchpad() {
        return observacion_touchpad;
    }

    public void setObservacion_touchpad(String observacion_touchpad) {
        this.observacion_touchpad = observacion_touchpad;
    }

    public String getObservacion_lector() {
        return observacion_lector;
    }

    public void setObservacion_lector(String observacion_lector) {
        this.observacion_lector = observacion_lector;
    }

    public String getObservacion_lectorTarjetas() {
        return observacion_lectorTarjetas;
    }

    public void setObservacion_lectorTarjetas(String observacion_lectorTarjetas) {
        this.observacion_lectorTarjetas = observacion_lectorTarjetas;
    }

    public String getObservacion_puertoEthernet() {
        return observacion_puertoEthernet;
    }

    public void setObservacion_puertoEthernet(String observacion_puertoEthernet) {
        this.observacion_puertoEthernet = observacion_puertoEthernet;
    }

    public String getFunciona_puertoHDMI() {
        return funciona_puertoHDMI;
    }

    public void setFunciona_puertoHDMI(String funciona_puertoHDMI) {
        this.funciona_puertoHDMI = funciona_puertoHDMI;
    }

    public String getFunciona_puertoVGA() {
        return funciona_puertoVGA;
    }

    public void setFunciona_puertoVGA(String funciona_puertoVGA) {
        this.funciona_puertoVGA = funciona_puertoVGA;
    }

    public String getFunciona_indicadoresLuminosos() {
        return funciona_indicadoresLuminosos;
    }

    public void setFunciona_indicadoresLuminosos(String funciona_indicadoresLuminosos) {
        this.funciona_indicadoresLuminosos = funciona_indicadoresLuminosos;
    }

    public String getFunciona_salidaAudio() {
        return funciona_salidaAudio;
    }

    public void setFunciona_salidaAudio(String funciona_salidaAudio) {
        this.funciona_salidaAudio = funciona_salidaAudio;
    }

    public String getFunicona_wifi() {
        return funicona_wifi;
    }

    public void setFunicona_wifi(String funicona_wifi) {
        this.funicona_wifi = funicona_wifi;
    }

    public String getObservacion_puertoHDMI() {
        return observacion_puertoHDMI;
    }

    public void setObservacion_puertoHDMI(String observacion_puertoHDMI) {
        this.observacion_puertoHDMI = observacion_puertoHDMI;
    }

    public String getObservacion_puertoVGA() {
        return observacion_puertoVGA;
    }

    public void setObservacion_puertoVGA(String observacion_puertoVGA) {
        this.observacion_puertoVGA = observacion_puertoVGA;
    }

    public String getObservacion_indicadoresLuminosos() {
        return observacion_indicadoresLuminosos;
    }

    public void setObservacion_indicadoresLuminosos(String observacion_indicadoresLuminosos) {
        this.observacion_indicadoresLuminosos = observacion_indicadoresLuminosos;
    }

    public String getObservacion_salidaAudio() {
        return observacion_salidaAudio;
    }

    public void setObservacion_salidaAudio(String observacion_salidaAudio) {
        this.observacion_salidaAudio = observacion_salidaAudio;
    }

    public String getObservacion_wifi() {
        return observacion_wifi;
    }

    public void setObservacion_wifi(String observacion_wifi) {
        this.observacion_wifi = observacion_wifi;
    }

    public String getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public String getRevisadoPor() {
        return revisadoPor;
    }

    public void setRevisadoPor(String revisadoPor) {
        this.revisadoPor = revisadoPor;
    }

    public String getCargoRevisado() {
        return cargoRevisado;
    }

    public void setCargoRevisado(String cargoRevisado) {
        this.cargoRevisado = cargoRevisado;
    }

    public String getRecibidoPor() {
        return recibidoPor;
    }

    public void setRecibidoPor(String recibidoPor) {
        this.recibidoPor = recibidoPor;
    }

    public String getCargoRecibido() {
        return cargoRecibido;
    }

    public void setCargoRecibido(String cargoRecibido) {
        this.cargoRecibido = cargoRecibido;
    }

    public Persona getUnPersona() {
        return unPersona;
    }

    public void setUnPersona(Persona unPersona) {
        this.unPersona = unPersona;
    }

}
