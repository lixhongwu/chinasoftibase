package com.jfinal.weixin.sdk.api;

import com.jfinal.kit.HttpKit;
import com.jfinal.kit.JsonKit;
import com.jfinal.weixin.sdk.kit.ParaMap;

/**
 * 用户分组管理
 * 
 * @author wanglvwei
 * 
 */
public class GroupApi {

    private static final String createGroup = "https://api.weixin.qq.com/cgi-bin/groups/create?access_token=";
    private static final String getAllGroups = "https://api.weixin.qq.com/cgi-bin/groups/get";
    private static final String getGroupId = "https://api.weixin.qq.com/cgi-bin/groups/getid?access_token=";
    private static final String updateGroup = "https://api.weixin.qq.com/cgi-bin/groups/update?access_token=";
    private static final String memberUpdate = "https://api.weixin.qq.com/cgi-bin/groups/members/update?access_token=";
    private static final String memberBatchUpdate = "https://api.weixin.qq.com/cgi-bin/groups/members/batchupdate?access_token=";
    private static final String deleteGroup = "https://api.weixin.qq.com/cgi-bin/groups/delete?access_token=";

    /**
     * 创建分组
     * 
     * @param jsonStr
     *            {"group":{"name":"test"}}
     * @return { "group": { "id": 107, "name": "test" } }
     */
    public static ApiResult createGroup(String jsonStr) {
        String jsonResult = HttpKit.post(createGroup + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
        return new ApiResult(jsonResult);
    }

    /**
     * 获取所有分组
     * 
     * @return { "groups": [ { "id": 0, "name": "未分组", "count": 72596 }, { "id":
     *         1, "name": "黑名单", "count": 36 }, { "id": 2, "name": "星标组",
     *         "count": 8 }, { "id": 104, "name": "华东媒", "count": 4 }, { "id":
     *         106, "name": "★不测试组★", "count": 1 } ] }
     */
    public static ApiResult getAllGroups() {
        ParaMap pm = ParaMap.create("access_token", AccessTokenApi.getAccessToken().getAccessToken());
        return new ApiResult(HttpKit.get(getAllGroups, pm.getData()));
    }

    /**
     * 获取用户所在分组
     * 
     * @param openid
     * @return{ "groupid": 102 }
     */
    public static ApiResult getGroupId(String openid) {
        ParaMap pm = ParaMap.create("openid", openid);
        String jsonResult = HttpKit.post(getGroupId + AccessTokenApi.getAccessToken().getAccessToken(), JsonKit.toJson(pm.getData()));
        return new ApiResult(jsonResult);
    }

    /**
     * 修改分组名
     * 
     * @param jsonStr
     *            {"group":{"id":108,"name":"test2_modify2"}}
     * @return {"errcode": 0, "errmsg": "ok"}
     */
    public static ApiResult updateGroup(String jsonStr) {
        String jsonResult = HttpKit.post(updateGroup + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
        return new ApiResult(jsonResult);
    }

    /**
     * 修改用户分组
     * 
     * @param jsonStr
     *            {"openid":"oDF3iYx0ro3_7jD4HFRDfrjdCM58","to_groupid":108}
     * @return {"errcode": 0, "errmsg": "ok"}
     */
    public static ApiResult memberUpdate(String jsonStr) {
        String jsonResult = HttpKit.post(memberUpdate + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
        return new ApiResult(jsonResult);
    }

    /**
     * 批量修改用户分组
     * 
     * @param jsonStr
     *            {"openid_list":["oDF3iYx0ro3_7jD4HFRDfrjdCM58",
     *            "oDF3iY9FGSSRHom3B-0w5j4jlEyY"],"to_groupid":108}
     * @return {"errcode": 0, "errmsg": "ok"}
     */
    public static ApiResult memberBatchUpdate(String jsonStr) {
        String jsonResult = HttpKit.post(memberBatchUpdate + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
        return new ApiResult(jsonResult);
    }

    /**
     * 删除分组
     * 
     * @param jsonStr
     *            {"group":{"id":108}}
     * @return {"errcode": 0, "errmsg": "ok"}
     */
    public static ApiResult deleteGroup(String jsonStr) {
        String jsonResult = HttpKit.post(deleteGroup + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
        return new ApiResult(jsonResult);
    }

}
