package ar.edu.unq.po2.tp8.Parcelas;

public class ParcelaPura implements Parcela {

	private String cultivo ;
	private int nivel ;
	
	public ParcelaPura(String cultivo) {
		super();
		this.cultivo = cultivo;
	}

	
	@Override
	public double recaudacionAnual() {
		return this.valor() / 4;
		/*
		if(cultivo == "Trigo") {
			return 300 / ( Math.pow(2, nivel) * 2 );
		}else {
			return 500 /  (Math.pow(2, nivel) * 2 );
		}*/
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


	@Override
	public double valor() {
		// TODO Auto-generated method stub
		return 0;
	}

}
