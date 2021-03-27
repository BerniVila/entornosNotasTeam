package entornosNotasTeam;

public class Alumno {
	protected static int cont = 0;
	protected int idAlumno;
	protected double[] exNormal = new double[3];
	protected int[] exTest = new int[4];
	protected int[] trabajos = new int[3];//tiempo de retraso
	
	public Alumno() {
		cont++;
		idAlumno = cont;
	}
	public Alumno(double nota1, double nota2, double nota3, int bien1, int bien2, int mal1, int mal2) {
		this();
		setExNormal(nota1, nota2, nota3);
		setExTest(bien1, bien2, mal1, mal2);
	}
	
	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	public static int getTotalAlumnos() {
		return cont;
	}
	public double[] getExNormal() {
		return exNormal;
	}
	
	public boolean setExNormal(double nota1, double nota2, double nota3) {
		boolean tmp = true;
		if (esExNormalValida(nota1))
			exNormal[0] = nota1;
		else
			tmp = false;
		if (esExNormalValida(nota2))
			exNormal[1] = nota2;
		else
			tmp = false;
		if (esExNormalValida(nota3))
			exNormal[2] = nota3;
		else
			tmp = false;
		return tmp;
	}
	private boolean esExNormalValida(double nota) {
		if (nota >= 0 && nota <= 10)
			return true;
		else
			return false;
	}
	
	public int[] getExTest() {
		return exTest;
	}
	
	public boolean setExTest(int bien1, int bien2, int mal1, int mal2) {
		boolean tmp = true;
		if (esExTestValida(bien1, mal1)) {
			exTest[0] = bien1;
			exTest[2] = mal1;
		}
		else
			tmp = false;
		if (esExTestValida(bien2,mal2)) {
			exTest[1] = bien2;
			exTest[3] = mal2;
		}
		else 
			tmp = false;
		return tmp;
	}
	private boolean esExTestValida(double bien, double mal) {
		if ((bien+mal) <= 30)
			return true;
		else
			return false;
	}
	
	public void setTrabajos(int t1, int t2, int t3) {
		trabajos[0] = t1;
		trabajos[1] = t2;
		trabajos[2] = t3;
	}
	@Override
	public String toString() {
		String txt = "\n**********************\nidAlumno:" + idAlumno +"\nnotaNormal:";
		for (int i = 0; i < exNormal.length; i++) {
			txt += "\n\tNota" + i + ":" + exNormal[i];
		}
		txt += "\nnotaTest:";
		for (int i = 0; i < exTest.length; i++) {
			if ((i+1)%2 != 0)
				txt += "\n\tbien:" + exTest[i];
			else
				txt += "\n\tmal:" + exTest[i];
		}
		txt += "\nTrabajos:";
		for (int i = 0; i < trabajos.length; i++) {
			txt += "\n\ttiempo retraso de trabajo" + i + ":" + trabajos[i];
		}
		txt += "\n**********************";
		return txt;
		
	}
}
