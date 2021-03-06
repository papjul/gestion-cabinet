package fr.vidal.webservices.productservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2015-01-19T13:31:02.388+01:00
 * Generated source version: 2.4.6
 * 
 */
@WebService(targetNamespace = "urn:Vidal", name = "productService")
@XmlSeeAlso({ObjectFactory.class})
public interface ProductService {

    @WebMethod
    @RequestWrapper(localName = "searchByProductRangeIds", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByProductRangeIds")
    @ResponseWrapper(localName = "searchByProductRangeIdsResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByProductRangeIdsResponse")
    @WebResult(name = "ProductRangeProductCoupleList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProductRangeProductCouple searchByProductRangeIds(
        @WebParam(name = "productRangeIds", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfInt productRangeIds
    );

    @WebMethod
    @RequestWrapper(localName = "searchByCommonNameGroupId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByCommonNameGroupId")
    @ResponseWrapper(localName = "searchByCommonNameGroupIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByCommonNameGroupIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByCommonNameGroupId(
        @WebParam(name = "commonNameGroupId", targetNamespace = "urn:Vidal")
        java.lang.Integer commonNameGroupId
    );

    @WebMethod
    @RequestWrapper(localName = "searchByWarningId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByWarningId")
    @ResponseWrapper(localName = "searchByWarningIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByWarningIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByWarningId(
        @WebParam(name = "warningId", targetNamespace = "urn:Vidal")
        java.lang.Integer warningId
    );

    @WebMethod
    @RequestWrapper(localName = "searchByMoleculeIds", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByMoleculeIds")
    @ResponseWrapper(localName = "searchByMoleculeIdsResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByMoleculeIdsResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByMoleculeIds(
        @WebParam(name = "moleculeIds", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfInt moleculeIds,
        @WebParam(name = "substanceTypes", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfSubstanceType substanceTypes
    );

    @WebMethod
    @RequestWrapper(localName = "hasCommonNameGroupSafetyAlert", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.HasCommonNameGroupSafetyAlert")
    @ResponseWrapper(localName = "hasCommonNameGroupSafetyAlertResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.HasCommonNameGroupSafetyAlertResponse")
    @WebResult(name = "safetyAlertStatus", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.SafetyAlertStatus hasCommonNameGroupSafetyAlert(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId
    );

    @WebMethod
    @RequestWrapper(localName = "getAllProductFull", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.GetAllProductFull")
    @ResponseWrapper(localName = "getAllProductFullResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.GetAllProductFullResponse")
    @WebResult(name = "pagedResultProductFull", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.PagedResultProductFull getAllProductFull(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name,
        @WebParam(name = "marketStatuses", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfMarketStatus marketStatuses,
        @WebParam(name = "productApiFilter", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ProductApiFilter productApiFilter,
        @WebParam(name = "types", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfProductType types,
        @WebParam(name = "aggregates", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfAggregate aggregates,
        @WebParam(name = "pageNumber", targetNamespace = "urn:Vidal")
        java.lang.Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "urn:Vidal")
        java.lang.Integer pageSize
    );

    @WebMethod
    @RequestWrapper(localName = "searchByNameWithPagedResult", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByNameWithPagedResult")
    @ResponseWrapper(localName = "searchByNameWithPagedResultResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByNameWithPagedResultResponse")
    @WebResult(name = "pagedResultProduct", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.PagedResultProduct searchByNameWithPagedResult(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name,
        @WebParam(name = "types", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfProductType types,
        @WebParam(name = "marketStatuses", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfMarketStatus marketStatuses,
        @WebParam(name = "pageNumber", targetNamespace = "urn:Vidal")
        java.lang.Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "urn:Vidal")
        java.lang.Integer pageSize
    );

    @WebMethod
    @RequestWrapper(localName = "searchByNameAndType", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByNameAndType")
    @ResponseWrapper(localName = "searchByNameAndTypeResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByNameAndTypeResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByNameAndType(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name,
        @WebParam(name = "type", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ProductType type
    );

    @WebMethod
    @RequestWrapper(localName = "searchByCis", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByCis")
    @ResponseWrapper(localName = "searchByCisResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByCisResponse")
    @WebResult(name = "product", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.Product searchByCis(
        @WebParam(name = "cis", targetNamespace = "urn:Vidal")
        java.lang.String cis
    );

    @WebMethod
    @RequestWrapper(localName = "searchByNameWithTypes", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByNameWithTypes")
    @ResponseWrapper(localName = "searchByNameWithTypesResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByNameWithTypesResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByNameWithTypes(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name,
        @WebParam(name = "types", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfProductType types
    );

    @WebMethod
    @RequestWrapper(localName = "searchByMoleculeId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByMoleculeId")
    @ResponseWrapper(localName = "searchByMoleculeIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByMoleculeIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByMoleculeId(
        @WebParam(name = "moleculeId", targetNamespace = "urn:Vidal")
        java.lang.Integer moleculeId
    );

    @WebMethod
    @RequestWrapper(localName = "getProductFullByIds", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.GetProductFullByIds")
    @ResponseWrapper(localName = "getProductFullByIdsResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.GetProductFullByIdsResponse")
    @WebResult(name = "productFullList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProductFull getProductFullByIds(
        @WebParam(name = "productIds", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfInt productIds,
        @WebParam(name = "aggregates", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfAggregate aggregates
    );

    @WebMethod
    @RequestWrapper(localName = "searchByIds", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByIds")
    @ResponseWrapper(localName = "searchByIdsResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByIdsResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByIds(
        @WebParam(name = "productIds", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfInt productIds
    );

    @WebMethod
    @RequestWrapper(localName = "searchWithoutInteractionsByVidalId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchWithoutInteractionsByVidalId")
    @ResponseWrapper(localName = "searchWithoutInteractionsByVidalIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchWithoutInteractionsByVidalIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchWithoutInteractionsByVidalId(
        @WebParam(name = "productIds", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfInt productIds,
        @WebParam(name = "vidalId", targetNamespace = "urn:Vidal")
        java.lang.Integer vidalId
    );

    @WebMethod
    @RequestWrapper(localName = "searchByVidalId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByVidalId")
    @ResponseWrapper(localName = "searchByVidalIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByVidalIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByVidalId(
        @WebParam(name = "vidalId", targetNamespace = "urn:Vidal")
        java.lang.Integer vidalId
    );

    @WebMethod
    @RequestWrapper(localName = "searchByVidalIds", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByVidalIds")
    @ResponseWrapper(localName = "searchByVidalIdsResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByVidalIdsResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByVidalIds(
        @WebParam(name = "vidalIds", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfInt vidalIds
    );

    @WebMethod
    @RequestWrapper(localName = "searchByFoodInteractionId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByFoodInteractionId")
    @ResponseWrapper(localName = "searchByFoodInteractionIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByFoodInteractionIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByFoodInteractionId(
        @WebParam(name = "foodInteractionId", targetNamespace = "urn:Vidal")
        java.lang.Integer foodInteractionId
    );

    @WebMethod
    @RequestWrapper(localName = "searchByAtcId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByAtcId")
    @ResponseWrapper(localName = "searchByAtcIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByAtcIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByAtcId(
        @WebParam(name = "atcId", targetNamespace = "urn:Vidal")
        java.lang.Integer atcId
    );

    @WebMethod
    @RequestWrapper(localName = "searchByDrugInteractionClassId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByDrugInteractionClassId")
    @ResponseWrapper(localName = "searchByDrugInteractionClassIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByDrugInteractionClassIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByDrugInteractionClassId(
        @WebParam(name = "drugInteractionClassId", targetNamespace = "urn:Vidal")
        java.lang.Integer drugInteractionClassId
    );

    @WebMethod
    @RequestWrapper(localName = "getAllProducts", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.GetAllProducts")
    @ResponseWrapper(localName = "getAllProductsResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.GetAllProductsResponse")
    @WebResult(name = "pagedResultProduct", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.PagedResultProduct getAllProducts(
        @WebParam(name = "productApiFilter", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ProductApiFilter productApiFilter,
        @WebParam(name = "types", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfProductType types,
        @WebParam(name = "marketStatuses", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfMarketStatus marketStatuses,
        @WebParam(name = "pageNumber", targetNamespace = "urn:Vidal")
        java.lang.Integer pageNumber,
        @WebParam(name = "pageSize", targetNamespace = "urn:Vidal")
        java.lang.Integer pageSize
    );

    @WebMethod
    @RequestWrapper(localName = "getAsmr", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.GetAsmr")
    @ResponseWrapper(localName = "getAsmrResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.GetAsmrResponse")
    @WebResult(name = "asmrList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfAsmr getAsmr(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId
    );

    @WebMethod
    @RequestWrapper(localName = "searchProductsByUcdId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchProductsByUcdId")
    @ResponseWrapper(localName = "searchProductsByUcdIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchProductsByUcdIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchProductsByUcdId(
        @WebParam(name = "ucdId", targetNamespace = "urn:Vidal")
        java.lang.Integer ucdId
    );

    @WebMethod
    @RequestWrapper(localName = "searchBySempIds", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchBySempIds")
    @ResponseWrapper(localName = "searchBySempIdsResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchBySempIdsResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchBySempIds(
        @WebParam(name = "sempIds", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfInt sempIds
    );

    @WebMethod
    @RequestWrapper(localName = "searchByIndicationId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByIndicationId")
    @ResponseWrapper(localName = "searchByIndicationIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByIndicationIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByIndicationId(
        @WebParam(name = "indicationId", targetNamespace = "urn:Vidal")
        java.lang.Integer indicationId
    );

    @WebMethod
    @RequestWrapper(localName = "getPrescriptionMode", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.GetPrescriptionMode")
    @ResponseWrapper(localName = "getPrescriptionModeResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.GetPrescriptionModeResponse")
    @WebResult(name = "prescriptionMode", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.PrescriptionMode getPrescriptionMode(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId
    );

    @WebMethod
    @RequestWrapper(localName = "searchByCodes", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByCodes")
    @ResponseWrapper(localName = "searchByCodesResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByCodesResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByCodes(
        @WebParam(name = "cis", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfString cis
    );

    @WebMethod
    @RequestWrapper(localName = "searchByIndicationsGroupId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByIndicationsGroupId")
    @ResponseWrapper(localName = "searchByIndicationsGroupIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByIndicationsGroupIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByIndicationsGroupId(
        @WebParam(name = "indicationsGroupId", targetNamespace = "urn:Vidal")
        java.lang.Integer indicationsGroupId
    );

    @WebMethod
    @RequestWrapper(localName = "searchProductIndicatorsByProductIds", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchProductIndicatorsByProductIds")
    @ResponseWrapper(localName = "searchProductIndicatorsByProductIdsResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchProductIndicatorsByProductIdsResponse")
    @WebResult(name = "productIndicatorsList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProductIndicators searchProductIndicatorsByProductIds(
        @WebParam(name = "productIds", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfInt productIds
    );

    @WebMethod
    @RequestWrapper(localName = "searchByPrecautionId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByPrecautionId")
    @ResponseWrapper(localName = "searchByPrecautionIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByPrecautionIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByPrecautionId(
        @WebParam(name = "precautionId", targetNamespace = "urn:Vidal")
        java.lang.Integer precautionId
    );

    @WebMethod
    @RequestWrapper(localName = "searchByMoleculeIdAndType", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByMoleculeIdAndType")
    @ResponseWrapper(localName = "searchByMoleculeIdAndTypeResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByMoleculeIdAndTypeResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByMoleculeIdAndType(
        @WebParam(name = "moleculeId", targetNamespace = "urn:Vidal")
        java.lang.Integer moleculeId,
        @WebParam(name = "substanceType", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.SubstanceType substanceType
    );

    @WebMethod
    @RequestWrapper(localName = "getSmr", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.GetSmr")
    @ResponseWrapper(localName = "getSmrResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.GetSmrResponse")
    @WebResult(name = "smrList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfSmr getSmr(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId
    );

    @WebMethod
    @RequestWrapper(localName = "searchByContraIndicationId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByContraIndicationId")
    @ResponseWrapper(localName = "searchByContraIndicationIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByContraIndicationIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByContraIndicationId(
        @WebParam(name = "contraIndicationId", targetNamespace = "urn:Vidal")
        java.lang.Integer contraIndicationId
    );

    @WebMethod
    @RequestWrapper(localName = "searchNewlyAvailableProducts", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchNewlyAvailableProducts")
    @ResponseWrapper(localName = "searchNewlyAvailableProductsResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchNewlyAvailableProductsResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchNewlyAvailableProducts();

    @WebMethod
    @RequestWrapper(localName = "directSearchByName", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.DirectSearchByName")
    @ResponseWrapper(localName = "directSearchByNameResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.DirectSearchByNameResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct directSearchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name
    );

    @WebMethod
    @RequestWrapper(localName = "searchByEphmraId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByEphmraId")
    @ResponseWrapper(localName = "searchByEphmraIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByEphmraIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByEphmraId(
        @WebParam(name = "ephmraId", targetNamespace = "urn:Vidal")
        java.lang.Integer ephmraId
    );

    @WebMethod
    @RequestWrapper(localName = "getGalenicForm", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.GetGalenicForm")
    @ResponseWrapper(localName = "getGalenicFormResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.GetGalenicFormResponse")
    @WebResult(name = "galenicForm", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.GalenicForm getGalenicForm(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId
    );

    @WebMethod
    @RequestWrapper(localName = "searchByName", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByNameResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByName(
        @WebParam(name = "name", targetNamespace = "urn:Vidal")
        java.lang.String name
    );

    @WebMethod
    @RequestWrapper(localName = "searchByCompanyId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByCompanyId")
    @ResponseWrapper(localName = "searchByCompanyIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByCompanyIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByCompanyId(
        @WebParam(name = "companyId", targetNamespace = "urn:Vidal")
        java.lang.Integer companyId
    );

    @WebMethod
    @RequestWrapper(localName = "searchBySempId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchBySempId")
    @ResponseWrapper(localName = "searchBySempIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchBySempIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchBySempId(
        @WebParam(name = "sempId", targetNamespace = "urn:Vidal")
        java.lang.Integer sempId
    );

    @WebMethod
    @RequestWrapper(localName = "searchWithoutInteractionsByIndicationId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchWithoutInteractionsByIndicationId")
    @ResponseWrapper(localName = "searchWithoutInteractionsByIndicationIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchWithoutInteractionsByIndicationIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchWithoutInteractionsByIndicationId(
        @WebParam(name = "productIds", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfInt productIds,
        @WebParam(name = "indicationId", targetNamespace = "urn:Vidal")
        java.lang.Integer indicationId
    );

    @WebMethod
    @RequestWrapper(localName = "searchByUcdId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByUcdId")
    @ResponseWrapper(localName = "searchByUcdIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByUcdIdResponse")
    @WebResult(name = "product", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.Product searchByUcdId(
        @WebParam(name = "ucdId", targetNamespace = "urn:Vidal")
        java.lang.Integer ucdId
    );

    @WebMethod
    @RequestWrapper(localName = "searchByIndicationGroupId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByIndicationGroupId")
    @ResponseWrapper(localName = "searchByIndicationGroupIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByIndicationGroupIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByIndicationGroupId(
        @WebParam(name = "indicationGroupId", targetNamespace = "urn:Vidal")
        java.lang.Integer indicationGroupId
    );

    @WebMethod
    @RequestWrapper(localName = "searchById", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchById")
    @ResponseWrapper(localName = "searchByIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByIdResponse")
    @WebResult(name = "product", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.Product searchById(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId
    );

    @WebMethod
    @RequestWrapper(localName = "searchByPackId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByPackId")
    @ResponseWrapper(localName = "searchByPackIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByPackIdResponse")
    @WebResult(name = "product", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.Product searchByPackId(
        @WebParam(name = "packId", targetNamespace = "urn:Vidal")
        java.lang.Integer packId
    );

    @WebMethod
    @RequestWrapper(localName = "searchBySaumonIds", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchBySaumonIds")
    @ResponseWrapper(localName = "searchBySaumonIdsResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchBySaumonIdsResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchBySaumonIds(
        @WebParam(name = "saumonIds", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfInt saumonIds
    );

    @WebMethod
    @RequestWrapper(localName = "getRoute", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.GetRoute")
    @ResponseWrapper(localName = "getRouteResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.GetRouteResponse")
    @WebResult(name = "routeList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfRoute getRoute(
        @WebParam(name = "productId", targetNamespace = "urn:Vidal")
        java.lang.Integer productId
    );

    @WebMethod
    @RequestWrapper(localName = "searchProductRoutesCouplesByProductIds", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchProductRoutesCouplesByProductIds")
    @ResponseWrapper(localName = "searchProductRoutesCouplesByProductIdsResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchProductRoutesCouplesByProductIdsResponse")
    @WebResult(name = "ProductRouteListCoupleList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProductRouteListCouple searchProductRoutesCouplesByProductIds(
        @WebParam(name = "productIds", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfInt productIds
    );

    @WebMethod
    @RequestWrapper(localName = "searchBySaumonId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchBySaumonId")
    @ResponseWrapper(localName = "searchBySaumonIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchBySaumonIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchBySaumonId(
        @WebParam(name = "saumonId", targetNamespace = "urn:Vidal")
        java.lang.Integer saumonId
    );

    @WebMethod
    @RequestWrapper(localName = "searchByAtcIds", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByAtcIds")
    @ResponseWrapper(localName = "searchByAtcIdsResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByAtcIdsResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByAtcIds(
        @WebParam(name = "atcIds", targetNamespace = "urn:Vidal")
        fr.vidal.webservices.productservice.ArrayOfInt atcIds
    );

    @WebMethod
    @RequestWrapper(localName = "searchBySideEffectId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchBySideEffectId")
    @ResponseWrapper(localName = "searchBySideEffectIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchBySideEffectIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchBySideEffectId(
        @WebParam(name = "sideEffectId", targetNamespace = "urn:Vidal")
        java.lang.Integer sideEffectId
    );

    @WebMethod
    @RequestWrapper(localName = "searchByGenericGroupId", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByGenericGroupId")
    @ResponseWrapper(localName = "searchByGenericGroupIdResponse", targetNamespace = "urn:Vidal", className = "fr.vidal.webservices.productservice.SearchByGenericGroupIdResponse")
    @WebResult(name = "productList", targetNamespace = "urn:Vidal")
    public fr.vidal.webservices.productservice.ArrayOfProduct searchByGenericGroupId(
        @WebParam(name = "genericGroupId", targetNamespace = "urn:Vidal")
        java.lang.Integer genericGroupId
    );
}
