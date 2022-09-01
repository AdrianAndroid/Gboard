package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: bpg  reason: default package */
/* loaded from: classes.dex */
public final class bpg extends ddp {
    private static final lug m = hin.a;
    private des n;
    private View o;

    public bpg(ddq ddqVar) {
        super(ddqVar);
    }

    @Override // defpackage.ddp
    public final void a(List list) {
        super.a(list);
        des desVar = this.n;
        if (desVar != null) {
            desVar.a(list);
        }
    }

    @Override // defpackage.ddp, defpackage.ddr
    public final void b(List list, hln hlnVar, boolean z) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((hln) it.next()).e == hlm.CONTEXTUAL) {
                    ((luc) m.a(hip.a).k("com/google/android/apps/inputmethod/latin/keyboard/LatinDualCandidatesViewController", "appendTextCandidates", 113, "LatinDualCandidatesViewController.java")).t("Special case (contextual candidate received by t13n candidate controller.");
                }
            }
        }
        super.b(list, hlnVar, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ddp
    public final boolean d(ice iceVar, View view) {
        if (!super.d(iceVar, view)) {
            return false;
        }
        view.setLayoutDirection(this.a.gh());
        this.a.gk(iceVar);
        this.b = view.findViewById(R.id.f56130_resource_name_obfuscated_res_0x7f0b0259);
        return true;
    }

    @Override // defpackage.ddp, defpackage.ddr
    public final void g(View view, icf icfVar) {
        super.g(view, icfVar);
        if (icfVar.b == ice.BODY) {
            des desVar = (des) view.findViewById(R.id.f96320_resource_name_obfuscated_res_0x7f0b1416);
            this.n = desVar;
            if (desVar == null) {
                return;
            }
            desVar.a(null);
        } else if (icfVar.b != ice.HEADER) {
        } else {
            View findViewById = view.findViewById(R.id.key_pos_header_access_points_menu);
            this.o = findViewById;
            boolean z = findViewById instanceof ViewGroup;
        }
    }

    @Override // defpackage.ddp, defpackage.ddr
    public final void h(icf icfVar) {
        super.h(icfVar);
        if (icfVar.b == ice.HEADER) {
            this.o = null;
        }
        if (icfVar.b == ice.BODY) {
            this.n = null;
        }
    }
}
