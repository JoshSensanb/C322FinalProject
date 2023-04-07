package edu.iu.c322.group10.itemservice.controller;

import edu.iu.c322.group10.itemservice.model.Item;
import edu.iu.c322.group10.itemservice.repository.ItemRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    private ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @GetMapping
    public List<Item> findAll(){
        return itemRepository.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public int create(Item item){
        Item newItem = itemRepository.save(item);
        return newItem.getItemId();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@Valid @RequestBody Item item, @PathVariable int id){
        item.setItemId(id);
        itemRepository.save(item);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        Item item = new Item();
        item.setItemId(id);
        itemRepository.delete(item);
    }
}
