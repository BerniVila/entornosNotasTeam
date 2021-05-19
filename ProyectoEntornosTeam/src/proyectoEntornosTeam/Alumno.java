package proyectoEntornosTeam;
/**
 *   <h2> Clase Alumno </h2>
 * Esta clase contiene los datos de alumno y sus notas.
 * 
 * @author Bernardo Vila, Zupan Teng
 *
 */

public class Alumno {

	/**
	 * Atributo nia
	 * Indica el Número Identificador del Alumno (NIA)
	 */
	private String nia;

	/**
	 * Atributo examenClasico1
	 * Representa el primer exámen clásico
	 */
	private Examen examenClasico1;
	
	/**
	 * Atributo examenClasico2
	 * Representa el segundo exámen clásico
	 */
	private Examen examenClasico2;
	
	/**
	 * Atributo examenClasico3
	 * Representa el tercer exámen clásico
	 */
	private Examen examenClasico3;
	
	/**
	 * Atributo examenTest1
	 * Representa el primer exámen de tipo test
	 */
	private Examen examenTest1;
	
	/**
	 * Atributo examenTest2
	 * Representa el segundo exámen de tipo test
	 */
	private Examen examenTest2;
	
	/**
	 * Atributo trabajo1
	 * Representa el primer trabajo de clase
	 */
	private TrabajoClase trabajo1;
	
	/**
	 * Atributo trabajo2
	 * Representa el segundo trabajo de clase
	 */
	private TrabajoClase trabajo2;
	
	/**
	 * Atributo trabajo3
	 * Representa el tercer trabajo de clase
	 */
	private TrabajoClase trabajo3;
	
	/**
	 * Atributo notaGlobal
	 * Indica la nota global del alumno
	 */
	private double notaGlobal;

	
	/**
	 * Constructor que pide todos los datos necesarios: NIA, los tres exámenes clásicos, los dos exámenes de tipo test y los tres trabajos.
	 * 
	 * @param nia Indica el Número Identificador del Alumno (NIA)
	 * @param examenClasico1 Representa el primer exámen clásico
	 * @param examenClasico2 Representa el segundo exámen clásico
     * @param examenClasico3 Representa el tercer exámen clásico
	 * @param test1 Representa el primer exámen de tipo test
	 * @param test2 Representa el segundo exámen de tipo test
	 * @param trabajo1 Representa el primer trabajo de clase
	 * @param trabajo2 Representa el segundo trabajo de clase
	 * @param trabajo3 Representa el tercer trabajo de clase
	 */
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
	
	/**
	 * 
	 * @return Devuelve el NIA(Número Identificador del Alumno) del alumno
	 */
	public String getNia() {
		return nia;
	}
	
	/**
	 * 
	 * @return Devuelve la clase ExamenClasico que contiene datos del primer exámen clásico
	 */
	public Examen getExamenClasico1() {
		return examenClasico1;
	}
	
	/**
	 * 
	 * @param examenClasico1 Establece el primer exámen clásico
	 */
	public void setExamenClasico1(ExamenClasico examenClasico1) {
		this.examenClasico1 = examenClasico1;
	}

	/**
	 * 
	 * @return Devuelve la clase ExamenClasico que contiene datos del segundo exámen clásico
	 */
	public Examen getExamenClasico2() {
		return examenClasico2;
	}

	/**
	 * 
	 * @param examenClasico2 Establece el segundo exámen clásico
	 */
	public void setExamenClasico2(ExamenClasico examenClasico2) {
		this.examenClasico2 = examenClasico2;
	}

	/**
	 * 
	 * @return Devuelve la clase ExamenClasico que contiene datos del tercer exámen clásico
	 */
	public Examen getExamenClasico3() {
		return examenClasico3;
	}

	/**
	 * 
	 * @param examenClasico3 Establece el tercer exámen clásico
	 */
	public void setExamenClasico3(ExamenClasico examenClasico3) {
		this.examenClasico3 = examenClasico3;
	}

	/**
	 * 
	 * @return Devuelve la clase ExamenTest que contiene datos del primer exámen de tipo test
	 */
	public Examen getExamenTest1() {
		return examenTest1;
	}

	/**
	 * 
	 * @param examenTest1 La clase ExámenTest
	 */
	public void setExamenTest1(ExamenTest examenTest1) {
		this.examenTest1 = examenTest1;
	}

	/**
	 * 
	 * @return Devuelve la clase ExamenTest que contiene datos del segundo exámen de tipo test
	 */
	public Examen getExamenTest2() {
		return examenTest2;
	}

	/**
	 * 
	 * @param examenTest2 La clase ExamenTest
	 */
	public void setExamenTest2(ExamenTest examenTest2) {
		this.examenTest2 = examenTest2;
	}

	/**
	 * 
	 * @return Devuele la clase TrabajoClase que contiene datos del primer trabajo
	 */
	public TrabajoClase getTrabajo1() {
		return trabajo1;
	}
	
	/**
	 * 
	 * @return Devuele la clase TrabajoClase que contiene datos del segundo trabajo
	 */	
	public TrabajoClase getTrabajo2() {
		return trabajo2;
	}
	
	/**
	 * 
	 * @return Devuele la clase TrabajoClase que contiene datos del tercero trabajo
	 */	
	public TrabajoClase getTrabajo3() {
		return trabajo3;
	}
	
	/**
	 * 
	 * @param nia NIA(Número Identificador del Alumno) del alumno
	 */
	public void setNia(String nia) {
		this.nia = nia;
	}

	/**
	 * 
	 * @param test1 La clase ExamenTest
	 */
	public void setTest1(ExamenTest test1) {
		this.examenTest1 = test1;
	}

	/**
	 * 
	 * @param test2 La clase ExamenTest
	 */
	public void setTest2(ExamenTest test2) {
		this.examenTest2 = test2;
	}

	/**
	 * 
	 * @param trabajo1 La clase TrabajoClase
	 */
	public void setTrabajo1(TrabajoClase trabajo1) {
		this.trabajo1 = trabajo1;
	}

	/**
	 * 
	 * @param trabajo2 La clase TrabajoClase
	 */
	public void setTrabajo2(TrabajoClase trabajo2) {
		this.trabajo2 = trabajo2;
	}

	/**
	 * 
	 * @param trabajo3 La clase TrabajoClase
	 */
	public void setTrabajo3(TrabajoClase trabajo3) {
		this.trabajo3 = trabajo3;
	}

	@Override
	public String toString() {
		return "\nnia = " + nia + "\n1 " + examenClasico1 + "\n2 " + examenClasico2 + "\n3 " + examenClasico3
				+ "\ntest 1 = " + examenTest1 + "\ntest 2 = " + examenTest2 + "\ntrabajo 1 = " + trabajo1
				+ "\ntrabajo 2 = " + trabajo2 + "\ntrabajo 3 = " + trabajo3;
	}
	
	/**
	 * 
	 * @return Devuelve la nota global del alumno
	 * @throws SinPorcentajeExcepcion El porcentaje no está asignado
	 */
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
