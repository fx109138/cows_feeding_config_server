package com.fx.entity.request;

import com.google.gson.annotations.SerializedName;

public class Fodder {

    public String name;

    public String type;

    @SerializedName("dry_matter")
    public String dryMatter;

    @SerializedName("crude_protein")
    public String crudeProtein;

    public String energy;

    public String calcium;

    public String phosphorus;

    public String sodium;

    public String chlorine;

    public String potassium;

    public String magnesium;

    public String sulphur;

    @SerializedName("crude_fat")
    public String crudeFat;

    public String price;

    public String variable;

    public String dosage;

    @SerializedName("max_dosage")
    public String maxDosage;

    @SerializedName("min_dosage")
    public String minDosage;
}
