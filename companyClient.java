package com.java.training;

        import java.util.ArrayList;
        import java.util.Iterator;
        import java.util.List;
        import javax.swing.text.html.HTMLDocument;
/**
 * Created by anchalmal on 2/1/17.
 */
public class companyClient {
    public  void main(String[] args) {
        List<Company> companies = new ArrayList<>();


        Company company1 = Company.createInstance(1,"Company1");

        Department department1 = Department.createDepartment(1, "HR");
        Department department2 = Department.createDepartment(2,"Software_Engineer");
        Department department3 = Department.createDepartment(3,"QA");

        company1.addDepartment(department1);
        company1.addDepartment(department2);
        company1.addDepartment(department3);


        Project project1 = Project.createProject(1,"Major");
        Project project2 = Project.createProject(2,"Minor");
        Project project3 = Project.createProject(1,"Major1");

        department1.addProjects(project1);
        department1.addProjects(project2);
        department2.addProjects(project3);

        Employee emp1 = Employee.createEmployee(1,"Anchal",21);
        Employee emp2 = Employee.createEmployee(2,"Mehak",21);
        Employee emp3 = Employee.createEmployee(3,"Swapan",21);

        project1.addEmployee(emp1);
        project1.addEmployee(emp2);
        project2.addEmployee(emp3);


        Address homeAddress1 = Address.createAddress("North","Patiala","Punjab");
        Address officeAddress1 = Address.createAddress("South","Pune","Maharashtra");
        emp1.addAddress(homeAddress1);
        emp1.addAddress(officeAddress1);

        Address homeAddress2 = Address.createAddress("East","Patiala","Punjab");
        Address officeAddress2 = Address.createAddress("South","Pune","Maharashtra");
        emp2.addAddress(homeAddress2);
        emp2.addAddress(officeAddress2);

        Address homeAddress3 = Address.createAddress("West","Patiala","Punjab");
        Address officeAddress3 = Address.createAddress("South","Pune","Maharashtra");
        emp3.addAddress(homeAddress3);
        emp3.addAddress(officeAddress3);


        companies.add(company1);

        Company company2 = Company.createInstance(2,"Company2");

        Department department4 = Department.createDepartment(1, "HR");
        Department department5 = Department.createDepartment(2,"Software_Engineer");
        Department department6 = Department.createDepartment(3,"QA");

        company2.addDepartment(department4);
        company2.addDepartment(department5);
        company2.addDepartment(department6);

        Project project4 = Project.createProject(1,"Shop");
        Project project5 = Project.createProject(2,"Stack");
        Project project6 = Project.createProject(3,"Queue");
        department4.addProjects(project4);
        department4.addProjects(project5);
        department4.addProjects(project6);

        Project project7 = Project.createProject(1,"Minor1");
        department5.addProjects(project4);

        Project project8 = Project.createProject(1,"Medium");
        department6.addProjects(project5);

        Employee emp5 = Employee.createEmployee(1,"Anchal",21);
        Employee emp6 = Employee.createEmployee(2,"Mehak",21);
        project6.addEmployee(emp5);
        project6.addEmployee(emp6);

        Employee emp7 = Employee.createEmployee(3,"Swapan",21);
        project7.addEmployee(emp7);

        Address homeAddress4 = Address.createAddress("North","Patiala","Punjab");
        Address officeAddress4 = Address.createAddress("South","Pune","Maharashtra");
        emp1.addAddress(homeAddress4);
        emp1.addAddress(officeAddress4);

        Address homeAddress5 = Address.createAddress("East","Patiala","Punjab");
        Address officeAddress5 = Address.createAddress("South","Pune","Maharashtra");
        emp2.addAddress(homeAddress5);
        emp2.addAddress(officeAddress5);

        Address homeAddress6 = Address.createAddress("West","Patiala","Punjab");
        Address officeAddress6 = Address.createAddress("South","Pune","Maharashtra");
        emp3.addAddress(homeAddress6);
        emp3.addAddress(officeAddress6);


        companies.add(company2);


        for (Company comp:companies) {
            System.out.println("Company:  "+comp.getId() + " " + comp.getName());
            List<Department> depts = comp.getDepartments();

            for (int i = 0; i < depts.size() ; i++) {
                System.out.println(" Department:  " +depts.get(i).getId()+" "+depts.get(i).getName() );
                int j=0;
                Department dept = depts.get(i);
                List<Project> prjs = dept.getProjects();

                while(j<prjs.size()) {
                    Project proj = prjs.get(j);
                    System.out.println(" Project:  " + proj.getId() + " " + proj.getName());

                    List<Employee> empls = proj.getEmployees();
                    Iterator<Employee> itr = empls.iterator();
                    while(itr.hasNext()){
                        Employee emp =itr.next();
                        int k=0;
                        Address addr = emp.getAddresses().get(k);
                        System.out.println(" Employee:  "+emp.getId()+" "+ emp.getName()+" "+emp.getAge());
                        System.out.println(" HomeAddress:"+addr.getStreet()+", "+addr.getCity()+", "+addr.getState());
                        k++;
                        addr = emp.getAddresses().get(k);
                        System.out.println("OfficeAddress:"+addr.getStreet()+", "+addr.getCity()+", "+addr.getState());


                    }

                    j++;
                }




            }
        }

    }

}
