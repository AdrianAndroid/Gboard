package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: byf  reason: default package */
/* loaded from: classes.dex */
public final class byf implements mix {
    private final Context a;
    private final bxh b;
    private final bye c;
    private final List d;

    public byf(Context context, bxh bxhVar, bye byeVar, List list) {
        this.a = context;
        this.b = bxhVar;
        this.c = byeVar;
        this.d = list;
        byeVar.n(bxhVar);
    }

    public static mqb b(List list) {
        nfh t = mqf.b.t();
        if (list.size() == 1 && jay.j((String) bxn.M.c(), (Locale) list.get(0))) {
            efq.v(t, bxn.g, bxn.h, bxn.i, bxn.j, bxn.k, bxn.l, bxn.m, bxn.n, bxn.X, bxn.Y);
            efq.x(t, bxn.A, bxn.B, bxn.C, bxn.V, bxn.W, bxn.T, bxn.U, bxn.S);
            efq.w(t, bxn.D, bxn.O, bxn.N, bxn.P, bxn.Q, bxn.R, bxn.E, bxn.F, bxn.G, bxn.H);
            nfh t2 = mqd.f.t();
            for (String str : lfy.e(",").i((CharSequence) bxn.I.c())) {
                t2.dx(str);
            }
            t.dy(((hhr) bxn.I).a, (mqd) t2.cz());
        }
        nfh t3 = mqb.d.t();
        mqc mqcVar = mqc.TFLITE_NWP;
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mqb mqbVar = (mqb) t3.b;
        mqbVar.b = mqcVar.t;
        mqbVar.a |= 1;
        mqf mqfVar = (mqf) t.cz();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mqb mqbVar2 = (mqb) t3.b;
        mqfVar.getClass();
        mqbVar2.c = mqfVar;
        mqbVar2.a |= 2;
        return (mqb) t3.cz();
    }

    private final mko c() {
        nfh t = mqa.f.t();
        mqc mqcVar = mqc.TFLITE_NWP;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mqa mqaVar = (mqa) t.b;
        mqaVar.b = mqcVar.t;
        mqaVar.a |= 1;
        mko c = this.b.c((mqa) t.cz());
        this.c.p(this.b);
        return c;
    }

    @Override // defpackage.mix
    public final mko a() {
        String str;
        String str2;
        if (!((Boolean) bxn.a.c()).booleanValue()) {
            return c();
        }
        if (this.d.size() != 1) {
            return c();
        }
        byz k = this.c.k((Locale) this.d.get(0), Locale.US.toLanguageTag());
        byg bygVar = null;
        r5 = null;
        mqf mqfVar = null;
        if (k != null) {
            jtr e = k.a().e();
            int a = e != null ? e.a() : 0;
            File[] listFiles = k.b().listFiles();
            if (listFiles != null) {
                str = null;
                str2 = null;
                for (File file : listFiles) {
                    String path = file.getPath();
                    if (path.endsWith(".tflite")) {
                        str2 = file.getPath();
                    } else if (path.endsWith(".syms") || path.endsWith(".csym")) {
                        str = file.getPath();
                    }
                }
            } else {
                str = null;
                str2 = null;
            }
            jsq n = k.a().n();
            if (n.d().contains("nwp_word_length_scaling_factor")) {
                nfh t = mqf.b.t();
                try {
                    float parseFloat = Float.parseFloat((String) n.a("nwp_word_length_scaling_factor"));
                    nfh t2 = mqd.f.t();
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    mqd mqdVar = (mqd) t2.b;
                    mqdVar.a |= 4;
                    mqdVar.d = parseFloat;
                    t.dy("nwp_word_length_scaling_factor", (mqd) t2.cz());
                    mqfVar = (mqf) t.cz();
                } catch (NumberFormatException e2) {
                    ((ltd) ((ltd) ((ltd) bye.a.d()).i(e2)).k("com/google/android/apps/inputmethod/libs/crank/nextwordpredictor/NwpModelManager", "getTFLiteModelFiles", 186, "NwpModelManager.java")).w("Failed to parse %s", "nwp_word_length_scaling_factor");
                }
            }
            bygVar = new byg(str, str2, a, mqfVar);
        }
        if (bygVar == null || TextUtils.isEmpty(bygVar.a) || TextUtils.isEmpty(bygVar.b) || bygVar.c <= 0) {
            return this.c.m((Locale) this.d.get(0));
        }
        nfh t3 = mqa.f.t();
        mqc mqcVar = mqc.TFLITE_NWP;
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mqa mqaVar = (mqa) t3.b;
        mqaVar.b = mqcVar.t;
        mqaVar.a |= 1;
        nfh t4 = mqf.b.t();
        efq.v(t4, bxn.x, bxn.b, bxn.K, bxn.J);
        efq.x(t4, bxn.y, bxn.z, bxn.L);
        mqf mqfVar2 = bygVar.d;
        if (mqfVar2 != null) {
            nfh t5 = mqd.f.t();
            nfh t6 = mqd.f.t();
            if (t6.c) {
                t6.cD();
                t6.c = false;
            }
            mqd mqdVar2 = (mqd) t6.b;
            mqdVar2.a |= 4;
            mqdVar2.d = 0.0f;
            mqd mqdVar3 = (mqd) t6.cz();
            ngu nguVar = mqfVar2.a;
            if (nguVar.containsKey("nwp_word_length_scaling_factor")) {
                mqdVar3 = (mqd) nguVar.get("nwp_word_length_scaling_factor");
            }
            float f = mqdVar3.d;
            if (t5.c) {
                t5.cD();
                t5.c = false;
            }
            mqd mqdVar4 = (mqd) t5.b;
            mqdVar4.a |= 4;
            mqdVar4.d = f;
            t4.dy("nwp_word_length_scaling_factor", (mqd) t5.cz());
        }
        mqf mqfVar3 = (mqf) t4.cz();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mqa mqaVar2 = (mqa) t3.b;
        mqfVar3.getClass();
        mqaVar2.d = mqfVar3;
        mqaVar2.a |= 2;
        mqb b = b(this.d);
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mqa mqaVar3 = (mqa) t3.b;
        b.getClass();
        mqaVar3.e = b;
        mqaVar3.a |= 4;
        nfh t7 = mvo.d.t();
        String str3 = bygVar.b;
        if (t7.c) {
            t7.cD();
            t7.c = false;
        }
        mvo mvoVar = (mvo) t7.b;
        str3.getClass();
        int i = mvoVar.a | 1;
        mvoVar.a = i;
        mvoVar.b = str3;
        int i2 = bygVar.c;
        mvoVar.a = i | 4;
        mvoVar.c = i2;
        t3.dv((mvo) t7.cz());
        nfh t8 = mvo.d.t();
        String str4 = bygVar.a;
        if (t8.c) {
            t8.cD();
            t8.c = false;
        }
        mvo mvoVar2 = (mvo) t8.b;
        str4.getClass();
        int i3 = mvoVar2.a | 1;
        mvoVar2.a = i3;
        mvoVar2.b = str4;
        int i4 = bygVar.c;
        mvoVar2.a = 4 | i3;
        mvoVar2.c = i4;
        t3.dv((mvo) t8.cz());
        File file2 = new File(this.a.getFilesDir(), "p13n/next_word_predictor_".concat(String.valueOf(String.valueOf(jav.d((Locale) this.d.get(0))))));
        File file3 = new File(file2, "nwp.int8.mmap.tflite");
        File file4 = new File(file2, "nwp.csym");
        if (file3.exists() && file4.exists()) {
            nfh t9 = mvo.d.t();
            String absolutePath = file3.getAbsolutePath();
            if (t9.c) {
                t9.cD();
                t9.c = false;
            }
            mvo mvoVar3 = (mvo) t9.b;
            absolutePath.getClass();
            mvoVar3.a |= 1;
            mvoVar3.b = absolutePath;
            t3.dv((mvo) t9.cz());
            nfh t10 = mvo.d.t();
            String absolutePath2 = file4.getAbsolutePath();
            if (t10.c) {
                t10.cD();
                t10.c = false;
            }
            mvo mvoVar4 = (mvo) t10.b;
            absolutePath2.getClass();
            mvoVar4.a = 1 | mvoVar4.a;
            mvoVar4.b = absolutePath2;
            t3.dv((mvo) t10.cz());
            file3.getAbsoluteFile();
            file4.getAbsoluteFile();
        }
        return this.b.a((mqa) t3.cz());
    }
}
