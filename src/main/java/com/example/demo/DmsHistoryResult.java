package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ning Baoqi
 * @date 2019/11/11 9:49
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DmsHistoryResult {
    /**
     * 返回结果唯一序列号
     */
    String submitSequenceNumber ;
    /**
     * 下载及发送结果
     */
    String result;
}
