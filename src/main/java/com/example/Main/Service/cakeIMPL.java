package com.example.Main.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Main.Dto.cakeDto;
import com.example.Main.Entity.cakeEntity;
import com.example.Main.Repo.cakeRepository;


@Service
public class cakeIMPL implements cakeService {

    @Autowired
    private cakeRepository cakeRepo;

    @Override
    public String addCakeEntity(cakeDto cakedto) {
        // Create a CakeEntity object from the CakeDto
        cakeEntity cakeEntity = new cakeEntity(
                cakedto.getId(),
                cakedto.getName(),
                cakedto.getEmail(),
                cakedto.getPhone(),
                cakedto.getAddress(),
                cakedto.getType(),
                cakedto.getQty()
        );

        // Save the CakeEntity object using the repository
        cakeRepo.save(cakeEntity);

        // Return the name of the saved cake (optional)
        return cakeEntity.getName();
    }
}