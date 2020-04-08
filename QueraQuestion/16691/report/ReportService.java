package ir.javacup.report;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReportService {
	private List<Information> allList = new ArrayList<>();
	
	public ReportService(InformationRepository repository) {
		allList = repository.fetchAll();
	}
	
	public List<CityInformation> sumByCity(int year) {
		List<CityInformation> temp = new ArrayList<>();
		for (Information information : allList) {
			if (information.getDate().substring(0, 4).equals("" + year)) {
				if (temp.size() == 0) {
					CityInformation ci = new CityInformation();
					ci.setCity(information.getCity());
					ci.setSum(information.getAmount());
					temp.add(ci);
				} else {
					boolean exist = true;
					for (CityInformation cityInformation : temp) {
						if (cityInformation.getCity().equals(information.getCity())) {
							exist = true;
							cityInformation.setSum(cityInformation.getSum() + information.getAmount());
							break;
						} else {
							exist = false;
						}
					}
					if (!exist) {
						CityInformation ci = new CityInformation();
						ci.setCity(information.getCity());
						ci.setSum(information.getAmount());
						temp.add(ci);
					}
				}
			}
		}
		Collections.sort(temp, new CityInformationComparator());
		return temp;
	}

	public List<CityMonthInformation> averageByCityAndMonth(int year) {
		List<CityMonthInformation> temp = new ArrayList<>();
		for (Information information : allList) {
			if (information.getDate().substring(0, 4).equals("" + year)) {
				if (temp.size() == 0) {
					CityMonthInformation ci = new CityMonthInformation();
					ci.setCity(information.getCity());
					ci.setMonth(Integer.parseInt(information.getDate().substring(5, 7)));
					ci.setAverage(information.getAmount());
					temp.add(ci);
				} else {
					boolean exist = true;
					for (CityMonthInformation cmi : temp) {
						if (cmi.getCity().equals(information.getCity()) && cmi.getMonth() == Integer.parseInt(information.getDate().substring(5, 7))) {
							exist = true;
							cmi.setAverage(cmi.getAverage() + information.getAmount());
							break;
						} else {
							exist = false;
						}
					}
					if (!exist) {
						CityMonthInformation ci = new CityMonthInformation();
						ci.setCity(information.getCity());
						ci.setMonth(Integer.parseInt(information.getDate().substring(5, 7)));
						ci.setAverage(information.getAmount());
						temp.add(ci);
					} 
				}
			}
		}
		for (CityMonthInformation cmi : temp) {
			if (cmi.getMonth() <= 6) {
				cmi.setAverage(cmi.getAverage() / 31);
			} else {
				cmi.setAverage(cmi.getAverage() / 30);
			}
		}
		Collections.sort(temp, new CityMonthInformationComparator());
		return temp;
	}
	
	public static void main(String[] args) {
		ReportService service = new ReportService(new InformationRepository() {
			@Override
			public List<Information> fetchAll() {
				return Arrays.asList(
					new Information("Kerman", "1395/03/11", 62L), new Information("Tehran", "1395/09/12", 90L),
					new Information("Tehran", "1396/11/30", 31L), new Information("Semnan", "1396/01/13", 93L)
				);
			}
		});
		
		List<CityInformation> sumResults = service.sumByCity(1396);
		System.out.printf("sum total: %d%n", sumResults.size());
		CityInformation sumFirst = sumResults.get(0);
		System.out.printf("1: %s %d%n", sumFirst.getCity(), sumFirst.getSum());
		CityInformation sumSecond = sumResults.get(1);
		System.out.printf("2: %s %d%n", sumSecond.getCity(), sumSecond.getSum());
		
		List<CityMonthInformation> avgResults = service.averageByCityAndMonth(1395);
		System.out.printf("avg total: %d%n", avgResults.size());
		CityMonthInformation avgFirst = avgResults.get(0);
		System.out.printf("1: %s %d %f%n", avgFirst.getCity(), avgFirst.getMonth(), avgFirst.getAverage());
		CityMonthInformation avgSecond = avgResults.get(1);
		System.out.printf("2: %s %d %f%n", avgSecond.getCity(), avgSecond.getMonth(), avgSecond.getAverage());
	}
	
	class CityInformationComparator implements Comparator<CityInformation> {
		  
	    @Override
	    public int compare(CityInformation ci1, CityInformation ci2) {
	       return ci1.getCity().compareTo(ci2.getCity());
	    }
	}
	
	class CityMonthInformationComparator implements Comparator<CityMonthInformation> {
		  
	    @Override
	    public int compare(CityMonthInformation ci1, CityMonthInformation ci2) {
	    	String x1 = ci1.getCity();
            String x2 = ci2.getCity();
            int sComp = x1.compareTo(x2);
            if (sComp != 0) {
               return sComp;
            } 
            Integer x10 = ci1.getMonth();
            Integer x20 = ci1.getMonth();
            return x10.compareTo(x20);
	    }
	}

}
