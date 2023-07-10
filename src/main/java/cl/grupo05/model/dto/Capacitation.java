package cl.grupo05.model.dto;

public class Capacitation {
    private String idCapacitacion;
    private String nombreCapacitacion;
    private String rutCapacitacion;
    private String fechaCapacitacion;
    private String horaCapacitacion;
    private String lugarCapacitacion;
    private String duracionCapacitacion;
    private String asistentesCapacitacion;

    public Capacitation() {
    }

    public Capacitation(String idCapacitacion, String nombreCapacitacion,
                        String rutCapacitacion, String fechaCapacitacion,
                        String horaCapacitacion, String lugarCapacitacion,
                        String duracionCapacitacion, String asistentesCapacitacion) {
        this.idCapacitacion = idCapacitacion;
        this.nombreCapacitacion = nombreCapacitacion;
        this.rutCapacitacion = rutCapacitacion;
        this.fechaCapacitacion = fechaCapacitacion;
        this.horaCapacitacion = horaCapacitacion;
        this.lugarCapacitacion = lugarCapacitacion;
        this.duracionCapacitacion = duracionCapacitacion;
        this.asistentesCapacitacion = asistentesCapacitacion;
    }

    public String getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(String idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }

    public String getNombreCapacitacion() {
        return nombreCapacitacion;
    }

    public void setNombreCapacitacion(String nombreCapacitacion) {
        this.nombreCapacitacion = nombreCapacitacion;
    }

    public String getRutCapacitacion() {
        return rutCapacitacion;
    }

    public void setRutCapacitacion(String rutCapacitacion) {
        this.rutCapacitacion = rutCapacitacion;
    }

    public String getFechaCapacitacion() {
        return fechaCapacitacion;
    }

    public void setFechaCapacitacion(String fechaCapacitacion) {
        this.fechaCapacitacion = fechaCapacitacion;
    }

    public String getHoraCapacitacion() {
        return horaCapacitacion;
    }

    public void setHoraCapacitacion(String horaCapacitacion) {
        this.horaCapacitacion = horaCapacitacion;
    }

    public String getLugarCapacitacion() {
        return lugarCapacitacion;
    }

    public void setLugarCapacitacion(String lugarCapacitacion) {
        this.lugarCapacitacion = lugarCapacitacion;
    }

    public String getDuracionCapacitacion() {
        return duracionCapacitacion;
    }

    public void setDuracionCapacitacion(String duracionCapacitacion) {
        this.duracionCapacitacion = duracionCapacitacion;
    }

    public String getAsistentesCapacitacion() {
        return asistentesCapacitacion;
    }

    public void setAsistentesCapacitacion(String asistentesCapacitacion) {
        this.asistentesCapacitacion = asistentesCapacitacion;
    }

    @Override
    public String toString() {
        return "Capacitation{" +
                "idCapacitacion='" + idCapacitacion + '\'' +
                ", nombreCapacitacion='" + nombreCapacitacion + '\'' +
                ", rutCapacitacion='" + rutCapacitacion + '\'' +
                ", fechaCapacitacion='" + fechaCapacitacion + '\'' +
                ", horaCapacitacion='" + horaCapacitacion + '\'' +
                ", lugarCapacitacion='" + lugarCapacitacion + '\'' +
                ", duracionCapacitacion='" + duracionCapacitacion + '\'' +
                ", asistentesCapacitacion='" + asistentesCapacitacion + '\'' +
                '}';
    }
}
