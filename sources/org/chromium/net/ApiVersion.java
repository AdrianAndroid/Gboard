package org.chromium.net;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ApiVersion {
    private static final int API_LEVEL = 14;
    private static final String CRONET_VERSION = "102.0.4973.2";
    private static final String LAST_CHANGE = "58ca422c9a1c60ccf6295dda7a420b7b4afa42f5-refs/branch-heads/4973@{#5}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "102.0.4973.2@".concat("58ca422c");
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 14;
    }
}
