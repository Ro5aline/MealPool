/**
 * This class is generated by jOOQ
 */
package generated.tables.records;


import generated.tables.Schedule;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class ScheduleRecord extends UpdatableRecordImpl<ScheduleRecord> implements Record6<Integer, Integer, Integer, Timestamp, Boolean, Boolean> {

	private static final long serialVersionUID = -1444617411;

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
	 * Setter for <code>public.schedule.chefid</code>.
	 */
	public void setChefid(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.schedule.chefid</code>.
	 */
	public Integer getChefid() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.schedule.recipeid</code>.
	 */
	public void setRecipeid(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.schedule.recipeid</code>.
	 */
	public Integer getRecipeid() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.schedule.scheduled</code>.
	 */
	public void setScheduled(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.schedule.scheduled</code>.
	 */
	public Timestamp getScheduled() {
		return (Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>public.schedule.pickup</code>.
	 */
	public void setPickup(Boolean value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.schedule.pickup</code>.
	 */
	public Boolean getPickup() {
		return (Boolean) getValue(4);
	}

	/**
	 * Setter for <code>public.schedule.sitdown</code>.
	 */
	public void setSitdown(Boolean value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.schedule.sitdown</code>.
	 */
	public Boolean getSitdown() {
		return (Boolean) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, Integer, Timestamp, Boolean, Boolean> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, Integer, Timestamp, Boolean, Boolean> valuesRow() {
		return (Row6) super.valuesRow();
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
		return Schedule.SCHEDULE.CHEFID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return Schedule.SCHEDULE.RECIPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return Schedule.SCHEDULE.SCHEDULED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field5() {
		return Schedule.SCHEDULE.PICKUP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field6() {
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
		return getChefid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getRecipeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getScheduled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value5() {
		return getPickup();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value6() {
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
		setChefid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScheduleRecord value3(Integer value) {
		setRecipeid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScheduleRecord value4(Timestamp value) {
		setScheduled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScheduleRecord value5(Boolean value) {
		setPickup(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScheduleRecord value6(Boolean value) {
		setSitdown(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScheduleRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, Boolean value5, Boolean value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
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
	public ScheduleRecord(Integer id, Integer chefid, Integer recipeid, Timestamp scheduled, Boolean pickup, Boolean sitdown) {
		super(Schedule.SCHEDULE);

		setValue(0, id);
		setValue(1, chefid);
		setValue(2, recipeid);
		setValue(3, scheduled);
		setValue(4, pickup);
		setValue(5, sitdown);
	}
}
