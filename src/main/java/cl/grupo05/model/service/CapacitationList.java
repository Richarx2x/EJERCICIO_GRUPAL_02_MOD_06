package cl.grupo05.model.service;
import cl.grupo05.model.dto.Capacitation;
import java.util.*;


public class CapacitationList {
    private static List<Capacitation> capacitaciones = new ArrayList<>();

    public static void agregarCapacitacion(Capacitation capacitacion) {
        capacitaciones.add(capacitacion);
    }

    public static List<Capacitation> getCapacitaciones() {
        return capacitaciones;
    }
}

