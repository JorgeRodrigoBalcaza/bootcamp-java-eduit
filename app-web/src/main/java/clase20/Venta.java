package clase20;

import java.util.Date;

//clase inmutable
public class Venta {

	private Vendedor vendedor;
	private Date fecha;
	private Double monto;
	
	//debe nacer si o si con los datos
	public Venta(Vendedor vendedor, Date fecha, Double monto) {
		this.vendedor = vendedor;
		this.fecha = fecha;
		this.monto = monto;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public Date getFecha() {
		return fecha;
	}

	public Double getMonto() {
		return monto;
	}

	@Override
	public String toString() {
		return "Venta [vendedor=" + vendedor + ", fecha=" + fecha + ", monto=" + monto + "]";
	}
	
	//hashCode|equals
}
