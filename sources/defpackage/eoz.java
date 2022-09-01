package defpackage;

import android.app.Dialog;
import android.widget.ListView;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: eoz  reason: default package */
/* loaded from: classes.dex */
public final class eoz extends guh {
    final /* synthetic */ epf a;

    protected eoz() {
        super("QualityBugReport");
    }

    @Override // defpackage.guh
    protected final void a(gub gubVar) {
        ijk ijkVar;
        gubVar.w(gubVar.r().getApplicationInfo().icon);
        epe epeVar = this.a.a;
        if (epeVar != null) {
            ijkVar = new ijk();
            if (((Boolean) doa.dv.c()).booleanValue()) {
                ijkVar.j(epeVar.c.getString(R.string.f162940_resource_name_obfuscated_res_0x7f140750), new emq(epeVar, 5));
            } else {
                ijkVar.j("This feature is disabled now!", bsd.g);
            }
        } else {
            ijkVar = new ijk();
        }
        if (((ArrayList) ijkVar.b).isEmpty()) {
            ijkVar.j("Internal error", bsd.h);
        }
        if (gul.a()) {
            gubVar.q(ijkVar);
        } else {
            gubVar.p(ijkVar);
        }
        gubVar.D(R.string.f156100_resource_name_obfuscated_res_0x7f140416);
        gubVar.l();
        gubVar.h();
        gubVar.i();
    }

    @Override // defpackage.guh
    protected final void b(Dialog dialog) {
        if (gul.a()) {
            ListView d = guw.d(dialog);
            int round = Math.round(dialog.getContext().getResources().getDisplayMetrics().density * 22.0f);
            d.setPaddingRelative(d.getPaddingStart(), round, d.getPaddingEnd(), round);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoz(epf epfVar) {
        super("QualityBugReport");
        this.a = epfVar;
    }
}
