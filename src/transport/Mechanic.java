package transport;

import transport.Transport;
import java.util.Objects;
public class Mechanic {
    private final String name;
    private String company;
    private final RepairSpecialization repairSpecialization;

    public Mechanic(String name, String company, RepairSpecialization repairSpecialization) {
        if (name == null || name.isEmpty()) {
            this.name = "Имя";
        }else{
            this.name = name;
        }
        setCompany(company);
        this.repairSpecialization = repairSpecialization;

    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public RepairSpecialization getRepairSpecialization() {
        return repairSpecialization;
    }

    public void setCompany(String company) {
        if (company == null || company.isEmpty()) {
            this.company = "Компания";
        } else {
            this.company = company;
        }
    }

    public void carryOutMaintenance(Transport transport) {
        System.out.println(this.toString() + " осуществляет техническое обслуживание " + company);

    }

    public void fixTheCar(Transport transport) {
        System.out.println(this.toString() + " ремонтирует " + name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(company, mechanic.company) && repairSpecialization == mechanic.repairSpecialization;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, repairSpecialization);
    }

    @Override
    public String toString() {
        return ("Механик: " + "Имя " + name + ", компания - " + company + ", специализация " + repairSpecialization);
    }

}
