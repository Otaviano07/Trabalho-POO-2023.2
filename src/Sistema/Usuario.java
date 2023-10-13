package sistema;

import java.util.Date;

public class Usuario {
	
	private static int idUsuario = 0;
	private String nomeCompleto;
	private Date dataNascimento;
	private int idade;
	private String cpf;
	private String rg;
	private String telefone;
	private String email;
	private String funcao;
	private String formacao;
	private String login;
	private String senha;


	public Usuario() {
        this.nomeCompleto = null;
        this.dataNascimento = null;
        this.idade = 0;
        this.cpf = null;
        this.rg = null;
        this.telefone = null;
        this.email = null;
        this.funcao = null;
        this.formacao = null;
        this.login = null;
        this.senha = null;
    }
	
	public Usuario(String nomeCompleto, Date dataNascimento, int idade, String cpf, String rg, String telefone,
            String email, String funcao, String formacao, String login, String senha) {
                Usuario.idUsuario = idUsuario++;
                this.setNomeCompleto(nomeCompleto);
                this.setDataNascimento(dataNascimento);
                this.setIdade(idade);
                this.setCpf(cpf);
                this.setRg(rg);
                this.setTelefone(telefone);
                this.setEmail(email);
                this.setFuncao(funcao);
                this.setFormacao(formacao);
                this.setLogin(login);
                this.setSenha(senha);
    }

    public void setIdUsuario(int idUsuario) {
		if(idUsuario > 0) {
			Usuario.idUsuario = idUsuario;
		}
	}
    
    public int getIdUsuario() {
		return idUsuario;
	}
	
	
	public void setNomeCompleto(String nomeCompleto) {
		if(nomeCompleto != null && !nomeCompleto.isEmpty()) {
			this.nomeCompleto = nomeCompleto;
		}
	}
    
    public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	
	public void setDataNascimento(Date dataNascimento) {
		if(dataNascimento != null) {
			this.dataNascimento = dataNascimento;
		}
	}
    
    public Date getDataNascimento() {
		return dataNascimento;
	}
	
	
	public void setIdade(int idade) {
		if(idade > 0) {
			this.idade = idade;
		}
	}public int getIdade() {
		return idade;
	}
	
	
	public void setCpf(String cpf) {
		if(cpf != null && !cpf.isEmpty()) {
			this.cpf = cpf;
		}
	}public String getCpf() {
		return cpf;
	}
	
	
	public void setRg(String rg) {
		if(rg != null && !rg.isEmpty()) {
			this.rg = rg;
		}
	}
    
    public String getRg() {
		return rg;
	}
	
	
	public void setTelefone(String telefone) {
		if(telefone != null && !telefone.isEmpty()) {
			this.telefone = telefone;
		}
	}
    
    public String getTelefone() {
		return telefone;
	}
	
	
	public void setEmail(String email) {
		if(email != null && !email.isEmpty()) {
			this.email = email;
		}
	}
    
    public String getEmail() {
		return email;
	}
	
	
	public void setFuncao(String funcao) {
		if(funcao != null && !funcao.isEmpty()) {
			this.funcao = funcao;
		}
	}
    
    public String getFuncao() {
		return funcao;
	}
	
	
	public void setFormacao(String formacao) {
		if(formacao != null && !formacao.isEmpty()) {
			this.formacao = formacao;
		}
	}
    
    public String getFormacao() {
		return formacao;
	}
	
	
	public void setLogin(String login) {
		if(login != null && !login.isEmpty()) {
			this.login = login;
		}
	}
    
    public String getLogin() {
		return login;
	}
	
	
	public void setSenha(String senha) {
		if(senha != null && !senha.isEmpty()) {
			this.senha = senha;
		}
	}
    
    public String getSenha() {
		return senha;
	}

    public void adicionarPessoas(){
        /*Esse método será utilizado para adicionar um novo usuario*/
    }

    public void altararPessoa(){
        /*Esse método será utilizado para alterar dados de pessoa cadastrada*/
    }

    public void removerPessoa(){
        /*Esse método será utilizado para remover pessoa cadastrada */
    }

    public void calcularIdade(){
        /*Esse método será utilizado para calcular a idade com a data de nascimento fornecida*/
    }

    public void realizarLogin(){
        /*Esse método será utilizado para realizar autenticação no sistema*/
    }

    public void logout(){
        /*Esse método será utilizado para sair do sistema */
    }

    public void adicionarReserva() {
        /*Esse método será utilizado para adicionar reserva de equipamento ou espaco*/
    }

    public void alterarReserva() {
        /*Esse método será utilizado para alterar algum dados reserva 
        de equipamento ou espaco cadastrada*/
    }

    public void removerReserva() {
        /*Esse método será utilizado para remover uma reserva 
        de equipamento ou espaco cadastrada*/
    }
	
}