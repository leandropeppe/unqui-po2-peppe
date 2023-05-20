package ar.edu.unq.po2.tp8.Parcelas;

import java.util.*;

public class ParcelaMixta implements Parcela {
	
	private List<Parcela> hijos = new ArrayList<Parcela>();
	private int nivel = 0 ;
	
	public ParcelaMixta() {
		super();
	}

	@Override
	public int getNivel() {
		return nivel;
	}

	@Override
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public void agregarParcelas(Parcela parcela1, Parcela parcela2, Parcela parcela3, Parcela parcela4) {
		parcela1.setNivel(this.getNivel() + 1);
		hijos.add(parcela1);
		parcela2.setNivel(this.getNivel() + 1);
		hijos.add(parcela2);
		parcela3.setNivel(this.getNivel() + 1);
		hijos.add(parcela3);
		parcela4.setNivel(this.getNivel() + 1);
		hijos.add(parcela4);
	}
	
	public void eliminarParcela(Parcela parcela) {
		hijos.remove(parcela);
	}

	@Override
	public double recaudacionAnual() {
		double recaudacion = 0;
		for(Parcela hijo: hijos) {
			recaudacion += hijo.recaudacionAnual();
		}
		return recaudacion ;
	}

	@Override
	public double valor() {
		// TODO Auto-generated method stub
		return 0;
	}

}
