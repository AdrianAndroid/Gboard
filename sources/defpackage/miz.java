package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: miz  reason: default package */
/* loaded from: classes.dex */
final class miz implements mka {
    final /* synthetic */ mjf a;
    final /* synthetic */ Executor b;

    public miz(mjf mjfVar, Executor executor) {
        this.a = mjfVar;
        this.b = executor;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.b.a.d((Closeable) obj, this.b);
    }
}
