package cn.itcast.eshop.common.entity;

public class Entity {
    private String id;
    private String createTime;
    private String deleteTime;
    // deleteStatus: 0-deleted; 1-default;
    private String deleteStatus;

    public String getId() {
        return id;
    }

    public Entity setId(String id) {
        this.id = id;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public Entity setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getDeleteTime() {
        return deleteTime;
    }

    public Entity setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    public String getDeleteStatus() {
        return deleteStatus;
    }

    public Entity setDeleteStatus(String deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }
}
