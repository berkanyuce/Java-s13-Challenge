package employeeApp;

public class Healthplan {
    private int id;
    private String name;
    private Plan plan;

    public enum Plan {
        BASIC("BASIC", 100),
        NORMAL("NORMAL",200),
        PREMIUM("PREMIUM",300);

        private String label;
        private int price;

        Plan(String label, int price) {
            this.label = label;
            this.price = price;
        }

        public String getLabel() {
            return label;
        }

        public int getPrice() {
            return price;
        }
    }

    public Healthplan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Plan getPlan() {
        return plan;
    }

    @Override
    public String toString() {
        return "Healthplan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plan=" + plan +
                '}';
    }
}
