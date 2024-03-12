package com.example.exercise5;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")
public class NameController {
    @Operation(summary = "Get Name", description = "Get the provided name")
    @GetMapping("/name")
    @ApiResponses (value = {
            @ApiResponse(responseCode = "200", description = "ok"),
            @ApiResponse(responseCode = "400", description = "bad request")
    })
    public String getName(@RequestParam String name){
        return name;
    }


    @Operation(summary = "Invert Name", description = "Invert the provided name")
    @PostMapping("/invertName")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "ok"),
            @ApiResponse(responseCode = "400", description = "bad request")
    })
    public String invertName(@RequestParam String name){
        StringBuilder invertName = new StringBuilder();
        for(int i = name.length() - 1; i>0; i--){
            invertName.append(name.charAt(i));
        }
        return invertName.toString();
    }

    //Se neanche stavolta ci sono riuscito ti chiedo una mano a capire meglio. XD

}
