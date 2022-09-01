package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxh  reason: default package */
/* loaded from: classes.dex */
public final class dxh extends hst {
    final /* synthetic */ dxi a;

    public dxh(dxi dxiVar) {
        this.a = dxiVar;
    }

    @Override // defpackage.hst
    public final void a() {
        dxi dxiVar = this.a;
        dxm dxmVar = dxiVar.b;
        if (dxmVar != null && dxmVar.n != null) {
            ino.M(dxiVar.a).f("should_show_ja_setup_flow_again", true);
        }
        this.a.c();
    }

    @Override // defpackage.hst
    public final void b(EditorInfo editorInfo, EditorInfo editorInfo2, boolean z) {
        hqt b;
        hsk b2;
        if (editorInfo2 != null || ham.V(editorInfo)) {
            return;
        }
        dxi dxiVar = this.a;
        if (!((hrx) dxiVar.c).q || (b = hqp.b()) == null || !"ja-JP".equals(b.i().n)) {
            return;
        }
        int n = iin.n(dxiVar.a, b);
        if (n != 1 && n != 0) {
            return;
        }
        ino M = ino.M(dxiVar.a);
        if (!M.ah(R.string.f161500_resource_name_obfuscated_res_0x7f1406b7) && !M.ai("japanese_first_time_user")) {
            M.f("japanese_first_time_user", true);
        }
        if ((!M.ak("japanese_first_time_user") && !M.ak("should_show_ja_setup_flow_again")) || (b2 = hsx.b()) == null) {
            return;
        }
        View G = b2.G();
        imn aa = b2.aa();
        if (G == null || aa == null) {
            return;
        }
        View g = hyq.g(G, b2.y());
        dxiVar.c();
        dxiVar.b = new dxm(b.a(), aa);
        dxiVar.b.l(g);
        dxiVar.b.d(g);
        new Handler().postDelayed(new dvd(dxiVar, 11), 2000L);
        ieh.j().e(dxp.a, 0);
    }
}
