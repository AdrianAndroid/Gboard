package defpackage;

import android.os.Build;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: gig  reason: default package */
/* loaded from: classes.dex */
public final class gig {
    public static final ltg a = ltg.j("com/google/android/libraries/assistant/soda/SodaUtils");

    public static nfj a(String str, String str2) {
        nfj nfjVar = (nfj) nln.g.t();
        if (nfjVar.c) {
            nfjVar.cD();
            nfjVar.c = false;
        }
        nln nlnVar = (nln) nfjVar.b;
        nlnVar.a |= 64;
        nlnVar.e = str2;
        nfj nfjVar2 = (nfj) nlm.f.t();
        if (nfjVar2.c) {
            nfjVar2.cD();
            nfjVar2.c = false;
        }
        nlm nlmVar = (nlm) nfjVar2.b;
        nlmVar.a |= 32768;
        nlmVar.c = str;
        if (nfjVar.c) {
            nfjVar.cD();
            nfjVar.c = false;
        }
        nln nlnVar2 = (nln) nfjVar.b;
        nlm nlmVar2 = (nlm) nfjVar2.cz();
        nlmVar2.getClass();
        nlnVar2.c = nlmVar2;
        nlnVar2.a |= 4;
        nfh t = nlj.c.t();
        nfh t2 = nle.e.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        nle nleVar = (nle) t2.b;
        nleVar.b = 1;
        nleVar.a |= 1;
        nle.e(nleVar);
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        nle.c((nle) t2.b);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nlj nljVar = (nlj) t.b;
        nle nleVar2 = (nle) t2.cz();
        nleVar2.getClass();
        nljVar.b = nleVar2;
        nljVar.a |= 1;
        if (nfjVar.c) {
            nfjVar.cD();
            nfjVar.c = false;
        }
        nln nlnVar3 = (nln) nfjVar.b;
        nlj nljVar2 = (nlj) t.cz();
        nljVar2.getClass();
        nlnVar3.b = nljVar2;
        nlnVar3.a |= 1;
        nlf b = b();
        if (nfjVar.c) {
            nfjVar.cD();
            nfjVar.c = false;
        }
        nln nlnVar4 = (nln) nfjVar.b;
        b.getClass();
        nlnVar4.f = b;
        nlnVar4.a |= 512;
        return nfjVar;
    }

    private static nlf b() {
        try {
            TextUtils.isEmpty("");
        } catch (NoClassDefFoundError unused) {
        }
        nfh t = nlf.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nlf nlfVar = (nlf) t.b;
        nlfVar.b = 6;
        int i = nlfVar.a | 2;
        nlfVar.a = i;
        int i2 = i | 64;
        nlfVar.a = i2;
        nlfVar.e = "";
        nlfVar.a = i2 | 16;
        nlfVar.c = "Android";
        try {
            String str = Build.MODEL;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            nlf nlfVar2 = (nlf) t.b;
            str.getClass();
            nlfVar2.a |= 32;
            nlfVar2.d = str;
        } catch (NoClassDefFoundError unused2) {
        }
        return (nlf) t.cz();
    }
}
