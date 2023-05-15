package github.com.api;

import github.com.bean.Config;
import github.com.bean.ConfigEnum;

import java.util.Map;

public interface ConfigReader {

    Config read(ConfigEnum configEnum);

    Map<String, Config> reads(ConfigEnum... configEnums);

    Map<String, Config> readAll();

}
