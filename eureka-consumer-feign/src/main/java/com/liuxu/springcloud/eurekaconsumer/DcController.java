package com.liuxu.springcloud.eurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */

@RestController
public class DcController {

    @Autowired
    DcClient dcClient;

    @GetMapping("/dc")
    public String dc() {
        return dcClient.consumer();
    }

}
