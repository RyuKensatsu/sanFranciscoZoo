package zoo;

public class Animal {
    private String type;
    private String name;
    private Integer hunger;
    private Boolean vacinnated = false;
    private Integer energy;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHunger() {
        return hunger;
    }

    public void setHunger(Integer hunger) {
        this.hunger = hunger;
    }

    public Boolean getVacinnated() {
        return vacinnated;
    }

    public void setVacinnated(Boolean vacinnated) {
        this.vacinnated = vacinnated;
    }


    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Animal(String type, String name, Integer hunger, Integer energy) {
        this.type = type;
        this.name = name;
        this.hunger = hunger;
        this.energy = energy;
    }
}
