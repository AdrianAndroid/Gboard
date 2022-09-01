package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: eml  reason: default package */
/* loaded from: classes.dex */
public final class eml extends idb {
    public static final ido[] a = {dda.SETUP_WIZARD_PAGE_SHOWN, ddj.a, emm.SHARING_LANGUAGE, emm.SHARING_LINK_LANGUAGE_RECEIVED, emm.SHARING_LINK_RECEIVED, emm.SHARING_LINK_RECEIVING_USAGE, emm.SHARING_USAGE, emm.SHARING_USAGE_COUNT};
    private static final ltg f = ltg.j("com/google/android/apps/inputmethod/libs/sharing/SharingMetricsProcessorHelper");
    private final emk g;

    public eml(emk emkVar) {
        this.g = emkVar;
    }

    @Override // defpackage.idb
    protected final boolean a(ido idoVar, Object[] objArr) {
        int i;
        int i2 = 0;
        if (dda.SETUP_WIZARD_PAGE_SHOWN == idoVar) {
            emk emkVar = this.g;
            String str = (String) objArr[0];
            if (emkVar.b && !emkVar.c && TextUtils.equals(str, "first_run_page_done")) {
                emkVar.a(mdu.FIRSTRUN_DONE_PAGE, mdt.ENABLE_SHOWN, null, 0);
                emkVar.c = true;
            }
        } else {
            int i3 = 2;
            if (ddj.a == idoVar) {
                emk emkVar2 = this.g;
                Context context = emkVar2.a;
                if (emkVar2.b) {
                    i3 = emkVar2.e;
                }
                gzm.r(context, i3);
            } else if (emm.SHARING_LANGUAGE == idoVar) {
                this.g.b((mdx) objArr[0], mdy.SHARE_CLICKED, (Collection) objArr[1], 0);
            } else if (emm.SHARING_LINK_LANGUAGE_RECEIVED == idoVar) {
                Object obj = objArr[2];
                if (obj == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/sharing/SharingMetricsProcessorHelper", "doProcessMetrics", 39, "SharingMetricsProcessorHelper.java")).t("the 2th argument is null!");
                    return false;
                }
                this.g.a((mdu) objArr[0], mdt.LINK_PARSED, (Collection) objArr[1], ((Number) obj).intValue());
            } else if (emm.SHARING_LINK_RECEIVED == idoVar) {
                emk emkVar3 = this.g;
                emkVar3.b = true;
                int b = ino.M(emkVar3.a).b("link_type", 0);
                Context context2 = emkVar3.a;
                long j = emkVar3.d;
                if (b == 0) {
                    i = 4;
                } else {
                    i2 = b;
                    i = 10;
                }
                emkVar3.e = gzm.q(context2, j, i, i2 == 0 ? 5 : 11, i2 == 0 ? 3 : 9);
            } else if (emm.SHARING_LINK_RECEIVING_USAGE == idoVar) {
                this.g.a((mdu) objArr[0], (mdt) objArr[1], null, 0);
            } else if (emm.SHARING_USAGE == idoVar) {
                this.g.b((mdx) objArr[0], (mdy) objArr[1], null, 0);
            } else if (emm.SHARING_USAGE_COUNT == idoVar) {
                Object obj2 = objArr[2];
                if (obj2 == null) {
                    ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/sharing/SharingMetricsProcessorHelper", "doProcessMetrics", 55, "SharingMetricsProcessorHelper.java")).t("the 2th argument is null!");
                    return false;
                }
                this.g.b((mdx) objArr[0], (mdy) objArr[1], null, ((Number) obj2).intValue());
            } else {
                ((ltd) f.a(hip.a).k("com/google/android/apps/inputmethod/libs/sharing/SharingMetricsProcessorHelper", "doProcessMetrics", 61, "SharingMetricsProcessorHelper.java")).w("unhandled metricsType: %s", idoVar);
                return false;
            }
        }
        return true;
    }
}
