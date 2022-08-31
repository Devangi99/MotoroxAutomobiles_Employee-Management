package com.example.demo.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.example.demo.Model.D_Employee;
import com.example.demo.Repository.D_EmployeeRepository;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class D_EmployeeService {
	
	@Autowired
	  private D_EmployeeRepository repository;
	 
	public String exportReport(String reportFormat) throws FileNotFoundException, JRException {
		
		String path = "C:\\Users\\Devangi\\Desktop\\EmployeeReports";
		
		List<D_Employee> employee = repository.findAll();
		//load file and compile
		File file=ResourceUtils.getFile("classpath:D_Employees.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(employee);
		
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("createdBy", "Motorox");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		
		if(reportFormat.equalsIgnoreCase("html")) {
			JasperExportManager.exportReportToHtmlFile(jasperPrint, path + "\\employees_report.html");
		}
		
		if(reportFormat.equalsIgnoreCase("pdf")) {
			JasperExportManager.exportReportToPdfFile(jasperPrint, path + "\\employees_report.pdf");
		}
		
		return "report generated in path : " + path;
	}

}
