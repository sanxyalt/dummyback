package com.democorp.dummy.controllers;

import com.democorp.dummy.data.dto.ShitRequestDto;
import com.democorp.dummy.data.dto.ShitResponseDto;
import com.democorp.dummy.services.DumbService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/dumb")
public class DumbController {

    private final DumbService dumbService;

    public DumbController(DumbService dumbService) {
        this.dumbService = dumbService;
    }

    @GetMapping("/{id}")
    ResponseEntity<ShitResponseDto> fetchDumbShiet(@PathVariable("id") Integer id) {
        ShitResponseDto response = dumbService.fetchShit(id);
        return ResponseEntity.ok().body(response);
    }

    @PostMapping
    ResponseEntity<ShitResponseDto> createNewDumbShit(@RequestBody ShitRequestDto request) {
        ShitResponseDto response = dumbService.createUpdateShit(null, request);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(response.id())
                .toUri();
        return ResponseEntity.created(location).body(response);
    }

    @PutMapping("/{id}")
    ResponseEntity<ShitResponseDto> updateDumbShit(@PathVariable("id") Integer id,
                                                   @RequestBody ShitRequestDto request) {
        ShitResponseDto response = dumbService.createUpdateShit(id, request);
        return ResponseEntity.ok().body(response);
    }
}
