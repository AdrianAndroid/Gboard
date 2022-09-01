package defpackage;

/* compiled from: PG */
/* renamed from: fed  reason: default package */
/* loaded from: classes.dex */
public final class fed implements gid {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public float f;

    @Override // defpackage.gid
    public final void a(nlz nlzVar) {
        nlv nlvVar;
        nmd nmdVar;
        nga ngaVar;
        nlq nlqVar;
        nlq nlqVar2;
        if ((nlzVar.a & 2) != 0) {
            nly nlyVar = nlzVar.b;
            if (nlyVar == null) {
                nlyVar = nly.f;
            }
            if (nlyVar.a == 1) {
                nly nlyVar2 = nlzVar.b;
                if (nlyVar2 == null) {
                    nlyVar2 = nly.f;
                }
                if (nlyVar2.a == 1) {
                    nlqVar = (nlq) nlyVar2.b;
                } else {
                    nlqVar = nlq.f;
                }
                nmdVar = nlqVar.e;
                if (nmdVar == null) {
                    nmdVar = nmd.d;
                }
                nly nlyVar3 = nlzVar.b;
                if (nlyVar3 == null) {
                    nlyVar3 = nly.f;
                }
                if (nlyVar3.a == 1) {
                    nlqVar2 = (nlq) nlyVar3.b;
                } else {
                    nlqVar2 = nlq.f;
                }
                ngaVar = nlqVar2.b;
            } else {
                nly nlyVar4 = nlzVar.b;
                if (nlyVar4 == null) {
                    nlyVar4 = nly.f;
                }
                if (nlyVar4.a == 2) {
                    nlvVar = (nlv) nlyVar4.b;
                } else {
                    nlvVar = nlv.c;
                }
                nmdVar = nlvVar.b;
                if (nmdVar == null) {
                    nmdVar = nmd.d;
                }
                nly nlyVar5 = nlzVar.b;
                if (nlyVar5 == null) {
                    nlyVar5 = nly.f;
                }
                ngaVar = (nlyVar5.a == 2 ? (nlv) nlyVar5.b : nlv.c).a;
            }
            if (ngaVar.isEmpty()) {
                return;
            }
            this.c = (System.currentTimeMillis() - this.a) * 1000;
            this.b = nmdVar.a;
            this.e = nmdVar.b;
            this.f = nmdVar.c;
        }
        if ((nlzVar.a & 8) == 0 || nlzVar.c != null) {
            return;
        }
        nlp nlpVar = nlp.b;
    }

    public final void b() {
        this.d = 0L;
        this.c = 0L;
        this.b = 0L;
        this.a = 0L;
    }
}
