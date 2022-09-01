package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: ag  reason: default package */
/* loaded from: classes.dex */
final class ag implements age {
    final /* synthetic */ ai a;

    public ag(ai aiVar) {
        this.a = aiVar;
    }

    @Override // defpackage.age
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (((afv) obj) != null) {
            ai aiVar = this.a;
            if (!aiVar.c) {
                return;
            }
            View H = aiVar.H();
            if (H.getParent() == null) {
                if (this.a.d == null) {
                    return;
                }
                if (bi.S(3)) {
                    StringBuilder sb = new StringBuilder("DialogFragment ");
                    sb.append(this);
                    sb.append(" setting the content view on ");
                    sb.append(this.a.d);
                }
                this.a.d.setContentView(H);
                return;
            }
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
    }
}
