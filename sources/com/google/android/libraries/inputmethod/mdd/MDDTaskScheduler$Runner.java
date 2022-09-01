package com.google.android.libraries.inputmethod.mdd;

import android.content.Context;
import android.os.PersistableBundle;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MDDTaskScheduler$Runner implements isc {
    public static final /* synthetic */ int a = 0;

    public MDDTaskScheduler$Runner(Context context) {
    }

    @Override // defpackage.isc
    public final isb a(jls jlsVar) {
        ((ltd) ((ltd) hzi.a.b()).k("com/google/android/libraries/inputmethod/mdd/MDDTaskScheduler$Runner", "onStopTask", 70, "MDDTaskScheduler.java")).w("task %s stopped", jlsVar.b);
        if (TextUtils.equals(((PersistableBundle) jlsVar.a).getString("mdd_task_tag"), "download")) {
            hyy.a().j(((PersistableBundle) jlsVar.a).getBoolean("network"), ((PersistableBundle) jlsVar.a).getBoolean("charging"));
        }
        return isb.FINISHED;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.isc
    public final mko b(jls jlsVar) {
        char c;
        mko a2;
        ((ltd) ((ltd) hzi.a.b()).k("com/google/android/libraries/inputmethod/mdd/MDDTaskScheduler$Runner", "onRunTask", 38, "MDDTaskScheduler.java")).w("task %s started", jlsVar.b);
        String string = ((PersistableBundle) jlsVar.a).getString("mdd_task_tag");
        if (TextUtils.isEmpty(string)) {
            ((ltd) ((ltd) hzi.a.c()).k("com/google/android/libraries/inputmethod/mdd/MDDTaskScheduler$Runner", "onRunTask", 41, "MDDTaskScheduler.java")).t("empty task tag!");
            return isc.o;
        } else if (TextUtils.equals(string, "download")) {
            boolean z = ((PersistableBundle) jlsVar.a).getBoolean("network");
            boolean z2 = ((PersistableBundle) jlsVar.a).getBoolean("charging");
            hyy a3 = hyy.a();
            hyt a4 = hyz.a();
            a4.f(z2);
            a4.b(z);
            return mio.g(mkh.q(a3.d(a4.a())), hwy.g, mjl.a);
        } else {
            jix jixVar = hyy.a().d;
            switch (string.hashCode()) {
                case -2105562759:
                    if (string.equals("MDD.MAINTENANCE.PERIODIC.GCM.TASK")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1202768674:
                    if (string.equals("MDD.CELLULAR.CHARGING.PERIODIC.TASK")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -69128772:
                    if (string.equals("MDD.CHARGING.PERIODIC.TASK")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 437964371:
                    if (string.equals("MDD.WIFI.CHARGING.PERIODIC.TASK")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                jjb jjbVar = (jjb) jixVar;
                jlr jlrVar = jjbVar.g;
                jkv jkvVar = jjbVar.c;
                Objects.requireNonNull(jkvVar);
                a2 = jlrVar.a(new clc(jkvVar, 7), jjbVar.d);
            } else if (c == 1) {
                jjb jjbVar2 = (jjb) jixVar;
                a2 = jco.j(jjbVar2.f(), ldd.c(new ivo(jjbVar2, 5)), jjbVar2.d);
            } else if (c == 2) {
                a2 = ((jjb) jixVar).e(false);
            } else if (c == 3) {
                a2 = ((jjb) jixVar).e(true);
            } else {
                int i = jmk.a;
                a2 = kcu.J(new IllegalArgumentException("Unknown task tag sent to MDD.handleTask() ".concat(String.valueOf(string))));
            }
            return mio.g(mkh.q(a2), hwy.f, mjl.a);
        }
    }
}
