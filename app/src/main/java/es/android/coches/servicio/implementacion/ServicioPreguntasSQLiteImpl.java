package es.android.coches.servicio.implementacion;

import java.util.List;

import es.android.coches.entidad.Pregunta;
import es.android.coches.servicio.interfaz.ServicioPreguntas;

public class ServicioPreguntasSQLiteImpl implements ServicioPreguntas {
    @Override
    public List<String> generarRespuestasPosibles(String respuestaCorrecta, int numRespuestas) {
        return null;
    }

    @Override
    public List<Pregunta> generarPreguntas(String recurso) throws Exception {
        return null;
    }
}
