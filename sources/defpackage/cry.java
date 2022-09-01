package defpackage;

import android.content.Context;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cry  reason: default package */
/* loaded from: classes.dex */
public final class cry implements crw {
    private hfy a;
    private final hsh b = new crx(this);
    private Context c;

    public final void c(String str) {
        char c;
        ibz ibzVar;
        hfy hfyVar;
        int hashCode = str.hashCode();
        if (hashCode == -1543918089) {
            if (str.equals("OPEN_GIF_KEYBOARD")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != -1192064395) {
            if (hashCode == -280374754 && str.equals("OPEN_STICKER_KEYBOARD")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("OPEN_EMOJI_KEYBOARD")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            ibzVar = ibz.d;
        } else if (c != 1) {
            ibzVar = c != 2 ? null : ibz.a(this.c.getString(R.string.f155000_resource_name_obfuscated_res_0x7f1403a7));
        } else {
            ibzVar = ibz.a(this.c.getString(R.string.f155020_resource_name_obfuscated_res_0x7f1403a9));
        }
        if (ibzVar == null || (hfyVar = this.a) == null) {
            return;
        }
        hfyVar.z(hfd.d(new iay(-10004, null, ibzVar.l)));
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
        this.c = context;
        this.b.d(gyc.b);
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.b.e();
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
    public final void k(hfy hfyVar) {
        this.a = hfyVar;
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        if (this.a == null || editorInfo.privateImeOptions == null) {
            return true;
        }
        c(editorInfo.privateImeOptions);
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
