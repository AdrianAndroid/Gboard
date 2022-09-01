package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: an  reason: default package */
/* loaded from: classes.dex */
public class an implements ComponentCallbacks, View.OnCreateContextMenuListener, afv, agq, ajc {
    static final Object f = new Object();
    au A;
    public an C;
    int D;
    int E;
    String F;
    boolean G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    public boolean M;
    public ViewGroup N;
    public View O;
    boolean P;
    public ak R;
    boolean S;
    public LayoutInflater T;
    boolean U;
    public String V;
    bt X;
    afq aa;
    bdz ab;
    Bundle h;
    SparseArray i;
    Bundle j;
    Boolean k;
    public Bundle m;
    an n;
    int p;
    boolean r;
    public boolean s;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    int y;
    public bi z;
    public int g = -1;
    String l = UUID.randomUUID().toString();
    String o = null;
    public Boolean q = null;
    bi B = new bi();
    final boolean L = true;
    boolean Q = true;
    afp W = afp.RESUMED;
    final agd Y = new agd();
    public final ArrayList Z = new ArrayList();

    public an() {
        new AtomicInteger();
        n();
    }

    @Deprecated
    public static an A(Context context, String str, Bundle bundle) {
        try {
            an anVar = (an) at.a(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(anVar.getClass().getClassLoader());
                anVar.Z(bundle);
            }
            return anVar;
        } catch (IllegalAccessException e) {
            throw new al("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new al("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new al("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new al("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    private final int fb() {
        if (this.W == afp.INITIALIZED || this.C == null) {
            return this.W.ordinal();
        }
        return Math.min(this.W.ordinal(), this.C.fb());
    }

    private final an m(boolean z) {
        String str;
        if (z) {
            aez.d(this);
        }
        an anVar = this.n;
        if (anVar != null) {
            return anVar;
        }
        bi biVar = this.z;
        if (biVar != null && (str = this.o) != null) {
            return biVar.c(str);
        }
        return null;
    }

    private final void n() {
        this.aa = new afq(this);
        this.ab = bdz.g(this);
    }

    public final ap B() {
        au auVar = this.A;
        if (auVar == null) {
            return null;
        }
        return (ap) auVar.b;
    }

    public final ap C() {
        ap B = B();
        if (B != null) {
            return B;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final bi D() {
        if (this.A != null) {
            return this.B;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final bi E() {
        bi biVar = this.z;
        if (biVar != null) {
            return biVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final LayoutInflater F(Bundle bundle) {
        LayoutInflater fW = fW(bundle);
        this.T = fW;
        return fW;
    }

    public View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public final View H() {
        View view = this.O;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // defpackage.afv
    public final afq I() {
        return this.aa;
    }

    @Override // defpackage.ajc
    public final ajb J() {
        return (ajb) this.ab.b;
    }

    public final String K(int i) {
        return fU().getString(i);
    }

    public final String L(int i, Object... objArr) {
        return fU().getString(i, objArr);
    }

    public void M(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.D));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.E));
        printWriter.print(" mTag=");
        printWriter.println(this.F);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.g);
        printWriter.print(" mWho=");
        printWriter.print(this.l);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.r);
        printWriter.print(" mRemoving=");
        printWriter.print(this.s);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.u);
        printWriter.print(" mInLayout=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.G);
        printWriter.print(" mDetached=");
        printWriter.print(this.H);
        printWriter.print(" mMenuVisible=");
        printWriter.print(true);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.K);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.I);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.Q);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.z);
        }
        if (this.A != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.A);
        }
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.C);
        }
        if (this.m != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.m);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.h);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.i);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.j);
        }
        an m = m(false);
        if (m != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(m);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.p);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(ah());
        if (fN() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(fN());
        }
        if (fO() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(fO());
        }
        if (fP() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(fP());
        }
        if (fQ() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(fQ());
        }
        if (this.N != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.N);
        }
        if (this.O != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.O);
        }
        if (fS() != null) {
            agu.a(this).c(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.B + ":");
        this.B.D(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N() {
        n();
        this.V = this.l;
        this.l = UUID.randomUUID().toString();
        this.r = false;
        this.s = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.y = 0;
        this.z = null;
        this.B = new bi();
        this.A = null;
        this.D = 0;
        this.E = 0;
        this.F = null;
        this.G = false;
        this.H = false;
    }

    @Deprecated
    public void O(Bundle bundle) {
        this.M = true;
    }

    @Deprecated
    public void P(int i, int i2, Intent intent) {
        if (bi.S(2)) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i);
            sb.append(" resultCode: ");
            sb.append(i2);
            sb.append(" data: ");
            sb.append(intent);
        }
    }

    public void Q(Menu menu, MenuInflater menuInflater) {
    }

    public void R() {
        this.M = true;
    }

    public void S() {
    }

    public void T() {
        this.M = true;
    }

    public void U() {
        this.M = true;
    }

    public void V(View view, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void W() {
        V(this.O, this.h);
        this.B.B(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void X(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.B.J(parcelable);
        this.B.q();
    }

    public final void Y(int i, int i2, int i3, int i4) {
        if (this.R == null && i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else if (i4 == 0) {
                    return;
                } else {
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        y().b = i;
        y().c = i2;
        y().d = i3;
        y().e = i4;
    }

    public final void Z(Bundle bundle) {
        bi biVar = this.z;
        if (biVar == null || !biVar.U()) {
            this.m = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aa(View view) {
        y().m = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ab(int i) {
        if (this.R == null && i == 0) {
            return;
        }
        y();
        this.R.f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ac(boolean z) {
        if (this.R == null) {
            return;
        }
        y().a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ad(ArrayList arrayList, ArrayList arrayList2) {
        y();
        ak akVar = this.R;
        akVar.g = arrayList;
        akVar.h = arrayList2;
    }

    @Deprecated
    public final void ae(an anVar, int i) {
        aez.e(this, anVar, i);
        bi biVar = this.z;
        bi biVar2 = anVar.z;
        if (biVar == null || biVar2 == null || biVar == biVar2) {
            for (an anVar2 = anVar; anVar2 != null; anVar2 = anVar2.m(false)) {
                if (anVar2.equals(this)) {
                    throw new IllegalArgumentException("Setting " + anVar + " as the target of " + this + " would create a target cycle");
                }
            }
            if (this.z == null || anVar.z == null) {
                this.o = null;
                this.n = anVar;
            } else {
                this.o = anVar.l;
                this.n = null;
            }
            this.p = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + anVar + " must share the same FragmentManager to be set as a target fragment");
    }

    public final void af(Intent intent) {
        au auVar = this.A;
        if (auVar == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        auVar.e(intent, -1, null);
    }

    @Deprecated
    public final void ag(Intent intent, int i, Bundle bundle) {
        if (this.A == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        bi E = E();
        if (E.s != null) {
            E.m.addLast(new bf(this.l, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            mop mopVar = E.s;
            Integer num = (Integer) ((pf) mopVar.c).c.get(mopVar.a);
            if (num == null) {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + mopVar.b + " and input " + intent + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
            ((pf) mopVar.c).e.add(mopVar.a);
            ((pf) mopVar.c).c(num.intValue(), (pi) mopVar.b, intent);
            return;
        }
        E.i.e(intent, i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ah() {
        ak akVar = this.R;
        if (akVar == null) {
            return false;
        }
        return akVar.a;
    }

    public final boolean ai() {
        return this.A != null && this.r;
    }

    public final boolean aj() {
        an anVar;
        if (!this.G) {
            return (this.z == null || (anVar = this.C) == null || !anVar.aj()) ? false : true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ak() {
        return this.y > 0;
    }

    public boolean al(MenuItem menuItem) {
        return false;
    }

    public final void am() {
    }

    public final void an() {
    }

    @Deprecated
    public final LayoutInflater ao() {
        au auVar = this.A;
        if (auVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        ao aoVar = (ao) auVar;
        LayoutInflater cloneInContext = aoVar.a.getLayoutInflater().cloneInContext(aoVar.a);
        cloneInContext.setFactory2(this.B.c);
        return cloneInContext;
    }

    public final void ap() {
    }

    public final void aq() {
        this.M = true;
        au auVar = this.A;
        if ((auVar == null ? null : auVar.b) != null) {
            this.M = true;
        }
    }

    @Deprecated
    public void ar(int i, int[] iArr) {
    }

    public final void as() {
        if (!this.K) {
            this.K = true;
            if (!ai() || aj()) {
                return;
            }
            this.A.c();
        }
    }

    @Override // defpackage.agq
    public final aqr at() {
        if (this.z == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (fb() != afp.INITIALIZED.ordinal()) {
            bk bkVar = this.z.r;
            aqr aqrVar = (aqr) bkVar.d.get(this.l);
            if (aqrVar != null) {
                return aqrVar;
            }
            aqr aqrVar2 = new aqr((byte[]) null, (char[]) null);
            bkVar.d.put(this.l, aqrVar2);
            return aqrVar2;
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public void e(Bundle bundle) {
        this.M = true;
        X(bundle);
        bi biVar = this.B;
        if (biVar.h > 0) {
            return;
        }
        biVar.q();
    }

    public void f() {
        this.M = true;
    }

    public final int fN() {
        ak akVar = this.R;
        if (akVar == null) {
            return 0;
        }
        return akVar.b;
    }

    public final int fO() {
        ak akVar = this.R;
        if (akVar == null) {
            return 0;
        }
        return akVar.c;
    }

    public final int fP() {
        ak akVar = this.R;
        if (akVar == null) {
            return 0;
        }
        return akVar.d;
    }

    public final int fQ() {
        ak akVar = this.R;
        if (akVar == null) {
            return 0;
        }
        return akVar.e;
    }

    @Deprecated
    public final int fR() {
        aez.c(this);
        return this.p;
    }

    public final Context fS() {
        au auVar = this.A;
        if (auVar == null) {
            return null;
        }
        return auVar.c;
    }

    public final Context fT() {
        Context fS = fS();
        if (fS != null) {
            return fS;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final Resources fU() {
        return fT().getResources();
    }

    public final Bundle fV() {
        Bundle bundle = this.m;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public LayoutInflater fW(Bundle bundle) {
        return ao();
    }

    public void fX(Context context) {
        this.M = true;
        au auVar = this.A;
        if ((auVar == null ? null : auVar.b) != null) {
            this.M = true;
        }
    }

    public void fY() {
        this.M = true;
    }

    public void fZ(Bundle bundle) {
        this.M = true;
    }

    public void ga(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.B.noteStateNotSaved();
        this.x = true;
        this.X = new bt(at(), null, null);
        View G = G(layoutInflater, viewGroup, bundle);
        this.O = G;
        if (G == null) {
            if (this.X.a == null) {
                this.X = null;
                return;
            }
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.X.b();
        vl.b(this.O, this.X);
        vp.b(this.O, this.X);
        vr.b(this.O, this.X);
        this.Y.h(this.X);
    }

    public void h(Bundle bundle) {
    }

    public ar ht() {
        return new aj(this);
    }

    public void i() {
        this.M = true;
    }

    public void j() {
        this.M = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.M = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.M = true;
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i) {
        ag(intent, i, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.l);
        if (this.D != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.D));
        }
        if (this.F != null) {
            sb.append(" tag=");
            sb.append(this.F);
        }
        sb.append(")");
        return sb.toString();
    }

    public final ak y() {
        if (this.R == null) {
            this.R = new ak();
        }
        return this.R;
    }

    @Deprecated
    public final an z() {
        return m(true);
    }
}
