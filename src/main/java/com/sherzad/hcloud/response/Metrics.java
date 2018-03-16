package com.sherzad.hcloud.response;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Metrics {

    private ZonedDateTime start;
    private ZonedDateTime end;
    private Long step;
    private TimeSeries timeSeries;

    @Getter
    @Setter
    public static class TimeSeries {

        private TimeSeriesType cpu;
        private Map<Long, TimeSeriesTypeDisk> disk; // The key denotes the ordinal number of the disk
        private Map<Long, TimeSeriesTypeNetwork> network; // The key denotes the ordinal number of the network interface

        @Getter
        @Setter
        public static class TimeSeriesType {

            private List<TimeSeriesTuple> values;

            @Getter
            @Setter
            public static class TimeSeriesTuple {

                private Double value;
                private String key;
            }
        }

        @Getter
        @Setter
        public static class TimeSeriesTypeDisk {

            private TimeSeriesType iopsRead;
            private TimeSeriesType iopsWrite;
            private TimeSeriesType bandwidthRead;
            private TimeSeriesType bandwidthWrite;
        }

        @Getter
        @Setter
        public static class TimeSeriesTypeNetwork {

            private TimeSeriesType ppsIn;
            private TimeSeriesType ppsOut;
            private TimeSeriesType bandwidthIn;
            private TimeSeriesType bandwidthOut;
        }
    }
}
