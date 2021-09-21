package atividadeDAC;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="MBALUNO")
public class AlunoBean {

	private Aluno aluno = new Aluno();
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public void salvar() {
		
		System.out.println(aluno);

	}

}
