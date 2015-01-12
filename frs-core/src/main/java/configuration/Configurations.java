/**
 * Copyright 2014 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package configuration;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/**
 * @author <a href="mailto:spacewen@wolaidai.com">spacewen</a>
 */
public final class Configurations
{
	private Configurations(){}
	
	public static boolean isEmpty()
	{
		return ConfigurationFactory.getInstance().getConfig().isEmpty();
	}

	public static boolean containsKey(String key)
	{
		return ConfigurationFactory.getInstance().getConfig().containsKey(key);
	}

	public static Object getProperty(String key)
	{
		return ConfigurationFactory.getInstance().getConfig().getProperty(key);
	}

	public static Iterator<String> getKeys(String prefix)
	{
		return ConfigurationFactory.getInstance().getConfig().getKeys(prefix);
	}

	public static Iterator<String> getKeys()
	{
		return ConfigurationFactory.getInstance().getConfig().getKeys();
	}

	public static Properties getProperties(String key)
	{
		return ConfigurationFactory.getInstance().getConfig().getProperties(key);
	}

	public static boolean getBoolean(String key)
	{
		return ConfigurationFactory.getInstance().getConfig().getBoolean(key);
	}

	public static boolean getBoolean(String key, boolean defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getBoolean(key, defaultValue);
	}

	public static Boolean getBoolean(String key, Boolean defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getBoolean(key, defaultValue);
	}

	public static byte getByte(String key)
	{
		return ConfigurationFactory.getInstance().getConfig().getByte(key);
	}

	public static byte getByte(String key, byte defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getByte(key, defaultValue);
	}

	public static Byte getByte(String key, Byte defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getByte(key, defaultValue);
	}

	public static double getDouble(String key)
	{
		return ConfigurationFactory.getInstance().getConfig().getDouble(key);
	}

	public static double getDouble(String key, double defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getDouble(key, defaultValue);
	}

	public static Double getDouble(String key, Double defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getDouble(key, defaultValue);
	}

	public static float getFloat(String key)
	{
		return ConfigurationFactory.getInstance().getConfig().getFloat(key);
	}

	public static float getFloat(String key, float defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getFloat(key, defaultValue);
	}

	public static Float getFloat(String key, Float defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getFloat(key, defaultValue);
	}

	public static int getInt(String key)
	{
		return ConfigurationFactory.getInstance().getConfig().getInt(key);
	}

	public static int getInt(String key, int defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getInt(key, defaultValue);
	}

	public static Integer getInteger(String key, Integer defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getInteger(key, defaultValue);
	}

	public static long getLong(String key)
	{
		return ConfigurationFactory.getInstance().getConfig().getLong(key);
	}

	public static long getLong(String key, long defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getLong(key, defaultValue);
	}

	public static Long getLong(String key, Long defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getLong(key, defaultValue);
	}

	public static short getShort(String key)
	{
		return ConfigurationFactory.getInstance().getConfig().getShort(key);
	}

	public static short getShort(String key, short defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getShort(key, defaultValue);
	}

	public static Short getShort(String key, Short defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getShort(key, defaultValue);
	}

	public static BigDecimal getBigDecimal(String key)
	{
		return ConfigurationFactory.getInstance().getConfig().getBigDecimal(key);
	}

	public static BigDecimal getBigDecimal(String key, BigDecimal defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getBigDecimal(key, defaultValue);
	}

	public static BigInteger getBigInteger(String key)
	{
		return ConfigurationFactory.getInstance().getConfig().getBigInteger(key);
	}

	public static BigInteger getBigInteger(String key, BigInteger defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getBigInteger(key, defaultValue);
	}

	public static String getString(String key)
	{
		return ConfigurationFactory.getInstance().getConfig().getString(key);
	}

	public static String getString(String key, String defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getString(key, defaultValue);
	}

	public static String[] getStringArray(String key)
	{
		return ConfigurationFactory.getInstance().getConfig().getStringArray(key);
	}

	public static List<Object> getList(String key)
	{
		return ConfigurationFactory.getInstance().getConfig().getList(key);
	}

	public static List<Object> getList(String key, List<?> defaultValue)
	{
		return ConfigurationFactory.getInstance().getConfig().getList(key, defaultValue);
	}

}
