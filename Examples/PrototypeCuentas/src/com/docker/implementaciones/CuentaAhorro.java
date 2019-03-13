package com.docker.implementaciones;

import com.docker.interfaces.InterfazCuentaClonable;

public class CuentaAhorro implements InterfazCuentaClonable{
	
	private String tipo;
	private double monto;
	
	public CuentaAhorro() {
		this.tipo="Ahorro";
	}
	
	@Override
	public InterfazCuentaClonable clonar() {
		CuentaAhorro clon= null;
			try {
				clon=(CuentaAhorro) clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return clon;
		
	}

	@Override
	public String toString() {
		return "CuentaAhorro [tipo=" + tipo + ", monto=" + monto + "]";
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
