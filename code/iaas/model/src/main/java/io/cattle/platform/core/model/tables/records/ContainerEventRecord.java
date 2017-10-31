/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "container_event", schema = "cattle")
public class ContainerEventRecord extends org.jooq.impl.UpdatableRecordImpl<io.cattle.platform.core.model.tables.records.ContainerEventRecord> implements io.cattle.platform.db.jooq.utils.TableRecordJaxb, org.jooq.Record12<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.util.Date, java.util.Map<String,Object>, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Long>, io.cattle.platform.core.model.ContainerEvent {

	private static final long serialVersionUID = -2087231546;

	/**
	 * Setter for <code>cattle.container_event.id</code>.
	 */
	@Override
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cattle.container_event.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cattle.container_event.account_id</code>.
	 */
	@Override
	public void setAccountId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cattle.container_event.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	@Override
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>cattle.container_event.kind</code>.
	 */
	@Override
	public void setKind(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cattle.container_event.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	@Override
	public java.lang.String getKind() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>cattle.container_event.state</code>.
	 */
	@Override
	public void setState(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cattle.container_event.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cattle.container_event.created</code>.
	 */
	@Override
	public void setCreated(java.util.Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cattle.container_event.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	@Override
	public java.util.Date getCreated() {
		return (java.util.Date) getValue(4);
	}

	/**
	 * Setter for <code>cattle.container_event.data</code>.
	 */
	@Override
	public void setData(java.util.Map<String,Object> value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cattle.container_event.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	@Override
	public java.util.Map<String,Object> getData() {
		return (java.util.Map<String,Object>) getValue(5);
	}

	/**
	 * Setter for <code>cattle.container_event.external_id</code>.
	 */
	@Override
	public void setExternalId(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cattle.container_event.external_id</code>.
	 */
	@javax.persistence.Column(name = "external_id", length = 255)
	@Override
	public java.lang.String getExternalId() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>cattle.container_event.external_status</code>.
	 */
	@Override
	public void setExternalStatus(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cattle.container_event.external_status</code>.
	 */
	@javax.persistence.Column(name = "external_status", length = 255)
	@Override
	public java.lang.String getExternalStatus() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>cattle.container_event.external_from</code>.
	 */
	@Override
	public void setExternalFrom(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cattle.container_event.external_from</code>.
	 */
	@javax.persistence.Column(name = "external_from", length = 255)
	@Override
	public java.lang.String getExternalFrom() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>cattle.container_event.external_timestamp</code>.
	 */
	@Override
	public void setExternalTimestamp(java.lang.Long value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cattle.container_event.external_timestamp</code>.
	 */
	@javax.persistence.Column(name = "external_timestamp", precision = 19)
	@Override
	public java.lang.Long getExternalTimestamp() {
		return (java.lang.Long) getValue(9);
	}

	/**
	 * Setter for <code>cattle.container_event.reported_host_uuid</code>.
	 */
	@Override
	public void setReportedHostUuid(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>cattle.container_event.reported_host_uuid</code>.
	 */
	@javax.persistence.Column(name = "reported_host_uuid", length = 255)
	@Override
	public java.lang.String getReportedHostUuid() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>cattle.container_event.host_id</code>.
	 */
	@Override
	public void setHostId(java.lang.Long value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>cattle.container_event.host_id</code>.
	 */
	@javax.persistence.Column(name = "host_id", precision = 19)
	@Override
	public java.lang.Long getHostId() {
		return (java.lang.Long) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.util.Date, java.util.Map<String,Object>, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Long> fieldsRow() {
		return (org.jooq.Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.util.Date, java.util.Map<String,Object>, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Long> valuesRow() {
		return (org.jooq.Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return io.cattle.platform.core.model.tables.ContainerEventTable.CONTAINER_EVENT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return io.cattle.platform.core.model.tables.ContainerEventTable.CONTAINER_EVENT.ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return io.cattle.platform.core.model.tables.ContainerEventTable.CONTAINER_EVENT.KIND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return io.cattle.platform.core.model.tables.ContainerEventTable.CONTAINER_EVENT.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Date> field5() {
		return io.cattle.platform.core.model.tables.ContainerEventTable.CONTAINER_EVENT.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.Map<String,Object>> field6() {
		return io.cattle.platform.core.model.tables.ContainerEventTable.CONTAINER_EVENT.DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return io.cattle.platform.core.model.tables.ContainerEventTable.CONTAINER_EVENT.EXTERNAL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return io.cattle.platform.core.model.tables.ContainerEventTable.CONTAINER_EVENT.EXTERNAL_STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return io.cattle.platform.core.model.tables.ContainerEventTable.CONTAINER_EVENT.EXTERNAL_FROM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field10() {
		return io.cattle.platform.core.model.tables.ContainerEventTable.CONTAINER_EVENT.EXTERNAL_TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return io.cattle.platform.core.model.tables.ContainerEventTable.CONTAINER_EVENT.REPORTED_HOST_UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field12() {
		return io.cattle.platform.core.model.tables.ContainerEventTable.CONTAINER_EVENT.HOST_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getKind();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Date value5() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.Map<String,Object> value6() {
		return getData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getExternalId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getExternalStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getExternalFrom();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value10() {
		return getExternalTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getReportedHostUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value12() {
		return getHostId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainerEventRecord value1(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainerEventRecord value2(java.lang.Long value) {
		setAccountId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainerEventRecord value3(java.lang.String value) {
		setKind(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainerEventRecord value4(java.lang.String value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainerEventRecord value5(java.util.Date value) {
		setCreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainerEventRecord value6(java.util.Map<String,Object> value) {
		setData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainerEventRecord value7(java.lang.String value) {
		setExternalId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainerEventRecord value8(java.lang.String value) {
		setExternalStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainerEventRecord value9(java.lang.String value) {
		setExternalFrom(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainerEventRecord value10(java.lang.Long value) {
		setExternalTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainerEventRecord value11(java.lang.String value) {
		setReportedHostUuid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainerEventRecord value12(java.lang.Long value) {
		setHostId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ContainerEventRecord values(java.lang.Long value1, java.lang.Long value2, java.lang.String value3, java.lang.String value4, java.util.Date value5, java.util.Map<String,Object> value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.Long value10, java.lang.String value11, java.lang.Long value12) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(io.cattle.platform.core.model.ContainerEvent from) {
		setId(from.getId());
		setAccountId(from.getAccountId());
		setKind(from.getKind());
		setState(from.getState());
		setCreated(from.getCreated());
		setData(from.getData());
		setExternalId(from.getExternalId());
		setExternalStatus(from.getExternalStatus());
		setExternalFrom(from.getExternalFrom());
		setExternalTimestamp(from.getExternalTimestamp());
		setReportedHostUuid(from.getReportedHostUuid());
		setHostId(from.getHostId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends io.cattle.platform.core.model.ContainerEvent> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ContainerEventRecord
	 */
	public ContainerEventRecord() {
		super(io.cattle.platform.core.model.tables.ContainerEventTable.CONTAINER_EVENT);
	}

	/**
	 * Create a detached, initialised ContainerEventRecord
	 */
	public ContainerEventRecord(java.lang.Long id, java.lang.Long accountId, java.lang.String kind, java.lang.String state, java.util.Date created, java.util.Map<String,Object> data, java.lang.String externalId, java.lang.String externalStatus, java.lang.String externalFrom, java.lang.Long externalTimestamp, java.lang.String reportedHostUuid, java.lang.Long hostId) {
		super(io.cattle.platform.core.model.tables.ContainerEventTable.CONTAINER_EVENT);

		setValue(0, id);
		setValue(1, accountId);
		setValue(2, kind);
		setValue(3, state);
		setValue(4, created);
		setValue(5, data);
		setValue(6, externalId);
		setValue(7, externalStatus);
		setValue(8, externalFrom);
		setValue(9, externalTimestamp);
		setValue(10, reportedHostUuid);
		setValue(11, hostId);
	}
}