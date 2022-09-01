package com.google.android.apps.inputmethod.libs.hmm;

import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EngineFactory {
    public static final lug a = hin.a;
    private static EngineFactory c;
    public final long b;

    static {
        NativeLibHelper.a("hmm", true);
        if (!jam.b) {
            initJNI();
        }
    }

    private EngineFactory(long j) {
        this.b = j;
    }

    public static EngineFactory a() {
        EngineFactory engineFactory;
        synchronized (EngineFactory.class) {
            if (c == null) {
                long nativeCreateEngineFactory = nativeCreateEngineFactory();
                if (nativeCreateEngineFactory != 0) {
                    c = new EngineFactory(nativeCreateEngineFactory);
                }
            }
            engineFactory = c;
        }
        return engineFactory;
    }

    public static native void deinitJNI();

    public static native int initJNI();

    private static native long nativeCreateEngineFactory();

    private static native void nativeDeleteEngineFactory(long j);

    public native long nativeCreateEngine(long j, String str, String str2);

    public native long nativeCreateMutableDictionaryAccessor(long j, String str, String str2, String str3);

    public native long nativeGetDataManager(long j);

    public native long nativeGetSettingManager(long j);

    public native boolean nativeMigrateUserDictionary(long j, String str, String str2, String str3, String str4);

    public native boolean nativeShouldMigrateUserDictionary(long j, String str, String str2, String str3);
}
