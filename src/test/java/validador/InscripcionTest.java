package validador;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    private Alumno alumno = new Alumno(1234567);
    private Materia materia1 = new Materia("Sistemas y Procesos de Negocio");
    private Materia materia2 = new Materia("Análisis de Sistemas");
    private Materia materia3 = new Materia("Diseño de Sistemas");

    @Test
    @DisplayName("Si el alumno aprobó SYPN y ASI, puede inscribirse a DDS")
    public void PuedeInscribirse() {
        this.setCorrelativas();
        this.alumno.addMateriaAprobada(materia1);
        this.alumno.addMateriaAprobada(materia2);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.addMateria(materia3);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Si el alumno solo aprobó SYPN, no puede inscribirse a DDS")
    public void NoPuedeInscribirse() {
        this.setCorrelativas();
        this.alumno.addMateriaAprobada(materia1);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.addMateria(materia3);

        Assertions.assertFalse(inscripcion.aprobada());
    }

    public void setCorrelativas() {
        this.materia2.addCorrelativa(materia1);
        this.materia3.addCorrelativa(materia1);
        this.materia3.addCorrelativa(materia2);
    }
}