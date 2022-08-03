package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService brazilTaxService;

	public RentalService(Double pricePerDay, Double pricePerHour, TaxService brazilTaxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.brazilTaxService = brazilTaxService;
	}
	
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		double hours = (double)(t2 - t1)/1000 / 60 / 60;
		
		double basicPayment;
		if (hours <=12) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		}
		else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}
		
		double tax = brazilTaxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
