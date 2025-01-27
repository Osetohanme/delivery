package Services;

import entities.Item;

public interface ItemService {

    Item createItem(Item item);

    void updateItem(Long id);
}
