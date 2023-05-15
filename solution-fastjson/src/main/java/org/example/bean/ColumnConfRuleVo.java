package org.example.bean;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

public class ColumnConfRuleVo implements Serializable {

    private static final long serialVersionUID = -1L;

    private Long id;

    private Integer visible;

    private Integer width;

    /**
     * 对应 user_column_custom_config.config
     * 有些列配置下面还会套一层 列额外配置
     * 查询会填充到 ColumnConf.config
     */
    private JSONObject customizeConfig;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public JSONObject getCustomizeConfig() {
        return customizeConfig;
    }

    public void setCustomizeConfig(JSONObject customizeConfig) {
        this.customizeConfig = customizeConfig;
    }

}
