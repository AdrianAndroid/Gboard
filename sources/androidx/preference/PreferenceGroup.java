package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final qv a;
    public final List b;
    public int c;
    private final Handler d;
    private boolean e;
    private int f;
    private boolean g;
    private final Runnable h;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void aj(Preference preference) {
        synchronized (this) {
            preference.F();
            if (preference.I == this) {
                preference.w(null);
            }
            if (this.b.remove(preference)) {
                String str = preference.t;
                if (str != null) {
                    this.a.put(str, Long.valueOf(preference.eZ()));
                    this.d.removeCallbacks(this.h);
                    this.d.post(this.h);
                }
                if (this.g) {
                    preference.E();
                }
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void B() {
        super.H();
        this.g = true;
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).B();
        }
    }

    @Override // androidx.preference.Preference
    public final void E() {
        super.T();
        this.g = false;
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).E();
        }
    }

    public final void ae() {
        synchronized (this) {
            List list = this.b;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    aj((Preference) list.get(0));
                }
            }
        }
        A();
    }

    public final void af(int i) {
        if (i != Integer.MAX_VALUE && !W()) {
            Log.e("PreferenceGroup", String.valueOf(getClass().getSimpleName()).concat(" should have a key defined if it contains an expandable preference"));
        }
        this.c = i;
    }

    public boolean ag() {
        return true;
    }

    public final void ah(Preference preference) {
        long a;
        if (!this.b.contains(preference)) {
            if (preference.t != null) {
                PreferenceGroup preferenceGroup = this;
                while (true) {
                    PreferenceGroup preferenceGroup2 = preferenceGroup.I;
                    if (preferenceGroup2 == null) {
                        break;
                    }
                    preferenceGroup = preferenceGroup2;
                }
                String str = preference.t;
                if (preferenceGroup.l(str) != null) {
                    Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                }
            }
            if (preference.p == Integer.MAX_VALUE) {
                if (this.e) {
                    int i = this.f;
                    this.f = i + 1;
                    preference.M(i);
                }
                if (preference instanceof PreferenceGroup) {
                    ((PreferenceGroup) preference).e = this.e;
                }
            }
            int binarySearch = Collections.binarySearch(this.b, preference);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            preference.Z(j());
            synchronized (this) {
                this.b.add(binarySearch, preference);
            }
            aip aipVar = this.k;
            String str2 = preference.t;
            if (str2 == null || !this.a.containsKey(str2)) {
                a = aipVar.a();
            } else {
                a = ((Long) this.a.get(str2)).longValue();
                this.a.remove(str2);
            }
            preference.l = a;
            preference.m = true;
            try {
                preference.C(aipVar);
                preference.m = false;
                preference.w(this);
                if (this.g) {
                    preference.B();
                }
                A();
            } catch (Throwable th) {
                preference.m = false;
                throw th;
            }
        }
    }

    public final void ai(Preference preference) {
        aj(preference);
        A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final Parcelable e() {
        return new aii(super.e(), this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(aii.class)) {
            super.g(parcelable);
            return;
        }
        aii aiiVar = (aii) parcelable;
        this.c = aiiVar.a;
        super.g(aiiVar.getSuperState());
    }

    public final int k() {
        return this.b.size();
    }

    public final Preference l(CharSequence charSequence) {
        Preference l;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.t, charSequence)) {
            return this;
        }
        int k = k();
        for (int i = 0; i < k; i++) {
            Preference o = o(i);
            if (TextUtils.equals(o.t, charSequence)) {
                return o;
            }
            if ((o instanceof PreferenceGroup) && (l = ((PreferenceGroup) o).l(charSequence)) != null) {
                return l;
            }
        }
        return null;
    }

    public final Preference o(int i) {
        return (Preference) this.b.get(i);
    }

    @Override // androidx.preference.Preference
    public final void x(Bundle bundle) {
        super.x(bundle);
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).x(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void y(Bundle bundle) {
        super.y(bundle);
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).y(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void z(boolean z) {
        super.z(z);
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).Z(z);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new qv();
        this.d = new Handler(Looper.getMainLooper());
        this.e = true;
        this.f = 0;
        this.g = false;
        this.c = Integer.MAX_VALUE;
        this.h = new od(this, 16);
        this.b = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ait.i, i, i2);
        this.e = jn.k(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1)) {
            af(jn.n(obtainStyledAttributes, 1, 1));
        }
        obtainStyledAttributes.recycle();
    }
}
