package defpackage;

/* compiled from: PG */
/* renamed from: jkd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jkd implements miy {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ jkd(cly clyVar, String str, boolean z, jsq jsqVar, int i) {
        this.e = i;
        this.c = clyVar;
        this.d = str;
        this.a = z;
        this.b = jsqVar;
    }

    public /* synthetic */ jkd(jkk jkkVar, boolean z, jiq jiqVar, miy miyVar, int i) {
        this.e = i;
        this.b = jkkVar;
        this.a = z;
        this.c = jiqVar;
        this.d = miyVar;
    }

    public /* synthetic */ jkd(jyh jyhVar, boolean z, jsz jszVar, Object obj, int i) {
        this.e = i;
        this.b = jyhVar;
        this.a = z;
        this.c = jszVar;
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, miy] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        int o;
        int i = this.e;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                Object obj2 = this.c;
                Object obj3 = this.d;
                boolean z2 = this.a;
                Object obj4 = this.b;
                cly clyVar = (cly) obj2;
                clyVar.i.set((jqm) obj);
                bze bzeVar = clyVar.d;
                return bzeVar.h((String) obj3, new clu(clyVar.e, z2, ((bzr) bzeVar).j), (jsq) obj4);
            }
            Object obj5 = this.b;
            boolean z3 = this.a;
            Object obj6 = this.c;
            Object obj7 = this.d;
            Throwable th = (Throwable) obj;
            if (z3) {
                ((jyh) obj5).b((jsz) obj6, obj7);
            }
            ((luc) ((luc) ((luc) jsh.a.c()).i(th)).k("com/google/android/libraries/micore/superpacks/scheduling/DownloadJob", "lambda$onStartJob$2", 106, "DownloadJob.java")).w("DownloadJob#onStartJob: failure for %s", obj6);
            return kcu.K(null);
        }
        Object obj8 = this.b;
        boolean z4 = this.a;
        Object obj9 = this.c;
        ?? r5 = this.d;
        jig jigVar = (jig) obj;
        if (jigVar != null && ((o = jez.o(jigVar.p)) == 0 || o == 1)) {
            jij jijVar = jigVar.k;
            if (jijVar == null) {
                jijVar = jij.f;
            }
            int k = kez.k(jijVar.c);
            if (k == 0 || k != 2) {
                jij jijVar2 = jigVar.k;
                if (jijVar2 == null) {
                    jijVar2 = jij.f;
                }
                int k2 = kez.k(jijVar2.c);
                if (k2 != 0 && k2 == 3) {
                    long a = ((jkk) obj8).d.a();
                    jif jifVar = jigVar.b;
                    if (jifVar == null) {
                        jifVar = jif.g;
                    }
                    long j = (a - jifVar.c) / 1000;
                    jij jijVar3 = jigVar.k;
                    if (jijVar3 == null) {
                        jijVar3 = jij.f;
                    }
                    if (j > jijVar3.d) {
                        nfh nfhVar = (nfh) jigVar.N(5);
                        nfhVar.cG(jigVar);
                        jij jijVar4 = jigVar.k;
                        if (jijVar4 == null) {
                            jijVar4 = jij.f;
                        }
                        nfh nfhVar2 = (nfh) jijVar4.N(5);
                        nfhVar2.cG(jijVar4);
                        if (nfhVar2.c) {
                            nfhVar2.cD();
                            nfhVar2.c = false;
                        }
                        jij jijVar5 = (jij) nfhVar2.b;
                        jijVar5.c = 1;
                        jijVar5.a = 2 | jijVar5.a;
                        if (nfhVar.c) {
                            nfhVar.cD();
                            nfhVar.c = false;
                        }
                        jig jigVar2 = (jig) nfhVar.b;
                        jij jijVar6 = (jij) nfhVar2.cz();
                        jijVar6.getClass();
                        jigVar2.k = jijVar6;
                        jigVar2.a |= 1024;
                        jigVar = (jig) nfhVar.cz();
                    }
                }
                z = false;
            }
            String str = jigVar.c;
            int i2 = jmk.a;
            if (z4 || z) {
                jij jijVar7 = jigVar.k;
                if (jijVar7 == null) {
                    jijVar7 = jij.f;
                }
                return ((jkk) obj8).d((jiq) obj9, jijVar7, r5);
            }
            return kcu.K(null);
        }
        return kcu.K(null);
    }
}
