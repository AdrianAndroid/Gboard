package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: z  reason: default package */
/* loaded from: classes2.dex */
public final class z implements wp {
    final /* synthetic */ View a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ aa c;
    final /* synthetic */ bz d;

    public z(View view, ViewGroup viewGroup, aa aaVar, bz bzVar) {
        this.a = view;
        this.b = viewGroup;
        this.c = aaVar;
        this.d = bzVar;
    }

    @Override // defpackage.wp
    public final void a() {
        this.a.clearAnimation();
        this.b.endViewTransition(this.a);
        this.c.b();
        if (bi.S(2)) {
            new StringBuilder("Animation from operation ").append(this.d);
        }
    }
}
