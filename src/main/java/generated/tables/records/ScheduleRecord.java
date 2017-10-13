/**
 * This class is generated by jOOQ
 */
package generated.tables.records;


import generated.tables.Schedule;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScheduleRecord extends UpdatableRecordImpl<ScheduleRecord> implements Record5<Integer, Integer, Timestamp, Boolean, Boolean> {

	private static final long serialVersionUID = 1281518485;

	/**
	 * Setter for <code>public.schedule.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.schedule.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.schedule.recipeid</code>.
	 */
	public void setRecipeid(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.schedule.recipeid</code>.
	 */
	public Integer getRecipeid() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.schedule.scheduled</code>.
	 */
	public void setScheduled(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.schedule.scheduled</code>.
	 */
	public Timestamp getScheduled() {
		return (Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>public.schedule.pickup</code>.
	 */
	public void setPickup(Boolean value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.schedule.pickup</code>.
	 */
	public Boolean getPickup() {
		return (Boolean) getValue(3);
	}

	/**
	 * Setter for <code>public.schedule.sitdown</code>.
	 */
	public void setSitdown(Boolean value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.schedule.sitdown</code>.
	 */
	public Boolean getSitdown() {
		return (Boolean) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, Timestamp, Boolean, Boolean> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, Timestamp, Boolean, Boolean> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Schedule.SCHEDULE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Schedule.SCHEDULE.RECIPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return Schedule.SCHEDULE.SCHEDULED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field4() {
		return Schedule.SCHEDULE.PICKUP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field5() {
		return Schedule.SCHEDULE.SITDOWN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getRecipeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value3() {
		return getScheduled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value4() {
		return getPickup();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value5() {
		return getSitdown();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScheduleRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScheduleRecord value2(Integer value) {
		setRecipeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScheduleRecord value3(Timestamp value) {
		setScheduled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScheduleRecord value4(Boolean value) {
		setPickup(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScheduleRecord value5(Boolean value) {
		setSitdown(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScheduleRecord values(Integer value1, Integer value2, Timestamp value3, Boolean value4, Boolean value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ScheduleRecord
	 */
	public ScheduleRecord() {
		super(Schedule.SCHEDULE);
	}

	/**
	 * Create a detached, initialised ScheduleRecord
	 */
	public ScheduleRecord(Integer id, Integer recipeid, Timestamp scheduled, Boolean pickup, Boolean sitdown) {
		super(Schedule.SCHEDULE);

		setValue(0, id);
		setValue(1, recipeid);
		setValue(2, scheduled);
		setValue(3, pickup);
		setValue(4, sitdown);
	}
}
