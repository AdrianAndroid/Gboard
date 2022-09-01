package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcs  reason: default package */
/* loaded from: classes.dex */
public final class dcs implements hqb {
    private final /* synthetic */ int a;

    public dcs(int i) {
        this.a = i;
    }

    @Override // defpackage.hqb
    public final void b() {
        if (this.a == 0) {
            ijl.b().g(new hqj(hqj.b(), hpy.a));
        } else {
            ijl.b().g(new hqj(hpy.a, hqj.c()));
        }
    }

    @Override // defpackage.hqb
    public final void a(hqe hqeVar, CharSequence charSequence, int i, int i2, int i3, int i4, int i5) {
        if (this.a == 0) {
            dcu.h.a("ImeInputConnection onInputContextChanged()");
            ijl.b().g(new hqj(hqj.b(), new hpy(hqeVar, charSequence, i, i2, i3, i4, i5)));
            return;
        }
        dcu.h.a("AppInputConnection onInputContextChanged()");
        ijl.b().g(new hqj(new hpy(hqeVar, charSequence, i, i2, i3, i4, i5), hqj.c()));
    }
}
