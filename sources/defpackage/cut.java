package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: cut  reason: default package */
/* loaded from: classes.dex */
public final class cut extends cum {
    public final his s;
    private final View u;
    private final boolean v;

    public cut(View view, his hisVar, boolean z) {
        super(view);
        this.s = hisVar;
        this.v = z;
        this.u = view;
    }

    public static leq I(his hisVar) {
        return new cus(hisVar, 1);
    }

    @Override // defpackage.cum
    public final void F(Object obj, int i) {
        View.OnClickListener bsxVar = new bsx(this, obj, 11);
        if (this.v) {
            bsxVar = new dbg(bsxVar, 0);
        }
        this.u.setOnClickListener(bsxVar);
    }

    @Override // defpackage.cum
    public final void G() {
        this.u.setOnClickListener(null);
    }
}
