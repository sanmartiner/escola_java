package escola;

public class Professor extends Pessoa {
	
	private double salario;
	private String curso;
	
	public Professor(){
		
	}
	
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
}
