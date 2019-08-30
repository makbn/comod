package io.comod.core.server.swagger;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Mehdi Akbarian-Rastaghi 5/7/19
 */

@RestController()
@RequestMapping("/help")
@Api(value = "Docs", tags = "API Document")
public class Controller {

    @GetMapping("")
    public void help(HttpServletResponse response,
                     HttpServletRequest request) {
        try {
            response.sendRedirect("/api/swagger-ui.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
