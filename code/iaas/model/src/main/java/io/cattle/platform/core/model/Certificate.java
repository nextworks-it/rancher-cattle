/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "certificate", schema = "cattle")
public interface Certificate extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.certificate.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.certificate.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.certificate.name</code>.
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>cattle.certificate.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>cattle.certificate.account_id</code>.
	 */
	public void setAccountId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.certificate.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	public java.lang.Long getAccountId();

	/**
	 * Setter for <code>cattle.certificate.kind</code>.
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>cattle.certificate.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>cattle.certificate.uuid</code>.
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>cattle.certificate.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>cattle.certificate.description</code>.
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>cattle.certificate.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>cattle.certificate.state</code>.
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>cattle.certificate.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	/**
	 * Setter for <code>cattle.certificate.created</code>.
	 */
	public void setCreated(java.util.Date value);

	/**
	 * Getter for <code>cattle.certificate.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	public java.util.Date getCreated();

	/**
	 * Setter for <code>cattle.certificate.removed</code>.
	 */
	public void setRemoved(java.util.Date value);

	/**
	 * Getter for <code>cattle.certificate.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	public java.util.Date getRemoved();

	/**
	 * Setter for <code>cattle.certificate.remove_time</code>.
	 */
	public void setRemoveTime(java.util.Date value);

	/**
	 * Getter for <code>cattle.certificate.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	public java.util.Date getRemoveTime();

	/**
	 * Setter for <code>cattle.certificate.data</code>.
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>cattle.certificate.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>cattle.certificate.cert_chain</code>.
	 */
	public void setCertChain(java.lang.String value);

	/**
	 * Getter for <code>cattle.certificate.cert_chain</code>.
	 */
	@javax.persistence.Column(name = "cert_chain", length = 65535)
	public java.lang.String getCertChain();

	/**
	 * Setter for <code>cattle.certificate.cert</code>.
	 */
	public void setCert(java.lang.String value);

	/**
	 * Getter for <code>cattle.certificate.cert</code>.
	 */
	@javax.persistence.Column(name = "cert", length = 65535)
	public java.lang.String getCert();

	/**
	 * Setter for <code>cattle.certificate.key</code>.
	 */
	public void setKey(java.lang.String value);

	/**
	 * Getter for <code>cattle.certificate.key</code>.
	 */
	@javax.persistence.Column(name = "key", length = 65535)
	public java.lang.String getKey();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface Certificate
	 */
	public void from(io.cattle.platform.core.model.Certificate from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface Certificate
	 */
	public <E extends io.cattle.platform.core.model.Certificate> E into(E into);
}