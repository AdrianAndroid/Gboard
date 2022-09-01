package com.google.android.apps.inputmethod.libs.hint;

import android.content.Context;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.hint.notice.NoticeHolderView;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CentralizedHintManager implements dhw, hfh {
    public hkb a;
    private dhz c;
    public final dib b = new dib();
    private final cir d = new cir(this, 8);
    private final cir e = new cir(this, 7);
    private final hku postNoticeListener = new hku(this);
    private final hkw removeNoticeListener = new hkw(this);

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f;
        NoticeHolderView noticeHolderView;
        dhz dhzVar = this.c;
        if (dhzVar == null || (f = hfdVar.f()) == null) {
            return false;
        }
        if (f.d == iax.DECODE && (noticeHolderView = dhzVar.b) != null && noticeHolderView.getVisibility() == 0) {
            synchronized (dhzVar.a) {
            }
        }
        if (f.c != -10056) {
            return false;
        }
        dhzVar.h(true);
        Object obj = f.e;
        if (obj instanceof dia) {
            dib dibVar = dhzVar.a;
            dia diaVar = (dia) obj;
            hkt b = dibVar.b(diaVar.a);
            if (b != null) {
                dibVar.d(b);
                boolean z = diaVar.b;
                ((ltd) ((ltd) dib.a.b()).k("com/google/android/apps/inputmethod/libs/hint/notice/NoticeManager", "processNoticePressed", 81, "NoticeManager.java")).w("processNoticePressed(): Processing notice [%s]", b.i);
                Runnable runnable = b.c;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return true;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        hso hsoVar = new hso();
        hkh hkhVar = new hkh(hsoVar);
        hkhVar.i = new opu(this);
        this.a = new hkb(new dhy(context, hsoVar, hkhVar));
        this.c = new dhz(hsoVar.V(), this.b);
        ijl.b().h(this.d, hkq.class, gyc.a);
        ijl.b().h(this.e, hkp.class, gyc.a);
        ijl.b().h(this.postNoticeListener, hkv.class, gyc.a);
        ijl.b().h(this.removeNoticeListener, hkx.class, gyc.a);
    }

    @Override // defpackage.ifw
    public final void gn() {
        ijl.b().d(this.d, hkq.class);
        ijl.b().d(this.e, hkp.class);
        ijl.b().d(this.postNoticeListener, hkv.class);
        ijl.b().d(this.removeNoticeListener, hkx.class);
        hkb hkbVar = this.a;
        if (hkbVar != null) {
            hkbVar.close();
            this.a = null;
        }
        dhz dhzVar = this.c;
        if (dhzVar != null) {
            dhzVar.c.k(ibz.a, ice.HEADER, dhzVar);
            dhzVar.c.k(ibz.c, ice.HEADER, dhzVar);
            dhzVar.c.c(ibz.a, ice.HEADER, R.id.key_pos_header_notice);
            dhzVar.c.c(ibz.c, ice.HEADER, R.id.key_pos_header_notice);
            ijl.b().d(dhzVar.e, dic.class);
            this.c = null;
        }
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void h(ibz ibzVar) {
    }

    @Override // defpackage.hfx
    public final void i() {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void j(EditorInfo editorInfo, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void k(hfy hfyVar) {
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        return this.c != null;
    }

    @Override // defpackage.hfx
    public final boolean o() {
        return true;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void q() {
    }
}
