package ejercicio_21_03_2024;

public class FullTimeEmployee extends Employee{
    private float yearlyBonus;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(int id, String name, float salary, float yearlyBonus) {
        super(id, name, salary);
        this.yearlyBonus = yearlyBonus;
    }

    public float getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(float yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    @Override
    public float calculateSalary(){
        return (float) super.getSalary();
    }
}
