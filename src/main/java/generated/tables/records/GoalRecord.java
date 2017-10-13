/**
 * This class is generated by jOOQ
 */
package generated.tables.records;


import generated.tables.Goal;

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
public class GoalRecord extends UpdatableRecordImpl<GoalRecord> implements Record6<Integer, Integer, Integer, Integer, Integer, Integer> {

	private static final long serialVersionUID = -755283468;

	/**
	 * Setter for <code>public.goal.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.goal.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.goal.userid</code>.
	 */
	public void setUserid(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.goal.userid</code>.
	 */
	public Integer getUserid() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.goal.eatinggoal</code>.
	 */
	public void setEatinggoal(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.goal.eatinggoal</code>.
	 */
	public Integer getEatinggoal() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.goal.eatingcount</code>.
	 */
	public void setEatingcount(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.goal.eatingcount</code>.
	 */
	public Integer getEatingcount() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.goal.cookinggoal</code>.
	 */
	public void setCookinggoal(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.goal.cookinggoal</code>.
	 */
	public Integer getCookinggoal() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>public.goal.cookingcount</code>.
	 */
	public void setCookingcount(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.goal.cookingcount</code>.
	 */
	public Integer getCookingcount() {
		return (Integer) getValue(5);
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
	public Row6<Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, Integer, Integer, Integer, Integer> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Goal.GOAL.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Goal.GOAL.USERID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return Goal.GOAL.EATINGGOAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Goal.GOAL.EATINGCOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return Goal.GOAL.COOKINGGOAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return Goal.GOAL.COOKINGCOUNT;
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
		return getUserid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getEatinggoal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getEatingcount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getCookinggoal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getCookingcount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GoalRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GoalRecord value2(Integer value) {
		setUserid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GoalRecord value3(Integer value) {
		setEatinggoal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GoalRecord value4(Integer value) {
		setEatingcount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GoalRecord value5(Integer value) {
		setCookinggoal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GoalRecord value6(Integer value) {
		setCookingcount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GoalRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6) {
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
	 * Create a detached GoalRecord
	 */
	public GoalRecord() {
		super(Goal.GOAL);
	}

	/**
	 * Create a detached, initialised GoalRecord
	 */
	public GoalRecord(Integer id, Integer userid, Integer eatinggoal, Integer eatingcount, Integer cookinggoal, Integer cookingcount) {
		super(Goal.GOAL);

		setValue(0, id);
		setValue(1, userid);
		setValue(2, eatinggoal);
		setValue(3, eatingcount);
		setValue(4, cookinggoal);
		setValue(5, cookingcount);
	}
}
