package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: coy  reason: default package */
/* loaded from: classes.dex */
public class coy extends mo {
    public final cor s;
    protected final gqa t;

    public coy(View view, cor corVar) {
        super(view);
        this.s = corVar;
        view.setVisibility(0);
        this.t = gqa.a(view.getContext());
    }

    public void F(coq coqVar) {
        this.a.setOnClickListener(new bsx(this, coqVar, 10));
        G(b() == this.s.e);
    }

    public void G(boolean z) {
        this.a.setSelected(z);
        this.a.setClickable(!z);
    }
}
