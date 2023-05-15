package org.example;

import com.alibaba.fastjson.JSONObject;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.bean.ColumnConfRuleVo;

import java.util.List;

/**
 * fastjson 测试
 */
public class AppTest extends TestCase {

    public AppTest(String testName) {
        super(testName);
    }


    public static Test suite() {
        return new TestSuite(AppTest.class);
    }


    public void testApp() {
        String json = "[{\"id\":958,\"visible\":1,\"width\":60},{\"id\":356,\"visible\":1,\"width\":180},{\"id\":982,\"visible\":0,\"width\":150},{\"id\":989,\"visible\":0,\"width\":150},{\"id\":3489,\"visible\":1,\"width\":120},{\"id\":534,\"visible\":0,\"width\":130},{\"id\":829,\"visible\":1,\"width\":120},{\"id\":357,\"visible\":1,\"width\":130},{\"id\":396,\"visible\":0,\"width\":150},{\"id\":2944,\"visible\":0,\"width\":150},{\"id\":358,\"visible\":1,\"width\":150},{\"id\":902,\"visible\":1,\"width\":150},{\"id\":359,\"visible\":1,\"width\":150},{\"id\":375,\"visible\":0,\"width\":150},{\"id\":903,\"visible\":1,\"width\":150},{\"id\":360,\"visible\":1,\"width\":180},{\"id\":941,\"visible\":0,\"width\":150},{\"id\":361,\"visible\":1,\"width\":240},{\"id\":362,\"visible\":1,\"width\":150},{\"id\":363,\"visible\":1,\"width\":120},{\"id\":364,\"visible\":1,\"width\":280},{\"id\":365,\"visible\":1,\"width\":320,\"customizeConfig\":{\"sys_sku_properties\":true,\"item_short_title\":true,\"platform_outer_id\":true,\"main_sys_outer_id\":true,\"sys_outer_id\":false,\"item_title\":false,\"picture_visible\":true,\"plat_sku_properties\":false}},{\"id\":366,\"visible\":0,\"width\":200},{\"id\":367,\"visible\":0,\"width\":220},{\"id\":368,\"visible\":0,\"width\":120},{\"id\":686,\"visible\":1,\"width\":130},{\"id\":369,\"visible\":0,\"width\":120},{\"id\":378,\"visible\":0,\"width\":160},{\"id\":370,\"visible\":0,\"width\":150},{\"id\":376,\"visible\":0,\"width\":150},{\"id\":436,\"visible\":0,\"width\":150},{\"id\":2999,\"visible\":0,\"width\":150},{\"id\":3147,\"visible\":0,\"width\":150},{\"id\":371,\"visible\":0,\"width\":240},{\"id\":1307,\"visible\":0,\"width\":160},{\"id\":372,\"visible\":0,\"width\":160},{\"id\":373,\"visible\":0,\"width\":180},{\"id\":377,\"visible\":0,\"width\":160},{\"id\":672,\"visible\":0,\"width\":160},{\"id\":685,\"visible\":0,\"width\":160},{\"id\":374,\"visible\":0,\"width\":180},{\"id\":379,\"visible\":0,\"width\":180},{\"id\":3675,\"visible\":0,\"width\":150},{\"id\":380,\"visible\":0,\"width\":150},{\"id\":465,\"visible\":0,\"width\":130},{\"id\":533,\"visible\":0,\"width\":130},{\"id\":955,\"visible\":1,\"width\":180},{\"id\":749,\"visible\":0,\"width\":120},{\"id\":1005,\"visible\":0,\"width\":150},{\"id\":1054,\"visible\":0,\"width\":150},{\"id\":1077,\"visible\":0,\"width\":150},{\"id\":1082,\"visible\":0,\"width\":150},{\"id\":1163,\"visible\":1,\"width\":180},{\"id\":1188,\"visible\":0,\"width\":160},{\"id\":1203,\"visible\":0,\"width\":160},{\"id\":1219,\"visible\":0,\"width\":160},{\"id\":3023,\"visible\":0,\"width\":150},{\"id\":3053,\"visible\":0,\"width\":120},{\"id\":3481,\"visible\":0,\"width\":180},{\"id\":3108,\"visible\":0,\"width\":150},{\"id\":3109,\"visible\":0,\"width\":150},{\"id\":3502,\"visible\":0,\"width\":180},{\"id\":3501,\"visible\":0,\"width\":180},{\"id\":4235,\"visible\":0,\"width\":200},{\"id\":3882,\"visible\":0,\"width\":180},{\"id\":4256,\"visible\":0,\"width\":150},{\"id\":4269,\"visible\":0,\"width\":100},{\"id\":4296,\"visible\":0,\"width\":150}]";
        List<ColumnConfRuleVo> columnConfRuleVos = JSONObject.parseArray(json, ColumnConfRuleVo.class);

        for (ColumnConfRuleVo columnConfRuleVo : columnConfRuleVos) {
            System.out.println(columnConfRuleVo.getCustomizeConfig());
        }

        System.out.println(JSONObject.toJSON(columnConfRuleVos));
    }
}
