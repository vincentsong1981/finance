/**
 * Copyright 2015 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package welab.finance.web.exception;

/**
 * @author <a href="mailto:vincent@wolaidai.com">vincent</a>
 */
public class WebException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8686443917553684370L;

	/**
	 * 
	 */
	public WebException()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public WebException(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public WebException(Throwable cause)
	{
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public WebException(String message, Throwable cause)
	{
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public WebException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
