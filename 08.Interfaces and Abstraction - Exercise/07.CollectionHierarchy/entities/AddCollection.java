package CollectionHierarchy_07.entities;

import CollectionHierarchy_07.interfaces.Addable;

public class AddCollection extends Collection implements Addable {

    public AddCollection() {
    }


    @Override
    public int add(String string) {
        if (super.items.size() < maxSize) {
            super.items.add(string);
        }
        return super.items.indexOf(string);
    }
}
