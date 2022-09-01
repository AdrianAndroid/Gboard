package defpackage;

import com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps;
import com.google.android.libraries.micore.learning.training.util.StatusOr;
import com.google.fcp.client.http.HttpClientForNative;
import j$.util.Objects;
import java.io.Closeable;
import java.io.File;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: jov  reason: default package */
/* loaded from: classes.dex */
public final class jov implements NativeFLRunnerDeps, Closeable {
    public final jns a;
    public final joy b;
    public final String c;
    public final String d;
    public final joc e;
    public final fwo f;
    public final jpb g;
    public final joz h;
    public final jol i;
    public final File j;
    public final mlu k;
    public final boolean l;
    public final long m;
    public final ExecutorService n;
    public final mma o;
    public final jou p;
    public final Object q = new Object();
    public mfx r;

    public jov(fwe fweVar, jns jnsVar, joy joyVar, String str, String str2, joc jocVar, fwo fwoVar, jpb jpbVar, joz jozVar, mfx mfxVar, joi joiVar, File file, mlu mluVar, boolean z, ExecutorService executorService, mma mmaVar, jou jouVar) {
        Random random;
        this.a = jnsVar;
        this.b = joyVar;
        this.c = str;
        this.d = str2;
        this.e = jocVar;
        this.f = fwoVar;
        this.g = jpbVar;
        this.h = jozVar;
        this.r = mfxVar;
        this.i = new jol(joiVar, mluVar);
        this.j = file;
        this.k = mluVar;
        this.l = z;
        this.n = executorService;
        this.o = mmaVar;
        this.p = jouVar;
        if (fweVar.aY()) {
            random = new SecureRandom();
        } else {
            random = new Random(System.currentTimeMillis());
        }
        this.m = random.nextLong();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mlu mluVar = this.k;
        jol jolVar = this.i;
        Objects.requireNonNull(jolVar);
        mluVar.b(new joq(jolVar, 0));
    }

    @Override // com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps
    public final StatusOr createExampleIterator(byte[] bArr) {
        return (StatusOr) this.k.a(new jos(this, bArr, mzg.b.q(), 0));
    }

    @Override // com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps
    public final StatusOr createExampleIteratorWithContext(byte[] bArr, byte[] bArr2) {
        return (StatusOr) this.k.a(new jos(this, bArr, bArr2, 0));
    }

    @Override // com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps
    public final HttpClientForNative createHttpClient() {
        return new mlx(this.k, new opu(this), null, null);
    }

    @Override // com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps
    public final String getBaseDir() {
        return (String) this.k.a(new jor(this, 0));
    }

    @Override // com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps
    public final void publishEvent(byte[] bArr) {
        this.k.b(new idx(this, bArr, 17));
    }

    @Override // com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerDeps
    public final boolean trainingConditionsSatisfied() {
        return ((Boolean) this.k.a(new jor(this, 2))).booleanValue();
    }
}
