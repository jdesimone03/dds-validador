package validador;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(Integer legajo) {
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public Integer getLegajo() {
        return legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
}
