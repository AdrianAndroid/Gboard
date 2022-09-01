package defpackage;

import android.content.Context;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bur  reason: default package */
/* loaded from: classes.dex */
public final class bur implements hho {
    public final Context a;
    public llw b;

    public bur(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        c();
        hhq.p(this, bwv.n, bwv.o);
    }

    final void c() {
        lls h = llw.h();
        String[] split = ((String) bwv.o.c()).split(",");
        if (split.length > 0) {
            h.a(new hez(), split);
        }
        String[] split2 = ((String) bwv.n.c()).split(",");
        if (split2.length > 0) {
            h.a(new hey(), split2);
        }
        this.b = h.l();
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        c();
    }
}
