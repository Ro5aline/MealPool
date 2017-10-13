/**
 * This class is generated by jOOQ
 */
package generated;


import generated.tables.Comment;
import generated.tables.Goal;
import generated.tables.Keyword;
import generated.tables.Recipe;
import generated.tables.RecipeKeyword;
import generated.tables.Schedule;
import generated.tables.User;
import generated.tables.UserKeyword;
import generated.tables.UserSchedule;
import generated.tables.records.CommentRecord;
import generated.tables.records.GoalRecord;
import generated.tables.records.KeywordRecord;
import generated.tables.records.RecipeKeywordRecord;
import generated.tables.records.RecipeRecord;
import generated.tables.records.ScheduleRecord;
import generated.tables.records.UserKeywordRecord;
import generated.tables.records.UserRecord;
import generated.tables.records.UserScheduleRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<UserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;
	public static final Identity<GoalRecord, Integer> IDENTITY_GOAL = Identities0.IDENTITY_GOAL;
	public static final Identity<KeywordRecord, Integer> IDENTITY_KEYWORD = Identities0.IDENTITY_KEYWORD;
	public static final Identity<RecipeRecord, Integer> IDENTITY_RECIPE = Identities0.IDENTITY_RECIPE;
	public static final Identity<CommentRecord, Integer> IDENTITY_COMMENT = Identities0.IDENTITY_COMMENT;
	public static final Identity<ScheduleRecord, Integer> IDENTITY_SCHEDULE = Identities0.IDENTITY_SCHEDULE;
	public static final Identity<UserScheduleRecord, Integer> IDENTITY_USER_SCHEDULE = Identities0.IDENTITY_USER_SCHEDULE;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<UserRecord> CONSTRAINT_27E = UniqueKeys0.CONSTRAINT_27E;
	public static final UniqueKey<UserRecord> CONSTRAINT_2 = UniqueKeys0.CONSTRAINT_2;
	public static final UniqueKey<UserRecord> CONSTRAINT_27 = UniqueKeys0.CONSTRAINT_27;
	public static final UniqueKey<GoalRecord> CONSTRAINT_217 = UniqueKeys0.CONSTRAINT_217;
	public static final UniqueKey<KeywordRecord> CONSTRAINT_FA = UniqueKeys0.CONSTRAINT_FA;
	public static final UniqueKey<KeywordRecord> CONSTRAINT_F = UniqueKeys0.CONSTRAINT_F;
	public static final UniqueKey<RecipeRecord> CONSTRAINT_8F = UniqueKeys0.CONSTRAINT_8F;
	public static final UniqueKey<CommentRecord> CONSTRAINT_63 = UniqueKeys0.CONSTRAINT_63;
	public static final UniqueKey<ScheduleRecord> CONSTRAINT_50 = UniqueKeys0.CONSTRAINT_50;
	public static final UniqueKey<UserScheduleRecord> CONSTRAINT_1B = UniqueKeys0.CONSTRAINT_1B;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<GoalRecord, UserRecord> CONSTRAINT_21 = ForeignKeys0.CONSTRAINT_21;
	public static final ForeignKey<RecipeRecord, UserRecord> CONSTRAINT_8 = ForeignKeys0.CONSTRAINT_8;
	public static final ForeignKey<CommentRecord, RecipeRecord> CONSTRAINT_6 = ForeignKeys0.CONSTRAINT_6;
	public static final ForeignKey<ScheduleRecord, RecipeRecord> CONSTRAINT_5 = ForeignKeys0.CONSTRAINT_5;
	public static final ForeignKey<UserScheduleRecord, ScheduleRecord> CONSTRAINT_1 = ForeignKeys0.CONSTRAINT_1;
	public static final ForeignKey<UserKeywordRecord, UserRecord> CONSTRAINT_B = ForeignKeys0.CONSTRAINT_B;
	public static final ForeignKey<UserKeywordRecord, KeywordRecord> CONSTRAINT_B0 = ForeignKeys0.CONSTRAINT_B0;
	public static final ForeignKey<RecipeKeywordRecord, RecipeRecord> CONSTRAINT_E = ForeignKeys0.CONSTRAINT_E;
	public static final ForeignKey<RecipeKeywordRecord, KeywordRecord> CONSTRAINT_EF = ForeignKeys0.CONSTRAINT_EF;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<UserRecord, Integer> IDENTITY_USER = createIdentity(User.USER, User.USER.ID);
		public static Identity<GoalRecord, Integer> IDENTITY_GOAL = createIdentity(Goal.GOAL, Goal.GOAL.ID);
		public static Identity<KeywordRecord, Integer> IDENTITY_KEYWORD = createIdentity(Keyword.KEYWORD, Keyword.KEYWORD.ID);
		public static Identity<RecipeRecord, Integer> IDENTITY_RECIPE = createIdentity(Recipe.RECIPE, Recipe.RECIPE.ID);
		public static Identity<CommentRecord, Integer> IDENTITY_COMMENT = createIdentity(Comment.COMMENT, Comment.COMMENT.ID);
		public static Identity<ScheduleRecord, Integer> IDENTITY_SCHEDULE = createIdentity(Schedule.SCHEDULE, Schedule.SCHEDULE.ID);
		public static Identity<UserScheduleRecord, Integer> IDENTITY_USER_SCHEDULE = createIdentity(UserSchedule.USER_SCHEDULE, UserSchedule.USER_SCHEDULE.ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<UserRecord> CONSTRAINT_27E = createUniqueKey(User.USER, User.USER.ID);
		public static final UniqueKey<UserRecord> CONSTRAINT_2 = createUniqueKey(User.USER, User.USER.EMAIL);
		public static final UniqueKey<UserRecord> CONSTRAINT_27 = createUniqueKey(User.USER, User.USER.DISPLAYNAME);
		public static final UniqueKey<GoalRecord> CONSTRAINT_217 = createUniqueKey(Goal.GOAL, Goal.GOAL.ID);
		public static final UniqueKey<KeywordRecord> CONSTRAINT_FA = createUniqueKey(Keyword.KEYWORD, Keyword.KEYWORD.ID);
		public static final UniqueKey<KeywordRecord> CONSTRAINT_F = createUniqueKey(Keyword.KEYWORD, Keyword.KEYWORD.NAME);
		public static final UniqueKey<RecipeRecord> CONSTRAINT_8F = createUniqueKey(Recipe.RECIPE, Recipe.RECIPE.ID);
		public static final UniqueKey<CommentRecord> CONSTRAINT_63 = createUniqueKey(Comment.COMMENT, Comment.COMMENT.ID);
		public static final UniqueKey<ScheduleRecord> CONSTRAINT_50 = createUniqueKey(Schedule.SCHEDULE, Schedule.SCHEDULE.ID);
		public static final UniqueKey<UserScheduleRecord> CONSTRAINT_1B = createUniqueKey(UserSchedule.USER_SCHEDULE, UserSchedule.USER_SCHEDULE.ID);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<GoalRecord, UserRecord> CONSTRAINT_21 = createForeignKey(generated.Keys.CONSTRAINT_27E, Goal.GOAL, Goal.GOAL.USERID);
		public static final ForeignKey<RecipeRecord, UserRecord> CONSTRAINT_8 = createForeignKey(generated.Keys.CONSTRAINT_27E, Recipe.RECIPE, Recipe.RECIPE.CHEFID);
		public static final ForeignKey<CommentRecord, RecipeRecord> CONSTRAINT_6 = createForeignKey(generated.Keys.CONSTRAINT_8F, Comment.COMMENT, Comment.COMMENT.RECIPEID);
		public static final ForeignKey<ScheduleRecord, RecipeRecord> CONSTRAINT_5 = createForeignKey(generated.Keys.CONSTRAINT_8F, Schedule.SCHEDULE, Schedule.SCHEDULE.RECIPEID);
		public static final ForeignKey<UserScheduleRecord, ScheduleRecord> CONSTRAINT_1 = createForeignKey(generated.Keys.CONSTRAINT_50, UserSchedule.USER_SCHEDULE, UserSchedule.USER_SCHEDULE.SCHEDULEID);
		public static final ForeignKey<UserKeywordRecord, UserRecord> CONSTRAINT_B = createForeignKey(generated.Keys.CONSTRAINT_27E, UserKeyword.USER_KEYWORD, UserKeyword.USER_KEYWORD.USERID);
		public static final ForeignKey<UserKeywordRecord, KeywordRecord> CONSTRAINT_B0 = createForeignKey(generated.Keys.CONSTRAINT_FA, UserKeyword.USER_KEYWORD, UserKeyword.USER_KEYWORD.KEYWORDID);
		public static final ForeignKey<RecipeKeywordRecord, RecipeRecord> CONSTRAINT_E = createForeignKey(generated.Keys.CONSTRAINT_8F, RecipeKeyword.RECIPE_KEYWORD, RecipeKeyword.RECIPE_KEYWORD.RECIPEID);
		public static final ForeignKey<RecipeKeywordRecord, KeywordRecord> CONSTRAINT_EF = createForeignKey(generated.Keys.CONSTRAINT_FA, RecipeKeyword.RECIPE_KEYWORD, RecipeKeyword.RECIPE_KEYWORD.KEYWORDID);
	}
}
