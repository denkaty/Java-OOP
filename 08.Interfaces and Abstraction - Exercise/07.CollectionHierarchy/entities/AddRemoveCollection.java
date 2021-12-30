package CollectionHierarchy_07.entities;

import CollectionHierarchy_07.interfaces.AddRemovable;

public class AddRemoveCollection extends Collection implements AddRemovable {

    public AddRemoveCollection() {
    }

    @Override
    public int add(String string) {
        if (super.items.size() < maxSize) {
            super.items.add(0, string);
        }

        return 0;
    }

    @Override
    public String remove() {
        if (!super.items.isEmpty()) {
            return super.items.remove(super.items.size() - 1);
        }

        return null;
    }
}
