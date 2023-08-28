package model.eo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 29 10:50:29 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XssshrKbcPeriodEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        KbcPeriodId,
        KnowBuddyCareId,
        EffectiveStartDate,
        EffectiveEndDate,
        CurrentAvailablityInd,
        CreatedBy,
        CreationDate,
        LastUpdatedBy,
        LastUpdateDate,
        LastUpdateLogin,
        XxsshrKnowBuddyCareEO;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int KBCPERIODID = AttributesEnum.KbcPeriodId.index();
    public static final int KNOWBUDDYCAREID = AttributesEnum.KnowBuddyCareId.index();
    public static final int EFFECTIVESTARTDATE = AttributesEnum.EffectiveStartDate.index();
    public static final int EFFECTIVEENDDATE = AttributesEnum.EffectiveEndDate.index();
    public static final int CURRENTAVAILABLITYIND = AttributesEnum.CurrentAvailablityInd.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int XXSSHRKNOWBUDDYCAREEO = AttributesEnum.XxsshrKnowBuddyCareEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XssshrKbcPeriodEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.eo.XssshrKbcPeriodEO");
    }


    /**
     * Gets the attribute value for KbcPeriodId, using the alias name KbcPeriodId.
     * @return the value of KbcPeriodId
     */
    public BigDecimal getKbcPeriodId() {
        return (BigDecimal) getAttributeInternal(KBCPERIODID);
    }

    /**
     * Sets <code>value</code> as the attribute value for KbcPeriodId.
     * @param value value to set the KbcPeriodId
     */
    public void setKbcPeriodId(BigDecimal value) {
        setAttributeInternal(KBCPERIODID, value);
    }

    /**
     * Gets the attribute value for KnowBuddyCareId, using the alias name KnowBuddyCareId.
     * @return the value of KnowBuddyCareId
     */
    public String getKnowBuddyCareId() {
        return (String) getAttributeInternal(KNOWBUDDYCAREID);
    }

    /**
     * Sets <code>value</code> as the attribute value for KnowBuddyCareId.
     * @param value value to set the KnowBuddyCareId
     */
    public void setKnowBuddyCareId(String value) {
        setAttributeInternal(KNOWBUDDYCAREID, value);
    }

    /**
     * Gets the attribute value for EffectiveStartDate, using the alias name EffectiveStartDate.
     * @return the value of EffectiveStartDate
     */
    public Timestamp getEffectiveStartDate() {
        return (Timestamp) getAttributeInternal(EFFECTIVESTARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveStartDate.
     * @param value value to set the EffectiveStartDate
     */
    public void setEffectiveStartDate(Timestamp value) {
        setAttributeInternal(EFFECTIVESTARTDATE, value);
    }

    /**
     * Gets the attribute value for EffectiveEndDate, using the alias name EffectiveEndDate.
     * @return the value of EffectiveEndDate
     */
    public Timestamp getEffectiveEndDate() {
        return (Timestamp) getAttributeInternal(EFFECTIVEENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveEndDate.
     * @param value value to set the EffectiveEndDate
     */
    public void setEffectiveEndDate(Timestamp value) {
        setAttributeInternal(EFFECTIVEENDDATE, value);
    }

    /**
     * Gets the attribute value for CurrentAvailablityInd, using the alias name CurrentAvailablityInd.
     * @return the value of CurrentAvailablityInd
     */
    public String getCurrentAvailablityInd() {
        return (String) getAttributeInternal(CURRENTAVAILABLITYIND);
    }

    /**
     * Sets <code>value</code> as the attribute value for CurrentAvailablityInd.
     * @param value value to set the CurrentAvailablityInd
     */
    public void setCurrentAvailablityInd(String value) {
        setAttributeInternal(CURRENTAVAILABLITYIND, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the value of CreationDate
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }


    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the value of LastUpdateDate
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdateLogin, using the alias name LastUpdateLogin.
     * @return the value of LastUpdateLogin
     */
    public String getLastUpdateLogin() {
        return (String) getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateLogin.
     * @param value value to set the LastUpdateLogin
     */
    public void setLastUpdateLogin(String value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**
     * @return the associated entity XxsshrKnowBuddyCareEOImpl.
     */
    public XxsshrKnowBuddyCareEOImpl getXxsshrKnowBuddyCareEO() {
        return (XxsshrKnowBuddyCareEOImpl) getAttributeInternal(XXSSHRKNOWBUDDYCAREEO);
    }

    /**
     * Sets <code>value</code> as the associated entity XxsshrKnowBuddyCareEOImpl.
     */
    public void setXxsshrKnowBuddyCareEO(XxsshrKnowBuddyCareEOImpl value) {
        setAttributeInternal(XXSSHRKNOWBUDDYCAREEO, value);
    }

    /**
     * @param kbcPeriodId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal kbcPeriodId) {
        return new Key(new Object[] { kbcPeriodId });
    }


}

