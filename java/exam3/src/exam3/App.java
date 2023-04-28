package exam3;



	import java.util.ArrayList;

	import java.util.Comparator;

	import java.util.List;

	import java.util.Map;

	import java.util.Optional;

	import java.util.function.ToDoubleFunction;

	import java.util.Map.Entry;

	import java.util.stream.Collectors;

	public class App {

	 public static void main(String[] args) {

	 // TODO Auto-generated method stub

	 List<Employee>emplist=new ArrayList<Employee>();

	 emplist.add(new Employee(1,"ABC","eee",20.0));

	 emplist.add(new Employee(2,"EFG","cse",10.0));

	 emplist.add(new Employee(3,"JKL","ece",30.0));

	 emplist.add(new Employee(4,"LMN","eee",90.0));

	 Map<String, Double> result = emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))) ;

	 for(Entry<String, Double> e:result.entrySet())

	 System.out.println(e);

	 }


	 
}
