package com.android.benchmark.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import androidx.annotation.Keep;

@Keep
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
    @SerializedName("ms_10th_pctl")
    @Expose
    private Double ms10thPctl;
    @SerializedName("ms_20th_pctl")
    @Expose
    private Double ms20thPctl;
    @SerializedName("ms_30th_pctl")
    @Expose
    private Double ms30thPctl;
    @SerializedName("ms_40th_pctl")
    @Expose
    private Double ms40thPctl;
    @SerializedName("ms_50th_pctl")
    @Expose
    private Double ms50thPctl;
    @SerializedName("ms_60th_pctl")
    @Expose
    private Double ms60thPctl;
    @SerializedName("ms_70th_pctl")
    @Expose
    private Double ms70thPctl;
    @SerializedName("ms_80th_pctl")
    @Expose
    private Double ms80thPctl;
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

    public Double getMs10thPctl() {
        return ms10thPctl;
    }

    public void setMs10thPctl(Double ms10thPctl) {
        this.ms10thPctl = ms10thPctl;
    }

    public Double getMs20thPctl() {
        return ms20thPctl;
    }

    public void setMs20thPctl(Double ms20thPctl) {
        this.ms20thPctl = ms20thPctl;
    }

    public Double getMs30thPctl() {
        return ms30thPctl;
    }

    public void setMs30thPctl(Double ms30thPctl) {
        this.ms30thPctl = ms30thPctl;
    }

    public Double getMs40thPctl() {
        return ms40thPctl;
    }

    public void setMs40thPctl(Double ms40thPctl) {
        this.ms40thPctl = ms40thPctl;
    }

    public Double getMs50thPctl() {
        return ms50thPctl;
    }

    public void setMs50thPctl(Double ms50thPctl) {
        this.ms50thPctl = ms50thPctl;
    }

    public Double getMs60thPctl() {
        return ms60thPctl;
    }

    public void setMs60thPctl(Double ms60thPctl) {
        this.ms60thPctl = ms60thPctl;
    }

    public Double getMs70thPctl() {
        return ms70thPctl;
    }

    public void setMs70thPctl(Double ms70thPctl) {
        this.ms70thPctl = ms70thPctl;
    }

    public Double getMs80thPctl() {
        return ms80thPctl;
    }

    public void setMs80thPctl(Double ms80thPctl) {
        this.ms80thPctl = ms80thPctl;
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