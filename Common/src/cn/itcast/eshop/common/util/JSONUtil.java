package cn.itcast.eshop.common.util;

import cn.itcast.eshop.common.entity.Entity;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;


public class JSONUtil {

    public static void main(String[] args) {
//        Entity com.itcast.eshop.user.entity = new Entity();
//        com.itcast.eshop.user.entity.setId("100");
//        com.itcast.eshop.user.entity.setCreateTime("12:20");
//        String json = entityToJSON(com.itcast.eshop.user.entity);
//        System.out.println(json);
        System.out.println("==========================");
        Entity entity1 = new Entity();
        entity1.setId("101");
        entity1.setCreateTime("16:20");
        Entity entity2 = new Entity();
        entity2.setId("102");
        entity2.setCreateTime("12:20");
        List <Entity> list = new ArrayList();
        list.add(entity1);
        list.add(entity2);
        String json = entityListToJSON(list);
        System.out.println(json);// [{"createTime":"16:20","id":"101"},{"createTime":"12:20","id":"102"}]

        System.out.println("============");
//        String jsonStr = "{\"createTime\":\"16:20\",\"id\":\"101\"}";
//        Object obj = JSONToEntity(jsonStr, Entity.class);
//        Entity e = (Entity)obj;
//        System.out.println(e.getCreateTime());

        System.out.println("============");
        String jsonStr = "{\"createTime\":\"15:20\",\"id\":\"101\"}";
        Entity e = JSONToEntity(jsonStr, Entity.class);
        System.out.println(e.getCreateTime());

        System.out.println("===========");
        String jsonStrList = "[{\"createTime\":\"16:20\",\"id\":\"101\"},{\"createTime\":\"12:20\",\"id\":\"102\"}]";
        Entity e1 = new Entity();
        List<Entity> entityList = JSONArrayToList(jsonStrList,Entity.class);
        System.out.println(entityList.get(0).getCreateTime());
        System.out.println(entityList.get(1).getCreateTime());

    }
   public static String entityToJSON(Object entity){
       return JSON.toJSONString(entity);
   }

   public static String entityListToJSON(List<?> entityList){
        return entityToJSON(entityList);

   }

//   public static Object JSONToEntity(String json, Class<?> clazz){
//      Object obj =  JSON.parseObject(json,clazz);
//      return obj;
//   }

    public static <T> T JSONToEntity(String json, Class<T> clazz){
        return  JSON.parseObject(json,clazz);

    }

    public static <T> List<T> JSONArrayToList(String json, Class<T> clazz){
        return JSON.parseArray(json,clazz);

    }}
