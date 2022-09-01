package com.google.android.apps.inputmethod.libs.hmm;

import java.io.FileDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DataManagerImpl {
    public final long a;

    public DataManagerImpl(long j) {
        this.a = j;
    }

    private native boolean nativeEnrollBuiltInData(long j, String str, int i, String str2, String str3);

    private native boolean nativeEnrollBuiltInDataScheme(long j, String str, String str2);

    private native boolean nativeEnrollDataFd(long j, String str, int i, FileDescriptor fileDescriptor, int i2, int i3);

    private native boolean nativeEnrollEmptyData(long j, String str, int i);

    private native boolean nativeEnrollEmptyMutableDict(long j, String str, int i, int i2);

    private native int nativeGetTokenCategoryFromDataId(long j, String str);

    private native boolean nativeInstallDataInStorage(long j, byte[] bArr);

    private native boolean nativeWithdrawData(long j, String str);

    public final boolean a(String str, int i, int i2) {
        return nativeEnrollEmptyMutableDict(this.a, str, i, i2);
    }

    public final void b(String str) {
        nativeWithdrawData(this.a, str);
    }

    public native boolean nativeEnrollDataFile(long j, String str, int i, String str2);

    public native boolean nativeEnrollDataScheme(long j, byte[] bArr);

    public native boolean nativeEnrollMutableDictFd(long j, String str, int i, FileDescriptor fileDescriptor, int i2, int i3, int i4);

    public native boolean nativeWithdrawDataScheme(long j, byte[] bArr);
}
