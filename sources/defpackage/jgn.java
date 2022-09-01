package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* renamed from: jgn  reason: default package */
/* loaded from: classes.dex */
final class jgn extends jgo {
    private final Choreographer a = Choreographer.getInstance();

    @Override // defpackage.jgo
    public final void a(jgm jgmVar) {
        this.a.postFrameCallback(jgmVar.b());
    }

    @Override // defpackage.jgo
    public final void b(jgm jgmVar) {
        this.a.removeFrameCallback(jgmVar.b());
    }
}
