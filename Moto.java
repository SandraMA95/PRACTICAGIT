
/**
 * @author Sandra Macias Aragon
 * @version 21.febrero.2024
 **/

package proyecto;

/**
 * Creacion de la clase 'Moto' que hereda de la clase 'Vehiculo'
 */
enum Tipo {

		DEPORTIVA, TRAIL, CUSTOM, NAKED

	}

public class Moto extends Vehiculo {

	private String modelo;

	private String marca;

	private Tipo tipo;


	/**
	 * Constructor con todos los parametros de la clase 'Moto'
	 * @param nombre 
	 * @param dni 
	 * @param matricula
	 * @param kms
	 * @param modelo
	 * @param marca
	 */
	public Moto(String nombre, String dni, String matricula, int kms, String modelo, String marca, Tipo tipo) {
		super(nombre, dni, matricula, kms);

		this.marca = marca;

		this.modelo = modelo;

		this.tipo = tipo;
	}

	/**
	 * Metodo para conocer valor del parametro 'modelo'
	 * 
	 * @return modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Metodo para establecer valor del parametro 'modelo'
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Metodo para conocer valor del parametro 'marca'
	 * 
	 * @return marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Metodo para establecer valor del parametro 'marca'
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Metodo para conocer valor del parametro 'tipo'
	 * 
	 * @param tipo
	 */

	public void getTipo(){
		return tipo;
	}

	/**
	 * Metodo para establecer valor del parametro 'tipo'
	 * 
	 * @param tipo
	 */
	
	public void setTipo(Tipo tipo){
		this.tipo = tipo;
	}

	/**
	 * Metodo para leer datos de la clase 'Moto'
	 */
	public void leerDatos() {

		System.out.println(super.toString() + toString());
	}

	@Override
	public String toString() {
		return "Moto [marca=" + marca + ", modelo=" + modelo + "]";
	}

}
