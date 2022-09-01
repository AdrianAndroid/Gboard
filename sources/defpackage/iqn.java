package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: iqn  reason: default package */
/* loaded from: classes.dex */
public final class iqn implements idm {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/silentfeedback/SilentFeedbackMetricsProcessor");
    private static final ido[] b = {idd.UI_THREAD_VIOLATION, idd.METRICS_PROCESSOR_CRASH_INIT, idd.METRICS_PROCESSOR_CRASH_ON_ATTACHED, idd.METRICS_PROCESSOR_CRASH_PROCESS, idd.NATIVE_LIB_LOAD_FAILED, idd.KEYBOARD_TYPE_EMPTY, idd.INVALID_KEYBOARD_DEF_FROM_CACHE, idd.INVALID_KEYBOARD_DEF_FROM_XML, hqh.b};
    private final Set c = new HashSet();
    private final Context d;
    private final String e;
    private final fnz f;

    public iqn(Context context) {
        fnz a2 = fui.a(context);
        this.d = context;
        this.f = a2;
        this.e = String.valueOf(context.getApplicationInfo().packageName).concat(".SILENT_CRASH_REPORT");
    }

    public final void a(ido idoVar, Throwable th, String str) {
        if (this.c.add(idoVar)) {
            try {
                fnz fnzVar = this.f;
                fuk fukVar = new fuk(th);
                fukVar.c = true;
                fukVar.a = str;
                fukVar.b = this.e;
                fukVar.b(hjg.s(true), true);
                ful a2 = fukVar.a();
                fod fodVar = fnzVar.h;
                fue fueVar = new fue(fodVar, a2);
                fodVar.a(fueVar);
                fyb.aI(fueVar);
            } catch (NoClassDefFoundError e) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/silentfeedback/SilentFeedbackMetricsProcessor", "processSilentFeedback", (char) 180, "SilentFeedbackMetricsProcessor.java")).t("Failed to send silent feedback.");
            }
        }
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        Object obj;
        if (objArr.length != 1 || (obj = objArr[0]) == null || !(obj instanceof Throwable)) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/silentfeedback/SilentFeedbackMetricsProcessor", "processMetrics", 99, "SilentFeedbackMetricsProcessor.java")).t("Wrong parameters!");
            return;
        }
        Throwable th = (Throwable) obj;
        if (idoVar == idd.UI_THREAD_VIOLATION) {
            a(idd.UI_THREAD_VIOLATION, th, "The code should only be called from UI thread.");
            return;
        }
        idd iddVar = idd.METRICS_PROCESSOR_CRASH_INIT;
        if (idoVar == iddVar) {
            a(iddVar, th, "Creating metrics processor crashed!");
            return;
        }
        idd iddVar2 = idd.METRICS_PROCESSOR_CRASH_ON_ATTACHED;
        if (idoVar == iddVar2) {
            a(iddVar2, th, "Attaching metrics processor crashed!");
            return;
        }
        idd iddVar3 = idd.METRICS_PROCESSOR_CRASH_PROCESS;
        if (idoVar == iddVar3) {
            a(iddVar3, th, "Processing metrics with processor crashed!");
            return;
        }
        idd iddVar4 = idd.NATIVE_LIB_LOAD_FAILED;
        if (idoVar == iddVar4) {
            a(iddVar4, th, "Failed to load native library.");
            return;
        }
        idd iddVar5 = idd.KEYBOARD_TYPE_EMPTY;
        if (idoVar == iddVar5) {
            a(iddVar5, th, "Keyboard type name is empty [v2].");
            return;
        }
        idd iddVar6 = idd.INVALID_KEYBOARD_DEF_FROM_CACHE;
        if (idoVar == iddVar6) {
            a(iddVar6, th, "invalid keyboard def loaded from cache.");
            return;
        }
        idd iddVar7 = idd.INVALID_KEYBOARD_DEF_FROM_XML;
        if (idoVar == iddVar7) {
            a(iddVar7, th, "invalid keyboard def loaded from XML.");
        } else if (idoVar != hqh.b) {
        } else {
            a(hqh.b, th, "Error to retrieve initial surrounding text info.");
        }
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return b;
    }
}
