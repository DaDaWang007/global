package org.mt.model.dao.chat;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by on 2022/6/24 下午4:25
 * @author wanghaiguang
 */
@Data
public class ChatMessage {
    private Long id;
    private Integer type;
    private Integer userId;
    private Integer receiveId;
    private String context;
    private Integer status;
    private Integer isDel;

    private LocalDateTime ctime;

    private LocalDateTime utime;
}
