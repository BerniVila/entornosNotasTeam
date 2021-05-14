package proyectoEntornosTeam;

public class Alumno {

	private String nia;
	private Examen examenClasico1;
	private Examen examenClasico2;
	private Examen examenClasico3;
	private Examen examenTest1;
	private Examen examenTest2;
	private TrabajoClase trabajo1;
	private TrabajoClase trabajo2;
	private TrabajoClase trabajo3;
	private double notaGlobal;

	public Alumno() {
	}

	public Alumno(String nia, ExamenClasico examenClasico1, ExamenClasico examenClasico2, ExamenClasico examenClasico3,
			ExamenTest test1, ExamenTest test2, TrabajoClase trabajo1, TrabajoClase trabajo2, TrabajoClase trabajo3) {

		this.nia = nia;
		this.examenClasico1 = examenClasico1;
		this.examenClasico2 = examenClasico2;
		this.examenClasico3 = examenClasico3;
		this.examenTest1 = test1;
		this.examenTest2 = test2;
		this.trabajo1 = trabajo1;
		this.trabajo2 = trabajo2;
		this.trabajo3 = trabajo3;
	}

	public String getNia() {
		return nia;
	}

	public Examen getExamenClasico1() {
		return examenClasico1;
	}

	public void setExamenClasico1(Examen examenClasico1) {
		this.examenClasico1 = examenClasico1;
	}

	public Examen getExamenClasico2() {
		return examenClasico2;
	}

	public void setExamenClasico2(Examen examenClasico2) {
		this.examenClasico2 = examenClasico2;
	}

	public Examen getExamenClasico3() {
		return examenClasico3;
	}

	public void setExamenClasico3(Examen examenClasico3) {
		this.examenClasico3 = examenClasico3;
	}

	public Examen getExamenTest1() {
		return examenTest1;
	}

	public void setExamenTest1(Examen examenTest1) {
		this.examenTest1 = examenTest1;
	}

	public Examen getExamenTest2() {
		return examenTest2;
	}

	public void setExamenTest2(Examen examenTest2) {
		this.examenTest2 = examenTest2;
	}

	public TrabajoClase getTrabajo1() {
		return trabajo1;
	}

	public TrabajoClase getTrabajo2() {
		return trabajo2;
	}

	public TrabajoClase getTrabajo3() {
		return trabajo3;
	}

	public void setNia(String nia) {
		this.nia = nia;
	}

	public void setTest1(ExamenTest test1) {
		this.examenTest1 = test1;
	}

	public void setTest2(ExamenTest test2) {
		this.examenTest2 = test2;
	}

	public void setTrabajo1(TrabajoClase trabajo1) {
		this.trabajo1 = trabajo1;
	}

	public void setTrabajo2(TrabajoClase trabajo2) {
		this.trabajo2 = trabajo2;
	}

	public void setTrabajo3(TrabajoClase trabajo3) {
		this.trabajo3 = trabajo3;
	}

	@Override
	public String toString() {
		return "\nnia = " + nia + "\n1 " + examenClasico1 + "\n2 " + examenClasico2 + "\n3 " + examenClasico3
				+ "\ntest 1 = " + examenTest1 + "\ntest 2 = " + examenTest2 + "\ntrabajo 1 = " + trabajo1
				+ "\ntrabajo 2 = " + trabajo2 + "\ntrabajo 3 = " + trabajo3;
	}

	public double calcValorExamen10(double notaExamenClasico) {
		return notaExamenClasico * 0.1;
	};

	public double calcValorExamen20(double notaExamenClasico) {
		return notaExamenClasico * 0.2;
	};

	public double calcNotaGlobal() throws SinPorcentajeExcepcion {

		if (this.trabajo1.isEntregado() == false || this.trabajo2.isEntregado() == false
				|| this.trabajo3.isEntregado() == false) {
			notaGlobal = 3.0;
		} else {
			notaGlobal = examenClasico1.getNota() + examenClasico2.getNota() + examenClasico3.getNota()
					+ examenTest1.getNota() + examenTest2.getNota() - (trabajo1.getPuntosPenalizacion()
							+ trabajo2.getPuntosPenalizacion() + trabajo3.getPuntosPenalizacion());
		}

		return (Math.round(notaGlobal * 100)) / 100.0;
	}
}
