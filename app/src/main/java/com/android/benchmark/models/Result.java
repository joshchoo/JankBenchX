package com.android.benchmark.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("test_name")
    @Expose
    private String testName;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("jank_penalty")
    @Expose
    private Integer jankPenalty;
    @SerializedName("consistency_bonus")
    @Expose
    private Integer consistencyBonus;
    @SerializedName("jank_pct")
    @Expose
    private Double jankPct;
    @SerializedName("bad_frame_pct")
    @Expose
    private Double badFramePct;
    @SerializedName("total_frames")
    @Expose
    private Integer totalFrames;
    @SerializedName("ms_avg")
    @Expose
    private Double msAvg;
    @SerializedName("ms_90th_pctl")
    @Expose
    private Double ms90thPctl;
    @SerializedName("ms_95th_pctl")
    @Expose
    private Double ms95thPctl;
    @SerializedName("ms_99th_pctl")
    @Expose
    private Double ms99thPctl;

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getJankPenalty() {
        return jankPenalty;
    }

    public void setJankPenalty(Integer jankPenalty) {
        this.jankPenalty = jankPenalty;
    }

    public Integer getConsistencyBonus() {
        return consistencyBonus;
    }

    public void setConsistencyBonus(Integer consistencyBonus) {
        this.consistencyBonus = consistencyBonus;
    }

    public Double getJankPct() {
        return jankPct;
    }

    public void setJankPct(Double jankPct) {
        this.jankPct = jankPct;
    }

    public Double getBadFramePct() {
        return badFramePct;
    }

    public void setBadFramePct(Double badFramePct) {
        this.badFramePct = badFramePct;
    }

    public Integer getTotalFrames() {
        return totalFrames;
    }

    public void setTotalFrames(Integer totalFrames) {
        this.totalFrames = totalFrames;
    }

    public Double getMsAvg() {
        return msAvg;
    }

    public void setMsAvg(Double msAvg) {
        this.msAvg = msAvg;
    }

    public Double getMs90thPctl() {
        return ms90thPctl;
    }

    public void setMs90thPctl(Double ms90thPctl) {
        this.ms90thPctl = ms90thPctl;
    }

    public Double getMs95thPctl() {
        return ms95thPctl;
    }

    public void setMs95thPctl(Double ms95thPctl) {
        this.ms95thPctl = ms95thPctl;
    }

    public Double getMs99thPctl() {
        return ms99thPctl;
    }

    public void setMs99thPctl(Double ms99thPctl) {
        this.ms99thPctl = ms99thPctl;
    }

}