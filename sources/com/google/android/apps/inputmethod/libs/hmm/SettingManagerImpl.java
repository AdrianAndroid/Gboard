package com.google.android.apps.inputmethod.libs.hmm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SettingManagerImpl {
    public final long a;

    public SettingManagerImpl(long j) {
        this.a = j;
    }

    private native boolean nativeEnrollSettingScheme(long j, String str, String str2, byte[] bArr);

    private native byte[] nativeLoadBuiltInSettingScheme(long j, String str, String str2);

    public final boolean a(String str, byte[] bArr) {
        return nativeEnrollSettingScheme(this.a, str, "", bArr);
    }
}
