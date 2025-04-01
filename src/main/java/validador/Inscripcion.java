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
            if (!materiasAlumno.contains(m)) {
                return false;
            }
        }
        return true;
    }
}
