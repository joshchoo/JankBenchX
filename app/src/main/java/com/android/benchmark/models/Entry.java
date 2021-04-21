package com.android.benchmark.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import androidx.annotation.Keep;

@Keep
public class Entry {

    @SerializedName("run_id")
    @Expose
    private Integer runId;
    @SerializedName("benchmark_version")
    @Expose
    private String benchmarkVersion;
    @SerializedName("device_name")
    @Expose
    private String device_name;
    @SerializedName("device_model")
    @Expose
    private String deviceModel;
    @SerializedName("device_product")
    @Expose
    private String deviceProduct;
    @SerializedName("device_board")
    @Expose
    private String deviceBoard;
    @SerializedName("device_manufacturer")
    @Expose
    private String deviceManufacturer;
    @SerializedName("device_brand")
    @Expose
    private String deviceBrand;
    @SerializedName("device_hardware")
    @Expose
    private String deviceHardware;
    @SerializedName("android_version")
    @Expose
    private String androidVersion;
    @SerializedName("build_type")
    @Expose
    private String buildType;
    @SerializedName("build_time")
    @Expose
    private String buildTime;
    @SerializedName("fingerprint")
    @Expose
    private String fingerprint;
    @SerializedName("kernel_version")
    @Expose
    private String kernelVersion;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    @SerializedName("refresh_rate")
    @Expose
    private Integer refreshRate;

    public Integer getRunId() {
        return runId;
    }

    public void setRunId(Integer runId) {
        this.runId = runId;
    }

    public String getBenchmarkVersion() {
        return benchmarkVersion;
    }

    public void setBenchmarkVersion(String benchmarkVersion) {
        this.benchmarkVersion = benchmarkVersion;
    }

    public String getDeviceName() {
        return device_name;
    }

    public void setDeviceName(String device_name) {
        this.device_name = device_name;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceProduct() {
        return deviceProduct;
    }

    public void setDeviceProduct(String deviceProduct) {
        this.deviceProduct = deviceProduct;
    }

    public String getDeviceBoard() {
        return deviceBoard;
    }

    public void setDeviceBoard(String deviceBoard) {
        this.deviceBoard = deviceBoard;
    }

    public String getDeviceManufacturer() {
        return deviceManufacturer;
    }

    public void setDeviceManufacturer(String deviceManufacturer) {
        this.deviceManufacturer = deviceManufacturer;
    }

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public String getDeviceHardware() {
        return deviceHardware;
    }

    public void setDeviceHardware(String deviceHardware) {
        this.deviceHardware = deviceHardware;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }
}