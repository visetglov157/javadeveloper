public static void Cat() {
        Cat cat1 = new Cat("Oliver");{
        cat1.setCatMale('M');
        cat1.setMonthBirth(6);
        cat1.setYearBirth(2019);

        Cat cat2 = new Cat("Masya");
        cat2.setCatMale('F');
        cat2.setMonthBirth(3);
        cat2.setYearBirth(2020);

        Cat cat3 = new Cat("Tobi");
        cat3.setCatMale('M');
        cat3.setMonthBirth(6);
        cat3.setYearBirth(2019);

        Cat cat4 = new Cat("Oreo");
        cat4.setCatMale('M');
        cat4.setMonthBirth(4);
        cat4.setYearBirth(2016);

        Cat cat5 = new Cat("Pipo");
        cat5.setCatMale('M');
        cat5.setMonthBirth(9);
        cat5.setYearBirth(2018);

        Set<Cat> catSet = new HashSet<>();

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);
        catSet.add(cat5);

        for (Cat i : catSet) {
            System.out.println(i);
        }
        System.out.println(catSet);
    }
}