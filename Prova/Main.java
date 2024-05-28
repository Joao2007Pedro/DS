
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Livro livro = new Livro("O Principe", "Nicolau Maquiavel", 1532, 176, "Penguin Classics");
			Revista revista = new Revista("Rolling Stone", "Jann Wenner", 1967, 10, "Wenner Media");
			
				System.out.println("Detalhes do Livro:");
				livro.exibirDetalhes();
				System.out.println();
				
				System.out.println("Detalhes do Livro sem a Editora:");
				livro.exibirDetalhes(false);
				System.out.println();

				System.out.println("Detalhes da Revista:");
				revista.exibirDetalhes();
				System.out.println();
				
				System.out.println("Detalhes da Revista sem a Editora:");
				revista.exibirDetalhes(false);
			}
		}
