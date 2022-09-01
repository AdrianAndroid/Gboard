package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: eqv  reason: default package */
/* loaded from: classes.dex */
public final class eqv {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public eqv() {
        this.d = new AtomicInteger(0);
        this.b = new AtomicInteger(0);
        this.a = new AtomicInteger(0);
        this.c = new AtomicBoolean(false);
    }

    public eqv(Context context, iav iavVar, hls hlsVar, ino inoVar) {
        this.b = context;
        this.d = iavVar;
        this.a = hlsVar;
        this.c = inoVar;
    }

    public eqv(eqp eqpVar, eqp eqpVar2, euu euuVar, eut eutVar) {
        this.a = eqpVar;
        this.b = eqpVar2;
        this.c = euuVar;
        this.d = eutVar;
    }

    public eqv(Runnable runnable) {
        this.b = new dbb(this, null);
        this.a = new dbc(this, null);
        this.c = new dbd(this, null);
        this.d = runnable;
    }

    private static boolean e() {
        mqu mquVar = (mqu) doa.aP.j();
        return !mquVar.c.isEmpty() || !mquVar.d.isEmpty() || !mquVar.e.isEmpty() || !mquVar.f.isEmpty() || mquVar.a > 0.0f || mquVar.b > 0.0f;
    }

    public final int a() {
        int i = ((eqp) this.a).b;
        Object obj = this.b;
        return obj != null ? i + ((eqp) obj).b : i;
    }

    /* JADX WARN: Type inference failed for: r0v264, types: [java.lang.Object, hls] */
    public final mql b(List list) {
        Object obj = this.b;
        boolean z = true;
        if (((lrl) list).c <= 1) {
            z = false;
        }
        boolean m = ebl.m((Context) obj, z);
        mrt mrtVar = (mrt) mql.cN.t();
        boolean booleanValue = ((Boolean) doa.ej.c()).booleanValue();
        if (mrtVar.c) {
            mrtVar.cD();
            mrtVar.c = false;
        }
        ((mql) mrtVar.b).l(booleanValue);
        boolean booleanValue2 = ((Boolean) doa.el.c()).booleanValue();
        mrtVar.cC();
        ((mql) mrtVar.b).b(booleanValue2);
        mrtVar.bB(((Boolean) doa.ek.c()).booleanValue());
        mrtVar.cl(((Boolean) doa.en.c()).booleanValue());
        mrtVar.aA(((Double) doa.h.c()).floatValue());
        mrtVar.aD((String) doa.bp.c());
        mrtVar.H(ebl.j("km,lo,th", list));
        mrtVar.bF(((Boolean) doa.bq.c()).booleanValue());
        mrtVar.bn(((Double) doa.W.c()).floatValue());
        mrtVar.am(((Double) doa.X.c()).floatValue());
        mrtVar.L(((Boolean) doa.br.c()).booleanValue());
        mrtVar.q(((Boolean) doa.bs.c()).booleanValue());
        mrtVar.I(((Boolean) doa.bt.c()).booleanValue());
        mrtVar.bP(((Double) doa.Y.c()).floatValue());
        mrtVar.ae(((Double) doa.Z.c()).floatValue());
        mrtVar.af(((Double) doa.aa.c()).floatValue());
        mrtVar.ah(((Double) doa.ab.c()).floatValue());
        mrtVar.an(((Double) doa.ac.c()).floatValue());
        mrtVar.bQ(((Boolean) doa.ad.c()).booleanValue());
        mrtVar.bH(((Boolean) doa.ae.c()).booleanValue());
        mrtVar.bG(((Boolean) cas.x.c()).booleanValue());
        mrtVar.cb(((Double) doa.ag.c()).floatValue());
        mrtVar.cc(((Double) doa.ah.c()).floatValue());
        mrtVar.ac(((Double) doa.ai.c()).floatValue());
        mrtVar.ad(((Double) doa.aj.c()).floatValue());
        mrtVar.Y(((Double) doa.af.c()).floatValue());
        mrtVar.W(((Double) doa.ak.c()).floatValue());
        mrtVar.k(((Double) doa.al.c()).floatValue());
        mrtVar.l(((Double) doa.am.c()).floatValue());
        mrtVar.ak(((Long) doa.m.c()).intValue());
        mrtVar.ai(((Double) doa.an.c()).floatValue());
        mrtVar.aj(((Double) doa.cu.c()).floatValue());
        mrtVar.al(((Double) doa.ao.c()).floatValue());
        mrtVar.aw(((Long) doa.n.c()).intValue());
        mrtVar.ax(((Double) doa.ap.c()).floatValue());
        mrtVar.ay(((Long) doa.o.c()).intValue());
        mrtVar.cg(((Double) doa.aq.c()).floatValue());
        float f = 0.0f;
        float floatValue = m ? ((Double) doa.ax.c()).floatValue() : 0.0f;
        if (mrtVar.c) {
            mrtVar.cD();
            mrtVar.c = false;
        }
        mql mqlVar = (mql) mrtVar.b;
        mqlVar.c |= 2048;
        mqlVar.aB = floatValue;
        if (m) {
            f = ((Double) doa.ay.c()).floatValue();
        }
        if (mrtVar.c) {
            mrtVar.cD();
            mrtVar.c = false;
        }
        mql mqlVar2 = (mql) mrtVar.b;
        mqlVar2.c |= 4096;
        mqlVar2.aC = f;
        String str = "";
        String str2 = m ? (String) doa.az.c() : str;
        if (mrtVar.c) {
            mrtVar.cD();
            mrtVar.c = false;
        }
        mql mqlVar3 = (mql) mrtVar.b;
        str2.getClass();
        mqlVar3.c |= 8192;
        mqlVar3.aD = str2;
        String str3 = m ? (String) doa.aA.c() : str;
        if (mrtVar.c) {
            mrtVar.cD();
            mrtVar.c = false;
        }
        mql mqlVar4 = (mql) mrtVar.b;
        str3.getClass();
        mqlVar4.b |= 131072;
        mqlVar4.ad = str3;
        String str4 = m ? (String) doa.aB.c() : str;
        if (mrtVar.c) {
            mrtVar.cD();
            mrtVar.c = false;
        }
        mql mqlVar5 = (mql) mrtVar.b;
        str4.getClass();
        mqlVar5.b |= 262144;
        mqlVar5.ae = str4;
        String str5 = m ? (String) doa.aC.c() : str;
        if (mrtVar.c) {
            mrtVar.cD();
            mrtVar.c = false;
        }
        mql mqlVar6 = (mql) mrtVar.b;
        str5.getClass();
        mqlVar6.b |= 524288;
        mqlVar6.af = str5;
        if (m) {
            str = (String) doa.aD.c();
        }
        if (mrtVar.c) {
            mrtVar.cD();
            mrtVar.c = false;
        }
        mql mqlVar7 = (mql) mrtVar.b;
        str.getClass();
        mqlVar7.b |= 1048576;
        mqlVar7.ag = str;
        float floatValue2 = ((Double) doa.aE.c()).floatValue();
        if (mrtVar.c) {
            mrtVar.cD();
            mrtVar.c = false;
        }
        ((mql) mrtVar.b).h(floatValue2);
        float floatValue3 = ((Double) doa.ar.c()).floatValue();
        if (mrtVar.c) {
            mrtVar.cD();
            mrtVar.c = false;
        }
        ((mql) mrtVar.b).f(floatValue3);
        boolean booleanValue3 = ((Boolean) doa.bu.c()).booleanValue();
        mrtVar.cC();
        ((mql) mrtVar.b).g(booleanValue3);
        mrtVar.bc(((Double) doa.as.c()).floatValue());
        mrtVar.cd(((Double) doa.at.c()).floatValue());
        mrtVar.ce(((Double) doa.au.c()).floatValue());
        mrtVar.cf(((Double) doa.av.c()).floatValue());
        mrtVar.aB(((Long) doa.aw.c()).intValue());
        mrtVar.ag(((Double) doa.aK.c()).floatValue());
        mrtVar.Q(((Boolean) doa.bv.c()).booleanValue());
        mrtVar.M(((Boolean) doa.bw.c()).booleanValue());
        mrtVar.z(((Boolean) doa.bx.c()).booleanValue());
        mrtVar.x(((Double) doa.by.c()).floatValue());
        mrtVar.w(((Double) doa.bz.c()).floatValue());
        mrtVar.y(((Double) doa.bA.c()).floatValue());
        mrtVar.v(((Long) doa.bB.c()).intValue());
        mrtVar.cm(msc.e(((Long) doa.p.c()).intValue()));
        mrtVar.aL(((Long) dca.a.c()).intValue());
        mrtVar.u(((Boolean) doa.de.c()).booleanValue());
        mrtVar.aM(((Long) doa.dk.c()).intValue());
        mrtVar.aP(((Long) doa.dj.c()).intValue());
        mrtVar.K(((Boolean) doa.dv.c()).booleanValue());
        mrtVar.bb(((Boolean) doa.dw.c()).booleanValue());
        mrtVar.aC(((Double) doa.dx.c()).floatValue());
        mrtVar.az(((Double) doa.dy.c()).floatValue());
        mrtVar.i(((Boolean) doa.dA.c()).booleanValue());
        mrtVar.bX(((Boolean) doa.dB.c()).booleanValue());
        mrtVar.X(((Boolean) doa.dC.c()).booleanValue());
        mrtVar.bI(((Boolean) doa.dD.c()).booleanValue());
        mrtVar.ca(((Boolean) doa.dF.c()).booleanValue());
        mrtVar.h(((Boolean) doa.dE.c()).booleanValue());
        mrtVar.bl(((Double) doa.dG.c()).floatValue());
        mrtVar.bm(((Double) doa.dH.c()).floatValue());
        mrtVar.bi(((Double) doa.dI.c()).floatValue());
        mrtVar.bj(((Double) doa.dJ.c()).floatValue());
        mrtVar.bD(((Double) doa.dK.c()).floatValue());
        mrtVar.bE(((Double) doa.dL.c()).floatValue());
        mrtVar.bk(((Double) doa.dO.c()).floatValue());
        mrtVar.ci(((Double) doa.dM.c()).floatValue());
        mrtVar.cj(((Double) doa.dN.c()).floatValue());
        mrtVar.bR(((Double) doa.dP.c()).floatValue());
        mrtVar.bY(((Boolean) doa.dQ.c()).booleanValue());
        mrtVar.aa(((Boolean) doa.dR.c()).booleanValue());
        mrtVar.bZ(((Boolean) doa.dS.c()).booleanValue());
        mrtVar.e(((Boolean) doa.dT.c()).booleanValue());
        mrtVar.aF(((Boolean) doa.bP.c()).booleanValue());
        mrtVar.aH(((Boolean) doa.bQ.c()).booleanValue());
        mrtVar.bJ(((Boolean) doa.aF.c()).booleanValue());
        mrtVar.bK(((Boolean) doa.aG.c()).booleanValue());
        mrtVar.ch((mvy) doa.aH.j());
        mrtVar.bC((mvx) doa.aI.j());
        mrtVar.p(((Long) doa.dW.c()).intValue());
        mrtVar.o(((Boolean) doa.dY.c()).booleanValue());
        mrtVar.ck(((Boolean) doa.ea.c()).booleanValue());
        mrtVar.bg(((Boolean) doa.Q.c()).booleanValue());
        mrtVar.aE(((Boolean) doa.ed.c()).booleanValue());
        mrtVar.B((String) doa.ee.c());
        mrtVar.bN(((Boolean) doa.ef.c()).booleanValue());
        mrtVar.bO(((Boolean) doa.eg.c()).booleanValue());
        mrtVar.be(((Boolean) doa.ei.c()).booleanValue());
        mrtVar.C(((Boolean) doa.em.c()).booleanValue());
        mrtVar.bV(((Double) doa.eo.c()).floatValue());
        mrtVar.bU(((Long) doa.ep.c()).intValue());
        mrtVar.bT(((Double) doa.eq.c()).floatValue());
        mrtVar.bS(((Boolean) doa.er.c()).booleanValue());
        mrtVar.ao(ebl.n(this.a));
        mrtVar.ab(((Boolean) doa.et.c()).booleanValue());
        mrtVar.Z(((Boolean) doa.eu.c()).booleanValue());
        mrtVar.j(((Boolean) doa.ex.c()).booleanValue());
        mrtVar.bf(((Long) doa.ey.c()).intValue());
        mrtVar.av(((Boolean) doa.ev.c()).booleanValue());
        mrtVar.O(((Boolean) doa.eh.c()).booleanValue());
        mrtVar.bh(((Boolean) doa.eA.c()).booleanValue());
        mrtVar.bd((String) doa.eB.c());
        int intValue = ((Long) doa.da.c()).intValue();
        mrtVar.V(intValue & (-5));
        if ((((Boolean) doa.db.c()).booleanValue() || (intValue & 4) != 0) && !((ino) this.c).aj(R.string.f161920_resource_name_obfuscated_res_0x7f1406e1)) {
            long j = ((mql) mrtVar.b).bf | 4;
            if (mrtVar.c) {
                mrtVar.cD();
                mrtVar.c = false;
            }
            ((mql) mrtVar.b).i(j);
        }
        if (e()) {
            mqu mquVar = (mqu) doa.aP.j();
            if (mrtVar.c) {
                mrtVar.cD();
                mrtVar.c = false;
            }
            mql mqlVar8 = (mql) mrtVar.b;
            mquVar.getClass();
            mqlVar8.cM = mquVar;
            mqlVar8.g |= 32;
        }
        if (ebl.j((String) doa.ck.c(), list)) {
            boolean booleanValue4 = ((Boolean) doa.bC.c()).booleanValue();
            if (mrtVar.c) {
                mrtVar.cD();
                mrtVar.c = false;
            }
            mql mqlVar9 = (mql) mrtVar.b;
            mqlVar9.a |= 2048;
            mqlVar9.s = booleanValue4;
            boolean booleanValue5 = ((Boolean) doa.bD.c()).booleanValue();
            if (mrtVar.c) {
                mrtVar.cD();
                mrtVar.c = false;
            }
            ((mql) mrtVar.b).c(booleanValue5);
            boolean booleanValue6 = ((Boolean) doa.bE.c()).booleanValue();
            if (mrtVar.c) {
                mrtVar.cD();
                mrtVar.c = false;
            }
            ((mql) mrtVar.b).k(booleanValue6);
            boolean booleanValue7 = ((Boolean) doa.bF.c()).booleanValue();
            mrtVar.cC();
            ((mql) mrtVar.b).j(booleanValue7);
            mrtVar.aN(((Long) doa.q.c()).intValue());
            mrtVar.aQ(((Long) doa.r.c()).intValue());
            mrtVar.bp(((Long) doa.s.c()).intValue());
            mrtVar.aT(((Double) doa.aL.c()).floatValue());
            mrtVar.aS(((Double) doa.aM.c()).floatValue());
            mrtVar.aR(((Double) doa.aN.c()).floatValue());
            nfh b = mqn.b();
            b.dG(((Double) doa.cv.c()).floatValue());
            b.dF(((Double) doa.cw.c()).floatValue());
            b.dE(((Double) doa.cx.c()).floatValue());
            b.dD(((Double) doa.cy.c()).floatValue());
            b.dC(((Double) doa.cz.c()).floatValue());
            b.dz((float) ((Long) doa.cA.c()).longValue());
            b.dB(((Long) doa.t.c()).intValue());
            b.dA(((Long) doa.u.c()).intValue());
            mrtVar.au((mqn) b.cz());
        }
        boolean l = ebl.l((iav) this.d);
        if (mrtVar.c) {
            mrtVar.cD();
            mrtVar.c = false;
        }
        mql mqlVar10 = (mql) mrtVar.b;
        mqlVar10.a |= 8192;
        mqlVar10.u = l;
        boolean k = ebl.k((iav) this.d);
        if (mrtVar.c) {
            mrtVar.cD();
            mrtVar.c = false;
        }
        ((mql) mrtVar.b).d(k);
        boolean booleanValue8 = ((Boolean) doa.bG.c()).booleanValue();
        if (mrtVar.c) {
            mrtVar.cD();
            mrtVar.c = false;
        }
        ((mql) mrtVar.b).e(booleanValue8);
        mrtVar.S(((Boolean) doa.bH.c()).booleanValue());
        mrtVar.ar(((Boolean) doa.cl.c()).booleanValue());
        mrtVar.ap(((Boolean) doa.cm.c()).booleanValue());
        mrtVar.bo(((Boolean) doa.cn.c()).booleanValue());
        mrtVar.aq(((Boolean) doa.V.c()).booleanValue());
        mrtVar.n(((Long) doa.co.c()).longValue());
        mrtVar.m(((Long) doa.cp.c()).intValue());
        mrtVar.bq(((Boolean) doa.cq.c()).booleanValue());
        mrtVar.r(((Double) doa.aO.c()).floatValue());
        mrtVar.t(((Double) doa.aQ.c()).floatValue());
        mrtVar.R(((Boolean) doa.bI.c()).booleanValue());
        mrtVar.aI(((Long) doa.v.c()).intValue());
        mrtVar.aX(((Long) doa.w.c()).intValue());
        mrtVar.aY(((Double) doa.x.c()).floatValue());
        mrtVar.aZ(((Double) doa.y.c()).floatValue());
        mrtVar.ba(((Boolean) doa.z.c()).booleanValue());
        mrtVar.G(((Boolean) doa.A.c()).booleanValue());
        mrtVar.c(((Double) doa.B.c()).floatValue());
        mrtVar.d(((Double) doa.C.c()).floatValue());
        mrtVar.b(((Double) doa.D.c()).floatValue());
        mrtVar.E(((Long) doa.E.c()).intValue());
        mrtVar.F(((Double) doa.F.c()).floatValue());
        mrtVar.aG(((Boolean) doa.bJ.c()).booleanValue());
        mrtVar.U(((Boolean) doa.cG.c()).booleanValue());
        mrtVar.s(((Long) doa.cH.c()).longValue());
        mrtVar.bu(((Long) doa.cI.c()).longValue());
        mrtVar.bv(((Long) doa.cJ.c()).longValue());
        mrtVar.bw(((Long) doa.cK.c()).longValue());
        mrtVar.bx(((Long) doa.cL.c()).longValue());
        mrtVar.by(((Long) doa.cM.c()).longValue());
        mrtVar.bA(((Long) doa.cN.c()).longValue());
        mrtVar.bz(((Long) doa.cO.c()).longValue());
        mrtVar.bt(((Long) doa.cP.c()).longValue());
        mrtVar.bs(((Long) doa.cQ.c()).intValue());
        mrtVar.D(((Boolean) doa.cR.c()).booleanValue());
        mrtVar.aU(((Long) doa.cS.c()).longValue());
        mrtVar.aW(((Long) doa.cT.c()).longValue());
        mrtVar.aV(((Long) doa.cU.c()).longValue());
        mrtVar.A(((Boolean) doa.bK.c()).booleanValue());
        mrtVar.aK(((Long) doa.dd.c()).intValue());
        mrtVar.as(((Boolean) doa.dg.c()).booleanValue());
        mrtVar.f(((Long) doa.dh.c()).intValue());
        mrtVar.g(((Long) doa.di.c()).intValue());
        mrtVar.J(((Boolean) doa.f0do.c()).booleanValue());
        mrtVar.T(((Boolean) doa.dp.c()).booleanValue());
        mrtVar.P(((Boolean) doa.dq.c()).booleanValue());
        mrtVar.aO(((Long) doa.dr.c()).intValue());
        mrtVar.aJ(((Long) cas.F.c()).intValue());
        mrtVar.br(((Double) doa.ds.c()).floatValue());
        mrtVar.bM(((Double) doa.dt.c()).floatValue());
        mrtVar.bL(((Boolean) doa.du.c()).booleanValue());
        mrtVar.bW(((Boolean) doa.dU.c()).booleanValue());
        mrtVar.N(((Boolean) doa.dZ.c()).booleanValue());
        mrtVar.at(((Boolean) doa.ez.c()).booleanValue());
        return (mql) mrtVar.cz();
    }

    public final void c() {
        ((AtomicInteger) this.d).set(0);
        ((AtomicInteger) this.b).set(0);
        ((AtomicInteger) this.a).set(0);
        ((AtomicBoolean) this.c).set(false);
    }

    public final void d() {
        ((AtomicBoolean) this.c).set(true);
        ijl.b().g(new cun(((AtomicInteger) this.b).get(), ((AtomicInteger) this.a).get()));
    }
}
