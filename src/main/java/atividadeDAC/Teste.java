package atividadeDAC;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		AlunoBean ab = new AlunoBean();

		ab.getAluno().setIdade(10);
		
		
		
		System.out.println(ab.getAluno());
	}

}
