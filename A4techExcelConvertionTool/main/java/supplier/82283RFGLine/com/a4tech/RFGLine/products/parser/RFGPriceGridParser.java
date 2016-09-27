package com.a4tech.RFGLine.products.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.a4tech.product.model.Price;
import com.a4tech.product.model.PriceConfiguration;
import com.a4tech.product.model.PriceGrid;
import com.a4tech.product.model.PriceUnit;
import com.a4tech.util.ApplicationConstants;
import com.a4tech.util.LookupData;

public class RFGPriceGridParser {

	public List<PriceGrid> getPriceGrids(String listOfPrices,
			String listOfNetcost, String listOfQuan, String listOfDisc,
			String currency, String priceInclude, boolean isBasePrice,
			String isQur, String priceName, String criterias,
			List<PriceGrid> existingPriceGrid) {

		Integer sequence = 1;
	//	List<PriceConfiguration> configuration = null;
		PriceGrid priceGrid = new PriceGrid();
		String[] prices = listOfPrices
				.split(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);
		String[] netCost = listOfNetcost
				.split(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);
		String[] quantity = listOfQuan
				.split(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);
		String[] discount = listOfDisc
				.split(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);

		priceGrid.setCurrency(currency);
		//priceGrid.setPriceIncludes("plus Setup");
		priceGrid.setDescription(priceName);
		priceGrid
				.setIsQUR(isQur.equalsIgnoreCase("Y") ? ApplicationConstants.CONST_BOOLEAN_TRUE
						: ApplicationConstants.CONST_BOOLEAN_FALSE);
		priceGrid.setIsBasePrice(isBasePrice);
		priceGrid.setSequence(sequence);
		List<Price> listOfPrice = null;
		if(!priceGrid.getIsQUR()){
			listOfPrice = getPrices(prices, netCost, quantity, discount);
		}
	else{
			priceGrid.setIsQUR(ApplicationConstants.CONST_BOOLEAN_TRUE);
		}
	if (!priceGrid.getIsQUR()) {
			listOfPrice = getPrices(prices, netCost, quantity, discount);
		} else {
			listOfPrice = new ArrayList<Price>();
		}
		if(listOfPrice != null && !listOfPrice.isEmpty()){
			priceGrid.setPrices(listOfPrice);
		}
/*if (criterias != null && !criterias.isEmpty()) {
		configuration = getConfigurations(criterias,priceName);
	}
		if(configuration != null){
		priceGrid.setPriceConfigurations(configuration);
		}*/
		existingPriceGrid.add(priceGrid);
		return existingPriceGrid;

	}

	public List<Price> getPrices(String[] prices, String[] netCost,
			String[] quantity, String[] discount) {

		List<Price> listOfPrices = new ArrayList<Price>();
		for (int i = 0, j = 1; i < prices.length 
				&& i < quantity.length && i < discount.length; i++, j++) {

			Price price = new Price();
			PriceUnit priceUnit = new PriceUnit();
			price.setSequence(j);
			try {
				price.setQty(Integer.valueOf(quantity[i]));
			} catch (NumberFormatException nfe) {
				price.setQty(0);
			}
			price.setPrice(prices[i]);
			
			if(!netCost[i].isEmpty()){
				price.setNetCost(netCost[i]);
			}
			price.setDiscountCode(discount[i]);
			priceUnit
					.setItemsPerUnit(ApplicationConstants.CONST_STRING_VALUE_ONE);
			price.setPriceUnit(priceUnit);
			listOfPrices.add(price);
		}
		return listOfPrices;
	}

	public List<PriceConfiguration> getConfigurations(String criterias,String UpchargeName) {
		List<PriceConfiguration> priceConfiguration = new ArrayList<PriceConfiguration>();
		String[] config = null;
		PriceConfiguration configs = null;
		if (criterias
				.contains(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID)) {
			String[] configuraions = criterias
					.split(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);
			for (String criteria : configuraions) {
				PriceConfiguration configuraion = new PriceConfiguration();
				config = criteria.split(":");
				String criteriaValue = LookupData.getCriteriaValue(config[0]);
				configuraion.setCriteria(criteriaValue);
				if (config[1].contains(",")) {
					String[] values = config[1].split(",");
					for (String Value : values) {
						configs = new PriceConfiguration();
						configs.setCriteria(criteriaValue);
						configs.setValue(Arrays.asList((Object) Value));
						priceConfiguration.add(configs);
					}
						configs = new PriceConfiguration();
					configs.setCriteria(criteriaValue);
					configs.setValue(Arrays.asList((Object) config[1]));
					priceConfiguration.add(configs);
				}
			}

		} else {
			configs = new PriceConfiguration();
			configs.setCriteria(criterias);
			configs.setValue(Arrays.asList((Object) UpchargeName));
			
			if(criterias.contains("Imprint Option"))
			{
				configs.setOptionName("Custom PMS Color Imprint");
			}
			priceConfiguration.add(configs);
		}
		return priceConfiguration;
	}

	
	
	public List<PriceGrid> getUpchargePriceGrid(String quantity, String prices,String netcost,
			String discounts, String upChargeCriterias, String qurFlag,
			String currency, String upChargeName, String upChargeType,
			String upchargeUsageType, Integer upChargeSequence,
			List<PriceGrid> existingPriceGrid) {

		List<PriceConfiguration> configuration = null;
		PriceGrid priceGrid = new PriceGrid();
		String[] upChargePrices = prices
				.split(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);
		String[] upChargeNetcost= netcost
				.split(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);
		String[] upChargeQuantity = quantity
				.split(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);
		String[] upChargeDiscount = discounts
				.split(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);

		priceGrid.setCurrency(currency);
		priceGrid.setDescription(upChargeName);
		if(upChargeName.contains("Additional Imprint Color")|| upChargeName.contains("Additional Imprint Location"))
{
		priceGrid.setPriceIncludes("plus Setup");
}
		priceGrid.setServiceCharge(ApplicationConstants.CONST_STRING_SERVICECHARGE);
		priceGrid
				.setIsQUR((qurFlag.equalsIgnoreCase("false")) ? ApplicationConstants.CONST_BOOLEAN_FALSE
						: ApplicationConstants.CONST_BOOLEAN_TRUE);
		priceGrid.setIsBasePrice(ApplicationConstants.CONST_BOOLEAN_FALSE);
		priceGrid.setSequence(upChargeSequence);
		priceGrid.setUpchargeType(upChargeType);
		priceGrid.setUpchargeUsageType(upchargeUsageType);
		List<Price> listOfPrice = null;
		if (!priceGrid.getIsQUR()) {
			 listOfPrice =
			 getPrices(upChargePrices,upChargeNetcost,upChargeQuantity,upChargeDiscount);
		} else {
			listOfPrice = new ArrayList<Price>();
		}

        priceGrid.setPrices(listOfPrice);
		if (upChargeCriterias != null && !upChargeCriterias.isEmpty()) {
		configuration = getConfigurations(upChargeCriterias,upChargeName);
		}
		priceGrid.setPriceConfigurations(configuration);
		existingPriceGrid.add(priceGrid);

		return existingPriceGrid;
	}

	

}
