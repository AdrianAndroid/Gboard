package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import j$.util.Objects;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dtd  reason: default package */
/* loaded from: classes.dex */
public final class dtd implements dst {
    private dte a;
    private dtc b;
    private dup c;
    private EditorInfo d;
    private dxs e;

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        dtp a;
        dtc dtcVar = this.b;
        boolean z = false;
        if (dtcVar != null && (a = dtcVar.a()) != null && dtcVar.l() && dtcVar.n.b()) {
            dsx dsxVar = dtcVar.c.k;
            if (dsxVar.d) {
                iay iayVar = hfdVar.b[0];
                int i = iayVar.c;
                switch (i) {
                    case -50004:
                    case -50003:
                    case -50001:
                    case -10126:
                    case -10061:
                    case -10054:
                    case -10053:
                        dtcVar.h.f();
                        dtcVar.g.d(fhz.CURSOR_CHANGE);
                        a.e();
                        a.l = false;
                        break;
                    case -40002:
                        dtcVar.h.a();
                        break;
                    case -40000:
                    case -10129:
                        if (dsxVar.f) {
                            dtcVar.g.b();
                            z = true;
                            break;
                        }
                        break;
                    case -10138:
                        Object obj = iayVar.e;
                        if (obj instanceof Boolean) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            dtcVar.l = booleanValue;
                            ((duz) dtcVar.g).i("sending undoability update", new fbq(booleanValue, 1));
                            break;
                        }
                        break;
                    case -10135:
                    case -10134:
                    case -10133:
                    case -10060:
                    case -10059:
                    case -10058:
                        break;
                    case -10090:
                        dtcVar.h.d();
                        break;
                    case -10055:
                        if (a.m) {
                            a.m = false;
                            z = true;
                            break;
                        }
                        break;
                    case -10052:
                        if (dsxVar.d()) {
                            dtcVar.h.d();
                            dtcVar.h.f();
                            dtcVar.g.d(fhz.TYPING);
                            break;
                        }
                        break;
                    case -10044:
                        dwi dwiVar = dtcVar.h;
                        dwiVar.a();
                        if (dsxVar.d()) {
                            dwiVar.h(false);
                            dwiVar.j(false);
                            break;
                        }
                        break;
                    case -10043:
                    case -10009:
                        Object obj2 = iayVar.e;
                        if (obj2 instanceof String) {
                            String str = (String) obj2;
                            dtcVar.m(dtcVar.h, dtcVar.g, a);
                            break;
                        }
                        break;
                    case -10029:
                        dtcVar.h.d();
                        dtcVar.h.f();
                        dtcVar.g.d(fhz.TYPING);
                        break;
                    case -10002:
                        if (dsxVar.d()) {
                            gyc.b.execute(new dod(dtcVar, a, 9));
                            break;
                        }
                        break;
                    case 67:
                        long longValue = ((Long) dsu.g.c()).longValue();
                        a.e();
                        if (a.j && !a.d.a().f()) {
                            if (((dtv) a.d).b(fho.DELETE_LAST_WORD_OR_PUNCTUATION) && a.d.a().e > 0) {
                                int i2 = (int) longValue;
                                if (i2 != 1) {
                                    if (i2 == 2 && a.l) {
                                        a.m = true;
                                        a.h(-10134);
                                    }
                                } else {
                                    a.h(-10134);
                                    a.m = true;
                                }
                                z = true;
                            }
                        }
                        dtcVar.h.d();
                        dtcVar.h.f();
                        dtcVar.g.d(fhz.DELETE_KEY_PRESSED);
                        break;
                    default:
                        Object obj3 = iayVar.e;
                        if (i > 0) {
                            if (obj3 instanceof String) {
                                String str2 = (String) obj3;
                            }
                            dtcVar.m(dtcVar.h, dtcVar.g, a);
                            break;
                        }
                        break;
                }
                dtb dtbVar = dtcVar.f;
                boolean k = a.k();
                if (dtbVar.h) {
                    if (dtb.a.contains(Integer.valueOf(iayVar.c))) {
                        dtbVar.f = k;
                    }
                }
            }
        }
        return z;
    }

    @Override // defpackage.idp
    public final Collection d(Context context, idi idiVar) {
        return llp.r(new dty(idiVar));
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "NgaExtension";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        duz duzVar = new duz(context);
        this.c = duzVar;
        dxs dxsVar = new dxs(duzVar);
        this.e = dxsVar;
        jbz jbzVar = null;
        ijl.b().g(new jca(dxsVar, null));
        dte dteVar = new dte(context, duzVar);
        this.a = dteVar;
        dteVar.e();
        dtc dtcVar = new dtc(context, new dxe(context), duzVar, dxsVar, null);
        this.b = dtcVar;
        duzVar.d = dtcVar;
        duq.b(dtcVar);
        ((ltd) ((ltd) dtc.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaExtension", "onCreate", 126, "NgaExtension.java")).t("onCreate");
        dtcVar.l();
        dth dthVar = dtcVar.i;
        if (dthVar != null) {
            jcg jcgVar = (jcg) ijl.b().a(jcg.class);
            if (jcgVar != null && !jcgVar.a.isEmpty()) {
                jbzVar = (jbz) jcgVar.a.values().iterator().next();
            }
            dthVar.e = jbzVar;
            jcg.b("NGA", dthVar);
        }
        dtcVar.d.c = dtcVar;
    }

    @Override // defpackage.ifw
    public final void gn() {
        dte dteVar = this.a;
        if (dteVar != null) {
            dteVar.f();
        }
        this.a = null;
        duq.b(null);
        dup dupVar = this.c;
        if (dupVar != null) {
            dupVar.a();
            this.c = null;
        }
        dtc dtcVar = this.b;
        if (dtcVar != null) {
            ((ltd) ((ltd) dtc.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaExtension", "onDestroy", 135, "NgaExtension.java")).t("onDestroy");
            dth dthVar = dtcVar.i;
            if (dthVar != null) {
                jcg.c("NGA");
                dthVar.e = null;
            }
            this.b = null;
        }
        if (this.e != null) {
            ijl.b().e(jca.class);
            this.e = null;
        }
        this.d = null;
    }

    @Override // defpackage.hfx
    public final void h(ibz ibzVar) {
        dtc dtcVar = this.b;
        if (dtcVar != null) {
            dtl dtlVar = dtcVar.c;
            if (!Objects.equals(ibzVar, dtlVar.i)) {
                ((ltd) ((ltd) dtl.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaStateManager", "setKeyboardType", 88, "NgaStateManager.java")).G("setKeyboardTypeChanged %s -> %s", dtlVar.i, ibzVar);
            }
            dtlVar.i = ibzVar;
            if (dtlVar.b()) {
                dtcVar.d();
            }
            if (dtcVar.c.k.g) {
                return;
            }
            ((ltd) ((ltd) dtc.a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaExtension", "onCurrentKeyboardTypeChanged", 288, "NgaExtension.java")).w("unsupported keyboard type %s, dismissing dictation", ibzVar);
            dtcVar.g.b();
        }
    }

    @Override // defpackage.hfx
    public final void i() {
        dtc dtcVar = this.b;
        if (dtcVar != null) {
            ((ltd) ((ltd) dtc.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaExtension", "onDeactivate", 330, "NgaExtension.java")).t("NgaExtension#onDeactivate");
            dtb dtbVar = dtcVar.f;
            EditorInfo editorInfo = dtcVar.k;
            hqt hqtVar = dtcVar.j;
            dtbVar.c = editorInfo;
            dtbVar.d = hqtVar;
            dtbVar.g = dtbVar.f;
            dtbVar.h = false;
            dtcVar.h.i(null, null);
            dtl dtlVar = dtcVar.c;
            dtlVar.h = false;
            dtlVar.g = false;
            if (dtlVar.b()) {
                dtcVar.d();
            }
            ((duz) dtcVar.g).j("sending keyboard closed event", duu.c);
            dud dudVar = dtcVar.b;
            dudVar.c.h();
            dudVar.b();
            dtcVar.k = null;
            dtcVar.j = null;
            dtcVar.l = false;
        }
    }

    @Override // defpackage.hfx
    public final void j(EditorInfo editorInfo, boolean z) {
        if (editorInfo == this.d) {
            return;
        }
        this.d = editorInfo;
        dtc dtcVar = this.b;
        if (dtcVar == null) {
            return;
        }
        dtcVar.k = editorInfo;
        dtcVar.g.d(fhz.FIELD_CHANGE);
    }

    @Override // defpackage.hfx
    public final void k(hfy hfyVar) {
        dtc dtcVar = this.b;
        if (dtcVar != null) {
            dtcVar.m = hfyVar;
        }
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        fhz fhzVar;
        hfy hfyVar;
        dth dthVar;
        dtc dtcVar = this.b;
        if (dtcVar != null) {
            ((ltd) ((ltd) dtc.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaExtension", "onActivate", 296, "NgaExtension.java")).t("NgaExtension#onActivate");
            dtcVar.l();
            dtcVar.j = hqtVar;
            dtcVar.k = editorInfo;
            dtcVar.h.i(hqtVar.a(), editorInfo);
            dth dthVar2 = dtcVar.i;
            if (dthVar2 != null && (hfyVar = dtcVar.m) != null) {
                dthVar2.f = hfyVar;
                dtm dtmVar = dthVar2.c;
                if (dtmVar != null) {
                    dtj dtjVar = dthVar2.b;
                    gjz gjzVar = dtjVar.d;
                    if (SystemClock.elapsedRealtime() >= dtjVar.c + (((Long) dsu.f.c()).longValue() * 60000)) {
                        dtmVar.j();
                    }
                    dthVar = dthVar2;
                } else {
                    dthVar = dthVar2;
                }
                dtq dtqVar = dthVar.d;
                if (dtqVar != null) {
                    dtqVar.b(hfyVar);
                }
            }
            dtl dtlVar = dtcVar.c;
            ibz q = dtcVar.c().q();
            if (!Objects.equals(q, dtlVar.i)) {
                ((ltd) ((ltd) dtl.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaStateManager", "setKeyboardTypeAndVisibility", 100, "NgaStateManager.java")).G("setKeyboardTypeChanged %s -> %s", dtlVar.i, q);
            }
            dtlVar.h = true;
            dtlVar.g = false;
            dtlVar.i = q;
            if (dtlVar.b()) {
                dtcVar.d();
            }
            duz duzVar = (duz) dtcVar.g;
            duzVar.j("sending keyboard opened event", new dut(duzVar.c.a(), 1));
            dtp a = dtcVar.a();
            if (a != null) {
                dtb dtbVar = dtcVar.f;
                boolean k = a.k();
                dtbVar.b = editorInfo;
                dtbVar.e = hqtVar;
                dtbVar.f = k;
                EditorInfo editorInfo2 = dtbVar.b;
                EditorInfo editorInfo3 = dtbVar.c;
                hqt hqtVar2 = dtbVar.e;
                if (editorInfo3 == null || editorInfo2 == null || dtbVar.d == null || hqtVar2 == null) {
                    fhzVar = fhz.UNKNOWN_DONT_SEND;
                } else if (!editorInfo3.packageName.equals(editorInfo2.packageName) || editorInfo3.fieldId != editorInfo2.fieldId || editorInfo3.actionId != editorInfo2.actionId || editorInfo3.inputType != editorInfo2.inputType) {
                    fhzVar = fhz.FIELD_CHANGE;
                } else if (!Objects.equals(dtbVar.d.h(), hqtVar2.h())) {
                    fhzVar = fhz.INPUT_LANGUAGE_CHANGE;
                } else if (editorInfo2.fieldId == -1) {
                    fhzVar = fhz.FIELD_CHANGE;
                } else if (dtbVar.f || !dtbVar.g) {
                    fhzVar = fhz.FIELD_CHANGE;
                } else {
                    fhzVar = fhz.APPLICATION_CONSUMED_CONTENT;
                }
                dtbVar.h = true;
                ((ltd) ((ltd) dtc.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaExtension", "onActivate", 317, "NgaExtension.java")).u("NgaExtension: interaction type=%s", fhzVar.a());
                if (dtcVar.c.k.d) {
                    dtcVar.g.d(fhzVar);
                }
            } else {
                ((ltd) ((ltd) dtc.a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaExtension", "onActivate", 322, "NgaExtension.java")).t("onActivate: Missing inputManager, cannot send interaction");
            }
            dtcVar.b.b();
            return true;
        }
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
