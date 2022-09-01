package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: nfh  reason: default package */
/* loaded from: classes2.dex */
public class nfh extends ndt implements nha {
    public final nfm a;
    public nfm b;
    public boolean c;

    public nfh() {
        bki bkiVar = bki.c;
        throw null;
    }

    public nfh(byte[] bArr, short[] sArr) {
        this(mto.f);
    }

    private static final void a(nfm nfmVar, nfm nfmVar2) {
        nhh.a.b(nfmVar).g(nfmVar, nfmVar2);
    }

    @Override // defpackage.nha
    public final /* synthetic */ ngz cB() {
        return this.a;
    }

    public final void cC() {
        if (this.c) {
            cD();
            this.c = false;
        }
    }

    public void cD() {
        nfm nfmVar = (nfm) this.b.N(4);
        a(nfmVar, this.b);
        this.b = nfmVar;
    }

    @Override // defpackage.nha
    public final boolean cE() {
        return nfm.M(this.b, false);
    }

    @Override // defpackage.ndt
    /* renamed from: cF */
    public final void ct(ner nerVar, nfb nfbVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        try {
            nhh.a.b(this.b).h(this.b, nes.p(nerVar), nfbVar);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public final void cG(nfm nfmVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        a(this.b, nfmVar);
    }

    public final void cH(byte[] bArr, int i, nfb nfbVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        try {
            nhh.a.b(this.b).i(this.b, bArr, 0, i, new ndz(nfbVar));
        } catch (IOException e) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e);
        } catch (IndexOutOfBoundsException unused) {
            throw ngd.i();
        } catch (ngd e2) {
            throw e2;
        }
    }

    public final void cI(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        bnq bnqVar = (bnq) this.b;
        bnq bnqVar2 = bnq.b;
        bnqVar.b();
        ndt.cs(iterable, bnqVar.a);
    }

    public final void cJ(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        cmi cmiVar = (cmi) this.b;
        cmi cmiVar2 = cmi.d;
        cmiVar.b();
        ndt.cs(iterable, cmiVar.b);
    }

    public final void cK(cmh cmhVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        cmi cmiVar = (cmi) this.b;
        cmi cmiVar2 = cmi.d;
        cmhVar.getClass();
        cmiVar.b();
        cmiVar.b.add(cmhVar);
    }

    public final void cL(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        euv euvVar = (euv) this.b;
        euv euvVar2 = euv.g;
        euvVar.b();
        ndt.cs(iterable, euvVar.b);
    }

    public final void cM(String str) {
        if (this.c) {
            cD();
            this.c = false;
        }
        euv euvVar = (euv) this.b;
        euv euvVar2 = euv.g;
        str.getClass();
        euvVar.b();
        euvVar.b.add(str);
    }

    public final void cN(euv euvVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        euw euwVar = (euw) this.b;
        euw euwVar2 = euw.c;
        euvVar.getClass();
        euwVar.b();
        euwVar.a.add(euvVar);
    }

    public final void cO(eux euxVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        euw euwVar = (euw) this.b;
        euw euwVar2 = euw.c;
        euxVar.getClass();
        euwVar.c();
        euwVar.b.add(euxVar);
    }

    public final void cP(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        ggh gghVar = (ggh) this.b;
        ggh gghVar2 = ggh.o;
        nga ngaVar = gghVar.j;
        if (!ngaVar.c()) {
            gghVar.j = nfm.H(ngaVar);
        }
        ndt.cs(iterable, gghVar.j);
    }

    public final void cQ(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        ggl gglVar = (ggl) this.b;
        nft nftVar = ggl.e;
        nfs nfsVar = gglVar.d;
        if (!nfsVar.c()) {
            gglVar.d = nfm.D(nfsVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            gglVar.d.g(((ggi) it.next()).m);
        }
    }

    public final void cR(Map map) {
        if (this.c) {
            cD();
            this.c = false;
        }
        hax haxVar = (hax) this.b;
        hax haxVar2 = hax.b;
        ngu nguVar = haxVar.a;
        if (!nguVar.b) {
            haxVar.a = nguVar.a();
        }
        haxVar.a.putAll(map);
    }

    public final void cS(int i, hih hihVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        hif hifVar = hif.e;
        ((hif) this.b).b().put(Integer.valueOf(i), hihVar);
    }

    public final void cT(int i) {
        if (this.c) {
            cD();
            this.c = false;
        }
        hif hifVar = hif.e;
        ((hif) this.b).b().remove(Integer.valueOf(i));
    }

    public final void cU(String str, hif hifVar) {
        str.getClass();
        hifVar.getClass();
        if (this.c) {
            cD();
            this.c = false;
        }
        hij hijVar = (hij) this.b;
        hij hijVar2 = hij.b;
        ngu nguVar = hijVar.a;
        if (!nguVar.b) {
            hijVar.a = nguVar.a();
        }
        hijVar.a.put(str, hifVar);
    }

    public final void cV(hny hnyVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        hnz hnzVar = (hnz) this.b;
        hnz hnzVar2 = hnz.b;
        hnyVar.getClass();
        nga ngaVar = hnzVar.a;
        if (!ngaVar.c()) {
            hnzVar.a = nfm.H(ngaVar);
        }
        hnzVar.a.add(hnyVar);
    }

    public final void cW(String str) {
        if (this.c) {
            cD();
            this.c = false;
        }
        hyb hybVar = (hyb) this.b;
        hyb hybVar2 = hyb.l;
        str.getClass();
        nga ngaVar = hybVar.e;
        if (!ngaVar.c()) {
            hybVar.e = nfm.H(ngaVar);
        }
        hybVar.e.add(str);
    }

    public final void cX() {
        if (this.c) {
            cD();
            this.c = false;
        }
        izs izsVar = (izs) this.b;
        izs izsVar2 = izs.d;
        nga ngaVar = izsVar.c;
        if (!ngaVar.c()) {
            izsVar.c = nfm.H(ngaVar);
        }
        izsVar.c.add("");
    }

    public final void cY(jhn jhnVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        jho jhoVar = (jho) this.b;
        jho jhoVar2 = jho.m;
        jhnVar.getClass();
        jhoVar.b();
        jhoVar.g.add(jhnVar);
    }

    public final void cZ(String str, jig jigVar) {
        str.getClass();
        jigVar.getClass();
        if (this.c) {
            cD();
            this.c = false;
        }
        jio jioVar = jio.d;
        ((jio) this.b).b().put(str, jigVar);
    }

    @Override // defpackage.ndt
    protected final /* synthetic */ ndt co(ndu nduVar) {
        cG((nfm) nduVar);
        return this;
    }

    @Override // defpackage.ndt
    public final /* bridge */ /* synthetic */ ndt cv(byte[] bArr, int i, nfb nfbVar) {
        cH(bArr, i, nfbVar);
        return this;
    }

    @Override // defpackage.ndt
    /* renamed from: cw */
    public final nfh cn() {
        nfh nfhVar = (nfh) this.a.N(5);
        nfhVar.cG(cA());
        return nfhVar;
    }

    @Override // defpackage.ngy
    /* renamed from: cx */
    public final nfm cz() {
        nfm cA = cA();
        if (cA.cE()) {
            return cA;
        }
        throw new nhz();
    }

    @Override // defpackage.ngy
    /* renamed from: cy */
    public nfm cA() {
        if (this.c) {
            return this.b;
        }
        nfm nfmVar = this.b;
        nhh.a.b(nfmVar).f(nfmVar);
        this.c = true;
        return this.b;
    }

    public final void dA(int i) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mqn mqnVar = (mqn) this.b;
        mqn mqnVar2 = mqn.j;
        mqnVar.a |= 64;
        mqnVar.g = i;
    }

    public final void dB(int i) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mqn mqnVar = (mqn) this.b;
        mqn mqnVar2 = mqn.j;
        mqnVar.a |= 32;
        mqnVar.f = i;
    }

    public final void dC(float f) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mqn mqnVar = (mqn) this.b;
        mqn mqnVar2 = mqn.j;
        mqnVar.a |= 128;
        mqnVar.h = f;
    }

    public final void dD(float f) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mqn mqnVar = (mqn) this.b;
        mqn mqnVar2 = mqn.j;
        mqnVar.a |= 16;
        mqnVar.e = f;
    }

    public final void dE(float f) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mqn mqnVar = (mqn) this.b;
        mqn mqnVar2 = mqn.j;
        mqnVar.a |= 8;
        mqnVar.d = f;
    }

    public final void dF(float f) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mqn mqnVar = (mqn) this.b;
        mqn mqnVar2 = mqn.j;
        mqnVar.a |= 4;
        mqnVar.c = f;
    }

    public final void dG(float f) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mqn mqnVar = (mqn) this.b;
        mqn mqnVar2 = mqn.j;
        mqnVar.a |= 2;
        mqnVar.b = f;
    }

    public final void dH(nfh nfhVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        bnq bnqVar = (bnq) this.b;
        bns bnsVar = (bns) nfhVar.cz();
        bnq bnqVar2 = bnq.b;
        bnsVar.getClass();
        bnqVar.b();
        bnqVar.a.add(bnsVar);
    }

    public final void dI(nfh nfhVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        ckb ckbVar = (ckb) this.b;
        ckd ckdVar = (ckd) nfhVar.cz();
        ckb ckbVar2 = ckb.b;
        ckdVar.getClass();
        nga ngaVar = ckbVar.a;
        if (!ngaVar.c()) {
            ckbVar.a = nfm.H(ngaVar);
        }
        ckbVar.a.add(ckdVar);
    }

    public final void dJ(nfh nfhVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        euw euwVar = (euw) this.b;
        euv euvVar = (euv) nfhVar.cz();
        euw euwVar2 = euw.c;
        euvVar.getClass();
        euwVar.b();
        euwVar.a.add(euvVar);
    }

    public final void dK(nfh nfhVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        izt iztVar = (izt) this.b;
        izr izrVar = (izr) nfhVar.cz();
        izt iztVar2 = izt.b;
        izrVar.getClass();
        nga ngaVar = iztVar.a;
        if (!ngaVar.c()) {
            iztVar.a = nfm.H(ngaVar);
        }
        iztVar.a.add(izrVar);
    }

    public final void dL(nfh nfhVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        izu izuVar = (izu) this.b;
        izs izsVar = (izs) nfhVar.cz();
        izu izuVar2 = izu.b;
        izsVar.getClass();
        nga ngaVar = izuVar.a;
        if (!ngaVar.c()) {
            izuVar.a = nfm.H(ngaVar);
        }
        izuVar.a.add(izsVar);
    }

    public final void dM(nfh nfhVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mbc mbcVar = (mbc) this.b;
        mbt mbtVar = (mbt) nfhVar.cz();
        mbc mbcVar2 = mbc.p;
        mbtVar.getClass();
        mbcVar.b();
        mbcVar.o.add(mbtVar);
    }

    public final void dN(nfh nfhVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mcc mccVar = (mcc) this.b;
        mce mceVar = (mce) nfhVar.cz();
        mcc mccVar2 = mcc.aB;
        mceVar.getClass();
        nga ngaVar = mccVar.f;
        if (!ngaVar.c()) {
            mccVar.f = nfm.H(ngaVar);
        }
        mccVar.f.add(mceVar);
    }

    public final void dO(int i, nfh nfhVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mpe mpeVar = (mpe) this.b;
        mpc mpcVar = (mpc) nfhVar.cz();
        mpe mpeVar2 = mpe.b;
        mpcVar.getClass();
        nga ngaVar = mpeVar.a;
        if (!ngaVar.c()) {
            mpeVar.a = nfm.H(ngaVar);
        }
        mpeVar.a.set(i, mpcVar);
    }

    public final void dP(int i, nfh nfhVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mpc mpcVar = (mpc) this.b;
        mpb mpbVar = (mpb) nfhVar.cz();
        mpc mpcVar2 = mpc.e;
        mpbVar.getClass();
        mpcVar.b();
        mpcVar.d.set(i, mpbVar);
    }

    public final void dQ(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mrm mrmVar = (mrm) this.b;
        mrm mrmVar2 = mrm.p;
        nga ngaVar = mrmVar.f;
        if (!ngaVar.c()) {
            mrmVar.f = nfm.H(ngaVar);
        }
        ndt.cs(iterable, mrmVar.f);
    }

    public final void dR(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mtk mtkVar = (mtk) this.b;
        mtk mtkVar2 = mtk.f;
        nga ngaVar = mtkVar.c;
        if (!ngaVar.c()) {
            mtkVar.c = nfm.H(ngaVar);
        }
        ndt.cs(iterable, mtkVar.c);
    }

    public final void dS(mux muxVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mve mveVar = (mve) this.b;
        mve mveVar2 = mve.g;
        muxVar.getClass();
        nga ngaVar = mveVar.e;
        if (!ngaVar.c()) {
            mveVar.e = nfm.H(ngaVar);
        }
        mveVar.e.add(muxVar);
    }

    public final void dT(String str) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mwb mwbVar = (mwb) this.b;
        mwb mwbVar2 = mwb.b;
        str.getClass();
        nga ngaVar = mwbVar.a;
        if (!ngaVar.c()) {
            mwbVar.a = nfm.H(ngaVar);
        }
        mwbVar.a.add(str);
    }

    public final void dU(String str) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mwf mwfVar = (mwf) this.b;
        mwf mwfVar2 = mwf.d;
        str.getClass();
        nga ngaVar = mwfVar.a;
        if (!ngaVar.c()) {
            mwfVar.a = nfm.H(ngaVar);
        }
        mwfVar.a.add(str);
    }

    public final void dV(String str) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mwf mwfVar = (mwf) this.b;
        mwf mwfVar2 = mwf.d;
        str.getClass();
        nga ngaVar = mwfVar.b;
        if (!ngaVar.c()) {
            mwfVar.b = nfm.H(ngaVar);
        }
        mwfVar.b.add(str);
    }

    public final void dW(mwj mwjVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mwi mwiVar = (mwi) this.b;
        mwi mwiVar2 = mwi.d;
        mwjVar.getClass();
        mwiVar.b();
        mwiVar.b.add(mwjVar);
    }

    public final void dX(String str) {
        if (this.c) {
            cD();
            this.c = false;
        }
        ncx ncxVar = (ncx) this.b;
        ncx ncxVar2 = ncx.e;
        nga ngaVar = ncxVar.a;
        if (!ngaVar.c()) {
            ncxVar.a = nfm.H(ngaVar);
        }
        ncxVar.a.add(str);
    }

    public final void dY(nix nixVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        niw niwVar = (niw) this.b;
        niw niwVar2 = niw.c;
        nixVar.getClass();
        nga ngaVar = niwVar.b;
        if (!ngaVar.c()) {
            niwVar.b = nfm.H(ngaVar);
        }
        niwVar.b.add(nixVar);
    }

    public final void dZ(int i) {
        if (this.c) {
            cD();
            this.c = false;
        }
        niw niwVar = (niw) this.b;
        niw niwVar2 = niw.c;
        nfs nfsVar = niwVar.a;
        if (!nfsVar.c()) {
            niwVar.a = nfm.D(nfsVar);
        }
        niwVar.a.g(i - 1);
    }

    public final void da(String str) {
        str.getClass();
        if (this.c) {
            cD();
            this.c = false;
        }
        jio jioVar = jio.d;
        ((jio) this.b).b().remove(str);
    }

    public final void db(String str, jiu jiuVar) {
        str.getClass();
        jiuVar.getClass();
        if (this.c) {
            cD();
            this.c = false;
        }
        jiw jiwVar = jiw.b;
        ((jiw) this.b).b().put(str, jiuVar);
    }

    public final void dc(String str) {
        str.getClass();
        if (this.c) {
            cD();
            this.c = false;
        }
        jiw jiwVar = jiw.b;
        ((jiw) this.b).b().remove(str);
    }

    public final void dd(joe joeVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        jof jofVar = (jof) this.b;
        jof jofVar2 = jof.b;
        joeVar.getClass();
        jofVar.b();
        jofVar.a.add(joeVar);
    }

    public final void de(String str) {
        if (this.c) {
            cD();
            this.c = false;
        }
        kke kkeVar = (kke) this.b;
        kke kkeVar2 = kke.d;
        str.getClass();
        nga ngaVar = kkeVar.b;
        if (!ngaVar.c()) {
            kkeVar.b = nfm.H(ngaVar);
        }
        kkeVar.b.add(str);
    }

    public final void df(String str, kke kkeVar) {
        str.getClass();
        kkeVar.getClass();
        if (this.c) {
            cD();
            this.c = false;
        }
        kkg kkgVar = (kkg) this.b;
        kkg kkgVar2 = kkg.b;
        ngu nguVar = kkgVar.a;
        if (!nguVar.b) {
            kkgVar.a = nguVar.a();
        }
        kkgVar.a.put(str, kkeVar);
    }

    public final void dg(mei meiVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        maf mafVar = (maf) this.b;
        maf mafVar2 = maf.o;
        meiVar.getClass();
        nga ngaVar = mafVar.l;
        if (!ngaVar.c()) {
            mafVar.l = nfm.H(ngaVar);
        }
        mafVar.l.add(meiVar);
    }

    public final void dh(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mbc mbcVar = (mbc) this.b;
        mbc mbcVar2 = mbc.p;
        mbcVar.b();
        ndt.cs(iterable, mbcVar.o);
    }

    public final void di(String str) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mbw mbwVar = (mbw) this.b;
        mbw mbwVar2 = mbw.k;
        str.getClass();
        nga ngaVar = mbwVar.d;
        if (!ngaVar.c()) {
            mbwVar.d = nfm.H(ngaVar);
        }
        mbwVar.d.add(str);
    }

    public final void dj(String str) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mcc mccVar = (mcc) this.b;
        mcc mccVar2 = mcc.aB;
        str.getClass();
        nga ngaVar = mccVar.at;
        if (!ngaVar.c()) {
            mccVar.at = nfm.H(ngaVar);
        }
        mccVar.at.add(str);
    }

    public final void dk(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mcf mcfVar = (mcf) this.b;
        mcf mcfVar2 = mcf.k;
        mcfVar.b();
        ndt.cs(iterable, mcfVar.g);
    }

    public final void dl(String str) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mcs mcsVar = (mcs) this.b;
        mcs mcsVar2 = mcs.c;
        str.getClass();
        mcsVar.b();
        mcsVar.b.add(str);
    }

    public final void dm(mec mecVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mee meeVar = (mee) this.b;
        mee meeVar2 = mee.d;
        mecVar.getClass();
        nga ngaVar = meeVar.c;
        if (!ngaVar.c()) {
            meeVar.c = nfm.H(ngaVar);
        }
        meeVar.c.add(mecVar);
    }

    public final void dn(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mfa mfaVar = (mfa) this.b;
        mfa mfaVar2 = mfa.w;
        nga ngaVar = mfaVar.f;
        if (!ngaVar.c()) {
            mfaVar.f = nfm.H(ngaVar);
        }
        ndt.cs(iterable, mfaVar.f);
    }

    /* renamed from: do  reason: not valid java name */
    public final void m67do(String str) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mfb mfbVar = (mfb) this.b;
        mfb mfbVar2 = mfb.d;
        nga ngaVar = mfbVar.c;
        if (!ngaVar.c()) {
            mfbVar.c = nfm.H(ngaVar);
        }
        mfbVar.c.add(str);
    }

    public final void dp(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mfq mfqVar = (mfq) this.b;
        mfq mfqVar2 = mfq.g;
        nga ngaVar = mfqVar.f;
        if (!ngaVar.c()) {
            mfqVar.f = nfm.H(ngaVar);
        }
        ndt.cs(iterable, mfqVar.f);
    }

    public final mpc dq(int i) {
        return (mpc) ((mpe) this.b).a.get(i);
    }

    public final void dr(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mpk mpkVar = (mpk) this.b;
        mpk mpkVar2 = mpk.b;
        mpkVar.b();
        ndt.cs(iterable, mpkVar.a);
    }

    public final void ds(String str) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mpk mpkVar = (mpk) this.b;
        mpk mpkVar2 = mpk.b;
        str.getClass();
        mpkVar.b();
        mpkVar.a.add(str);
    }

    public final void dt(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mpp mppVar = (mpp) this.b;
        mpp mppVar2 = mpp.b;
        mppVar.b();
        ndt.cs(iterable, mppVar.a);
    }

    public final void du(String str) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mpp mppVar = (mpp) this.b;
        mpp mppVar2 = mpp.b;
        mppVar.b();
        mppVar.a.add(str);
    }

    public final void dv(mvo mvoVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mqa mqaVar = (mqa) this.b;
        mqa mqaVar2 = mqa.f;
        mvoVar.getClass();
        nga ngaVar = mqaVar.c;
        if (!ngaVar.c()) {
            mqaVar.c = nfm.H(ngaVar);
        }
        mqaVar.c.add(mvoVar);
    }

    public final void dw(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mqd mqdVar = (mqd) this.b;
        mqd mqdVar2 = mqd.f;
        mqdVar.b();
        ndt.cs(iterable, mqdVar.e);
    }

    public final void dx(String str) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mqd mqdVar = (mqd) this.b;
        mqd mqdVar2 = mqd.f;
        str.getClass();
        mqdVar.b();
        mqdVar.e.add(str);
    }

    public final void dy(String str, mqd mqdVar) {
        str.getClass();
        mqdVar.getClass();
        if (this.c) {
            cD();
            this.c = false;
        }
        mqf mqfVar = (mqf) this.b;
        mqf mqfVar2 = mqf.b;
        ngu nguVar = mqfVar.a;
        if (!nguVar.b) {
            mqfVar.a = nguVar.a();
        }
        mqfVar.a.put(str, mqdVar);
    }

    public final void dz(float f) {
        if (this.c) {
            cD();
            this.c = false;
        }
        mqn mqnVar = (mqn) this.b;
        mqn mqnVar2 = mqn.j;
        mqnVar.a |= 256;
        mqnVar.i = f;
    }

    public final void eA(long j) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onlVar.b |= 65536;
        onlVar.ai = j;
    }

    public final void eB(long j) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onlVar.b |= 1048576;
        onlVar.am = j;
    }

    public final void eC(int i, onk onkVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onkVar.getClass();
        onlVar.i();
        onlVar.l.set(i, onkVar);
    }

    public final void eD(onk onkVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onlVar.aj = onkVar;
        onlVar.b |= 131072;
    }

    public final void eE(int i, onk onkVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onkVar.getClass();
        onlVar.j();
        onlVar.n.set(i, onkVar);
    }

    public final void eF(int i, onk onkVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onkVar.getClass();
        onlVar.h();
        onlVar.k.set(i, onkVar);
    }

    public final void eG(long j) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onlVar.b |= 524288;
        onlVar.al = j;
    }

    public final void eH(long j) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onlVar.b |= 262144;
        onlVar.ak = j;
    }

    public final void eI(int i, onk onkVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onkVar.getClass();
        onlVar.g();
        onlVar.j.set(i, onkVar);
    }

    public final void eJ(int i, onk onkVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onkVar.getClass();
        onlVar.c();
        onlVar.g.set(i, onkVar);
    }

    public final void eK(int i, onk onkVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onkVar.getClass();
        onlVar.e();
        onlVar.h.set(i, onkVar);
    }

    public final void eL(int i, onk onkVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onkVar.getClass();
        onlVar.f();
        onlVar.i.set(i, onkVar);
    }

    public final void eM(int i) {
        if (this.c) {
            cD();
            this.c = false;
        }
        ooo oooVar = (ooo) this.b;
        ooo oooVar2 = ooo.c;
        nfs nfsVar = oooVar.b;
        if (!nfsVar.c()) {
            oooVar.b = nfm.D(nfsVar);
        }
        oooVar.b.g(i);
    }

    public final void eN(int i) {
        if (this.c) {
            cD();
            this.c = false;
        }
        ooo oooVar = (ooo) this.b;
        ooo oooVar2 = ooo.c;
        nfs nfsVar = oooVar.a;
        if (!nfsVar.c()) {
            oooVar.a = nfm.D(nfsVar);
        }
        oooVar.a.g(i);
    }

    public final void eO(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        oxn oxnVar = (oxn) this.b;
        oxn oxnVar2 = oxn.b;
        oxnVar.c();
        ndt.cs(iterable, oxnVar.a);
    }

    public final void eP(nem nemVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        oxn oxnVar = (oxn) this.b;
        oxn oxnVar2 = oxn.b;
        oxnVar.c();
        oxnVar.a.add(nemVar);
    }

    public final void eQ(String str, oxp oxpVar) {
        str.getClass();
        oxpVar.getClass();
        if (this.c) {
            cD();
            this.c = false;
        }
        oxr oxrVar = (oxr) this.b;
        oxr oxrVar2 = oxr.b;
        ngu nguVar = oxrVar.a;
        if (!nguVar.b) {
            oxrVar.a = nguVar.a();
        }
        oxrVar.a.put(str, oxpVar);
    }

    public final void eR(float f) {
        if (this.c) {
            cD();
            this.c = false;
        }
        oxs oxsVar = (oxs) this.b;
        oxs oxsVar2 = oxs.b;
        nfr nfrVar = oxsVar.a;
        if (!nfrVar.c()) {
            int size = nfrVar.size();
            oxsVar.a = nfrVar.f(size == 0 ? 10 : size + size);
        }
        oxsVar.a.g(f);
    }

    public final void eS(long j) {
        if (this.c) {
            cD();
            this.c = false;
        }
        oxt oxtVar = (oxt) this.b;
        oxt oxtVar2 = oxt.b;
        oxtVar.c();
        oxtVar.a.f(j);
    }

    public final void eT(Map map) {
        if (this.c) {
            cD();
            this.c = false;
        }
        pbz pbzVar = (pbz) this.b;
        pbz pbzVar2 = pbz.e;
        ngu nguVar = pbzVar.c;
        if (!nguVar.b) {
            pbzVar.c = nguVar.a();
        }
        pbzVar.c.putAll(map);
    }

    public final void ea(niw niwVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        nix nixVar = (nix) this.b;
        nix nixVar2 = nix.c;
        niwVar.getClass();
        nga ngaVar = nixVar.b;
        if (!ngaVar.c()) {
            nixVar.b = nfm.H(ngaVar);
        }
        nixVar.b.add(niwVar);
    }

    public final void eb(int i) {
        if (this.c) {
            cD();
            this.c = false;
        }
        nix nixVar = (nix) this.b;
        nix nixVar2 = nix.c;
        nfs nfsVar = nixVar.a;
        if (!nfsVar.c()) {
            nixVar.a = nfm.D(nfsVar);
        }
        nixVar.a.g(i - 1);
    }

    public final void ec(niw niwVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        niy niyVar = (niy) this.b;
        niy niyVar2 = niy.c;
        niwVar.getClass();
        niyVar.b = niwVar;
        niyVar.a = 2;
    }

    public final void ed(nix nixVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        niy niyVar = (niy) this.b;
        niy niyVar2 = niy.c;
        nixVar.getClass();
        niyVar.b = nixVar;
        niyVar.a = 3;
    }

    public final void ee(int i) {
        if (this.c) {
            cD();
            this.c = false;
        }
        niy niyVar = (niy) this.b;
        niy niyVar2 = niy.c;
        niyVar.b = Integer.valueOf(i - 1);
        niyVar.a = 1;
    }

    public final void ef(long j) {
        if (this.c) {
            cD();
            this.c = false;
        }
        nja njaVar = (nja) this.b;
        nja njaVar2 = nja.m;
        njaVar.c();
        njaVar.k.f(j);
    }

    public final void eg(String str) {
        if (this.c) {
            cD();
            this.c = false;
        }
        njc njcVar = (njc) this.b;
        njc njcVar2 = njc.b;
        nga ngaVar = njcVar.a;
        if (!ngaVar.c()) {
            njcVar.a = nfm.H(ngaVar);
        }
        njcVar.a.add(str);
    }

    public final void eh(nfh nfhVar) {
        if (this.c) {
            cD();
            this.c = false;
        }
        nns nnsVar = (nns) this.b;
        nnr nnrVar = (nnr) nfhVar.cz();
        nns nnsVar2 = nns.d;
        nnrVar.getClass();
        nga ngaVar = nnsVar.c;
        if (!ngaVar.c()) {
            nnsVar.c = nfm.H(ngaVar);
        }
        nnsVar.c.add(nnrVar);
    }

    public final void ei(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        ong ongVar = (ong) this.b;
        ong ongVar2 = ong.e;
        nga ngaVar = ongVar.b;
        if (!ngaVar.c()) {
            ongVar.b = nfm.H(ngaVar);
        }
        ndt.cs(iterable, ongVar.b);
    }

    public final void ej(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        ong ongVar = (ong) this.b;
        ong ongVar2 = ong.e;
        nga ngaVar = ongVar.c;
        if (!ngaVar.c()) {
            ongVar.c = nfm.H(ngaVar);
        }
        ndt.cs(iterable, ongVar.c);
    }

    public final onk ek(int i) {
        return (onk) ((onl) this.b).g.get(i);
    }

    public final onk el(int i) {
        return (onk) ((onl) this.b).h.get(i);
    }

    public final onk em(int i) {
        return (onk) ((onl) this.b).i.get(i);
    }

    public final onk en(int i) {
        return (onk) ((onl) this.b).j.get(i);
    }

    public final onk eo(int i) {
        return (onk) ((onl) this.b).k.get(i);
    }

    public final onk ep(int i) {
        return (onk) ((onl) this.b).l.get(i);
    }

    public final onk eq(int i) {
        return (onk) ((onl) this.b).n.get(i);
    }

    public final void er(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onlVar.i();
        ndt.cs(iterable, onlVar.l);
    }

    public final void es(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onlVar.j();
        ndt.cs(iterable, onlVar.n);
    }

    public final void et(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        nga ngaVar = onlVar.q;
        if (!ngaVar.c()) {
            onlVar.q = nfm.H(ngaVar);
        }
        ndt.cs(iterable, onlVar.q);
    }

    public final void eu(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        nga ngaVar = onlVar.p;
        if (!ngaVar.c()) {
            onlVar.p = nfm.H(ngaVar);
        }
        ndt.cs(iterable, onlVar.p);
    }

    public final void ev(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onlVar.h();
        ndt.cs(iterable, onlVar.k);
    }

    public final void ew(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onlVar.g();
        ndt.cs(iterable, onlVar.j);
    }

    public final void ex(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onlVar.c();
        ndt.cs(iterable, onlVar.g);
    }

    public final void ey(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onlVar.e();
        ndt.cs(iterable, onlVar.h);
    }

    public final void ez(Iterable iterable) {
        if (this.c) {
            cD();
            this.c = false;
        }
        onl onlVar = (onl) this.b;
        onl onlVar2 = onl.an;
        onlVar.f();
        ndt.cs(iterable, onlVar.i);
    }

    public nfh(short[] sArr, char[] cArr) {
        this(mrm.p);
    }

    public nfh(byte[][] bArr, char[] cArr) {
        this(mtk.f);
    }

    public nfh(short[][][] sArr, char[] cArr) {
        this(mty.e);
    }

    public nfh(boolean[] zArr, short[] sArr) {
        this(muu.b);
    }

    public nfh(boolean[][] zArr, char[] cArr) {
        this(muv.x);
    }

    public nfh(char[] cArr) {
        this(mve.g);
    }

    public nfh(boolean[] zArr) {
        this(mvm.l);
    }

    public nfh(char[][][] cArr) {
        this(mvp.b);
    }

    public nfh(boolean[][] zArr) {
        this(mwb.b);
    }

    public nfh(boolean[][][] zArr) {
        this(mwd.b);
    }

    public nfh(char[][] cArr) {
        this(mwf.d);
    }

    public nfh(char[] cArr, byte[] bArr) {
        this(mwg.c);
    }

    public nfh(boolean[] zArr, byte[] bArr) {
        this(mwi.d);
    }

    public nfh(char[][][] cArr, byte[] bArr) {
        this(mwj.t);
    }

    public nfh(boolean[][] zArr, byte[] bArr) {
        this(mwt.b);
    }

    public nfh(boolean[][][] zArr, byte[] bArr) {
        this(mxa.u);
    }

    public nfh(char[][] cArr, byte[] bArr) {
        this(mxd.b);
    }

    public nfh(char[] cArr, char[] cArr2) {
        this(mxg.d);
    }

    public nfh(float[] fArr, char[] cArr) {
        this(mxm.h);
    }

    public nfh(float[][][] fArr, char[] cArr) {
        this(mxp.m);
    }

    public nfh(char[][][] cArr, char[] cArr2) {
        this(mxs.b);
    }

    public nfh(int[] iArr, short[] sArr) {
        this(mxu.e);
    }

    public nfh(int[][] iArr, char[] cArr) {
        this(mze.A);
    }

    public nfh(short[] sArr) {
        this(nce.b);
    }

    public nfh(float[] fArr) {
        this(ncx.e);
    }

    public nfh(short[][][] sArr) {
        this(ndc.h);
    }

    public nfh(nfm nfmVar) {
        this.a = nfmVar;
        this.b = (nfm) nfmVar.N(4);
        this.c = false;
    }

    public nfh(float[][] fArr) {
        this(niw.c);
    }

    public nfh(float[][][] fArr) {
        this(nix.c);
    }

    public nfh(short[][] sArr) {
        this(niy.c);
    }

    public nfh(short[] sArr, byte[] bArr) {
        this(nja.m);
    }

    public nfh(float[] fArr, byte[] bArr) {
        this(njc.b);
    }

    public nfh(short[][][] sArr, byte[] bArr) {
        this(njl.j);
    }

    public nfh(float[][] fArr, byte[] bArr) {
        this(nkv.f);
    }

    public nfh(float[][][] fArr, byte[] bArr) {
        this(nkx.m);
    }

    public nfh(short[][] sArr, byte[] bArr) {
        this(nlh.e);
    }

    public nfh(int[] iArr, char[] cArr) {
        this(nmo.d);
    }

    public nfh(char[][] cArr, char[] cArr2) {
        this(nns.d);
    }

    public nfh(char[] cArr, short[] sArr) {
        this(nnz.f);
    }

    public nfh(int[][][] iArr, char[] cArr) {
        this(noi.b);
    }

    public nfh(float[] fArr, short[] sArr) {
        this(non.d);
    }

    public nfh(float[][] fArr, char[] cArr) {
        this(noo.e);
    }

    public nfh(byte[] bArr) {
        this(omz.e);
    }

    public nfh(int[] iArr) {
        this(ong.e);
    }

    public nfh(byte[][][] bArr) {
        this(onl.an);
    }

    public nfh(int[][] iArr) {
        this(onv.u);
    }

    public nfh(int[][][] iArr) {
        this(onw.b);
    }

    public nfh(byte[][] bArr) {
        this(onx.b);
    }

    public nfh(byte[] bArr, byte[] bArr2) {
        this(ook.o);
    }

    public nfh(int[] iArr, byte[] bArr) {
        this(oon.k);
    }

    public nfh(byte[][][] bArr, byte[] bArr2) {
        this(oom.f);
    }

    public nfh(int[][] iArr, byte[] bArr) {
        this(ooo.c);
    }

    public nfh(int[][][] iArr, byte[] bArr) {
        this(oos.u);
    }

    public nfh(byte[][] bArr, byte[] bArr2) {
        this(oxn.b);
    }

    public nfh(byte[] bArr, char[] cArr) {
        this(oxr.b);
    }

    public nfh(boolean[] zArr, char[] cArr) {
        this(oxs.b);
    }

    public nfh(boolean[][][] zArr, char[] cArr) {
        this(oxt.b);
    }

    public nfh(byte[][][] bArr, char[] cArr) {
        this(pbz.e);
    }

    public nfh(short[] sArr, short[] sArr2) {
        this(pcd.h);
    }

    public nfh(short[][] sArr, char[] cArr) {
        this(pcg.f);
    }
}
