package cl.grupo05.controller;

import cl.grupo05.model.dto.Capacitation;
import cl.grupo05.model.service.CapacitationList;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/capacitaciones/crear")
public class CreateCapacitationController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CreateCapacitationController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/views/crearCapacitacion.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Obtener los parámetros enviados desde el formulario en la vista
        String idCapacitacion = req.getParameter("id-capacitacion");
        String nombreCapacitacion = req.getParameter("nombre-capacitacion");
        String rutCapacitacion = req.getParameter("rut-capacitacion");
        String fechaCapacitacion = req.getParameter("fecha-capacitacion");
        String horaCapacitacion = req.getParameter("hora-capacitacion");
        String lugarCapacitacion = req.getParameter("lugar-capacitacion");
        String duracionCapacitacion = req.getParameter("duracion-capacitacion");
        String asistentesCapacitacion = req.getParameter("asistentes-capacitacion");

        // Crear una instancia de Capacitation con los datos recibidos
        Capacitation capacitacion = new Capacitation();
        capacitacion.setIdCapacitacion(idCapacitacion);
        capacitacion.setNombreCapacitacion(nombreCapacitacion);
        capacitacion.setRutCapacitacion(rutCapacitacion);
        capacitacion.setFechaCapacitacion(fechaCapacitacion);
        capacitacion.setHoraCapacitacion(horaCapacitacion);
        capacitacion.setLugarCapacitacion(lugarCapacitacion);
        capacitacion.setDuracionCapacitacion(duracionCapacitacion);
        capacitacion.setAsistentesCapacitacion(asistentesCapacitacion);

        // Agregar la capacitación a la lista de capacitaciones
        CapacitationList.agregarCapacitacion(capacitacion);

        // Redireccionar a la página de listado de capacitaciones
        resp.sendRedirect("/EJERCICIO_GRUPAL_02_MOD_06/capacitaciones");
    }
}
