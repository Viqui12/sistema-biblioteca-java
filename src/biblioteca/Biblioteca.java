package biblioteca;
import java.util.Scanner;
public class Biblioteca {
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o título do livro:");
		 String titulo = entrada.nextLine();
		
		System.out.println ("Digite o nome do autor: ");
		 String autor = entrada.nextLine();
		
		System.out.println("Digite o  isbn: ");
		 String isbn = entrada.nextLine();

		System.out.println("Digite o nome da editora do livro: ");
		 String editora = entrada.nextLine();
		
		System.out.println ("Digite o  ano: ");
		 int ano = entrada.nextInt();
		
		System.out.println("Digite a quantidade de livro: ");
		 int quantidade  = entrada.nextInt();
		
		System.out.println("Digite se tem disponível: ");
		 boolean  disponibilidade  = entrada.nextBoolean();
		  entrada.nextLine();
		 
		 
		 System.out.println ("Digite o nome: ");
		  String  nome = entrada.nextLine();		
		
		  System.out.println ("Digite sua matrícula: ");
		   String matricula = entrada.nextLine();
		   
		   System.out.println("Digite a turma: ");
		    String turma = entrada.nextLine();
		    
		    Leitor leitor = new Leitor(nome,matricula,turma);
		    System.out.println( "Nome: " + leitor.nome );
		    System.out.println( "Matrícula: " + leitor.matricula );
		    System.out.println( "Turma: " + leitor.turma );
		
		    Livro livro = new Livro(titulo, autor, isbn, editora, ano, quantidade, disponibilidade);

		    if (livro.disponibilidade) {

		        System.out.println("Digite a data do empréstimo: ");
		        String dataEmprestimo = entrada.nextLine();

		        System.out.println("Digite a data prevista para a devolução: ");
		        String dataPrevistaDevolucao = entrada.nextLine();

		        System.out.println("O livro foi devolvido? (true/false)");
		        boolean devolvido = entrada.nextBoolean();
		        String dataDevolucao = "";


		        if (devolvido) {

		            entrada.nextLine();

		            System.out.println("Digite a data que foi devolvido: ");
		            dataDevolucao = entrada.nextLine();
		          
		            livro.disponibilidade = true;

		        } else {

		            livro.disponibilidade = false;
		            System.out.println("O livro continua emprestado.");
		            }
		        
		        
		            Emprestimo emprestimo = new Emprestimo(
		            	    livro,
		            	    leitor,
		            	    dataEmprestimo,
		            	    dataPrevistaDevolucao,
		            	    dataDevolucao
		            	);
		            System.out.println("Livro: " + emprestimo.livro.titulo);
		            System.out.println("Leitor: " + emprestimo.leitor.nome);
		            System.out.println("Data do empréstimo: " + emprestimo.dataEmprestimo);
		            System.out.println("Data prevista para devolução: " + emprestimo.dataPrevistaDevolucao);
		            System.out.println("Data da devolução: " + emprestimo.dataDevolucao);
		       
		            
					           	   
		       } else {
		    	   System.out.println("O livro não esta disponível para emprestimo");
		       }
		      
		       		
		     
		       
		    	   
				System.out.println( "Título: " + livro.titulo );
				System.out.println( "Autor: " + livro.autor );
				System.out.println( " ISBN: " + livro.isbn);
				System.out.println("Editora: " + livro.editora);
				System.out.println("Ano: " + livro.ano);
				System.out.println("Quantidade: " + livro.quantidade);
				System.out.println(" Disponibilidade: " + livro.disponibilidade);
				
				
		       }
		        
		     
		
	
		
		
		
		
		
		
		
	}

