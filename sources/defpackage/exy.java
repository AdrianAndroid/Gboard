package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: exy  reason: default package */
/* loaded from: classes.dex */
public final class exy extends iye {
    final /* synthetic */ Executor a;
    final /* synthetic */ exz b;

    public exy(exz exzVar, Executor executor) {
        this.b = exzVar;
        this.a = executor;
    }

    @Override // defpackage.iye
    public final void a() {
        kcu.U(this.b.b(), new cbx(13), this.a);
    }
}
