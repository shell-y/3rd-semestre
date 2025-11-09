package sptech.school.atividadeBoleto.model;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class BoletoBancario {

    private int id;


    @NotBlank(message = "Banco não pode ser vazio ou nulo")
    @Pattern(regexp = "\\d{3}", message = "Banco deve conter exatamente 3 dígitos")
    private String banco;

    @NotBlank(message = "Agência não pode ser vazia ou nula")
    @Pattern(regexp = "\\d{4}", message = "Agência deve conter exatamente 4 dígitos")
    private String agencia;

    @NotBlank(message = "Conta não pode ser vazia ou nula")
    @Pattern(regexp = "\\d{4}", message = "Conta deve conter exatamente 4 dígitos")
    private String conta;

    @NotBlank(message = "Código de barras não pode ser vazio ou nulo")
    @Pattern(
            regexp = "\\d{5}\\.\\d{5} \\d{5}\\.\\d{6} \\d{5}\\.\\d{6} \\d \\d{14}",
            message = "Código de barras inválido"
    )
    private String codigoBarra;

    @NotNull(message = "Valor não pode ser nulo")
    @DecimalMin(value = "0.01", message = "Valor deve ser no mínimo 0.01")
    @DecimalMax(value = "10000.0", message = "Valor deve ser no máximo 10000")
    private Double valor;

    @NotNull(message = "Data de vencimento não pode ser nula")
    @FutureOrPresent(message = "Data de vencimento deve ser no presente ou futuro")
    private LocalDate dataVencimento;

    @NotBlank(message = "Nome do pagador não pode ser vazio ou nulo")
    @Size(min = 3, max = 100, message = "Nome do pagador deve ter entre 3 e 100 caracteres")
    private String nomePagador;

    @NotBlank(message = "Email não pode ser vazio ou nulo")
    @Email(message = "Email deve ser válido")
    private String email;

    @NotBlank(message = "CPF não pode ser vazio ou nulo")
    @Pattern(regexp = "\\d{11}", message = "CPF deve conter exatamente 11 dígitos")
    private String cpf;

    //GETTERS & SETTERS
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public String getCodigoBarra() {
        return codigoBarra;
    }
    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public LocalDate getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    public String getNomePagador() {
        return nomePagador;
    }
    public void setNomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }




}//FIM CLASSE
