package OO1Composicao.C3Curso;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Teo");
		Aluno a3 = new Aluno("Lia");
		
		Curso c1 = new Curso("Backend");
		Curso c2 = new Curso("Frontend");
		Curso c3 = new Curso("Web");
		
		c1.adicionarAluno(a1);
		c1.adicionarAluno(a2);
		
		c2.adicionarAluno(a3);
		c2.adicionarAluno(a1);
		
		a1.adicionarCurso(c3);
		a2.adicionarCurso(c3);
		
		for(Aluno aluno: c3.alunos) {
			System.out.println("Estou matriculado no curso " + c3.nome + " ...");
			System.out.println("... e o meu nome é " + aluno.nome );
		}
		
		System.out.println(a1.cursos.get(0).alunos);//pega do toString
		
		Curso encontrado = a1.obterCursoPorNome("Web");
		
		System.out.println(encontrado.alunos);
	}

}
