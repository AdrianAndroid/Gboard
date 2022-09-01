package defpackage;

import android.view.inputmethod.EditorInfo;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dbk  reason: default package */
/* loaded from: classes.dex */
public abstract class dbk extends dbn {
    private static final ltg i = ltg.j("com/google/android/apps/inputmethod/libs/extension/AbstractEditableExtension");
    public String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract CharSequence l();

    @Override // defpackage.dbn
    public void m(hfl hflVar) {
        if (this.f == null) {
            ((ltd) i.a(hip.a).k("com/google/android/apps/inputmethod/libs/extension/AbstractEditableExtension", "onActivateCurrentKeyboard", 68, "AbstractEditableExtension.java")).t("onActivateCurrentKeyboard called with null keyboard type");
            return;
        }
        hsy hsyVar = this.e;
        if (hsyVar == null) {
            ((ltd) ((ltd) i.b()).k("com/google/android/apps/inputmethod/libs/extension/AbstractEditableExtension", "onActivateCurrentKeyboard", 72, "AbstractEditableExtension.java")).t("onActivateCurrentKeyboard: No keyboard to activate");
            return;
        }
        F(hsyVar, hv());
        hsy hsyVar2 = this.e;
        if (hsyVar2 instanceof dbo) {
            x((dbo) hsyVar2);
            hpu t = ((dbo) this.e).t(z().f());
            z().R(t, false);
            ((dbo) this.e).w(this.a);
            EditorInfo a = t != null ? t.a() : null;
            if (!jam.B() && a == null) {
                ((ltd) i.a(hip.a).k("com/google/android/apps/inputmethod/libs/extension/AbstractEditableExtension", "onActivateCurrentKeyboard", 91, "AbstractEditableExtension.java")).w("Editable keyboard %s failed to provide editor info for internal text field. Falling back to external field info.", this.e.getClass().getSimpleName());
                a = z().f();
            }
            this.e.g(a, V(hflVar));
        } else if (hsyVar2 instanceof dbp) {
            ((dbp) hsyVar2).w(this.a);
            this.e.g(z().g(), V(hflVar));
        } else {
            hsyVar2.g(z().g(), V(hflVar));
        }
        M();
    }

    @Override // defpackage.dbn, defpackage.hfx
    public synchronized boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        super.n(hqtVar, editorInfo, z, map, hflVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbn
    public synchronized void r() {
        super.r();
        this.a = null;
    }

    @Override // defpackage.dbn, defpackage.hfz
    public final void v() {
        super.v();
        z().R(null, false);
    }

    @Override // defpackage.dbn
    public synchronized void w(Map map, hfl hflVar) {
        if (!R()) {
            return;
        }
        hfv hfvVar = ((hfw) z()).e;
        hfw hfwVar = ((hfp) hfvVar).g == null ? ((hfp) hfvVar).h : ((hfp) hfvVar).f;
        String str = null;
        hfz l = (hfwVar == null || !hfwVar.Z()) ? null : hfwVar.l();
        if (map == null || map.isEmpty()) {
            if (l != null && (l instanceof dbk)) {
                dbk dbkVar = (dbk) l;
                if (dbkVar.h) {
                    str = dbkVar.a;
                }
            }
        } else {
            str = (String) map.get("query");
        }
        this.a = str;
        super.w(map, hflVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x(dbo dboVar) {
        dboVar.u(l());
    }
}
