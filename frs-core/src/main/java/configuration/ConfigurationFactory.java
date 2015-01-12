package configuration;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.DefaultConfigurationBuilder;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author <a href="mailto:spacewen@wolaidai.com">spacewen</a>
 */
public class ConfigurationFactory
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ConfigurationFactory.class);
	private static final ConfigurationFactory INSTANCE = new ConfigurationFactory();
	private Configuration m_envConfig;
	private CompositeConfiguration m_setting;
	private Configuration m_dataConfig;
	private CompositeConfiguration m_localesConfig;
	private CompositeConfiguration m_config;

	private ConfigurationFactory()
	{
		initEnviroment();
		initSetting();
//		initDatas();
//		initLocales();
		compositeAll();
	}

	private void initEnviroment()
	{
		try
		{
			m_envConfig = new PropertiesConfiguration("env.properties");
		}
		catch (ConfigurationException e)
		{
			LOGGER.error("", e);
			throw new ConfigException(e);
		}
	}

	private void initSetting()
	{
		m_setting = new CompositeConfiguration();
		m_setting.addConfiguration(loadSettingByEnv());
		m_setting.addConfiguration(loadBaseSetting());
	}

	private Configuration loadSettingByEnv()
	{
		String env = m_envConfig.getString("service.env");
		try
		{
			return new DefaultConfigurationBuilder(m_envConfig.getString(env + ".config.file")).getConfiguration();
		}
		catch (ConfigurationException e)
		{
			LOGGER.error("", e);
			throw new ConfigException(e);
		}
	}

	private Configuration loadBaseSetting()
	{
		try
		{
			return new DefaultConfigurationBuilder("config/config.xml").getConfiguration();
		}
		catch (ConfigurationException e)
		{
			LOGGER.error("", e);
			throw new ConfigException(e);
		}
	}

	/*private DefaultConfigurationBuilder getDefaultConfigurationBuilder(String configFile) throws ConfigurationException
	{
		DefaultConfigurationBuilder configBuilder = new DefaultConfigurationBuilder(configFile);
		DefaultConfigurationBuilder.FileConfigurationProvider provider =
				new DefaultConfigurationBuilder.FileConfigurationProvider(YAMLConfiguration.class);
		configBuilder.addConfigurationProvider("yml", provider);
		return configBuilder;
	}*/

/*	private void initDatas()
	{
		Map<String, Object> datasMap = new HashMap<>();
		datasMap.put(DatasConfiguration.SCHOOLS, ConfigurationUtils.locate("config/datas/school.json").getFile());
		datasMap.put(DatasConfiguration.DEGREES, ConfigurationUtils.locate("config/datas/educations.yml").getFile());
		datasMap.put(DatasConfiguration.AREAS, ConfigurationUtils.locate("config/datas/all_areas.json").getFile());
		datasMap.put(DatasConfiguration.RELATIONSHIPS, ConfigurationUtils.locate("config/datas/relationships.yml")
				.getFile());
		datasMap.put(DatasConfiguration.BANKS, ConfigurationUtils.locate("config/datas/banks.yml").getFile());
		m_dataConfig = new DatasConfiguration(datasMap);
	}*/

	/*private void initLocales()
	{
		m_localesConfig = new CompositeConfiguration();
		String locale = m_envConfig.getString("service.locale");
		locale = StringUtils.isBlank(locale) ? "zhCN" : locale;
		File localesDir = new File(ConfigurationUtils.locate("config/locales/" + locale).getFile());
		if (localesDir.isFile())
		{
			String eventMsg = localesDir.getAbsolutePath() + " is not a directory.";
			LOGGER.error(eventMsg);
			throw new ConfigException(eventMsg);
		}
		processDir(localesDir);
	}*/

	private void compositeAll()
	{
		m_config = new CompositeConfiguration();
		m_config.addConfiguration(m_envConfig);
		m_config.addConfiguration(m_setting);
		m_config.addConfiguration(m_dataConfig);
		m_config.addConfiguration(m_localesConfig);
	}

/*	private void processDir(File dir)
	{
		File[] files = dir.listFiles((file, name) -> {
			return file.isDirectory() || name.endsWith(".yml");
		});
		for (File file : files)
		{
			if (file.isDirectory())
			{
				processDir(file);
			}
			else
			{
				processFile(file);
			}
		}
	}*/

/*	private void processFile(File file)
	{
		try
		{
			m_localesConfig.addConfiguration(new YAMLConfiguration(file));
		}
		catch (ConfigurationException e)
		{
			LOGGER.error(file.getAbsolutePath(), e);
		}
	}*/

	public static ConfigurationFactory getInstance()
	{
		return INSTANCE;
	}

	public Configuration getEnvConfig()
	{
		return m_envConfig;
	}

	public Configuration getSetting()
	{
		return m_setting;
	}

	public Configuration getDatas()
	{
		return m_dataConfig;
	}

	public Configuration getLocales()
	{
		return m_localesConfig;
	}

	public CompositeConfiguration getConfig()
	{
		return m_config;
	}

}
