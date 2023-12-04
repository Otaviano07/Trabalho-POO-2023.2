package model;

import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Usuario {
	
	private static int idUsuario = 0;
	private String nomeCompleto;
	private LocalDate dataNascimento;
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
	
	public Usuario(String nomeCompleto, Date dataNascimento, String cpf, String rg, String telefone,
            String email, String funcao, String formacao, String login, String senha) {
                Usuario.idUsuario = idUsuario++;
                this.setNomeCompleto(nomeCompleto);
                this.setDataNascimento(dataNascimento);
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
			this.nomeCompleto = nomeCompleto.toLowerCase();
		}
	}
    
    public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	
	public void setDataNascimento(Date dataNascimento) {
		if(dataNascimento != null) {
			try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                LocalDate data = LocalDate.parse((CharSequence) dataNascimento, formatter);

                if (data.isBefore(LocalDate.now())) {
                    this.dataNascimento = data;
                }
            } catch (Exception e) {
                System.out.println("Formato de data inválido. Use o formato dd/MM/yyyy.");
            }
		}
	}
    
    public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	
	public void setIdade() {
		LocalDate dataAtual = LocalDate.now();
        this.idade = Period.between(getDataNascimento(), dataAtual).getYears();
	}
	
	public int getIdade() {
		return idade;
	}
	
	
	public void setCpf(String cpf) {
		if(cpf != null && !cpf.isEmpty()) {
			String numero = cpf.replaceAll("[^0-9]", "");

			if (numero.matches("\\d{11}")) {
				this.cpf = numero;
			}
		}
	}
	
	public String getCpf() {
		return cpf;
	}
	
	
	public void setRg(String rg) {
		if(rg != null && !rg.isEmpty()) {
			String numero = rg.replaceAll("[^0-9]", "");

			if (numero.matches("\\d{8,11}")) {
				this.rg = numero;
			}
		}
	}
    
    public String getRg() {
		return rg;
	}
	
	
	public void setTelefone(String telefone) {
		if(telefone != null && !telefone.isEmpty()) {
			String numero = telefone.replaceAll("[^0-9]", "");

			if (numero.matches("\\d{11}")) {
				this.telefone = numero;
			}
		}
	}
    
    public String getTelefone() {
		return telefone;
	}
	
	
	public void setEmail(String email) {
		if(email != null && !email.isEmpty()) {
			if(email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$")){
				this.email = email;
			}
			
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
			if (login.matches("\\d{8,20}")) {
				this.login = login;
			}
		}
	}
    
    public String getLogin() {
		return login;
	}
	
	
	public void setSenha(String senha) {
		if(senha != null && !senha.isEmpty()) {
			if(senha.matches("\\d{6,12}")){
				this.senha = senha;
			}
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