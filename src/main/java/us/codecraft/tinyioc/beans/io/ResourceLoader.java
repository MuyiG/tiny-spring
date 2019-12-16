package us.codecraft.tinyioc.beans.io;

public interface ResourceLoader {

    /**
     * 从指定位置获取资源
     */
    Resource getResource(String location);

}
