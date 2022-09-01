package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: aih  reason: default package */
/* loaded from: classes.dex */
public abstract class aih extends an implements aio, aim, ain, ahi {
    public aip a;
    public RecyclerView b;
    private boolean d;
    private boolean e;
    private final aie c = new aie(this);
    private int ac = R.layout.f144620_resource_name_obfuscated_res_0x7f0e04f3;
    private final Handler ad = new aid(this, Looper.getMainLooper());
    private final Runnable ae = new od(this, 15);

    @Override // defpackage.an
    public View G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray obtainStyledAttributes = fT().obtainStyledAttributes(null, ait.h, R.attr.f16070_resource_name_obfuscated_res_0x7f040629, 0);
        this.ac = obtainStyledAttributes.getResourceId(0, this.ac);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(fT());
        View inflate = cloneInContext.inflate(this.ac, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (!(findViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        if (!fT().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.f67780_resource_name_obfuscated_res_0x7f0b088e)) == null) {
            recyclerView = (RecyclerView) cloneInContext.inflate(R.layout.f144640_resource_name_obfuscated_res_0x7f0e04f5, viewGroup2, false);
            fT();
            recyclerView.ab(new LinearLayoutManager());
            recyclerView.Z(new air(recyclerView));
        }
        if (recyclerView != null) {
            this.b = recyclerView;
            recyclerView.ay(this.c);
            aie aieVar = this.c;
            if (drawable != null) {
                aieVar.b = drawable.getIntrinsicHeight();
            } else {
                aieVar.b = 0;
            }
            aieVar.a = drawable;
            aieVar.d.b.L();
            if (dimensionPixelSize != -1) {
                av(dimensionPixelSize);
            }
            this.c.c = z;
            if (this.b.getParent() == null) {
                viewGroup2.addView(this.b);
            }
            this.ad.post(this.ae);
            return inflate;
        }
        throw new RuntimeException("Could not create RecyclerView");
    }

    @Override // defpackage.an
    public final void V(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen fL;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (fL = fL()) != null) {
            fL.x(bundle2);
        }
        if (this.d) {
            fM();
        }
        this.e = true;
    }

    @Override // defpackage.aim
    public void au(Preference preference) {
        ai ahsVar;
        boolean z = false;
        for (an anVar = this; !z && anVar != null; anVar = anVar.C) {
            if (anVar instanceof aif) {
                z = ((aif) anVar).a();
            }
        }
        if (!z && (fS() instanceof aif)) {
            z = ((aif) fS()).a();
        }
        if (!z) {
            if (((B() instanceof aif) && ((aif) B()).a()) || E().e("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            if (preference instanceof EditTextPreference) {
                String str = preference.t;
                ahsVar = new ahl();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                ahsVar.Z(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.t;
                ahsVar = new ahp();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                ahsVar.Z(bundle2);
            } else if (preference instanceof MultiSelectListPreference) {
                String str3 = preference.t;
                ahsVar = new ahs();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                ahsVar.Z(bundle3);
            } else {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            ahsVar.ae(this, 0);
            ahsVar.n(E(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public final void av(int i) {
        aie aieVar = this.c;
        aieVar.b = i;
        aieVar.d.b.L();
    }

    public final void aw(PreferenceScreen preferenceScreen) {
        aip aipVar;
        PreferenceScreen preferenceScreen2;
        if (preferenceScreen == null || preferenceScreen == (preferenceScreen2 = (aipVar = this.a).c)) {
            return;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.E();
        }
        aipVar.c = preferenceScreen;
        this.d = true;
        if (!this.e || this.ad.hasMessages(1)) {
            return;
        }
        this.ad.obtainMessage(1).sendToTarget();
    }

    @Override // defpackage.aio
    public boolean ax(Preference preference) {
        if (preference.v != null) {
            for (an anVar = this; anVar != null; anVar = anVar.C) {
            }
            if (!(fS() instanceof inx)) {
                if (!(B() instanceof inx)) {
                    Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                    bi E = E();
                    Bundle r = preference.r();
                    at f = E.f();
                    C().getClassLoader();
                    an c = f.c(preference.v);
                    c.Z(r);
                    c.ae(this, 0);
                    bq i = E.i();
                    i.t(((View) H().getParent()).getId(), c);
                    i.p();
                    i.j();
                    return true;
                }
                ((inx) B()).B(preference);
                return true;
            }
            ((inx) fS()).B(preference);
            return true;
        }
        return false;
    }

    @Override // defpackage.ain
    public final void ay() {
        boolean z = false;
        for (an anVar = this; !z && anVar != null; anVar = anVar.C) {
            if (anVar instanceof aig) {
                z = ((aig) anVar).a();
            }
        }
        if (!z && (fS() instanceof aig)) {
            z = ((aig) fS()).a();
        }
        if (z || !(B() instanceof aig)) {
            return;
        }
        ((aig) B()).a();
    }

    @Override // defpackage.an
    public void e(Bundle bundle) {
        super.e(bundle);
        TypedValue typedValue = new TypedValue();
        fT().getTheme().resolveAttribute(R.attr.f16120_resource_name_obfuscated_res_0x7f04062f, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.f196490_resource_name_obfuscated_res_0x7f150403;
        }
        fT().getTheme().applyStyle(i, false);
        aip aipVar = new aip(fT());
        this.a = aipVar;
        aipVar.f = this;
        Bundle bundle2 = this.m;
        o(bundle, bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // defpackage.an
    public void f() {
        this.ad.removeCallbacks(this.ae);
        this.ad.removeMessages(1);
        if (this.d) {
            this.b.aa(null);
            PreferenceScreen fL = fL();
            if (fL != null) {
                fL.E();
            }
        }
        this.b = null;
        super.f();
    }

    public final PreferenceScreen fL() {
        aip aipVar = this.a;
        if (aipVar == null) {
            return null;
        }
        return aipVar.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void fM() {
        PreferenceScreen fL = fL();
        if (fL != null) {
            this.b.aa(new aik(fL));
            fL.B();
        }
    }

    @Override // defpackage.an
    public void h(Bundle bundle) {
        PreferenceScreen fL = fL();
        if (fL != null) {
            Bundle bundle2 = new Bundle();
            fL.y(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // defpackage.ahi
    public final Preference hs(CharSequence charSequence) {
        aip aipVar = this.a;
        if (aipVar == null) {
            return null;
        }
        return aipVar.d(charSequence);
    }

    @Override // defpackage.an
    public void i() {
        super.i();
        aip aipVar = this.a;
        aipVar.d = this;
        aipVar.e = this;
    }

    @Override // defpackage.an
    public void j() {
        super.j();
        aip aipVar = this.a;
        aipVar.d = null;
        aipVar.e = null;
    }

    public abstract void o(Bundle bundle, String str);
}
