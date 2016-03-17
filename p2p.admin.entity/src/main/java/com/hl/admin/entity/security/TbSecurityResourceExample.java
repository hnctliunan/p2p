package com.hl.admin.entity.security;

import com.hl.utils.papper.PageSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSecurityResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected PageSet pageSet;

    public TbSecurityResourceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageSet(PageSet pageSet) {
        this.pageSet=pageSet;
    }

    public PageSet getPageSet() {
        return pageSet;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDataIdIsNull() {
            addCriterion("data_id is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("data_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(String value) {
            addCriterion("data_id =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(String value) {
            addCriterion("data_id <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(String value) {
            addCriterion("data_id >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("data_id >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(String value) {
            addCriterion("data_id <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(String value) {
            addCriterion("data_id <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLike(String value) {
            addCriterion("data_id like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotLike(String value) {
            addCriterion("data_id not like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<String> values) {
            addCriterion("data_id in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<String> values) {
            addCriterion("data_id not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(String value1, String value2) {
            addCriterion("data_id between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(String value1, String value2) {
            addCriterion("data_id not between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataEnableIsNull() {
            addCriterion("data_enable is null");
            return (Criteria) this;
        }

        public Criteria andDataEnableIsNotNull() {
            addCriterion("data_enable is not null");
            return (Criteria) this;
        }

        public Criteria andDataEnableEqualTo(String value) {
            addCriterion("data_enable =", value, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableNotEqualTo(String value) {
            addCriterion("data_enable <>", value, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableGreaterThan(String value) {
            addCriterion("data_enable >", value, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableGreaterThanOrEqualTo(String value) {
            addCriterion("data_enable >=", value, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableLessThan(String value) {
            addCriterion("data_enable <", value, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableLessThanOrEqualTo(String value) {
            addCriterion("data_enable <=", value, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableLike(String value) {
            addCriterion("data_enable like", value, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableNotLike(String value) {
            addCriterion("data_enable not like", value, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableIn(List<String> values) {
            addCriterion("data_enable in", values, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableNotIn(List<String> values) {
            addCriterion("data_enable not in", values, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableBetween(String value1, String value2) {
            addCriterion("data_enable between", value1, value2, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableNotBetween(String value1, String value2) {
            addCriterion("data_enable not between", value1, value2, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeIsNull() {
            addCriterion("data_insert_time is null");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeIsNotNull() {
            addCriterion("data_insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeEqualTo(Date value) {
            addCriterion("data_insert_time =", value, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeNotEqualTo(Date value) {
            addCriterion("data_insert_time <>", value, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeGreaterThan(Date value) {
            addCriterion("data_insert_time >", value, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("data_insert_time >=", value, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeLessThan(Date value) {
            addCriterion("data_insert_time <", value, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("data_insert_time <=", value, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeIn(List<Date> values) {
            addCriterion("data_insert_time in", values, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeNotIn(List<Date> values) {
            addCriterion("data_insert_time not in", values, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeBetween(Date value1, Date value2) {
            addCriterion("data_insert_time between", value1, value2, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("data_insert_time not between", value1, value2, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeIsNull() {
            addCriterion("data_update_time is null");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeIsNotNull() {
            addCriterion("data_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeEqualTo(Date value) {
            addCriterion("data_update_time =", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeNotEqualTo(Date value) {
            addCriterion("data_update_time <>", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeGreaterThan(Date value) {
            addCriterion("data_update_time >", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("data_update_time >=", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeLessThan(Date value) {
            addCriterion("data_update_time <", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("data_update_time <=", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeIn(List<Date> values) {
            addCriterion("data_update_time in", values, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeNotIn(List<Date> values) {
            addCriterion("data_update_time not in", values, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("data_update_time between", value1, value2, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("data_update_time not between", value1, value2, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeIsNull() {
            addCriterion("data_delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeIsNotNull() {
            addCriterion("data_delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeEqualTo(Date value) {
            addCriterion("data_delete_time =", value, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeNotEqualTo(Date value) {
            addCriterion("data_delete_time <>", value, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeGreaterThan(Date value) {
            addCriterion("data_delete_time >", value, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("data_delete_time >=", value, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeLessThan(Date value) {
            addCriterion("data_delete_time <", value, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("data_delete_time <=", value, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeIn(List<Date> values) {
            addCriterion("data_delete_time in", values, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeNotIn(List<Date> values) {
            addCriterion("data_delete_time not in", values, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("data_delete_time between", value1, value2, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("data_delete_time not between", value1, value2, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andExtensionAIsNull() {
            addCriterion("extension_a is null");
            return (Criteria) this;
        }

        public Criteria andExtensionAIsNotNull() {
            addCriterion("extension_a is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionAEqualTo(String value) {
            addCriterion("extension_a =", value, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionANotEqualTo(String value) {
            addCriterion("extension_a <>", value, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionAGreaterThan(String value) {
            addCriterion("extension_a >", value, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionAGreaterThanOrEqualTo(String value) {
            addCriterion("extension_a >=", value, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionALessThan(String value) {
            addCriterion("extension_a <", value, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionALessThanOrEqualTo(String value) {
            addCriterion("extension_a <=", value, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionALike(String value) {
            addCriterion("extension_a like", value, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionANotLike(String value) {
            addCriterion("extension_a not like", value, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionAIn(List<String> values) {
            addCriterion("extension_a in", values, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionANotIn(List<String> values) {
            addCriterion("extension_a not in", values, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionABetween(String value1, String value2) {
            addCriterion("extension_a between", value1, value2, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionANotBetween(String value1, String value2) {
            addCriterion("extension_a not between", value1, value2, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionBIsNull() {
            addCriterion("extension_b is null");
            return (Criteria) this;
        }

        public Criteria andExtensionBIsNotNull() {
            addCriterion("extension_b is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionBEqualTo(String value) {
            addCriterion("extension_b =", value, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBNotEqualTo(String value) {
            addCriterion("extension_b <>", value, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBGreaterThan(String value) {
            addCriterion("extension_b >", value, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBGreaterThanOrEqualTo(String value) {
            addCriterion("extension_b >=", value, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBLessThan(String value) {
            addCriterion("extension_b <", value, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBLessThanOrEqualTo(String value) {
            addCriterion("extension_b <=", value, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBLike(String value) {
            addCriterion("extension_b like", value, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBNotLike(String value) {
            addCriterion("extension_b not like", value, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBIn(List<String> values) {
            addCriterion("extension_b in", values, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBNotIn(List<String> values) {
            addCriterion("extension_b not in", values, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBBetween(String value1, String value2) {
            addCriterion("extension_b between", value1, value2, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBNotBetween(String value1, String value2) {
            addCriterion("extension_b not between", value1, value2, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionCIsNull() {
            addCriterion("extension_c is null");
            return (Criteria) this;
        }

        public Criteria andExtensionCIsNotNull() {
            addCriterion("extension_c is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionCEqualTo(String value) {
            addCriterion("extension_c =", value, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCNotEqualTo(String value) {
            addCriterion("extension_c <>", value, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCGreaterThan(String value) {
            addCriterion("extension_c >", value, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCGreaterThanOrEqualTo(String value) {
            addCriterion("extension_c >=", value, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCLessThan(String value) {
            addCriterion("extension_c <", value, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCLessThanOrEqualTo(String value) {
            addCriterion("extension_c <=", value, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCLike(String value) {
            addCriterion("extension_c like", value, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCNotLike(String value) {
            addCriterion("extension_c not like", value, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCIn(List<String> values) {
            addCriterion("extension_c in", values, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCNotIn(List<String> values) {
            addCriterion("extension_c not in", values, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCBetween(String value1, String value2) {
            addCriterion("extension_c between", value1, value2, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCNotBetween(String value1, String value2) {
            addCriterion("extension_c not between", value1, value2, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionDIsNull() {
            addCriterion("extension_d is null");
            return (Criteria) this;
        }

        public Criteria andExtensionDIsNotNull() {
            addCriterion("extension_d is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionDEqualTo(String value) {
            addCriterion("extension_d =", value, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDNotEqualTo(String value) {
            addCriterion("extension_d <>", value, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDGreaterThan(String value) {
            addCriterion("extension_d >", value, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDGreaterThanOrEqualTo(String value) {
            addCriterion("extension_d >=", value, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDLessThan(String value) {
            addCriterion("extension_d <", value, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDLessThanOrEqualTo(String value) {
            addCriterion("extension_d <=", value, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDLike(String value) {
            addCriterion("extension_d like", value, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDNotLike(String value) {
            addCriterion("extension_d not like", value, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDIn(List<String> values) {
            addCriterion("extension_d in", values, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDNotIn(List<String> values) {
            addCriterion("extension_d not in", values, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDBetween(String value1, String value2) {
            addCriterion("extension_d between", value1, value2, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDNotBetween(String value1, String value2) {
            addCriterion("extension_d not between", value1, value2, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionEIsNull() {
            addCriterion("extension_e is null");
            return (Criteria) this;
        }

        public Criteria andExtensionEIsNotNull() {
            addCriterion("extension_e is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionEEqualTo(String value) {
            addCriterion("extension_e =", value, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionENotEqualTo(String value) {
            addCriterion("extension_e <>", value, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionEGreaterThan(String value) {
            addCriterion("extension_e >", value, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionEGreaterThanOrEqualTo(String value) {
            addCriterion("extension_e >=", value, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionELessThan(String value) {
            addCriterion("extension_e <", value, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionELessThanOrEqualTo(String value) {
            addCriterion("extension_e <=", value, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionELike(String value) {
            addCriterion("extension_e like", value, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionENotLike(String value) {
            addCriterion("extension_e not like", value, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionEIn(List<String> values) {
            addCriterion("extension_e in", values, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionENotIn(List<String> values) {
            addCriterion("extension_e not in", values, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionEBetween(String value1, String value2) {
            addCriterion("extension_e between", value1, value2, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionENotBetween(String value1, String value2) {
            addCriterion("extension_e not between", value1, value2, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionFIsNull() {
            addCriterion("extension_f is null");
            return (Criteria) this;
        }

        public Criteria andExtensionFIsNotNull() {
            addCriterion("extension_f is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionFEqualTo(String value) {
            addCriterion("extension_f =", value, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFNotEqualTo(String value) {
            addCriterion("extension_f <>", value, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFGreaterThan(String value) {
            addCriterion("extension_f >", value, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFGreaterThanOrEqualTo(String value) {
            addCriterion("extension_f >=", value, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFLessThan(String value) {
            addCriterion("extension_f <", value, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFLessThanOrEqualTo(String value) {
            addCriterion("extension_f <=", value, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFLike(String value) {
            addCriterion("extension_f like", value, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFNotLike(String value) {
            addCriterion("extension_f not like", value, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFIn(List<String> values) {
            addCriterion("extension_f in", values, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFNotIn(List<String> values) {
            addCriterion("extension_f not in", values, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFBetween(String value1, String value2) {
            addCriterion("extension_f between", value1, value2, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFNotBetween(String value1, String value2) {
            addCriterion("extension_f not between", value1, value2, "extensionF");
            return (Criteria) this;
        }

        public Criteria andResNameIsNull() {
            addCriterion("res_name is null");
            return (Criteria) this;
        }

        public Criteria andResNameIsNotNull() {
            addCriterion("res_name is not null");
            return (Criteria) this;
        }

        public Criteria andResNameEqualTo(String value) {
            addCriterion("res_name =", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotEqualTo(String value) {
            addCriterion("res_name <>", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThan(String value) {
            addCriterion("res_name >", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameGreaterThanOrEqualTo(String value) {
            addCriterion("res_name >=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThan(String value) {
            addCriterion("res_name <", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLessThanOrEqualTo(String value) {
            addCriterion("res_name <=", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameLike(String value) {
            addCriterion("res_name like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotLike(String value) {
            addCriterion("res_name not like", value, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameIn(List<String> values) {
            addCriterion("res_name in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotIn(List<String> values) {
            addCriterion("res_name not in", values, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameBetween(String value1, String value2) {
            addCriterion("res_name between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andResNameNotBetween(String value1, String value2) {
            addCriterion("res_name not between", value1, value2, "resName");
            return (Criteria) this;
        }

        public Criteria andResCodeIsNull() {
            addCriterion("res_code is null");
            return (Criteria) this;
        }

        public Criteria andResCodeIsNotNull() {
            addCriterion("res_code is not null");
            return (Criteria) this;
        }

        public Criteria andResCodeEqualTo(String value) {
            addCriterion("res_code =", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotEqualTo(String value) {
            addCriterion("res_code <>", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeGreaterThan(String value) {
            addCriterion("res_code >", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeGreaterThanOrEqualTo(String value) {
            addCriterion("res_code >=", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeLessThan(String value) {
            addCriterion("res_code <", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeLessThanOrEqualTo(String value) {
            addCriterion("res_code <=", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeLike(String value) {
            addCriterion("res_code like", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotLike(String value) {
            addCriterion("res_code not like", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeIn(List<String> values) {
            addCriterion("res_code in", values, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotIn(List<String> values) {
            addCriterion("res_code not in", values, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeBetween(String value1, String value2) {
            addCriterion("res_code between", value1, value2, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotBetween(String value1, String value2) {
            addCriterion("res_code not between", value1, value2, "resCode");
            return (Criteria) this;
        }

        public Criteria andResParentIsNull() {
            addCriterion("res_parent is null");
            return (Criteria) this;
        }

        public Criteria andResParentIsNotNull() {
            addCriterion("res_parent is not null");
            return (Criteria) this;
        }

        public Criteria andResParentEqualTo(String value) {
            addCriterion("res_parent =", value, "resParent");
            return (Criteria) this;
        }

        public Criteria andResParentNotEqualTo(String value) {
            addCriterion("res_parent <>", value, "resParent");
            return (Criteria) this;
        }

        public Criteria andResParentGreaterThan(String value) {
            addCriterion("res_parent >", value, "resParent");
            return (Criteria) this;
        }

        public Criteria andResParentGreaterThanOrEqualTo(String value) {
            addCriterion("res_parent >=", value, "resParent");
            return (Criteria) this;
        }

        public Criteria andResParentLessThan(String value) {
            addCriterion("res_parent <", value, "resParent");
            return (Criteria) this;
        }

        public Criteria andResParentLessThanOrEqualTo(String value) {
            addCriterion("res_parent <=", value, "resParent");
            return (Criteria) this;
        }

        public Criteria andResParentLike(String value) {
            addCriterion("res_parent like", value, "resParent");
            return (Criteria) this;
        }

        public Criteria andResParentNotLike(String value) {
            addCriterion("res_parent not like", value, "resParent");
            return (Criteria) this;
        }

        public Criteria andResParentIn(List<String> values) {
            addCriterion("res_parent in", values, "resParent");
            return (Criteria) this;
        }

        public Criteria andResParentNotIn(List<String> values) {
            addCriterion("res_parent not in", values, "resParent");
            return (Criteria) this;
        }

        public Criteria andResParentBetween(String value1, String value2) {
            addCriterion("res_parent between", value1, value2, "resParent");
            return (Criteria) this;
        }

        public Criteria andResParentNotBetween(String value1, String value2) {
            addCriterion("res_parent not between", value1, value2, "resParent");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNull() {
            addCriterion("res_type is null");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNotNull() {
            addCriterion("res_type is not null");
            return (Criteria) this;
        }

        public Criteria andResTypeEqualTo(String value) {
            addCriterion("res_type =", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotEqualTo(String value) {
            addCriterion("res_type <>", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThan(String value) {
            addCriterion("res_type >", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThanOrEqualTo(String value) {
            addCriterion("res_type >=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThan(String value) {
            addCriterion("res_type <", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThanOrEqualTo(String value) {
            addCriterion("res_type <=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLike(String value) {
            addCriterion("res_type like", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotLike(String value) {
            addCriterion("res_type not like", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeIn(List<String> values) {
            addCriterion("res_type in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotIn(List<String> values) {
            addCriterion("res_type not in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeBetween(String value1, String value2) {
            addCriterion("res_type between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotBetween(String value1, String value2) {
            addCriterion("res_type not between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResUrlIsNull() {
            addCriterion("res_url is null");
            return (Criteria) this;
        }

        public Criteria andResUrlIsNotNull() {
            addCriterion("res_url is not null");
            return (Criteria) this;
        }

        public Criteria andResUrlEqualTo(String value) {
            addCriterion("res_url =", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotEqualTo(String value) {
            addCriterion("res_url <>", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlGreaterThan(String value) {
            addCriterion("res_url >", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlGreaterThanOrEqualTo(String value) {
            addCriterion("res_url >=", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlLessThan(String value) {
            addCriterion("res_url <", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlLessThanOrEqualTo(String value) {
            addCriterion("res_url <=", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlLike(String value) {
            addCriterion("res_url like", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotLike(String value) {
            addCriterion("res_url not like", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlIn(List<String> values) {
            addCriterion("res_url in", values, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotIn(List<String> values) {
            addCriterion("res_url not in", values, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlBetween(String value1, String value2) {
            addCriterion("res_url between", value1, value2, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotBetween(String value1, String value2) {
            addCriterion("res_url not between", value1, value2, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResIconIsNull() {
            addCriterion("res_icon is null");
            return (Criteria) this;
        }

        public Criteria andResIconIsNotNull() {
            addCriterion("res_icon is not null");
            return (Criteria) this;
        }

        public Criteria andResIconEqualTo(String value) {
            addCriterion("res_icon =", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconNotEqualTo(String value) {
            addCriterion("res_icon <>", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconGreaterThan(String value) {
            addCriterion("res_icon >", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconGreaterThanOrEqualTo(String value) {
            addCriterion("res_icon >=", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconLessThan(String value) {
            addCriterion("res_icon <", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconLessThanOrEqualTo(String value) {
            addCriterion("res_icon <=", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconLike(String value) {
            addCriterion("res_icon like", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconNotLike(String value) {
            addCriterion("res_icon not like", value, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconIn(List<String> values) {
            addCriterion("res_icon in", values, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconNotIn(List<String> values) {
            addCriterion("res_icon not in", values, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconBetween(String value1, String value2) {
            addCriterion("res_icon between", value1, value2, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResIconNotBetween(String value1, String value2) {
            addCriterion("res_icon not between", value1, value2, "resIcon");
            return (Criteria) this;
        }

        public Criteria andResEnableIsNull() {
            addCriterion("res_enable is null");
            return (Criteria) this;
        }

        public Criteria andResEnableIsNotNull() {
            addCriterion("res_enable is not null");
            return (Criteria) this;
        }

        public Criteria andResEnableEqualTo(String value) {
            addCriterion("res_enable =", value, "resEnable");
            return (Criteria) this;
        }

        public Criteria andResEnableNotEqualTo(String value) {
            addCriterion("res_enable <>", value, "resEnable");
            return (Criteria) this;
        }

        public Criteria andResEnableGreaterThan(String value) {
            addCriterion("res_enable >", value, "resEnable");
            return (Criteria) this;
        }

        public Criteria andResEnableGreaterThanOrEqualTo(String value) {
            addCriterion("res_enable >=", value, "resEnable");
            return (Criteria) this;
        }

        public Criteria andResEnableLessThan(String value) {
            addCriterion("res_enable <", value, "resEnable");
            return (Criteria) this;
        }

        public Criteria andResEnableLessThanOrEqualTo(String value) {
            addCriterion("res_enable <=", value, "resEnable");
            return (Criteria) this;
        }

        public Criteria andResEnableLike(String value) {
            addCriterion("res_enable like", value, "resEnable");
            return (Criteria) this;
        }

        public Criteria andResEnableNotLike(String value) {
            addCriterion("res_enable not like", value, "resEnable");
            return (Criteria) this;
        }

        public Criteria andResEnableIn(List<String> values) {
            addCriterion("res_enable in", values, "resEnable");
            return (Criteria) this;
        }

        public Criteria andResEnableNotIn(List<String> values) {
            addCriterion("res_enable not in", values, "resEnable");
            return (Criteria) this;
        }

        public Criteria andResEnableBetween(String value1, String value2) {
            addCriterion("res_enable between", value1, value2, "resEnable");
            return (Criteria) this;
        }

        public Criteria andResEnableNotBetween(String value1, String value2) {
            addCriterion("res_enable not between", value1, value2, "resEnable");
            return (Criteria) this;
        }

        public Criteria andResDescIsNull() {
            addCriterion("res_desc is null");
            return (Criteria) this;
        }

        public Criteria andResDescIsNotNull() {
            addCriterion("res_desc is not null");
            return (Criteria) this;
        }

        public Criteria andResDescEqualTo(String value) {
            addCriterion("res_desc =", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotEqualTo(String value) {
            addCriterion("res_desc <>", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescGreaterThan(String value) {
            addCriterion("res_desc >", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescGreaterThanOrEqualTo(String value) {
            addCriterion("res_desc >=", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescLessThan(String value) {
            addCriterion("res_desc <", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescLessThanOrEqualTo(String value) {
            addCriterion("res_desc <=", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescLike(String value) {
            addCriterion("res_desc like", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotLike(String value) {
            addCriterion("res_desc not like", value, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescIn(List<String> values) {
            addCriterion("res_desc in", values, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotIn(List<String> values) {
            addCriterion("res_desc not in", values, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescBetween(String value1, String value2) {
            addCriterion("res_desc between", value1, value2, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResDescNotBetween(String value1, String value2) {
            addCriterion("res_desc not between", value1, value2, "resDesc");
            return (Criteria) this;
        }

        public Criteria andResSortIsNull() {
            addCriterion("res_sort is null");
            return (Criteria) this;
        }

        public Criteria andResSortIsNotNull() {
            addCriterion("res_sort is not null");
            return (Criteria) this;
        }

        public Criteria andResSortEqualTo(Integer value) {
            addCriterion("res_sort =", value, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortNotEqualTo(Integer value) {
            addCriterion("res_sort <>", value, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortGreaterThan(Integer value) {
            addCriterion("res_sort >", value, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_sort >=", value, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortLessThan(Integer value) {
            addCriterion("res_sort <", value, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortLessThanOrEqualTo(Integer value) {
            addCriterion("res_sort <=", value, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortIn(List<Integer> values) {
            addCriterion("res_sort in", values, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortNotIn(List<Integer> values) {
            addCriterion("res_sort not in", values, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortBetween(Integer value1, Integer value2) {
            addCriterion("res_sort between", value1, value2, "resSort");
            return (Criteria) this;
        }

        public Criteria andResSortNotBetween(Integer value1, Integer value2) {
            addCriterion("res_sort not between", value1, value2, "resSort");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}