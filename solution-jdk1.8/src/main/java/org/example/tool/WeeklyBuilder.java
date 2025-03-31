package org.example.tool;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WorkOrderWeeklyBuilder {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        // 使用绝对路径，前面加 "/"
        InputStream inputStream = WorkOrderWeeklyBuilder.class.getResourceAsStream("/test.json");

        if (inputStream == null) {
            System.out.println("文件未找到！");
            return;
        }

        String line;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (Exception e) {
            throw new RuntimeException("读取文件错误, path: /test.json", e);
        }

        JSONObject obj = JSONObject.parseObject(builder.toString());
        JSONObject data = obj.getJSONObject("data");
        JSONArray jsonArray = data.getJSONArray("content");
        for (int i = 0; i < jsonArray.size(); i++) {
            String str = jsonArray.get(i).toString();
            WorkOrder workOrder = JSONObject.parseObject(str, WorkOrder.class);
            System.out.println(i + 1 + ". " + workOrder.getId() + " " + workOrder.subDescription());
        }
    }
}
