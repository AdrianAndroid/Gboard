package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: drm  reason: default package */
/* loaded from: classes.dex */
public final class drm implements mka {
    final /* synthetic */ bze a;
    final /* synthetic */ Executor b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ String e;
    final /* synthetic */ dro f;

    public drm(bze bzeVar, Executor executor, String str, int i, String str2, dro droVar) {
        this.a = bzeVar;
        this.b = executor;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = droVar;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        c(((bzr) this.a).j.a());
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        boolean z = false;
        if (((byy) obj).i() && ((bzr) this.a).j.a()) {
            z = true;
        }
        c(z);
    }

    final void c(boolean z) {
        drp.e(this.a, this.b, this.c, this.d, this.e, z, this.f);
    }
}
