package CollectionHierarchy_07.entities;

import CollectionHierarchy_07.interfaces.MyList;

public class MyListImpl extends Collection implements MyList {

    public MyListImpl() {
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
            return super.items.remove(0);
        }
        return null;
    }

    @Override
    public int getUsed() {
        return super.getSize();
    }


}
