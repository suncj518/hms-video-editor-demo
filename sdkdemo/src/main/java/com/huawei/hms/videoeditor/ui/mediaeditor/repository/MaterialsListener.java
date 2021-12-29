
/*
 *   Copyright 2021. Huawei Technologies Co., Ltd. All rights reserved.
 *
 *      Licensed under the Apache License, Version 2.0 (the "License");
 *      you may not use this file except in compliance with the License.
 *      You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *      Unless required by applicable law or agreed to in writing, software
 *      distributed under the License is distributed on an "AS IS" BASIS,
 *      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *      See the License for the specific language governing permissions and
 *      limitations under the License.
 */

package com.huawei.hms.videoeditor.ui.mediaeditor.repository;

import java.util.List;

import com.huawei.hms.videoeditor.sdk.materials.network.response.MaterialsCloudBean;
import com.huawei.hms.videoeditor.ui.common.bean.MaterialsDownloadInfo;

public interface MaterialsListener {
    void pageData(List<MaterialsCloudBean> materialsCutContentList);

    void errorType(int type);

    void boundaryPageData(boolean isBoundaryPageData);

    void downloadInfo(MaterialsDownloadInfo materialsDownloadInfo);

    void loadUrlEvent(LoadUrlEvent mLoadUrlEvent);
}
