package biblioteca;

public class Emprestimo {
 
	
	Livro livro;
	Leitor leitor;
	String dataEmprestimo;
	String dataPrevistaDevolucao;
	String dataDevolucao;

	public Emprestimo(Livro livro, Leitor leitor, String dataEmprestimo,String dataPrevistaDevolucao,String dataDevolucao  ) {
		this.livro = livro;
		this.leitor = leitor;
		this.dataEmprestimo = dataEmprestimo;
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
		this.dataDevolucao = dataDevolucao;

	}
	
}
