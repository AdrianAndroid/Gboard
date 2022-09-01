package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: fur  reason: default package */
/* loaded from: classes.dex */
public final class fur extends fra {
    public final Context s;

    public fur(Context context, Looper looper, fob fobVar, foc focVar, fqs fqsVar) {
        super(context, looper, 29, fqsVar, fobVar, focVar);
        this.s = context;
        gfs.b(context);
    }

    public final void H(ful fulVar) {
        String str;
        nfh t = fvq.n.t();
        String str2 = fulVar.g;
        if (!TextUtils.isEmpty(str2)) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            fvq fvqVar = (fvq) t.b;
            str2.getClass();
            fvqVar.a |= 2;
            fvqVar.c = str2;
        } else {
            String packageName = this.s.getApplicationContext().getPackageName();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            fvq fvqVar2 = (fvq) t.b;
            packageName.getClass();
            fvqVar2.a |= 2;
            fvqVar2.c = packageName;
        }
        try {
            str = this.s.getPackageManager().getPackageInfo(((fvq) t.b).c, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (str != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            fvq fvqVar3 = (fvq) t.b;
            fvqVar3.b |= 2;
            fvqVar3.j = str;
        }
        String str3 = fulVar.a;
        if (!TextUtils.isEmpty(str3) && !str3.equals("anonymous")) {
            String num = Integer.toString(new Account(str3, "com.google").name.toLowerCase(Locale.ENGLISH).hashCode());
            if (t.c) {
                t.cD();
                t.c = false;
            }
            fvq fvqVar4 = (fvq) t.b;
            num.getClass();
            fvqVar4.a |= 4;
            fvqVar4.d = num;
        }
        String str4 = fulVar.n;
        if (str4 != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            fvq fvqVar5 = (fvq) t.b;
            fvqVar5.a |= 64;
            fvqVar5.f = str4;
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        fvq fvqVar6 = (fvq) t.b;
        fvqVar6.a |= 16;
        fvqVar6.e = "feedback.android";
        int i = fmx.b;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        fvq fvqVar7 = (fvq) t.b;
        fvqVar7.a |= 1073741824;
        fvqVar7.i = i;
        long currentTimeMillis = System.currentTimeMillis();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        fvq fvqVar8 = (fvq) t.b;
        fvqVar8.a |= 16777216;
        fvqVar8.h = currentTimeMillis;
        if (fulVar.m != null || fulVar.f != null) {
            fvqVar8.b |= 16;
            fvqVar8.m = true;
        }
        Bundle bundle = fulVar.b;
        if (bundle != null && !bundle.isEmpty()) {
            int size = fulVar.b.size();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            fvq fvqVar9 = (fvq) t.b;
            fvqVar9.b |= 4;
            fvqVar9.k = size;
        }
        List list = fulVar.h;
        if (list != null && !list.isEmpty()) {
            int size2 = fulVar.h.size();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            fvq fvqVar10 = (fvq) t.b;
            fvqVar10.b |= 8;
            fvqVar10.l = size2;
        }
        fvq fvqVar11 = (fvq) t.cz();
        nfh nfhVar = (nfh) fvqVar11.N(5);
        nfhVar.cG(fvqVar11);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        fvq fvqVar12 = (fvq) nfhVar.b;
        fvqVar12.g = 164;
        fvqVar12.a |= 256;
        fvq fvqVar13 = (fvq) nfhVar.cz();
        Context context = this.s;
        if (fvqVar13.c.isEmpty()) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires appPackageName to be set");
        }
        if (fvqVar13.f.isEmpty()) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires sessionId to be set");
        }
        if (fvqVar13.e.isEmpty()) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires flow to be set");
        }
        if (fvqVar13.i <= 0) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires clientVersion to be set");
        }
        if (fvqVar13.h <= 0) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires timestamp to be set");
        }
        int V = ndb.V(fvqVar13.g);
        if (V == 0 || V == 1) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires user action type to be set");
        }
        context.sendBroadcast(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService$GmsExternalReceiver").setAction("com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.LOG_METRIC").putExtra("EXTRA_METRIC_DATA", fvqVar13.q()));
    }

    @Override // defpackage.fra, defpackage.fqq, defpackage.fnw
    public final int a() {
        return 11925000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        return queryLocalInterface instanceof fut ? (fut) queryLocalInterface : new fut(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqq
    public final String c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.fqq
    protected final String d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.fqq
    public final fmv[] h() {
        return fub.b;
    }
}
