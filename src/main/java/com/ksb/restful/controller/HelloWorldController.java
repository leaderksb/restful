package com.ksb.restful.controller;

import com.ksb.restful.controller.bean.HelloWorldBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // GET
    // URI : /hello-world
    // @RequestMapping(method=RequestMethod.GET, path="/hello-world")
    @GetMapping(path = "/hello-world")
    public String HelloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean HelloWorldBean() {
        // responsebody로 자동 변환
        // 기본 반환 형태는 json이며
        // xml 반환 형태로 변경 가능
        return new HelloWorldBean("Hello World Bean");
    }

    // 가변 Data 전달
    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean HelloWorldBeanPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World %s", name));
    }

    @GetMapping(value = {"", "/"})
    public String index() {
        System.out.println("index");
        return "index";
    }

    @GetMapping(value = "/not-cors")
    public String notCors() {
        System.out.println("not-cors");
        return "notCors";
    }

    @CrossOrigin("http://localhost:9000")
    @GetMapping(value = "/cors")
    public String cors() {
        System.out.println("cors");
        return "cors";
    }

    @GetMapping(value = "/not-proxy")
    public String notProxy() {
        System.out.println("not-proxy");
        return "notProxy";
    }

    @GetMapping(value = "/proxy")
    public String proxy() {
        System.out.println("proxy");
        return "proxy";
    }
}
