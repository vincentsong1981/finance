/**
 * Copyright 2014 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package configuration;


public class ConfigException extends RuntimeException
{

	public ConfigException(Exception e)
	{
		super(e);
	}

	public ConfigException(String msg)
	{
		super(msg);
	}

	private static final long serialVersionUID = -3713295084110650730L;

}
