package org.mt.model.dao.chat;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by on 2022/6/24 下午3:20
 * @author wanghaiguang
 */
@Data
public class ChatUser {
    private Integer id;

    private Integer chatUserId;

    private String userName;

    private Integer status;

    private List<Integer> friendIds;

    private Integer isDel;

    private LocalDateTime ctime;

    private LocalDateTime utime;
}
