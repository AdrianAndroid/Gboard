package com.google.android.keyboard.client.delight5;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class NativeProfiler {
    private static final lug logger = lug.i("Delight5");

    private NativeProfiler() {
    }

    public static void initializeProfilingSignals(Context context) {
        try {
            JniUtil.loadLibrary(cbd.c.b(context).getAbsolutePath());
            initializeProfilingSignalsNative();
        } catch (NoSuchMethodError e) {
            ((luc) ((luc) logger.a(hip.a).i(e)).k("com/google/android/keyboard/client/delight5/NativeProfiler", "initializeProfilingSignals", 37, "NativeProfiler.java")).t("Failed to initialize profiling signals.");
        }
    }

    private static native void initializeProfilingSignalsNative();
}
