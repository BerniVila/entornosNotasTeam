package proyectoEntornosTeamSinExcepcion;

public class ExamenClasico extends Examen{
	private double notaExamen;
	public ExamenClasico() {};
	public ExamenClasico(double porcentaje, double nota) {
		super(porcentaje);
		setNotaExamen(nota);
	}
	public void setNotaExamen(double nota) {
		this.notaExamen = nota;
	}
	public double getNotaExamen() {
		return notaExamen;
	}
	@Override
	public double getNota() throws SinPorcentajeExcepcion{
		try {
			if (porcentaje != 0) return notaExamen*porcentaje;
			else throw new SinPorcentajeExcepcion("Porcentaje no asignado");
		} catch (SinPorcentajeExcepcion e) {
			System.out.println(e);
			return 0;
		}
		
	}
	
}
