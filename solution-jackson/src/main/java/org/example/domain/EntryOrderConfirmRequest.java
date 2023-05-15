package org.example.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.qimen.api.QimenRequest;
import com.qimen.api.response.EntryorderConfirmResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.mapping.ApiListType;

import java.util.List;
import java.util.Map;

public class EntryOrderConfirmRequest extends QimenRequest<EntryorderConfirmResponse> {
    private EntryOrder entryOrder;
    private Map extendProps;

//    @JacksonXmlElementWrapper(localName = "items")
//    @JacksonXmlProperty(localName = "item")
    private List<Item> items;

//    @JacksonXmlElementWrapper(localName = "orderLines")
//    @JacksonXmlProperty(localName = "orderLine")
    private List<OrderLine> orderLines;

//    @JacksonXmlElementWrapper(localName = "totalOrders")
//    @JacksonXmlProperty(localName = "totalOrder")
    private List<TotalOrder> totalOrders;

    public EntryOrderConfirmRequest() {
    }

    public void setEntryOrder(EntryOrder entryOrder) {
        this.entryOrder = entryOrder;
    }

    public EntryOrder getEntryOrder() {
        return this.entryOrder;
    }

    public void setExtendProps(Map extendProps) {
        this.extendProps = extendProps;
    }

    public Map getExtendProps() {
        return this.extendProps;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return this.items;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public List<OrderLine> getOrderLines() {
        return this.orderLines;
    }

    public void setTotalOrders(List<TotalOrder> totalOrders) {
        this.totalOrders = totalOrders;
    }

    public List<TotalOrder> getTotalOrders() {
        return this.totalOrders;
    }

    public String getApiMethodName() {
        return "taobao.qimen.entryorder.confirm";
    }

    public Class<EntryorderConfirmResponse> getResponseClass() {
        return EntryorderConfirmResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public static class TotalOrder {
        @ApiField("actualQty")
        private String actualQty;
        @ApiField("itemCode")
        private String itemCode;
        @ApiField("itemId")
        private String itemId;
        @ApiField("itemName")
        private String itemName;
        @ApiField("orderLineNo")
        private String orderLineNo;
        @ApiField("ownerCode")
        private String ownerCode;
        @ApiField("remark")
        private String remark;

        public TotalOrder() {
        }

        public String getActualQty() {
            return this.actualQty;
        }

        public void setActualQty(String actualQty) {
            this.actualQty = actualQty;
        }

        public String getItemCode() {
            return this.itemCode;
        }

        public void setItemCode(String itemCode) {
            this.itemCode = itemCode;
        }

        public String getItemId() {
            return this.itemId;
        }

        public void setItemId(String itemId) {
            this.itemId = itemId;
        }

        public String getItemName() {
            return this.itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public String getOrderLineNo() {
            return this.orderLineNo;
        }

        public void setOrderLineNo(String orderLineNo) {
            this.orderLineNo = orderLineNo;
        }

        public String getOwnerCode() {
            return this.ownerCode;
        }

        public void setOwnerCode(String ownerCode) {
            this.ownerCode = ownerCode;
        }

        public String getRemark() {
            return this.remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }

    public static class Item {
        @ApiField("actualAmount")
        private String actualAmount;
        @ApiField("actualQty")
        private String actualQty;
        @ApiField("adventLifecycle")
        private String adventLifecycle;
        @ApiField("amount")
        private String amount;
        @ApiField("approvalNumber")
        private String approvalNumber;
        @ApiField("barCode")
        private String barCode;
        @ApiField("batchCode")
        private String batchCode;
        @ApiField("batchRemark")
        private String batchRemark;
        @ApiListField("batchs")
        @ApiField("batch")
        private List<Batch> batchs;
        @ApiField("brandCode")
        private String brandCode;
        @ApiField("brandName")
        private String brandName;
        @ApiField("categoryId")
        private String categoryId;
        @ApiField("categoryName")
        private String categoryName;
        @ApiField("changeTime")
        private String changeTime;
        @ApiField("channelCode")
        private String channelCode;
        @ApiField("color")
        private String color;
        @ApiField("costPrice")
        private String costPrice;
        @ApiField("defectiveQty")
        private String defectiveQty;
        @ApiField("diffQuantity")
        private String diffQuantity;
        @ApiField("discount")
        private String discount;
        @ApiField("discountPrice")
        private String discountPrice;
        @ApiField("englishName")
        private String englishName;
        @ApiField("exCode")
        private String exCode;
        @ApiField("expireDate")
        private String expireDate;
        @ApiField("extCode")
        private String extCode;
        @ApiField("goodsCode")
        private String goodsCode;
        @ApiField("grossWeight")
        private String grossWeight;
        @ApiField("height")
        private String height;
        @ApiField("inventoryType")
        private String inventoryType;
        @ApiField("isAreaSale")
        private String isAreaSale;
        @ApiField("isBatchMgmt")
        private String isBatchMgmt;
        @ApiField("isFragile")
        private String isFragile;
        @ApiField("isHazardous")
        private String isHazardous;
        @ApiField("isSNMgmt")
        private String isSNMgmt;
        @ApiField("isShelfLifeMgmt")
        private String isShelfLifeMgmt;
        @ApiField("isSku")
        private String isSku;
        @ApiField("itemCode")
        private String itemCode;
        @ApiField("itemId")
        private String itemId;
        @ApiField("itemName")
        private String itemName;
        @ApiField("itemType")
        private String itemType;
        @ApiField("lackQty")
        private String lackQty;
        @ApiField("latestUpdateTime")
        private String latestUpdateTime;
        @ApiField("length")
        private String length;
        @ApiField("lockQuantity")
        private String lockQuantity;
        @ApiField("lockupLifecycle")
        private String lockupLifecycle;
        @ApiField("netWeight")
        private String netWeight;
        @ApiField("normalQty")
        private String normalQty;
        @ApiField("orderCode")
        private String orderCode;
        @ApiField("orderLineNo")
        private String orderLineNo;
        @ApiField("orderType")
        private String orderType;
        @ApiField("originAddress")
        private String originAddress;
        @ApiField("originCode")
        private String originCode;
        @ApiField("outBizCode")
        private String outBizCode;
        @ApiField("ownerCode")
        private String ownerCode;
        @ApiField("packCode")
        private String packCode;
        @ApiField("packageMaterial")
        private String packageMaterial;
        @ApiField("paperQty")
        private String paperQty;
        @ApiField("pcs")
        private String pcs;
        @ApiField("planQty")
        private String planQty;
        @ApiField("price")
        private String price;
        @ApiField("priceAdjustment")
        private PriceAdjustment priceAdjustment;
        @ApiField("pricingCategory")
        private String pricingCategory;
        @ApiField("produceCode")
        private String produceCode;
        @ApiField("productCode")
        private String productCode;
        @ApiField("productDate")
        private String productDate;
        @ApiField("purchasePrice")
        private String purchasePrice;
        @ApiField("quantity")
        private String quantity;
        @ApiField("reason")
        private String reason;
        @ApiField("receiveQty")
        private String receiveQty;
        @ApiField("referencePrice")
        private String referencePrice;
        @ApiField("rejectLifecycle")
        private String rejectLifecycle;
        @ApiField("remark")
        private String remark;
        @ApiField("retailPrice")
        private String retailPrice;
        @ApiField("safetyStock")
        private String safetyStock;
        @ApiField("seasonCode")
        private String seasonCode;
        @ApiField("seasonName")
        private String seasonName;
        @ApiField("shelfLife")
        private String shelfLife;
        @ApiField("shortName")
        private String shortName;
        @ApiField("size")
        private String size;
        @ApiField("skuProperty")
        private String skuProperty;
        @ApiField("sn")
        private String sn;
        @ApiField("snCode")
        private String snCode;
        @ApiField("sourceOrderCode")
        private String sourceOrderCode;
        @ApiField("standardPrice")
        private String standardPrice;
        @ApiField("stockStatus")
        private String stockStatus;
        @ApiField("stockUnit")
        private String stockUnit;
        @ApiField("subSourceOrderCode")
        private String subSourceOrderCode;
        @ApiField("supplierCode")
        private String supplierCode;
        @ApiField("supplierName")
        private String supplierName;
        @ApiField("tagPrice")
        private String tagPrice;
        @ApiField("tareWeight")
        private String tareWeight;
        @ApiField("tempRequirement")
        private String tempRequirement;
        @ApiField("title")
        private String title;
        @ApiField("unit")
        private String unit;
        @ApiField("volume")
        private String volume;
        @ApiField("warehouseCode")
        private String warehouseCode;
        @ApiField("width")
        private String width;

        public Item() {
        }

        public String getActualAmount() {
            return this.actualAmount;
        }

        public void setActualAmount(String actualAmount) {
            this.actualAmount = actualAmount;
        }

        public String getActualQty() {
            return this.actualQty;
        }

        public void setActualQty(String actualQty) {
            this.actualQty = actualQty;
        }

        public String getAdventLifecycle() {
            return this.adventLifecycle;
        }

        public void setAdventLifecycle(String adventLifecycle) {
            this.adventLifecycle = adventLifecycle;
        }

        public String getAmount() {
            return this.amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getApprovalNumber() {
            return this.approvalNumber;
        }

        public void setApprovalNumber(String approvalNumber) {
            this.approvalNumber = approvalNumber;
        }

        public String getBarCode() {
            return this.barCode;
        }

        public void setBarCode(String barCode) {
            this.barCode = barCode;
        }

        public String getBatchCode() {
            return this.batchCode;
        }

        public void setBatchCode(String batchCode) {
            this.batchCode = batchCode;
        }

        public String getBatchRemark() {
            return this.batchRemark;
        }

        public void setBatchRemark(String batchRemark) {
            this.batchRemark = batchRemark;
        }

        public List<Batch> getBatchs() {
            return this.batchs;
        }

        public void setBatchs(List<Batch> batchs) {
            this.batchs = batchs;
        }

        public String getBrandCode() {
            return this.brandCode;
        }

        public void setBrandCode(String brandCode) {
            this.brandCode = brandCode;
        }

        public String getBrandName() {
            return this.brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public String getCategoryId() {
            return this.categoryId;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public String getCategoryName() {
            return this.categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public String getChangeTime() {
            return this.changeTime;
        }

        public void setChangeTime(String changeTime) {
            this.changeTime = changeTime;
        }

        public String getChannelCode() {
            return this.channelCode;
        }

        public void setChannelCode(String channelCode) {
            this.channelCode = channelCode;
        }

        public String getColor() {
            return this.color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getCostPrice() {
            return this.costPrice;
        }

        public void setCostPrice(String costPrice) {
            this.costPrice = costPrice;
        }

        public String getDefectiveQty() {
            return this.defectiveQty;
        }

        public void setDefectiveQty(String defectiveQty) {
            this.defectiveQty = defectiveQty;
        }

        public String getDiffQuantity() {
            return this.diffQuantity;
        }

        public void setDiffQuantity(String diffQuantity) {
            this.diffQuantity = diffQuantity;
        }

        public String getDiscount() {
            return this.discount;
        }

        public void setDiscount(String discount) {
            this.discount = discount;
        }

        public String getDiscountPrice() {
            return this.discountPrice;
        }

        public void setDiscountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
        }

        public String getEnglishName() {
            return this.englishName;
        }

        public void setEnglishName(String englishName) {
            this.englishName = englishName;
        }

        public String getExCode() {
            return this.exCode;
        }

        public void setExCode(String exCode) {
            this.exCode = exCode;
        }

        public String getExpireDate() {
            return this.expireDate;
        }

        public void setExpireDate(String expireDate) {
            this.expireDate = expireDate;
        }

        public String getExtCode() {
            return this.extCode;
        }

        public void setExtCode(String extCode) {
            this.extCode = extCode;
        }

        public String getGoodsCode() {
            return this.goodsCode;
        }

        public void setGoodsCode(String goodsCode) {
            this.goodsCode = goodsCode;
        }

        public String getGrossWeight() {
            return this.grossWeight;
        }

        public void setGrossWeight(String grossWeight) {
            this.grossWeight = grossWeight;
        }

        public String getHeight() {
            return this.height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getInventoryType() {
            return this.inventoryType;
        }

        public void setInventoryType(String inventoryType) {
            this.inventoryType = inventoryType;
        }

        public String getIsAreaSale() {
            return this.isAreaSale;
        }

        public void setIsAreaSale(String isAreaSale) {
            this.isAreaSale = isAreaSale;
        }

        public String getIsBatchMgmt() {
            return this.isBatchMgmt;
        }

        public void setIsBatchMgmt(String isBatchMgmt) {
            this.isBatchMgmt = isBatchMgmt;
        }

        public String getIsFragile() {
            return this.isFragile;
        }

        public void setIsFragile(String isFragile) {
            this.isFragile = isFragile;
        }

        public String getIsHazardous() {
            return this.isHazardous;
        }

        public void setIsHazardous(String isHazardous) {
            this.isHazardous = isHazardous;
        }

        public String getIsSNMgmt() {
            return this.isSNMgmt;
        }

        public void setIsSNMgmt(String isSNMgmt) {
            this.isSNMgmt = isSNMgmt;
        }

        public String getIsShelfLifeMgmt() {
            return this.isShelfLifeMgmt;
        }

        public void setIsShelfLifeMgmt(String isShelfLifeMgmt) {
            this.isShelfLifeMgmt = isShelfLifeMgmt;
        }

        public String getIsSku() {
            return this.isSku;
        }

        public void setIsSku(String isSku) {
            this.isSku = isSku;
        }

        public String getItemCode() {
            return this.itemCode;
        }

        public void setItemCode(String itemCode) {
            this.itemCode = itemCode;
        }

        public String getItemId() {
            return this.itemId;
        }

        public void setItemId(String itemId) {
            this.itemId = itemId;
        }

        public String getItemName() {
            return this.itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public String getItemType() {
            return this.itemType;
        }

        public void setItemType(String itemType) {
            this.itemType = itemType;
        }

        public String getLackQty() {
            return this.lackQty;
        }

        public void setLackQty(String lackQty) {
            this.lackQty = lackQty;
        }

        public String getLatestUpdateTime() {
            return this.latestUpdateTime;
        }

        public void setLatestUpdateTime(String latestUpdateTime) {
            this.latestUpdateTime = latestUpdateTime;
        }

        public String getLength() {
            return this.length;
        }

        public void setLength(String length) {
            this.length = length;
        }

        public String getLockQuantity() {
            return this.lockQuantity;
        }

        public void setLockQuantity(String lockQuantity) {
            this.lockQuantity = lockQuantity;
        }

        public String getLockupLifecycle() {
            return this.lockupLifecycle;
        }

        public void setLockupLifecycle(String lockupLifecycle) {
            this.lockupLifecycle = lockupLifecycle;
        }

        public String getNetWeight() {
            return this.netWeight;
        }

        public void setNetWeight(String netWeight) {
            this.netWeight = netWeight;
        }

        public String getNormalQty() {
            return this.normalQty;
        }

        public void setNormalQty(String normalQty) {
            this.normalQty = normalQty;
        }

        public String getOrderCode() {
            return this.orderCode;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public String getOrderLineNo() {
            return this.orderLineNo;
        }

        public void setOrderLineNo(String orderLineNo) {
            this.orderLineNo = orderLineNo;
        }

        public String getOrderType() {
            return this.orderType;
        }

        public void setOrderType(String orderType) {
            this.orderType = orderType;
        }

        public String getOriginAddress() {
            return this.originAddress;
        }

        public void setOriginAddress(String originAddress) {
            this.originAddress = originAddress;
        }

        public String getOriginCode() {
            return this.originCode;
        }

        public void setOriginCode(String originCode) {
            this.originCode = originCode;
        }

        public String getOutBizCode() {
            return this.outBizCode;
        }

        public void setOutBizCode(String outBizCode) {
            this.outBizCode = outBizCode;
        }

        public String getOwnerCode() {
            return this.ownerCode;
        }

        public void setOwnerCode(String ownerCode) {
            this.ownerCode = ownerCode;
        }

        public String getPackCode() {
            return this.packCode;
        }

        public void setPackCode(String packCode) {
            this.packCode = packCode;
        }

        public String getPackageMaterial() {
            return this.packageMaterial;
        }

        public void setPackageMaterial(String packageMaterial) {
            this.packageMaterial = packageMaterial;
        }

        public String getPaperQty() {
            return this.paperQty;
        }

        public void setPaperQty(String paperQty) {
            this.paperQty = paperQty;
        }

        public String getPcs() {
            return this.pcs;
        }

        public void setPcs(String pcs) {
            this.pcs = pcs;
        }

        public String getPlanQty() {
            return this.planQty;
        }

        public void setPlanQty(String planQty) {
            this.planQty = planQty;
        }

        public String getPrice() {
            return this.price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public PriceAdjustment getPriceAdjustment() {
            return this.priceAdjustment;
        }

        public void setPriceAdjustment(PriceAdjustment priceAdjustment) {
            this.priceAdjustment = priceAdjustment;
        }

        public String getPricingCategory() {
            return this.pricingCategory;
        }

        public void setPricingCategory(String pricingCategory) {
            this.pricingCategory = pricingCategory;
        }

        public String getProduceCode() {
            return this.produceCode;
        }

        public void setProduceCode(String produceCode) {
            this.produceCode = produceCode;
        }

        public String getProductCode() {
            return this.productCode;
        }

        public void setProductCode(String productCode) {
            this.productCode = productCode;
        }

        public String getProductDate() {
            return this.productDate;
        }

        public void setProductDate(String productDate) {
            this.productDate = productDate;
        }

        public String getPurchasePrice() {
            return this.purchasePrice;
        }

        public void setPurchasePrice(String purchasePrice) {
            this.purchasePrice = purchasePrice;
        }

        public String getQuantity() {
            return this.quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getReason() {
            return this.reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public String getReceiveQty() {
            return this.receiveQty;
        }

        public void setReceiveQty(String receiveQty) {
            this.receiveQty = receiveQty;
        }

        public String getReferencePrice() {
            return this.referencePrice;
        }

        public void setReferencePrice(String referencePrice) {
            this.referencePrice = referencePrice;
        }

        public String getRejectLifecycle() {
            return this.rejectLifecycle;
        }

        public void setRejectLifecycle(String rejectLifecycle) {
            this.rejectLifecycle = rejectLifecycle;
        }

        public String getRemark() {
            return this.remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRetailPrice() {
            return this.retailPrice;
        }

        public void setRetailPrice(String retailPrice) {
            this.retailPrice = retailPrice;
        }

        public String getSafetyStock() {
            return this.safetyStock;
        }

        public void setSafetyStock(String safetyStock) {
            this.safetyStock = safetyStock;
        }

        public String getSeasonCode() {
            return this.seasonCode;
        }

        public void setSeasonCode(String seasonCode) {
            this.seasonCode = seasonCode;
        }

        public String getSeasonName() {
            return this.seasonName;
        }

        public void setSeasonName(String seasonName) {
            this.seasonName = seasonName;
        }

        public String getShelfLife() {
            return this.shelfLife;
        }

        public void setShelfLife(String shelfLife) {
            this.shelfLife = shelfLife;
        }

        public String getShortName() {
            return this.shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getSize() {
            return this.size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSkuProperty() {
            return this.skuProperty;
        }

        public void setSkuProperty(String skuProperty) {
            this.skuProperty = skuProperty;
        }

        public String getSn() {
            return this.sn;
        }

        public void setSn(String sn) {
            this.sn = sn;
        }

        public String getSnCode() {
            return this.snCode;
        }

        public void setSnCode(String snCode) {
            this.snCode = snCode;
        }

        public String getSourceOrderCode() {
            return this.sourceOrderCode;
        }

        public void setSourceOrderCode(String sourceOrderCode) {
            this.sourceOrderCode = sourceOrderCode;
        }

        public String getStandardPrice() {
            return this.standardPrice;
        }

        public void setStandardPrice(String standardPrice) {
            this.standardPrice = standardPrice;
        }

        public String getStockStatus() {
            return this.stockStatus;
        }

        public void setStockStatus(String stockStatus) {
            this.stockStatus = stockStatus;
        }

        public String getStockUnit() {
            return this.stockUnit;
        }

        public void setStockUnit(String stockUnit) {
            this.stockUnit = stockUnit;
        }

        public String getSubSourceOrderCode() {
            return this.subSourceOrderCode;
        }

        public void setSubSourceOrderCode(String subSourceOrderCode) {
            this.subSourceOrderCode = subSourceOrderCode;
        }

        public String getSupplierCode() {
            return this.supplierCode;
        }

        public void setSupplierCode(String supplierCode) {
            this.supplierCode = supplierCode;
        }

        public String getSupplierName() {
            return this.supplierName;
        }

        public void setSupplierName(String supplierName) {
            this.supplierName = supplierName;
        }

        public String getTagPrice() {
            return this.tagPrice;
        }

        public void setTagPrice(String tagPrice) {
            this.tagPrice = tagPrice;
        }

        public String getTareWeight() {
            return this.tareWeight;
        }

        public void setTareWeight(String tareWeight) {
            this.tareWeight = tareWeight;
        }

        public String getTempRequirement() {
            return this.tempRequirement;
        }

        public void setTempRequirement(String tempRequirement) {
            this.tempRequirement = tempRequirement;
        }

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUnit() {
            return this.unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getVolume() {
            return this.volume;
        }

        public void setVolume(String volume) {
            this.volume = volume;
        }

        public String getWarehouseCode() {
            return this.warehouseCode;
        }

        public void setWarehouseCode(String warehouseCode) {
            this.warehouseCode = warehouseCode;
        }

        public String getWidth() {
            return this.width;
        }

        public void setWidth(String width) {
            this.width = width;
        }
    }

    public static class PriceAdjustment {
        @ApiField("discount")
        private String discount;
        @ApiField("endDate")
        private String endDate;
        @ApiField("remark")
        private String remark;
        @ApiField("standardPrice")
        private String standardPrice;
        @ApiField("startDate")
        private String startDate;
        @ApiField("type")
        private String type;

        public PriceAdjustment() {
        }

        public String getDiscount() {
            return this.discount;
        }

        public void setDiscount(String discount) {
            this.discount = discount;
        }

        public String getEndDate() {
            return this.endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public String getRemark() {
            return this.remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getStandardPrice() {
            return this.standardPrice;
        }

        public void setStandardPrice(String standardPrice) {
            this.standardPrice = standardPrice;
        }

        public String getStartDate() {
            return this.startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    @ApiListType("orderLine")
    public static class OrderLine {
        @ApiField("actualPrice")
        private String actualPrice;
        @ApiField("actualQty")
        private Long actualQty;
        @ApiField("amount")
        private String amount;
        @ApiField("batchCode")
        private String batchCode;
        @ApiListField("batchs")
        @ApiField("batch")
        private List<Batch> batchs;
        @ApiField("color")
        private String color;
        @ApiField("deliveryOrderId")
        private String deliveryOrderId;
        @ApiField("discount")
        private String discount;
        @ApiField("discountAmount")
        private String discountAmount;
        @ApiField("discountPrice")
        private String discountPrice;
        @ApiField("exceptionQty")
        private String exceptionQty;
        @ApiField("expireDate")
        private String expireDate;
        @ApiField("extCode")
        private String extCode;
        @ApiField("inventoryType")
        private String inventoryType;
        @ApiField("itemCode")
        private String itemCode;
        @ApiField("itemId")
        private String itemId;
        @ApiField("itemName")
        private String itemName;
        @ApiField("locationCode")
        private String locationCode;
        @ApiField("moveInLocation")
        private String moveInLocation;
        @ApiField("moveOutLocation")
        private String moveOutLocation;
        @ApiField("orderLineNo")
        private String orderLineNo;
        @ApiField("orderSourceCode")
        private String orderSourceCode;
        @ApiField("outBizCode")
        private String outBizCode;
        @ApiField("ownerCode")
        private String ownerCode;
        @ApiField("payNo")
        private String payNo;
        @ApiField("planQty")
        private Long planQty;
        @ApiField("produceCode")
        private String produceCode;
        @ApiField("productCode")
        private String productCode;
        @ApiField("productDate")
        private String productDate;
        @ApiField("purchasePrice")
        private String purchasePrice;
        @ApiField("qrCode")
        private String qrCode;
        @ApiField("quantity")
        private String quantity;
        @ApiField("referencePrice")
        private String referencePrice;
        @ApiField("remark")
        private String remark;
        @ApiField("retailPrice")
        private String retailPrice;
        @ApiField("settlementAmount")
        private String settlementAmount;
        @ApiField("size")
        private String size;
        @ApiField("skuProperty")
        private String skuProperty;
        @ApiField("snList")
        private SnList snList;
        @ApiField("sourceOrderCode")
        private String sourceOrderCode;
        @ApiField("standardAmount")
        private String standardAmount;
        @ApiField("standardPrice")
        private String standardPrice;
        @ApiField("status")
        private String status;
        @ApiField("stockInQty")
        private String stockInQty;
        @ApiField("stockOutQty")
        private String stockOutQty;
        @ApiField("subDeliveryOrderId")
        private String subDeliveryOrderId;
        @ApiField("subSourceCode")
        private String subSourceCode;
        @ApiField("subSourceOrderCode")
        private String subSourceOrderCode;
        @ApiField("taobaoItemCode")
        private String taobaoItemCode;
        @ApiField("unit")
        private String unit;
        @ApiField("warehouseCode")
        private String warehouseCode;

        public OrderLine() {
        }

        public String getActualPrice() {
            return this.actualPrice;
        }

        public void setActualPrice(String actualPrice) {
            this.actualPrice = actualPrice;
        }

        public Long getActualQty() {
            return this.actualQty;
        }

        public void setActualQty(Long actualQty) {
            this.actualQty = actualQty;
        }

        public String getAmount() {
            return this.amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getBatchCode() {
            return this.batchCode;
        }

        public void setBatchCode(String batchCode) {
            this.batchCode = batchCode;
        }

        public List<Batch> getBatchs() {
            return this.batchs;
        }

        public void setBatchs(List<Batch> batchs) {
            this.batchs = batchs;
        }

        public String getColor() {
            return this.color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getDeliveryOrderId() {
            return this.deliveryOrderId;
        }

        public void setDeliveryOrderId(String deliveryOrderId) {
            this.deliveryOrderId = deliveryOrderId;
        }

        public String getDiscount() {
            return this.discount;
        }

        public void setDiscount(String discount) {
            this.discount = discount;
        }

        public String getDiscountAmount() {
            return this.discountAmount;
        }

        public void setDiscountAmount(String discountAmount) {
            this.discountAmount = discountAmount;
        }

        public String getDiscountPrice() {
            return this.discountPrice;
        }

        public void setDiscountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
        }

        public String getExceptionQty() {
            return this.exceptionQty;
        }

        public void setExceptionQty(String exceptionQty) {
            this.exceptionQty = exceptionQty;
        }

        public String getExpireDate() {
            return this.expireDate;
        }

        public void setExpireDate(String expireDate) {
            this.expireDate = expireDate;
        }

        public String getExtCode() {
            return this.extCode;
        }

        public void setExtCode(String extCode) {
            this.extCode = extCode;
        }

        public String getInventoryType() {
            return this.inventoryType;
        }

        public void setInventoryType(String inventoryType) {
            this.inventoryType = inventoryType;
        }

        public String getItemCode() {
            return this.itemCode;
        }

        public void setItemCode(String itemCode) {
            this.itemCode = itemCode;
        }

        public String getItemId() {
            return this.itemId;
        }

        public void setItemId(String itemId) {
            this.itemId = itemId;
        }

        public String getItemName() {
            return this.itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public String getLocationCode() {
            return this.locationCode;
        }

        public void setLocationCode(String locationCode) {
            this.locationCode = locationCode;
        }

        public String getMoveInLocation() {
            return this.moveInLocation;
        }

        public void setMoveInLocation(String moveInLocation) {
            this.moveInLocation = moveInLocation;
        }

        public String getMoveOutLocation() {
            return this.moveOutLocation;
        }

        public void setMoveOutLocation(String moveOutLocation) {
            this.moveOutLocation = moveOutLocation;
        }

        public String getOrderLineNo() {
            return this.orderLineNo;
        }

        public void setOrderLineNo(String orderLineNo) {
            this.orderLineNo = orderLineNo;
        }

        public String getOrderSourceCode() {
            return this.orderSourceCode;
        }

        public void setOrderSourceCode(String orderSourceCode) {
            this.orderSourceCode = orderSourceCode;
        }

        public String getOutBizCode() {
            return this.outBizCode;
        }

        public void setOutBizCode(String outBizCode) {
            this.outBizCode = outBizCode;
        }

        public String getOwnerCode() {
            return this.ownerCode;
        }

        public void setOwnerCode(String ownerCode) {
            this.ownerCode = ownerCode;
        }

        public String getPayNo() {
            return this.payNo;
        }

        public void setPayNo(String payNo) {
            this.payNo = payNo;
        }

        public Long getPlanQty() {
            return this.planQty;
        }

        public void setPlanQty(Long planQty) {
            this.planQty = planQty;
        }

        public String getProduceCode() {
            return this.produceCode;
        }

        public void setProduceCode(String produceCode) {
            this.produceCode = produceCode;
        }

        public String getProductCode() {
            return this.productCode;
        }

        public void setProductCode(String productCode) {
            this.productCode = productCode;
        }

        public String getProductDate() {
            return this.productDate;
        }

        public void setProductDate(String productDate) {
            this.productDate = productDate;
        }

        public String getPurchasePrice() {
            return this.purchasePrice;
        }

        public void setPurchasePrice(String purchasePrice) {
            this.purchasePrice = purchasePrice;
        }

        public String getQrCode() {
            return this.qrCode;
        }

        public void setQrCode(String qrCode) {
            this.qrCode = qrCode;
        }

        public String getQuantity() {
            return this.quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getReferencePrice() {
            return this.referencePrice;
        }

        public void setReferencePrice(String referencePrice) {
            this.referencePrice = referencePrice;
        }

        public String getRemark() {
            return this.remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getRetailPrice() {
            return this.retailPrice;
        }

        public void setRetailPrice(String retailPrice) {
            this.retailPrice = retailPrice;
        }

        public String getSettlementAmount() {
            return this.settlementAmount;
        }

        public void setSettlementAmount(String settlementAmount) {
            this.settlementAmount = settlementAmount;
        }

        public String getSize() {
            return this.size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getSkuProperty() {
            return this.skuProperty;
        }

        public void setSkuProperty(String skuProperty) {
            this.skuProperty = skuProperty;
        }

        public SnList getSnList() {
            return this.snList;
        }

        public void setSnList(SnList snList) {
            this.snList = snList;
        }

        public String getSourceOrderCode() {
            return this.sourceOrderCode;
        }

        public void setSourceOrderCode(String sourceOrderCode) {
            this.sourceOrderCode = sourceOrderCode;
        }

        public String getStandardAmount() {
            return this.standardAmount;
        }

        public void setStandardAmount(String standardAmount) {
            this.standardAmount = standardAmount;
        }

        public String getStandardPrice() {
            return this.standardPrice;
        }

        public void setStandardPrice(String standardPrice) {
            this.standardPrice = standardPrice;
        }

        public String getStatus() {
            return this.status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStockInQty() {
            return this.stockInQty;
        }

        public void setStockInQty(String stockInQty) {
            this.stockInQty = stockInQty;
        }

        public String getStockOutQty() {
            return this.stockOutQty;
        }

        public void setStockOutQty(String stockOutQty) {
            this.stockOutQty = stockOutQty;
        }

        public String getSubDeliveryOrderId() {
            return this.subDeliveryOrderId;
        }

        public void setSubDeliveryOrderId(String subDeliveryOrderId) {
            this.subDeliveryOrderId = subDeliveryOrderId;
        }

        public String getSubSourceCode() {
            return this.subSourceCode;
        }

        public void setSubSourceCode(String subSourceCode) {
            this.subSourceCode = subSourceCode;
        }

        public String getSubSourceOrderCode() {
            return this.subSourceOrderCode;
        }

        public void setSubSourceOrderCode(String subSourceOrderCode) {
            this.subSourceOrderCode = subSourceOrderCode;
        }

        public String getTaobaoItemCode() {
            return this.taobaoItemCode;
        }

        public void setTaobaoItemCode(String taobaoItemCode) {
            this.taobaoItemCode = taobaoItemCode;
        }

        public String getUnit() {
            return this.unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getWarehouseCode() {
            return this.warehouseCode;
        }

        public void setWarehouseCode(String warehouseCode) {
            this.warehouseCode = warehouseCode;
        }
    }

    public static class SnList {
        @ApiListField("sn")
        @ApiField("string")
        private List<String> sn;

        public SnList() {
        }

        public List<String> getSn() {
            return this.sn;
        }

        public void setSn(List<String> sn) {
            this.sn = sn;
        }
    }

    public static class Batch {
        @ApiField("actualQty")
        private Long actualQty;
        @ApiField("batchCode")
        private String batchCode;
        @ApiField("expireDate")
        private String expireDate;
        @ApiField("inventoryType")
        private String inventoryType;
        @ApiField("produceCode")
        private String produceCode;
        @ApiField("productDate")
        private String productDate;
        @ApiField("quantity")
        private String quantity;
        @ApiField("remark")
        private String remark;

        public Batch() {
        }

        public Long getActualQty() {
            return this.actualQty;
        }

        public void setActualQty(Long actualQty) {
            this.actualQty = actualQty;
        }

        public String getBatchCode() {
            return this.batchCode;
        }

        public void setBatchCode(String batchCode) {
            this.batchCode = batchCode;
        }

        public String getExpireDate() {
            return this.expireDate;
        }

        public void setExpireDate(String expireDate) {
            this.expireDate = expireDate;
        }

        public String getInventoryType() {
            return this.inventoryType;
        }

        public void setInventoryType(String inventoryType) {
            this.inventoryType = inventoryType;
        }

        public String getProduceCode() {
            return this.produceCode;
        }

        public void setProduceCode(String produceCode) {
            this.produceCode = produceCode;
        }

        public String getProductDate() {
            return this.productDate;
        }

        public void setProductDate(String productDate) {
            this.productDate = productDate;
        }

        public String getQuantity() {
            return this.quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getRemark() {
            return this.remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }

    public static class EntryOrder {
        @ApiField("businessId")
        private String businessId;
        @ApiField("confirmType")
        private Long confirmType;
        @ApiField("consignId")
        private String consignId;
        @ApiField("contractCode")
        private String contractCode;
        @ApiField("entryOrderCode")
        private String entryOrderCode;
        @ApiField("entryOrderId")
        private String entryOrderId;
        @ApiField("entryOrderType")
        private String entryOrderType;
        @ApiField("expectEndTime")
        private String expectEndTime;
        @ApiField("expectStartTime")
        private String expectStartTime;
        @ApiField("expressCode")
        private String expressCode;
        @ApiField("extOrderCode")
        private String extOrderCode;
        @ApiField("freight")
        private String freight;
        @ApiField("isCheck")
        private String isCheck;
        @ApiField("isNudePackage")
        private String isNudePackage;
        @ApiField("logisticsCode")
        private String logisticsCode;
        @ApiField("logisticsContactName")
        private String logisticsContactName;
        @ApiField("logisticsContactNo")
        private String logisticsContactNo;
        @ApiField("logisticsContactPhone")
        private String logisticsContactPhone;
        @ApiField("logisticsName")
        private String logisticsName;
        @ApiField("operateTime")
        private String operateTime;
        @ApiField("operatorCode")
        private String operatorCode;
        @ApiField("operatorName")
        private String operatorName;
        @ApiField("orderCode")
        private String orderCode;
        @ApiField("orderCreateTime")
        private String orderCreateTime;
        @ApiField("orderId")
        private String orderId;
        @ApiField("orderSource")
        private String orderSource;
        @ApiField("orderType")
        private String orderType;
        @ApiField("outBizCode")
        private String outBizCode;
        @ApiField("ownerCode")
        private String ownerCode;
        @ApiField("planArrivalTime")
        private String planArrivalTime;
        @ApiField("purchaseOrderCode")
        private String purchaseOrderCode;
        @ApiField("receiverInfo")
        private ReceiverInfo receiverInfo;
        @ApiListField("relatedOrders")
        @ApiField("relatedOrder")
        private List<RelatedOrder> relatedOrders;
        @ApiField("remark")
        private String remark;
        @ApiField("responsibleDepartment")
        private String responsibleDepartment;
        @ApiField("senderInfo")
        private SenderInfo senderInfo;
        @ApiField("shopCode")
        private String shopCode;
        @ApiField("shopNick")
        private String shopNick;
        @ApiField("sizeDetail")
        private String sizeDetail;
        @ApiField("status")
        private String status;
        @ApiField("subOrderType")
        private String subOrderType;
        @ApiField("supplierAddress")
        private String supplierAddress;
        @ApiField("supplierArea")
        private String supplierArea;
        @ApiField("supplierCity")
        private String supplierCity;
        @ApiField("supplierCode")
        private String supplierCode;
        @ApiField("supplierEmail")
        private String supplierEmail;
        @ApiField("supplierName")
        private String supplierName;
        @ApiField("supplierPhone")
        private String supplierPhone;
        @ApiField("supplierProvince")
        private String supplierProvince;
        @ApiField("supplierTel")
        private String supplierTel;
        @ApiField("supplierTown")
        private String supplierTown;
        @ApiField("supplierZipCode")
        private String supplierZipCode;
        @ApiField("totalOrderLines")
        private Long totalOrderLines;
        @ApiField("warehouseCode")
        private String warehouseCode;
        @ApiField("warehouseName")
        private String warehouseName;

        public EntryOrder() {
        }

        public String getBusinessId() {
            return this.businessId;
        }

        public void setBusinessId(String businessId) {
            this.businessId = businessId;
        }

        public Long getConfirmType() {
            return this.confirmType;
        }

        public void setConfirmType(Long confirmType) {
            this.confirmType = confirmType;
        }

        public String getConsignId() {
            return this.consignId;
        }

        public void setConsignId(String consignId) {
            this.consignId = consignId;
        }

        public String getContractCode() {
            return this.contractCode;
        }

        public void setContractCode(String contractCode) {
            this.contractCode = contractCode;
        }

        public String getEntryOrderCode() {
            return this.entryOrderCode;
        }

        public void setEntryOrderCode(String entryOrderCode) {
            this.entryOrderCode = entryOrderCode;
        }

        public String getEntryOrderId() {
            return this.entryOrderId;
        }

        public void setEntryOrderId(String entryOrderId) {
            this.entryOrderId = entryOrderId;
        }

        public String getEntryOrderType() {
            return this.entryOrderType;
        }

        public void setEntryOrderType(String entryOrderType) {
            this.entryOrderType = entryOrderType;
        }

        public String getExpectEndTime() {
            return this.expectEndTime;
        }

        public void setExpectEndTime(String expectEndTime) {
            this.expectEndTime = expectEndTime;
        }

        public String getExpectStartTime() {
            return this.expectStartTime;
        }

        public void setExpectStartTime(String expectStartTime) {
            this.expectStartTime = expectStartTime;
        }

        public String getExpressCode() {
            return this.expressCode;
        }

        public void setExpressCode(String expressCode) {
            this.expressCode = expressCode;
        }

        public String getExtOrderCode() {
            return this.extOrderCode;
        }

        public void setExtOrderCode(String extOrderCode) {
            this.extOrderCode = extOrderCode;
        }

        public String getFreight() {
            return this.freight;
        }

        public void setFreight(String freight) {
            this.freight = freight;
        }

        public String getIsCheck() {
            return this.isCheck;
        }

        public void setIsCheck(String isCheck) {
            this.isCheck = isCheck;
        }

        public String getIsNudePackage() {
            return this.isNudePackage;
        }

        public void setIsNudePackage(String isNudePackage) {
            this.isNudePackage = isNudePackage;
        }

        public String getLogisticsCode() {
            return this.logisticsCode;
        }

        public void setLogisticsCode(String logisticsCode) {
            this.logisticsCode = logisticsCode;
        }

        public String getLogisticsContactName() {
            return this.logisticsContactName;
        }

        public void setLogisticsContactName(String logisticsContactName) {
            this.logisticsContactName = logisticsContactName;
        }

        public String getLogisticsContactNo() {
            return this.logisticsContactNo;
        }

        public void setLogisticsContactNo(String logisticsContactNo) {
            this.logisticsContactNo = logisticsContactNo;
        }

        public String getLogisticsContactPhone() {
            return this.logisticsContactPhone;
        }

        public void setLogisticsContactPhone(String logisticsContactPhone) {
            this.logisticsContactPhone = logisticsContactPhone;
        }

        public String getLogisticsName() {
            return this.logisticsName;
        }

        public void setLogisticsName(String logisticsName) {
            this.logisticsName = logisticsName;
        }

        public String getOperateTime() {
            return this.operateTime;
        }

        public void setOperateTime(String operateTime) {
            this.operateTime = operateTime;
        }

        public String getOperatorCode() {
            return this.operatorCode;
        }

        public void setOperatorCode(String operatorCode) {
            this.operatorCode = operatorCode;
        }

        public String getOperatorName() {
            return this.operatorName;
        }

        public void setOperatorName(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getOrderCode() {
            return this.orderCode;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public String getOrderCreateTime() {
            return this.orderCreateTime;
        }

        public void setOrderCreateTime(String orderCreateTime) {
            this.orderCreateTime = orderCreateTime;
        }

        public String getOrderId() {
            return this.orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getOrderSource() {
            return this.orderSource;
        }

        public void setOrderSource(String orderSource) {
            this.orderSource = orderSource;
        }

        public String getOrderType() {
            return this.orderType;
        }

        public void setOrderType(String orderType) {
            this.orderType = orderType;
        }

        public String getOutBizCode() {
            return this.outBizCode;
        }

        public void setOutBizCode(String outBizCode) {
            this.outBizCode = outBizCode;
        }

        public String getOwnerCode() {
            return this.ownerCode;
        }

        public void setOwnerCode(String ownerCode) {
            this.ownerCode = ownerCode;
        }

        public String getPlanArrivalTime() {
            return this.planArrivalTime;
        }

        public void setPlanArrivalTime(String planArrivalTime) {
            this.planArrivalTime = planArrivalTime;
        }

        public String getPurchaseOrderCode() {
            return this.purchaseOrderCode;
        }

        public void setPurchaseOrderCode(String purchaseOrderCode) {
            this.purchaseOrderCode = purchaseOrderCode;
        }

        public ReceiverInfo getReceiverInfo() {
            return this.receiverInfo;
        }

        public void setReceiverInfo(ReceiverInfo receiverInfo) {
            this.receiverInfo = receiverInfo;
        }

        public List<RelatedOrder> getRelatedOrders() {
            return this.relatedOrders;
        }

        public void setRelatedOrders(List<RelatedOrder> relatedOrders) {
            this.relatedOrders = relatedOrders;
        }

        public String getRemark() {
            return this.remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getResponsibleDepartment() {
            return this.responsibleDepartment;
        }

        public void setResponsibleDepartment(String responsibleDepartment) {
            this.responsibleDepartment = responsibleDepartment;
        }

        public SenderInfo getSenderInfo() {
            return this.senderInfo;
        }

        public void setSenderInfo(SenderInfo senderInfo) {
            this.senderInfo = senderInfo;
        }

        public String getShopCode() {
            return this.shopCode;
        }

        public void setShopCode(String shopCode) {
            this.shopCode = shopCode;
        }

        public String getShopNick() {
            return this.shopNick;
        }

        public void setShopNick(String shopNick) {
            this.shopNick = shopNick;
        }

        public String getSizeDetail() {
            return this.sizeDetail;
        }

        public void setSizeDetail(String sizeDetail) {
            this.sizeDetail = sizeDetail;
        }

        public String getStatus() {
            return this.status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getSubOrderType() {
            return this.subOrderType;
        }

        public void setSubOrderType(String subOrderType) {
            this.subOrderType = subOrderType;
        }

        public String getSupplierAddress() {
            return this.supplierAddress;
        }

        public void setSupplierAddress(String supplierAddress) {
            this.supplierAddress = supplierAddress;
        }

        public String getSupplierArea() {
            return this.supplierArea;
        }

        public void setSupplierArea(String supplierArea) {
            this.supplierArea = supplierArea;
        }

        public String getSupplierCity() {
            return this.supplierCity;
        }

        public void setSupplierCity(String supplierCity) {
            this.supplierCity = supplierCity;
        }

        public String getSupplierCode() {
            return this.supplierCode;
        }

        public void setSupplierCode(String supplierCode) {
            this.supplierCode = supplierCode;
        }

        public String getSupplierEmail() {
            return this.supplierEmail;
        }

        public void setSupplierEmail(String supplierEmail) {
            this.supplierEmail = supplierEmail;
        }

        public String getSupplierName() {
            return this.supplierName;
        }

        public void setSupplierName(String supplierName) {
            this.supplierName = supplierName;
        }

        public String getSupplierPhone() {
            return this.supplierPhone;
        }

        public void setSupplierPhone(String supplierPhone) {
            this.supplierPhone = supplierPhone;
        }

        public String getSupplierProvince() {
            return this.supplierProvince;
        }

        public void setSupplierProvince(String supplierProvince) {
            this.supplierProvince = supplierProvince;
        }

        public String getSupplierTel() {
            return this.supplierTel;
        }

        public void setSupplierTel(String supplierTel) {
            this.supplierTel = supplierTel;
        }

        public String getSupplierTown() {
            return this.supplierTown;
        }

        public void setSupplierTown(String supplierTown) {
            this.supplierTown = supplierTown;
        }

        public String getSupplierZipCode() {
            return this.supplierZipCode;
        }

        public void setSupplierZipCode(String supplierZipCode) {
            this.supplierZipCode = supplierZipCode;
        }

        public Long getTotalOrderLines() {
            return this.totalOrderLines;
        }

        public void setTotalOrderLines(Long totalOrderLines) {
            this.totalOrderLines = totalOrderLines;
        }

        public String getWarehouseCode() {
            return this.warehouseCode;
        }

        public void setWarehouseCode(String warehouseCode) {
            this.warehouseCode = warehouseCode;
        }

        public String getWarehouseName() {
            return this.warehouseName;
        }

        public void setWarehouseName(String warehouseName) {
            this.warehouseName = warehouseName;
        }
    }

    @ApiListType("relatedOrder")
    public static class RelatedOrder {
        @ApiField("orderCode")
        private String orderCode;
        @ApiField("orderType")
        private String orderType;
        @ApiField("remark")
        private String remark;

        public RelatedOrder() {
        }

        public String getOrderCode() {
            return this.orderCode;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public String getOrderType() {
            return this.orderType;
        }

        public void setOrderType(String orderType) {
            this.orderType = orderType;
        }

        public String getRemark() {
            return this.remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }

    public static class ReceiverInfo {
        @ApiField("area")
        private String area;
        @ApiField("birthDate")
        private String birthDate;
        @ApiField("carNo")
        private String carNo;
        @ApiField("career")
        private String career;
        @ApiField("city")
        private String city;
        @ApiField("company")
        private String company;
        @ApiField("countryCode")
        private String countryCode;
        @ApiField("countryCodeCiq")
        private String countryCodeCiq;
        @ApiField("countryCodeCus")
        private String countryCodeCus;
        @ApiField("detailAddress")
        private String detailAddress;
        @ApiField("email")
        private String email;
        @ApiField("fax")
        private String fax;
        @ApiField("gender")
        private String gender;
        @ApiField("id")
        private String id;
        @ApiField("idNumber")
        private String idNumber;
        @ApiField("idType")
        private String idType;
        @ApiField("mobile")
        private String mobile;
        @ApiField("name")
        private String name;
        @ApiField("nick")
        private String nick;
        @ApiField("province")
        private String province;
        @ApiField("remark")
        private String remark;
        @ApiField("tel")
        private String tel;
        @ApiField("town")
        private String town;
        @ApiField("zipCode")
        private String zipCode;

        public ReceiverInfo() {
        }

        public String getArea() {
            return this.area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getBirthDate() {
            return this.birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public String getCarNo() {
            return this.carNo;
        }

        public void setCarNo(String carNo) {
            this.carNo = carNo;
        }

        public String getCareer() {
            return this.career;
        }

        public void setCareer(String career) {
            this.career = career;
        }

        public String getCity() {
            return this.city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCompany() {
            return this.company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getCountryCode() {
            return this.countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getCountryCodeCiq() {
            return this.countryCodeCiq;
        }

        public void setCountryCodeCiq(String countryCodeCiq) {
            this.countryCodeCiq = countryCodeCiq;
        }

        public String getCountryCodeCus() {
            return this.countryCodeCus;
        }

        public void setCountryCodeCus(String countryCodeCus) {
            this.countryCodeCus = countryCodeCus;
        }

        public String getDetailAddress() {
            return this.detailAddress;
        }

        public void setDetailAddress(String detailAddress) {
            this.detailAddress = detailAddress;
        }

        public String getEmail() {
            return this.email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getFax() {
            return this.fax;
        }

        public void setFax(String fax) {
            this.fax = fax;
        }

        public String getGender() {
            return this.gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIdNumber() {
            return this.idNumber;
        }

        public void setIdNumber(String idNumber) {
            this.idNumber = idNumber;
        }

        public String getIdType() {
            return this.idType;
        }

        public void setIdType(String idType) {
            this.idType = idType;
        }

        public String getMobile() {
            return this.mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNick() {
            return this.nick;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }

        public String getProvince() {
            return this.province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getRemark() {
            return this.remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getTel() {
            return this.tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getTown() {
            return this.town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getZipCode() {
            return this.zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }
    }

    public static class SenderInfo {
        @ApiField("area")
        private String area;
        @ApiField("birthDate")
        private String birthDate;
        @ApiField("carNo")
        private String carNo;
        @ApiField("career")
        private String career;
        @ApiField("city")
        private String city;
        @ApiField("company")
        private String company;
        @ApiField("countryCode")
        private String countryCode;
        @ApiField("countryCodeCiq")
        private String countryCodeCiq;
        @ApiField("countryCodeCus")
        private String countryCodeCus;
        @ApiField("detailAddress")
        private String detailAddress;
        @ApiField("email")
        private String email;
        @ApiField("fax")
        private String fax;
        @ApiField("gender")
        private String gender;
        @ApiField("id")
        private String id;
        @ApiField("idNumber")
        private String idNumber;
        @ApiField("idType")
        private String idType;
        @ApiField("mobile")
        private String mobile;
        @ApiField("name")
        private String name;
        @ApiField("nick")
        private String nick;
        @ApiField("province")
        private String province;
        @ApiField("remark")
        private String remark;
        @ApiField("tel")
        private String tel;
        @ApiField("town")
        private String town;
        @ApiField("zipCode")
        private String zipCode;

        public SenderInfo() {
        }

        public String getArea() {
            return this.area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getBirthDate() {
            return this.birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public String getCarNo() {
            return this.carNo;
        }

        public void setCarNo(String carNo) {
            this.carNo = carNo;
        }

        public String getCareer() {
            return this.career;
        }

        public void setCareer(String career) {
            this.career = career;
        }

        public String getCity() {
            return this.city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCompany() {
            return this.company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getCountryCode() {
            return this.countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getCountryCodeCiq() {
            return this.countryCodeCiq;
        }

        public void setCountryCodeCiq(String countryCodeCiq) {
            this.countryCodeCiq = countryCodeCiq;
        }

        public String getCountryCodeCus() {
            return this.countryCodeCus;
        }

        public void setCountryCodeCus(String countryCodeCus) {
            this.countryCodeCus = countryCodeCus;
        }

        public String getDetailAddress() {
            return this.detailAddress;
        }

        public void setDetailAddress(String detailAddress) {
            this.detailAddress = detailAddress;
        }

        public String getEmail() {
            return this.email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getFax() {
            return this.fax;
        }

        public void setFax(String fax) {
            this.fax = fax;
        }

        public String getGender() {
            return this.gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIdNumber() {
            return this.idNumber;
        }

        public void setIdNumber(String idNumber) {
            this.idNumber = idNumber;
        }

        public String getIdType() {
            return this.idType;
        }

        public void setIdType(String idType) {
            this.idType = idType;
        }

        public String getMobile() {
            return this.mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNick() {
            return this.nick;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }

        public String getProvince() {
            return this.province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getRemark() {
            return this.remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getTel() {
            return this.tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getTown() {
            return this.town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getZipCode() {
            return this.zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }
    }
}
