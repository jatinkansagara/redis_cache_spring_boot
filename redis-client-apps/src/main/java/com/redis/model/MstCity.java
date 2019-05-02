/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.model;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "MST_CITY")
@NamedQueries({
	@NamedQuery(name="MstCity.findByStoreCode",query="SELECT m FROM MstCity m WHERE m.cityId=:cityId")
})
public class MstCity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "CITY_ID")
    private Long cityId;
    @Basic(optional = false)
    @Column(name = "CITY_NAME")
    private String cityName;
	public Long getCityId() {
		return cityId;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
}
