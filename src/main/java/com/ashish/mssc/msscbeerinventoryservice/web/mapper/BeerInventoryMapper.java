package com.ashish.mssc.msscbeerinventoryservice.web.mapper;

import com.ashish.mssc.msscbeerinventoryservice.domain.BeerInventory;
import com.ashish.mssc.msscbeerinventoryservice.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

@Mapper (uses = {DateMapper.class})
public interface  BeerInventoryMapper {
    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
