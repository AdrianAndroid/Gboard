package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.util.Printer;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.libraries.inputmethod.widgets.ManagedFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* renamed from: hxi  reason: default package */
/* loaded from: classes.dex */
public final class hxi implements hww, gzv {
    public static final ltg b = ltg.j("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController");
    private final qv h = new qv();
    private final CopyOnWriteArraySet i = new CopyOnWriteArraySet();
    public final qv c = new qv();
    public final qv d = new qv();
    public final qv e = new qv();
    private final qv j = new qv();
    public final qv f = new qv();
    public final hxc g = new hxc();

    private final int A(int i) {
        return this.g.b[i].g;
    }

    private final void B(ibz ibzVar, ice iceVar, int i) {
        Integer valueOf = Integer.valueOf(i);
        jbi.h(i);
        hxh a = hxh.a(ibzVar, iceVar, i);
        hxd a2 = hxd.a(ibzVar, iceVar);
        qv qvVar = this.j;
        qq qqVar = (qq) qvVar.get(a2);
        if (qqVar != null) {
            qqVar.remove(valueOf);
            if (qqVar.isEmpty()) {
                qvVar.remove(a2);
            }
        }
        if (((hws) this.e.remove(a)) == null) {
            ((ltd) ((ltd) b.b()).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "clearSubViewControllerInternal", 427, "KeyboardViewController.java")).K("Clears keyboard sub view controller for keyboardType: %s, viewType: %s, viewId: %d(%s),which has not been set.", ibzVar, iceVar, valueOf, jbi.h(i));
        }
    }

    private final void C(hxh hxhVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c.get(hxhVar);
        if (copyOnWriteArraySet != null) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                hwt hwtVar = (hwt) it.next();
                if (copyOnWriteArraySet.contains(hwtVar)) {
                    hwtVar.a();
                }
            }
        }
    }

    private final void D(ibz ibzVar, ice iceVar, hwu hwuVar) {
        hjg.q();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.h.get(hxd.a(ibzVar, iceVar));
        if (copyOnWriteArraySet == null || !copyOnWriteArraySet.remove(hwuVar)) {
            ((ltd) b.a(hip.a).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "unregisterListenerInternal", 222, "KeyboardViewController.java")).J("unregistering the listener %s %s %s which has been unregistered or has never been registered.", ibzVar, iceVar, hwuVar);
        }
    }

    public static Object p(qv qvVar, Object obj, leq leqVar) {
        Object obj2 = qvVar.get(obj);
        if (obj2 == null) {
            Object a = leqVar.a(obj);
            qvVar.put(obj, a);
            return a;
        }
        return obj2;
    }

    private final SparseArray v(int i) {
        hxe hxeVar = this.g.b[i];
        if (hxeVar.e == null) {
            hxeVar.e = new SparseArray();
        }
        return hxeVar.e;
    }

    private final View w(int i) {
        return this.g.b[i].a;
    }

    private final void x(ice iceVar, hwu hwuVar) {
        int ordinal = iceVar.ordinal();
        int A = A(ordinal);
        View w = w(ordinal);
        if (w == null) {
            return;
        }
        int i = A - 1;
        if (A == 0) {
            throw null;
        }
        if (i != 0) {
            if (i == 1) {
                hwuVar.a(o(), iceVar, w);
                hwuVar.d(w);
                return;
            } else if (i == 2) {
                hwuVar.a(o(), iceVar, w);
                hwuVar.d(w);
                hwuVar.e();
                return;
            } else if (i != 3) {
                return;
            }
        }
        hwuVar.a(o(), iceVar, w);
    }

    private final boolean y(ibz ibzVar, ice iceVar, hwu hwuVar) {
        hjg.q();
        if (!((CopyOnWriteArraySet) p(this.h, hxd.a(ibzVar, iceVar), hht.t)).add(hwuVar)) {
            ((ltd) b.a(hip.a).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "registerListenerInternal", 177, "KeyboardViewController.java")).J("Registers keyboard view listener %s for %s %s more than once.", hwuVar, ibzVar, iceVar);
            return false;
        }
        return true;
    }

    private final boolean z(ibz ibzVar, ice iceVar, int i, hws hwsVar) {
        hws hwsVar2 = (hws) this.e.put(hxh.a(ibzVar, iceVar, i), hwsVar);
        if (hwsVar2 != null) {
            ((ltd) ((ltd) b.c()).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "setSubViewControllerInternal", 372, "KeyboardViewController.java")).M("More than one sub view controller is declared to keyboardType: %s, viewType: %s, viewId: %d(%s), controller: %s, original controller: %s", ibzVar, iceVar, Integer.valueOf(i), jbi.h(i), hwsVar, hwsVar2);
            return false;
        }
        Integer valueOf = Integer.valueOf(i);
        jbi.h(i);
        ((qq) p(this.j, hxd.a(ibzVar, iceVar), hwy.b)).add(valueOf);
        return true;
    }

    @Override // defpackage.hww
    public final boolean a(ice iceVar, hwu hwuVar) {
        if (y(null, iceVar, hwuVar)) {
            x(iceVar, hwuVar);
            return true;
        }
        return false;
    }

    @Override // defpackage.hww
    public final boolean b(ice iceVar, int i, hws hwsVar) {
        return z(null, iceVar, i, hwsVar);
    }

    @Override // defpackage.hww
    public final void c(ibz ibzVar, ice iceVar, int i) {
        B(ibzVar, iceVar, i);
    }

    @Override // defpackage.hww
    public final void d(ice iceVar, int i) {
        B(null, iceVar, i);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        hxc hxcVar = this.g;
        for (int i = 0; i < ice.values().length; i++) {
            printer.println("# ".concat(String.valueOf(ice.values()[i].name())));
            hxe hxeVar = hxcVar.b[i];
            printer.println("## LastNotified:");
            if (hxeVar.d != null) {
                for (int i2 = 0; i2 < hxeVar.d.size(); i2++) {
                    int keyAt = hxeVar.d.keyAt(i2);
                    hxf hxfVar = (hxf) hxeVar.d.valueAt(i2);
                    printer.println(String.format(Locale.US, "id=%x/%s o=%d shown=%b", Integer.valueOf(keyAt), jbi.h(keyAt), Integer.valueOf(System.identityHashCode(hxfVar.b)), Boolean.valueOf(hxfVar.a)));
                }
            }
            printer.println("## Show Status:");
            if (hxeVar.e != null) {
                for (int i3 = 0; i3 < hxeVar.e.size(); i3++) {
                    int keyAt2 = hxeVar.e.keyAt(i3);
                    hxg hxgVar = (hxg) hxeVar.e.valueAt(i3);
                    printer.println(String.format(Locale.US, "id=%x/%s priority=%d shownByDescendant=%b", Integer.valueOf(keyAt2), jbi.h(keyAt2), Integer.valueOf(hxgVar.a.ordinal()), Boolean.valueOf(hxgVar.b)));
                }
            }
        }
    }

    @Override // defpackage.hww
    public final boolean e(ice iceVar, int i, boolean z, boolean z2) {
        jbi.h(i);
        int ordinal = iceVar.ordinal();
        View w = w(ordinal);
        View findViewById = w != null ? w.findViewById(i) : null;
        if (findViewById == null) {
            ((ltd) ((ltd) b.b()).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "hide", 938, "KeyboardViewController.java")).z("Requesting to hide sub view with id %d %s which doesn't exist in current keyboard view", i, jbi.h(i));
            return false;
        }
        boolean isShown = findViewById.isShown();
        int i2 = true != z ? 4 : 8;
        if (isShown) {
            boolean t = t(findViewById, i2, i, iceVar.ordinal());
            u(o(), iceVar, hwy.a, false);
            ViewParent parent = findViewById.getParent();
            if (z2 && (parent instanceof ManagedFrameLayout)) {
                ManagedFrameLayout managedFrameLayout = (ManagedFrameLayout) parent;
                if (managedFrameLayout.isShown() && ManagedFrameLayout.b(findViewById) && t) {
                    int childCount = managedFrameLayout.getChildCount();
                    SparseArray v = v(iceVar.ordinal());
                    while (true) {
                        childCount--;
                        if (childCount >= 0) {
                            View childAt = managedFrameLayout.getChildAt(childCount);
                            int id = childAt.getId();
                            if (id != i && ManagedFrameLayout.b(childAt)) {
                                hws hwsVar = (hws) this.e.get(hxh.a(o(), iceVar, id));
                                if (hwsVar != null) {
                                    hwsVar.hM();
                                }
                                hws hwsVar2 = (hws) this.e.get(hxh.a(null, iceVar, id));
                                if (hwsVar2 != null) {
                                    hwsVar2.hM();
                                }
                                if (childAt.getVisibility() == 0 && v.get(id) != null) {
                                    break;
                                }
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            return true;
        }
        t(findViewById, i2, i, ordinal);
        return true;
    }

    @Override // defpackage.hww
    public final void f(hwu hwuVar) {
        hjg.q();
        if (this.i.add(hwuVar)) {
            for (int i = 0; i < ice.values().length; i++) {
                x(ice.values()[i], hwuVar);
            }
            return;
        }
        ((ltd) b.a(hip.a).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "registerListener", 94, "KeyboardViewController.java")).w("register keyboard view listener %s for all keyboard views more than once", hwuVar);
    }

    @Override // defpackage.hww
    public final void g(ibz ibzVar, ice iceVar, hwu hwuVar) {
        if (!y(ibzVar, iceVar, hwuVar) || ibzVar != o()) {
            return;
        }
        x(iceVar, hwuVar);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "KeyboardViewController";
    }

    @Override // defpackage.hww
    public final void h(ibz ibzVar, ice iceVar, int i, hws hwsVar) {
        z(ibzVar, iceVar, i, hwsVar);
    }

    @Override // defpackage.hww
    public final boolean i(final ice iceVar, int i, final boolean z, final hwv hwvVar, final boolean z2) {
        View view;
        int ordinal;
        int i2;
        ArrayList arrayList;
        int A;
        jbi.h(i);
        View w = w(iceVar.ordinal());
        if (w == null) {
            view = null;
        } else if (w.getVisibility() != 0) {
            ((ltd) ((ltd) b.c()).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "show", 476, "KeyboardViewController.java")).t("Requesting to show a sub view when keyboard view itself is not shown.");
            return false;
        } else {
            view = w.findViewById(i);
        }
        View view2 = view;
        if (view2 == null || !((ordinal = iceVar.ordinal()) == ice.FLOATING_CANDIDATES.ordinal() || (A = A(ordinal)) == 2 || A == 3)) {
            if (view2 == null) {
                ((ltd) b.a(hip.a).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "show", 484, "KeyboardViewController.java")).z("Requesting to show sub view with id %d(%s) which doesn't exist in current keyboard view", i, jbi.h(i));
                return false;
            }
            ((ltd) ((ltd) b.d()).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "show", 493, "KeyboardViewController.java")).J("Requesting to show sub view with id %d(%s) when keyboard %s view is not ready to show", Integer.valueOf(i), jbi.h(i), iceVar);
            return false;
        }
        final int ordinal2 = iceVar.ordinal();
        final SparseArray v = v(iceVar.ordinal());
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        hcd hcdVar = new hcd(this, ordinal2, iceVar, 2);
        hiu hiuVar = new hiu() { // from class: hwz
            @Override // defpackage.hiu
            public final void a(Object obj) {
                hws hwsVar;
                hxi hxiVar = hxi.this;
                int i3 = ordinal2;
                boolean z3 = z;
                ice iceVar2 = iceVar;
                ArrayList arrayList4 = arrayList3;
                View view3 = (View) obj;
                hxiVar.g.a(view3.getId(), i3);
                view3.setVisibility(0);
                if (!z3 || view3.getId() == -1) {
                    return;
                }
                int id = view3.getId();
                hws hwsVar2 = (hws) hxiVar.e.get(hxh.a(hxiVar.o(), iceVar2, id));
                Animator m = hwsVar2 != null ? hwsVar2.m() : null;
                if (m == null && (hwsVar = (hws) hxiVar.e.get(hxh.a(null, iceVar2, id))) != null) {
                    m = hwsVar.m();
                }
                if (m == null) {
                    return;
                }
                arrayList4.add(m);
            }
        };
        final ArrayList arrayList4 = new ArrayList();
        lfe lfeVar = new lfe() { // from class: hxa
            @Override // defpackage.lfe
            public final boolean a(Object obj) {
                View childAt;
                hxg hxgVar;
                int i3;
                View childAt2;
                hxg hxgVar2;
                hwv hwvVar2;
                hwv hwvVar3 = hwv.this;
                boolean z3 = z2;
                SparseArray sparseArray = v;
                ArrayList arrayList5 = arrayList4;
                View view3 = (View) obj;
                if (view3 != null) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    int indexOfChild = viewGroup.indexOfChild(view3);
                    if (z3) {
                        if (hwvVar3 == hwv.PREEMPTIVE || hwvVar3 == hwv.PREEMPTIVE_WITH_SUPPRESSION || hwvVar3 == hwv.PREEMPTIVE_NON_INTERRUPTIBLE) {
                            int id = view3.getId();
                            int childCount = viewGroup.getChildCount();
                            if (indexOfChild >= childCount) {
                                ((ltd) hxi.b.a(hip.a).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "isSuppressedBySibling", 677, "KeyboardViewController.java")).y("viewIndex %d is out of children array size %d", indexOfChild, childCount);
                            } else {
                                for (int i4 = 0; i4 < childCount; i4++) {
                                    if (i4 != indexOfChild && (childAt = viewGroup.getChildAt(i4)) != null && ManagedFrameLayout.b(childAt) && (hxgVar = (hxg) sparseArray.get(childAt.getId())) != null) {
                                        hwv hwvVar4 = hxgVar.a;
                                        if (hwvVar4 == hwv.PREEMPTIVE_WITH_SUPPRESSION) {
                                            if (childAt.getId() != -1 && (childAt.getParent() instanceof ManagedFrameLayout)) {
                                                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                                if (layoutParams instanceof jdi) {
                                                    jdi jdiVar = (jdi) layoutParams;
                                                    if (jdiVar.a) {
                                                        i3 = jdiVar.b;
                                                        if (i3 == 0 && i3 == id) {
                                                            ((ltd) ((ltd) hxi.b.b()).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "lambda$showSelfAndAncestors$6", 610, "KeyboardViewController.java")).G("current view doesn't has the priority %s to show itself, %s", view3, hwvVar3);
                                                        }
                                                    }
                                                }
                                            }
                                            i3 = 0;
                                            if (i3 == 0) {
                                                continue;
                                            } else {
                                                ((ltd) ((ltd) hxi.b.b()).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "lambda$showSelfAndAncestors$6", 610, "KeyboardViewController.java")).G("current view doesn't has the priority %s to show itself, %s", view3, hwvVar3);
                                            }
                                        } else if (hwvVar4 == hwv.PREEMPTIVE_NON_INTERRUPTIBLE) {
                                            ((ltd) ((ltd) hxi.b.b()).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "lambda$showSelfAndAncestors$6", 610, "KeyboardViewController.java")).G("current view doesn't has the priority %s to show itself, %s", view3, hwvVar3);
                                        }
                                    }
                                }
                            }
                        } else if (hwvVar3 == hwv.DEFAULT && (viewGroup instanceof ManagedFrameLayout)) {
                            int childCount2 = viewGroup.getChildCount();
                            if (indexOfChild >= childCount2) {
                                ((ltd) hxi.b.a(hip.a).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "hasSiblingVisibleWithHigherPriority", 745, "KeyboardViewController.java")).y("viewIndex %d is out of children array size %d", indexOfChild, childCount2);
                            } else {
                                for (int i5 = 0; i5 < childCount2; i5++) {
                                    if (i5 == indexOfChild || (childAt2 = viewGroup.getChildAt(i5)) == null || !ManagedFrameLayout.b(childAt2) || (hxgVar2 = (hxg) sparseArray.get(childAt2.getId())) == null || (i5 <= indexOfChild && (hwvVar2 = hxgVar2.a) != hwv.PREEMPTIVE && hwvVar2 != hwv.PREEMPTIVE_WITH_SUPPRESSION && hwvVar2 != hwv.PREEMPTIVE_NON_INTERRUPTIBLE)) {
                                    }
                                    ((ltd) ((ltd) hxi.b.b()).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "lambda$showSelfAndAncestors$6", 610, "KeyboardViewController.java")).G("current view doesn't has the priority %s to show itself, %s", view3, hwvVar3);
                                }
                            }
                        }
                    }
                    arrayList5.add(view3);
                    return false;
                }
                return true;
            }
        };
        View view3 = view2;
        do {
            ViewParent parent = view3.getParent();
            if (!(parent instanceof ViewGroup)) {
                break;
            } else if (lfeVar.a(view3)) {
                return false;
            } else {
                view3 = (ViewGroup) parent;
            }
        } while (view3 != w);
        int size = arrayList4.size();
        int i3 = 0;
        while (i3 < size) {
            View view4 = (View) arrayList4.get(i3);
            ViewGroup viewGroup = (ViewGroup) view4.getParent();
            if (z2 && (viewGroup instanceof ManagedFrameLayout) && ManagedFrameLayout.b(view4)) {
                eii eiiVar = new eii(v, hcdVar, 12);
                ManagedFrameLayout managedFrameLayout = (ManagedFrameLayout) viewGroup;
                int childCount = managedFrameLayout.getChildCount();
                i2 = size;
                int i4 = 0;
                while (true) {
                    arrayList = arrayList4;
                    if (i4 >= childCount) {
                        break;
                    }
                    View childAt = managedFrameLayout.getChildAt(i4);
                    if (childAt != view4 && childAt != null && childAt.getVisibility() == 0 && ManagedFrameLayout.b(childAt)) {
                        eiiVar.a(childAt);
                    }
                    i4++;
                    arrayList4 = arrayList;
                }
            } else {
                i2 = size;
                arrayList = arrayList4;
            }
            boolean z3 = view4 == view2;
            if (ManagedFrameLayout.b(view4)) {
                if (z2) {
                    hxg hxgVar = (hxg) v.get(view4.getId());
                    if (hxgVar == null || z3 || hxgVar.b || hwvVar.ordinal() > hxgVar.a.ordinal()) {
                        v.put(view4.getId(), new hxg(hwvVar, !z3));
                    }
                } else if (z3) {
                    v.remove(view4.getId());
                }
            }
            if (view4.getVisibility() != 0) {
                hiuVar.a(view4);
            }
            i3++;
            size = i2;
            arrayList4 = arrayList;
        }
        int id = view2.getId();
        if (arrayList3.isEmpty()) {
            q(arrayList2, iceVar);
            u(o(), iceVar, hwy.a, false);
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList3);
            SparseArray a = this.g.b[iceVar.ordinal()].a();
            a.put(id, animatorSet);
            animatorSet.addListener(new hxb(this, a, id, arrayList2, iceVar));
            animatorSet.start();
        }
        return true;
    }

    @Override // defpackage.hww
    public final void j(hwu hwuVar) {
        hjg.q();
        if (!this.i.remove(hwuVar)) {
            ((ltd) b.a(hip.a).k("com/google/android/libraries/inputmethod/keyboardviewcontroller/KeyboardViewController", "unregisterListener", 189, "KeyboardViewController.java")).w("unregistering the listener for all keyboard view %s has been unregistered or has never been registered.", hwuVar);
        }
    }

    @Override // defpackage.hww
    public final void k(ibz ibzVar, ice iceVar, hwu hwuVar) {
        D(ibzVar, iceVar, hwuVar);
    }

    @Override // defpackage.hww
    public final void l(ice iceVar, hwu hwuVar) {
        D(null, iceVar, hwuVar);
    }

    public final SparseArray m(int i) {
        hxe hxeVar = this.g.b[i];
        if (hxeVar.d == null) {
            hxeVar.d = new SparseArray();
        }
        return hxeVar.d;
    }

    public final qq n(int i) {
        hxe hxeVar = this.g.b[i];
        qq qqVar = hxeVar.b;
        qq qqVar2 = hxeVar.c;
        if (qqVar != null && qqVar2 != null) {
            qq qqVar3 = new qq();
            qqVar3.c(qqVar);
            qqVar3.c(qqVar2);
            return qqVar3;
        } else if (qqVar != null) {
            return qqVar;
        } else {
            if (qqVar2 != null) {
                return qqVar2;
            }
            return null;
        }
    }

    public final ibz o() {
        return this.g.a;
    }

    public final void q(ArrayList arrayList, ice iceVar) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            t(view, 4, view.getId(), iceVar.ordinal());
            s(iceVar, view);
        }
    }

    public final void r(ibz ibzVar, ice iceVar, hiu hiuVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.h.get(hxd.a(ibzVar, iceVar));
        if (copyOnWriteArraySet != null) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                hwu hwuVar = (hwu) it.next();
                if (copyOnWriteArraySet.contains(hwuVar)) {
                    hiuVar.a(hwuVar);
                }
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.h.get(hxd.a(null, iceVar));
        if (copyOnWriteArraySet2 != null) {
            Iterator it2 = copyOnWriteArraySet2.iterator();
            while (it2.hasNext()) {
                hwu hwuVar2 = (hwu) it2.next();
                if (copyOnWriteArraySet2.contains(hwuVar2)) {
                    hiuVar.a(hwuVar2);
                }
            }
        }
        Iterator it3 = this.i.iterator();
        while (it3.hasNext()) {
            hwu hwuVar3 = (hwu) it3.next();
            if (this.i.contains(hwuVar3)) {
                hiuVar.a(hwuVar3);
            }
        }
    }

    public final void s(ice iceVar, View view) {
        if (view.getId() != -1) {
            hws hwsVar = (hws) this.e.get(hxh.a(o(), iceVar, view.getId()));
            if (hwsVar != null) {
                view.getId();
                hwsVar.hL();
            }
            hws hwsVar2 = (hws) this.e.get(hxh.a(null, iceVar, view.getId()));
            if (hwsVar2 != null) {
                view.getId();
                hwsVar2.hL();
            }
            view.getId();
            jbi.h(view.getId());
        }
    }

    public final boolean t(View view, int i, int i2, int i3) {
        this.g.a(i2, i3);
        view.setVisibility(i);
        SparseArray v = v(i3);
        if (v.get(i2) == null) {
            return false;
        }
        v.remove(i2);
        return true;
    }

    public final void u(ibz ibzVar, ice iceVar, leq leqVar, boolean z) {
        boolean booleanValue;
        int ordinal = iceVar.ordinal();
        qq n = n(ordinal);
        if (n == null || n.isEmpty()) {
            return;
        }
        SparseArray m = m(ordinal);
        Iterator it = n.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            hxf hxfVar = (hxf) m.get(num.intValue());
            if (hxfVar != null && (booleanValue = ((Boolean) leqVar.a(hxfVar.b)).booleanValue()) != hxfVar.a) {
                if (!z) {
                    hxfVar.a = booleanValue;
                }
                C(hxh.a(ibzVar, iceVar, num.intValue()));
                C(hxh.a(null, iceVar, num.intValue()));
            }
        }
    }
}
