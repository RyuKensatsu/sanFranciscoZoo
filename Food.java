package zoo;

public class Food {
    private String foodType;
    private Integer hungering;
    private Integer energying;

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Integer getHungering() {
        return hungering;
    }

    public void setHungering(Integer hungering) {
        this.hungering = hungering;
    }

    public Integer getEnergying() {
        return energying;
    }

    public void setEnergying(Integer energying) {
        this.energying = energying;
    }

    public Food(String foodType, Integer hungering, Integer energying) {
        this.foodType = foodType;
        this.hungering = hungering;
        this.energying = energying;
    }
}
