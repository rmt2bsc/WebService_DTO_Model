package org.rmt2.util.contacts;

import java.util.Comparator;

/**
 * Provides functionality to compare the either the Name, Id, or AccountNo
 * properties of two {@link com.bean.CustomerExt CustomerBean} instances.
 * 
 * 
 * @author RTerrell
 * 
 */
public class CustomerBeanComparator implements Comparator {
    public static final String SORT_NAME = "Name";

    public static final String SORT_ID = "Id";

    public static final String SORT_ACCTNO = "AccountNo";

    private String sortPropName;

    /**
     * Constructs a CustomerBeanComparator object which the default sort
     * property is "Name".
     */
    public CustomerBeanComparator() {
        this.sortPropName = CustomerBeanComparator.SORT_NAME;
        return;
    }

    /**
     * Constructs a CustomerBeanComparator object by assigning the sort
     * property.
     * 
     * @param propName
     *            The name of the column to order by.
     */
    public CustomerBeanComparator(String propName) {
        this.sortPropName = propName;
        return;
    }

    /**
     * Compares two CustomerBean objects based on a specific property.
     * 
     * @param obj1
     *            The target CustomerBean object.
     * @param obj2
     *            The CustomerBean object to compare.
     * @return 0 if the strings are equal or if obj1 and/or obj2 are not
     *         instances of CustomerBean, a negative integer if the target
     *         String is less than the specified String, or a positive integer
     *         if the target String is greater than the specified String
     */
    public int compare(Object obj1, Object obj2) {
        CustomerBean custExt1;
        CustomerBean custExt2;
        if (obj1 instanceof CustomerBean && obj2 instanceof CustomerBean) {
            custExt1 = (CustomerBean) obj1;
            custExt2 = (CustomerBean) obj2;
        }
        else {
            return 0;
        }

        return this.sort(custExt1, custExt2);
    }

    /**
     * Orders <i>cust1</i> and <i>cust2</i> based on the column set forth as
     * either "Name", "Id", or "AccountNo".
     * 
     * @param cust1
     *            The first customer object
     * @param cust2
     *            The second customer object.
     * @return a negative, zero, or a positive integer as <i>cust1</i> argument
     *         is less than, equal to, or greater than <i>cust2</i>,
     *         respectively.
     */
    private int sort(CustomerBean cust1, CustomerBean cust2) {
        if (this.sortPropName.equals(CustomerBeanComparator.SORT_NAME)) {
            return cust1.getName().toLowerCase()
                    .compareTo(cust2.getName().toLowerCase());
        }
        else if (this.sortPropName.equals(CustomerBeanComparator.SORT_ID)) {
            Integer value1 = new Integer(cust1.getCustomerId());
            Integer value2 = new Integer(cust2.getCustomerId());
            return value1.compareTo(value2);
        }
        else if (this.sortPropName.equals(CustomerBeanComparator.SORT_ACCTNO)) {
            return cust1.getAccountNo().toLowerCase()
                    .compareTo(cust2.getAccountNo().toLowerCase());
        }
        return 0;
    }
}
