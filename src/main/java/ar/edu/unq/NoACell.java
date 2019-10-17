package ar.edu.unq;

public class NoACell implements Cell {
    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public boolean isAddressBy(CellAddress address) {
        return false;
    }
}