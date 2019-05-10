package br.com.feltex.academicnet.mb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.feltex.academicnet.dao.AlunoDAO;
import br.com.feltex.academicnet.dao.DAOFactory;
import br.com.feltex.academicnet.entidade.Aluno;

@ManagedBean(name = "alunoMB")
public class AlunoMB implements Serializable {

	private static final long serialVersionUID = 8103328274400432976L;
	private Aluno aluno;
	private List<Aluno> lista = new ArrayList<>();
	
//  O nosso ManagedBean utilizar um padr�o de projeto DAOFactory, ou seja, 
//	existe uma classe que gera uma inst�ncia de um objeto que acessa o Banco de dados.
	AlunoDAO dao = DAOFactory.getAlunoDAO();

	public AlunoMB() {
		aluno = new Aluno();
		listar();
	}

	public void alterar() {
		System.out.println("Alterar aluno");
		dao.alterar(aluno);
		listar();
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Manutenção de usuário: ",
						"Usuario alterado com sucesso!"));
	}

	public void consultar() {
		long matriculaConsulta = aluno.getMatricula();
				System.out.println("Consultar");
		aluno = dao.consultar(aluno);
		if (aluno == null || aluno.getMatricula() == 0) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR,
							"Manutenção de usuário: ",
							"Usuario não encontrado matrícula:" + matriculaConsulta + "!"));
		}
		listar();

	}

	public void excluir() {
		System.out.println("Excluir aluno");
		dao.excluir(aluno);
		listar();
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Manutenção de usuário: ",
						"Usuario excluído com sucesso!"));
	}

	public Aluno getAluno() {
		return aluno;
	}

	public List<Aluno> getLista() {
		return lista;
	}

	public void incluir() {
		System.out.println("Incluir aluno");
		dao.inserir(aluno);
		listar();
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Manutenção de usuário: ",
						"Usuario incluido com sucesso!"));
	}

	public void limpar() {
		System.out.println("Limpar");
		System.out.println(aluno);
		aluno = new Aluno();
	}

	public void listar() {
		System.out.println("Listar aluno");
		lista = dao.listar();
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public void setLista(List<Aluno> lista) {
		this.lista = lista;
	}
}