package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: nys  reason: default package */
/* loaded from: classes2.dex */
final class nys implements Runnable {
    final /* synthetic */ nyt a;
    private final long b;

    public nys(nyt nytVar, long j) {
        this.a = nytVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oau oauVar = new oau();
        this.a.e.b(oauVar);
        long abs = Math.abs(this.b) / TimeUnit.SECONDS.toNanos(1L);
        long abs2 = Math.abs(this.b) % TimeUnit.SECONDS.toNanos(1L);
        StringBuilder sb = new StringBuilder("deadline exceeded after ");
        if (this.b < 0) {
            sb.append('-');
        }
        sb.append(abs);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        sb.append("s. ");
        sb.append(oauVar);
        this.a.e.c(nvu.e.b(sb.toString()));
    }
}
