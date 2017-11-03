
package week5;

public class _Ponto {

    private int x;
    private int y;

    public _Ponto() {// o construtor torna as variáveis x e y a 0

    }

    public _Ponto(int x, int y) {// este construtor usa x e y variáveis locais, this.x e this.y variáveis da
				// classe

	this.x = x;
	this.y = y;
    }

    public int getX() {

	return x;
    }

    public void setX(int x) {

	this.x = x;
    }

    public int getY() {

	return y;
    }

    public void setY(int y) {

	this.y = y;
    }

    @Override
    public boolean equals(Object obj) {

	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	_Ponto other = (_Ponto) obj;
	if (x != other.x) {
	    return false;
	}
	if (y != other.y) {
	    return false;
	}
	return true;
    }

}
