package validador;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(List<Materia> materias, Alumno alumno) {
        this.materias = materias;
        this.alumno = alumno;
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
