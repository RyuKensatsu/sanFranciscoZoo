package zoo;

public interface AnimalManagerImpl {
    Animal adoptAnimal();
    void vaccinate(Animal patient);
    void feed(Animal animal, Food food);
    void getStats(Animal animal);
}
