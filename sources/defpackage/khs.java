package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.apps.inputmethod.libs.latin5.LatinIme;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: khs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class khs implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ khs(LatinIme latinIme, Context context, Delight5Facilitator delight5Facilitator, mks mksVar, iav iavVar, gjz gjzVar, int i, byte[] bArr) {
        this.g = i;
        this.e = latinIme;
        this.a = context;
        this.b = delight5Facilitator;
        this.f = mksVar;
        this.d = iavVar;
        this.c = gjzVar;
    }

    public /* synthetic */ khs(khu khuVar, Context context, nox noxVar, Executor executor, khy khyVar, oiy oiyVar, int i) {
        this.g = i;
        this.b = khuVar;
        this.a = context;
        this.c = noxVar;
        this.d = executor;
        this.e = khyVar;
        this.f = oiyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, oiy] */
    /* JADX WARN: Type inference failed for: r11v3, types: [mks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [nox, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        cbg cboVar;
        int i = 1;
        if (this.g != 0) {
            Object obj = this.e;
            Context context = this.a;
            Object obj2 = this.b;
            ?? r11 = this.f;
            Object obj3 = this.d;
            LatinIme latinIme = (LatinIme) obj;
            dol dolVar = new dol(latinIme, latinIme.E);
            Delight5Facilitator delight5Facilitator = (Delight5Facilitator) obj2;
            cbi cbiVar = new cbi(delight5Facilitator.h);
            cbf cbfVar = latinIme.j;
            iav iavVar = (iav) obj3;
            if (true == LatinIme.T(iavVar)) {
                i = 4;
            }
            ccm ccmVar = new ccm(context, i);
            boh bohVar = new boh(delight5Facilitator, 19);
            int i2 = cbk.b;
            if (i2 == 2) {
                cboVar = new cbo(dolVar, cbiVar, r11, cbfVar, ccmVar, bohVar);
            } else if (i2 == 3) {
                cboVar = new cbp(dolVar, cbiVar, r11, cbfVar, ccmVar, bohVar);
            } else if (i2 == 4) {
                cboVar = new cbs(dolVar, cbiVar, r11, cbfVar, ccmVar, bohVar);
            } else {
                cboVar = new cbm(dolVar, cbiVar, r11, cbfVar, ccmVar, bohVar);
            }
            latinIme.k = cboVar;
            llp n = LatinIme.n(latinIme.f, latinIme.s);
            latinIme.r = delight5Facilitator.F(latinIme.k, n, iavVar.f.c, "", latinIme.C, false, latinIme.B.b(n));
            return;
        }
        Object obj4 = this.b;
        Context context2 = this.a;
        ?? r7 = this.c;
        ?? r8 = this.d;
        Object obj5 = this.e;
        ?? r10 = this.f;
        if (gkm.d(context2)) {
            ((khu) obj4).a(r7);
        } else {
            gkm.b(context2, new epv((khu) obj4, (nox) r7, (Executor) r8, 19));
        }
        khu khuVar = (khu) obj4;
        if (!khuVar.c) {
            return;
        }
        if (r10 == 0) {
            nfh t = oor.d.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            oor oorVar = (oor) t.b;
            oorVar.c = 2;
            oorVar.a |= 4;
            khuVar.b = ((khy) obj5).a((oor) t.cz());
            return;
        }
        try {
            ((khu) obj4).b = ((khy) obj5).a((oor) r10.a());
        } catch (Throwable th) {
            ((ltd) ((ltd) ((ltd) khu.a.d()).i(th)).k("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchSamplingParameters", '|', "Sampler.java")).t("Couldn't get sampling strategy");
            nfh t2 = oor.d.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            oor oorVar2 = (oor) t2.b;
            oorVar2.a = 2 | oorVar2.a;
            oorVar2.b = 0L;
            oor oorVar3 = (oor) t2.b;
            oorVar3.c = 1;
            oorVar3.a |= 4;
            khuVar.b = ((khy) obj5).a((oor) t2.cz());
        }
    }
}
