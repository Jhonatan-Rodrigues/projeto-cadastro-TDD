package br.com.jhonatan.exceptions;

public class TipoChaveNaoEncontradaException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TipoChaveNaoEncontradaException(String msg) {
		this(msg,null);
	}

	public TipoChaveNaoEncontradaException(String msg, Throwable e) {
		super(msg,e);
		// TODO Auto-generated constructor stub
	}

}
