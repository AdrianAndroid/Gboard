package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* renamed from: oil  reason: default package */
/* loaded from: classes2.dex */
public final class oil implements nvm {
    public final Object a;
    private final /* synthetic */ int b;

    public oil(krm krmVar, int i, byte[] bArr, byte[] bArr2) {
        this.b = i;
        this.a = krmVar;
    }

    public oil(nxp nxpVar, nvm nvmVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = i;
        jdg.Q(nxpVar, "interceptor");
        this.a = nvmVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [nvm, java.lang.Object] */
    @Override // defpackage.nvm
    public final nxo a(nvl nvlVar, num numVar) {
        oin oinVar;
        nvu a;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ?? r0 = this.a;
                oek oekVar = (oek) nvlVar;
                nwo nwoVar = (nwo) oekVar.a.a().c(nwp.a);
                nuq nuqVar = oekVar.b;
                String str = nuqVar.c;
                boolean z = nuqVar.f;
                if (!z || (a = (nvu) ((ConcurrentHashMap) nwoVar.c).get(str)) == null) {
                    oqv oqvVar = (oqv) nwoVar.b;
                    a = ((nwh) ((llw) oqvVar.a).getOrDefault(str, oqvVar.b)).a(nwoVar.a);
                    if (z) {
                        ((ConcurrentHashMap) nwoVar.c).putIfAbsent(str, a);
                    }
                }
                if (a.k()) {
                    return r0.a(nvlVar, numVar);
                }
                nvlVar.a(a, new num());
                return new nxo();
            }
            jdg.w(((oek) nvlVar).b.a.a(), "asyncUnaryRequestCall is only for clientSendsOneMessage methods");
            oij oijVar = new oij(nvlVar, false);
            nvlVar.b(2);
            return new oim(this, oijVar, nvlVar, null);
        }
        oij oijVar2 = new oij(nvlVar, true);
        krm krmVar = (krm) this.a;
        if (krmVar.a == 9) {
            duk dukVar = (duk) krmVar.b;
            if (!dukVar.c()) {
                oijVar2.b(nvu.l.f("Not the default keyboard.").g());
                oinVar = new dva();
            } else {
                dun a2 = duq.a();
                if (a2 == null) {
                    oijVar2.b(nvu.l.f("Client callback not set.").g());
                    oinVar = new dva();
                } else {
                    dvf dvfVar = new dvf(dukVar.c, a2, oijVar2, dsv.a, dukVar.e);
                    dvf dvfVar2 = (dvf) dvf.a.getAndSet(dvfVar);
                    if (dvfVar2 != null) {
                        dvfVar2.e(fhz.NEW_ORATION_STARTED);
                    }
                    boolean z2 = dvfVar.h.get();
                    oinVar = dvfVar;
                    if (!z2) {
                        kki.j(new dvd(dvfVar, 0));
                        oinVar = dvfVar;
                    }
                }
            }
            if (oijVar2.c) {
                nvlVar.b(1);
            }
            return new oik(oinVar, oijVar2, nvlVar);
        }
        throw new AssertionError();
    }
}
