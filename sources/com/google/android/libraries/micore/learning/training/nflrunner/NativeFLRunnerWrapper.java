package com.google.android.libraries.micore.learning.training.nflrunner;

import com.google.android.libraries.micore.learning.training.nativeshared.NativeFiles;
import com.google.android.libraries.micore.learning.training.nativeshared.NativeLogManager;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NativeFLRunnerWrapper implements Closeable {
    public final jns a;
    public final NativeLogManager b;
    public final fwe c;
    public final String d;
    public final jno e;
    public final File f;
    public final jnq g;
    public final joy h;
    public final String i;
    public final joc j;
    public final mlu k;
    public final fwo l;
    public final jpb m;
    public final joz n;
    public final mfx o;
    public final joi p;
    public final ExecutorService q;
    public final mma r;
    public final jou s;

    public NativeFLRunnerWrapper(jns jnsVar, joy joyVar, String str, joc jocVar, mlu mluVar, fwo fwoVar, jpb jpbVar, joz jozVar, mfx mfxVar, jno jnoVar, fwe fweVar, String str2, jnq jnqVar, joi joiVar, File file, ExecutorService executorService, mma mmaVar, jou jouVar) {
        this.a = jnsVar;
        this.e = jnoVar;
        this.k = mluVar;
        this.b = new joo(fwoVar, str, mfxVar, mluVar);
        this.h = joyVar;
        this.i = str;
        this.j = jocVar;
        this.l = fwoVar;
        this.m = jpbVar;
        this.n = jozVar;
        this.o = mfxVar;
        this.p = joiVar;
        this.f = file;
        this.c = fweVar;
        this.d = str2;
        this.g = jnqVar;
        this.q = executorService;
        this.r = mmaVar;
        this.s = jouVar;
    }

    public static native byte[] runNative(NativeFLRunnerDeps nativeFLRunnerDeps, String str, NativeFiles nativeFiles, NativeLogManager nativeLogManager, String str2, String str3, String str4, String str5, String str6, String str7, String str8, byte[] bArr, String str9);

    static native byte[] runNativeTensorflowSpecForTesting(NativeFLRunnerDeps nativeFLRunnerDeps, String str, NativeFiles nativeFiles, NativeLogManager nativeLogManager, byte[] bArr, String str2, byte[] bArr2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
