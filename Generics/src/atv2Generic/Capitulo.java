package atv2Generic;

public class Capitulo {
	
	private String subTitulo;
	private int paginas;
	
	public Capitulo(String subT, int pag) {
		setSubTitulo(subT);
		setPaginas(pag);
	}
	
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String getSubTitulo() {
		return subTitulo;
	}
	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quantidade de páginas no capitulo = ");
		builder.append(paginas);
		builder.append("pg, subTitulo do capitulo = ");
		builder.append(subTitulo);
		builder.append("");
		return builder.toString();
	} 
}
