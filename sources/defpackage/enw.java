package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: enw  reason: default package */
/* loaded from: classes.dex */
final class enw extends hqi {
    final /* synthetic */ enx a;
    private int b = -1;
    private int c = -1;
    private String d;

    public enw(enx enxVar) {
        this.a = enxVar;
    }

    @Override // defpackage.hqi
    public final void a(hpy hpyVar) {
        if (hpyVar.b == hqe.DELETE || hpyVar.b == hqe.IME) {
            CharSequence a = hpyVar.a();
            if (hpyVar.d == this.b && hpyVar.e == this.c && TextUtils.equals(a, this.d)) {
                return;
            }
            this.b = hpyVar.d;
            this.c = hpyVar.e;
            this.d = a.toString();
            this.a.a();
            if (hpyVar.f < hpyVar.g) {
                if (!((Boolean) enx.a.c()).booleanValue()) {
                    return;
                }
                this.a.g(((Long) enx.b.c()).longValue());
            } else if (!((Boolean) enx.c.c()).booleanValue() || hpyVar.e == hpyVar.c.length()) {
            } else {
                this.a.g(((Long) enx.d.c()).longValue());
            }
        }
    }

    @Override // defpackage.hqi
    public final void c() {
        this.a.a();
    }
}
