package defpackage;

/* compiled from: PG */
/* renamed from: jon  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jon implements Runnable {
    public final /* synthetic */ joo a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;

    public /* synthetic */ jon(joo jooVar, int i, int i2, int i3, int i4, String str, long j) {
        this.a = jooVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str;
        this.g = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        joo jooVar = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        String str = this.f;
        long j = this.g;
        mzd b = mzd.b(i);
        jdg.u(b);
        mgl b2 = mgl.b(i2);
        jdg.u(b2);
        mgm mgmVar = jooVar.c.c;
        if (mgmVar == null) {
            mgmVar = mgm.l;
        }
        nfh nfhVar = (nfh) mgmVar.N(5);
        nfhVar.cG(mgmVar);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mgm mgmVar2 = (mgm) nfhVar.b;
        int i5 = mgmVar2.a | 32;
        mgmVar2.a = i5;
        mgmVar2.e = i3;
        int i6 = i5 | 64;
        mgmVar2.a = i6;
        mgmVar2.f = i4;
        mgmVar2.k = b2.d;
        int i7 = 262144 | i6;
        mgmVar2.a = i7;
        if (str != null) {
            mgmVar2.a = i7 | 4096;
            mgmVar2.i = str;
        }
        mfx mfxVar = jooVar.c;
        nfh nfhVar2 = (nfh) mfxVar.N(5);
        nfhVar2.cG(mfxVar);
        if (nfhVar2.c) {
            nfhVar2.cD();
            nfhVar2.c = false;
        }
        mfx mfxVar2 = (mfx) nfhVar2.b;
        mgm mgmVar3 = (mgm) nfhVar.cz();
        mgmVar3.getClass();
        mfxVar2.c = mgmVar3;
        mfxVar2.a |= 4;
        jooVar.a.c(b, (mfx) nfhVar2.cz(), j);
    }
}
