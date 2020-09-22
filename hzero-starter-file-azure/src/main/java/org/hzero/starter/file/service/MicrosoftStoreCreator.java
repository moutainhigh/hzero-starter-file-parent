package org.hzero.starter.file.service;

import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author shuangfei.zhu@hand-china.com 2019/12/18 19:08
 */
@Component
public class MicrosoftStoreCreator implements StoreCreator {

    @Override
    public Integer storeType() {
        return 11;
    }

    @Override
    public AbstractFileService getFileService() {
        return new MicrosoftFileServiceImpl();
    }
}
