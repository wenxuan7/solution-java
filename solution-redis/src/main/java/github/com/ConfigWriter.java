package github.com;

import github.com.bean.Config;

public interface ConfigWriter {

    boolean write(Config config);

    boolean writes(Config... configs);

}
