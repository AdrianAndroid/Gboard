package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bxm  reason: default package */
/* loaded from: classes.dex */
public final class bxm {
    public static final lmz a;
    public static final lmz b = lmz.v(bxn.e, bxn.ac, bxn.ad, bxn.ag, bxn.ao);
    public static final lmz c = lmz.v(mqc.EXPRESSIVE_CONCEPT_EMOJI_PRED, mqc.EXPRESSIVE_CONCEPT_TRIGGERING, mqc.CONCEPT_PRED, mqc.LITE_EMOJI_PRED, mqc.TRANSFORMER_EXPRESSION_PRED);
    public static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/crank/CrankFacilitator");
    public static final AtomicBoolean e = new AtomicBoolean(false);
    private static final hhl[] l;
    public final Context f;
    public final bxi g;
    public final hho h;
    public final inm i;
    public final ijj j;
    final ija k;

    static {
        hhl hhlVar = bxn.d;
        hhl hhlVar2 = bxn.ac;
        hhl hhlVar3 = bxn.ad;
        hhl hhlVar4 = bxn.ag;
        hhl hhlVar5 = bxn.ao;
        l = new hhl[]{bxn.a, bxn.b, bxn.c, hhlVar, hhlVar2, hhlVar3, hhlVar4, hhlVar5, bxn.e, bxn.p, bxn.t};
        a = lmz.v(hhlVar, hhlVar2, hhlVar3, hhlVar4, hhlVar5);
    }

    public bxm(Context context) {
        bxi bxiVar = new bxi();
        mkr b2 = b();
        bya byaVar = new bya(this, 1);
        this.h = byaVar;
        btf btfVar = new btf(this, 6);
        this.i = btfVar;
        cir cirVar = new cir(this, 1);
        this.j = cirVar;
        ija c2 = ijf.c(new bqj(this, 14), new bqj(this, 15), irs.a);
        this.k = c2;
        this.f = context;
        this.g = bxiVar;
        hhq.p(byaVar, l);
        ino.M(context).X(btfVar, R.string.f160750_resource_name_obfuscated_res_0x7f14066b);
        ijl.b().c(cirVar, exo.class, b2);
        c2.d(b2);
    }

    public static mpz a() {
        nfh t = mpz.c.t();
        boolean z = true;
        if (!irs.d() && ((Boolean) bxn.aK.c()).booleanValue()) {
            z = false;
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mpz mpzVar = (mpz) t.b;
        mpzVar.a |= 2;
        mpzVar.b = z;
        return (mpz) t.cz();
    }

    public static mkr b() {
        return gxo.a(10);
    }
}
