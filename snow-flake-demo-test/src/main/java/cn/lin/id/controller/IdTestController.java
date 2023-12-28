package cn.lin.id.controller;

import cn.lin.id.service.IdGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author linchengdong
 * @Date 2023-12-28 11:47
 * @PackageName:cn.lin.id.controller
 * @ClassName: IdTestController
 * @Description: TODO
 * @Version 1.0
 */
@RestController
@RequestMapping("/id")
public class IdTestController {


    @Autowired
    private IdGenerateService idGenerateService;


    @GetMapping("/nextId")
    public long nextId() {
        return idGenerateService.nextId();
    }

}
