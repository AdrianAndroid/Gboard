package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dmn  reason: default package */
/* loaded from: classes.dex */
public final class dmn implements dml {
    static final hhl a = hhq.h("enable_language_report_in_apps", "");
    public List c;
    private hqo e;
    private final iqe d = iqe.e(a, 3);
    public final Bundle b = new Bundle();

    public static String c(jav javVar) {
        jau J = javVar.J();
        J.f.clear();
        J.h.clear();
        J.g.clear();
        return J.a().n;
    }

    private final void d() {
        hqo hqoVar = this.e;
        if (hqoVar != null) {
            hqoVar.f();
            this.e = null;
        }
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
    }

    @Override // defpackage.ifw
    public final void gn() {
        d();
        this.c = null;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void h(ibz ibzVar) {
    }

    @Override // defpackage.hfx
    public final void i() {
        d();
        this.c = null;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void j(EditorInfo editorInfo, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void k(hfy hfyVar) {
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        if (!ham.z(this.d, editorInfo) || this.e != null) {
            return true;
        }
        dmm dmmVar = new dmm(this);
        this.e = dmmVar;
        dmmVar.e(mjl.a);
        return true;
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
