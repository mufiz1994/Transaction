package com.test;

public class ResourceNotFoundException extends Exception {

public static final long serialVersionUID = 1L;

public ResourceNotFoundException(String msg)
{
	super("NotFound:" + msg);
}
	

}
