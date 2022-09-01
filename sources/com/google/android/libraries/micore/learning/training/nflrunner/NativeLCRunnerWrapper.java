package com.google.android.libraries.micore.learning.training.nflrunner;

import com.google.android.libraries.micore.learning.training.nativeshared.NativeLogManager;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NativeLCRunnerWrapper implements Closeable {
    public final jns a;
    public final NativeLogManager b;
    public final fwe c;
    public final joy d;
    public final String e;
    public final joc f;
    public final mlu g;
    public final fwo h;
    public final jpb i;
    public final joz j;
    public final mfx k;
    public final File l;
    public final joi m;
    public final ExecutorService n;
    public final mma o;
    public final jou p;

    public NativeLCRunnerWrapper(jns jnsVar, joy joyVar, String str, joc jocVar, mlu mluVar, fwo fwoVar, jpb jpbVar, joz jozVar, mfx mfxVar, fwe fweVar, joi joiVar, File file, ExecutorService executorService, mma mmaVar, jou jouVar) {
        this.a = jnsVar;
        this.g = mluVar;
        this.b = new joo(fwoVar, str, mfxVar, mluVar);
        this.d = joyVar;
        this.e = str;
        this.f = jocVar;
        this.h = fwoVar;
        this.i = jpbVar;
        this.j = jozVar;
        this.k = mfxVar;
        this.c = fweVar;
        this.m = joiVar;
        this.l = file;
        this.n = executorService;
        this.o = mmaVar;
        this.p = jouVar;
    }

    public static native void runNative(NativeFLRunnerDeps nativeFLRunnerDeps, String str, NativeLogManager nativeLogManager, byte[] bArr, String str2, String str3, String str4, String str5);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
