package defpackage;

/* compiled from: PG */
/* renamed from: ngt  reason: default package */
/* loaded from: classes2.dex */
public final class ngt {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ngt() {
    }

    public ngt(lfb lfbVar, llp llpVar, llp llpVar2, krm krmVar) {
        this.d = lfbVar;
        this.a = llpVar;
        this.b = llpVar2;
        this.c = krmVar;
    }

    public ngt(nik nikVar, Object obj, nik nikVar2, Object obj2) {
        this.c = nikVar;
        this.a = obj;
        this.d = nikVar2;
        this.b = obj2;
    }

    public final nik a() {
        return ((nfl) this.c).b;
    }

    public final void b() {
        boolean z = ((nfl) this.c).c;
    }

    public final void c(Object obj) {
        if (((nfl) this.c).a() != nil.ENUM) {
            return;
        }
        fgs fgsVar = ((nfl) this.c).d;
        ((Integer) obj).intValue();
        throw null;
    }

    public ngt(ngz ngzVar, Object obj, ngz ngzVar2, nfl nflVar) {
        if (ngzVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (nflVar.b == nik.MESSAGE && ngzVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.d = ngzVar;
        this.b = obj;
        this.a = ngzVar2;
        this.c = nflVar;
    }
}
