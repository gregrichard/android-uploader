// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: /Users/klee/Projects/Nightscout/android-uploader/core/src/main/java/com/nightscout/core/protobuf/G4Download.proto
package com.nightscout.core.model;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.UINT32;
import static com.squareup.wire.Message.Datatype.UINT64;
import static com.squareup.wire.Message.Label.REQUIRED;

public final class CookieMonsterG4Sensor extends Message {

    public static final Long DEFAULT_FILTERED = 0L;
    public static final Long DEFAULT_UNFILTERED = 0L;
    public static final Integer DEFAULT_RSSI = 0;
    public static final Long DEFAULT_SYS_TIMESTAMP_SEC = 0L;
    public static final Long DEFAULT_DISP_TIMESTAMP_SEC = 0L;

    @ProtoField(tag = 1, type = UINT64, label = REQUIRED)
    public final Long filtered;

    @ProtoField(tag = 2, type = UINT64)
    public final Long unfiltered;

    @ProtoField(tag = 3, type = UINT32)
    public final Integer rssi;

    @ProtoField(tag = 4, type = UINT64)
    public final Long sys_timestamp_sec;

    /**
     * system timestamp of the record
     */
    @ProtoField(tag = 5, type = UINT64)
    public final Long disp_timestamp_sec;

    public CookieMonsterG4Sensor(Long filtered, Long unfiltered, Integer rssi, Long sys_timestamp_sec, Long disp_timestamp_sec) {
        this.filtered = filtered;
        this.unfiltered = unfiltered;
        this.rssi = rssi;
        this.sys_timestamp_sec = sys_timestamp_sec;
        this.disp_timestamp_sec = disp_timestamp_sec;
    }

    private CookieMonsterG4Sensor(Builder builder) {
        this(builder.filtered, builder.unfiltered, builder.rssi, builder.sys_timestamp_sec, builder.disp_timestamp_sec);
        setBuilder(builder);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof CookieMonsterG4Sensor)) return false;
        CookieMonsterG4Sensor o = (CookieMonsterG4Sensor) other;
        return equals(filtered, o.filtered)
                && equals(unfiltered, o.unfiltered)
                && equals(rssi, o.rssi)
                && equals(sys_timestamp_sec, o.sys_timestamp_sec)
                && equals(disp_timestamp_sec, o.disp_timestamp_sec);
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = filtered != null ? filtered.hashCode() : 0;
            result = result * 37 + (unfiltered != null ? unfiltered.hashCode() : 0);
            result = result * 37 + (rssi != null ? rssi.hashCode() : 0);
            result = result * 37 + (sys_timestamp_sec != null ? sys_timestamp_sec.hashCode() : 0);
            result = result * 37 + (disp_timestamp_sec != null ? disp_timestamp_sec.hashCode() : 0);
            hashCode = result;
        }
        return result;
    }

    public static final class Builder extends Message.Builder<CookieMonsterG4Sensor> {

        public Long filtered;
        public Long unfiltered;
        public Integer rssi;
        public Long sys_timestamp_sec;
        public Long disp_timestamp_sec;

        public Builder() {
        }

        public Builder(CookieMonsterG4Sensor message) {
            super(message);
            if (message == null) return;
            this.filtered = message.filtered;
            this.unfiltered = message.unfiltered;
            this.rssi = message.rssi;
            this.sys_timestamp_sec = message.sys_timestamp_sec;
            this.disp_timestamp_sec = message.disp_timestamp_sec;
        }

        public Builder filtered(Long filtered) {
            this.filtered = filtered;
            return this;
        }

        public Builder unfiltered(Long unfiltered) {
            this.unfiltered = unfiltered;
            return this;
        }

        public Builder rssi(Integer rssi) {
            this.rssi = rssi;
            return this;
        }

        public Builder sys_timestamp_sec(Long sys_timestamp_sec) {
            this.sys_timestamp_sec = sys_timestamp_sec;
            return this;
        }

        /**
         * system timestamp of the record
         */
        public Builder disp_timestamp_sec(Long disp_timestamp_sec) {
            this.disp_timestamp_sec = disp_timestamp_sec;
            return this;
        }

        @Override
        public CookieMonsterG4Sensor build() {
            checkRequiredFields();
            return new CookieMonsterG4Sensor(this);
        }
    }
}
