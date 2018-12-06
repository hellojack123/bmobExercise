package com.example.bmobexercise;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.bmobexercise.model.bean.Post;

import java.io.File;
import java.util.List;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobSMS;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.QueryListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;
import cn.bmob.v3.listener.UploadFileListener;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //第一：默认初始化
        Bmob.initialize(this, "e8ed2b1cb52b2610fb83c967b8ea14a4");


        //添加数据
//        Person p2=new Person();
//        p2.setName("jack");
//        p2.setAddress("shanghai");
//        p2.save(new SaveListener<String>() {
//            @Override
//            public void done(String objectId, BmobException e) {
//                if(e==null){
//                    Toast.makeText(MainActivity.this, "添加数据成功，返回objectId为："+objectId, Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(MainActivity.this, "创建数据失败："+e.getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        //查找Person表里面id为7cffce46ba的数据
//        BmobQuery<Person> bmobQuery=new BmobQuery<Person>();
//        bmobQuery.getObject("7cffce46ba", new QueryListener<Person>() {
//            @Override
//            public void done(Person person, BmobException e) {
//                if(e==null){
//                    Toast.makeText(MainActivity.this, "查询成功: "+person.getName(), Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(MainActivity.this, "查询失败"+e.getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        //基于条件查询
//        BmobQuery<Person> bmobQuery=new BmobQuery<Person>();
////        bmobQuery.addWhereEqualTo("address","shanghai");
//        //按照时间降序
//        bmobQuery.order("-createdAt");
//        bmobQuery.findObjects(new FindListener<Person>() {
//            @Override
//            public void done(List<Person> object, BmobException e) {
//                if(e==null){
//                    Toast.makeText(MainActivity.this, "查询成功：共"+object.size()+"条数据", Toast.LENGTH_SHORT).show();
//
//                    for(Person person:object){
//                        Log.i(TAG, "查询出的人的名字是 "+person.getName());
//                    }
//                }else {
//                    Toast.makeText(MainActivity.this, "查询失败："+e.getMessage()+","+e.getErrorCode(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        });


        //修改一行数据
//        Person p2=new Person();
//        p2.setAddress("上海");
//        p2.update("7cffce46ba", new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if(e==null){
//                    Toast.makeText(MainActivity.this, "更新成功 ", Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(MainActivity.this, "更新失败："+e.getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        //删除一行数据
//        Person p2=new Person();
//        p2.setObjectId("f7QF999E");
//        p2.delete(new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if(e==null){
//                    Toast.makeText(MainActivity.this, "删除成功", Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(MainActivity.this, "删除失败："+e.getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        //读取sd卡动态权限申请
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 0);
            }
        }


        //上传单一文件
//        String picPath="sdcard/Download/QQ图标图片.jpg";
//        final BmobFile bmobFile=new BmobFile(new File(picPath));
//        bmobFile.uploadblock(new UploadFileListener() {
//            @Override
//            public void done(BmobException e) {
//                if(e==null){
//                    Toast.makeText(MainActivity.this, "上传文件成功："+bmobFile.getFileUrl(), Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(MainActivity.this, "上传文件失败："+e.getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            }
//            @Override
//            public void onProgress(Integer value){
//            }
//        });


//        //按时间查询
//        BmobQuery<Post> query = new BmobQuery<Post>();
//        //按照时间降序
//        query.order("-createdAt");
//        //执行查询，第一个参数为上下文，第二个参数为查找的回调
//        query.findObjects(new FindListener<Post>() {
//            @Override
//            public void done(List<Post> list, BmobException e) {
//                if (e==null){
//                    Toast.makeText(MainActivity.this, "查询成功：共"+list.size()+"条数据", Toast.LENGTH_SHORT).show();
//
//                    for(Post post:list){
//
//                        Log.i("MainActivity",post.getContent());
//
//                    }
//                }else {
//                    Toast.makeText(MainActivity.this, "查询失败", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

//        BmobQuery<Post> bmobQuery=new BmobQuery<Post>();
//        //按照时间降序
//        bmobQuery.order("-createdAt");
//        bmobQuery.findObjects(new FindListener<Post>() {
//            @Override
//            public void done(List<Post> object, BmobException e) {
//                if(e==null){
//                    Toast.makeText(MainActivity.this, "查询成功：共"+object.size()+"条数据", Toast.LENGTH_SHORT).show();
//
//                    for(Post post:object){
//                        Log.i(TAG, "查询出的文章的内容是 "+post.getContent());
//                    }
//                }else {
//                    Toast.makeText(MainActivity.this, "查询失败："+e.getMessage()+","+e.getErrorCode(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        });


//        Post post=new Post();
//        post.setContent("试试能不能建帖子");
//        post.save(new SaveListener<String>() {
//            @Override
//            public void done(String s, BmobException e) {
//                if (e==null){
//                    Toast.makeText(MainActivity.this, "建帖成功", Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(MainActivity.this, "建帖失败", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

          //发送短信
//        long phoneNumber=15735952052L;
//        BmobSMS.requestSMSCode(String.valueOf(phoneNumber), "某时某刻验证短信", new QueryListener<Integer>() {
//            @Override
//            public void done(Integer smsId, BmobException e) {
//                if (e == null) {
//
//                    Toast.makeText(MainActivity.this, "发送验证码成功，短信ID："+ smsId + "\n", Toast.LENGTH_SHORT).show();
//                } else {
//
//                    Toast.makeText(MainActivity.this, "发送验证码失败："+ e.getErrorCode() + "-" + e.getMessage() + "\n", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });





    }
}
