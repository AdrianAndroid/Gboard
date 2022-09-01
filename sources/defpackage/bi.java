package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import com.google.android.inputmethod.latin.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: bi  reason: default package */
/* loaded from: classes.dex */
public final class bi {
    private boolean C;
    private ArrayList D;
    private ArrayList E;
    private ArrayList F;
    private mop I;
    public ArrayList b;
    public ArrayList f;
    public au i;
    public ar j;
    public an k;
    an l;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public bk r;
    public mop s;
    public mop t;
    public bek u;
    private boolean x;
    private ArrayList y;
    private final ArrayList w = new ArrayList();
    public final bo a = new bo();
    public final aw c = new aw(this);
    public final oy d = new oy(this);
    public final AtomicInteger e = new AtomicInteger();
    private final Map z = DesugarCollections.synchronizedMap(new HashMap());
    private final Map A = DesugarCollections.synchronizedMap(new HashMap());
    public final azp v = new azp(this);
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    int h = -1;
    private final at B = new ay(this);
    private final cd H = new cd();
    ArrayDeque m = new ArrayDeque();
    private final Runnable G = new az(this, 0);

    public bi() {
        DesugarCollections.synchronizedMap(new HashMap());
    }

    public static boolean S(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static final boolean W(an anVar) {
        if (anVar.K) {
            boolean z = anVar.L;
            return true;
        }
        boolean z2 = false;
        for (an anVar2 : anVar.B.a.f()) {
            if (anVar2 != null) {
                z2 = W(anVar2);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    static final boolean X(an anVar) {
        return anVar == null || anVar.z == null || X(anVar.C);
    }

    static final void Z(an anVar) {
        if (S(2)) {
            new StringBuilder("show: ").append(anVar);
        }
        if (anVar.G) {
            anVar.G = false;
            anVar.S = !anVar.S;
        }
    }

    private final ViewGroup ad(an anVar) {
        ViewGroup viewGroup = anVar.N;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (anVar.E > 0 && this.j.b()) {
            View a = this.j.a(anVar.E);
            if (a instanceof ViewGroup) {
                return (ViewGroup) a;
            }
        }
        return null;
    }

    private final Set ae() {
        HashSet hashSet = new HashSet();
        for (bn bnVar : this.a.e()) {
            ViewGroup viewGroup = bnVar.b.N;
            if (viewGroup != null) {
                ac();
                hashSet.add(ca.g(viewGroup));
            }
        }
        return hashSet;
    }

    private final void af() {
        if (!U()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    private final void ag() {
        this.x = false;
        this.E.clear();
        this.D.clear();
    }

    private final void ah() {
        if (this.C) {
            this.C = false;
            an();
        }
    }

    private final void ai() {
        for (ca caVar : ae()) {
            caVar.c();
        }
    }

    private final void aj(boolean z) {
        if (!this.x) {
            if (this.i == null) {
                if (this.q) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() != this.i.d.getLooper()) {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            } else {
                if (!z) {
                    af();
                }
                if (this.D != null) {
                    return;
                }
                this.D = new ArrayList();
                this.E = new ArrayList();
                return;
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /* JADX WARN: Code restructure failed: missing block: B:313:0x05a8, code lost:
        if (r15 == r13) goto L308;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ak(java.util.ArrayList r30, java.util.ArrayList r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 2168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.ak(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private final void al(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((s) arrayList.get(i)).s) {
                if (i2 != i) {
                    ak(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((s) arrayList.get(i2)).s) {
                        i2++;
                    }
                }
                ak(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 == size) {
            return;
        }
        ak(arrayList, arrayList2, i2, size);
    }

    private final void am(an anVar) {
        ViewGroup ad = ad(anVar);
        if (ad == null || anVar.fN() + anVar.fO() + anVar.fP() + anVar.fQ() <= 0) {
            return;
        }
        if (ad.getTag(R.id.f130520_resource_name_obfuscated_res_0x7f0b21ef) == null) {
            ad.setTag(R.id.f130520_resource_name_obfuscated_res_0x7f0b21ef, anVar);
        }
        ((an) ad.getTag(R.id.f130520_resource_name_obfuscated_res_0x7f0b21ef)).ac(anVar.ah());
    }

    private final void an() {
        for (bn bnVar : this.a.e()) {
            an anVar = bnVar.b;
            if (anVar.P) {
                if (this.x) {
                    this.C = true;
                } else {
                    anVar.P = false;
                    bnVar.d();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A() {
        this.o = false;
        this.p = false;
        this.r.g = false;
        B(5);
    }

    public final void B(int i) {
        try {
            this.x = true;
            for (bn bnVar : this.a.b.values()) {
                if (bnVar != null) {
                    bnVar.c = i;
                }
            }
            H(i, false);
            for (ca caVar : ae()) {
                caVar.c();
            }
            this.x = false;
            aa(true);
        } catch (Throwable th) {
            this.x = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C() {
        this.p = true;
        this.r.g = true;
        B(4);
    }

    public final void D(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String concat = String.valueOf(str).concat("    ");
        bo boVar = this.a;
        String concat2 = String.valueOf(str).concat("    ");
        if (!boVar.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (bn bnVar : boVar.b.values()) {
                printWriter.print(str);
                if (bnVar != null) {
                    an anVar = bnVar.b;
                    printWriter.println(anVar);
                    anVar.M(concat2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = boVar.a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((an) boVar.a.get(i)).toString());
            }
        }
        ArrayList arrayList = this.y;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((an) this.y.get(i2)).toString());
            }
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                s sVar = (s) this.b.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(sVar.toString());
                sVar.g(concat, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.e.get());
        synchronized (this.w) {
            int size4 = this.w.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println((bg) this.w.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.i);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.j);
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.k);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.h);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.o);
        printWriter.print(" mStopped=");
        printWriter.print(this.p);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.q);
        if (this.n) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(bg bgVar, boolean z) {
        if (!z) {
            if (this.i == null) {
                if (!this.q) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            af();
        }
        synchronized (this.w) {
            if (this.i == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.w.add(bgVar);
            synchronized (this.w) {
                if (this.w.size() == 1) {
                    this.i.d.removeCallbacks(this.G);
                    this.i.d.post(this.G);
                    N();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(bg bgVar, boolean z) {
        if (!z || (this.i != null && !this.q)) {
            aj(z);
            bgVar.i(this.D, this.E);
            this.x = true;
            try {
                al(this.D, this.E);
                ag();
                N();
                ah();
                this.a.i();
            } catch (Throwable th) {
                ag();
                throw th;
            }
        }
    }

    final void G(an anVar) {
        if (S(2)) {
            new StringBuilder("hide: ").append(anVar);
        }
        if (!anVar.G) {
            anVar.G = true;
            anVar.S = true ^ anVar.S;
            am(anVar);
        }
    }

    final void H(int i, boolean z) {
        au auVar;
        if (this.i != null || i == -1) {
            if (!z && i == this.h) {
                return;
            }
            this.h = i;
            bo boVar = this.a;
            ArrayList arrayList = boVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                bn bnVar = (bn) boVar.b.get(((an) arrayList.get(i2)).l);
                if (bnVar != null) {
                    bnVar.d();
                }
            }
            for (bn bnVar2 : boVar.b.values()) {
                if (bnVar2 != null) {
                    bnVar2.d();
                    an anVar = bnVar2.b;
                    if (anVar.s && !anVar.ak()) {
                        boolean z2 = anVar.t;
                        boVar.k(bnVar2);
                    }
                }
            }
            an();
            if (!this.n || (auVar = this.i) == null || this.h != 7) {
                return;
            }
            auVar.c();
            this.n = false;
            return;
        }
        throw new IllegalStateException("No activity");
    }

    final void I(an anVar) {
        if (S(2)) {
            new StringBuilder("remove: ").append(anVar);
            int i = anVar.y;
        }
        boolean z = !anVar.ak();
        if (!anVar.H || z) {
            this.a.l(anVar);
            if (W(anVar)) {
                this.n = true;
            }
            anVar.s = true;
            am(anVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(Parcelable parcelable) {
        bj bjVar;
        ArrayList arrayList;
        bn bnVar;
        if (parcelable == null || (arrayList = (bjVar = (bj) parcelable).a) == null) {
            return;
        }
        bo boVar = this.a;
        boVar.c.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bm bmVar = (bm) arrayList.get(i);
            boVar.c.put(bmVar.b, bmVar);
        }
        this.a.b.clear();
        ArrayList arrayList2 = bjVar.b;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bm c = this.a.c((String) arrayList2.get(i2), null);
            if (c != null) {
                an anVar = (an) this.r.b.get(c.b);
                if (anVar != null) {
                    if (S(2)) {
                        new StringBuilder("restoreSaveState: re-attaching retained ").append(anVar);
                    }
                    bnVar = new bn(this.v, this.a, anVar, c, null, null, null);
                } else {
                    bnVar = new bn(this.v, this.a, this.i.c.getClassLoader(), f(), c, null, null, null);
                }
                an anVar2 = bnVar.b;
                anVar2.z = this;
                if (S(2)) {
                    StringBuilder sb = new StringBuilder("restoreSaveState: active (");
                    sb.append(anVar2.l);
                    sb.append("): ");
                    sb.append(anVar2);
                }
                bnVar.e(this.i.c.getClassLoader());
                this.a.j(bnVar);
                bnVar.c = this.h;
            }
        }
        for (an anVar3 : new ArrayList(this.r.b.values())) {
            if (!this.a.m(anVar3.l)) {
                if (S(2)) {
                    StringBuilder sb2 = new StringBuilder("Discarding retained Fragment ");
                    sb2.append(anVar3);
                    sb2.append(" that was not found in the set of active Fragments ");
                    sb2.append(bjVar.b);
                }
                this.r.d(anVar3);
                anVar3.z = this;
                bn bnVar2 = new bn(this.v, this.a, anVar3, null, null, null);
                bnVar2.c = 1;
                bnVar2.d();
                anVar3.s = true;
                bnVar2.d();
            }
        }
        bo boVar2 = this.a;
        ArrayList<String> arrayList3 = bjVar.c;
        boVar2.a.clear();
        if (arrayList3 != null) {
            for (String str : arrayList3) {
                an a = boVar2.a(str);
                if (a == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (S(2)) {
                    StringBuilder sb3 = new StringBuilder("restoreSaveState: added (");
                    sb3.append(str);
                    sb3.append("): ");
                    sb3.append(a);
                }
                boVar2.h(a);
            }
        }
        t[] tVarArr = bjVar.d;
        if (tVarArr != null) {
            this.b = new ArrayList(tVarArr.length);
            int i3 = 0;
            while (true) {
                t[] tVarArr2 = bjVar.d;
                if (i3 >= tVarArr2.length) {
                    break;
                }
                t tVar = tVarArr2[i3];
                s sVar = new s(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = tVar.a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    bp bpVar = new bp();
                    int i6 = i4 + 1;
                    bpVar.a = iArr[i4];
                    if (S(2)) {
                        new StringBuilder("Instantiate ").append(sVar);
                        int i7 = tVar.a[i6];
                    }
                    bpVar.h = afp.values()[tVar.c[i5]];
                    bpVar.i = afp.values()[tVar.d[i5]];
                    int[] iArr2 = tVar.a;
                    int i8 = i6 + 1;
                    bpVar.c = iArr2[i6] != 0;
                    int i9 = i8 + 1;
                    int i10 = iArr2[i8];
                    bpVar.d = i10;
                    int i11 = i9 + 1;
                    int i12 = iArr2[i9];
                    bpVar.e = i12;
                    int i13 = i11 + 1;
                    int i14 = iArr2[i11];
                    bpVar.f = i14;
                    int i15 = iArr2[i13];
                    bpVar.g = i15;
                    sVar.e = i10;
                    sVar.f = i12;
                    sVar.g = i14;
                    sVar.h = i15;
                    sVar.n(bpVar);
                    i5++;
                    i4 = i13 + 1;
                }
                sVar.i = tVar.e;
                sVar.l = tVar.f;
                sVar.j = true;
                sVar.m = tVar.h;
                sVar.n = tVar.i;
                sVar.o = tVar.j;
                sVar.p = tVar.k;
                sVar.q = tVar.l;
                sVar.r = tVar.m;
                sVar.s = tVar.n;
                sVar.c = tVar.g;
                for (int i16 = 0; i16 < tVar.b.size(); i16++) {
                    String str2 = (String) tVar.b.get(i16);
                    if (str2 != null) {
                        ((bp) sVar.d.get(i16)).b = c(str2);
                    }
                }
                sVar.c(1);
                if (S(2)) {
                    StringBuilder sb4 = new StringBuilder("restoreAllState: back stack #");
                    sb4.append(i3);
                    sb4.append(" (index ");
                    sb4.append(sVar.c);
                    sb4.append("): ");
                    sb4.append(sVar);
                    PrintWriter printWriter = new PrintWriter(new bv());
                    sVar.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.b.add(sVar);
                i3++;
            }
        } else {
            this.b = null;
        }
        this.e.set(bjVar.e);
        String str3 = bjVar.f;
        if (str3 != null) {
            an c2 = c(str3);
            this.l = c2;
            w(c2);
        }
        ArrayList arrayList4 = bjVar.g;
        if (arrayList4 != null) {
            for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                this.z.put((String) arrayList4.get(i17), (v) bjVar.h.get(i17));
            }
        }
        ArrayList arrayList5 = bjVar.i;
        if (arrayList5 != null) {
            for (int i18 = 0; i18 < arrayList5.size(); i18++) {
                Bundle bundle = (Bundle) bjVar.j.get(i18);
                bundle.setClassLoader(this.i.c.getClassLoader());
                this.A.put((String) arrayList5.get(i18), bundle);
            }
        }
        this.m = new ArrayDeque(bjVar.k);
    }

    final void K(an anVar, boolean z) {
        ViewGroup ad = ad(anVar);
        if (ad == null || !(ad instanceof as)) {
            return;
        }
        ((as) ad).a = !z;
    }

    final void L(an anVar, afp afpVar) {
        if (anVar.equals(c(anVar.l)) && (anVar.A == null || anVar.z == this)) {
            anVar.W = afpVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + anVar + " is not an active fragment of FragmentManager " + this);
    }

    final void M(an anVar) {
        if (anVar == null || (anVar.equals(c(anVar.l)) && (anVar.A == null || anVar.z == this))) {
            an anVar2 = this.l;
            this.l = anVar;
            w(anVar2);
            w(this.l);
            return;
        }
        throw new IllegalArgumentException("Fragment " + anVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void N() {
        synchronized (this.w) {
            boolean z = true;
            if (!this.w.isEmpty()) {
                this.d.a = true;
                return;
            }
            oy oyVar = this.d;
            if (a() <= 0 || !T(this.k)) {
                z = false;
            }
            oyVar.a = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean O(MenuItem menuItem) {
        if (this.h <= 0) {
            return false;
        }
        for (an anVar : this.a.g()) {
            if (anVar != null && !anVar.G && anVar.B.O(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean P(Menu menu, MenuInflater menuInflater) {
        boolean z;
        if (this.h <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (an anVar : this.a.g()) {
            if (anVar != null && X(anVar) && !anVar.G) {
                if (anVar.K) {
                    anVar.Q(menu, menuInflater);
                    z = true;
                } else {
                    z = false;
                }
                if (z | anVar.B.P(menu, menuInflater)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(anVar);
                    z2 = true;
                }
            }
        }
        if (this.y != null) {
            for (int i = 0; i < this.y.size(); i++) {
                an anVar2 = (an) this.y.get(i);
                if (arrayList == null || !arrayList.contains(anVar2)) {
                    anVar2.S();
                }
            }
        }
        this.y = arrayList;
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Q(MenuItem menuItem) {
        if (this.h <= 0) {
            return false;
        }
        for (an anVar : this.a.g()) {
            if (anVar != null && !anVar.G && ((anVar.K && anVar.al(menuItem)) || anVar.B.Q(menuItem))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean R(Menu menu) {
        boolean z = false;
        if (this.h <= 0) {
            return false;
        }
        for (an anVar : this.a.g()) {
            if (anVar != null && X(anVar) && !anVar.G) {
                if (anVar.B.R(menu) | anVar.K) {
                    z = true;
                }
            }
        }
        return z;
    }

    final boolean T(an anVar) {
        if (anVar == null) {
            return true;
        }
        bi biVar = anVar.z;
        return anVar.equals(biVar.l) && T(biVar.k);
    }

    public final boolean U() {
        return this.o || this.p;
    }

    public final boolean V() {
        aa(false);
        aj(true);
        an anVar = this.l;
        if (anVar == null || !anVar.D().V()) {
            boolean Y = Y(this.D, this.E, -1, 0);
            if (Y) {
                this.x = true;
                try {
                    al(this.D, this.E);
                } finally {
                    ag();
                }
            }
            N();
            ah();
            this.a.i();
            return Y;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y(java.util.ArrayList r5, java.util.ArrayList r6, int r7, int r8) {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.b
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L59
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L59
        Ld:
            if (r7 >= 0) goto L1b
            if (r8 == 0) goto L13
            r7 = 0
            goto L5a
        L13:
            java.util.ArrayList r7 = r4.b
            int r7 = r7.size()
            int r7 = r7 + r2
            goto L5a
        L1b:
            java.util.ArrayList r0 = r4.b
            int r0 = r0.size()
            int r0 = r0 + r2
        L22:
            if (r0 < 0) goto L34
            java.util.ArrayList r3 = r4.b
            java.lang.Object r3 = r3.get(r0)
            s r3 = (defpackage.s) r3
            int r3 = r3.c
            if (r7 != r3) goto L31
            goto L34
        L31:
            int r0 = r0 + (-1)
            goto L22
        L34:
            if (r0 >= 0) goto L38
        L36:
            r7 = r0
            goto L5a
        L38:
            if (r8 == 0) goto L4c
        L3a:
            if (r0 <= 0) goto L36
            int r8 = r0 + (-1)
            java.util.ArrayList r3 = r4.b
            java.lang.Object r3 = r3.get(r8)
            s r3 = (defpackage.s) r3
            int r3 = r3.c
            if (r7 != r3) goto L36
            r0 = r8
            goto L3a
        L4c:
            java.util.ArrayList r7 = r4.b
            int r7 = r7.size()
            int r7 = r7 + r2
            if (r0 != r7) goto L56
            goto L59
        L56:
            int r7 = r0 + 1
            goto L5a
        L59:
            r7 = -1
        L5a:
            if (r7 >= 0) goto L5d
            return r1
        L5d:
            java.util.ArrayList r8 = r4.b
            int r8 = r8.size()
            int r8 = r8 + r2
        L64:
            r0 = 1
            if (r8 < r7) goto L7c
            java.util.ArrayList r1 = r4.b
            java.lang.Object r1 = r1.remove(r8)
            s r1 = (defpackage.s) r1
            r5.add(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.add(r0)
            int r8 = r8 + (-1)
            goto L64
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi.Y(java.util.ArrayList, java.util.ArrayList, int, int):boolean");
    }

    public final int a() {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final void aa(boolean z) {
        aj(z);
        while (true) {
            ArrayList arrayList = this.D;
            ArrayList arrayList2 = this.E;
            synchronized (this.w) {
                if (this.w.isEmpty()) {
                    break;
                }
                int size = this.w.size();
                boolean z2 = false;
                for (int i = 0; i < size; i++) {
                    z2 |= ((bg) this.w.get(i)).i(arrayList, arrayList2);
                }
                this.w.clear();
                this.i.d.removeCallbacks(this.G);
                if (!z2) {
                    break;
                }
                this.x = true;
                try {
                    al(this.D, this.E);
                } finally {
                    ag();
                }
            }
        }
        N();
        ah();
        this.a.i();
    }

    public final void ab(cd cdVar) {
        ((CopyOnWriteArrayList) this.v.a).add(new nsx(cdVar, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cd ac() {
        an anVar = this.k;
        return anVar != null ? anVar.z.ac() : this.H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Parcelable b() {
        int i;
        t[] tVarArr;
        ArrayList arrayList;
        int size;
        for (ca caVar : ae()) {
        }
        ai();
        aa(true);
        this.o = true;
        this.r.g = true;
        bo boVar = this.a;
        ArrayList arrayList2 = new ArrayList(boVar.b.size());
        Iterator it = boVar.b.values().iterator();
        while (true) {
            tVarArr = null;
            Bundle bundle = null;
            tVarArr = null;
            if (!it.hasNext()) {
                break;
            }
            bn bnVar = (bn) it.next();
            if (bnVar != null) {
                an anVar = bnVar.b;
                bm bmVar = new bm(anVar);
                an anVar2 = bnVar.b;
                if (anVar2.g < 0 || bmVar.m != null) {
                    bmVar.m = anVar2.h;
                } else {
                    Bundle bundle2 = new Bundle();
                    an anVar3 = bnVar.b;
                    anVar3.h(bundle2);
                    anVar3.ab.f(bundle2);
                    Parcelable b = anVar3.B.b();
                    if (b != null) {
                        bundle2.putParcelable("android:support:fragments", b);
                    }
                    bnVar.d.B(bnVar.b, bundle2, false);
                    if (true != bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                    if (bnVar.b.O != null) {
                        bnVar.f();
                    }
                    if (bnVar.b.i != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", bnVar.b.i);
                    }
                    if (bnVar.b.j != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBundle("android:view_registry_state", bnVar.b.j);
                    }
                    if (!bnVar.b.Q) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", bnVar.b.Q);
                    }
                    bmVar.m = bundle;
                    if (bnVar.b.o != null) {
                        if (bmVar.m == null) {
                            bmVar.m = new Bundle();
                        }
                        bmVar.m.putString("android:target_state", bnVar.b.o);
                        int i2 = bnVar.b.p;
                        if (i2 != 0) {
                            bmVar.m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                bnVar.a.c(bnVar.b.l, bmVar);
                arrayList2.add(anVar.l);
                if (S(2)) {
                    StringBuilder sb = new StringBuilder("Saved state of ");
                    sb.append(anVar);
                    sb.append(": ");
                    sb.append(anVar.h);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(this.a.c.values());
        if (arrayList3.isEmpty()) {
            S(2);
            return null;
        }
        bo boVar2 = this.a;
        synchronized (boVar2.a) {
            if (boVar2.a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(boVar2.a.size());
                Iterator it2 = boVar2.a.iterator();
                while (it2.hasNext()) {
                    an anVar4 = (an) it2.next();
                    arrayList.add(anVar4.l);
                    if (S(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("saveAllState: adding fragment (");
                        sb2.append(anVar4.l);
                        sb2.append("): ");
                        sb2.append(anVar4);
                    }
                }
            }
        }
        ArrayList arrayList4 = this.b;
        if (arrayList4 != null && (size = arrayList4.size()) > 0) {
            tVarArr = new t[size];
            for (i = 0; i < size; i++) {
                tVarArr[i] = new t((s) this.b.get(i));
                if (S(2)) {
                    StringBuilder sb3 = new StringBuilder("saveAllState: adding back stack #");
                    sb3.append(i);
                    sb3.append(": ");
                    sb3.append(this.b.get(i));
                }
            }
        }
        bj bjVar = new bj();
        bjVar.a = arrayList3;
        bjVar.b = arrayList2;
        bjVar.c = arrayList;
        bjVar.d = tVarArr;
        bjVar.e = this.e.get();
        an anVar5 = this.l;
        if (anVar5 != null) {
            bjVar.f = anVar5.l;
        }
        bjVar.g.addAll(this.z.keySet());
        bjVar.h.addAll(this.z.values());
        bjVar.i.addAll(this.A.keySet());
        bjVar.j.addAll(this.A.values());
        bjVar.k = new ArrayList(this.m);
        return bjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final an c(String str) {
        return this.a.a(str);
    }

    public final an d(int i) {
        bo boVar = this.a;
        int size = boVar.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                an anVar = (an) boVar.a.get(size);
                if (anVar != null && anVar.D == i) {
                    return anVar;
                }
            } else {
                for (bn bnVar : boVar.b.values()) {
                    if (bnVar != null) {
                        an anVar2 = bnVar.b;
                        if (anVar2.D == i) {
                            return anVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final an e(String str) {
        bo boVar = this.a;
        int size = boVar.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                an anVar = (an) boVar.a.get(size);
                if (anVar != null && str.equals(anVar.F)) {
                    return anVar;
                }
            } else {
                for (bn bnVar : boVar.b.values()) {
                    if (bnVar != null) {
                        an anVar2 = bnVar.b;
                        if (str.equals(anVar2.F)) {
                            return anVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final at f() {
        an anVar = this.k;
        return anVar != null ? anVar.z.f() : this.B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bn g(an anVar) {
        String str = anVar.V;
        if (str != null) {
            aez.a(anVar, str);
        }
        if (S(2)) {
            new StringBuilder("add: ").append(anVar);
        }
        bn h = h(anVar);
        anVar.z = this;
        this.a.j(h);
        if (!anVar.H) {
            this.a.h(anVar);
            anVar.s = false;
            if (anVar.O == null) {
                anVar.S = false;
            }
            if (W(anVar)) {
                this.n = true;
            }
        }
        return h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bn h(an anVar) {
        bn d = this.a.d(anVar.l);
        if (d != null) {
            return d;
        }
        bn bnVar = new bn(this.v, this.a, anVar, null, null, null);
        bnVar.e(this.i.c.getClassLoader());
        bnVar.c = this.h;
        return bnVar;
    }

    public final bq i() {
        return new s(this);
    }

    public final List j() {
        return this.a.g();
    }

    public final void k(bl blVar) {
        this.g.add(blVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [au, ajc] */
    public final void l(au auVar, ar arVar, an anVar) {
        if (this.i != null) {
            throw new IllegalStateException("Already attached");
        }
        this.i = auVar;
        this.j = arVar;
        this.k = anVar;
        if (anVar != null) {
            k(new ba());
        } else if (auVar instanceof bl) {
            k(auVar);
        }
        if (this.k != null) {
            N();
        }
        if (auVar instanceof pa) {
            bek bekVar = ((ao) auVar).a.j;
            this.u = bekVar;
            an anVar2 = anVar != null ? anVar : auVar;
            oy oyVar = this.d;
            afq I = anVar2.I();
            if (I.a != afp.DESTROYED) {
                oyVar.a(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(bekVar, I, oyVar, null, null, null));
            }
        }
        if (anVar != null) {
            bk bkVar = anVar.z.r;
            bk bkVar2 = (bk) bkVar.c.get(anVar.l);
            if (bkVar2 == null) {
                bkVar2 = new bk(bkVar.e);
                bkVar.c.put(anVar.l, bkVar2);
            }
            this.r = bkVar2;
        } else if (auVar instanceof agq) {
            aqr at = auVar.at();
            agn agnVar = bk.a;
            oll.e(at, "store");
            agr agrVar = agr.a;
            oll.e(at, "store");
            oll.e(agrVar, "defaultCreationExtras");
            this.r = (bk) vh.b(bk.class, at, agnVar, agrVar);
        } else {
            this.r = new bk(false);
        }
        bk bkVar3 = this.r;
        bkVar3.g = U();
        this.a.d = bkVar3;
        ?? r9 = this.i;
        if ((r9 instanceof ajc) && anVar == null) {
            ajb J = r9.J();
            J.b("android:support:fragments", new ax(this, 0));
            Bundle a = J.a("android:support:fragments");
            if (a != null) {
                J(a.getParcelable("android:support:fragments"));
            }
        }
        au auVar2 = this.i;
        if (!(auVar2 instanceof AbstractC0079pg)) {
            return;
        }
        pf pfVar = ((ao) auVar2).a.g;
        String concat = "FragmentManager:".concat(anVar != null ? String.valueOf(anVar.l).concat(":") : "");
        this.s = pfVar.d(concat.concat("StartActivityForResult"), new pk(), new bb(this, 1));
        this.I = pfVar.d(concat.concat("StartIntentSenderForResult"), new be(), new bb(this, 0));
        this.t = pfVar.d(concat.concat("RequestPermissions"), new pj(), new bc(this));
    }

    final void m(an anVar) {
        if (S(2)) {
            new StringBuilder("attach: ").append(anVar);
        }
        if (anVar.H) {
            anVar.H = false;
            if (anVar.r) {
                return;
            }
            this.a.h(anVar);
            if (S(2)) {
                new StringBuilder("add from attach: ").append(anVar);
            }
            if (!W(anVar)) {
                return;
            }
            this.n = true;
        }
    }

    final void n(an anVar) {
        if (S(2)) {
            new StringBuilder("detach: ").append(anVar);
        }
        if (!anVar.H) {
            anVar.H = true;
            if (!anVar.r) {
                return;
            }
            if (S(2)) {
                new StringBuilder("remove from detach: ").append(anVar);
            }
            this.a.l(anVar);
            if (W(anVar)) {
                this.n = true;
            }
            am(anVar);
        }
    }

    public void noteStateNotSaved() {
        if (this.i == null) {
            return;
        }
        this.o = false;
        this.p = false;
        this.r.g = false;
        for (an anVar : this.a.g()) {
            if (anVar != null) {
                anVar.B.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        this.o = false;
        this.p = false;
        this.r.g = false;
        B(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(Configuration configuration) {
        for (an anVar : this.a.g()) {
            if (anVar != null) {
                anVar.onConfigurationChanged(configuration);
                anVar.B.p(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        this.o = false;
        this.p = false;
        this.r.g = false;
        B(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        this.q = true;
        aa(true);
        ai();
        au auVar = this.i;
        if (auVar instanceof agq ? this.a.d.f : true ^ ((Activity) auVar.c).isChangingConfigurations()) {
            for (v vVar : this.z.values()) {
                for (String str : vVar.a) {
                    bk bkVar = this.a.d;
                    S(3);
                    bkVar.b(str);
                }
            }
        }
        B(-1);
        this.i = null;
        this.j = null;
        this.k = null;
        if (this.u != null) {
            Iterator it = this.d.b.iterator();
            while (it.hasNext()) {
                ((ou) it.next()).b();
            }
            this.u = null;
        }
        mop mopVar = this.s;
        if (mopVar != null) {
            mopVar.d();
            this.I.d();
            this.t.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s() {
        for (an anVar : this.a.g()) {
            if (anVar != null) {
                anVar.onLowMemory();
                anVar.B.s();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(boolean z) {
        for (an anVar : this.a.g()) {
            if (anVar != null) {
                anVar.B.t(z);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        an anVar = this.k;
        if (anVar != null) {
            sb.append(anVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.k)));
            sb.append("}");
        } else {
            au auVar = this.i;
            if (auVar != null) {
                sb.append(auVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.i)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u() {
        for (an anVar : this.a.f()) {
            if (anVar != null) {
                anVar.B.u();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(Menu menu) {
        if (this.h <= 0) {
            return;
        }
        for (an anVar : this.a.g()) {
            if (anVar != null && !anVar.G) {
                anVar.B.v(menu);
            }
        }
    }

    public final void w(an anVar) {
        if (anVar == null || !anVar.equals(c(anVar.l))) {
            return;
        }
        boolean T = anVar.z.T(anVar);
        Boolean bool = anVar.q;
        if (bool != null && bool.booleanValue() == T) {
            return;
        }
        anVar.q = Boolean.valueOf(T);
        bi biVar = anVar.B;
        biVar.N();
        biVar.w(biVar.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x() {
        B(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y(boolean z) {
        for (an anVar : this.a.g()) {
            if (anVar != null) {
                anVar.B.y(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z() {
        this.o = false;
        this.p = false;
        this.r.g = false;
        B(7);
    }
}
