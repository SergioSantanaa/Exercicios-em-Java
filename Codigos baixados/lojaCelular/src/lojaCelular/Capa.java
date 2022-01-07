package lojaCelular;

public class Capa {
	private String corCapa;
	private String material;
	private double precoCapa;

	public Capa(String corCapa, String material, double precoCapa) {
		super();
		this.corCapa = corCapa;
		this.material = material;
		this.precoCapa = precoCapa;
	}

	public String getCorCapa() {
		return this.corCapa;
	}

	public void setCorCapa(String corCapa) {
		this.corCapa = corCapa;
	}

	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPrecoCapa() {
		return this.precoCapa;
	}

	public void setPrecoCapa(double precoCapa) {
		this.precoCapa = precoCapa;
	}

}
