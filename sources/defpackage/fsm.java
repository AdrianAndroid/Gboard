package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* renamed from: fsm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fsm implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ fsm(dvs dvsVar, long j, Runnable runnable, int i) {
        this.d = i;
        this.b = dvsVar;
        this.a = j;
        this.c = runnable;
    }

    public /* synthetic */ fsm(fsp fspVar, long j, fsp fspVar2, int i) {
        this.d = i;
        this.b = fspVar;
        this.a = j;
        this.c = fspVar2;
    }

    public /* synthetic */ fsm(idz idzVar, String str, long j, int i) {
        this.d = i;
        this.b = idzVar;
        this.c = str;
        this.a = j;
    }

    public /* synthetic */ fsm(ieh iehVar, ids idsVar, long j, int i) {
        this.d = i;
        this.c = iehVar;
        this.b = idsVar;
        this.a = j;
    }

    public /* synthetic */ fsm(ijk ijkVar, fss fssVar, long j, int i, byte[] bArr, byte[] bArr2) {
        this.d = i;
        this.b = ijkVar;
        this.c = fssVar;
        this.a = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [ids, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        if (i == 0) {
            Object obj = this.b;
            Object obj2 = this.c;
            long j = this.a;
            Object obj3 = ((ijk) obj).a;
            fss fssVar = (fss) obj2;
            fssVar.b(new fsr((fsu) obj3, "getResults init timeout: " + j + " ms", fssVar.f));
        } else if (i == 1) {
            Object obj4 = this.b;
            long j2 = this.a;
            ?? r3 = this.c;
            dvs dvsVar = (dvs) obj4;
            if (j2 != dvsVar.d) {
                return;
            }
            for (int i2 = 0; i2 < 4; i2++) {
                dvsVar.a[i2] = 0;
            }
            r3.run();
        } else if (i == 2) {
            Object obj5 = this.b;
            long j3 = this.a;
            Object obj6 = this.c;
            fsp fspVar = (fsp) obj5;
            fsu fsuVar = fspVar.f;
            fsr fsrVar = new fsr(fsuVar, "getResults snapshot timeout: " + j3 + " ms", fspVar.e);
            String a = fsrVar.a(new HashMap());
            fsrVar.b();
            ((fsp) obj6).a(a);
        } else {
            if (i == 3) {
                Object obj7 = this.b;
                Object obj8 = this.c;
                ((idz) obj7).e.b((String) obj8).c(this.a);
                return;
            }
            ((ieh) this.c).o(this.b, this.a);
        }
    }
}
