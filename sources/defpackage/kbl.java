package defpackage;

import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: kbl  reason: default package */
/* loaded from: classes.dex */
final class kbl implements kbk {
    private static final ltg a = ltg.j("com/google/android/libraries/performance/primes/PrimesApiImpl");
    private final kbv b;
    private final oiy c;
    private final oiy d;
    private final oiy e;
    private final oiy f;

    public kbl(kbv kbvVar, oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, lfb lfbVar, jlr jlrVar, byte[] bArr) {
        this.b = kbvVar;
        this.c = oiyVar;
        this.d = oiyVar2;
        this.e = oiyVar3;
        this.f = oiyVar4;
        if (kki.l() || jlrVar.c()) {
            if (((Boolean) lfbVar.c(Boolean.FALSE)).booleanValue()) {
                return;
            }
            try {
                WeakHashMap weakHashMap = ldh.a;
                for (kdt kdtVar : ((npg) oiyVar).a()) {
                    kdtVar.ad();
                }
                return;
            } catch (RuntimeException e) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/performance/primes/PrimesApiImpl", "initialize", '{', "PrimesApiImpl.java")).t("Primes failed to initialize");
                this.b.a();
                return;
            }
        }
        throw new IllegalStateException("Primes init triggered from background in package: ".concat(String.valueOf(jlrVar.a)));
    }

    @Override // defpackage.kbk
    public final void a() {
        ((kee) this.e.a()).d();
    }

    @Override // defpackage.kbk
    public final void b() {
        ((kfx) this.f.a()).a();
    }

    @Override // defpackage.kbk
    public final void c(kbh kbhVar) {
        ((kfx) this.f.a()).b(kbhVar);
    }

    @Override // defpackage.kbk
    public final void d() {
        ((kbd) this.d).a();
    }
}
