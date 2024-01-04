package Basic;

public class EmployeeDao {
 private int id;
 private String eName;
 private double eSalary;
 private String company;
 private String city;

 public EmployeeDao(int id, String eName, double eSalary, String company, String city) {
     this.id = id;
     this.eName = eName;
     this.eSalary = eSalary;
     this.company = company;
     this.city = city;
 }

 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public String geteName() {
     return eName;
 }

 public void seteName(String eName) {
     this.eName = eName;
 }

 public double geteSalary() {
     return eSalary;
 }

 public void seteSalary(double eSalary) {
     this.eSalary = eSalary;
 }

 public String getCompany() {
     return company;
 }

 public void setCompany(String company) {
     this.company = company;
 }

 public String getCity() {
     return city;
 }

 public void setCity(String city) {
     this.city = city;
 }
}
