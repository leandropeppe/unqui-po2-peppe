package ar.edu.unq.po2.tp8;

public class ParcelaPura implements Parcela {

	private String cultivo ;
	private int nivel ;
	
	public ParcelaPura(String cultivo) {
		super();
		this.cultivo = cultivo;
	}

	
	@Override
	public double recaudacionAnual() {
		if(cultivo == "Trigo") {
			return 300 / ( Math.pow(2, nivel) );
		}else {
			return 500 / (Math.pow(2, nivel) );
		}
	}


	@Override
	public int getNivel() {
		// TODO Auto-generated method stub
		return this.nivel;
	}


	@Override
	public void setNivel(int nivel) {
		this.nivel = nivel ;
	}

}
