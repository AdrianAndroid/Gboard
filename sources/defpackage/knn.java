package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: knn  reason: default package */
/* loaded from: classes.dex */
public final class knn implements knk, koh {
    public final mkr a;
    public final lgb b;
    public final lfb c;
    public final lfb d;
    public final kns e;
    public final kog f = new kog(this);
    public final kcq g;
    public kfl h;
    private final Context i;
    private final mlp j;
    private final lgb k;

    public knn(Context context, mkr mkrVar, mlp mlpVar, lgb lgbVar, String str, kcq kcqVar, kns knsVar, dpe dpeVar, Uri uri, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.i = context;
        this.a = mkrVar;
        this.j = mlpVar;
        ArrayList arrayList = new ArrayList();
        num numVar = new num();
        numVar.f(nuj.c("X-Goog-Api-Key", num.b), str);
        arrayList.add(new oii(numVar));
        this.k = lgbVar;
        this.b = jdg.n(new buf(lgbVar, arrayList, 12));
        this.g = kcqVar;
        this.e = knsVar;
        this.c = lfb.f(dpeVar);
        this.d = uri != null ? lfb.g(uri.buildUpon().appendQueryParameter("key", str).appendQueryParameter("alt", "proto").build()) : ldu.a;
    }

    @Override // defpackage.knk
    public final boolean a(String str) {
        return this.g.a().contains(str);
    }

    @Override // defpackage.knk
    public final kcq b() {
        return this.g;
    }

    @Override // defpackage.koh
    public final SharedPreferences c() {
        return this.i.getSharedPreferences("expressive_sticker_client_prefs", 0);
    }

    public final mko d() {
        mko a;
        kog kogVar = this.f;
        synchronized (kogVar.b) {
            if (kogVar.d == null) {
                kog.e();
            }
            a = kogVar.d.a();
        }
        g();
        return a;
    }

    @Override // defpackage.koh
    public final File e() {
        return this.i.getCacheDir();
    }

    public final void f() {
        nuf nufVar = (nuf) this.k.a();
        if (nufVar.e().equals(nsl.TRANSIENT_FAILURE)) {
            nufVar.d();
        }
    }

    public final void g() {
        Context context = this.i;
        if (context instanceof knl) {
            ((knl) context).e();
        }
    }

    public final nfh h(String str, Locale locale, ncx ncxVar) {
        String upperCase;
        int i;
        nfh t = ndc.h.t();
        nfh t2 = ncp.e.t();
        mlp mlpVar = this.j;
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        ((ncp) t2.b).a = mlpVar;
        String locale2 = locale.toString();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        locale2.getClass();
        ((ncp) t2.b).b = locale2;
        TelephonyManager telephonyManager = (TelephonyManager) this.i.getSystemService("phone");
        if (telephonyManager == null) {
            upperCase = locale.getCountry();
        } else {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (TextUtils.isEmpty(simCountryIso)) {
                simCountryIso = telephonyManager.getNetworkCountryIso();
                if (TextUtils.isEmpty(simCountryIso)) {
                    simCountryIso = locale.getCountry();
                }
            }
            upperCase = simCountryIso.toUpperCase();
        }
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        upperCase.getClass();
        ((ncp) t2.b).c = upperCase;
        ncp ncpVar = (ncp) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ndc ndcVar = (ndc) t.b;
        ncpVar.getClass();
        ndcVar.a = ncpVar;
        str.getClass();
        ndcVar.b = str;
        ncxVar.getClass();
        ndcVar.f = ncxVar;
        List a = this.g.a();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ndc ndcVar2 = (ndc) t.b;
        nga ngaVar = ndcVar2.c;
        if (!ngaVar.c()) {
            ndcVar2.c = nfm.H(ngaVar);
        }
        ndt.cs(a, ndcVar2.c);
        int i2 = this.j.a;
        int x = kcu.x(i2);
        if (x != 0 && x == 12) {
            i = 7;
        } else {
            int x2 = kcu.x(i2);
            i = (x2 != 0 && x2 == 5) ? 6 : 5;
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((ndc) t.b).d = i - 2;
        return t;
    }
}
