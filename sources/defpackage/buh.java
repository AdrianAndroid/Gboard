package defpackage;

import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: buh  reason: default package */
/* loaded from: classes.dex */
public final class buh extends hqi {
    public llp a = null;
    public boolean b = false;
    public hpy c = null;
    public hpy d = null;
    public long e = 0;
    final /* synthetic */ bui f;

    public buh(bui buiVar) {
        this.f = buiVar;
    }

    @Override // defpackage.hqi
    public final void a(hpy hpyVar) {
        if (this.f.k) {
            e(hpyVar, this.c);
            this.d = this.c;
            this.c = hpyVar;
            this.e = System.currentTimeMillis();
        }
    }

    @Override // defpackage.hqi
    protected final void b(hpy hpyVar) {
        if (!this.f.k) {
            e(hpyVar, this.c);
            this.d = this.c;
            this.c = hpyVar;
            this.e = System.currentTimeMillis();
        }
    }

    @Override // defpackage.hqi
    public final void c() {
    }

    public final void d() {
        this.a = null;
        this.b = false;
    }

    public final void e(hpy hpyVar, hpy hpyVar2) {
        llp llpVar = this.a;
        if (llpVar == null || jdg.W(llpVar, this.f.g)) {
            llp llpVar2 = this.a;
            if (llpVar2 == null) {
                long j = bui.a;
                return;
            }
            String i = ((buk) llpVar2.get(0)).i();
            if (TextUtils.isEmpty(i)) {
                return;
            }
            long j2 = bui.a;
            hpyVar.d().length();
            hpyVar.c().length();
            if (this.b) {
                if (bui.j(i, hpyVar, hpyVar2)) {
                    return;
                }
                this.b = false;
            }
            if (this.f.f == null || !bui.k(i, hpyVar, hpyVar2)) {
                if (this.f.f != null || bui.j(i, hpyVar, hpyVar2)) {
                    return;
                }
                this.f.d();
                return;
            }
            this.f.a(7);
        }
    }
}
