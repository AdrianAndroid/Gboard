package defpackage;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: x  reason: default package */
/* loaded from: classes2.dex */
public final class x implements wp {
    final /* synthetic */ Animator a;
    final /* synthetic */ bz b;

    public x(Animator animator, bz bzVar) {
        this.a = animator;
        this.b = bzVar;
    }

    @Override // defpackage.wp
    public final void a() {
        this.a.end();
        if (bi.S(2)) {
            new StringBuilder("Animator from operation ").append(this.b);
        }
    }
}
