package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: khu  reason: default package */
/* loaded from: classes.dex */
public final class khu {
    public static final ltg a = ltg.j("com/google/android/libraries/performance/primes/sampling/Sampler");
    private static final khr e = khr.a(Integer.MAX_VALUE);
    public volatile khz b = khy.a;
    public volatile boolean c = true;
    public volatile khr d = e;

    public khu(Context context, Executor executor, khy khyVar, nox noxVar, boolean z, oiy oiyVar) {
        kcu.N(new khs(this, context, noxVar, executor, khyVar, true != z ? null : oiyVar, 0), executor);
    }

    public final void a(nox noxVar) {
        try {
            kco kcoVar = (kco) noxVar.a();
            this.c = kcoVar.b();
            this.d = khr.a(kcoVar.a());
        } catch (Throwable th) {
            ((ltd) ((ltd) ((ltd) a.d()).i(th)).k("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchConfig", 'g', "Sampler.java")).t("Couldn't get config");
            this.c = false;
        }
    }
}
