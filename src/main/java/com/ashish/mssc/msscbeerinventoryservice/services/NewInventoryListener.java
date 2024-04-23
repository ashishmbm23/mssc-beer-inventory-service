package com.ashish.mssc.msscbeerinventoryservice.services;

import com.ashish.common.events.NewInventoryEvent;
import com.ashish.mssc.msscbeerinventoryservice.config.JMSConfig;
import com.ashish.mssc.msscbeerinventoryservice.repository.BeerInventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class NewInventoryListener {
    private final BeerInventoryRepository beerInventoryRepository;

    @JmsListener(destination = JMSConfig.NEW_INVENTORY_QUEUE)
    public void listen(NewInventoryEvent newInventoryEvent){
        log.debug("listening: " + newInventoryEvent.toString());
    }
}
