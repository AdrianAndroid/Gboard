package defpackage;

import com.google.android.libraries.assistant.soda.Soda;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: hjf  reason: default package */
/* loaded from: classes.dex */
public final class hjf {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public hjf(afv afvVar, llp llpVar, llp llpVar2, llp llpVar3) {
        this.a = afvVar;
        this.b = llpVar;
        this.c = llpVar2;
        this.d = llpVar3;
    }

    public hjf(String str, String str2, String str3, feh fehVar, boolean z, Map map) {
        Soda soda = new Soda(fehVar);
        ewe b = evw.b();
        this.b = new AtomicBoolean(false);
        this.a = soda;
        nfj nfjVar = (nfj) nmn.h.t();
        nfh t = nml.c.t();
        nfh t2 = nmm.h.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        nmm nmmVar = (nmm) t2.b;
        nmmVar.d = 0;
        int i = 1;
        nmmVar.a |= 1;
        nmm nmmVar2 = (nmm) t2.b;
        nmmVar2.e = 2;
        nmmVar2.a |= 2;
        nfh t3 = nle.e.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        nle nleVar = (nle) t3.b;
        nleVar.b = 1;
        nleVar.a |= 1;
        nle.e(nleVar);
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        nle.c((nle) t3.b);
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        nmm nmmVar3 = (nmm) t2.b;
        nle nleVar2 = (nle) t3.cz();
        nleVar2.getClass();
        nmmVar3.f = nleVar2;
        nmmVar3.a |= 16;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nml nmlVar = (nml) t.b;
        nmm nmmVar4 = (nmm) t2.cz();
        nmmVar4.getClass();
        nmlVar.b = nmmVar4;
        nmlVar.a = 1;
        if (nfjVar.c) {
            nfjVar.cD();
            nfjVar.c = false;
        }
        nmn nmnVar = (nmn) nfjVar.b;
        nml nmlVar2 = (nml) t.cz();
        nmlVar2.getClass();
        nmnVar.c = nmlVar2;
        nmnVar.a |= 8;
        if (nfjVar.c) {
            nfjVar.cD();
            nfjVar.c = false;
        }
        nmn nmnVar2 = (nmn) nfjVar.b;
        int i2 = nmnVar2.a | 1;
        nmnVar2.a = i2;
        nmnVar2.b = false;
        nmnVar2.a = i2 | 1024;
        nmnVar2.g = z;
        if (b.d()) {
            nfh t4 = nld.c.t();
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            nld nldVar = (nld) t4.b;
            nldVar.b = 1;
            nldVar.a |= 2;
            if (nfjVar.c) {
                nfjVar.cD();
                nfjVar.c = false;
            }
            nmn nmnVar3 = (nmn) nfjVar.b;
            nld nldVar2 = (nld) t4.cz();
            nldVar2.getClass();
            nmnVar3.f = nldVar2;
            nmnVar3.a |= 256;
        }
        if (!map.isEmpty()) {
            nfh t5 = nmo.d.t();
            if (t5.c) {
                t5.cD();
                t5.c = false;
            }
            nmo nmoVar = (nmo) t5.b;
            nmoVar.a |= 1;
            nmoVar.b = "$OOV_CLASS_GBOARD";
            for (Map.Entry entry : map.entrySet()) {
                nfj nfjVar2 = (nfj) nmp.e.t();
                String str4 = (String) entry.getKey();
                if (nfjVar2.c) {
                    nfjVar2.cD();
                    nfjVar2.c = false;
                }
                nmp nmpVar = (nmp) nfjVar2.b;
                str4.getClass();
                nmpVar.a |= 1;
                nmpVar.b = str4;
                float floatValue = ((Float) entry.getValue()).floatValue();
                if (nfjVar2.c) {
                    nfjVar2.cD();
                    nfjVar2.c = false;
                }
                nmp nmpVar2 = (nmp) nfjVar2.b;
                nmpVar2.a |= 2;
                nmpVar2.c = floatValue;
                nmp nmpVar3 = (nmp) nfjVar2.cz();
                if (t5.c) {
                    t5.cD();
                    t5.c = false;
                }
                nmo nmoVar2 = (nmo) t5.b;
                nmpVar3.getClass();
                nga ngaVar = nmoVar2.c;
                if (!ngaVar.c()) {
                    nmoVar2.c = nfm.H(ngaVar);
                }
                nmoVar2.c.add(nmpVar3);
            }
            nfj nfjVar3 = (nfj) nmv.b.t();
            nfh t6 = nmr.e.t();
            if (t6.c) {
                t6.cD();
                t6.c = false;
            }
            nmr nmrVar = (nmr) t6.b;
            nmrVar.a |= 1;
            nmrVar.d = "gboard";
            nmo nmoVar3 = (nmo) t5.cz();
            if (t6.c) {
                t6.cD();
                t6.c = false;
            }
            nmr nmrVar2 = (nmr) t6.b;
            nmoVar3.getClass();
            nmrVar2.c = nmoVar3;
            nmrVar2.b = 3;
            nmr nmrVar3 = (nmr) t6.cz();
            if (nfjVar3.c) {
                nfjVar3.cD();
                nfjVar3.c = false;
            }
            nmv nmvVar = (nmv) nfjVar3.b;
            nmrVar3.getClass();
            nga ngaVar2 = nmvVar.a;
            if (!ngaVar2.c()) {
                nmvVar.a = nfm.H(ngaVar2);
            }
            nmvVar.a.add(nmrVar3);
            nmv nmvVar2 = (nmv) nfjVar3.cz();
            if (nfjVar.c) {
                nfjVar.cD();
                nfjVar.c = false;
            }
            nmn nmnVar4 = (nmn) nfjVar.b;
            nmvVar2.getClass();
            nmnVar4.e = nmvVar2;
            nmnVar4.a |= 32;
        }
        this.c = (nmn) nfjVar.cz();
        nfj a = gig.a(str, str3);
        nlm nlmVar = ((nln) a.b).c;
        nfj nfjVar4 = (nfj) nlm.f.u(nlmVar == null ? nlm.f : nlmVar);
        if (nfjVar4.c) {
            nfjVar4.cD();
            nfjVar4.c = false;
        }
        nlm nlmVar2 = (nlm) nfjVar4.b;
        int i3 = nlmVar2.a | 1024;
        nlmVar2.a = i3;
        nlmVar2.b = z;
        str2.getClass();
        nlmVar2.a = Integer.MIN_VALUE | i3;
        nlmVar2.e = str2;
        if (a.c) {
            a.cD();
            a.c = false;
        }
        nln nlnVar = (nln) a.b;
        nlm nlmVar3 = (nlm) nfjVar4.cz();
        nlmVar3.getClass();
        nlnVar.c = nlmVar3;
        nlnVar.a |= 4;
        nln nlnVar2 = (nln) a.cz();
        this.d = nlnVar2;
        int i4 = ((Soda) this.a).b(nlnVar2).b;
        int Y = ndb.Y(i4);
        if (Y == 0 || Y == 1) {
            return;
        }
        int Y2 = ndb.Y(i4);
        throw new IllegalStateException("Failed to initialize Soda: ".concat(ndb.X(Y2 != 0 ? Y2 : i)));
    }

    public final void a() {
        ((Soda) this.a).e();
    }

    public final void b() {
        if (((AtomicBoolean) this.b).compareAndSet(true, false)) {
            ((Soda) this.a).f();
        }
    }

    hjf() {
        this(null, llp.q(), llp.q(), llp.q());
    }
}
