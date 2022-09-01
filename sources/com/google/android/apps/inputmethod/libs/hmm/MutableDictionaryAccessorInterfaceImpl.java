package com.google.android.apps.inputmethod.libs.hmm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MutableDictionaryAccessorInterfaceImpl implements AutoCloseable {
    public final long a;

    public MutableDictionaryAccessorInterfaceImpl(long j) {
        this.a = j;
    }

    private native boolean nativeAddCount(long j, String[] strArr, String str, int i);

    private native boolean nativeAddCount(long j, String[] strArr, int[] iArr, String str, int i, boolean z);

    private native boolean nativeClear(long j);

    private native void nativeClose(long j);

    private native boolean nativeDecreaseCount(long j, String[] strArr, String str, int i);

    private native boolean nativeDecreaseCount(long j, String[] strArr, int[] iArr, String str, int i);

    private native MutableDictionaryAccessorInterface$Entry[] nativeExportAllEntries(long j);

    private native MutableDictionaryAccessorInterface$Entry[] nativeExportAllModifiedEntries(long j);

    private native int nativeGetDictionaryCount(long j);

    private native long nativeGetLastSyncTime(long j);

    private native boolean nativeInsertOrUpdate(long j, String[] strArr, String str, int i, boolean z);

    private native boolean nativeMarkAsUnmodified(long j, String[] strArr, String str);

    private native boolean nativeMarkAsUnmodified(long j, String[] strArr, int[] iArr, String str);

    private native void nativeRefreshData(long j);

    private native boolean nativeRemoveByTokenAndValue(long j, String[] strArr, String str);

    private native boolean nativeRemoveByTokenAndValue(long j, String[] strArr, int[] iArr, String str);

    private native boolean nativeRemoveByValue(long j, String str);

    private native void nativeSetLastSyncTime(long j, long j2);

    public final void a() {
        nativeRefreshData(this.a);
    }

    public final boolean b(String str) {
        return nativeRemoveByValue(this.a, str);
    }

    public final boolean c(String[] strArr, int[] iArr, String str, boolean z) {
        return nativeAddCount(this.a, strArr, iArr, str, 1, z);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        nativeClose(this.a);
    }

    public final void d(String[] strArr, int[] iArr, String str) {
        nativeDecreaseCount(this.a, strArr, iArr, str, 1);
    }

    public native boolean nativeCompact(long j, int i);

    public native boolean nativeDuplicateDictionary(long j);

    public native int nativeGetDictionarySize(long j);

    public native boolean nativeInsertOrUpdate(long j, String str, int i, boolean z);

    public native boolean nativeInsertOrUpdate(long j, String[] strArr, int[] iArr, String str, int i, boolean z, boolean z2);

    public native boolean nativeNewEmptyDictionary(long j);

    public native boolean nativePersist(long j, String str);
}
