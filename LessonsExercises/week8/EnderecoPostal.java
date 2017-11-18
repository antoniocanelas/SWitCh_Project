package week8;

// isto é um teste1
public class EnderecoPostal {

    private String morada;
    private String cidade;
    private String codigoPostal;
    private String pais;

    public String getMorada() {

	return this.morada;
    }

    public void setMorada(String morada) {

	this.morada = morada;
    }

    public String getCidade() {

	return this.cidade;
    }

    public void setCidade(String cidade) {

	this.cidade = cidade;
    }

    public String getCodigoPostal() {

	return this.codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {

	this.codigoPostal = codigoPostal;
    }

    public String getPais() {

	return this.pais;
    }

    public void setPais(String pais) {

	this.pais = pais;
    }

    @Override
    public String toString() {

	return "EnderecoPostal [morada=" + this.morada + ", cidade=" + this.cidade + ", codigoPostal="
		+ this.codigoPostal + ", pais=" + this.pais + "]";
    }

    public EnderecoPostal(String morada, String cidade, String codigoPostal, String pais) {

	this.morada = morada;
	this.cidade = cidade;
	this.codigoPostal = codigoPostal;
	this.pais = pais;
    }

}
