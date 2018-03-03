package com.example.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

/*
@RequestMapping Notes [http://www.baeldung.com/spring-requestmapping]

* dynamic routes use @PathVariable
*
* Route handler decorator (annotation in Java terms)
*   @RequestMapping(value = "/route/{dynamicRouteVariable}")
*
* Route handler parameters
*   @PathVariable("dynamicRouteVariable") Type parameterName
*     if the DRV matches the route parameter exactly just the Type and parameterName can be passed
*
*
* query strings use @RequestParam
*
* Route handler parameters
*   @RequestParam(value = "nameOfParamKey", required = True/False) Type parameterName
*
* */

@Controller
public class NewTodo {
//    @PostMapping(value = "/create") -> shorthand Spring 4.3+
    @RequestMapping(value = "/create", method = RequestMethod.POST) // longhand
    private RedirectView CreateTodo() {
//        ToDo.Create(); // TODO: look up model binding for form submission
        return new RedirectView("/"); // TODO: look up server side rendering with Spring
    }

}
