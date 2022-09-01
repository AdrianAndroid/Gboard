package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: hpa  reason: default package */
/* loaded from: classes.dex */
public final class hpa implements hou {
    private static final lug c = hin.a;
    private final hoz d;
    private final ino e;
    private hox k;
    private EditorInfo m;
    private boolean n;
    private final ArrayList f = new ArrayList();
    private final Map g = new qo();
    private final List h = new ArrayList();
    private final List i = new ArrayList();
    private final Map j = new qo();
    private iau l = iau.SOFT;
    public boolean b = true;

    public hpa(Context context, hoz hozVar) {
        this.d = hozVar;
        this.e = ino.M(context);
    }

    public static String q(iau iauVar, jav javVar) {
        String iauVar2 = iauVar.toString();
        String valueOf = String.valueOf(javVar);
        return "ACTIVE_IME." + iauVar2 + "." + valueOf;
    }

    private final jav u(jav javVar) {
        if (javVar != null) {
            if (!javVar.D()) {
                this.d.bP();
            }
            return this.g.containsKey(javVar) ? javVar : javVar.j(this.g.keySet());
        }
        return null;
    }

    private final String v(jav javVar) {
        String str = null;
        String d = this.e.d(q(this.l, javVar), null);
        if (!TextUtils.isEmpty(d) && this.j.containsKey(d)) {
            str = d;
        }
        if (str != null) {
            return str;
        }
        List list = (List) this.g.get(javVar);
        if (list != null) {
            return ((hox) list.get(0)).ab();
        }
        if (!this.h.isEmpty()) {
            return ((hox) this.h.get(0)).ab();
        }
        Map map = this.j;
        return map.isEmpty() ? str : (String) map.keySet().iterator().next();
    }

    @Override // defpackage.hou
    public final int a() {
        EditorInfo editorInfo = this.m;
        if (editorInfo != null) {
            return editorInfo.inputType;
        }
        return 1;
    }

    @Override // defpackage.hou
    public final hox b() {
        return this.k;
    }

    @Override // defpackage.hou
    public final void c(hox hoxVar) {
        this.f.add(hoxVar);
    }

    @Override // defpackage.hou, java.lang.AutoCloseable
    public final void close() {
        e();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((hox) arrayList.get(i)).close();
        }
        this.f.clear();
        this.j.clear();
        this.g.clear();
        this.h.clear();
        this.i.clear();
        this.k = null;
    }

    @Override // defpackage.hou
    public final void d() {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hph hphVar = ((hox) arrayList.get(i)).e.b;
            int i2 = hphVar.b.d;
            for (int i3 = 0; i3 < i2; i3++) {
                htf htfVar = (htf) hphVar.b.f(i3);
                if (htfVar != null) {
                    for (ice iceVar : ice.values()) {
                        htfVar.a.ab(iceVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.hou
    public final void e() {
        s();
        this.n = false;
    }

    @Override // defpackage.hou
    public final void f(iau iauVar) {
        this.l = iauVar;
        this.j.clear();
        this.g.clear();
        this.h.clear();
        this.i.clear();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hox hoxVar = (hox) arrayList.get(i);
            if (hoxVar.d.n == this.l) {
                hoxVar.ab();
                this.j.put(hoxVar.ab(), hoxVar);
                Map map = this.g;
                jav aa = hoxVar.aa();
                List list = (List) map.get(aa);
                if (list == null) {
                    list = new ArrayList();
                    map.put(aa, list);
                }
                list.add(hoxVar);
                jav aa2 = hoxVar.aa();
                if (!aa2.D()) {
                    this.h.add(hoxVar);
                    if (!this.i.contains(aa2)) {
                        this.i.add(aa2);
                    }
                }
            }
        }
        hox o = o();
        if (o != null) {
            t(o);
        }
    }

    @Override // defpackage.hou
    public final void g() {
        s();
        this.n = true;
        r();
    }

    @Override // defpackage.hou
    public final void h(String str) {
        hox hoxVar = this.k;
        if (hoxVar == null || !hoxVar.ab().equals(str)) {
            hox hoxVar2 = (hox) this.j.get(str);
            if (hoxVar2 != null) {
                t(hoxVar2);
            } else {
                ((luc) ((luc) c.c()).k("com/google/android/libraries/inputmethod/inputbundle/InputBundleManager", "switchToInputBundle", 354, "InputBundleManager.java")).w("Ime %s is not available for the current configuration.", str);
            }
        }
    }

    @Override // defpackage.hou
    public final void i(jav javVar) {
        jav p = p(javVar, null);
        if (p != null) {
            h(v(p));
        }
    }

    @Override // defpackage.hou
    public final void j(EditorInfo editorInfo, boolean z) {
        hox hoxVar;
        this.m = editorInfo;
        hox o = o();
        hox hoxVar2 = this.k;
        if (hoxVar2 != o) {
            if (o != null) {
                t(o);
            } else {
                ((luc) ((luc) c.c()).k("com/google/android/libraries/inputmethod/inputbundle/InputBundleManager", "updateEditorInfo", 184, "InputBundleManager.java")).u("Ime is not available for EditorInfo, inputType=%d", editorInfo.inputType);
            }
        }
        if (!z || !this.n || hoxVar2 != o || (hoxVar = this.k) == null) {
            return;
        }
        hoxVar.ac();
    }

    @Override // defpackage.hou
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.hou
    public final void l() {
    }

    @Override // defpackage.hou
    public final void m(hox hoxVar) {
        int indexOf;
        int size = this.h.size();
        if (size <= 1 || (indexOf = this.h.indexOf(hoxVar)) < 0) {
            return;
        }
        t((hox) this.h.get((indexOf + 1) % size));
    }

    public final hox n(String str) {
        return (hox) this.j.get(str);
    }

    public final hox o() {
        jav javVar;
        jav p;
        if (ham.ab(this.m) || ham.ac(this.m)) {
            if (ham.I(this.m)) {
                javVar = jaj.b;
            } else {
                javVar = jaj.a;
            }
        } else if (ham.T(this.m)) {
            javVar = jaj.d;
        } else if (ham.R(this.m)) {
            javVar = jaj.c;
        } else if (ham.W(this.m)) {
            javVar = jaj.e;
        } else {
            javVar = ham.F(this.m) ? jaj.f : null;
        }
        if (javVar == null) {
            jav g = this.d.g(this.m);
            p = p(TextUtils.isEmpty(null) ? g : jav.f(null), g);
        } else {
            p = p(javVar, null);
        }
        return n(v(p));
    }

    final jav p(jav javVar, jav javVar2) {
        jav u = u(javVar);
        if (u != null) {
            return u;
        }
        jav u2 = u(javVar2);
        if (u2 != null) {
            return u2;
        }
        if (javVar == null || !javVar.equals(jaj.a) || !this.g.containsKey(jaj.b)) {
            jav javVar3 = null;
            String str = javVar == null ? null : javVar.g;
            String str2 = javVar2 == null ? null : javVar2.g;
            jav javVar4 = null;
            for (jav javVar5 : this.i) {
                this.d.bP();
                if (str != null && TextUtils.equals(javVar5.g, str)) {
                    return javVar5;
                }
                if (javVar4 == null) {
                    javVar4 = javVar5;
                }
                if (str2 != null && TextUtils.equals(javVar5.g, str2)) {
                    javVar3 = javVar5;
                }
            }
            return javVar3 != null ? javVar3 : javVar4 != null ? javVar4 : jav.d;
        }
        return jaj.b;
    }

    public final void r() {
        hox hoxVar = this.k;
        if (hoxVar == null || !this.n) {
            return;
        }
        int i = hoxVar.g;
        if (i == 0) {
            hoxVar.g = 1;
            hoxVar.hO().c(ide.c);
            EditorInfo N = hoxVar.c.N();
            hoxVar.f.a = ino.M(hoxVar.b).aj(R.string.f160360_resource_name_obfuscated_res_0x7f140641) && ham.A(N);
            hlp p = hoxVar.p();
            if (N != null) {
                p.i(N, hoxVar.c.bu());
            } else {
                ((ltd) hox.a.a(hip.a).k("com/google/android/libraries/inputmethod/inputbundle/InputBundle", "activateIme", 431, "InputBundle.java")).t("activateIme with a null editorInfo");
            }
            hoxVar.hO().e(hpb.IME_ACTIVATED, N);
            hoxVar.c.showStatusIcon(hoxVar.d.m);
        } else if (i == 1) {
            hoxVar.ac();
        }
        hoxVar.ad(ibz.a, true);
    }

    public final void s() {
        hox hoxVar = this.k;
        if (hoxVar == null || !this.n) {
            return;
        }
        hoxVar.ah();
        hoxVar.ae();
        hph hphVar = hoxVar.e.b;
        int i = hphVar.b.d;
        for (int i2 = 0; i2 < i; i2++) {
            htf htfVar = (htf) hphVar.b.f(i2);
            if (htfVar != null) {
                htfVar.a.fp(-1L, false);
            }
        }
    }

    public final void t(hox hoxVar) {
        hox hoxVar2;
        if (hoxVar != this.k) {
            hoxVar.ab();
            s();
            this.k = hoxVar;
            r();
            if (!this.j.containsValue(hoxVar) || (hoxVar2 = this.k) == null || !this.b) {
                return;
            }
            this.e.j(q(this.l, hoxVar2.aa()), this.k.ab());
        }
    }
}
