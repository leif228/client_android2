package com.hangyi.zd.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017-02-21.
 */

public class ShipControlData{
        private Integer nid = 0;
        private String shipId="";
        private String shipName="";
        private String shipPasswd="";
        private String imo = ""; // IMO 识别号
        private String shipCreateTime = ""; // 建造时间
        private String shiptype= ""; // 船舶类型
        private String contact=""; // 船舶联系人
        private String tel= ""; // 联系人电话
        private String shipOwner= ""; // 船舶所有人
        private String totalTons= ""; // 总吨
        private String deadweightTons= ""; // 净吨
        private String totalLength = ""; // 总长
        private String length = ""; // 船长
        private String waterlineLength = ""; // 满载水线长
        private String breadth = ""; // 船宽
        private String maxBreadth = ""; // 最大船宽
        private String draught = ""; // 型深
        private String maxHeight = ""; // 最大船高
        private String lightDraught = ""; // 空载吃水
        private String loadDraught = ""; // 满载吃水
        private String emptyDrainage = ""; // 空载排水
        private String fullDrainage = ""; // 满载排水
        private String aTons = ""; // A级载重
        private String bTons = ""; // B级载重
        private String shipMemo;
        private String createAuther;
        private String createTime = "";
        private String modifyTime = "";

    public ShipControlData() {
    }

    @SuppressWarnings("unchecked")
    public ShipControlData(Map<String, Object> params) {
        super();
        if (params != null && !params.isEmpty()) {
            this.shipId = (String) params.get("shipId");
            this.shipName = (String) params.get("shipName");
            this.contact = (String) params.get("contact");
            this.shipOwner = (String) params.get("shipOwner");
            this.shiptype = (String) params.get("shiptype");

            try {
                this.aTons = String.valueOf(params.get("aTons"));
                this.bTons = String.valueOf(params.get("bTons"));

                this.length = String.valueOf(params.get("length"));
                this.breadth = String.valueOf(params.get("breadth"));

                this.lightDraught = String.valueOf(params.get("lightDraught"));
                this.loadDraught = String.valueOf(params.get("loadDraught"));
            }catch (Exception e) {}
        }
    }

        public Integer getNid() {
            return nid;
        }

        public void setNid(Integer nid) {
            this.nid = nid;
        }

        public String getShipId() {
            return shipId;
        }

        public void setShipId(String shipId) {
            this.shipId = shipId;
        }

        public String getShipName() {
            return shipName;
        }

        public void setShipName(String shipName) {
            this.shipName = shipName;
        }

        public String getShipPasswd() {
            return shipPasswd;
        }

        public void setShipPasswd(String shipPasswd) {
            this.shipPasswd = shipPasswd;
        }

        public String getImo() {
            return imo;
        }

        public void setImo(String imo) {
            this.imo = imo;
        }

        public String getShipCreateTime() {
            return shipCreateTime;
        }

        public void setShipCreateTime(String shipCreateTime) {
            this.shipCreateTime = shipCreateTime;
        }

        public String getShiptype() {
            return shiptype;
        }

        public void setShiptype(String shiptype) {
            this.shiptype = shiptype;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getShipOwner() {
            return shipOwner;
        }

        public void setShipOwner(String shipOwner) {
            this.shipOwner = shipOwner;
        }

        public String getTotalTons() {
            return totalTons;
        }

        public void setTotalTons(String totalTons) {
            this.totalTons = totalTons;
        }

        public String getDeadweightTons() {
            return deadweightTons;
        }

        public void setDeadweightTons(String deadweightTons) {
            this.deadweightTons = deadweightTons;
        }

        public String getTotalLength() {
            return totalLength;
        }

        public void setTotalLength(String totalLength) {
            this.totalLength = totalLength;
        }

        public String getLength() {
            return length;
        }

        public void setLength(String length) {
            this.length = length;
        }

        public String getWaterlineLength() {
            return waterlineLength;
        }

        public void setWaterlineLength(String waterlineLength) {
            this.waterlineLength = waterlineLength;
        }

        public String getBreadth() {
            return breadth;
        }

        public void setBreadth(String breadth) {
            this.breadth = breadth;
        }

        public String getMaxBreadth() {
            return maxBreadth;
        }

        public void setMaxBreadth(String maxBreadth) {
            this.maxBreadth = maxBreadth;
        }

        public String getDraught() {
            return draught;
        }

        public void setDraught(String draught) {
            this.draught = draught;
        }

        public String getMaxHeight() {
            return maxHeight;
        }

        public void setMaxHeight(String maxHeight) {
            this.maxHeight = maxHeight;
        }

        public String getLightDraught() {
            return lightDraught;
        }

        public void setLightDraught(String lightDraught) {
            this.lightDraught = lightDraught;
        }

        public String getLoadDraught() {
            return loadDraught;
        }

        public void setLoadDraught(String loadDraught) {
            this.loadDraught = loadDraught;
        }

        public String getEmptyDrainage() {
            return emptyDrainage;
        }

        public void setEmptyDrainage(String emptyDrainage) {
            this.emptyDrainage = emptyDrainage;
        }

        public String getFullDrainage() {
            return fullDrainage;
        }

        public void setFullDrainage(String fullDrainage) {
            this.fullDrainage = fullDrainage;
        }

        public String getaTons() {
            return aTons;
        }

        public void setaTons(String aTons) {
            this.aTons = aTons;
        }

        public String getbTons() {
            return bTons;
        }

        public void setbTons(String bTons) {
            this.bTons = bTons;
        }

        public String getShipMemo() {
            return shipMemo;
        }

        public void setShipMemo(String shipMemo) {
            this.shipMemo = shipMemo;
        }

        public String getCreateAuther() {
            return createAuther;
        }

        public void setCreateAuther(String createAuther) {
            this.createAuther = createAuther;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
        }


}
