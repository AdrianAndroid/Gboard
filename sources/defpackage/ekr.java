package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ekr  reason: default package */
/* loaded from: classes.dex */
public final class ekr implements cgz {
    private final ekp a;
    private final llp b;

    public ekr(ekp ekpVar, llp llpVar) {
        this.a = ekpVar;
        this.b = llpVar;
    }

    @Override // defpackage.cgz
    public final boolean a(int i) {
        if (i == 1) {
            this.a.F();
            return false;
        }
        ekp ekpVar = this.a;
        ekpVar.z.d();
        if (ekpVar.s.g()) {
            return false;
        }
        ekpVar.C.aG(ekpVar.z);
        ekt ektVar = ekpVar.C;
        ekq ekqVar = ektVar.aa;
        if (ekqVar == null) {
            return true;
        }
        ektVar.l.ha();
        ekqVar.a();
        return true;
    }

    @Override // defpackage.cgz
    public final boolean b(int i, Object obj) {
        if (i == 1) {
            if (this.b.contains(ekt.aD(obj)) || this.b.contains("image/*")) {
                this.a.G();
                return false;
            }
            this.a.F();
            return true;
        }
        return false;
    }
}
