package com.lacsystem.pedido.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Luiz.Cesario
 *
 */
public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<>();



	public ValidationError(Long timeStamp, Integer status, String error, String message, String path) {
		super(timeStamp, status, error, message, path);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String messagem) {
		errors.add(new FieldMessage(fieldName, messagem));
	}

	

}
