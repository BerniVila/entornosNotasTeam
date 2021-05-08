package proyectoEntornosTeam;

public class Alumno implements ExamenClasico {

	private String nia;
	private double notaExamenClasico1;
	private double notaExamenClasico2;
	private double notaExamenClasico3;
	private ExamenTest test1;
	private ExamenTest test2;
	private TrabajoClase trabajo1;
	private TrabajoClase trabajo2;
	private TrabajoClase trabajo3;
	private double notaGlobal;

	public Alumno() {

	}

	public Alumno(String nia, double notaExamenClasico1, double notaExamenClasico2, double notaExamenClasico3,
			ExamenTest test1, ExamenTest test2, TrabajoClase trabajo1, TrabajoClase trabajo2, TrabajoClase trabajo3) {

		this.nia = nia;
		this.notaExamenClasico1 = notaExamenClasico1;
		this.notaExamenClasico2 = notaExamenClasico2;
		this.notaExamenClasico3 = notaExamenClasico3;
		this.test1 = test1;
		this.test2 = test2;
		this.trabajo1 = trabajo1;
		this.trabajo2 = trabajo2;
		this.trabajo3 = trabajo3;
	}

	public String getNia() {
		return nia;
	}

	public double getNotaExamenClasico1() {
		return notaExamenClasico1;
	}

	public double getNotaExamenClasico2() {
		return notaExamenClasico2;
	}

	public double getNotaExamenClasico3() {
		return notaExamenClasico3;
	}

	public ExamenTest getTest1() {
		return test1;
	}

	public ExamenTest getTest2() {
		return test2;
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

	public void setNotaExamenClasico1(double notaExamenClasico1) {
		this.notaExamenClasico1 = notaExamenClasico1;
	}

	public void setNotaExamenClasico2(double notaExamenClasico2) {
		this.notaExamenClasico2 = notaExamenClasico2;
	}

	public void setNotaExamenClasico3(double notaExamenClasico3) {
		this.notaExamenClasico3 = notaExamenClasico3;
	}

	public void setTest1(ExamenTest test1) {
		this.test1 = test1;
	}

	public void setTest2(ExamenTest test2) {
		this.test2 = test2;
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
		return "Alumno [\nnia = " + nia + ", \nnotaExamenClasico1 = " + notaExamenClasico1 + ", \nnotaExamenClasico2 = "
				+ notaExamenClasico2 + ", \nnotaExamenClasico3 = " + notaExamenClasico3 + ", \ntest1 = " + test1
				+ ", \ntest2 = " + test2 + ", \ntrabajo1 = " + trabajo1 + ", \ntrabajo2 = " + trabajo2
				+ ", \ntrabajo3 = " + trabajo3 + "]";
	}

	public double calcValorExamen10(double notaExamenClasico) {
		return notaExamenClasico * 0.1;
	};

	public double calcValorExamen20(double notaExamenClasico) {
		return notaExamenClasico * 0.2;
	};

	public double calcNotaGlobal() {

		if (this.trabajo1.isEntregado() == false || this.trabajo2.isEntregado() == false
				|| this.trabajo3.isEntregado() == false) {
			notaGlobal = 3.0;
		} else {

			notaGlobal = this.calcValorExamen10(notaExamenClasico1) + this.calcValorExamen20(notaExamenClasico2)
					+ this.calcValorExamen20(notaExamenClasico3) + this.test1.calcularValorTest()
					+ this.test2.calcularValorTest() - (trabajo1.getPuntosPenalizacion()
					- trabajo2.getPuntosPenalizacion() - trabajo3.getPuntosPenalizacion());
		}

		return (Math.round(notaGlobal * 100))/100.0;
	}
}
