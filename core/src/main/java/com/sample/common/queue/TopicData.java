package com.sample.common.queue;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TopicData implements Serializable {
    private static final long serialVersionUID = 1L;

    private String topic;
    private Object payload;
}
