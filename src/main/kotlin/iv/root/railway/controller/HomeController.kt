package iv.root.railway.controller

import lombok.extern.slf4j.Slf4j
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeController {
    @RequestMapping(value = ["/"])
    fun home() :ResponseEntity<String> {
        return ResponseEntity.ok("TEST")
    }
}