package com.ashish.mssc.msscbeerinventoryservice.bootstrap;

import com.ashish.mssc.msscbeerinventoryservice.domain.BeerInventory;
import com.ashish.mssc.msscbeerinventoryservice.repository.BeerInventoryRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@Builder
@AllArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final BeerInventoryRepository beerInventoryRepository;
    @Override
    public void run(String... args) throws Exception {
        checkAndLoadData();
    }

    private void checkAndLoadData() {
        if( beerInventoryRepository.count() == 0){
            loadData();
        }
    }

    private void loadData() {
        UUID id1 = UUID.fromString("55241f2f-127e-467a-b270-fd29b989d76f");
        UUID id2 = UUID.fromString("d6d7d7ff-85c1-45b4-99de-a1ad424134ce");
        UUID id3 = UUID.fromString("505b04b0-8a7b-4aa7-b1b1-d8a6f276fa69");
        UUID beerId1 = UUID.fromString("0a818933-087d-47f2-ad83-2f986ed087eb");
        UUID beerId2 = UUID.fromString("a712d914-61ea-4623-8bd0-32c0f6545bfd");
        UUID beerId3 = UUID.fromString("026cc3c8-3a0c-4083-a05b-e908048c1b08");


        BeerInventory beerInventory1 = BeerInventory
                .builder()
                .id(id1)
                .beerId(beerId1)
                .quantityOnHand(50)
                .version(1L)
                .upc("0631234200036")
                .build();

        BeerInventory beerInventory2 = BeerInventory
                .builder()
                .id(id2)
                .beerId(beerId2)
                .quantityOnHand(40)
                .version(1L)
                .upc("0631234300019")
                .build();

        BeerInventory beerInventory3 = BeerInventory
                .builder()
                .id(id3)
                .beerId(beerId3)
                .quantityOnHand(60)
                .version(1L)
                .upc("0083783375213")
                .build();

        beerInventoryRepository.save(beerInventory1);
        beerInventoryRepository.save(beerInventory2);
        beerInventoryRepository.save(beerInventory3);

    }

}
