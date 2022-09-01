package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: kys  reason: default package */
/* loaded from: classes.dex */
public final class kys {
    public CharSequence a;
    public CharSequence b;
    public View d;
    public kyv f;
    public kyu g;
    public int c = -1;
    public final int e = 1;
    public int h = -1;

    public final void a() {
        kyv kyvVar = this.f;
        if (kyvVar == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        kyvVar.g(this);
    }

    public final void b() {
        kyu kyuVar = this.g;
        if (kyuVar != null) {
            kyuVar.b();
        }
    }
}
