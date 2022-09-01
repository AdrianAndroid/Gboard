package com.google.android.apps.inputmethod.libs.expression.keyboard;

import android.content.Context;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.keyboard.BaseExpressionKeyboard;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class BaseExpressionKeyboard extends LifecycleKeyboard implements ctu, gzv {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/expression/keyboard/BaseExpressionKeyboard");
    public csf a;
    private csi e;
    private Object f;
    private final Map c = new qo();
    private lmz d = lrr.a;
    private hzr g = icu.l(new hiu() { // from class: cse
        @Override // defpackage.hiu
        public final void a(Object obj) {
            BaseExpressionKeyboard baseExpressionKeyboard = BaseExpressionKeyboard.this;
            ((Integer) obj).intValue();
            csf csfVar = baseExpressionKeyboard.a;
            if (csfVar != null) {
                csfVar.a.n();
            }
        }
    });

    public BaseExpressionKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    private final void A() {
        if (this.a != null || this.e == null || this.w == null || !L(this.d, this.c)) {
            return;
        }
        ibm ibmVar = this.w;
        lmz lmzVar = this.d;
        Map map = this.c;
        Context context = this.u;
        nxp.V(context);
        Context applicationContext = this.u.getApplicationContext();
        nxp.V(applicationContext);
        hsz hszVar = this.v;
        nxp.V(hszVar);
        nxp.V(ibmVar);
        iav iavVar = this.x;
        nxp.V(iavVar);
        ibz ibzVar = this.s;
        nxp.V(ibzVar);
        lmz p = lmz.p(lmzVar);
        nxp.V(p);
        llw k = llw.k(map);
        nxp.V(k);
        nxp.U(context, Context.class);
        nxp.U(applicationContext, Context.class);
        nxp.U(hszVar, hsz.class);
        nxp.U(ibmVar, ibm.class);
        nxp.U(iavVar, iav.class);
        nxp.U(ibzVar, ibz.class);
        nxp.U(this, ctu.class);
        nxp.U(p, lmz.class);
        nxp.U(k, llw.class);
        csg csgVar = new csg(context, applicationContext, hszVar, this, p, k);
        try {
            this.a = new csf(this.e.f(csgVar), csgVar.e);
            this.d = lrr.a;
        } catch (Exception e) {
            ((ltd) ((ltd) b.a(hip.a).i(e)).k("com/google/android/apps/inputmethod/libs/expression/keyboard/BaseExpressionKeyboard", "maybeCreatePeer", 259, "BaseExpressionKeyboard.java")).t("Failed to create the peer");
        }
    }

    private final void H() {
        csf csfVar = this.a;
        if (csfVar == null) {
            return;
        }
        csfVar.close();
        this.a = null;
    }

    private final void K(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            csl cslVar = (csl) it.next();
            aj(cslVar.c, cslVar.d);
        }
    }

    private static boolean L(Set set, Map map) {
        return !set.isEmpty() && map.keySet().containsAll(set);
    }

    private final void t() {
        u(l(), this.f);
    }

    private final void u(EditorInfo editorInfo, Object obj) {
        csf csfVar = this.a;
        if (csfVar == null) {
            ((ltd) ((ltd) b.c()).k("com/google/android/apps/inputmethod/libs/expression/keyboard/BaseExpressionKeyboard", "maybeActivatePeer", 276, "BaseExpressionKeyboard.java")).t("activate(): peer is null");
        } else if (csfVar.c || csfVar.d) {
        } else {
            csfVar.c = true;
            csfVar.a.h(editorInfo, obj);
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        csf csfVar = this.a;
        return (csfVar != null && csfVar.a.c(hfdVar)) || super.c(hfdVar);
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public final void close() {
        super.close();
        H();
        this.e = null;
        this.c.clear();
        this.d = lrr.a;
        hzr hzrVar = this.g;
        if (hzrVar != null) {
            hzrVar.e();
            this.g = null;
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        csf csfVar = this.a;
        csi csiVar = this.e;
        printer.println("isInitialized() = true");
        boolean z2 = this.C;
        printer.println("isActive() = " + z2);
        boolean z3 = csiVar != null;
        printer.println("hasProvider() = " + z3);
        if (csfVar != null) {
            printer.println("hasPeer() = true");
            boolean z4 = csfVar.c;
            printer.println("peer.active = " + z4);
            boolean z5 = csfVar.d;
            printer.println("peer.closed = " + z5);
            csfVar.a.dump(printer, z);
            return;
        }
        printer.println("hasPeer() = false");
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        this.c.remove(csl.a(icfVar));
        csf csfVar = this.a;
        if (csfVar == null || L(csfVar.b, this.c)) {
            return;
        }
        this.d = this.a.b;
        H();
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/expression/keyboard/BaseExpressionKeyboard", "onKeyboardViewDiscarded", 122, "BaseExpressionKeyboard.java")).w("Discarded required view with type %s", icfVar.b);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        this.c.put(csl.a(icfVar), new csk(icfVar, softKeyboardView));
        A();
        if (this.C) {
            t();
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        this.f = obj;
        super.g(editorInfo, obj);
        if (this.e == null) {
            ((ltd) ((ltd) b.c()).k("com/google/android/apps/inputmethod/libs/expression/keyboard/BaseExpressionKeyboard", "onActivate", 132, "BaseExpressionKeyboard.java")).t("Activated without a peer provider");
        } else if (this.a == null) {
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/expression/keyboard/BaseExpressionKeyboard", "onActivate", 134, "BaseExpressionKeyboard.java")).G("Activated without a peer with current views [%s] and required views [%s]", this.c.keySet(), this.d);
            A();
        }
        u(editorInfo, obj);
    }

    @Override // defpackage.gzv
    public String getDumpableTag() {
        return "BaseExpressionKeyboard";
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        this.f = null;
        super.h();
        csf csfVar = this.a;
        if (csfVar != null) {
            csfVar.a();
        } else {
            ((ltd) ((ltd) b.c()).k("com/google/android/apps/inputmethod/libs/expression/keyboard/BaseExpressionKeyboard", "maybeDeactivatePeer", 288, "BaseExpressionKeyboard.java")).t("deactivate(): peer is null");
        }
        csi csiVar = this.e;
        if (csiVar == null) {
            return;
        }
        lmz l = csiVar.l();
        csf csfVar2 = this.a;
        if (csfVar2 != null && csfVar2.b.equals(l)) {
            return;
        }
        H();
        this.d = l;
        K(l);
    }

    @Override // defpackage.ctu
    public final EditorInfo l() {
        EditorInfo editorInfo = this.D;
        if (editorInfo == null) {
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/expression/keyboard/BaseExpressionKeyboard", "getEditorInfo", 162, "BaseExpressionKeyboard.java")).t("Returning a dummy EditorInfo");
            return new EditorInfo();
        }
        return editorInfo;
    }

    public final ctt m() {
        csf csfVar = this.a;
        if (csfVar != null) {
            return csfVar.a;
        }
        return null;
    }

    public final void o(csi csiVar) {
        if (csiVar == this.e) {
            return;
        }
        this.e = csiVar;
        H();
        lmz l = csiVar.l();
        this.d = l;
        if (l == null) {
            return;
        }
        K(l);
        A();
        if (!this.C) {
            return;
        }
        ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/expression/keyboard/BaseExpressionKeyboard", "setKeyboardPeerProvider", 96, "BaseExpressionKeyboard.java")).t("Peer provider set on an active keyboard");
        t();
    }
}
