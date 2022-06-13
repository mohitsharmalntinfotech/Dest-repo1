package com.lti.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-10T00:19:03.401045200+05:30[Asia/Calcutta]")

@Controller
@RequestMapping("${openapi.simple.base-path:/mohit3.sharma/SimpleAPI/1.0.0}")
public class HealthApiController implements HealthApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public HealthApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
