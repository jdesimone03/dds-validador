package validador;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Alumno {
    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(Integer legajo) {
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public void addMateriaAprobada(Materia materia) {
        this.materiasAprobadas.add(materia);
    }
}
