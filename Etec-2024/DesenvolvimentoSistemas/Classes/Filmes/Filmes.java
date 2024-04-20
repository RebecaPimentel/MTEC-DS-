import java.text.DecimalFormat;
public class Filmes {

	private String titulo;
	private double duracaoEmMinutos;
	private double horas;
	
	//Título //
	String getTitulo () {
		return this.titulo;
	}
	
	void setTitulo (String titulo) {
		 this.titulo=titulo;
	}
	
	
	// duracaoEmMinutos
	double getDuracaoEmMinutos () {
		return this.duracaoEmMinutos;
	}
		
	void setDuracaoEmMinutos (double duracaoEmMinutos) {
		this.duracaoEmMinutos=duracaoEmMinutos;
			
	}
	
	// duracaoEmHoras
	
	double getHoras () {
		return this.horas;
	}
		
	void setHoras (double horas) {
		this.horas=horas;
			
	}
		
	String exibirDuracaoEmHoras() {
        double horas = this.duracaoEmMinutos / 60;
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(horas);
    }	
	
	

}