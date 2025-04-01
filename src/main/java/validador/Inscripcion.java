package validador;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();
    }

    public void addMateria(Materia materia) {
        this.materias.add(materia);
    }

    public Boolean aprobada() {
        List<Materia> materiasAlumno = alumno.getMateriasAprobadas();
        for (Materia m : this.materias) {
            List<Materia> correlativas = m.getCorrelativas();
            if (!materiasAlumno.containsAll(correlativas)) {
                return false;
            }
        }
        return true;
    }
}
