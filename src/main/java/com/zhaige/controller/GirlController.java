package com.zhaige.controller;


import com.zhaige.domain.Girl;
import com.zhaige.respository.GirlRespository;
import com.zhaige.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRespository girlRespository;

    @Autowired
    private GirlService girlService;

    /**
     * 查询所有女生列表
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlRespository.findAll();
    }

    /**
     * 添加一个女生
     * @param cupSize
     * @param age
     * @return
     */

    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                         @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRespository.save(girl);
    }

    //根据id查询一个女生
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id){
        return girlRespository.findById(id).get(); //新版本用这个语句
    }

    //根据id更新一个女生
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRespository.save(girl);
    }

    //根据id删除一个女生
    @DeleteMapping(value = "/girls/{id}")
    public void  girlDelete(@PathVariable("id") Integer id){
        girlRespository.deleteById(id);
    }




    @PostMapping(value = "/girls/two")
    public void girlTwo(){
        girlService.insertTwo();

    }




}
