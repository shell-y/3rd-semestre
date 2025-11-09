package sptech.school.cadastro.dto;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class UsuarioDTO {
    @NotNull(message = "O ID não pode ser nulo")
    private Long id;

    @NotBlank(message = "O nome não pode estar em branco")
    private String nome;

    @NotEmpty(message = "O apelido não pode estar vazio")
    private String apelido;

    @Email(message = "O e-mail deve ser válido")
    private String email;

    @Min(value=18, message = "A idade mínima é 18 anos")
    @Max(value=120, message="A idade máxima é 120 anos")
    private Integer idade;

    @Positive(message = "O salário deve ser um valor positivo")
    @DecimalMin(value = "1000.00",message = "O salário deve ser maior que R$1000")
    @DecimalMax(value = "100000.00",message = "O maior salário é de R$100.000")
    @Digits(integer=5, fraction = 2, message = "O salário deve conter 5 digitos e possuir 2 casas decimais")
    private Double salario;

    @Past(message = "A data de nascimento deve ser anterior ao dia atual")
    private LocalDate dataNascimento;

    @Future(message = "A data de expiração deve ser uma data futura")
    private LocalDate dataExpiracao;

    @AssertTrue(message = "O usuário deve aceitar os Termos")
    private boolean aceitaTermos;

    @AssertFalse(message = "O usuário não pode ser banido")
    private boolean banido;

    @Pattern(regexp = "\\d{11}",message = "O CPF deve conter exatamente 11 digitos")
    private String cpf;

    @Size(min=8,max=16,message = "A senha deve ter de 8 a 16 caracteres")
    private String senha;

    //GETTERS & SETTERS
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }
    public void setDataExpiracao(LocalDate dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }
    public boolean isAceitaTermos() {
        return aceitaTermos;
    }
    public void setAceitaTermos(boolean aceitaTermos) {
        this.aceitaTermos = aceitaTermos;
    }
    public boolean isBanido() {
        return banido;
    }
    public void setBanido(boolean banido) {
        this.banido = banido;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }




}//FIM CLASSE
