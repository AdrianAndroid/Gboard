package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.util.Printer;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* renamed from: bvt  reason: default package */
/* loaded from: classes.dex */
public final class bvt implements bwj, htb, buc, bvx {
    public Context a;
    public bvp b;
    public bud c;
    public ibz d;
    public buk e;
    private dbr h;
    public final gjz g = gvs.a;
    public final hso f = new hso();
    private final hst i = new bvs(this);

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iah iahVar;
        bui buiVar = this.b.k;
        if (buiVar != null) {
            iay f = hfdVar.f();
            int i = f != null ? f.c : 0;
            if (buiVar.g != null && buiVar.e != null && hfdVar.p != 0 && hfdVar.a != iah.DOWN && (iahVar = hfdVar.a) != iah.UP && iahVar != iah.ON_FOCUS && i != -10062 && i != -10061 && i != -10057 && i != -10041 && i != -10030 && i != -10004 && i != 0 && i != -10054 && i != -10053) {
                switch (i) {
                    case -40003:
                    case -40002:
                    case -40001:
                    case -40000:
                        break;
                    default:
                        switch (i) {
                            case -10089:
                            case -10088:
                            case -10087:
                            case -10086:
                            case -10085:
                            case -10084:
                            case -10083:
                                break;
                            default:
                                switch (i) {
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                        break;
                                    default:
                                        boolean booleanValue = ((Boolean) bwv.g.c()).booleanValue();
                                        if (!buiVar.m) {
                                            if (booleanValue) {
                                                buiVar.a(7);
                                                break;
                                            }
                                        } else {
                                            if (!buiVar.l && booleanValue) {
                                                buiVar.l = true;
                                            }
                                            if (buiVar.e != null && buiVar.f == hwv.PREEMPTIVE_WITH_SUPPRESSION) {
                                                buiVar.f(hwv.PREEMPTIVE);
                                                break;
                                            }
                                        }
                                        break;
                                }
                        }
                }
            }
        }
        return false;
    }

    @Override // defpackage.idp
    public final Collection d(Context context, idi idiVar) {
        return llp.r(new bvy(idiVar));
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("currentKeyboardType = ".concat(String.valueOf(String.valueOf(this.d))));
        printer.println("autoPasteSuggestionHelper: ".concat(String.valueOf(String.valueOf(this.b.k))));
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.buc
    public final void f(boolean z) {
        hsk hskVar = this.f.a;
        if (hskVar != null) {
            hskVar.aq();
        }
        this.c = null;
        if (z) {
            this.f.br(null, false);
        }
    }

    public final void g() {
        bud budVar = this.c;
        if (budVar != null) {
            budVar.f(true);
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ClipboardExtension";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.a = context;
        bvp bvpVar = new bvp();
        this.b = bvpVar;
        bvpVar.c = context;
        bvpVar.q = ino.M(context);
        bvpVar.j = new btf(bvpVar, 5);
        bvpVar.q.X(bvpVar.j, R.string.f160650_resource_name_obfuscated_res_0x7f140661);
        bvpVar.n();
        bvpVar.e = new bvl(bvpVar, 0);
        bwv.l.e(bvpVar.e);
        bvpVar.p(bwv.l);
        bvpVar.f = new bvl(bvpVar, 2);
        bwv.p.e(bvpVar.f);
        bvpVar.q(bwv.p);
        bvpVar.d = (ClipboardManager) bvpVar.c.getSystemService("clipboard");
        bvpVar.d.addPrimaryClipChangedListener(bvpVar);
        if (Build.VERSION.SDK_INT >= 26) {
            bvpVar.h();
        }
        this.h = new dbr(this, context, R.xml.f210070_resource_name_obfuscated_res_0x7f170102);
        this.i.g(mjl.a);
    }

    @Override // defpackage.ifw
    public final void gn() {
        bvp bvpVar = this.b;
        bvpVar.d = (ClipboardManager) bvpVar.c.getSystemService("clipboard");
        bvpVar.d.removePrimaryClipChangedListener(bvpVar);
        bvpVar.k = null;
        bvpVar.l = null;
        bvpVar.n = null;
        bvpVar.m = null;
        inm inmVar = bvpVar.j;
        if (inmVar != null) {
            bvpVar.q.ae(inmVar, R.string.f160650_resource_name_obfuscated_res_0x7f140661);
            bvpVar.j = null;
        }
        if (bvpVar.e != null) {
            bwv.l.g(bvpVar.e);
            bvpVar.k();
            bvpVar.e = null;
        }
        if (bvpVar.f != null) {
            bwv.p.g(bvpVar.f);
            bvpVar.f = null;
            bvpVar.l();
            bvpVar.m();
        }
        this.h = null;
        g();
        this.i.h();
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void h(ibz ibzVar) {
    }

    @Override // defpackage.hfx
    public final void i() {
        bvp bvpVar = this.b;
        bvpVar.m = null;
        bvpVar.n = null;
        bvpVar.p = false;
        bui buiVar = bvpVar.k;
        if (buiVar != null) {
            buiVar.d = null;
            buiVar.h = null;
            buiVar.i = null;
            buiVar.k = false;
            boolean m = bui.m(buiVar.g);
            if (buiVar.l || m) {
                buiVar.a(true != m ? 7 : 9);
            } else {
                buiVar.b(false);
            }
            buiVar.c.h();
        }
        bur burVar = bvpVar.l;
        if (burVar != null) {
            hhq.q(burVar);
        }
    }

    @Override // defpackage.hfx
    public final void j(EditorInfo editorInfo, boolean z) {
        bvp bvpVar = this.b;
        bvpVar.n = editorInfo;
        bvpVar.p = z;
        bui buiVar = bvpVar.k;
        if (buiVar != null) {
            buiVar.i = editorInfo;
            buiVar.k = z;
            buiVar.e();
        }
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void k(hfy hfyVar) {
    }

    @Override // defpackage.bvx
    public final void l(bwi bwiVar) {
        this.b.r = bwiVar;
    }

    @Override // defpackage.bvx
    public final void m(boolean z) {
        this.b.g = z;
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        bvp bvpVar = this.b;
        bvpVar.m = hqtVar;
        bvpVar.n = editorInfo;
        bvpVar.p = z;
        bui buiVar = bvpVar.k;
        if (buiVar != null) {
            buiVar.g(hqtVar, editorInfo, z);
        }
        bur burVar = bvpVar.l;
        if (burVar != null) {
            burVar.b();
            return true;
        }
        return true;
    }

    @Override // defpackage.hfx
    public final boolean o() {
        return true;
    }

    @Override // defpackage.hfx
    public final boolean p() {
        return true;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void q() {
    }

    public final void r(Context context, imn imnVar, View view) {
        if (this.c == null) {
            bud budVar = new bud(context, imnVar, this);
            this.c = budVar;
            budVar.l(view);
            this.c.d(view);
        }
    }

    @Override // defpackage.htb
    public final /* synthetic */ boolean s(ibz ibzVar) {
        return true;
    }

    @Override // defpackage.htb
    public final void t(Context context, hsz hszVar, iav iavVar, ibz ibzVar, String str, jls jlsVar, hta htaVar) {
        dbr dbrVar = this.h;
        if (dbrVar != null) {
            dbrVar.a(context, hszVar, iavVar, ibzVar, str, jlsVar, new csj(this, htaVar, 1));
        } else {
            htaVar.a(ibzVar, null, null);
        }
    }

    @Override // defpackage.htb
    public final /* synthetic */ void u(Context context, ibz ibzVar, String str, jls jlsVar) {
    }
}
