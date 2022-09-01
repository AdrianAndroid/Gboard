package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: PG */
/* renamed from: pf  reason: default package */
/* loaded from: classes2.dex */
public final class pf {
    public Random a = new Random();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public ArrayList e = new ArrayList();
    public final transient Map f = new HashMap();
    public final Map g = new HashMap();
    public final Bundle h = new Bundle();
    final /* synthetic */ ow i;

    public pf(ow owVar) {
        this.i = owVar;
    }

    public final void a(int i, String str) {
        Map map = this.b;
        Integer valueOf = Integer.valueOf(i);
        map.put(valueOf, str);
        this.c.put(str, valueOf);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [pe, java.lang.Object] */
    public final boolean b(int i, int i2, Intent intent) {
        String str = (String) this.b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        bek bekVar = (bek) this.f.get(str);
        if (bekVar == null || bekVar.b == null || !this.e.contains(str)) {
            this.g.remove(str);
            this.h.putParcelable(str, new pd(i2, intent));
            return true;
        }
        bekVar.b.a(((pi) bekVar.a).a(i2, intent));
        this.e.remove(str);
        return true;
    }

    public final void c(int i, pi piVar, Object obj) {
        Bundle bundle;
        ow owVar = this.i;
        aqq c = piVar.c(owVar, obj);
        if (c != null) {
            new Handler(Looper.getMainLooper()).post(new ov(this, i, c, 0, null, null, null, null));
            return;
        }
        Intent b = piVar.b(obj);
        if (b.getExtras() != null && b.getExtras().getClassLoader() == null) {
            b.setExtrasClassLoader(owVar.getClassLoader());
        }
        if (b.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = b.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            b.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(b.getAction())) {
            String[] stringArrayExtra = b.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            gcl.i(owVar, stringArrayExtra, i);
        } else if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(b.getAction())) {
            tv.b(owVar, b, i, bundle);
        } else {
            ph phVar = (ph) b.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                tv.c(owVar, phVar.a, i, phVar.b, phVar.c, phVar.d, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new ov(this, i, e, 2));
            }
        }
    }

    public final mop d(String str, pi piVar, pe peVar) {
        int i;
        if (((Integer) this.c.get(str)) == null) {
            int nextInt = this.a.nextInt(2147418112);
            while (true) {
                i = nextInt + 65536;
                if (!this.b.containsKey(Integer.valueOf(i))) {
                    break;
                }
                nextInt = this.a.nextInt(2147418112);
            }
            a(i, str);
        }
        this.f.put(str, new bek(peVar, piVar));
        if (this.g.containsKey(str)) {
            Object obj = this.g.get(str);
            this.g.remove(str);
            peVar.a(obj);
        }
        pd pdVar = (pd) this.h.getParcelable(str);
        if (pdVar != null) {
            this.h.remove(str);
            peVar.a(piVar.a(pdVar.a, pdVar.b));
        }
        return new mop(this, str, piVar);
    }

    public pf() {
    }
}
