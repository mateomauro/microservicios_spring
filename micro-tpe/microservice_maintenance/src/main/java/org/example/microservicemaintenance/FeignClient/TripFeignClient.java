package org.example.microservicemaintenance.FeignClient;

import org.example.microservicemaintenance.FeignClient.Model.Pause;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "micro-trip")
public interface TripFeignClient {

    @GetMapping("/api/trips/pauseByScooter")
    List<Pause> getAllTripPause();

}
