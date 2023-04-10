package com.giantlizard.core.utils;

import com.giantlizard.base.entity.BaseEntity;
import com.giantlizard.core.annotation.LogRecord;
import lombok.Data;

@Data
public class Test extends BaseEntity {

    @LogRecord(description = "姓名",type = "1",isOpen = false)
    private String name;

    private String username;
}
