package dev.alexanghel.actuator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    private final List<String> homes;

    public HomeController() {
        homes = new ArrayList<>();
        homes.add("Chalet");
        homes.add("Beach House");
    }

    @GetMapping("/")
    public ResponseEntity<List<String>> all(){
        return ResponseEntity.ok(homes);
    }
}
