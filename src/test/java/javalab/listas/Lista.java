package javalab.listas;

public interface Lista extends Iterable<Object>{
	/**
	 * Agrega un dato a la lista como último elemento de la misma
	 * @param dato: cualquier objeto
	 * @return: La misma lista
	 */
	public Lista add(Object dato);
	/**
	 * Devuelve el dato en la posición indicada por el parámetro:idx
	 * @param idx: int de 0..(size-1)
	 * @return: devuelve el dato
	 */
	public Object item(int idx);
	public int size();
	/**
	 * Elimina el dato que se encuentra en la posición indicada por el parámetro: idx
	 * @param idx: int de 0..(size-1)
	 * @return: devuelve el dato eliminado
	 */
	public Object remove(int idx);
}
