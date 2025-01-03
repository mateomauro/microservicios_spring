package org.microservice_user.Utils;

import org.microservice_user.Dtos.AccountRequestDTO;
import org.microservice_user.Dtos.AccountResponseDTO;
import org.microservice_user.Dtos.UserResponseDTO;
import org.microservice_user.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.microservice_user.Dtos.UserRequestDTO;
import org.microservice_user.Service.UserService;

import java.time.LocalDate;

@Component
public class LoadDatabase {
    @Autowired
    private UserService userService;

    // dar de alta usuarios
    public void loadUsers() throws Exception {
        UserRequestDTO mateoMauro = new UserRequestDTO("Mateo", "Mauro", "mateomaurotandil@hotmail.com", "2494012345", "client", 0.0, 0.0);
        UserRequestDTO tomasDonati  = new UserRequestDTO("Tomás", "Donati", "tomasdonati8@hotmail.com", "2494678901", "client", 0.0, 0.0);
        UserRequestDTO lorenzoIpsu  = new UserRequestDTO("Lorenzo", "Fernández", "lfernandez@alumnos.exa.unicen.edu.ar", "2494543210", "client", 0.0, 0.0);
        UserRequestDTO delfinaFerreyra = new UserRequestDTO("Delfina", "Ferreyra", "dferreyra@alumnos.exa.unicen.edu.ar", "2494109876", "client", 0.0, 0.0);
        UserRequestDTO enzoDelSole  = new UserRequestDTO("Enzo", "Del sole", "edelsole@alumnos.exa.unicen.edu.ar", "2494765432", "client", 0.0, 0.0);
        UserRequestDTO emilioColombo  = new UserRequestDTO("Emilio", "Colombo", "ecolombo@alumnos.exa.unicen.edu.ar", "2494321098", "client", 0.0, 0.0);
        UserRequestDTO lucianoMauro  = new UserRequestDTO("Luciano", "Mauro", "lucianomaurotandil@hotmail.com", "2494987654", "client", 0.0, 0.0);
        try {
            if(userService.findAll().isEmpty()) {
                userService.addUser(mateoMauro);
                userService.addUser(tomasDonati);
                userService.addUser(lorenzoIpsu);
                userService.addUser(delfinaFerreyra);
                userService.addUser(enzoDelSole);
                userService.addUser(emilioColombo);
                userService.addUser(lucianoMauro);
            }
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
