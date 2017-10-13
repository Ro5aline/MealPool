package api;

import com.fasterxml.jackson.annotation.JsonProperty;
import generated.tables.records.RecipeRecord;
import generated.tables.records.ScheduleRecord;
import generated.tables.records.AccountRecord;

public class ScheduleResource {

    @JsonProperty
    public RecipeResource recipe;

    @JsonProperty
    public long scheduled;

    @JsonProperty
    public boolean pickUp;

    @JsonProperty
    public boolean sitDown;

    public ScheduleResource(AccountRecord chef, RecipeRecord recipe, ScheduleRecord schedule) {
        this.recipe = new RecipeResource(chef, recipe);
        this.scheduled = schedule.getScheduled().getTime();
        this.pickUp = schedule.getPickup();
        this.sitDown = schedule.getSitdown();
    }
}
