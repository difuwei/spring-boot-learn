package com.example.demospringboot.controller;

import com.example.demospringboot.pojo.Blog;
import com.example.demospringboot.response.BaseResponse;
import com.example.demospringboot.response.IBaseResponseCode;
import com.example.demospringboot.response.ResponseErrCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

// 集合相关 练习记录笔记
@RestController
@RequestMapping("/collection")
public class CollectionController {
    @RequestMapping("/list")
    public BaseResponse testList(){
        List<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        System.out.println(arr.size());
        List<String> linklist = new LinkedList<>();
        linklist.add("1");
        linklist.add("2");
        System.out.println(linklist);
//在查找元素时，HashSet先计算元素的HashCode值（也就是调用对象的hashCode方法的返回值），然后直接到hashCode值对应的位置去取出元素即可，这就是HashSet速度很快的原因
        //不能保证元素顺序，非线程同步，元素可以为null
        Set<String> setTest = new HashSet<>();
        setTest.add("a");
        setTest.add("b");
        // 使用连表确保元素顺序，性能比 hashset 低
        Set<String> linkedhashset = new LinkedHashSet<>();
        linkedhashset.add("a");
        linkedhashset.add("b");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("a");
        treeSet.add("b");
//        return BaseResponse.success(treeSet);
//        return BaseResponse.fail(300,"abc");
//        return BaseResponse.fail(400,"fail");
        HashSet<String> hashSet = new HashSet();
        hashSet.add("a");
        hashSet.add(null);
        //线程安全 CopyOnWriteArrayList在写操作时会先复制出一个副本，在新副本上执行写操作，然后再修改引用
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        // vector 线程安全
        Vector<String> vector = new Vector<>();

        Hashtable<String, String> hashtable = new Hashtable();
//hashtable线程安全，方法都被synchronized修饰，同一时间只有一个线程操作
//        HashTable本身是个容器，这也就说明了HashTable本身可以不断的放大，
//        试想一下，HashTable如果本身如果存在1000个元素，那么在get()方法中就会将这1000个元素完全锁住，
//        期间其他任何线程都得等待。这样就会造成容器越大，对容器数据操作的效率将越低
        hashtable.size();
        hashtable.isEmpty();
        hashtable.put("a","b");


//ConcurrentHashMap实现线程安全也是通过synchronized关键字来控制代码同步来实现的，
// 不同于HashTable的是ConcurrentHashMap在线程同步上更加细分化，
// 它不会像HashTable那样一把包揽的将所有数据都锁住
// 不同于jdk1.7及以前，jdk1.8将锁的粒度更加细分化，以每个数组索引为锁来进行实现。比如HashMap数组中长度有128，那么就会存在128个锁将每个索引锁住
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("a",1);

        //数组+链表
//        HashMap中数组的索引是通过hashCode的无符号右移16位后异或然后取余获得 公式： index = [（hashCode）^ (HashCode>>>16) ]
//        从1.7到1.8：1，取消 segments 字段，直接采用 transient volatile HashEntry<K,V>[] table 保存数据
//                2.将原先 table 数组＋单向链表的数据结构，变更为 table 数组＋单向链表＋红黑树的结构，数据大于8，转化为红黑树，数据小于6，转化为链表
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name","xiaoming");
        hashMap.get("name").hashCode();
        //使用hashmap的remove时，会有快速失败，应该使用迭代器的remove方法
        Iterator iterator = hashMap.keySet().iterator();
        Integer.highestOneBit(10);
        Integer a = Integer.MAX_VALUE;
        return BaseResponse.success(hashSet);

    }
}
