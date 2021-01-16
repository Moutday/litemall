package org.linlinjava.litemall.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class LitemallUserCard {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    public static final Boolean IS_DELETED = Deleted.IS_DELETED.value();

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    public static final Boolean NOT_DELETED = Deleted.NOT_DELETED.value();

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_card.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_card.card_level
     *
     * @mbg.generated
     */
    private Integer cardLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_card.point_begin
     *
     * @mbg.generated
     */
    private Integer pointBegin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_card.point_end
     *
     * @mbg.generated
     */
    private Integer pointEnd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_card.multiple
     *
     * @mbg.generated
     */
    private Integer multiple;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_card.vip_day_multiple
     *
     * @mbg.generated
     */
    private Integer vipDayMultiple;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_card.vip_day
     *
     * @mbg.generated
     */
    private String vipDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_card.vip_month_coupon
     *
     * @mbg.generated
     */
    private String vipMonthCoupon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_card.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_card.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_user_card.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_card.id
     *
     * @return the value of litemall_user_card.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_card.id
     *
     * @param id the value for litemall_user_card.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_card.card_level
     *
     * @return the value of litemall_user_card.card_level
     *
     * @mbg.generated
     */
    public Integer getCardLevel() {
        return cardLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_card.card_level
     *
     * @param cardLevel the value for litemall_user_card.card_level
     *
     * @mbg.generated
     */
    public void setCardLevel(Integer cardLevel) {
        this.cardLevel = cardLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_card.point_begin
     *
     * @return the value of litemall_user_card.point_begin
     *
     * @mbg.generated
     */
    public Integer getPointBegin() {
        return pointBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_card.point_begin
     *
     * @param pointBegin the value for litemall_user_card.point_begin
     *
     * @mbg.generated
     */
    public void setPointBegin(Integer pointBegin) {
        this.pointBegin = pointBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_card.point_end
     *
     * @return the value of litemall_user_card.point_end
     *
     * @mbg.generated
     */
    public Integer getPointEnd() {
        return pointEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_card.point_end
     *
     * @param pointEnd the value for litemall_user_card.point_end
     *
     * @mbg.generated
     */
    public void setPointEnd(Integer pointEnd) {
        this.pointEnd = pointEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_card.multiple
     *
     * @return the value of litemall_user_card.multiple
     *
     * @mbg.generated
     */
    public Integer getMultiple() {
        return multiple;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_card.multiple
     *
     * @param multiple the value for litemall_user_card.multiple
     *
     * @mbg.generated
     */
    public void setMultiple(Integer multiple) {
        this.multiple = multiple;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_card.vip_day_multiple
     *
     * @return the value of litemall_user_card.vip_day_multiple
     *
     * @mbg.generated
     */
    public Integer getVipDayMultiple() {
        return vipDayMultiple;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_card.vip_day_multiple
     *
     * @param vipDayMultiple the value for litemall_user_card.vip_day_multiple
     *
     * @mbg.generated
     */
    public void setVipDayMultiple(Integer vipDayMultiple) {
        this.vipDayMultiple = vipDayMultiple;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_card.vip_day
     *
     * @return the value of litemall_user_card.vip_day
     *
     * @mbg.generated
     */
    public String getVipDay() {
        return vipDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_card.vip_day
     *
     * @param vipDay the value for litemall_user_card.vip_day
     *
     * @mbg.generated
     */
    public void setVipDay(String vipDay) {
        this.vipDay = vipDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_card.vip_month_coupon
     *
     * @return the value of litemall_user_card.vip_month_coupon
     *
     * @mbg.generated
     */
    public String getVipMonthCoupon() {
        return vipMonthCoupon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_card.vip_month_coupon
     *
     * @param vipMonthCoupon the value for litemall_user_card.vip_month_coupon
     *
     * @mbg.generated
     */
    public void setVipMonthCoupon(String vipMonthCoupon) {
        this.vipMonthCoupon = vipMonthCoupon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_card.add_time
     *
     * @return the value of litemall_user_card.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_card.add_time
     *
     * @param addTime the value for litemall_user_card.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_card.update_time
     *
     * @return the value of litemall_user_card.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_card.update_time
     *
     * @param updateTime the value for litemall_user_card.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? Deleted.IS_DELETED.value() : Deleted.NOT_DELETED.value());
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_user_card.deleted
     *
     * @return the value of litemall_user_card.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_user_card.deleted
     *
     * @param deleted the value for litemall_user_card.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", IS_DELETED=").append(IS_DELETED);
        sb.append(", NOT_DELETED=").append(NOT_DELETED);
        sb.append(", id=").append(id);
        sb.append(", cardLevel=").append(cardLevel);
        sb.append(", pointBegin=").append(pointBegin);
        sb.append(", pointEnd=").append(pointEnd);
        sb.append(", multiple=").append(multiple);
        sb.append(", vipDayMultiple=").append(vipDayMultiple);
        sb.append(", vipDay=").append(vipDay);
        sb.append(", vipMonthCoupon=").append(vipMonthCoupon);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LitemallUserCard other = (LitemallUserCard) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCardLevel() == null ? other.getCardLevel() == null : this.getCardLevel().equals(other.getCardLevel()))
            && (this.getPointBegin() == null ? other.getPointBegin() == null : this.getPointBegin().equals(other.getPointBegin()))
            && (this.getPointEnd() == null ? other.getPointEnd() == null : this.getPointEnd().equals(other.getPointEnd()))
            && (this.getMultiple() == null ? other.getMultiple() == null : this.getMultiple().equals(other.getMultiple()))
            && (this.getVipDayMultiple() == null ? other.getVipDayMultiple() == null : this.getVipDayMultiple().equals(other.getVipDayMultiple()))
            && (this.getVipDay() == null ? other.getVipDay() == null : this.getVipDay().equals(other.getVipDay()))
            && (this.getVipMonthCoupon() == null ? other.getVipMonthCoupon() == null : this.getVipMonthCoupon().equals(other.getVipMonthCoupon()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCardLevel() == null) ? 0 : getCardLevel().hashCode());
        result = prime * result + ((getPointBegin() == null) ? 0 : getPointBegin().hashCode());
        result = prime * result + ((getPointEnd() == null) ? 0 : getPointEnd().hashCode());
        result = prime * result + ((getMultiple() == null) ? 0 : getMultiple().hashCode());
        result = prime * result + ((getVipDayMultiple() == null) ? 0 : getVipDayMultiple().hashCode());
        result = prime * result + ((getVipDay() == null) ? 0 : getVipDay().hashCode());
        result = prime * result + ((getVipMonthCoupon() == null) ? 0 : getVipMonthCoupon().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    public enum Deleted {
        NOT_DELETED(new Boolean("0"), "未删除"),
        IS_DELETED(new Boolean("1"), "已删除");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        private final Boolean value;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        private final String name;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        Deleted(Boolean value, String name) {
            this.value = value;
            this.name = name;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        public Boolean getValue() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        public Boolean value() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        public String getName() {
            return this.name;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_user_card
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        cardLevel("card_level", "cardLevel", "INTEGER", false),
        pointBegin("point_begin", "pointBegin", "INTEGER", false),
        pointEnd("point_end", "pointEnd", "INTEGER", false),
        multiple("multiple", "multiple", "INTEGER", false),
        vipDayMultiple("vip_day_multiple", "vipDayMultiple", "INTEGER", false),
        vipDay("vip_day", "vipDay", "VARCHAR", false),
        vipMonthCoupon("vip_month_coupon", "vipMonthCoupon", "VARCHAR", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        deleted("deleted", "deleted", "BIT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_user_card
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}