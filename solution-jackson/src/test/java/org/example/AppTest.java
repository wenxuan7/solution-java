package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.domain.EntryOrderConfirmRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    private static final Logger log = LoggerFactory.getLogger(AppTest.class);

    /**
     * Create the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        XmlMapper.Builder build = new XmlMapper.Builder(new XmlMapper());
        XmlMapper mapper = build.build();
        mapper.setConfig(
                mapper.getSerializationConfig().withRootName("request").with()
        );
        // 反序列化 xml节点在bean中没有属性对应 不做失败处理
        mapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 字段不为null做序列化
        mapper.setSerializationInclusion(NON_NULL);

        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?><request><orderLines><orderLine><actualQty>108</actualQty><inventoryType>ZP</inventoryType><itemCode>DWX101200000</itemCode><orderLineNo>1</orderLineNo><ownerCode>936519</ownerCode></orderLine><orderLine><actualQty>105</actualQty><inventoryType>ZP</inventoryType><itemCode>DWX404400000</itemCode><orderLineNo>1</orderLineNo><ownerCode>936519</ownerCode></orderLine><orderLine><actualQty>85</actualQty><inventoryType>ZP</inventoryType><itemCode>DWX323600000</itemCode><orderLineNo>2</orderLineNo><ownerCode>936519</ownerCode></orderLine><orderLine><actualQty>1000</actualQty><inventoryType>ZP</inventoryType><itemCode>hhx00100400g1416</itemCode><orderLineNo>3</orderLineNo><ownerCode>936519</ownerCode></orderLine><orderLine><actualQty>1000</actualQty><inventoryType>ZP</inventoryType><itemCode>hhx00100400g1214</itemCode><orderLineNo>4</orderLineNo><ownerCode>936519</ownerCode></orderLine><orderLine><actualQty>1000</actualQty><inventoryType>ZP</inventoryType><itemCode>hhx00100400g1012</itemCode><orderLineNo>5</orderLineNo><ownerCode>936519</ownerCode></orderLine><orderLine><actualQty>1000</actualQty><inventoryType>ZP</inventoryType><itemCode>hhx00100400g810</itemCode><orderLineNo>6</orderLineNo><ownerCode>936519</ownerCode></orderLine><orderLine><actualQty>1000</actualQty><inventoryType>ZP</inventoryType><itemCode>hhx00100400g68</itemCode><orderLineNo>7</orderLineNo><ownerCode>936519</ownerCode></orderLine><orderLine><actualQty>500</actualQty><inventoryType>ZP</inventoryType><itemCode>6c70018</itemCode><orderLineNo>8</orderLineNo><ownerCode>936519</ownerCode></orderLine><orderLine><actualQty>1250</actualQty><inventoryType>ZP</inventoryType><itemCode>BY0000015500G</itemCode><orderLineNo>9</orderLineNo><ownerCode>936519</ownerCode></orderLine><orderLine><actualQty>400</actualQty><inventoryType>ZP</inventoryType><itemCode>YX2010001000G</itemCode><orderLineNo>10</orderLineNo><ownerCode>936519</ownerCode></orderLine><orderLine><actualQty>600</actualQty><inventoryType>ZP</inventoryType><itemCode>hx20002kn</itemCode><orderLineNo>11</orderLineNo><ownerCode>936519</ownerCode></orderLine></orderLines><entryOrder><confirmType>0</confirmType><entryOrderCode>CG4247124762391250</entryOrderCode><entryOrderId>CRK202304110180</entryOrderId><entryOrderType>CGRK</entryOrderType><outBizCode>CRK202304110180</outBizCode><ownerCode>936519</ownerCode><status>FULFILLED</status><warehouseCode>03355</warehouseCode></entryOrder></request>";

        EntryOrderConfirmRequest req;
        try {
            req = mapper.readValue(xml, EntryOrderConfirmRequest.class);
        } catch (JsonProcessingException e) {
            log.error("xml转POJO错误", e);
            return;
        }

        log.info(req.getEntryOrder().getOutBizCode());
        log.info(req.getEntryOrder().getEntryOrderCode());

        String newXml;
        try {
            newXml = mapper.writeValueAsString(req);
        } catch (JsonProcessingException e) {
            log.error("POJO转xml错误", e);
            return;
        }
        log.info(newXml);

        ObjectMapper oMapper = new ObjectMapper();
        // 反序列化 json节点在bean中没有属性对应 不做失败处理
        oMapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 字段不为null做序列化
        oMapper.setSerializationInclusion(NON_NULL);
        String json = null;
        try {
            json = oMapper.writeValueAsString(req);
        } catch (JsonProcessingException e) {
            log.error("POJO转json错误", e);
        }
        log.info(json);
    }

}
