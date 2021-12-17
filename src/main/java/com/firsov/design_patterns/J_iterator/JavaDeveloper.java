package com.firsov.design_patterns.J_iterator;

public class JavaDeveloper implements IterableCollection {
    private String name;
    private String[] skils;

    public JavaDeveloper(String name, String[] skils) {
        this.name = name;
        this.skils = skils;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if(index < skils.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return skils[index++];
        }
    }

}
