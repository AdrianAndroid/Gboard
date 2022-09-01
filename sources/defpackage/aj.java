package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aj  reason: default package */
/* loaded from: classes.dex */
public final class aj extends ar {
    final /* synthetic */ an a;

    public aj(an anVar) {
        this.a = anVar;
    }

    @Override // defpackage.ar
    public final View a(int i) {
        View view = this.a.O;
        if (view == null) {
            throw new IllegalStateException("Fragment " + this.a + " does not have a view");
        }
        return view.findViewById(i);
    }

    @Override // defpackage.ar
    public final boolean b() {
        return this.a.O != null;
    }
}
