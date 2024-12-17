package lv.rvt;

private int age;
    private int weight;
    private int height;
    private int shelf;

    public Person(String name, int age, int weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.name = name != null ? name : "Unknown";
        this.age = age >= 0 ? age : 0;
        this.weight = weight >= 0 ? weight : 0;
        this.height = height >= 0 ? height : 0;
    }

    public Person(String name) {
        this(name, 0, 0, 0);
        this(name, 0, 0, 0);
    }

    public int returnAge() {
        return this.age;

    public String getName() {
        return name;
    }

    public boolean isOfLegalAge() {
        return this.age <= 18;
    public int getAge() {
        return age;
    }

    public String getName() {
        return this.name;
    public int getWeight() {
        return weight;
    }

    public void setName(String newName) {
        this.name = newName;
    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");

    public void setName(String newName) {
        this.name = newName;
    }

    public void setHeight(int newHeight) {
@@ -54,20 +49,28 @@ public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
        double heightInMeters = this.height / 100.0;
        return this.weight / (heightInMeters * heightInMeters);
    }
    

    public void growOlder() {
        this.age = this.age + 1;
        this.age++;
    }
    

    public void growOlder(int years) {
        this.age = this.age + years;
        if (years > 0) {
            this.age += years;
        }
    }
    

    public String toCsvRow() {
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height;
    }
}   
}
    
}
}
}
}
   
