package com.a4tech.product.bbi.criteria.parser;
	

	import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

	import org.apache.log4j.Logger;

	import com.a4tech.product.model.Price;
import com.a4tech.product.model.PriceConfiguration;
import com.a4tech.product.model.PriceGrid;
import com.a4tech.product.model.PriceUnit;
import com.a4tech.util.ApplicationConstants;
import com.a4tech.util.LookupData;

	public class BBIPriceGridParser {

		private Logger              _LOGGER              = Logger.getLogger(getClass());
		public List<PriceGrid> getPriceGrids(String listOfPrices,
			    String listOfQuan, String discountCodes,
				String currency, String priceInclude, boolean isBasePrice,
				String qurFlag, String priceName, String criterias,
				List<PriceGrid> existingPriceGrid) 
				{
			try{
			Integer sequence = 1;
			List<PriceConfiguration> configuration = null;
			PriceGrid priceGrid = new PriceGrid();
			String[] prices = listOfPrices
					.split(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);
			String[] quantity = listOfQuan
					.split(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);
			
			priceGrid.setCurrency(currency);
			priceGrid.setDescription(priceName);
			priceGrid.setPriceIncludes(priceInclude);
			priceGrid
					.setIsQUR(qurFlag.equalsIgnoreCase(ApplicationConstants.CONST_STRING_FALSE) ? ApplicationConstants.CONST_BOOLEAN_FALSE
							: ApplicationConstants.CONST_BOOLEAN_TRUE);
			priceGrid.setIsBasePrice(isBasePrice);
			priceGrid.setSequence(sequence);
			List<Price> listOfPrice = null;
			if (!priceGrid.getIsQUR()) {
				listOfPrice = getPrices(prices, quantity, discountCodes);
			} else {
				listOfPrice = new ArrayList<Price>();
			}
			priceGrid.setPrices(listOfPrice);
			if (criterias != null && !criterias.isEmpty()) {
				configuration = getConfigurations(criterias);
			}
			priceGrid.setPriceConfigurations(configuration);
			existingPriceGrid.add(priceGrid);
			}catch(Exception e){
				_LOGGER.error("Error while processing PriceGrid: "+e.getMessage());
			}
			return existingPriceGrid;

		}

		public List<Price> getPrices(String[] prices, String[] quantity, String discount) {

			List<Price> listOfPrices = new ArrayList<Price>();
			try{
				int tempLen=prices.length;
				StringBuilder tempv = new StringBuilder() ;
				for (int i = 1; i <=tempLen; i++) {
					tempv.append(discount);
					tempv=tempv.append(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);
				}
				
				discount=tempv.toString();
			for (int PriceNumber = 0, sequenceNum = 1; PriceNumber < prices.length && PriceNumber < quantity.length
					      && PriceNumber < discount.length(); PriceNumber++, sequenceNum++) {

				Price price = new Price();
				PriceUnit priceUnit = new PriceUnit();
				String temp[]=discount.split(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);
				price.setSequence(sequenceNum);
				try {
					price.setQty(Integer.valueOf(quantity[PriceNumber]));
				} catch (NumberFormatException nfe) {
					price.setQty(ApplicationConstants.CONST_NUMBER_ZERO);
				}
				price.setPrice(prices[PriceNumber]);
				price.setDiscountCode(temp[PriceNumber]);
				priceUnit
						.setItemsPerUnit(ApplicationConstants.CONST_STRING_VALUE_ONE);
				price.setPriceUnit(priceUnit);
				listOfPrices.add(price); 
			}
			}
			catch (Exception e) {
				_LOGGER.error("Error while processing PriceGrid Prices: "+e.getMessage());
			}
			return listOfPrices;
		}

		public List<PriceConfiguration> getConfigurations(String criterias) {
			List<PriceConfiguration> priceConfiguration = new ArrayList<PriceConfiguration>();
			String[] config = null;
			PriceConfiguration configs = null;
			try{
			if (criterias
					.contains(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID)) {
				String[] configuraions = criterias
						.split(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);
				for (String criteria : configuraions) {
					PriceConfiguration configuraion = new PriceConfiguration();
					config = criteria.split(ApplicationConstants.CONST_DELIMITER_COLON);
					String criteriaValue = LookupData.getCriteriaValue(config[0]);
					configuraion.setCriteria(criteriaValue);
					if (config[1].contains(ApplicationConstants.CONST_STRING_COMMA_SEP)) {
						String[] values = config[1].split(ApplicationConstants.CONST_STRING_COMMA_SEP);
						for (String Value : values) {
							configs = new PriceConfiguration();
							configs.setCriteria(criteriaValue);
							configs.setValue(Arrays.asList((Object) Value));
							priceConfiguration.add(configs);
						}
					} else {
						configs = new PriceConfiguration();
						configs.setCriteria(criteriaValue);
						configs.setValue(Arrays.asList((Object) config[1]));
						priceConfiguration.add(configs);
					}
				}

			} else {
				configs = new PriceConfiguration();
				config = criterias.split(ApplicationConstants.CONST_DELIMITER_COLON);
				String criteriaValue = LookupData.getCriteriaValue(config[0]);
				configs.setCriteria(criteriaValue);
				configs.setValue(Arrays.asList((Object) config[1]));
				priceConfiguration.add(configs);
			}
			}catch(Exception e){
				_LOGGER.error("Error while processing PriceGrid PriceConfiguration: "+e.getMessage());
			}
			return priceConfiguration;
		}

		public List<PriceGrid> getUpchargePriceGrid(String quantity, String prices,
				String discounts, String upChargeCriterias, String qurFlag,
				String currency, String upChargeName, String upChargeType,
				String upchargeUsageType, Integer upChargeSequence,
				List<PriceGrid> existingPriceGrid) {
			try{
			List<PriceConfiguration> configuration = null;
			PriceGrid priceGrid = new PriceGrid();
			String[] upChargePrices = prices
					.split(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);
			String[] upChargeQuantity = quantity
					.split(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);
			String[] upChargeDiscount = discounts
					.split(ApplicationConstants.PRICE_SPLITTER_BASE_PRICEGRID);

			priceGrid.setCurrency(currency);
			priceGrid.setDescription(upChargeName);
			priceGrid.setServiceCharge(ApplicationConstants.CONST_STRING_SERVICECHARGE);
			priceGrid
					.setIsQUR((qurFlag.equalsIgnoreCase(ApplicationConstants.CONST_CHAR_Y)) ? ApplicationConstants.CONST_BOOLEAN_TRUE
							: ApplicationConstants.CONST_BOOLEAN_FALSE);
			priceGrid.setIsBasePrice(ApplicationConstants.CONST_BOOLEAN_FALSE);
			priceGrid.setSequence(upChargeSequence);
			priceGrid.setUpchargeType(upChargeType);
			priceGrid.setUpchargeUsageType(upchargeUsageType);
			List<Price> listOfPrice = null;
			if (!priceGrid.getIsQUR()) {
				listOfPrice = getPrices(upChargePrices, upChargeQuantity,discounts);
			} else {
				listOfPrice = new ArrayList<Price>();
			}

			priceGrid.setPrices(listOfPrice);
			if (upChargeCriterias != null && !upChargeCriterias.isEmpty()) {
				configuration = getConfigurations(upChargeCriterias);
			}
			priceGrid.setPriceConfigurations(configuration);
			existingPriceGrid.add(priceGrid);
			}catch(Exception e){
				_LOGGER.error("Error while processing UpchargePriceGrid: "+e.getMessage());
			}
			return existingPriceGrid;
		}

	}
