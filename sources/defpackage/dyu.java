package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dyu  reason: default package */
/* loaded from: classes.dex */
public abstract class dyu extends dbk {
    public static final ltg i = ltg.j("com/google/android/apps/inputmethod/libs/search/AbstractSearchExtension");
    public String j;
    final ijj k = new cir(this, 4);
    private cuy l;
    private mko m;

    public static List ad(List list, int i2) {
        ArrayList arrayList = new ArrayList();
        hlk hlkVar = new hlk();
        hlkVar.d = String.valueOf(i2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hlkVar.a = (String) it.next();
            arrayList.add(hlkVar.a());
        }
        return arrayList;
    }

    @Override // defpackage.dbn, defpackage.hfz
    public final boolean S() {
        return true;
    }

    public abstract ekn Y();

    protected mko Z(String str) {
        cuy cuyVar = this.l;
        return cuyVar == null ? kcu.J(new IllegalStateException("image autocomplete manager is null")) : cuyVar.b(str, 1);
    }

    protected CharSequence aa() {
        return l();
    }

    protected String ab() {
        return ac();
    }

    protected abstract String ac();

    /* JADX INFO: Access modifiers changed from: protected */
    public final List ae(List list) {
        llp o;
        ekn Y = Y();
        if (!irs.d()) {
            o = llp.q();
        } else {
            ArrayList arrayList = new ArrayList(Y.b.a());
            Collections.reverse(arrayList);
            String str = Y.a;
            o = llp.o(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!o.contains(str2)) {
                arrayList2.add(str2);
            }
        }
        ArrayList arrayList3 = new ArrayList(ad(o, 3));
        arrayList3.addAll(ad(arrayList2, 2));
        return arrayList3;
    }

    public List af() {
        return Collections.emptyList();
    }

    public List ag() {
        return Collections.emptyList();
    }

    public final void ah() {
        if (R()) {
            z().y();
        }
    }

    protected boolean ai() {
        return true;
    }

    protected boolean aj() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r15v21, types: [hga, hsz] */
    @Override // defpackage.dbn, defpackage.hfh
    public boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f != null) {
            int i2 = f.c;
            afv afvVar = null;
            if (i2 == -30000) {
                eeq a = eeq.a(f);
                String str = a.b;
                mba mbaVar = a.c;
                if (a.equals(eeq.a)) {
                    ((ltd) ((ltd) i.c()).k("com/google/android/apps/inputmethod/libs/search/AbstractSearchExtension", "consumeEvent", 181, "AbstractSearchExtension.java")).t("INITIATE_SEARCH received with an invalid search info.");
                }
                if (!TextUtils.isEmpty(str) && !z().U()) {
                    Y().a(str);
                }
                if (aj()) {
                    ah();
                } else {
                    this.j = str;
                }
                getClass().getSimpleName();
                z().z(hfd.d(new iay(-10104, null, new icz(ac(), llw.n("query", str, "activation_source", hfl.INTERNAL, "search_query_type", mbaVar)))));
                return true;
            } else if (i2 == -30002) {
                String str2 = (String) f.e;
                hji.h(this.m);
                this.m = null;
                if (ai()) {
                    hsy hsyVar = this.e;
                    if (hsyVar == null) {
                        ((ltd) ((ltd) i.c()).k("com/google/android/apps/inputmethod/libs/search/AbstractSearchExtension", "updateAutoCompletion", 294, "AbstractSearchExtension.java")).t("keyboard is null");
                    } else if (TextUtils.isEmpty(str2)) {
                        hsyVar.r(ag(), null, false);
                    } else {
                        hiz k = hiz.k(Z(str2));
                        afp afpVar = afp.DESTROYED;
                        boolean z = jam.b;
                        llk e = llp.e();
                        llk e2 = llp.e();
                        llk e3 = llp.e();
                        e.h(new dys(this, 2));
                        e2.h(bxl.r);
                        if (hsyVar instanceof afv) {
                            afvVar = (afv) hsyVar;
                        }
                        afp afpVar2 = afp.CREATED;
                        k.E(hjg.a(gyc.b, afvVar, afpVar2, z, e, e2, e3));
                        this.m = k;
                    }
                }
                return true;
            } else if (i2 == -30008) {
                z().z(hfd.d(new iay(-10117, null, ab())));
                return true;
            }
        }
        return super.c(hfdVar);
    }

    @Override // defpackage.dbn, defpackage.gzv
    public void dump(Printer printer, boolean z) {
        String str;
        boolean R = R();
        printer.println("isActivated = " + R);
        boolean z2 = this.h;
        printer.println("isShown = " + z2);
        printer.println("currentLocale = ".concat(String.valueOf(String.valueOf(hqp.d()))));
        if (z) {
            str = jbs.b(((dbk) this).a);
        } else {
            str = ((dbk) this).a;
        }
        printer.println("getCurrentQuery = ".concat(String.valueOf(str)));
        printer.println("currentKeyboardType = ".concat(String.valueOf(String.valueOf(this.f))));
        hsy hsyVar = this.e;
        if (hsyVar instanceof gzv) {
            printer.println("--- begin currentKeyboard ---");
            ((gzv) hsyVar).dump(printer, z);
            printer.println("--- end currentKeyboard ---");
            return;
        }
        printer.println("currentKeyboard = ".concat(String.valueOf(hsyVar != null ? hsyVar.getClass().getSimpleName() : null)));
    }

    @Override // defpackage.dbn, defpackage.ifw
    public synchronized void gm(Context context, igg iggVar) {
        super.gm(context, iggVar);
        ino.M(context);
        this.l = cuy.a();
    }

    @Override // defpackage.dbk, defpackage.dbn, defpackage.hfx
    public synchronized boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        ((ltd) ((ltd) i.b()).k("com/google/android/apps/inputmethod/libs/search/AbstractSearchExtension", "onActivate", 105, "AbstractSearchExtension.java")).u("onActivate(): params.size() = %d", map == null ? 0 : map.size());
        ijl.b().h(this.k, eko.class, gyc.b);
        super.n(hqtVar, editorInfo, z, map, hflVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbk, defpackage.dbn
    public synchronized void r() {
        hji.h(this.m);
        this.m = null;
        if (ijl.b().f(eko.class)) {
            ijl.b().d(this.k, eko.class);
        }
        super.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbk
    public final void x(dbo dboVar) {
        super.x(dboVar);
        dboVar.v(aa());
    }
}
