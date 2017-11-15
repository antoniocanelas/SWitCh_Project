package week8;

public class EnderecoPostal {

    private String morada;
    private String cidade;
    private String codigoPostal;
    private String pais;

    public String getMorada() {

	return morada;
    }

    public void setMorada(String morada) {

	this.morada = morada;
    }

    public String getCidade() {

	return cidade;
    }

    public void setCidade(String cidade) {

	this.cidade = cidade;
    }

    public String getCodigoPostal() {

	return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {

	this.codigoPostal = codigoPostal;
    }

    public String getPais() {

	return pais;
    }

    public void setPais(String pais) {

	this.pais = pais;
    }

    @Override
    public String toString() {

	return "EnderecoPostal [morada=" + morada + ", cidade=" + cidade + ", codigoPostal=" + codigoPostal + ", pais="
		+ pais + "]";
    }

    public EnderecoPostal(String morada, String cidade, String codigoPostal, String pais) {

	this.morada = morada;
	this.cidade = cidade;
	this.codigoPostal = codigoPostal;
	this.pais = pais;
    }

    public void addEnderecoPostal(EnderecoPostal novoEnderecoPostal) {

	this.addEnderecoPostal(novoEnderecoPostal);
    }

}
