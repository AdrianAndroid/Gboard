package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: bre  reason: default package */
/* loaded from: classes.dex */
public final class bre extends idb {
    public static final ido[] a = {hpb.IME_TEXT_COMMITTED};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/latin/metrics/RlzMetricsProcessorHelper");
    private final brd g;

    public bre(brd brdVar) {
        this.g = brdVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        if (hpb.IME_TEXT_COMMITTED == idoVar) {
            brd brdVar = this.g;
            CharSequence charSequence = (CharSequence) objArr[0];
            if (!brd.a(brdVar.a)) {
                if (brdVar.c.contains("YG")) {
                    ComponentName componentName = new ComponentName("com.google.android.partnersetup", "com.google.android.partnersetup.RlzPingBroadcastReceiver");
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (brdVar.c.contains("Y0")) {
                        arrayList.add("Y0");
                    }
                    arrayList.add("YG");
                    Intent intent = new Intent("com.google.android.partnersetup.ACTION_RLZ_FIRST_USE");
                    intent.putStringArrayListExtra("com.google.android.partnersetup.EXTRA_ACCESS_POINTS", arrayList);
                    intent.setComponent(componentName);
                    brdVar.a.sendBroadcast(intent);
                }
                brdVar.b.f("new_rlz_ping_sent", true);
            }
            ieh.j().x(brd.class);
            return true;
        }
        ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/RlzMetricsProcessorHelper", "doProcessMetrics", 29, "RlzMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
        return false;
    }
}
