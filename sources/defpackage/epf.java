package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;

/* compiled from: PG */
/* renamed from: epf  reason: default package */
/* loaded from: classes.dex */
public abstract class epf implements epd {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/swissarmyknife/QualityBugReportExtension");
    public epe a;
    private final eoz c = new eoz(this);

    public abstract epe c(Context context, dxe dxeVar);

    @Override // defpackage.epd
    public final void d(Context context) {
        hsk b2 = hsx.b();
        if (b2 == null) {
            ((ltd) ((ltd) b.c()).k("com/google/android/apps/inputmethod/libs/swissarmyknife/QualityBugReportExtension", "showDialog", 66, "QualityBugReportExtension.java")).t("InputMethodService is not created!");
            return;
        }
        hqt b3 = hqp.b();
        if (b3 == null) {
            ((ltd) ((ltd) b.c()).k("com/google/android/apps/inputmethod/libs/swissarmyknife/QualityBugReportExtension", "showDialog", 73, "QualityBugReportExtension.java")).t("Cannot get the current keyboard locale!");
            return;
        }
        dxe dxeVar = new dxe(Delight5Facilitator.h(context));
        b3.i().q();
        b2.M();
        Context a = b3.a();
        this.a = c(a, dxeVar);
        guc.a.a(a, "QualityBugReport");
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final synchronized void gm(Context context, igg iggVar) {
        this.c.e();
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.c.f();
        if (this.a != null) {
            this.a = null;
        }
    }
}
