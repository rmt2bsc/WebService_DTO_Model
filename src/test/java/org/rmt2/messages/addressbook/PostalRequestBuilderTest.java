package org.rmt2.messages.addressbook;

import java.math.BigInteger;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.CountryCriteriaType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.IpCriteriaType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.jaxb.PostalRequest;
import org.rmt2.jaxb.PostalRequest.PostalCriteria;
import org.rmt2.jaxb.StatesCriteriaType;
import org.rmt2.jaxb.ZipResultFormatType;
import org.rmt2.jaxb.ZipcodeCriteriaType;
import org.rmt2.util.HeaderTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class PostalRequestBuilderTest {

    private JaxbUtil jaxb;
    
    @Before
    public void setUp() throws Exception {
        try {
            jaxb = SystemConfigurator.getJaxb(ConfigConstants.JAXB_CONTEXNAME_DEFAULT);
        }
        catch (Exception e) {
            jaxb = new JaxbUtil(MessagingConstants.JAXB_RMT2_PKG);
        }
    }
    
    @Test
    public void testBuildZipcodeQueryRequest() {
        ObjectFactory fact = new ObjectFactory();
        PostalRequest req = fact.createPostalRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("addressbook")
                .withModule("postal")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.ZIPCODE_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        PostalCriteria criteria = fact.createPostalRequestPostalCriteria();
        ZipcodeCriteriaType zipCriteria = fact.createZipcodeCriteriaType();
        zipCriteria.setZipcode(BigInteger.valueOf(75232));
        zipCriteria.setCity("Dallas");
        zipCriteria.setState("TX");
        zipCriteria.setCountyName("Dallas");
        zipCriteria.setAreaCode("214");
        zipCriteria.setResultFormat(ZipResultFormatType.FULL);
        criteria.setZipcode(zipCriteria);
        req.setPostalCriteria(criteria);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains("FULL"));
    }
 
    @Test
    public void testBuildCountryQueryRequest() {
        ObjectFactory fact = new ObjectFactory();
        PostalRequest req = fact.createPostalRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("addressbook")
                .withModule("postal")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.COUNTRY_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        PostalCriteria postalCriteria = fact.createPostalRequestPostalCriteria();
        CountryCriteriaType criteria = fact.createCountryCriteriaType();
        criteria.setCountryId(BigInteger.valueOf(12345));
        criteria.setCountyName("United States");
        postalCriteria.setCountry(criteria);
        req.setPostalCriteria(postalCriteria);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains("United States"));
    }
    
    @Test
    public void testBuildRegionQueryRequest() {
        ObjectFactory fact = new ObjectFactory();
        PostalRequest req = fact.createPostalRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("addressbook")
                .withModule("postal")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.REGION_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        PostalCriteria postalCriteria = fact.createPostalRequestPostalCriteria();
        StatesCriteriaType criteria = fact.createStatesCriteriaType();
        criteria.setCountryId(BigInteger.valueOf(12345));
        criteria.setStateId(BigInteger.valueOf(2222));
        criteria.setStateName("Texas");
        criteria.setStateCode("TX");
        postalCriteria.setProvince(criteria);
        req.setPostalCriteria(postalCriteria);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains("Texas"));
    }
    
    @Test
    public void testBuildIpInfoQueryRequest() {
        ObjectFactory fact = new ObjectFactory();
        PostalRequest req = fact.createPostalRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("addressbook")
                .withModule("postal")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.IP_INFO_GET)
                .withRouting(ApiHeaderNames.DUMMY_HEADER_VALUE)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        PostalCriteria postalCriteria = fact.createPostalRequestPostalCriteria();
         IpCriteriaType criteria = fact.createIpCriteriaType();
        criteria.setIpNetwork(1234566);
        criteria.setIpStandard("111.222.333.444");
        postalCriteria.setIpAddr(criteria);
        req.setPostalCriteria(postalCriteria);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains("111.222.333.444"));
    }
}