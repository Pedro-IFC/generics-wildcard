package atv1Generic;

public class Moveis {
	
	   private String nome;                                        
       	private double tamanho;                                    
	   	private String cor;                                        
	   	                                                           
      	public Moveis(String name, double tam, String color) {
       		setNome(name);                                            
       		setTamanho(tam);                                          
       		setCor(color);                                            
       	}                                                          
                                                                   
       	                                                           
       	public String getNome() {                                  
       		return nome;                                              
       	}                                                          
       	public void setNome(String nome) {                         
       		this.nome = nome;                                         
       	}                                                          
       	public double getTamanho() {                               
       		return tamanho;                                           
       	}                                                          
       	public void setTamanho(double tamanho) {                   
       		this.tamanho = tamanho;                                   
       	}                                                          
       	public String getCor() {                                   
       		return cor;                                               
       	}                                                          
       	public void setCor(String cor) {                           
       		this.cor = cor;                                           
       	}                                                          
       	@Override                                                  
       	public String toString() {                                 
       		StringBuilder builder = new StringBuilder();              
       		builder.append("nome do item = ");                        
       		builder.append(nome);                                     
       		builder.append(", tamanho do objeto = ");                 
       		builder.append(tamanho);                                  
       		builder.append(" metros, cor = ");                        
       		builder.append(cor);                                      
       		builder.append("\n");                                     
       		return builder.toString();                                
       	}
}