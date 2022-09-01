package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Preference implements Comparable {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public ahu H;
    public PreferenceGroup I;
    public ahy J;
    private boolean L;
    private final View.OnClickListener N;
    private CharSequence a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private List fe;
    private ahx ff;
    private boolean g;
    private boolean h;
    private boolean i;
    public final Context j;
    public aip k;
    public long l;
    public boolean m;
    public ahv n;
    public ahw o;
    public int p;
    public CharSequence q;
    public int r;
    public Drawable s;
    public String t;
    public Intent u;
    public String v;
    public Bundle w;
    public boolean x;
    public String y;
    public Object z;

    public Preference(Context context) {
        this(context, null);
    }

    private final void k(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    return;
                }
                k(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A() {
        ahu ahuVar = this.H;
        if (ahuVar != null) {
            ahuVar.e();
        }
    }

    public void B() {
        H();
    }

    public void C(aip aipVar) {
        this.k = aipVar;
        if (!this.m) {
            this.l = aipVar.a();
        }
        if (t() != null) {
            h(this.z);
            return;
        }
        if (Y()) {
            aip aipVar2 = this.k;
            if (((aipVar2 == null || t() != null) ? null : aipVar2.c()).contains(this.t)) {
                h(null);
                return;
            }
        }
        Object obj = this.z;
        if (obj == null) {
            return;
        }
        h(obj);
    }

    public void D(Preference preference, boolean z) {
        if (this.e == z) {
            this.e = !z;
            z(j());
            d();
        }
    }

    public void E() {
        T();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F() {
        T();
    }

    public final void G() {
        Intent intent;
        aio aioVar;
        if (!X() || !this.c) {
            return;
        }
        c();
        ahw ahwVar = this.o;
        if (ahwVar == null) {
            aip aipVar = this.k;
            if ((aipVar != null && (aioVar = aipVar.d) != null && aioVar.ax(this)) || (intent = this.u) == null) {
                return;
            }
            this.j.startActivity(intent);
            return;
        }
        ahwVar.a();
    }

    public final void H() {
        if (TextUtils.isEmpty(this.y)) {
            return;
        }
        Preference s = s(this.y);
        if (s != null) {
            if (s.fe == null) {
                s.fe = new ArrayList();
            }
            s.fe.add(this);
            D(s, s.j());
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.y + "\" not found for preference \"" + this.t + "\" (title: \"" + ((Object) this.q) + "\"");
    }

    public final void I(String str) {
        T();
        this.y = str;
        H();
    }

    public final void J(boolean z) {
        if (this.b != z) {
            this.b = z;
            z(j());
            d();
        }
    }

    public void K(boolean z) {
        if (this.D != z) {
            this.D = z;
            d();
        }
    }

    public final void L(String str) {
        this.t = str;
        if (!this.d || W()) {
            return;
        }
        if (!TextUtils.isEmpty(this.t)) {
            this.d = true;
            return;
        }
        throw new IllegalStateException("Preference does not have a key assigned.");
    }

    public final void M(int i) {
        if (i != this.p) {
            this.p = i;
            A();
        }
    }

    public final void N(int i) {
        n(this.j.getString(i));
    }

    public final void O(ahy ahyVar) {
        this.J = ahyVar;
        d();
    }

    public final void P(int i) {
        Q(this.j.getString(i));
    }

    public void Q(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.q)) {
            this.q = charSequence;
            d();
        }
    }

    public final void R(boolean z) {
        if (this.A != z) {
            this.A = z;
            ahu ahuVar = this.H;
            if (ahuVar == null) {
                return;
            }
            ((aik) ahuVar).e();
        }
    }

    public final void S(SharedPreferences.Editor editor) {
        if (!this.k.b) {
            editor.apply();
        }
    }

    public final void T() {
        Preference s;
        List list;
        String str = this.y;
        if (str == null || (s = s(str)) == null || (list = s.fe) == null) {
            return;
        }
        list.remove(this);
    }

    public boolean U(Object obj) {
        ahv ahvVar = this.n;
        return ahvVar == null || ahvVar.a(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean V(boolean z) {
        if (!Y()) {
            return z;
        }
        aia t = t();
        if (t != null) {
            return ((ino) t).al(this.t, z, z);
        }
        return this.k.c().getBoolean(this.t, z);
    }

    public final boolean W() {
        return !TextUtils.isEmpty(this.t);
    }

    public boolean X() {
        return this.b && this.e && this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean Y() {
        return this.k != null && this.x && W();
    }

    public final void Z(boolean z) {
        if (this.f == z) {
            this.f = !z;
            z(j());
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(defpackage.ais r10) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.a(ais):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aa(float f) {
        if (Y() && f != p(Float.NaN)) {
            aia t = t();
            if (t != null) {
                t.g(this.t, f);
                return;
            }
            SharedPreferences.Editor b = this.k.b();
            b.putFloat(this.t, f);
            S(b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ab(String str) {
        if (Y() && !TextUtils.equals(str, u(null))) {
            aia t = t();
            if (t != null) {
                t.j(this.t, str);
                return;
            }
            SharedPreferences.Editor b = this.k.b();
            b.putString(this.t, str);
            S(b);
        }
    }

    public final void ac(Set set) {
        if (Y() && !set.equals(v(null))) {
            aia t = t();
            if (t != null) {
                t.k(this.t, set);
                return;
            }
            SharedPreferences.Editor b = this.k.b();
            b.putStringSet(this.t, set);
            S(b);
        }
    }

    public final void ad() {
        if (this.c) {
            this.c = false;
            d();
        }
    }

    protected void c() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.p;
        int i2 = preference.p;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.q;
        CharSequence charSequence2 = preference.q;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 != null) {
            return charSequence.toString().compareToIgnoreCase(preference.q.toString());
        }
        return -1;
    }

    public void d() {
        int indexOf;
        ahu ahuVar = this.H;
        if (ahuVar == null || (indexOf = ((aik) ahuVar).d.indexOf(this)) == -1) {
            return;
        }
        ((ls) ahuVar).hh(indexOf, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Parcelable e() {
        this.L = true;
        return aht.EMPTY_STATE;
    }

    public long eZ() {
        return this.l;
    }

    protected Object f(TypedArray typedArray, int i) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(Parcelable parcelable) {
        this.L = true;
        if (parcelable == aht.EMPTY_STATE || parcelable == null) {
            return;
        }
        throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
    }

    protected void h(Object obj) {
    }

    public void hq(View view) {
        G();
    }

    public boolean j() {
        return !X();
    }

    public CharSequence m() {
        ahy ahyVar = this.J;
        return ahyVar != null ? ahyVar.a(this) : this.a;
    }

    public void n(CharSequence charSequence) {
        if (this.J != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.a, charSequence)) {
            return;
        }
        this.a = charSequence;
        d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float p(float f) {
        if (!Y()) {
            return f;
        }
        aia t = t();
        if (t != null) {
            return t.a(this.t, f);
        }
        return this.k.c().getFloat(this.t, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int q(int i) {
        if (!Y()) {
            return i;
        }
        aia t = t();
        if (t != null) {
            return t.b(this.t, i);
        }
        return this.k.c().getInt(this.t, i);
    }

    public final Bundle r() {
        if (this.w == null) {
            this.w = new Bundle();
        }
        return this.w;
    }

    protected final Preference s(String str) {
        aip aipVar = this.k;
        if (aipVar == null) {
            return null;
        }
        return aipVar.d(str);
    }

    public final aia t() {
        aip aipVar = this.k;
        if (aipVar != null) {
            return aipVar.a;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.q;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence m = m();
        if (!TextUtils.isEmpty(m)) {
            sb.append(m);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String u(String str) {
        if (!Y()) {
            return str;
        }
        aia t = t();
        if (t != null) {
            return t.d(this.t, str);
        }
        return this.k.c().getString(this.t, str);
    }

    public final Set v(Set set) {
        if (!Y()) {
            return set;
        }
        aia t = t();
        if (t != null) {
            return t.e(this.t, set);
        }
        return this.k.c().getStringSet(this.t, set);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || this.I == null) {
            this.I = preferenceGroup;
            return;
        }
        throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
    }

    public void x(Bundle bundle) {
        Parcelable parcelable;
        if (!W() || (parcelable = bundle.getParcelable(this.t)) == null) {
            return;
        }
        this.L = false;
        g(parcelable);
        if (!this.L) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void y(Bundle bundle) {
        if (W()) {
            this.L = false;
            Parcelable e = e();
            if (!this.L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (e == null) {
                return;
            }
            bundle.putParcelable(this.t, e);
        }
    }

    public void z(boolean z) {
        List list = this.fe;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).D(this, z);
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, jn.d(context, R.attr.f16110_resource_name_obfuscated_res_0x7f04062e, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = Integer.MAX_VALUE;
        this.b = true;
        this.c = true;
        this.x = true;
        this.e = true;
        this.f = true;
        this.A = true;
        this.g = true;
        this.h = true;
        this.C = true;
        this.i = true;
        this.F = R.layout.f144550_resource_name_obfuscated_res_0x7f0e04ea;
        this.N = new hk(this, 4);
        this.j = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.g, i, i2);
        this.r = jn.f(obtainStyledAttributes, 23, 0, 0);
        this.t = jn.j(obtainStyledAttributes, 26, 6);
        this.q = jn.h(obtainStyledAttributes, 34, 4);
        this.a = jn.h(obtainStyledAttributes, 33, 7);
        this.p = jn.n(obtainStyledAttributes, 28, 8);
        this.v = jn.j(obtainStyledAttributes, 22, 13);
        this.F = jn.f(obtainStyledAttributes, 27, 3, R.layout.f144550_resource_name_obfuscated_res_0x7f0e04ea);
        this.G = jn.f(obtainStyledAttributes, 35, 9, 0);
        this.b = jn.k(obtainStyledAttributes, 21, 2, true);
        this.c = jn.k(obtainStyledAttributes, 30, 5, true);
        this.x = jn.k(obtainStyledAttributes, 29, 1, true);
        this.y = jn.j(obtainStyledAttributes, 19, 10);
        this.g = jn.k(obtainStyledAttributes, 16, 16, this.c);
        this.h = jn.k(obtainStyledAttributes, 17, 17, this.c);
        if (obtainStyledAttributes.hasValue(18)) {
            this.z = f(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.z = f(obtainStyledAttributes, 11);
        }
        this.i = jn.k(obtainStyledAttributes, 31, 12, true);
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.B = hasValue;
        if (hasValue) {
            this.C = jn.k(obtainStyledAttributes, 32, 14, true);
        }
        this.D = jn.k(obtainStyledAttributes, 24, 15, false);
        this.A = jn.k(obtainStyledAttributes, 25, 25, true);
        this.E = jn.k(obtainStyledAttributes, 20, 20, false);
        obtainStyledAttributes.recycle();
    }
}
