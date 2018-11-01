package com.zhaige;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {


    @Autowired
    private GirlRespository girlRespository;


    public void insertTwo(){

        Girl girlA = new Girl();
        girlA.setCupSize("C");
        girlA.setAge(18);
        girlRespository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(19);
        girlRespository.save(girlB);
    }
}
